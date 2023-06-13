package co.bird.android.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
/* loaded from: classes4.dex */
public class ScrollAwareBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a */
    public int f67801a;

    public ScrollAwareBehavior(Context context, AttributeSet attributeSet) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16843499, typedValue, true)) {
            this.f67801a = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof AppBarLayout;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view2 instanceof AppBarLayout) {
            int height = view.getHeight() + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C11529e) view.getLayoutParams())).bottomMargin;
            view.animate().translationY((-height) * (view2.getY() / this.f67801a)).setDuration(500L).setInterpolator(new OvershootInterpolator()).start();
            return true;
        }
        return true;
    }
}
