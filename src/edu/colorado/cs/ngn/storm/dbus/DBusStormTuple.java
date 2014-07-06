package edu.colorado.cs.ngn.storm.dbus;

import org.freedesktop.dbus.DBusInterface;

import backtype.storm.tuple.Tuple;

public interface DBusStormTuple extends DBusInterface {
	public Tuple Data();
//	public StormTupleWrapper Data(String address);
}
