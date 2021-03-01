package com.kingsley.androidview.Golf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;

import com.kingsley.androidview.JDRefresh.FirstStepView;
import com.kingsley.androidview.R;

public class GolfActivity extends AppCompatActivity {

    private SeekBar sb;
    private GolfView mGolfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golf);


        sb = (SeekBar) findViewById(R.id.seekbar);
        mGolfView = (GolfView) findViewById(R.id.golfview);
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
                mGolfView.setCurrentProgress(currentProgress);
                mGolfView.invalidate();
            }
        });

    }
}