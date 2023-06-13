package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: og2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46412og2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f102303a;

    /* renamed from: b */
    public final TextView f102304b;

    /* renamed from: c */
    public final TextView f102305c;

    public C46412og2(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f102303a = linearLayout;
        this.f102304b = textView;
        this.f102305c = textView2;
    }

    /* renamed from: a */
    public static C46412og2 m20664a(View view) {
        int i = C44062ki4.detail;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C44062ki4.value;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C46412og2((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f102303a;
    }
}
