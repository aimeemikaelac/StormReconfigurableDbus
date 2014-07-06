package edu.colorado.cs.ngn.storm.reconfigurable;

import java.util.Map;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Tuple;

/**
 * This bolt will sit before each "real" Storm bolt and connect to DBus.
 * All input for each "real" bolt will be received from DBus
 * @author michael
 *
 */
public class DBusReceiverBolt extends BaseRichBolt {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void execute(Tuple arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void prepare(Map arg0, TopologyContext arg1, OutputCollector arg2) {
		//id of dbus system to connect to
		//TODO: this needs to be filled in!
		String connectionId = null;
		
		//need to connect to DBus with some id
//		launch_dbus_receiver(this, connectionId);

	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer arg0) {
		// TODO Auto-generated method stub

	}

}
