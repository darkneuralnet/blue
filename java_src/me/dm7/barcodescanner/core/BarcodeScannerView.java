package me.dm7.barcodescanner.core;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
/* loaded from: classes8.dex */
public abstract class BarcodeScannerView extends FrameLayout implements Camera.PreviewCallback {
    private float mAspectTolerance;
    private boolean mAutofocusState;
    private float mBorderAlpha;
    private int mBorderColor;
    private int mBorderLength;
    private int mBorderWidth;
    private CameraHandlerThread mCameraHandlerThread;
    private CameraWrapper mCameraWrapper;
    private int mCornerRadius;
    private Boolean mFlashState;
    private Rect mFramingRectInPreview;
    private boolean mIsLaserEnabled;
    private int mLaserColor;
    private int mMaskColor;
    private CameraPreview mPreview;
    private boolean mRoundedCorner;
    private boolean mShouldScaleToFill;
    private boolean mSquaredFinder;
    private int mViewFinderOffset;
    private IViewFinder mViewFinderView;

    public BarcodeScannerView(Context context) {
        super(context);
        this.mAutofocusState = true;
        this.mShouldScaleToFill = true;
        this.mIsLaserEnabled = true;
        this.mLaserColor = getResources().getColor(C26149R.color.viewfinder_laser);
        this.mBorderColor = getResources().getColor(C26149R.color.viewfinder_border);
        this.mMaskColor = getResources().getColor(C26149R.color.viewfinder_mask);
        this.mBorderWidth = getResources().getInteger(C26149R.integer.viewfinder_border_width);
        this.mBorderLength = getResources().getInteger(C26149R.integer.viewfinder_border_length);
        this.mRoundedCorner = false;
        this.mCornerRadius = 0;
        this.mSquaredFinder = false;
        this.mBorderAlpha = 1.0f;
        this.mViewFinderOffset = 0;
        this.mAspectTolerance = 0.1f;
        init();
    }

    private void init() {
        this.mViewFinderView = createViewFinderView(getContext());
    }

    public IViewFinder createViewFinderView(Context context) {
        ViewFinderView viewFinderView = new ViewFinderView(context);
        viewFinderView.setBorderColor(this.mBorderColor);
        viewFinderView.setLaserColor(this.mLaserColor);
        viewFinderView.setLaserEnabled(this.mIsLaserEnabled);
        viewFinderView.setBorderStrokeWidth(this.mBorderWidth);
        viewFinderView.setBorderLineLength(this.mBorderLength);
        viewFinderView.setMaskColor(this.mMaskColor);
        viewFinderView.setBorderCornerRounded(this.mRoundedCorner);
        viewFinderView.setBorderCornerRadius(this.mCornerRadius);
        viewFinderView.setSquareViewFinder(this.mSquaredFinder);
        viewFinderView.setViewFinderOffset(this.mViewFinderOffset);
        return viewFinderView;
    }

    public boolean getFlash() {
        CameraWrapper cameraWrapper = this.mCameraWrapper;
        if (cameraWrapper == null || !CameraUtils.isFlashSupported(cameraWrapper.mCamera) || !this.mCameraWrapper.mCamera.getParameters().getFlashMode().equals("torch")) {
            return false;
        }
        return true;
    }

    public synchronized Rect getFramingRectInPreview(int i, int i2) {
        if (this.mFramingRectInPreview == null) {
            Rect framingRect = this.mViewFinderView.getFramingRect();
            int width = this.mViewFinderView.getWidth();
            int height = this.mViewFinderView.getHeight();
            if (framingRect != null && width != 0 && height != 0) {
                Rect rect = new Rect(framingRect);
                if (i < width) {
                    rect.left = (rect.left * i) / width;
                    rect.right = (rect.right * i) / width;
                }
                if (i2 < height) {
                    rect.top = (rect.top * i2) / height;
                    rect.bottom = (rect.bottom * i2) / height;
                }
                this.mFramingRectInPreview = rect;
            }
            return null;
        }
        return this.mFramingRectInPreview;
    }

    public byte[] getRotatedData(byte[] bArr, Camera camera) {
        Camera.Size previewSize = camera.getParameters().getPreviewSize();
        int i = previewSize.width;
        int i2 = previewSize.height;
        int rotationCount = getRotationCount();
        if (rotationCount == 1 || rotationCount == 3) {
            int i3 = 0;
            while (i3 < rotationCount) {
                byte[] bArr2 = new byte[bArr.length];
                for (int i4 = 0; i4 < i2; i4++) {
                    for (int i5 = 0; i5 < i; i5++) {
                        bArr2[(((i5 * i2) + i2) - i4) - 1] = bArr[(i4 * i) + i5];
                    }
                }
                i3++;
                bArr = bArr2;
                int i6 = i;
                i = i2;
                i2 = i6;
            }
        }
        return bArr;
    }

    public int getRotationCount() {
        return this.mPreview.getDisplayOrientation() / 90;
    }

    public void resumeCameraPreview() {
        CameraPreview cameraPreview = this.mPreview;
        if (cameraPreview != null) {
            cameraPreview.showCameraPreview();
        }
    }

    public void setAspectTolerance(float f) {
        this.mAspectTolerance = f;
    }

    public void setAutoFocus(boolean z) {
        this.mAutofocusState = z;
        CameraPreview cameraPreview = this.mPreview;
        if (cameraPreview != null) {
            cameraPreview.setAutoFocus(z);
        }
    }

    public void setBorderAlpha(float f) {
        this.mBorderAlpha = f;
        this.mViewFinderView.setBorderAlpha(f);
        this.mViewFinderView.setupViewFinder();
    }

    public void setBorderColor(int i) {
        this.mBorderColor = i;
        this.mViewFinderView.setBorderColor(i);
        this.mViewFinderView.setupViewFinder();
    }

    public void setBorderCornerRadius(int i) {
        this.mCornerRadius = i;
        this.mViewFinderView.setBorderCornerRadius(i);
        this.mViewFinderView.setupViewFinder();
    }

    public void setBorderLineLength(int i) {
        this.mBorderLength = i;
        this.mViewFinderView.setBorderLineLength(i);
        this.mViewFinderView.setupViewFinder();
    }

    public void setBorderStrokeWidth(int i) {
        this.mBorderWidth = i;
        this.mViewFinderView.setBorderStrokeWidth(i);
        this.mViewFinderView.setupViewFinder();
    }

    public void setFlash(boolean z) {
        this.mFlashState = Boolean.valueOf(z);
        CameraWrapper cameraWrapper = this.mCameraWrapper;
        if (cameraWrapper != null && CameraUtils.isFlashSupported(cameraWrapper.mCamera)) {
            Camera.Parameters parameters = this.mCameraWrapper.mCamera.getParameters();
            if (z) {
                if (parameters.getFlashMode().equals("torch")) {
                    return;
                }
                parameters.setFlashMode("torch");
            } else if (parameters.getFlashMode().equals("off")) {
                return;
            } else {
                parameters.setFlashMode("off");
            }
            this.mCameraWrapper.mCamera.setParameters(parameters);
        }
    }

    public void setIsBorderCornerRounded(boolean z) {
        this.mRoundedCorner = z;
        this.mViewFinderView.setBorderCornerRounded(z);
        this.mViewFinderView.setupViewFinder();
    }

    public void setLaserColor(int i) {
        this.mLaserColor = i;
        this.mViewFinderView.setLaserColor(i);
        this.mViewFinderView.setupViewFinder();
    }

    public void setLaserEnabled(boolean z) {
        this.mIsLaserEnabled = z;
        this.mViewFinderView.setLaserEnabled(z);
        this.mViewFinderView.setupViewFinder();
    }

    public void setMaskColor(int i) {
        this.mMaskColor = i;
        this.mViewFinderView.setMaskColor(i);
        this.mViewFinderView.setupViewFinder();
    }

    public void setShouldScaleToFill(boolean z) {
        this.mShouldScaleToFill = z;
    }

    public void setSquareViewFinder(boolean z) {
        this.mSquaredFinder = z;
        this.mViewFinderView.setSquareViewFinder(z);
        this.mViewFinderView.setupViewFinder();
    }

    public void setupCameraPreview(CameraWrapper cameraWrapper) {
        this.mCameraWrapper = cameraWrapper;
        if (cameraWrapper != null) {
            setupLayout(cameraWrapper);
            this.mViewFinderView.setupViewFinder();
            Boolean bool = this.mFlashState;
            if (bool != null) {
                setFlash(bool.booleanValue());
            }
            setAutoFocus(this.mAutofocusState);
        }
    }

    public final void setupLayout(CameraWrapper cameraWrapper) {
        removeAllViews();
        CameraPreview cameraPreview = new CameraPreview(getContext(), cameraWrapper, this);
        this.mPreview = cameraPreview;
        cameraPreview.setAspectTolerance(this.mAspectTolerance);
        this.mPreview.setShouldScaleToFill(this.mShouldScaleToFill);
        if (!this.mShouldScaleToFill) {
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setGravity(17);
            relativeLayout.setBackgroundColor(-16777216);
            relativeLayout.addView(this.mPreview);
            addView(relativeLayout);
        } else {
            addView(this.mPreview);
        }
        IViewFinder iViewFinder = this.mViewFinderView;
        if (iViewFinder instanceof View) {
            addView((View) iViewFinder);
            return;
        }
        throw new IllegalArgumentException("IViewFinder object returned by 'createViewFinderView()' should be instance of android.view.View");
    }

    public void startCamera(int i) {
        if (this.mCameraHandlerThread == null) {
            this.mCameraHandlerThread = new CameraHandlerThread(this);
        }
        this.mCameraHandlerThread.startCamera(i);
    }

    public void stopCamera() {
        if (this.mCameraWrapper != null) {
            this.mPreview.stopCameraPreview();
            this.mPreview.setCamera(null, null);
            this.mCameraWrapper.mCamera.release();
            this.mCameraWrapper = null;
        }
        CameraHandlerThread cameraHandlerThread = this.mCameraHandlerThread;
        if (cameraHandlerThread != null) {
            cameraHandlerThread.quit();
            this.mCameraHandlerThread = null;
        }
    }

    public void stopCameraPreview() {
        CameraPreview cameraPreview = this.mPreview;
        if (cameraPreview != null) {
            cameraPreview.stopCameraPreview();
        }
    }

    public void toggleFlash() {
        CameraWrapper cameraWrapper = this.mCameraWrapper;
        if (cameraWrapper != null && CameraUtils.isFlashSupported(cameraWrapper.mCamera)) {
            Camera.Parameters parameters = this.mCameraWrapper.mCamera.getParameters();
            if (parameters.getFlashMode().equals("torch")) {
                parameters.setFlashMode("off");
            } else {
                parameters.setFlashMode("torch");
            }
            this.mCameraWrapper.mCamera.setParameters(parameters);
        }
    }

    public void startCamera() {
        startCamera(CameraUtils.getDefaultCameraId());
    }

    public BarcodeScannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAutofocusState = true;
        this.mShouldScaleToFill = true;
        this.mIsLaserEnabled = true;
        this.mLaserColor = getResources().getColor(C26149R.color.viewfinder_laser);
        this.mBorderColor = getResources().getColor(C26149R.color.viewfinder_border);
        this.mMaskColor = getResources().getColor(C26149R.color.viewfinder_mask);
        this.mBorderWidth = getResources().getInteger(C26149R.integer.viewfinder_border_width);
        this.mBorderLength = getResources().getInteger(C26149R.integer.viewfinder_border_length);
        this.mRoundedCorner = false;
        this.mCornerRadius = 0;
        this.mSquaredFinder = false;
        this.mBorderAlpha = 1.0f;
        this.mViewFinderOffset = 0;
        this.mAspectTolerance = 0.1f;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C26149R.styleable.BarcodeScannerView, 0, 0);
        try {
            setShouldScaleToFill(obtainStyledAttributes.getBoolean(C26149R.styleable.BarcodeScannerView_shouldScaleToFill, true));
            this.mIsLaserEnabled = obtainStyledAttributes.getBoolean(C26149R.styleable.BarcodeScannerView_laserEnabled, this.mIsLaserEnabled);
            this.mLaserColor = obtainStyledAttributes.getColor(C26149R.styleable.BarcodeScannerView_laserColor, this.mLaserColor);
            this.mBorderColor = obtainStyledAttributes.getColor(C26149R.styleable.BarcodeScannerView_borderColor, this.mBorderColor);
            this.mMaskColor = obtainStyledAttributes.getColor(C26149R.styleable.BarcodeScannerView_maskColor, this.mMaskColor);
            this.mBorderWidth = obtainStyledAttributes.getDimensionPixelSize(C26149R.styleable.BarcodeScannerView_borderWidth, this.mBorderWidth);
            this.mBorderLength = obtainStyledAttributes.getDimensionPixelSize(C26149R.styleable.BarcodeScannerView_borderLength, this.mBorderLength);
            this.mRoundedCorner = obtainStyledAttributes.getBoolean(C26149R.styleable.BarcodeScannerView_roundedCorner, this.mRoundedCorner);
            this.mCornerRadius = obtainStyledAttributes.getDimensionPixelSize(C26149R.styleable.BarcodeScannerView_cornerRadius, this.mCornerRadius);
            this.mSquaredFinder = obtainStyledAttributes.getBoolean(C26149R.styleable.BarcodeScannerView_squaredFinder, this.mSquaredFinder);
            this.mBorderAlpha = obtainStyledAttributes.getFloat(C26149R.styleable.BarcodeScannerView_borderAlpha, this.mBorderAlpha);
            this.mViewFinderOffset = obtainStyledAttributes.getDimensionPixelSize(C26149R.styleable.BarcodeScannerView_finderOffset, this.mViewFinderOffset);
            obtainStyledAttributes.recycle();
            init();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
