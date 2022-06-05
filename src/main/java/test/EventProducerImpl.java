package test;

import test.events.Event;

public class EventProducerImpl implements EventProducer{

  EventProcessor eventProcessor;

  public EventProducerImpl(EventProcessor eventProcessor) {
    this.eventProcessor = eventProcessor;
  }

  @Override
  public <T> void produce(Event<T> stringEvent) {
    eventProcessor.process(stringEvent);
  }
}
