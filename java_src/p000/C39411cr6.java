package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import co.bird.android.widget.BannerView;
import co.bird.android.widget.CallToActionBanner;
/* renamed from: cr6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39411cr6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f75729a;

    /* renamed from: b */
    public final BannerView f75730b;

    /* renamed from: c */
    public final CallToActionBanner f75731c;

    /* renamed from: d */
    public final C38227at6 f75732d;

    /* renamed from: e */
    public final C34130Kt6 f75733e;

    /* renamed from: f */
    public final C41328g56 f75734f;

    public C39411cr6(View view, BannerView bannerView, CallToActionBanner callToActionBanner, C38227at6 c38227at6, C34130Kt6 c34130Kt6, C41328g56 c41328g56) {
        this.f75729a = view;
        this.f75730b = bannerView;
        this.f75731c = callToActionBanner;
        this.f75732d = c38227at6;
        this.f75733e = c34130Kt6;
        this.f75734f = c41328g56;
    }

    /* renamed from: a */
    public static C39411cr6 m44965a(View view) {
        View m96312a;
        int i = C52955zi4.bannerView;
        BannerView bannerView = (BannerView) C34328Lp6.m96312a(view, i);
        if (bannerView != null) {
            i = C52955zi4.callToActionBanner;
            CallToActionBanner callToActionBanner = (CallToActionBanner) C34328Lp6.m96312a(view, i);
            if (callToActionBanner != null && (m96312a = C34328Lp6.m96312a(view, (i = C52955zi4.releaseLocationBar))) != null) {
                C38227at6 m65323a = C38227at6.m65323a(m96312a);
                i = C52955zi4.taskReminderBar;
                View m96312a2 = C34328Lp6.m96312a(view, i);
                if (m96312a2 != null) {
                    C34130Kt6 m98200a = C34130Kt6.m98200a(m96312a2);
                    i = C52955zi4.toastMessage;
                    View m96312a3 = C34328Lp6.m96312a(view, i);
                    if (m96312a3 != null) {
                        return new C39411cr6(view, bannerView, callToActionBanner, m65323a, m98200a, C41328g56.m40078a(m96312a3));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C39411cr6 m44964b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45268mk4.view_flight, viewGroup);
            return m44965a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f75729a;
    }
}
