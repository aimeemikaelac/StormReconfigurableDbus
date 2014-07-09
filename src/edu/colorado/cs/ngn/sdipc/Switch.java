package edu.colorado.cs.ngn.sdipc;

import org.freedesktop.dbus.DBusInterface;

public interface Switch extends DBusInterface {
	public String engueue(String data);
	public String dequeue();
}
