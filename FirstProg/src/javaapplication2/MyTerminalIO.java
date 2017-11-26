package javaapplication2;

import javax.swing.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

public class MyTerminalIO
{
  private MyTerminalIOFrame myframe;

  public MyTerminalIO()
  {
    myframe = new MyTerminalIOFrame();
    myframe.setTitle("MyTerminalIO Display");
    myframe.setVisible(true);
  }

  public void println(String messageString)
  {
    myframe.appendString(messageString + "\n");
  }

  public void print(String messageString)
  {
    myframe.appendString(messageString);
  }

  public void println(Object objectReference)
  {
    if(objectReference == null)
    {
      myframe.appendString("null\n");
    }
    else
    {
      String objectString = objectReference.toString();
      myframe.appendString(objectString + "\n");
    }
  }

  public void print(Object objectReference)
  {
    if(objectReference == null)
    {
      myframe.appendString("null");
    }
    else
    {
      String objectString = objectReference.toString();
      myframe.appendString(objectString);
    }
  }

  public void println(int expressionIn)
  {
    Integer integerObject = new Integer(expressionIn);
    println(integerObject);
  }

  public void print(int expressionIn)
  {
    Integer integerObject = new Integer(expressionIn);
    print(integerObject);
  }

  public void println(double expressionIn)
  {
    Double doubleObject = new Double(expressionIn);
    println(doubleObject);
  }

  public void print(double expressionIn)
  {
    Double doubleObject = new Double(expressionIn);
    print(doubleObject);
  }

  public void println()
  {
    print("\n");
  }

  public String getString(String promptString)
  {
    String inputString = "";

    println(promptString);

    inputString = JOptionPane.showInputDialog(promptString);

    println(inputString);

    return inputString;
  }

  public String getString()
  {
    String inputString = "";
    inputString = JOptionPane.showInputDialog("");
    println(inputString);
    return inputString;
  }

  public int getInt(String promptString)
  {
    String inputString = "";
    int inputInt = 0;
    boolean flag = false;

    println(promptString);

    inputString = JOptionPane.showInputDialog(promptString);

    while(flag == false)
    {
      try
      {
        inputInt = Integer.parseInt(inputString);
        flag = true;
      }
      catch(NumberFormatException n)
      {
        inputString = JOptionPane.showInputDialog("Your input has to be an integer.");
      }
    }

    println(inputString);

    return inputInt;
  }

  public int getInt()
  {
    String inputString = "";
    int inputInt = 0;
    boolean flag = false;

    inputString = JOptionPane.showInputDialog("");

    while(flag == false)
    {
      try
      {
        inputInt = Integer.parseInt(inputString);
        flag = true;
      }
      catch(NumberFormatException n)
      {
        inputString = JOptionPane.showInputDialog("Your input has to be an integer.");
      }
    }

    println(inputString);

    return inputInt;
  }

  public double getDouble(String promptString)
  {
    String inputString = "";
    double inputDouble = 0.0;
    boolean flag = false;

    println(promptString);

    inputString = JOptionPane.showInputDialog(promptString);

    while(flag == false)
    {
      try
      {
        inputDouble = Double.parseDouble(inputString);
        flag = true;
      }
      catch(NumberFormatException n)
      {
        inputString = JOptionPane.showInputDialog("Your input has to be a double.");
      }
    }

    println(inputString);

    return inputDouble;
  }

  public double getDouble()
  {
    String inputString = "";
    double inputDouble = 0.0;
    boolean flag = false;

    inputString = JOptionPane.showInputDialog("");

    while(flag == false)
    {
      try
      {
        inputDouble = Double.parseDouble(inputString);
        flag = true;
      }
      catch(NumberFormatException n)
      {
        inputString = JOptionPane.showInputDialog("Your input has to be a double.");
      }
    }

    println(inputString);

    return inputDouble;
  }
}

class MyTerminalIOFrame extends JFrame
{
  private TextArea myTextArea;

  public MyTerminalIOFrame()
  {
    setSize(500, 500);
    myTextArea = new TextArea("", 1024, 64);
    Font myfont = new Font("DialogInput", Font.PLAIN, 12);
    myTextArea.setFont(myfont);
    Container contentPane = getContentPane();
    contentPane.add(myTextArea, "Center");
    addWindowListener(new WindowCloser());
  }

  public void appendString(String inputString)
  {
    myTextArea.append(inputString);
  }

  private class WindowCloser extends WindowAdapter
  {
    public void windowClosing(WindowEvent event)
    {
      System.exit(0);
    }
  }
}

