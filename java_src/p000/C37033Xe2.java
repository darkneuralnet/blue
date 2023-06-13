package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: Xe2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37033Xe2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f43491a;

    /* renamed from: b */
    public final TextView f43492b;

    /* renamed from: c */
    public final TextView f43493c;

    /* renamed from: d */
    public final TextView f43494d;

    public C37033Xe2(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f43491a = linearLayout;
        this.f43492b = textView;
        this.f43493c = textView2;
        this.f43494d = textView3;
    }

    /* renamed from: a */
    public static C37033Xe2 m76744a(View view) {
        int i = C36585Vg4.deliverDate;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.deliverTime;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C36585Vg4.returnDate;
                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView3 != null) {
                    return new C37033Xe2((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f43491a;
    }
}
