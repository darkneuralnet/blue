package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
/* loaded from: classes6.dex */
public final class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {

    /* renamed from: q */
    public static final int f73160q = C50021ul4.Widget_MaterialComponents_LinearProgressIndicator;

    public LinearProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Object obj = this.f73138b;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) obj;
        boolean z2 = true;
        if (((LinearProgressIndicatorSpec) obj).f73162h != 1 && ((C38790bq6.m62548D(this) != 1 || ((LinearProgressIndicatorSpec) this.f73138b).f73162h != 2) && (C38790bq6.m62548D(this) != 0 || ((LinearProgressIndicatorSpec) this.f73138b).f73162h != 3))) {
            z2 = false;
        }
        linearProgressIndicatorSpec.f73163i = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = i - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i2 - (getPaddingTop() + getPaddingBottom());
        C47214q12<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        C39515d21<LinearProgressIndicatorSpec> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        if (((LinearProgressIndicatorSpec) this.f73138b).f73161g == i) {
            return;
        }
        if (m49244w() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        Object obj = this.f73138b;
        ((LinearProgressIndicatorSpec) obj).f73161g = i;
        ((LinearProgressIndicatorSpec) obj).mo3855e();
        if (i == 0) {
            getIndeterminateDrawable().m18309x(new C33406Hr2((LinearProgressIndicatorSpec) this.f73138b));
        } else {
            getIndeterminateDrawable().m18309x(new C33640Ir2(getContext(), (LinearProgressIndicatorSpec) this.f73138b));
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f73138b).mo3855e();
    }

    public void setIndicatorDirection(int i) {
        Object obj = this.f73138b;
        ((LinearProgressIndicatorSpec) obj).f73162h = i;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) obj;
        boolean z = true;
        if (i != 1 && ((C38790bq6.m62548D(this) != 1 || ((LinearProgressIndicatorSpec) this.f73138b).f73162h != 2) && (C38790bq6.m62548D(this) != 0 || i != 3))) {
            z = false;
        }
        linearProgressIndicatorSpec.f73163i = z;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setProgressCompat(int i, boolean z) {
        Object obj = this.f73138b;
        if (obj != null && ((LinearProgressIndicatorSpec) obj).f73161g == 0 && isIndeterminate()) {
            return;
        }
        super.setProgressCompat(i, z);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((LinearProgressIndicatorSpec) this.f73138b).mo3855e();
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* renamed from: x */
    public LinearProgressIndicatorSpec mo49241i(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    /* renamed from: y */
    public final void m49239y() {
        setIndeterminateDrawable(C47214q12.m18312u(getContext(), (LinearProgressIndicatorSpec) this.f73138b));
        setProgressDrawable(C39515d21.m44693w(getContext(), (LinearProgressIndicatorSpec) this.f73138b));
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C49961uf4.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, f73160q);
        m49239y();
    }
}
