package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: df2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39880df2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f77012a;

    /* renamed from: b */
    public final TextView f77013b;

    /* renamed from: c */
    public final TextView f77014c;

    public C39880df2(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f77012a = linearLayout;
        this.f77013b = textView;
        this.f77014c = textView2;
    }

    /* renamed from: a */
    public static C39880df2 m43930a(View view) {
        int i = C35658Rh4.details;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C35658Rh4.title;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C39880df2((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f77012a;
    }
}
