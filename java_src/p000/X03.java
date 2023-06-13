package p000;

import android.content.Context;
import android.view.View;
import com.google.android.material.navigation.NavigationBarItemView;
/* renamed from: X03 */
/* loaded from: classes6.dex */
public final class X03 extends NavigationBarItemView {
    public X03(Context context) {
        super(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    /* renamed from: o */
    public int mo49362o() {
        return C35172Pf4.mtrl_navigation_rail_icon_margin;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)));
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    /* renamed from: p */
    public int mo49361p() {
        return C50603vk4.mtrl_navigation_rail_item;
    }
}
