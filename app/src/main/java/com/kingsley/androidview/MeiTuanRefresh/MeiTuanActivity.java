package com.kingsley.androidview.MeiTuanRefresh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;

import com.kingsley.androidview.R;

public class MeiTuanActivity extends AppCompatActivity {

    private MeiTuanRefreshView meiTuanRefreshView;
    private SeekBar mSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mei_tuan);

        mSeekBar = findViewById(R.id.seekbar);
        meiTuanRefreshView = findViewById(R.id.meiTuanRefreshView);

        mSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                // 计算出当前seekBar滑动的比例结果为0到1
                float currentProgress = (float) i / (float) seekBar.getMax();
                // 给我们的View设置当前进度值
                meiTuanRefreshView.setCurrentProgress(currentProgress);
                // 重画
                meiTuanRefreshView.postInvalidate();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}