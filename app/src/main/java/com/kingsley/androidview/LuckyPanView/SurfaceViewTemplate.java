package com.kingsley.androidview.LuckyPanView;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import javax.security.auth.callback.Callback;

public class SurfaceViewTemplate extends SurfaceView implements Callback, Runnable {


    private SurfaceHolder mHolder;

    /**
     * canvas
     *
     * @param context
     */
    private Canvas mCanvas;

    /**
     * 用于绘制的线程
     */
    private Thread t;
    /**
     * 线程的控制开关
     */
    private boolean isRunning;


    public SurfaceViewTemplate(Context context) {
        this(context, null);
    }

    public SurfaceViewTemplate(Context context, AttributeSet attrs) {
        super(context, attrs);
        mHolder = getHolder();
//        mHolder.addCallback(this);

        // 设置可获得焦点
        setFocusable(true);
        setFocusableInTouchMode(true);
        // 设置常亮
        this.setKeepScreenOn(true);

    }

    public void surfaceCreate(SurfaceHolder holder) {
        // 开启线程
    }


    @Override
    public void run() {
        while (isRunning) {
            draw();
        }
    }

    private void draw() {
        try {
            // 获得canvas
            mCanvas = mHolder.lockCanvas();
            if (mCanvas != null) {
                // drawSomething
            }
        } catch (Exception e) {

        } finally {
            if (mCanvas != null)
                mHolder.unlockCanvasAndPost(mCanvas);
        }
    }
}
