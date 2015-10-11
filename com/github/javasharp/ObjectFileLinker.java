/*
*ObjectFileLinker.java                                *
*(c)Copyright - 2015 by Baldivicio,Jonathan Eldy I.   *
*/
package com.github.javasharp;

import java.io.*;


public class ObjectFileLinker{
 private static File[] fs;
 private static File out;
 public ObjectFileLinker(File out,File[] fs){
  ObjectFileLinker.out=out;
  ObjectFileLinker.fs=fs;
 }
 public void link() throws FileNotFoundException, IOException{
  for(File f:fs){
   BufferedReader br=new BufferedReader(new FileReader(f));
   StringBuilder sb=new StringBuilder();
   String str;
   while((str=br.readLine())!=null){
    sb.append(str);
   }
   PrintWriter p=new PrintWriter(out);
   p.print(sb.toString());
   p.flush();
   p.close();
  }
 }
}
