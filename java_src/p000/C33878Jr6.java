package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
/* renamed from: Jr6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33878Jr6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f18354a;

    /* renamed from: b */
    public final AppCompatImageView f18355b;

    /* renamed from: c */
    public final AppCompatImageView f18356c;

    /* renamed from: d */
    public final AppCompatImageView f18357d;

    /* renamed from: e */
    public final AppCompatImageView f18358e;

    /* renamed from: f */
    public final AppCompatImageView f18359f;

    public C33878Jr6(View view, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5) {
        this.f18354a = view;
        this.f18355b = appCompatImageView;
        this.f18356c = appCompatImageView2;
        this.f18357d = appCompatImageView3;
        this.f18358e = appCompatImageView4;
        this.f18359f = appCompatImageView5;
    }

    /* renamed from: a */
    public static C33878Jr6 m99621a(View view) {
        int i = C31680Ah4.badgeBg;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C34328Lp6.m96312a(view, i);
        if (appCompatImageView != null) {
            i = C31680Ah4.badgeContent;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C34328Lp6.m96312a(view, i);
            if (appCompatImageView2 != null) {
                i = C31680Ah4.badgeInnerBg;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) C34328Lp6.m96312a(view, i);
                if (appCompatImageView3 != null) {
                    i = C31680Ah4.badgeOuter;
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) C34328Lp6.m96312a(view, i);
                    if (appCompatImageView4 != null) {
                        i = C31680Ah4.badgeShadow;
                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) C34328Lp6.m96312a(view, i);
                        if (appCompatImageView5 != null) {
                            return new C33878Jr6(view, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C33878Jr6 m99620b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45258mj4.view_layered_badge_view, viewGroup);
            return m99621a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f18354a;
    }
}
