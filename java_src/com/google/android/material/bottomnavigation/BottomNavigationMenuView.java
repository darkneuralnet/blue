package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C11028e;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public class BottomNavigationMenuView extends NavigationBarMenuView {

    /* renamed from: G */
    public final int f72345G;

    /* renamed from: H */
    public final int f72346H;

    /* renamed from: I */
    public final int f72347I;

    /* renamed from: J */
    public final int f72348J;

    /* renamed from: K */
    public boolean f72349K;

    /* renamed from: P */
    public final List<Integer> f72350P;

    public BottomNavigationMenuView(Context context) {
        super(context);
        this.f72350P = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f72345G = resources.getDimensionPixelSize(C35172Pf4.design_bottom_navigation_item_max_width);
        this.f72346H = resources.getDimensionPixelSize(C35172Pf4.design_bottom_navigation_item_min_width);
        this.f72347I = resources.getDimensionPixelSize(C35172Pf4.design_bottom_navigation_active_item_max_width);
        this.f72348J = resources.getDimensionPixelSize(C35172Pf4.design_bottom_navigation_active_item_min_width);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    /* renamed from: g */
    public NavigationBarItemView mo49285g(Context context) {
        return new BottomNavigationItemView(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (C38790bq6.m62548D(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        C11028e m49338j = m49338j();
        int size = View.MeasureSpec.getSize(i);
        int size2 = m49338j.m70168G().size();
        int childCount = getChildCount();
        this.f72350P.clear();
        int size3 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        int i6 = 1;
        if (m49334n(m49339i(), size2) && m50147v()) {
            View childAt = getChildAt(m49335m());
            int i7 = this.f72348J;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f72347I, Integer.MIN_VALUE), makeMeasureSpec);
                i7 = Math.max(i7, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            int i8 = size2 - i4;
            int min = Math.min(size - (this.f72346H * i8), Math.min(i7, this.f72347I));
            int i9 = size - min;
            if (i8 != 0) {
                i6 = i8;
            }
            int min2 = Math.min(i9 / i6, this.f72345G);
            int i10 = i9 - (i8 * min2);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (getChildAt(i11).getVisibility() != 8) {
                    if (i11 == m49335m()) {
                        i5 = min;
                    } else {
                        i5 = min2;
                    }
                    if (i10 > 0) {
                        i5++;
                        i10--;
                    }
                } else {
                    i5 = 0;
                }
                this.f72350P.add(Integer.valueOf(i5));
            }
        } else {
            if (size2 != 0) {
                i6 = size2;
            }
            int min3 = Math.min(size / i6, this.f72347I);
            int i12 = size - (size2 * min3);
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).getVisibility() != 8) {
                    if (i12 > 0) {
                        i3 = min3 + 1;
                        i12--;
                    } else {
                        i3 = min3;
                    }
                } else {
                    i3 = 0;
                }
                this.f72350P.add(Integer.valueOf(i3));
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f72350P.get(i15).intValue(), 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i14 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(i14, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f72349K = z;
    }

    /* renamed from: v */
    public boolean m50147v() {
        return this.f72349K;
    }
}
