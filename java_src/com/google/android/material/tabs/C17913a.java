package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
/* renamed from: com.google.android.material.tabs.a */
/* loaded from: classes6.dex */
public class C17913a {
    /* renamed from: a */
    public static RectF m48702a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.m48807K() && (view instanceof TabLayout.TabView)) {
            return m48701b((TabLayout.TabView) view, 24);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: b */
    public static RectF m48701b(TabLayout.TabView tabView, int i) {
        int m48750l = tabView.m48750l();
        int m48751k = tabView.m48751k();
        int m79303e = (int) C36704Vt6.m79303e(tabView.getContext(), i);
        if (m48750l < m79303e) {
            m48750l = m79303e;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i2 = m48750l / 2;
        return new RectF(left - i2, top - (m48751k / 2), i2 + left, top + (left / 2));
    }

    /* renamed from: c */
    public void m48700c(TabLayout tabLayout, View view, Drawable drawable) {
        RectF m48702a = m48702a(tabLayout, view);
        drawable.setBounds((int) m48702a.left, drawable.getBounds().top, (int) m48702a.right, drawable.getBounds().bottom);
    }

    /* renamed from: d */
    public void mo2784d(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF m48702a = m48702a(tabLayout, view);
        RectF m48702a2 = m48702a(tabLayout, view2);
        drawable.setBounds(C27325pf.m19013c((int) m48702a.left, (int) m48702a2.left, f), drawable.getBounds().top, C27325pf.m19013c((int) m48702a.right, (int) m48702a2.right, f), drawable.getBounds().bottom);
    }
}
