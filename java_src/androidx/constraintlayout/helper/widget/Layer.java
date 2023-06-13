package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public class Layer extends ConstraintHelper {

    /* renamed from: A */
    public boolean f53526A;

    /* renamed from: B */
    public boolean f53527B;

    /* renamed from: k */
    public float f53528k;

    /* renamed from: l */
    public float f53529l;

    /* renamed from: m */
    public float f53530m;

    /* renamed from: n */
    public ConstraintLayout f53531n;

    /* renamed from: o */
    public float f53532o;

    /* renamed from: p */
    public float f53533p;

    /* renamed from: q */
    public float f53534q;

    /* renamed from: r */
    public float f53535r;

    /* renamed from: s */
    public float f53536s;

    /* renamed from: t */
    public float f53537t;

    /* renamed from: u */
    public float f53538u;

    /* renamed from: v */
    public float f53539v;

    /* renamed from: w */
    public boolean f53540w;

    /* renamed from: x */
    public View[] f53541x;

    /* renamed from: y */
    public float f53542y;

    /* renamed from: z */
    public float f53543z;

    public Layer(Context context) {
        super(context);
        this.f53528k = Float.NaN;
        this.f53529l = Float.NaN;
        this.f53530m = Float.NaN;
        this.f53532o = 1.0f;
        this.f53533p = 1.0f;
        this.f53534q = Float.NaN;
        this.f53535r = Float.NaN;
        this.f53536s = Float.NaN;
        this.f53537t = Float.NaN;
        this.f53538u = Float.NaN;
        this.f53539v = Float.NaN;
        this.f53540w = true;
        this.f53541x = null;
        this.f53542y = 0.0f;
        this.f53543z = 0.0f;
    }

    /* renamed from: C */
    public void m68208C() {
        if (this.f53531n == null) {
            return;
        }
        if (!this.f53540w && !Float.isNaN(this.f53534q) && !Float.isNaN(this.f53535r)) {
            return;
        }
        if (!Float.isNaN(this.f53528k) && !Float.isNaN(this.f53529l)) {
            this.f53535r = this.f53529l;
            this.f53534q = this.f53528k;
            return;
        }
        View[] m67890p = m67890p(this.f53531n);
        int left = m67890p[0].getLeft();
        int top = m67890p[0].getTop();
        int right = m67890p[0].getRight();
        int bottom = m67890p[0].getBottom();
        for (int i = 0; i < this.f53937c; i++) {
            View view = m67890p[i];
            left = Math.min(left, view.getLeft());
            top = Math.min(top, view.getTop());
            right = Math.max(right, view.getRight());
            bottom = Math.max(bottom, view.getBottom());
        }
        this.f53536s = right;
        this.f53537t = bottom;
        this.f53538u = left;
        this.f53539v = top;
        if (Float.isNaN(this.f53528k)) {
            this.f53534q = (left + right) / 2;
        } else {
            this.f53534q = this.f53528k;
        }
        if (Float.isNaN(this.f53529l)) {
            this.f53535r = (top + bottom) / 2;
        } else {
            this.f53535r = this.f53529l;
        }
    }

    /* renamed from: D */
    public final void m68207D() {
        int i;
        if (this.f53531n == null || (i = this.f53937c) == 0) {
            return;
        }
        View[] viewArr = this.f53541x;
        if (viewArr == null || viewArr.length != i) {
            this.f53541x = new View[i];
        }
        for (int i2 = 0; i2 < this.f53937c; i2++) {
            this.f53541x[i2] = this.f53531n.getViewById(this.f53936b[i2]);
        }
    }

    /* renamed from: E */
    public final void m68206E() {
        double radians;
        if (this.f53531n == null) {
            return;
        }
        if (this.f53541x == null) {
            m68207D();
        }
        m68208C();
        if (Float.isNaN(this.f53530m)) {
            radians = 0.0d;
        } else {
            radians = Math.toRadians(this.f53530m);
        }
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f = this.f53532o;
        float f2 = f * cos;
        float f3 = this.f53533p;
        float f4 = (-f3) * sin;
        float f5 = f * sin;
        float f6 = f3 * cos;
        for (int i = 0; i < this.f53937c; i++) {
            View view = this.f53541x[i];
            float left = ((view.getLeft() + view.getRight()) / 2) - this.f53534q;
            float top = ((view.getTop() + view.getBottom()) / 2) - this.f53535r;
            view.setTranslationX((((f2 * left) + (f4 * top)) - left) + this.f53542y);
            view.setTranslationY((((left * f5) + (f6 * top)) - top) + this.f53543z);
            view.setScaleY(this.f53533p);
            view.setScaleX(this.f53532o);
            if (!Float.isNaN(this.f53530m)) {
                view.setRotation(this.f53530m);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: k */
    public void mo67863k(ConstraintLayout constraintLayout) {
        m67895j(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f53531n = (ConstraintLayout) getParent();
        if (this.f53526A || this.f53527B) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f53937c; i++) {
                View viewById = this.f53531n.getViewById(this.f53936b[i]);
                if (viewById != null) {
                    if (this.f53526A) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f53527B && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: q */
    public void mo67862q(AttributeSet attributeSet) {
        super.mo67862q(attributeSet);
        this.f53940f = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C39341cm4.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.ConstraintLayout_Layout_android_visibility) {
                    this.f53526A = true;
                } else if (index == C39341cm4.ConstraintLayout_Layout_android_elevation) {
                    this.f53527B = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m67896i();
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        this.f53528k = f;
        m68206E();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.f53529l = f;
        m68206E();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.f53530m = f;
        m68206E();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.f53532o = f;
        m68206E();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.f53533p = f;
        m68206E();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.f53542y = f;
        m68206E();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.f53543z = f;
        m68206E();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m67896i();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: w */
    public void mo67870w(ConstraintLayout constraintLayout) {
        m68207D();
        this.f53534q = Float.NaN;
        this.f53535r = Float.NaN;
        C43042iz0 m67880b = ((ConstraintLayout.LayoutParams) getLayoutParams()).m67880b();
        m67880b.m31349o1(0);
        m67880b.m31407P0(0);
        m68208C();
        layout(((int) this.f53538u) - getPaddingLeft(), ((int) this.f53539v) - getPaddingTop(), ((int) this.f53536s) + getPaddingRight(), ((int) this.f53537t) + getPaddingBottom());
        m68206E();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: y */
    public void mo67883y(ConstraintLayout constraintLayout) {
        this.f53531n = constraintLayout;
        float rotation = getRotation();
        if (rotation == 0.0f) {
            if (!Float.isNaN(this.f53530m)) {
                this.f53530m = rotation;
                return;
            }
            return;
        }
        this.f53530m = rotation;
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53528k = Float.NaN;
        this.f53529l = Float.NaN;
        this.f53530m = Float.NaN;
        this.f53532o = 1.0f;
        this.f53533p = 1.0f;
        this.f53534q = Float.NaN;
        this.f53535r = Float.NaN;
        this.f53536s = Float.NaN;
        this.f53537t = Float.NaN;
        this.f53538u = Float.NaN;
        this.f53539v = Float.NaN;
        this.f53540w = true;
        this.f53541x = null;
        this.f53542y = 0.0f;
        this.f53543z = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53528k = Float.NaN;
        this.f53529l = Float.NaN;
        this.f53530m = Float.NaN;
        this.f53532o = 1.0f;
        this.f53533p = 1.0f;
        this.f53534q = Float.NaN;
        this.f53535r = Float.NaN;
        this.f53536s = Float.NaN;
        this.f53537t = Float.NaN;
        this.f53538u = Float.NaN;
        this.f53539v = Float.NaN;
        this.f53540w = true;
        this.f53541x = null;
        this.f53542y = 0.0f;
        this.f53543z = 0.0f;
    }
}
