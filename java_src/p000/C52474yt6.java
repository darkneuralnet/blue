package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
/* renamed from: yt6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52474yt6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f120371a;

    /* renamed from: b */
    public final TextView f120372b;

    /* renamed from: c */
    public final ProgressBar f120373c;

    public C52474yt6(View view, TextView textView, ProgressBar progressBar) {
        this.f120371a = view;
        this.f120372b = textView;
        this.f120373c = progressBar;
    }

    /* renamed from: a */
    public static C52474yt6 m2321a(View view) {
        int i = C52955zi4.message;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C52955zi4.statusBar;
            ProgressBar progressBar = (ProgressBar) C34328Lp6.m96312a(view, i);
            if (progressBar != null) {
                return new C52474yt6(view, textView, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C52474yt6 m2320b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C45268mk4.view_scanner_frequent_flyer, viewGroup);
            return m2321a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f120371a;
    }
}
