/*
*ObjectAssembler.java                                 *
*(c)Copyright - 2015 by Baldivicio,Jonathan Eldy I.   *
*/
package com.github.javasharp.assembler;

import java.io.*;

public class ObjectAssembler{
 private static File out;
 private static Object o;
 public ObjectAssembler(File out,Object o){
  ObjectAssembler.out=out;
  ObjectAssembler.o=o;
 }
 public void assemble() throws IOException{
  ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(out));
  os.writeObject(o);
  os.flush();
  os.close();
 }
}
