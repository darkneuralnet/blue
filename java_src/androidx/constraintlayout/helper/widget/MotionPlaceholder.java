package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;
/* loaded from: classes.dex */
public class MotionPlaceholder extends VirtualLayout {

    /* renamed from: m */
    public SU3 f53552m;

    public MotionPlaceholder(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    /* renamed from: C */
    public void mo67864C(C53077zu6 c53077zu6, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (c53077zu6 != null) {
            c53077zu6.mo135G1(mode, size, mode2, size2);
            setMeasuredDimension(c53077zu6.m140B1(), c53077zu6.m141A1());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        mo67864C(this.f53552m, i, i2);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: q */
    public void mo67862q(AttributeSet attributeSet) {
        super.mo67862q(attributeSet);
        this.f53939e = new SU3();
        m67901B();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: z */
    public void mo67882z(C43635jz0 c43635jz0, HL1 hl1, SparseArray<C43042iz0> sparseArray) {
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
