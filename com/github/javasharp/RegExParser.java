/*
*ObjectAssembler.java                                 *
*(c)Copyright - 2015 by Baldivicio,Jonathan Eldy I.   *
*/
package com.github.javasharp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExMatcher{
  private static String s;
  public RegExMatcher(String s){
    s = s;
  }
  public boolean isMatch(String st){
    return Pattern.compile(s).matcher(st).matches();
  }
}
