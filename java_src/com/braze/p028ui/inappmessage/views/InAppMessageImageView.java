package com.braze.p028ui.inappmessage.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.braze.ui.inappmessage.views.InAppMessageImageView */
/* loaded from: classes5.dex */
public class InAppMessageImageView extends ImageView implements InterfaceC52764zO1 {
    private static final String TAG = C43664k20.m29433n(InAppMessageImageView.class);
    private float mAspectRatio;
    private Path mClipPath;
    private float[] mInAppRadii;
    private RectF mRect;
    private boolean mSetToHalfParentHeight;

    public InAppMessageImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAspectRatio = -1.0f;
        this.mSetToHalfParentHeight = false;
        this.mClipPath = new Path();
        this.mRect = new RectF();
        setAdjustViewBounds(true);
    }

    public boolean clipCanvasToPath(Canvas canvas, int i, int i2) {
        if (this.mInAppRadii != null) {
            try {
                this.mClipPath.reset();
                this.mRect.set(0.0f, 0.0f, i, i2);
                this.mClipPath.addRoundRect(this.mRect, this.mInAppRadii, Path.Direction.CW);
                canvas.clipPath(this.mClipPath);
                return true;
            } catch (Exception e) {
                C43664k20.m29434m(TAG, "Encountered exception while trying to clip in-app message image", e);
            }
        }
        return false;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        clipCanvasToPath(canvas, getWidth(), getHeight());
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mAspectRatio != -1.0f && getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            int measuredWidth = getMeasuredWidth();
            setMeasuredDimension(measuredWidth, Math.min(getMeasuredHeight(), (int) (measuredWidth / this.mAspectRatio)) + 1);
        } else {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.mSetToHalfParentHeight) {
            setMeasuredDimension(getMeasuredWidth(), (int) (((View) getParent()).getHeight() * 0.5d));
        }
    }

    public void setAspectRatio(float f) {
        this.mAspectRatio = f;
        requestLayout();
    }

    @Override // p000.InterfaceC52764zO1
    public void setCornersRadiiPx(float f, float f2, float f3, float f4) {
        this.mInAppRadii = new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }

    @Override // p000.InterfaceC52764zO1
    public void setCornersRadiusPx(float f) {
        setCornersRadiiPx(f, f, f, f);
    }

    @Override // p000.InterfaceC52764zO1
    public void setInAppMessageImageCropType(PE0 pe0) {
        if (pe0.equals(PE0.FIT_CENTER)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (pe0.equals(PE0.CENTER_CROP)) {
            setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    public void setToHalfParentHeight(boolean z) {
        this.mSetToHalfParentHeight = z;
        requestLayout();
    }
}
