/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.thread;

public class MessagePrinterClient {

  public static void main(String[] args) {
    // DONE: create two instances of your thread subclass and start them up
    Thread printer1 = new Thread(new MessagePrinter("Roses are red"));  // take the default interval
    Thread printer2 = new Thread(new MessagePrinter("Violets are blue", 1375));
    
    printer1.start(); // put in queue and execute thread rather than waiting.
    printer2.start(); // puts thread in a queue for the jvm , then invoke run. Start does not directly invoke run
    
    // just for demonstration purposes - this shows why you don't call run() directly
//     printer1.run(); // run does 1 fully, then 2 fully.
//     printer2.run();
  }
}