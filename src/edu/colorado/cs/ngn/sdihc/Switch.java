package edu.colorado.cs.ngn.sdihc;

import org.freedesktop.dbus.DBusInterface;

public interface Switch extends DBusInterface {
	public String Enqueue(String pe_id, String data);
	public String Dequeue(String pe_id);
}
