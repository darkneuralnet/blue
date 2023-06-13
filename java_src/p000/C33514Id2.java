package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: Id2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33514Id2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f15953a;

    /* renamed from: b */
    public final TextView f15954b;

    /* renamed from: c */
    public final TextView f15955c;

    public C33514Id2(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f15953a = linearLayout;
        this.f15954b = textView;
        this.f15955c = textView2;
    }

    /* renamed from: a */
    public static C33514Id2 m101876a(View view) {
        int i = C35658Rh4.description;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C35658Rh4.nonRepair;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C33514Id2((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f15953a;
    }
}
