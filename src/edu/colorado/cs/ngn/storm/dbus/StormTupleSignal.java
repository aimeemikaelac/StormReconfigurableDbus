package edu.colorado.cs.ngn.storm.dbus;

import org.freedesktop.dbus.DBusInterface;
import org.freedesktop.dbus.DBusSignal;
import org.freedesktop.dbus.exceptions.DBusException;

public interface StormTupleSignal extends DBusInterface {
	
	public static class TupleSignal extends DBusSignal{
		public final byte[] objectData;
		public final int objectCount;
		public TupleSignal(String path, byte[] inputObjectData, int inputObjectCount) throws DBusException{
			super(path, inputObjectData, inputObjectCount);
			this.objectData = inputObjectData;
			this.objectCount = inputObjectCount;
		}
	}
}
