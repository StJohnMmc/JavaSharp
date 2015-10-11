/*
*StringOptimizer.java                                 *
*(c)Copyright - 2015 by Baldivicio,Jonathan Eldy I.   *
*/
package com.github.javasharp;

import java.util.Scanner;

public class StringOptimizer{
  private static String o;
  public StringOptimizer(String o){
   o = o;
  }
  public String removeComments(){
   Scanner s1 = new Scanner(o).useDelimiter("//\\s*\n");
   Scanner s2 = new Scanner(o).useDelimiter("//*\\s**/");
   o = o.replaceAll(s1.next(), "").replaceAll(s2.next(), "");
   String out = o;
   return out;
  }
}
