package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: classes6.dex */
class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private int tempLeftRightOffset;
    private int tempTopBottomOffset;
    private C38217as6 viewOffsetHelper;

    public ViewOffsetBehavior() {
        this.tempTopBottomOffset = 0;
        this.tempLeftRightOffset = 0;
    }

    public int getLeftAndRightOffset() {
        C38217as6 c38217as6 = this.viewOffsetHelper;
        if (c38217as6 != null) {
            return c38217as6.m65348c();
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        C38217as6 c38217as6 = this.viewOffsetHelper;
        if (c38217as6 != null) {
            return c38217as6.m65347d();
        }
        return 0;
    }

    public boolean isHorizontalOffsetEnabled() {
        C38217as6 c38217as6 = this.viewOffsetHelper;
        return c38217as6 != null && c38217as6.m65346e();
    }

    public boolean isVerticalOffsetEnabled() {
        C38217as6 c38217as6 = this.viewOffsetHelper;
        return c38217as6 != null && c38217as6.m65345f();
    }

    public void layoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.onLayoutChild(v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        layoutChild(coordinatorLayout, v, i);
        if (this.viewOffsetHelper == null) {
            this.viewOffsetHelper = new C38217as6(v);
        }
        this.viewOffsetHelper.m65344g();
        this.viewOffsetHelper.m65350a();
        int i2 = this.tempTopBottomOffset;
        if (i2 != 0) {
            this.viewOffsetHelper.m65341j(i2);
            this.tempTopBottomOffset = 0;
        }
        int i3 = this.tempLeftRightOffset;
        if (i3 != 0) {
            this.viewOffsetHelper.m65342i(i3);
            this.tempLeftRightOffset = 0;
            return true;
        }
        return true;
    }

    public void setHorizontalOffsetEnabled(boolean z) {
        C38217as6 c38217as6 = this.viewOffsetHelper;
        if (c38217as6 != null) {
            c38217as6.m65343h(z);
        }
    }

    public boolean setLeftAndRightOffset(int i) {
        C38217as6 c38217as6 = this.viewOffsetHelper;
        if (c38217as6 != null) {
            return c38217as6.m65342i(i);
        }
        this.tempLeftRightOffset = i;
        return false;
    }

    public boolean setTopAndBottomOffset(int i) {
        C38217as6 c38217as6 = this.viewOffsetHelper;
        if (c38217as6 != null) {
            return c38217as6.m65341j(i);
        }
        this.tempTopBottomOffset = i;
        return false;
    }

    public void setVerticalOffsetEnabled(boolean z) {
        C38217as6 c38217as6 = this.viewOffsetHelper;
        if (c38217as6 != null) {
            c38217as6.m65340k(z);
        }
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tempTopBottomOffset = 0;
        this.tempLeftRightOffset = 0;
    }
}
