package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
/* loaded from: classes6.dex */
public final class CircularProgressIndicatorSpec extends AbstractC30476yC {

    /* renamed from: g */
    public int f73157g;

    /* renamed from: h */
    public int f73158h;

    /* renamed from: i */
    public int f73159i;

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.circularProgressIndicatorStyle);
    }

    @Override // p000.AbstractC30476yC
    /* renamed from: e */
    public void mo3855e() {
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, CircularProgressIndicator.f73156q);
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C35172Pf4.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C35172Pf4.mtrl_progress_circular_inset_medium);
        TypedArray m21866i = C46052o36.m21866i(context, attributeSet, C37098Xl4.CircularProgressIndicator, i, i2, new int[0]);
        this.f73157g = Math.max(NM2.m94027d(context, m21866i, C37098Xl4.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.f118947a * 2);
        this.f73158h = NM2.m94027d(context, m21866i, C37098Xl4.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.f73159i = m21866i.getInt(C37098Xl4.CircularProgressIndicator_indicatorDirectionCircular, 0);
        m21866i.recycle();
        mo3855e();
    }
}
