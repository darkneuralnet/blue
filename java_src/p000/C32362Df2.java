package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: Df2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32362Df2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f6162a;

    /* renamed from: b */
    public final TextView f6163b;

    /* renamed from: c */
    public final TextView f6164c;

    public C32362Df2(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f6162a = linearLayout;
        this.f6163b = textView;
        this.f6164c = textView2;
    }

    /* renamed from: a */
    public static C32362Df2 m110023a(View view) {
        int i = C39912di4.quantity;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C39912di4.title;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C32362Df2((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f6162a;
    }
}
