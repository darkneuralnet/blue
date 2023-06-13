package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
/* loaded from: classes6.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {

    /* renamed from: b */
    public Path f72982b;

    public ClippableRoundedCornerLayout(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void m49416a() {
        this.f72982b = null;
        invalidate();
    }

    /* renamed from: b */
    public void m49415b(float f, float f2, float f3, float f4, float f5) {
        m49413d(new RectF(f, f2, f3, f4), f5);
    }

    /* renamed from: c */
    public void m49414c(Rect rect, float f) {
        m49415b(rect.left, rect.top, rect.right, rect.bottom, f);
    }

    /* renamed from: d */
    public void m49413d(RectF rectF, float f) {
        if (this.f72982b == null) {
            this.f72982b = new Path();
        }
        this.f72982b.reset();
        this.f72982b.addRoundRect(rectF, f, f, Path.Direction.CW);
        this.f72982b.close();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f72982b == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f72982b);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
