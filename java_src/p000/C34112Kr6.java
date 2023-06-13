package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
/* renamed from: Kr6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34112Kr6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f20285a;

    /* renamed from: b */
    public final ProgressBar f20286b;

    /* renamed from: c */
    public final TextView f20287c;

    /* renamed from: d */
    public final TextView f20288d;

    public C34112Kr6(View view, ProgressBar progressBar, TextView textView, TextView textView2) {
        this.f20285a = view;
        this.f20286b = progressBar;
        this.f20287c = textView;
        this.f20288d = textView2;
    }

    /* renamed from: a */
    public static C34112Kr6 m98227a(View view) {
        int i = C47610qh4.progressBar;
        ProgressBar progressBar = (ProgressBar) C34328Lp6.m96312a(view, i);
        if (progressBar != null) {
            i = C47610qh4.subtitle;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C47610qh4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C34112Kr6(view, progressBar, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C34112Kr6 m98226b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C39922dj4.view_left_nav_frequent_flyer, viewGroup);
            return m98227a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f20285a;
    }
}
