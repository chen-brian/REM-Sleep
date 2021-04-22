package com.example.remsleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Calendar;


public class SleepButtonResponse extends AppCompatActivity {
    int cycleChosen = 0;
    int cycleHour = 1;
    int cycleMinute = 30;
    int userPreference = 0; // implement this in settings

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep_button_response);

        final TextView aboveTime = findViewById(R.id.textView2);
        final TextView displayTime = findViewById(R.id.textView);
        final Button createAlarmButton = findViewById(R.id.button9);
        // Creating variables for all buttons
        final Button oneCycle = findViewById(R.id.button3);
        final Button twoCycles = findViewById(R.id.button4);
        final Button threeCycles = findViewById(R.id.button5);
        final Button fourCycles = findViewById(R.id.button6);
        final Button fiveCycles = findViewById(R.id.button7);
        final Button sixCycles = findViewById(R.id.button8);

        oneCycle.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                aboveTime.setText("After 1 REM cycle, you will wake up at");
                cycleChosen = 1;
                Calendar now = Calendar.getInstance();
                now.add(Calendar.MINUTE, (cycleChosen * 90) + userPreference); // adds x cycle(s) length of time to current time

                int hourNum = 0;
                // Accounts for transition from AM to PM after duration of cycle(s)
                if (now.get(Calendar.HOUR_OF_DAY) > 12){
                    hourNum = now.get(Calendar.HOUR_OF_DAY) - 12;
                }
                else{
                    hourNum = now.get(Calendar.HOUR_OF_DAY);
                }

                if (now.get(Calendar.HOUR_OF_DAY) == 0){
                    hourNum = 12;
                }

                int minuteNum = now.get(Calendar.MINUTE);

                String hour = Integer.toString(hourNum);
                String minute = Integer.toString(minuteNum);

                // Adding zeroes in front of hours and minutes if they fall below 10
                if (hourNum < 10){
                    hour = "0" + hour;
                }

                if (minuteNum < 10){
                    minute = "0" + minute;
                }

                // Setting am/pm text in displayTime
                if (now.get(Calendar.AM_PM) == Calendar.AM){
                    displayTime.setText(hour +  ":" + minute + " am");
                }

                else{
                    displayTime.setText(hour +  ":" + minute + " pm");
                }
            }
        });

        twoCycles.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                aboveTime.setText("After 2 REM cycles, you will wake up at");
                cycleChosen = 2;
                Calendar now = Calendar.getInstance();
                now.add(Calendar.MINUTE, (cycleChosen * 90) + userPreference); // adds x cycle(s) length of time to current time

                int hourNum = 0;
                if (now.get(Calendar.HOUR_OF_DAY) > 12){
                    hourNum = now.get(Calendar.HOUR_OF_DAY) - 12;
                }
                else{
                    hourNum = now.get(Calendar.HOUR_OF_DAY);
                }

                if (now.get(Calendar.HOUR_OF_DAY) == 0){
                    hourNum = 12;
                }

                int minuteNum = now.get(Calendar.MINUTE);

                String hour = Integer.toString(hourNum);
                String minute = Integer.toString(minuteNum);

                // Adding zeroes in front of hours and minutes if they fall below 10
                if (hourNum < 10){
                    hour = "0" + hour;
                }

                if (minuteNum < 10){
                    minute = "0" + minute;
                }

                // Setting am/pm text in displayTime
                if (now.get(Calendar.AM_PM) == Calendar.AM){
                    displayTime.setText(hour +  ":" + minute + " am");
                }

                else{
                    displayTime.setText(hour +  ":" + minute + " pm");
                }
            }
        });

        threeCycles.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                aboveTime.setText("After 3 REM cycles, you will wake up at");
                cycleChosen = 3;
                Calendar now = Calendar.getInstance();
                now.add(Calendar.MINUTE, (cycleChosen * 90) + userPreference); // adds x cycle(s) length of time to current time

                int hourNum = 0;
                if (now.get(Calendar.HOUR_OF_DAY) > 12){
                    hourNum = now.get(Calendar.HOUR_OF_DAY) - 12;
                }
                else{
                    hourNum = now.get(Calendar.HOUR_OF_DAY);
                }

                if (now.get(Calendar.HOUR_OF_DAY) == 0){
                    hourNum = 12;
                }

                int minuteNum = now.get(Calendar.MINUTE);

                String hour = Integer.toString(hourNum);
                String minute = Integer.toString(minuteNum);

                // Adding zeroes in front of hours and minutes if they fall below 10
                if (hourNum < 10){
                    hour = "0" + hour;
                }

                if (minuteNum < 10){
                    minute = "0" + minute;
                }

                // Setting am/pm text in displayTime
                if (now.get(Calendar.AM_PM) == Calendar.AM){
                    displayTime.setText(hour +  ":" + minute + " am");
                }

                else{
                    displayTime.setText(hour +  ":" + minute + " pm");
                }
            }
        });

        fourCycles.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                aboveTime.setText("After 4 REM cycles, you will wake up at");
                cycleChosen = 4;
                Calendar now = Calendar.getInstance();
                now.add(Calendar.MINUTE, (cycleChosen * 90) + userPreference); // adds x cycle(s) length of time to current time

                int hourNum = 0;
                if (now.get(Calendar.HOUR_OF_DAY) > 12){
                    hourNum = now.get(Calendar.HOUR_OF_DAY) - 12;
                }
                else{
                    hourNum = now.get(Calendar.HOUR_OF_DAY);
                }

                if (now.get(Calendar.HOUR_OF_DAY) == 0){
                    hourNum = 12;
                }

                int minuteNum = now.get(Calendar.MINUTE);

                String hour = Integer.toString(hourNum);
                String minute = Integer.toString(minuteNum);

                // Adding zeroes in front of hours and minutes if they fall below 10
                if (hourNum < 10){
                    hour = "0" + hour;
                }

                if (minuteNum < 10){
                    minute = "0" + minute;
                }

                // Setting am/pm text in displayTime
                if (now.get(Calendar.AM_PM) == Calendar.AM){
                    displayTime.setText(hour +  ":" + minute + " am");
                }

                else{
                    displayTime.setText(hour +  ":" + minute + " pm");
                }

            }
        });

        fiveCycles.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                aboveTime.setText("After 5 REM cycles, you will wake up at");
                cycleChosen = 5;
                Calendar now = Calendar.getInstance();
                now.add(Calendar.MINUTE, (cycleChosen * 90) + userPreference); // adds x cycle(s) length of time to current time

                int hourNum = 0;
                if (now.get(Calendar.HOUR_OF_DAY) > 12){
                    hourNum = now.get(Calendar.HOUR_OF_DAY) - 12;
                }
                else{
                    hourNum = now.get(Calendar.HOUR_OF_DAY);
                }

                if (now.get(Calendar.HOUR_OF_DAY) == 0){
                    hourNum = 12;
                }

                int minuteNum = now.get(Calendar.MINUTE);

                String hour = Integer.toString(hourNum);
                String minute = Integer.toString(minuteNum);

                // Adding zeroes in front of hours and minutes if they fall below 10
                if (hourNum < 10){
                    hour = "0" + hour;
                }

                if (minuteNum < 10){
                    minute = "0" + minute;
                }

                // Setting am/pm text in displayTime
                if (now.get(Calendar.AM_PM) == Calendar.AM){
                    displayTime.setText(hour +  ":" + minute + " am");
                }

                else{
                    displayTime.setText(hour +  ":" + minute + " pm");
                }

            }
        });

        sixCycles.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                aboveTime.setText("After 6 REM cycles, you will wake up at");
                cycleChosen = 6;
                Calendar now = Calendar.getInstance();
                now.add(Calendar.MINUTE, (cycleChosen * 90) + userPreference); // adds x cycle(s) length of time to current time

                int hourNum = 0;
                if (now.get(Calendar.HOUR_OF_DAY) > 12){
                    hourNum = now.get(Calendar.HOUR_OF_DAY) - 12;
                }
                else{
                    hourNum = now.get(Calendar.HOUR_OF_DAY);
                }

                if (now.get(Calendar.HOUR_OF_DAY) == 0){
                    hourNum = 12;
                }

                int minuteNum = now.get(Calendar.MINUTE);

                String hour = Integer.toString(hourNum);
                String minute = Integer.toString(minuteNum);

                // Adding zeroes in front of hours and minutes if they fall below 10
                if (hourNum < 10){
                    hour = "0" + hour;
                }

                if (minuteNum < 10){
                    minute = "0" + minute;
                }

                // Setting am/pm text in displayTime
                if (now.get(Calendar.AM_PM) == Calendar.AM){
                    displayTime.setText(hour +  ":" + minute + " am");
                }

                else{
                    displayTime.setText(hour +  ":" + minute + " pm");
                }

            }
        });

        createAlarmButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                Calendar now = Calendar.getInstance();
//                now.add(Calendar.MINUTE, cycleChosen * 90);
//                int hour = now.get(Calendar.HOUR_OF_DAY);
//                int minute = now.get(Calendar.MINUTE);
                String text = displayTime.getText().toString();
                int hour = 0;
                int minute = 0;

                if (text.charAt(6) == 'a') {
                    if (text.charAt(0) == '0') {
                        hour = text.charAt(1) - 48;
                    }
                    else if(text.charAt(1) == '2'){
                        hour = 0;
                    }
                    else {
                        hour = 10 + (text.charAt(1) - 48);
                    }
                }

                else if (text.charAt(6) == 'p') {
                    if (text.charAt(0) == '0') {
                        hour = (text.charAt(1) - 48) + 12;
                    }
                    else{
                        int eleOne = text.charAt(1);
                        hour = 10 + (text.charAt(1) - 48) + 12;
                    }
                }

                if (text.charAt(3) == '0'){
                    minute = text.charAt(4) - 48;
                }
                else{
                    String aboveTenMin = new StringBuilder().append(text.charAt(3)).append(text.charAt(4)).toString();
                    minute = Integer.parseInt(aboveTenMin);
                }

                createAlarm("REM Cycle Alarm", hour , minute);

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
}
