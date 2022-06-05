package test.events;

public class ErrorEvent extends Event<String> {

  public ErrorEvent(String s) {
    super(s);
  }
}
