package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import co.bird.android.widget.CallToActionLayout;
/* renamed from: KC2 */
/* loaded from: classes2.dex */
public final class KC2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CallToActionLayout f19272a;

    /* renamed from: b */
    public final CallToActionLayout f19273b;

    /* renamed from: c */
    public final TextView f19274c;

    /* renamed from: d */
    public final ImageView f19275d;

    /* renamed from: e */
    public final LinearLayout f19276e;

    public KC2(CallToActionLayout callToActionLayout, CallToActionLayout callToActionLayout2, TextView textView, ImageView imageView, LinearLayout linearLayout) {
        this.f19272a = callToActionLayout;
        this.f19273b = callToActionLayout2;
        this.f19274c = textView;
        this.f19275d = imageView;
        this.f19276e = linearLayout;
    }

    /* renamed from: a */
    public static KC2 m99088a(View view) {
        CallToActionLayout callToActionLayout = (CallToActionLayout) view;
        int i = C36585Vg4.header;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.introHeaderBanner;
            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
            if (imageView != null) {
                i = C36585Vg4.productPoints;
                LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                if (linearLayout != null) {
                    return new KC2(callToActionLayout, callToActionLayout, textView, imageView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static KC2 m99086c(LayoutInflater layoutInflater) {
        return m99085d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static KC2 m99085d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.longterm_setup_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m99088a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CallToActionLayout getRoot() {
        return this.f19272a;
    }
}
