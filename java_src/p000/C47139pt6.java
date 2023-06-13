package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/* renamed from: pt6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47139pt6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f104227a;

    /* renamed from: b */
    public final TextView f104228b;

    /* renamed from: c */
    public final TextView f104229c;

    /* renamed from: d */
    public final TextView f104230d;

    /* renamed from: e */
    public final TextView f104231e;

    public C47139pt6(View view, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f104227a = view;
        this.f104228b = textView;
        this.f104229c = textView2;
        this.f104230d = textView3;
        this.f104231e = textView4;
    }

    /* renamed from: a */
    public static C47139pt6 m18558a(View view) {
        int i = C36585Vg4.lastLocated;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.lastRidden;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C36585Vg4.status;
                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView3 != null) {
                    i = C36585Vg4.statusTitle;
                    TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView4 != null) {
                        return new C47139pt6(view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C47139pt6 m18557b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C39311cj4.view_ridden_located, viewGroup);
            return m18558a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f104227a;
    }
}
