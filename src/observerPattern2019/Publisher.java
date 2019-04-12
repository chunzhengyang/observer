package observerPattern2019;

import java.util.HashSet;
import java.util.Set;

public class Publisher {
  public int publisherValue = 0;
  Set<Observer> observers = new HashSet<>();

  public void register(Observer observer) {
    observers.add(observer);
  }

  public void setState(int publisherValue) {
    this.publisherValue = publisherValue;
    System.out.print("\r");
    for (Observer o : observers) {
      o.render(publisherValue);
      System.out.print(" --- ");
    }
  }
}
