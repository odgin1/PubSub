package test.events;

public abstract class Event<T> {

  T object;

  public Event(T t) {
    this.object = t;
  }

  public T getObject() {
    return object;
  }
}
