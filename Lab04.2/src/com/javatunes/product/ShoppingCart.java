/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//this is a generic class, type parameter <T>, when we declare instance of shopping cart, need to declare the type.
// Whatever kind we create, must add the parameter of something with IS-A relationship
//Type parameter, no wildcard. (can be bounded, we want to refer to T so don't add ? in it)
//Parameter type of method is where we may add '?'.
// 	static <T> Collection<T>	unmodifiableCollection(Collection<? extends T> c)
public class ShoppingCart<T extends Product> {

  // storage for the cart's contents
  private Collection<T> items = new ArrayList<>();  // diamond not used here just to emphasize the T

  public void addItem(T item) {
    items.add(item);
  }

  public void removeItem(T item) {
    items.remove(item);
  }

  public Collection<T> allItems() {
    return Collections.unmodifiableCollection(items);
  }

  public int size() {
    return items.size();
  }

  public double total() {
    double result = 0.0;
    for (T item : items) {
      result += item.getPrice();
    }
    return result;
  }


}