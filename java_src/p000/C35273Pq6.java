package p000;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.CountdownView;
/* renamed from: Pq6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C35273Pq6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f29150a;

    /* renamed from: b */
    public final TextView f29151b;

    /* renamed from: c */
    public final CountdownView f29152c;

    /* renamed from: d */
    public final AppCompatImageView f29153d;

    public C35273Pq6(ConstraintLayout constraintLayout, TextView textView, CountdownView countdownView, AppCompatImageView appCompatImageView) {
        this.f29150a = constraintLayout;
        this.f29151b = textView;
        this.f29152c = countdownView;
        this.f29153d = appCompatImageView;
    }

    /* renamed from: a */
    public static C35273Pq6 m89704a(View view) {
        int i = C36585Vg4.couponTitle;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.expirationCountDown;
            CountdownView countdownView = (CountdownView) C34328Lp6.m96312a(view, i);
            if (countdownView != null) {
                i = C36585Vg4.icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C34328Lp6.m96312a(view, i);
                if (appCompatImageView != null) {
                    return new C35273Pq6((ConstraintLayout) view, textView, countdownView, appCompatImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f29150a;
    }
}
