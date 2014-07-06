package edu.colorado.cs.ngn.storm.dbus;

import org.freedesktop.dbus.Tuple;

public final class StormTupleWrapper<T> extends Tuple {
	public final T data;
	public StormTupleWrapper(T data){
//		super(data);
		this.data = data;
	}
}
