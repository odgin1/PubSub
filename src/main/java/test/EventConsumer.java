package test;

import test.events.Event;

public interface EventConsumer {

  <T> void consume(Event<T> stringEvent);
}
