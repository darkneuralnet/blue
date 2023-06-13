package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: dc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39850dc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f76874a;

    /* renamed from: b */
    public final TextView f76875b;

    /* renamed from: c */
    public final TextView f76876c;

    public C39850dc2(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f76874a = linearLayout;
        this.f76875b = textView;
        this.f76876c = textView2;
    }

    /* renamed from: a */
    public static C39850dc2 m44023a(View view) {
        int i = C46434oi4.detail;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C46434oi4.title;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C39850dc2((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f76874a;
    }
}
