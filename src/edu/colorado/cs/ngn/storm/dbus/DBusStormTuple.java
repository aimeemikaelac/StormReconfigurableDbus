package edu.colorado.cs.ngn.storm.dbus;

import java.util.List;

import org.freedesktop.dbus.DBusInterface;

public interface DBusStormTuple extends DBusInterface {
	public List<Object> Data();
//	public StormTupleWrapper Data(String address);
}
