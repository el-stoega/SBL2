package de.ur.adp.containers;


interface Queue<T> {
  void put(T t);

  T get();

  boolean isEmpty();

  int size();
}
