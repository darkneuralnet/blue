package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.C11515b;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public class Barrier extends ConstraintHelper {

    /* renamed from: k */
    public int f53933k;

    /* renamed from: l */
    public int f53934l;

    /* renamed from: m */
    public C1263Cy f53935m;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: C */
    public boolean m67906C() {
        return this.f53935m.m111199y1();
    }

    /* renamed from: D */
    public int m67905D() {
        return this.f53935m.m111206A1();
    }

    /* renamed from: E */
    public int m67904E() {
        return this.f53933k;
    }

    /* renamed from: F */
    public final void m67903F(C43042iz0 c43042iz0, int i, boolean z) {
        this.f53934l = i;
        if (z) {
            int i2 = this.f53933k;
            if (i2 == 5) {
                this.f53934l = 1;
            } else if (i2 == 6) {
                this.f53934l = 0;
            }
        } else {
            int i3 = this.f53933k;
            if (i3 == 5) {
                this.f53934l = 0;
            } else if (i3 == 6) {
                this.f53934l = 1;
            }
        }
        if (c43042iz0 instanceof C1263Cy) {
            ((C1263Cy) c43042iz0).m111202E1(this.f53934l);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: q */
    public void mo67862q(AttributeSet attributeSet) {
        super.mo67862q(attributeSet);
        this.f53935m = new C1263Cy();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C39341cm4.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C39341cm4.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f53935m.m111203D1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C39341cm4.ConstraintLayout_Layout_barrierMargin) {
                    this.f53935m.m111201F1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f53939e = this.f53935m;
        m67901B();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: r */
    public void mo67889r(C11515b.C11516a c11516a, JL1 jl1, ConstraintLayout.LayoutParams layoutParams, SparseArray<C43042iz0> sparseArray) {
        super.mo67889r(c11516a, jl1, layoutParams, sparseArray);
        if (jl1 instanceof C1263Cy) {
            C1263Cy c1263Cy = (C1263Cy) jl1;
            m67903F(c1263Cy, c11516a.f54086e.f54144h0, ((C43635jz0) jl1.m31414M()).m29540U1());
            c1263Cy.m111203D1(c11516a.f54086e.f54160p0);
            c1263Cy.m111201F1(c11516a.f54086e.f54146i0);
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f53935m.m111203D1(z);
    }

    public void setDpMargin(int i) {
        C1263Cy c1263Cy = this.f53935m;
        c1263Cy.m111201F1((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f53935m.m111201F1(i);
    }

    public void setType(int i) {
        this.f53933k = i;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: t */
    public void mo67887t(C43042iz0 c43042iz0, boolean z) {
        m67903F(c43042iz0, this.f53933k, z);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
