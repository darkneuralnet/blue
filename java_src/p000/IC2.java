package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import co.bird.android.widget.CallToActionLayout;
/* renamed from: IC2 */
/* loaded from: classes2.dex */
public final class IC2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CallToActionLayout f14806a;

    /* renamed from: b */
    public final CallToActionLayout f14807b;

    /* renamed from: c */
    public final TextView f14808c;

    public IC2(CallToActionLayout callToActionLayout, CallToActionLayout callToActionLayout2, TextView textView) {
        this.f14806a = callToActionLayout;
        this.f14807b = callToActionLayout2;
        this.f14808c = textView;
    }

    /* renamed from: a */
    public static IC2 m102786a(View view) {
        CallToActionLayout callToActionLayout = (CallToActionLayout) view;
        int i = C36585Vg4.message;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            return new IC2(callToActionLayout, callToActionLayout, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static IC2 m102784c(LayoutInflater layoutInflater) {
        return m102783d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static IC2 m102783d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.longterm_pickup_setup_confirmed, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m102786a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CallToActionLayout getRoot() {
        return this.f14806a;
    }
}
