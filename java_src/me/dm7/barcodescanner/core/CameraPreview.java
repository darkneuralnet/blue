package me.dm7.barcodescanner.core;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.List;
/* loaded from: classes8.dex */
public class CameraPreview extends SurfaceView implements SurfaceHolder.Callback {
    private static final String TAG = "CameraPreview";
    Camera.AutoFocusCallback autoFocusCB;
    private Runnable doAutoFocus;
    private float mAspectTolerance;
    private boolean mAutoFocus;
    private Handler mAutoFocusHandler;
    private CameraWrapper mCameraWrapper;
    private Camera.PreviewCallback mPreviewCallback;
    private boolean mPreviewing;
    private boolean mShouldScaleToFill;
    private boolean mSurfaceCreated;

    public CameraPreview(Context context, CameraWrapper cameraWrapper, Camera.PreviewCallback previewCallback) {
        super(context);
        this.mPreviewing = true;
        this.mAutoFocus = true;
        this.mSurfaceCreated = false;
        this.mShouldScaleToFill = true;
        this.mAspectTolerance = 0.1f;
        this.doAutoFocus = new Runnable() { // from class: me.dm7.barcodescanner.core.CameraPreview.1
            @Override // java.lang.Runnable
            public void run() {
                if (CameraPreview.this.mCameraWrapper != null && CameraPreview.this.mPreviewing && CameraPreview.this.mAutoFocus && CameraPreview.this.mSurfaceCreated) {
                    CameraPreview.this.safeAutoFocus();
                }
            }
        };
        this.autoFocusCB = new Camera.AutoFocusCallback() { // from class: me.dm7.barcodescanner.core.CameraPreview.2
            @Override // android.hardware.Camera.AutoFocusCallback
            public void onAutoFocus(boolean z, Camera camera) {
                CameraPreview.this.scheduleAutoFocus();
            }
        };
        init(cameraWrapper, previewCallback);
    }

    private void adjustViewSize(Camera.Size size) {
        Point convertSizeToLandscapeOrientation = convertSizeToLandscapeOrientation(new Point(getWidth(), getHeight()));
        float f = size.width / size.height;
        int i = convertSizeToLandscapeOrientation.x;
        int i2 = convertSizeToLandscapeOrientation.y;
        if (i / i2 > f) {
            setViewSize((int) (i2 * f), i2);
        } else {
            setViewSize(i, (int) (i / f));
        }
    }

    private Point convertSizeToLandscapeOrientation(Point point) {
        if (getDisplayOrientation() % 180 == 0) {
            return point;
        }
        return new Point(point.y, point.x);
    }

    private Camera.Size getOptimalPreviewSize() {
        CameraWrapper cameraWrapper = this.mCameraWrapper;
        Camera.Size size = null;
        if (cameraWrapper == null) {
            return null;
        }
        List<Camera.Size> supportedPreviewSizes = cameraWrapper.mCamera.getParameters().getSupportedPreviewSizes();
        int width = getWidth();
        int height = getHeight();
        if (DisplayUtils.getScreenOrientation(getContext()) == 1) {
            height = width;
            width = height;
        }
        double d = width / height;
        if (supportedPreviewSizes == null) {
            return null;
        }
        double d2 = Double.MAX_VALUE;
        double d3 = Double.MAX_VALUE;
        for (Camera.Size size2 : supportedPreviewSizes) {
            if (Math.abs((size2.width / size2.height) - d) <= this.mAspectTolerance && Math.abs(size2.height - height) < d3) {
                d3 = Math.abs(size2.height - height);
                size = size2;
            }
        }
        if (size == null) {
            for (Camera.Size size3 : supportedPreviewSizes) {
                if (Math.abs(size3.height - height) < d2) {
                    size = size3;
                    d2 = Math.abs(size3.height - height);
                }
            }
        }
        return size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleAutoFocus() {
        this.mAutoFocusHandler.postDelayed(this.doAutoFocus, 1000L);
    }

    private void setViewSize(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (getDisplayOrientation() % 180 != 0) {
            i2 = i;
            i = i2;
        }
        if (this.mShouldScaleToFill) {
            float f = i;
            float width = ((View) getParent()).getWidth() / f;
            float f2 = i2;
            float height = ((View) getParent()).getHeight() / f2;
            if (width <= height) {
                width = height;
            }
            i = Math.round(f * width);
            i2 = Math.round(f2 * width);
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        setLayoutParams(layoutParams);
    }

    public int getDisplayOrientation() {
        int i = 0;
        if (this.mCameraWrapper == null) {
            return 0;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i2 = this.mCameraWrapper.mCameraId;
        if (i2 == -1) {
            Camera.getCameraInfo(0, cameraInfo);
        } else {
            Camera.getCameraInfo(i2, cameraInfo);
        }
        int rotation = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation != 1) {
                if (rotation != 2) {
                    if (rotation == 3) {
                        i = 270;
                    }
                } else {
                    i = 180;
                }
            } else {
                i = 90;
            }
        }
        if (cameraInfo.facing == 1) {
            return (360 - ((cameraInfo.orientation + i) % 360)) % 360;
        }
        return ((cameraInfo.orientation - i) + 360) % 360;
    }

    public void init(CameraWrapper cameraWrapper, Camera.PreviewCallback previewCallback) {
        setCamera(cameraWrapper, previewCallback);
        this.mAutoFocusHandler = new Handler();
        getHolder().addCallback(this);
        getHolder().setType(3);
    }

    public void safeAutoFocus() {
        try {
            this.mCameraWrapper.mCamera.autoFocus(this.autoFocusCB);
        } catch (RuntimeException unused) {
            scheduleAutoFocus();
        }
    }

    public void setAspectTolerance(float f) {
        this.mAspectTolerance = f;
    }

    public void setAutoFocus(boolean z) {
        if (this.mCameraWrapper == null || !this.mPreviewing || z == this.mAutoFocus) {
            return;
        }
        this.mAutoFocus = z;
        if (z) {
            if (this.mSurfaceCreated) {
                Log.v(TAG, "Starting autofocus");
                safeAutoFocus();
                return;
            }
            scheduleAutoFocus();
            return;
        }
        Log.v(TAG, "Cancelling autofocus");
        this.mCameraWrapper.mCamera.cancelAutoFocus();
    }

    public void setCamera(CameraWrapper cameraWrapper, Camera.PreviewCallback previewCallback) {
        this.mCameraWrapper = cameraWrapper;
        this.mPreviewCallback = previewCallback;
    }

    public void setShouldScaleToFill(boolean z) {
        this.mShouldScaleToFill = z;
    }

    public void setupCameraParameters() {
        Camera.Size optimalPreviewSize = getOptimalPreviewSize();
        Camera.Parameters parameters = this.mCameraWrapper.mCamera.getParameters();
        parameters.setPreviewSize(optimalPreviewSize.width, optimalPreviewSize.height);
        this.mCameraWrapper.mCamera.setParameters(parameters);
        adjustViewSize(optimalPreviewSize);
    }

    public void showCameraPreview() {
        if (this.mCameraWrapper != null) {
            try {
                getHolder().addCallback(this);
                this.mPreviewing = true;
                setupCameraParameters();
                this.mCameraWrapper.mCamera.setPreviewDisplay(getHolder());
                this.mCameraWrapper.mCamera.setDisplayOrientation(getDisplayOrientation());
                this.mCameraWrapper.mCamera.setOneShotPreviewCallback(this.mPreviewCallback);
                this.mCameraWrapper.mCamera.startPreview();
                if (this.mAutoFocus) {
                    if (this.mSurfaceCreated) {
                        safeAutoFocus();
                    } else {
                        scheduleAutoFocus();
                    }
                }
            } catch (Exception e) {
                Log.e(TAG, e.toString(), e);
            }
        }
    }

    public void stopCameraPreview() {
        if (this.mCameraWrapper != null) {
            try {
                this.mPreviewing = false;
                getHolder().removeCallback(this);
                this.mCameraWrapper.mCamera.cancelAutoFocus();
                this.mCameraWrapper.mCamera.setOneShotPreviewCallback(null);
                this.mCameraWrapper.mCamera.stopPreview();
            } catch (Exception e) {
                Log.e(TAG, e.toString(), e);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder.getSurface() == null) {
            return;
        }
        stopCameraPreview();
        showCameraPreview();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.mSurfaceCreated = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.mSurfaceCreated = false;
        stopCameraPreview();
    }

    public CameraPreview(Context context, AttributeSet attributeSet, CameraWrapper cameraWrapper, Camera.PreviewCallback previewCallback) {
        super(context, attributeSet);
        this.mPreviewing = true;
        this.mAutoFocus = true;
        this.mSurfaceCreated = false;
        this.mShouldScaleToFill = true;
        this.mAspectTolerance = 0.1f;
        this.doAutoFocus = new Runnable() { // from class: me.dm7.barcodescanner.core.CameraPreview.1
            @Override // java.lang.Runnable
            public void run() {
                if (CameraPreview.this.mCameraWrapper != null && CameraPreview.this.mPreviewing && CameraPreview.this.mAutoFocus && CameraPreview.this.mSurfaceCreated) {
                    CameraPreview.this.safeAutoFocus();
                }
            }
        };
        this.autoFocusCB = new Camera.AutoFocusCallback() { // from class: me.dm7.barcodescanner.core.CameraPreview.2
            @Override // android.hardware.Camera.AutoFocusCallback
            public void onAutoFocus(boolean z, Camera camera) {
                CameraPreview.this.scheduleAutoFocus();
            }
        };
        init(cameraWrapper, previewCallback);
    }
}
