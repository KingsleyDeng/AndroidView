package com.kingsley.androidview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.SeekBar;

import com.kingsley.androidview.views.WaveCircleView;
import com.kingsley.androidview.views.WaveView;

public class MainActivity extends AppCompatActivity {

//    private WaveView mWaveView;

    private WaveCircleView mWaveCircleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mWaveView = findViewById(R.id.waveLoading);
//        SeekBar mSeekBar = (SeekBar) findViewById(R.id.seekBar);
//
//        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                mWaveView.setPercent(progress);
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });

        mWaveCircleView = findViewById(R.id.wave_circle);
        mWaveCircleView.setInitialRadius(70);
        mWaveCircleView.setDuration(5000);
        mWaveCircleView.setStyle(Paint.Style.FILL);
        mWaveCircleView.setColor(Color.parseColor("#359307"));
        mWaveCircleView.setInterpolator(new LinearOutSlowInInterpolator());
        mWaveCircleView.start();

    }
}