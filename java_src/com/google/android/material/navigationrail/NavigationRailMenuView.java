package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
/* loaded from: classes6.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {

    /* renamed from: G */
    public int f73130G;

    /* renamed from: H */
    public final FrameLayout.LayoutParams f73131H;

    public NavigationRailMenuView(Context context) {
        super(context);
        this.f73130G = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f73131H = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        m49329s(true);
    }

    /* renamed from: A */
    public void m49286A(int i) {
        FrameLayout.LayoutParams layoutParams = this.f73131H;
        if (layoutParams.gravity != i) {
            layoutParams.gravity = i;
            setLayoutParams(layoutParams);
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    /* renamed from: g */
    public NavigationBarItemView mo49285g(Context context) {
        return new X03(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                childAt.layout(0, i6, i5, measuredHeight);
                i6 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int m49281y;
        int size = View.MeasureSpec.getSize(i2);
        int size2 = m49338j().m70168G().size();
        if (size2 > 1 && m49334n(m49339i(), size2)) {
            m49281y = m49280z(i, size, size2);
        } else {
            m49281y = m49281y(i, size, size2, null);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.resolveSizeAndState(m49281y, i2, 0));
    }

    public void setItemMinimumHeight(int i) {
        if (this.f73130G != i) {
            this.f73130G = i;
            requestLayout();
        }
    }

    /* renamed from: v */
    public boolean m49284v() {
        return (this.f73131H.gravity & 112) == 48;
    }

    /* renamed from: w */
    public final int m49283w(int i, int i2, int i3) {
        int max = i2 / Math.max(1, i3);
        int i4 = this.f73130G;
        if (i4 == -1) {
            i4 = View.MeasureSpec.getSize(i);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(i4, max), 0);
    }

    /* renamed from: x */
    public final int m49282x(View view, int i, int i2) {
        if (view.getVisibility() != 8) {
            view.measure(i, i2);
            return view.getMeasuredHeight();
        }
        return 0;
    }

    /* renamed from: y */
    public final int m49281y(int i, int i2, int i3, View view) {
        int makeMeasureSpec;
        if (view == null) {
            makeMeasureSpec = m49283w(i, i2, i3);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != view) {
                i4 += m49282x(childAt, i, makeMeasureSpec);
            }
        }
        return i4;
    }

    /* renamed from: z */
    public final int m49280z(int i, int i2, int i3) {
        int i4;
        View childAt = getChildAt(m49335m());
        if (childAt != null) {
            i4 = m49282x(childAt, i, m49283w(i, i2, i3));
            i2 -= i4;
            i3--;
        } else {
            i4 = 0;
        }
        return i4 + m49281y(i, i2, i3, childAt);
    }
}
