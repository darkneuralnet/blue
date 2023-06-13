package p000;

import android.view.View;
import android.widget.FrameLayout;
/* renamed from: Oe2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34927Oe2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f26975a;

    /* renamed from: b */
    public final C34121Ks6 f26976b;

    /* renamed from: c */
    public final C34355Ls6 f26977c;

    public C34927Oe2(FrameLayout frameLayout, C34121Ks6 c34121Ks6, C34355Ls6 c34355Ls6) {
        this.f26975a = frameLayout;
        this.f26976b = c34121Ks6;
        this.f26977c = c34355Ls6;
    }

    /* renamed from: a */
    public static C34927Oe2 m91764a(View view) {
        int i = C34722Nh4.viewPromotionCollapse;
        View m96312a = C34328Lp6.m96312a(view, i);
        if (m96312a != null) {
            C34121Ks6 m98206a = C34121Ks6.m98206a(m96312a);
            int i2 = C34722Nh4.viewPromotionExpanded;
            View m96312a2 = C34328Lp6.m96312a(view, i2);
            if (m96312a2 != null) {
                return new C34927Oe2((FrameLayout) view, m98206a, C34355Ls6.m96256a(m96312a2));
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f26975a;
    }
}
