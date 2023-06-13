package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* renamed from: b */
    public C11515b f54030b;

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    /* renamed from: a */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: c */
    public C11515b m67872c() {
        if (this.f54030b == null) {
            this.f54030b = new C11515b();
        }
        this.f54030b.m67810r(this);
        return this.f54030b;
    }

    /* renamed from: d */
    public final void m67871d(AttributeSet attributeSet) {
        Log.v("Constraints", " ################# init");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m67871d(attributeSet);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67871d(attributeSet);
        super.setVisibility(8);
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ConstraintLayout.LayoutParams {

        /* renamed from: A0 */
        public float f54031A0;

        /* renamed from: B0 */
        public float f54032B0;

        /* renamed from: C0 */
        public float f54033C0;

        /* renamed from: D0 */
        public float f54034D0;

        /* renamed from: E0 */
        public float f54035E0;

        /* renamed from: F0 */
        public float f54036F0;

        /* renamed from: G0 */
        public float f54037G0;

        /* renamed from: H0 */
        public float f54038H0;

        /* renamed from: I0 */
        public float f54039I0;

        /* renamed from: J0 */
        public float f54040J0;

        /* renamed from: x0 */
        public float f54041x0;

        /* renamed from: y0 */
        public boolean f54042y0;

        /* renamed from: z0 */
        public float f54043z0;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f54041x0 = 1.0f;
            this.f54042y0 = false;
            this.f54043z0 = 0.0f;
            this.f54031A0 = 0.0f;
            this.f54032B0 = 0.0f;
            this.f54033C0 = 0.0f;
            this.f54034D0 = 1.0f;
            this.f54035E0 = 1.0f;
            this.f54036F0 = 0.0f;
            this.f54037G0 = 0.0f;
            this.f54038H0 = 0.0f;
            this.f54039I0 = 0.0f;
            this.f54040J0 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f54041x0 = 1.0f;
            this.f54042y0 = false;
            this.f54043z0 = 0.0f;
            this.f54031A0 = 0.0f;
            this.f54032B0 = 0.0f;
            this.f54033C0 = 0.0f;
            this.f54034D0 = 1.0f;
            this.f54035E0 = 1.0f;
            this.f54036F0 = 0.0f;
            this.f54037G0 = 0.0f;
            this.f54038H0 = 0.0f;
            this.f54039I0 = 0.0f;
            this.f54040J0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C39341cm4.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.ConstraintSet_android_alpha) {
                    this.f54041x0 = obtainStyledAttributes.getFloat(index, this.f54041x0);
                } else if (index == C39341cm4.ConstraintSet_android_elevation) {
                    this.f54043z0 = obtainStyledAttributes.getFloat(index, this.f54043z0);
                    this.f54042y0 = true;
                } else if (index == C39341cm4.ConstraintSet_android_rotationX) {
                    this.f54032B0 = obtainStyledAttributes.getFloat(index, this.f54032B0);
                } else if (index == C39341cm4.ConstraintSet_android_rotationY) {
                    this.f54033C0 = obtainStyledAttributes.getFloat(index, this.f54033C0);
                } else if (index == C39341cm4.ConstraintSet_android_rotation) {
                    this.f54031A0 = obtainStyledAttributes.getFloat(index, this.f54031A0);
                } else if (index == C39341cm4.ConstraintSet_android_scaleX) {
                    this.f54034D0 = obtainStyledAttributes.getFloat(index, this.f54034D0);
                } else if (index == C39341cm4.ConstraintSet_android_scaleY) {
                    this.f54035E0 = obtainStyledAttributes.getFloat(index, this.f54035E0);
                } else if (index == C39341cm4.ConstraintSet_android_transformPivotX) {
                    this.f54036F0 = obtainStyledAttributes.getFloat(index, this.f54036F0);
                } else if (index == C39341cm4.ConstraintSet_android_transformPivotY) {
                    this.f54037G0 = obtainStyledAttributes.getFloat(index, this.f54037G0);
                } else if (index == C39341cm4.ConstraintSet_android_translationX) {
                    this.f54038H0 = obtainStyledAttributes.getFloat(index, this.f54038H0);
                } else if (index == C39341cm4.ConstraintSet_android_translationY) {
                    this.f54039I0 = obtainStyledAttributes.getFloat(index, this.f54039I0);
                } else if (index == C39341cm4.ConstraintSet_android_translationZ) {
                    this.f54040J0 = obtainStyledAttributes.getFloat(index, this.f54040J0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
