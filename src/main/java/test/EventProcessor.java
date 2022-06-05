package test;

import test.events.Event;

public interface EventProcessor {

  <T> void process(Event<T> event);
}
