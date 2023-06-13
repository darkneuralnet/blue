package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
/* loaded from: classes6.dex */
public final class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {

    /* renamed from: q */
    public static final int f73156q = C50021ul4.Widget_MaterialComponents_CircularProgressIndicator;

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.f73138b).f73159i = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        Object obj = this.f73138b;
        if (((CircularProgressIndicatorSpec) obj).f73158h != i) {
            ((CircularProgressIndicatorSpec) obj).f73158h = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, m49253n() * 2);
        Object obj = this.f73138b;
        if (((CircularProgressIndicatorSpec) obj).f73157g != max) {
            ((CircularProgressIndicatorSpec) obj).f73157g = max;
            ((CircularProgressIndicatorSpec) obj).mo3855e();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((CircularProgressIndicatorSpec) this.f73138b).mo3855e();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* renamed from: x */
    public CircularProgressIndicatorSpec mo49241i(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    /* renamed from: y */
    public final void m49242y() {
        setIndeterminateDrawable(C47214q12.m18313t(getContext(), (CircularProgressIndicatorSpec) this.f73138b));
        setProgressDrawable(C39515d21.m44694v(getContext(), (CircularProgressIndicatorSpec) this.f73138b));
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, f73156q);
        m49242y();
    }
}
