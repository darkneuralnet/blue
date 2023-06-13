package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
/* renamed from: Js6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33887Js6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f18390a;

    /* renamed from: b */
    public final ProgressBar f18391b;

    /* renamed from: c */
    public final TextView f18392c;

    /* renamed from: d */
    public final TextView f18393d;

    public C33887Js6(View view, ProgressBar progressBar, TextView textView, TextView textView2) {
        this.f18390a = view;
        this.f18391b = progressBar;
        this.f18392c = textView;
        this.f18393d = textView2;
    }

    /* renamed from: a */
    public static C33887Js6 m99611a(View view) {
        int i = C47610qh4.progressBar;
        ProgressBar progressBar = (ProgressBar) C34328Lp6.m96312a(view, i);
        if (progressBar != null) {
            i = C47610qh4.subtitle;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C47610qh4.title;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C33887Js6(view, progressBar, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C33887Js6 m99610b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C39922dj4.view_progress_frequent_flyer, viewGroup);
            return m99611a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f18390a;
    }
}
