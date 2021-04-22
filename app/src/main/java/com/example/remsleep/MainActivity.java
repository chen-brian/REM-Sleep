package com.example.remsleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Locate button in XML
        final Button sleepButton = findViewById(R.id.button);

        final TextView title = findViewById(R.id.textView3);


        //Capture button press
        sleepButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sleepButtonResponse(sleepButton);
            }
        });
    }

    public void createAlarm(String message, int hour, int minutes) {
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                .putExtra(AlarmClock.EXTRA_HOUR, hour)
                .putExtra(AlarmClock.EXTRA_MINUTES, minutes);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void sleepButtonResponse(View view){
        Intent intent = new Intent(this, SleepButtonResponse.class);
        startActivity(intent);
    }

//    //Create Alarm for 7 hours 30 minutes
//    Calendar rightNow = Calendar.getInstance();
//    int currentHour = rightNow.get(Calendar.HOUR_OF_DAY);
//    int currentMinute = rightNow.get(Calendar.MINUTE);
//    createAlarm("", currentHour + 7 , currentMinute + 30);
}
