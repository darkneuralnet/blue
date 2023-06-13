package p000;

import android.view.View;
import android.widget.FrameLayout;
/* renamed from: Vq6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36677Vq6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f39842a;

    /* renamed from: b */
    public final FrameLayout f39843b;

    /* renamed from: c */
    public final C32258Ct6 f39844c;

    public C36677Vq6(FrameLayout frameLayout, FrameLayout frameLayout2, C32258Ct6 c32258Ct6) {
        this.f39842a = frameLayout;
        this.f39843b = frameLayout2;
        this.f39844c = c32258Ct6;
    }

    /* renamed from: a */
    public static C36677Vq6 m79345a(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = C36585Vg4.sideMenuBanner;
        View m96312a = C34328Lp6.m96312a(view, i);
        if (m96312a != null) {
            return new C36677Vq6(frameLayout, frameLayout, C32258Ct6.m111378a(m96312a));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f39842a;
    }
}
