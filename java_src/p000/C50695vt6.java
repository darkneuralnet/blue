package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import co.bird.android.widget.CountdownView;
/* renamed from: vt6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50695vt6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final RelativeLayout f114863a;

    /* renamed from: b */
    public final CountdownView f114864b;

    /* renamed from: c */
    public final AppCompatImageView f114865c;

    /* renamed from: d */
    public final TextView f114866d;

    public C50695vt6(RelativeLayout relativeLayout, CountdownView countdownView, AppCompatImageView appCompatImageView, TextView textView) {
        this.f114863a = relativeLayout;
        this.f114864b = countdownView;
        this.f114865c = appCompatImageView;
        this.f114866d = textView;
    }

    /* renamed from: a */
    public static C50695vt6 m7850a(View view) {
        int i = C52955zi4.countDown;
        CountdownView countdownView = (CountdownView) C34328Lp6.m96312a(view, i);
        if (countdownView != null) {
            i = C52955zi4.icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C34328Lp6.m96312a(view, i);
            if (appCompatImageView != null) {
                i = C52955zi4.instructions;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    return new C50695vt6((RelativeLayout) view, countdownView, appCompatImageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C50695vt6 m7848c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C45268mk4.view_ride_start_in_bad_area_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m7850a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public RelativeLayout getRoot() {
        return this.f114863a;
    }
}
