package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/* renamed from: Bs6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32015Bs6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f2986a;

    /* renamed from: b */
    public final TextView f2987b;

    public C32015Bs6(View view, TextView textView) {
        this.f2986a = view;
        this.f2987b = textView;
    }

    /* renamed from: a */
    public static C32015Bs6 m113422a(View view) {
        int i = C52955zi4.parkingBannerText;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            return new C32015Bs6(view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C32015Bs6 m113421b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45268mk4.view_parking_banner, viewGroup);
            return m113422a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f2986a;
    }
}
