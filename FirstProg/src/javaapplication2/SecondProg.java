package javaapplication2;

import java.awt.Point;

/* This is the second example program.  */

public class SecondProg
{
  public static void main(String[] args)
  {
    MyTerminalIO myterminal = new MyTerminalIO();
    Point mypoint;
    mypoint = new Point(10, 20);
    myterminal.println(mypoint);
    mypoint.translate(30, 40);
    myterminal.println(mypoint);
  }
}