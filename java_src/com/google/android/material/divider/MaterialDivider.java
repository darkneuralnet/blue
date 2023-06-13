package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes6.dex */
public class MaterialDivider extends View {

    /* renamed from: g */
    public static final int f72802g = C50021ul4.Widget_MaterialComponents_MaterialDivider;

    /* renamed from: b */
    public final PM2 f72803b;

    /* renamed from: c */
    public int f72804c;

    /* renamed from: d */
    public int f72805d;

    /* renamed from: e */
    public int f72806e;

    /* renamed from: f */
    public int f72807f;

    public MaterialDivider(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int width;
        int i2;
        super.onDraw(canvas);
        boolean z = true;
        if (C38790bq6.m62548D(this) != 1) {
            z = false;
        }
        if (z) {
            i = this.f72807f;
        } else {
            i = this.f72806e;
        }
        if (z) {
            width = getWidth();
            i2 = this.f72806e;
        } else {
            width = getWidth();
            i2 = this.f72807f;
        }
        this.f72803b.setBounds(i, 0, width - i2, getBottom() - getTop());
        this.f72803b.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.f72804c;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.f72805d != i) {
            this.f72805d = i;
            this.f72803b.m90416a0(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(NA0.m94301c(getContext(), i));
    }

    public void setDividerInsetEnd(int i) {
        this.f72807f = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.f72806e = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.f72804c != i) {
            this.f72804c = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.materialDividerStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialDivider(Context context, AttributeSet attributeSet, int i) {
        super(VM2.m79935c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = f72802g;
        Context context2 = getContext();
        this.f72803b = new PM2();
        TypedArray m21866i = C46052o36.m21866i(context2, attributeSet, C37098Xl4.MaterialDivider, i, i2, new int[0]);
        this.f72804c = m21866i.getDimensionPixelSize(C37098Xl4.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(C35172Pf4.material_divider_thickness));
        this.f72806e = m21866i.getDimensionPixelOffset(C37098Xl4.MaterialDivider_dividerInsetStart, 0);
        this.f72807f = m21866i.getDimensionPixelOffset(C37098Xl4.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(NM2.m94029b(context2, m21866i, C37098Xl4.MaterialDivider_dividerColor).getDefaultColor());
        m21866i.recycle();
    }
}
