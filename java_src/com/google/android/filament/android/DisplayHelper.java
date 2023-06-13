package com.google.android.filament.android;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.view.Display;
import com.google.android.filament.Renderer;
/* loaded from: classes5.dex */
public class DisplayHelper {
    private Display mDisplay;
    private DisplayManager mDisplayManager;
    private Handler mHandler;
    private DisplayManager.DisplayListener mListener;
    private Renderer mRenderer;

    public DisplayHelper(Context context) {
        this.mHandler = null;
        this.mDisplayManager = (DisplayManager) context.getSystemService("display");
    }

    public static long getAppVsyncOffsetNanos(Display display) {
        if (Build.VERSION.SDK_INT >= 29) {
            return display.getAppVsyncOffsetNanos();
        }
        return 0L;
    }

    public static Renderer.DisplayInfo getDisplayInfo(Display display, Renderer.DisplayInfo displayInfo) {
        if (displayInfo == null) {
            displayInfo = new Renderer.DisplayInfo();
        }
        displayInfo.refreshRate = getRefreshRate(display);
        return displayInfo;
    }

    public static long getPresentationDeadlineNanos(Display display) {
        if (Build.VERSION.SDK_INT >= 29) {
            return display.getPresentationDeadlineNanos();
        }
        return 11600000L;
    }

    public static long getRefreshPeriodNanos(Display display) {
        return (long) (1.0E9d / display.getRefreshRate());
    }

    public static float getRefreshRate(Display display) {
        return display.getRefreshRate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDisplayInfo() {
        Renderer renderer = this.mRenderer;
        renderer.setDisplayInfo(getDisplayInfo(this.mDisplay, renderer.getDisplayInfo()));
    }

    public void attach(Renderer renderer, final Display display) {
        if (renderer == this.mRenderer && display == this.mDisplay) {
            return;
        }
        this.mRenderer = renderer;
        this.mDisplay = display;
        DisplayManager.DisplayListener displayListener = new DisplayManager.DisplayListener() { // from class: com.google.android.filament.android.DisplayHelper.1
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayAdded(int i) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayChanged(int i) {
                if (i == display.getDisplayId()) {
                    DisplayHelper.this.updateDisplayInfo();
                }
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public void onDisplayRemoved(int i) {
            }
        };
        this.mListener = displayListener;
        this.mDisplayManager.registerDisplayListener(displayListener, this.mHandler);
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.filament.android.DisplayHelper.2
                @Override // java.lang.Runnable
                public void run() {
                    DisplayHelper.this.updateDisplayInfo();
                }
            });
        } else {
            updateDisplayInfo();
        }
    }

    public void detach() {
        DisplayManager.DisplayListener displayListener = this.mListener;
        if (displayListener != null) {
            this.mDisplayManager.unregisterDisplayListener(displayListener);
            this.mListener = null;
            this.mDisplay = null;
            this.mRenderer = null;
        }
    }

    public void finalize() throws Throwable {
        try {
            detach();
        } finally {
            super.finalize();
        }
    }

    public Display getDisplay() {
        return this.mDisplay;
    }

    public DisplayHelper(Context context, Handler handler) {
        this(context);
        this.mHandler = handler;
    }
}
