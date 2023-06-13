package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.C17913a;
import com.google.android.material.tabs.TabLayout;
/* renamed from: yj1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C52369yj1 extends C17913a {
    @Override // com.google.android.material.tabs.C17913a
    /* renamed from: d */
    public void mo2784d(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float m19014b;
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        if (i >= 0) {
            view = view2;
        }
        RectF m48702a = C17913a.m48702a(tabLayout, view);
        if (i < 0) {
            m19014b = C27325pf.m19014b(1.0f, 0.0f, 0.0f, 0.5f, f);
        } else {
            m19014b = C27325pf.m19014b(0.0f, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) m48702a.left, drawable.getBounds().top, (int) m48702a.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (m19014b * 255.0f));
    }
}
