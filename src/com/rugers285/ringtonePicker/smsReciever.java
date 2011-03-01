package com.rugers285.ringtonePicker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Creates the BroadcastReciever that listens for an incoming sms
 * @author Justin Ruger
 *
 */
public class smsReciever extends BroadcastReceiver{

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		Log.d("SMSReciever", "Recieved text");
	      Utils.playAudio(ringtonePickerSetPlaylist.songArray, Utils.i);
		
	}

}
