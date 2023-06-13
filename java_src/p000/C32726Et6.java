package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import co.bird.android.widget.BannerView;
import co.bird.android.widget.PillDropdownButton;
/* renamed from: Et6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32726Et6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f8272a;

    /* renamed from: b */
    public final Space f8273b;

    /* renamed from: c */
    public final BannerView f8274c;

    /* renamed from: d */
    public final PillDropdownButton f8275d;

    /* renamed from: e */
    public final C41328g56 f8276e;

    public C32726Et6(View view, Space space, BannerView bannerView, PillDropdownButton pillDropdownButton, C41328g56 c41328g56) {
        this.f8272a = view;
        this.f8273b = space;
        this.f8274c = bannerView;
        this.f8275d = pillDropdownButton;
        this.f8276e = c41328g56;
    }

    /* renamed from: a */
    public static C32726Et6 m108251a(View view) {
        View m96312a;
        int i = C52955zi4.bannerPlaceholder;
        Space space = (Space) C34328Lp6.m96312a(view, i);
        if (space != null) {
            i = C52955zi4.bannerView;
            BannerView bannerView = (BannerView) C34328Lp6.m96312a(view, i);
            if (bannerView != null) {
                i = C52955zi4.profileDropdown;
                PillDropdownButton pillDropdownButton = (PillDropdownButton) C34328Lp6.m96312a(view, i);
                if (pillDropdownButton != null && (m96312a = C34328Lp6.m96312a(view, (i = C52955zi4.toastMessage))) != null) {
                    return new C32726Et6(view, space, bannerView, pillDropdownButton, C41328g56.m40078a(m96312a));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C32726Et6 m108250b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45268mk4.view_single_banner_flight, viewGroup);
            return m108251a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f8272a;
    }
}
