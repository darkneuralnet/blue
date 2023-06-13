package com.google.maps.android.p037ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
/* renamed from: com.google.maps.android.ui.SquareTextView */
/* loaded from: classes6.dex */
public class SquareTextView extends TextView {

    /* renamed from: b */
    public int f74659b;

    /* renamed from: c */
    public int f74660c;

    public SquareTextView(Context context) {
        super(context);
        this.f74659b = 0;
        this.f74660c = 0;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.translate(this.f74660c / 2, this.f74659b / 2);
        super.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int max = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.f74659b = measuredWidth - measuredHeight;
            this.f74660c = 0;
        } else {
            this.f74659b = 0;
            this.f74660c = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(max, max);
    }

    public SquareTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f74659b = 0;
        this.f74660c = 0;
    }

    public SquareTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f74659b = 0;
        this.f74660c = 0;
    }
}
