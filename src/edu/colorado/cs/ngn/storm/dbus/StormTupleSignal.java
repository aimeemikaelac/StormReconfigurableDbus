package edu.colorado.cs.ngn.storm.dbus;

import org.freedesktop.dbus.DBusInterface;
import org.freedesktop.dbus.DBusSignal;
import org.freedesktop.dbus.exceptions.DBusException;

public interface StormTupleSignal extends DBusInterface {
	
	public static class TupleSignal extends DBusSignal{
		public final byte[] objectData;
		public TupleSignal(String path, byte[] inputObjectData) throws DBusException{
			super(path, inputObjectData);
			this.objectData = inputObjectData;
		}
	}
}
