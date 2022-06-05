package test;

import test.events.Event;

public interface EventProducer {

  <T> void produce(Event<T> stringEvent);
}
