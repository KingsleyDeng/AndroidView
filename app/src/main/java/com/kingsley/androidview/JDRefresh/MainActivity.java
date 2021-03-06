package com.kingsley.androidview.JDRefresh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;

import com.kingsley.androidview.R;

public class MainActivity extends AppCompatActivity {


    private SeekBar sb;
    private FirstStepView mFirstStepView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sb = (SeekBar) findViewById(R.id.seekbar);
        mFirstStepView = (FirstStepView) findViewById(R.id.firstview);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                float currentProgress = (float) seekBar.getProgress() / (float) seekBar.getMax();
                mFirstStepView.setCurrentProgress(currentProgress);
                mFirstStepView.invalidate();
            }
        });
    }
}