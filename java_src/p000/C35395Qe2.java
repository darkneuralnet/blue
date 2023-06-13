package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: Qe2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35395Qe2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f30681a;

    /* renamed from: b */
    public final TextView f30682b;

    /* renamed from: c */
    public final TextView f30683c;

    public C35395Qe2(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f30681a = linearLayout;
        this.f30682b = textView;
        this.f30683c = textView2;
    }

    /* renamed from: a */
    public static C35395Qe2 m88288a(View view) {
        int i = C51176wi4.description;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C51176wi4.status;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C35395Qe2((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f30681a;
    }
}
