package com.adyen.checkout.components.p024ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
/* renamed from: com.adyen.checkout.components.ui.view.RoundCornerImageView */
/* loaded from: classes.dex */
public class RoundCornerImageView extends AppCompatImageView {

    /* renamed from: b */
    public float f68425b;

    /* renamed from: c */
    public final Paint f68426c;

    /* renamed from: d */
    public float f68427d;

    /* renamed from: e */
    public int f68428e;

    /* renamed from: f */
    public boolean f68429f;

    public RoundCornerImageView(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    public final void m53576c(TypedArray typedArray) {
        try {
            this.f68428e = typedArray.getColor(C34992Ol4.RoundCornerImageView_strokeColor, -16777216);
            this.f68427d = typedArray.getDimension(C34992Ol4.RoundCornerImageView_strokeWidth, 4.0f);
            this.f68425b = typedArray.getDimension(C34992Ol4.RoundCornerImageView_radius, 9.0f);
        } finally {
            typedArray.recycle();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        if (!this.f68429f) {
            super.onDraw(canvas);
            return;
        }
        float f = this.f68427d;
        RectF rectF = new RectF(f / 2.0f, f / 2.0f, getWidth() - (this.f68427d / 2.0f), getHeight() - (this.f68427d / 2.0f));
        this.f68426c.reset();
        if (this.f68427d > 0.0f) {
            this.f68426c.setStyle(Paint.Style.STROKE);
            this.f68426c.setAntiAlias(true);
            this.f68426c.setColor(this.f68428e);
            this.f68426c.setStrokeWidth(this.f68427d);
            float f2 = this.f68425b;
            canvas.drawRoundRect(rectF, f2, f2, this.f68426c);
        }
        Path path = new Path();
        float f3 = this.f68425b;
        path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        float f = this.f68427d;
        super.onMeasure(i + (((int) f) * 2), i2 + (((int) f) * 2));
    }

    public void setBorderEnabled(boolean z) {
        this.f68429f = z;
        invalidate();
    }

    public void setRadius(float f) {
        this.f68425b = f;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.f68428e = i;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.f68427d = f;
        invalidate();
    }

    public RoundCornerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f68426c = new Paint();
        this.f68429f = true;
        m53576c(context.getTheme().obtainStyledAttributes(attributeSet, C34992Ol4.RoundCornerImageView, 0, 0));
    }
}
