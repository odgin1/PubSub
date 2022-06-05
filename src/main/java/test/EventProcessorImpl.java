package test;

import test.events.Event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventProcessorImpl implements EventProcessor {

  Map<String, List<EventConsumer>> eventConsumerMap = new HashMap<>();

  public EventProcessorImpl() {
  }

  public <T> void addEventConsumer(EventConsumer eventConsumer, Event<T> event) {
    eventConsumerMap.compute(event.getClass().getCanonicalName(), (k, v) -> {
      if (v == null) {
        v = new ArrayList<>();
      }
      v.add(eventConsumer);
      return v;
    });
  }

  @Override
  public <T> void process(Event<T> event) {
    eventConsumerMap.getOrDefault(event.getClass().getCanonicalName(), new ArrayList<>()).forEach(eventConsumer -> eventConsumer.consume(event));
  }
}
