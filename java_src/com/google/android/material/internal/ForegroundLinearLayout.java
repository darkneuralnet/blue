package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
/* loaded from: classes6.dex */
public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* renamed from: b */
    public Drawable f72987b;

    /* renamed from: c */
    public final Rect f72988c;

    /* renamed from: d */
    public final Rect f72989d;

    /* renamed from: e */
    public int f72990e;

    /* renamed from: f */
    public boolean f72991f;

    /* renamed from: g */
    public boolean f72992g;

    public ForegroundLinearLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f72987b;
        if (drawable != null) {
            if (this.f72992g) {
                this.f72992g = false;
                Rect rect = this.f72988c;
                Rect rect2 = this.f72989d;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f72991f) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f72990e, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f72987b;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f72987b;
        if (drawable != null && drawable.isStateful()) {
            this.f72987b.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f72987b;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f72990e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f72987b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f72992g = z | this.f72992g;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f72992g = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f72987b;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f72987b);
            }
            this.f72987b = drawable;
            this.f72992g = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f72990e == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f72990e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f72990e = i;
            if (i == 119 && this.f72987b != null) {
                this.f72987b.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f72987b;
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f72988c = new Rect();
        this.f72989d = new Rect();
        this.f72990e = 119;
        this.f72991f = true;
        this.f72992g = false;
        TypedArray m21866i = C46052o36.m21866i(context, attributeSet, C37098Xl4.ForegroundLinearLayout, i, 0, new int[0]);
        this.f72990e = m21866i.getInt(C37098Xl4.ForegroundLinearLayout_android_foregroundGravity, this.f72990e);
        Drawable drawable = m21866i.getDrawable(C37098Xl4.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f72991f = m21866i.getBoolean(C37098Xl4.ForegroundLinearLayout_foregroundInsidePadding, true);
        m21866i.recycle();
    }
}
