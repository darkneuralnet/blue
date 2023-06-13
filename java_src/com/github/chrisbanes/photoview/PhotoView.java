package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
/* loaded from: classes5.dex */
public class PhotoView extends AppCompatImageView {

    /* renamed from: b */
    public View$OnTouchListenerC45688nS3 f69971b;

    /* renamed from: c */
    public ImageView.ScaleType f69972c;

    public PhotoView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f69971b.m23741E();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f69971b.m23734L();
    }

    public final void init() {
        this.f69971b = new View$OnTouchListenerC45688nS3(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f69972c;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f69972c = null;
        }
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f69971b.m23731O(z);
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.f69971b.m23694m0();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        View$OnTouchListenerC45688nS3 view$OnTouchListenerC45688nS3 = this.f69971b;
        if (view$OnTouchListenerC45688nS3 != null) {
            view$OnTouchListenerC45688nS3.m23694m0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        View$OnTouchListenerC45688nS3 view$OnTouchListenerC45688nS3 = this.f69971b;
        if (view$OnTouchListenerC45688nS3 != null) {
            view$OnTouchListenerC45688nS3.m23694m0();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        View$OnTouchListenerC45688nS3 view$OnTouchListenerC45688nS3 = this.f69971b;
        if (view$OnTouchListenerC45688nS3 != null) {
            view$OnTouchListenerC45688nS3.m23694m0();
        }
    }

    public void setMaximumScale(float f) {
        this.f69971b.m23729Q(f);
    }

    public void setMediumScale(float f) {
        this.f69971b.m23728R(f);
    }

    public void setMinimumScale(float f) {
        this.f69971b.m23727S(f);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f69971b.m23726T(onClickListener);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f69971b.m23725U(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f69971b.m23724V(onLongClickListener);
    }

    public void setOnMatrixChangeListener(InterfaceC36818Wg3 interfaceC36818Wg3) {
        this.f69971b.m23723W(interfaceC36818Wg3);
    }

    public void setOnOutsidePhotoTapListener(InterfaceC37286Yg3 interfaceC37286Yg3) {
        this.f69971b.m23722X(interfaceC37286Yg3);
    }

    public void setOnPhotoTapListener(InterfaceC38104ah3 interfaceC38104ah3) {
        this.f69971b.m23721Y(interfaceC38104ah3);
    }

    public void setOnScaleChangeListener(InterfaceC42865ih3 interfaceC42865ih3) {
        this.f69971b.m23720Z(interfaceC42865ih3);
    }

    public void setOnSingleFlingListener(InterfaceC44051kh3 interfaceC44051kh3) {
        this.f69971b.m23718a0(interfaceC44051kh3);
    }

    public void setOnViewDragListener(InterfaceC47609qh3 interfaceC47609qh3) {
        this.f69971b.m23716b0(interfaceC47609qh3);
    }

    public void setOnViewTapListener(InterfaceC48202rh3 interfaceC48202rh3) {
        this.f69971b.m23714c0(interfaceC48202rh3);
    }

    public void setRotationBy(float f) {
        this.f69971b.m23712d0(f);
    }

    public void setRotationTo(float f) {
        this.f69971b.m23710e0(f);
    }

    public void setScale(float f) {
        this.f69971b.m23708f0(f);
    }

    public void setScaleLevels(float f, float f2, float f3) {
        this.f69971b.m23702i0(f, f2, f3);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        View$OnTouchListenerC45688nS3 view$OnTouchListenerC45688nS3 = this.f69971b;
        if (view$OnTouchListenerC45688nS3 == null) {
            this.f69972c = scaleType;
        } else {
            view$OnTouchListenerC45688nS3.m23700j0(scaleType);
        }
    }

    public void setZoomTransitionDuration(int i) {
        this.f69971b.m23698k0(i);
    }

    public void setZoomable(boolean z) {
        this.f69971b.m23696l0(z);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setScale(float f, boolean z) {
        this.f69971b.m23704h0(f, z);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public void setScale(float f, float f2, float f3, boolean z) {
        this.f69971b.m23706g0(f, f2, f3, z);
    }
}
