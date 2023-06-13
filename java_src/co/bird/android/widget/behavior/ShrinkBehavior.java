package co.bird.android.widget.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;
/* loaded from: classes4.dex */
public class ShrinkBehavior extends CoordinatorLayout.Behavior<FloatingActionButton> {
    public ShrinkBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: a */
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
        return view instanceof Snackbar.SnackbarLayout;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: b */
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
        float height = 1.0f - ((-m54232c(coordinatorLayout, floatingActionButton)) / view.getHeight());
        floatingActionButton.setScaleX(height);
        floatingActionButton.setScaleY(height);
        return false;
    }

    /* renamed from: c */
    public final float m54232c(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
        List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
        int size = dependencies.size();
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            View view = dependencies.get(i);
            if ((view instanceof Snackbar.SnackbarLayout) && coordinatorLayout.doViewsOverlap(floatingActionButton, view)) {
                f = Math.min(f, C38790bq6.m62526O(view) - view.getHeight());
            }
        }
        return f;
    }

    public ShrinkBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
