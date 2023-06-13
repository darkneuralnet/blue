package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: if2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42844if2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f87704a;

    /* renamed from: b */
    public final TextView f87705b;

    /* renamed from: c */
    public final TextView f87706c;

    public C42844if2(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f87704a = linearLayout;
        this.f87705b = textView;
        this.f87706c = textView2;
    }

    /* renamed from: a */
    public static C42844if2 m33617a(View view) {
        int i = C35658Rh4.nonRepair;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C35658Rh4.reason;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C42844if2((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f87704a;
    }
}
