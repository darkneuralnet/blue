package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: b */
    public final int f52401b;

    /* renamed from: c */
    public final int f52402c;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52401b = getResources().getDimensionPixelOffset(C36108Tf4.browser_actions_context_menu_min_padding);
        this.f52402c = getResources().getDimensionPixelOffset(C36108Tf4.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f52401b * 2), this.f52402c), 1073741824), i2);
    }
}
