package p000;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.C17913a;
import com.google.android.material.tabs.TabLayout;
/* renamed from: aa1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C38032aa1 extends C17913a {
    /* renamed from: e */
    public static float m71210e(float f) {
        return (float) (1.0d - Math.cos((f * 3.141592653589793d) / 2.0d));
    }

    /* renamed from: f */
    public static float m71209f(float f) {
        return (float) Math.sin((f * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.C17913a
    /* renamed from: d */
    public void mo2784d(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        boolean z;
        float m71209f;
        float m71210e;
        RectF m48702a = C17913a.m48702a(tabLayout, view);
        RectF m48702a2 = C17913a.m48702a(tabLayout, view2);
        if (m48702a.left < m48702a2.left) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m71209f = m71210e(f);
            m71210e = m71209f(f);
        } else {
            m71209f = m71209f(f);
            m71210e = m71210e(f);
        }
        drawable.setBounds(C27325pf.m19013c((int) m48702a.left, (int) m48702a2.left, m71209f), drawable.getBounds().top, C27325pf.m19013c((int) m48702a.right, (int) m48702a2.right, m71210e), drawable.getBounds().bottom);
    }
}
