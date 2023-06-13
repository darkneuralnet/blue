package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: b */
    public boolean f52162b;

    /* renamed from: c */
    public boolean f52163c;

    /* renamed from: d */
    public int f52164d;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52164d = -1;
        int[] iArr = C43509jm4.ButtonBarLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C38790bq6.m62456t0(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f52162b = obtainStyledAttributes.getBoolean(C43509jm4.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            m69914c(this.f52162b);
        }
    }

    /* renamed from: a */
    public final int m69916a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public final boolean m69915b() {
        return this.f52163c;
    }

    /* renamed from: c */
    public final void m69914c(boolean z) {
        int i;
        int i2;
        if (this.f52163c != z) {
            if (!z || this.f52162b) {
                this.f52163c = z;
                setOrientation(z ? 1 : 0);
                if (z) {
                    i = 8388613;
                } else {
                    i = 80;
                }
                setGravity(i);
                View findViewById = findViewById(C39902dh4.spacer);
                if (findViewById != null) {
                    if (z) {
                        i2 = 8;
                    } else {
                        i2 = 4;
                    }
                    findViewById.setVisibility(i2);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        boolean z2;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f52162b) {
            if (size > this.f52164d && m69915b()) {
                m69914c(false);
            }
            this.f52164d = size;
        }
        if (!m69915b() && View.MeasureSpec.getMode(i) == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        } else {
            i3 = i;
            z = false;
        }
        super.onMeasure(i3, i2);
        if (this.f52162b && !m69915b()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                m69914c(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int m69916a = m69916a(0);
        if (m69916a >= 0) {
            View childAt = getChildAt(m69916a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m69915b()) {
                int m69916a2 = m69916a(m69916a + 1);
                if (m69916a2 >= 0) {
                    paddingTop += getChildAt(m69916a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i4 = paddingTop;
            } else {
                i4 = paddingTop + getPaddingBottom();
            }
        }
        if (C38790bq6.m62546E(this) != i4) {
            setMinimumHeight(i4);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f52162b != z) {
            this.f52162b = z;
            if (!z && m69915b()) {
                m69914c(false);
            }
            requestLayout();
        }
    }
}
