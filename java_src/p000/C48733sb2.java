package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: sb2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48733sb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f109022a;

    /* renamed from: b */
    public final TextView f109023b;

    /* renamed from: c */
    public final TextView f109024c;

    public C48733sb2(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f109022a = linearLayout;
        this.f109023b = textView;
        this.f109024c = textView2;
    }

    /* renamed from: a */
    public static C48733sb2 m13964a(View view) {
        int i = C37053Xg4.diagnosis;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C37053Xg4.time;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C48733sb2((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f109022a;
    }
}
