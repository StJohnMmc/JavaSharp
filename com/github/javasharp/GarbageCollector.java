/*
*ObjectAssembler.java                                 *
*(c)Copyright - 2015 by Baldivicio,Jonathan Eldy I.   *
*/
package com.github.javasharp;

public abstract class GarbageCollector{
  public void run(){
   System.gc();
  }
}
