package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import co.bird.android.widget.CountdownView;
/* renamed from: Pp6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35264Pp6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f29124a;

    /* renamed from: b */
    public final CountdownView f29125b;

    /* renamed from: c */
    public final TextView f29126c;

    /* renamed from: d */
    public final LinearLayout f29127d;

    /* renamed from: e */
    public final TextView f29128e;

    /* renamed from: f */
    public final AppCompatImageView f29129f;

    public C35264Pp6(View view, CountdownView countdownView, TextView textView, LinearLayout linearLayout, TextView textView2, AppCompatImageView appCompatImageView) {
        this.f29124a = view;
        this.f29125b = countdownView;
        this.f29126c = textView;
        this.f29127d = linearLayout;
        this.f29128e = textView2;
        this.f29129f = appCompatImageView;
    }

    /* renamed from: a */
    public static C35264Pp6 m89721a(View view) {
        int i = C52955zi4.countDown;
        CountdownView countdownView = (CountdownView) C34328Lp6.m96312a(view, i);
        if (countdownView != null) {
            i = C52955zi4.dealSubtitle;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C52955zi4.dealText;
                LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                if (linearLayout != null) {
                    i = C52955zi4.dealTitle;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        i = C52955zi4.icon;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) C34328Lp6.m96312a(view, i);
                        if (appCompatImageView != null) {
                            return new C35264Pp6(view, countdownView, textView, linearLayout, textView2, appCompatImageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C35264Pp6 m89720b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45268mk4.view_bonus_banner, viewGroup);
            return m89721a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f29124a;
    }
}
