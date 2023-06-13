package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
/* loaded from: classes6.dex */
public final class LinearProgressIndicatorSpec extends AbstractC30476yC {

    /* renamed from: g */
    public int f73161g;

    /* renamed from: h */
    public int f73162h;

    /* renamed from: i */
    public boolean f73163i;

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.linearProgressIndicatorStyle);
    }

    @Override // p000.AbstractC30476yC
    /* renamed from: e */
    public void mo3855e() {
        if (this.f73161g == 0) {
            if (this.f118948b <= 0) {
                if (this.f118949c.length < 3) {
                    throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                }
                return;
            }
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        }
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, LinearProgressIndicator.f73160q);
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray m21866i = C46052o36.m21866i(context, attributeSet, C37098Xl4.LinearProgressIndicator, C49961uf4.linearProgressIndicatorStyle, LinearProgressIndicator.f73160q, new int[0]);
        this.f73161g = m21866i.getInt(C37098Xl4.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.f73162h = m21866i.getInt(C37098Xl4.LinearProgressIndicator_indicatorDirectionLinear, 0);
        m21866i.recycle();
        mo3855e();
        this.f73163i = this.f73162h == 1;
    }
}
