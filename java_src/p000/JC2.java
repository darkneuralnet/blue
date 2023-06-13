package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import co.bird.android.widget.CallToActionLayout;
/* renamed from: JC2 */
/* loaded from: classes2.dex */
public final class JC2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CallToActionLayout f16994a;

    /* renamed from: b */
    public final CallToActionLayout f16995b;

    /* renamed from: c */
    public final TextView f16996c;

    public JC2(CallToActionLayout callToActionLayout, CallToActionLayout callToActionLayout2, TextView textView) {
        this.f16994a = callToActionLayout;
        this.f16995b = callToActionLayout2;
        this.f16996c = textView;
    }

    /* renamed from: a */
    public static JC2 m101021a(View view) {
        CallToActionLayout callToActionLayout = (CallToActionLayout) view;
        int i = C36585Vg4.message;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            return new JC2(callToActionLayout, callToActionLayout, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static JC2 m101019c(LayoutInflater layoutInflater) {
        return m101018d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static JC2 m101018d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.longterm_setup_confirmed, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m101021a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CallToActionLayout getRoot() {
        return this.f16994a;
    }
}
