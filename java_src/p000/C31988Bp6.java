package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: Bp6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C31988Bp6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f2933a;

    /* renamed from: b */
    public final TextView f2934b;

    /* renamed from: c */
    public final LinearLayout f2935c;

    /* renamed from: d */
    public final TextView f2936d;

    public C31988Bp6(LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, TextView textView2) {
        this.f2933a = linearLayout;
        this.f2934b = textView;
        this.f2935c = linearLayout2;
        this.f2936d = textView2;
    }

    /* renamed from: a */
    public static C31988Bp6 m113454a(View view) {
        int i = C36585Vg4.analyticsEventName;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i2 = C36585Vg4.analyticsEventTime;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i2);
            if (textView2 != null) {
                return new C31988Bp6(linearLayout, textView, linearLayout, textView2);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f2933a;
    }
}
