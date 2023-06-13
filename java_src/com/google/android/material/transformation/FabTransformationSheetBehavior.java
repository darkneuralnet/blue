package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
@Deprecated
/* loaded from: classes6.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    public Map<View, Integer> f73698i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: A */
    public FabTransformationBehavior.C17957e mo48472A(Context context, boolean z) {
        int i;
        if (z) {
            i = C41067ff4.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = C41067ff4.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.C17957e c17957e = new FabTransformationBehavior.C17957e();
        c17957e.f73691a = YV2.m74982d(context, i);
        c17957e.f73692b = new EY3(17, 0.0f, 0.0f);
        return c17957e;
    }

    /* renamed from: C */
    public final void m48471C(View view, boolean z) {
        boolean z2;
        ViewParent parent = view.getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z) {
            this.f73698i = new HashMap(childCount);
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if ((childAt.getLayoutParams() instanceof CoordinatorLayout.C11529e) && (((CoordinatorLayout.C11529e) childAt.getLayoutParams()).m67769f() instanceof FabTransformationScrimBehavior)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (childAt != view && !z2) {
                if (!z) {
                    Map<View, Integer> map = this.f73698i;
                    if (map != null && map.containsKey(childAt)) {
                        C38790bq6.m62539H0(childAt, this.f73698i.get(childAt).intValue());
                    }
                } else {
                    this.f73698i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    C38790bq6.m62539H0(childAt, 4);
                }
            }
        }
        if (!z) {
            this.f73698i = null;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: d */
    public boolean mo48470d(View view, View view2, boolean z, boolean z2) {
        m48471C(view2, z);
        return super.mo48470d(view, view2, z, z2);
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
