package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: Jd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33748Jd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f17914a;

    /* renamed from: b */
    public final TextView f17915b;

    /* renamed from: c */
    public final TextView f17916c;

    public C33748Jd2(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f17914a = linearLayout;
        this.f17915b = textView;
        this.f17916c = textView2;
    }

    /* renamed from: a */
    public static C33748Jd2 m100100a(View view) {
        int i = C35658Rh4.description;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C35658Rh4.title;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C33748Jd2((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f17914a;
    }
}
