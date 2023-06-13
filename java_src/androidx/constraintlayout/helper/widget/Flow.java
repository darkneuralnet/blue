package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.C11515b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
/* loaded from: classes.dex */
public class Flow extends VirtualLayout {

    /* renamed from: m */
    public C32496Du1 f53525m;

    public Flow(Context context) {
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
        mo67864C(this.f53525m, i, i2);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: q */
    public void mo67862q(AttributeSet attributeSet) {
        super.mo67862q(attributeSet);
        this.f53525m = new C32496Du1();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C39341cm4.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.ConstraintLayout_Layout_android_orientation) {
                    this.f53525m.m109765H2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C39341cm4.ConstraintLayout_Layout_android_padding) {
                    this.f53525m.m129M1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C39341cm4.ConstraintLayout_Layout_android_paddingStart) {
                    this.f53525m.m124R1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C39341cm4.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f53525m.m127O1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C39341cm4.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f53525m.m126P1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C39341cm4.ConstraintLayout_Layout_android_paddingTop) {
                    this.f53525m.m123S1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C39341cm4.ConstraintLayout_Layout_android_paddingRight) {
                    this.f53525m.m125Q1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C39341cm4.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f53525m.m128N1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C39341cm4.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f53525m.m109760M2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C39341cm4.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f53525m.m109771B2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C39341cm4.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f53525m.m109761L2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C39341cm4.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f53525m.m109731v2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C39341cm4.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f53525m.m109769D2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C39341cm4.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f53525m.m109729x2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C39341cm4.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f53525m.m109767F2(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C39341cm4.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f53525m.m109727z2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C39341cm4.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f53525m.m109732u2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C39341cm4.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f53525m.m109770C2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C39341cm4.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f53525m.m109730w2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C39341cm4.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f53525m.m109768E2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C39341cm4.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f53525m.m109763J2(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C39341cm4.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f53525m.m109728y2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == C39341cm4.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f53525m.m109764I2(obtainStyledAttributes.getInt(index, 2));
                } else if (index == C39341cm4.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f53525m.m109772A2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C39341cm4.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f53525m.m109762K2(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C39341cm4.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f53525m.m109766G2(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f53939e = this.f53525m;
        m67901B();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: r */
    public void mo67889r(C11515b.C11516a c11516a, JL1 jl1, ConstraintLayout.LayoutParams layoutParams, SparseArray<C43042iz0> sparseArray) {
        super.mo67889r(c11516a, jl1, layoutParams, sparseArray);
        if (jl1 instanceof C32496Du1) {
            C32496Du1 c32496Du1 = (C32496Du1) jl1;
            int i = layoutParams.f53970Z;
            if (i != -1) {
                c32496Du1.m109765H2(i);
            }
        }
    }

    public void setFirstHorizontalBias(float f) {
        this.f53525m.m109732u2(f);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f53525m.m109731v2(i);
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f53525m.m109730w2(f);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f53525m.m109729x2(i);
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f53525m.m109728y2(i);
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f53525m.m109727z2(f);
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f53525m.m109772A2(i);
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f53525m.m109771B2(i);
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f53525m.m109770C2(f);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f53525m.m109769D2(i);
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f53525m.m109768E2(f);
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f53525m.m109767F2(i);
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f53525m.m109766G2(i);
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f53525m.m109765H2(i);
        requestLayout();
    }

    public void setPadding(int i) {
        this.f53525m.m129M1(i);
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f53525m.m128N1(i);
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f53525m.m126P1(i);
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f53525m.m125Q1(i);
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f53525m.m123S1(i);
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f53525m.m109764I2(i);
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f53525m.m109763J2(f);
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f53525m.m109762K2(i);
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f53525m.m109761L2(i);
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f53525m.m109760M2(i);
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: t */
    public void mo67887t(C43042iz0 c43042iz0, boolean z) {
        this.f53525m.m121x1(z);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
