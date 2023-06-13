package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
/* renamed from: Sp6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35966Sp6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f34298a;

    /* renamed from: b */
    public final AppCompatImageView f34299b;

    /* renamed from: c */
    public final TextView f34300c;

    /* renamed from: d */
    public final TextView f34301d;

    /* renamed from: e */
    public final TextView f34302e;

    /* renamed from: f */
    public final TextView f34303f;

    /* renamed from: g */
    public final AppCompatImageView f34304g;

    public C35966Sp6(LinearLayout linearLayout, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, AppCompatImageView appCompatImageView2) {
        this.f34298a = linearLayout;
        this.f34299b = appCompatImageView;
        this.f34300c = textView;
        this.f34301d = textView2;
        this.f34302e = textView3;
        this.f34303f = textView4;
        this.f34304g = appCompatImageView2;
    }

    /* renamed from: a */
    public static C35966Sp6 m84806a(View view) {
        int i = C52955zi4.bannerImage;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C34328Lp6.m96312a(view, i);
        if (appCompatImageView != null) {
            i = C52955zi4.bannerSubtitle;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C52955zi4.bannerTitle;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C52955zi4.callToAction;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        i = C52955zi4.callToActionBottom;
                        TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView4 != null) {
                            i = C52955zi4.xButton;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C34328Lp6.m96312a(view, i);
                            if (appCompatImageView2 != null) {
                                return new C35966Sp6((LinearLayout) view, appCompatImageView, textView, textView2, textView3, textView4, appCompatImageView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C35966Sp6 m84804c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45268mk4.view_call_to_action_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84806a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f34298a;
    }
}
