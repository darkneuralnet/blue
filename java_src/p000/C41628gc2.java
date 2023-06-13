package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: gc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41628gc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f83942a;

    /* renamed from: b */
    public final TextView f83943b;

    /* renamed from: c */
    public final TextView f83944c;

    public C41628gc2(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f83942a = linearLayout;
        this.f83943b = textView;
        this.f83944c = textView2;
    }

    /* renamed from: a */
    public static C41628gc2 m37980a(View view) {
        int i = C47610qh4.faq;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C47610qh4.terms;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C41628gc2((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f83942a;
    }
}
