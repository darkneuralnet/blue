package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: Pa2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35125Pa2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f28707a;

    /* renamed from: b */
    public final TextView f28708b;

    /* renamed from: c */
    public final TextView f28709c;

    public C35125Pa2(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f28707a = linearLayout;
        this.f28708b = textView;
        this.f28709c = textView2;
    }

    /* renamed from: a */
    public static C35125Pa2 m90083a(View view) {
        int i = C38105ah4.subtitle;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C38105ah4.title;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C35125Pa2((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f28707a;
    }
}
