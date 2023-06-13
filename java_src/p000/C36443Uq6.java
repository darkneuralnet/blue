package p000;

import android.view.View;
import android.widget.FrameLayout;
/* renamed from: Uq6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36443Uq6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f38108a;

    /* renamed from: b */
    public final FrameLayout f38109b;

    /* renamed from: c */
    public final C32492Dt6 f38110c;

    public C36443Uq6(FrameLayout frameLayout, FrameLayout frameLayout2, C32492Dt6 c32492Dt6) {
        this.f38108a = frameLayout;
        this.f38109b = frameLayout2;
        this.f38110c = c32492Dt6;
    }

    /* renamed from: a */
    public static C36443Uq6 m80762a(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i = C50583vi4.sideMenuBanner;
        View m96312a = C34328Lp6.m96312a(view, i);
        if (m96312a != null) {
            return new C36443Uq6(frameLayout, frameLayout, C32492Dt6.m109802a(m96312a));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f38108a;
    }
}
