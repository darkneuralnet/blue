package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
/* loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements MotionLayout.InterfaceC11486k {

    /* renamed from: k */
    public boolean f53553k;

    /* renamed from: l */
    public boolean f53554l;

    /* renamed from: m */
    public float f53555m;

    /* renamed from: n */
    public View[] f53556n;

    public MotionHelper(Context context) {
        super(context);
        this.f53553k = false;
        this.f53554l = false;
    }

    /* renamed from: C */
    public boolean mo68204C() {
        return false;
    }

    /* renamed from: D */
    public boolean m68203D() {
        return this.f53554l;
    }

    /* renamed from: E */
    public boolean m68202E() {
        return this.f53553k;
    }

    /* renamed from: F */
    public void m68201F(MotionLayout motionLayout) {
    }

    /* renamed from: G */
    public void m68200G(Canvas canvas) {
    }

    /* renamed from: H */
    public void m68199H(Canvas canvas) {
    }

    /* renamed from: I */
    public void mo68198I(MotionLayout motionLayout, HashMap<View, OV2> hashMap) {
    }

    /* renamed from: a */
    public void mo68093a(MotionLayout motionLayout, int i, int i2, float f) {
    }

    /* renamed from: b */
    public void mo68092b(MotionLayout motionLayout, int i) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC11486k
    /* renamed from: c */
    public void mo68091c(MotionLayout motionLayout, int i, int i2) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC11486k
    /* renamed from: d */
    public void mo68090d(MotionLayout motionLayout, int i, boolean z, float f) {
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: q */
    public void mo67862q(AttributeSet attributeSet) {
        super.mo67862q(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C39341cm4.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.MotionHelper_onShow) {
                    this.f53553k = obtainStyledAttributes.getBoolean(index, this.f53553k);
                } else if (index == C39341cm4.MotionHelper_onHide) {
                    this.f53554l = obtainStyledAttributes.getBoolean(index, this.f53554l);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(View view, float f) {
    }

    public void setProgress(float f) {
        this.f53555m = f;
        int i = 0;
        if (this.f53937c > 0) {
            this.f53556n = m67890p((ConstraintLayout) getParent());
            while (i < this.f53937c) {
                setProgress(this.f53556n[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof MotionHelper)) {
                setProgress(childAt, f);
            }
            i++;
        }
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53553k = false;
        this.f53554l = false;
        mo67862q(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53553k = false;
        this.f53554l = false;
        mo67862q(attributeSet);
    }
}
