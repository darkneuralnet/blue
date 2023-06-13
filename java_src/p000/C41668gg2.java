package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: gg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41668gg2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f84008a;

    /* renamed from: b */
    public final TextView f84009b;

    /* renamed from: c */
    public final TextView f84010c;

    public C41668gg2(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f84008a = linearLayout;
        this.f84009b = textView;
        this.f84010c = textView2;
    }

    /* renamed from: a */
    public static C41668gg2 m37913a(View view) {
        int i = C39912di4.header;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C39912di4.view;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C41668gg2((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f84008a;
    }
}
