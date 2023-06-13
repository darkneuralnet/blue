package co.bird.android.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: classes4.dex */
public class QuickReturnBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a */
    public int f67800a;

    public QuickReturnBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void m54236a(View view) {
        view.setVisibility(8);
    }

    /* renamed from: b */
    public final void m54235b(View view) {
        view.setVisibility(0);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
        int i3;
        if ((i2 > 0 && this.f67800a < 0) || (i2 < 0 && this.f67800a > 0)) {
            view.animate().cancel();
            this.f67800a = 0;
        }
        this.f67800a += i2;
        if (view.getHeight() > 0) {
            i3 = view.getHeight();
        } else {
            i3 = 600;
        }
        if (this.f67800a > i3 && view.isShown()) {
            m54236a(view);
        } else if (this.f67800a < 0 && !view.isShown()) {
            m54235b(view);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        return (i & 2) != 0;
    }
}
