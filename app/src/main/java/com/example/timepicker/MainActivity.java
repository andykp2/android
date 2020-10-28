package com.example.timepicker;


import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
        public void showtimepicker(View view) {
            DialogFragment newFragment = new TimePickerFragment();
            newFragment.show(getSupportFragmentManager(),"timepicker");
        }

        public void processTimePickerResult(int hourOfDay, int minute) {
            String hour_string = Integer.toString(hourOfDay);
            String minute_string = Integer.toString(minute);
            String timeMessage = (  hour_string + ":" + minute_string);

            Toast.makeText(this,getString(R.string.time_toast)
                    + timeMessage, Toast.LENGTH_SHORT).show();
    }
}
