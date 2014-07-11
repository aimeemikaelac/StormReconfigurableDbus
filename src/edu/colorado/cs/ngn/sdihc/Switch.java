package edu.colorado.cs.ngn.sdihc;

import org.freedesktop.dbus.DBusInterface;

public interface Switch extends DBusInterface {
	public String Enqueue(String data);
	public String Dequeue();
}
