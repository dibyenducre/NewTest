package com.app.studyreceiver;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {

   // Activity activity;

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(">>onReceived--","AAA");

       // activity = (OneActivity) context;
        /*Intent intent1 = new Intent(context,TwoActivity.class);
        context.startActivity(intent1);*/

       // showDialog(activity);

    }

    public void showDialog(Context context){

        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        builder.setTitle("Delete entry")
                .setMessage("Are you sure you want to delete this entry?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // continue with delete
                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // do nothing
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();

    }

}
