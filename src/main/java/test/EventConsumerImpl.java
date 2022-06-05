package test;

import test.events.Event;

public class EventConsumerImpl implements EventConsumer {

  @Override
  public <T> void consume(Event<T> stringEvent) {
    System.out.println("Event consumed" + stringEvent.getObject());
  }
}
