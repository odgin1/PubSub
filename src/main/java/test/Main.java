package test;

import test.events.ErrorEvent;
import test.events.SuccessEvent;

public class Main {

  public static void main(String[] args) {

    EventProcessorImpl eventProcessor = new EventProcessorImpl();
    EventProducer eventProducer = new EventProducerImpl(eventProcessor);
    EventConsumer eventConsumer1 = new EventConsumerImpl();
    EventConsumer eventConsumer2 = new EventConsumerImpl();
    EventConsumer eventConsumer3 = new EventConsumerImpl();
    eventProcessor.addEventConsumer(eventConsumer1, new SuccessEvent("YEAH"));
    eventProcessor.addEventConsumer(eventConsumer2, new SuccessEvent("URAAA"));
    eventProcessor.addEventConsumer(eventConsumer3, new ErrorEvent("UUUUUU"));

    eventProducer.produce(new SuccessEvent("YEAH"));
  }
}
