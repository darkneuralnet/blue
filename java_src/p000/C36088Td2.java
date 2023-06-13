package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: Td2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36088Td2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f35801a;

    /* renamed from: b */
    public final TextView f35802b;

    /* renamed from: c */
    public final View f35803c;

    /* renamed from: d */
    public final TextView f35804d;

    public C36088Td2(LinearLayout linearLayout, TextView textView, View view, TextView textView2) {
        this.f35801a = linearLayout;
        this.f35802b = textView;
        this.f35803c = view;
        this.f35804d = textView2;
    }

    /* renamed from: a */
    public static C36088Td2 m83252a(View view) {
        View m96312a;
        int i = C39912di4.date;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null && (m96312a = C34328Lp6.m96312a(view, (i = C39912di4.divider))) != null) {
            i = C39912di4.time;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C36088Td2((LinearLayout) view, textView, m96312a, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f35801a;
    }
}
