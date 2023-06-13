package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public class Group extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: k */
    public void mo67863k(ConstraintLayout constraintLayout) {
        m67895j(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m67896i();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: q */
    public void mo67862q(AttributeSet attributeSet) {
        super.mo67862q(attributeSet);
        this.f53940f = false;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m67896i();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m67896i();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: w */
    public void mo67870w(ConstraintLayout constraintLayout) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f54014v0.m31349o1(0);
        layoutParams.f54014v0.m31407P0(0);
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
