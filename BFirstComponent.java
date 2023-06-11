package com.tridiumuniversity.devTrafficLights;

import javax.baja.sys.Action;
import javax.baja.sys.BAbsTime;
import javax.baja.sys.BComponent;
import javax.baja.sys.Flags;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

public class BFirstComponent extends BComponent
{
  public static final Property timeExecuted = newProperty(Flags.SUMMARY, BAbsTime.DEFAULT, null);

  public BAbsTime getTimeExecuted()
  {
    return (BAbsTime) get(timeExecuted);
  }

  public void setTimeExecuted(BAbsTime v)
  {
    set(timeExecuted, v, null);
  }

  public static final Action execute = newAction(Flags.SUMMARY, null);

  public void execute()
  {
    invoke(execute,null,null);
  }

  public void doExecute()
  {
    System.out.println("Hello, World!");
    setTimeExecuted(BAbsTime.now());
  }

  public static final Type TYPE = Sys.loadType(BFirstComponent.class);

  public Type getType()
  {
    return TYPE;
  }
}