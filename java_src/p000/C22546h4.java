package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: h4 */
/* loaded from: classes3.dex */
public final class C22546h4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f84674a;

    /* renamed from: b */
    public final ProgressBar f84675b;

    public C22546h4(ConstraintLayout constraintLayout, ProgressBar progressBar) {
        this.f84674a = constraintLayout;
        this.f84675b = progressBar;
    }

    /* renamed from: a */
    public static C22546h4 m36872a(View view) {
        int i = C34956Oh4.loading;
        ProgressBar progressBar = (ProgressBar) C34328Lp6.m96312a(view, i);
        if (progressBar != null) {
            return new C22546h4((ConstraintLayout) view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C22546h4 m36870c(LayoutInflater layoutInflater) {
        return m36869d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C22546h4 m36869d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31932Bj4.activity_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36872a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f84674a;
    }
}
