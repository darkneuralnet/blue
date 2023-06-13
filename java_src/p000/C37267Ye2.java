package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: Ye2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37267Ye2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f46202a;

    /* renamed from: b */
    public final TextView f46203b;

    /* renamed from: c */
    public final TextView f46204c;

    /* renamed from: d */
    public final TextView f46205d;

    public C37267Ye2(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f46202a = linearLayout;
        this.f46203b = textView;
        this.f46204c = textView2;
        this.f46205d = textView3;
    }

    /* renamed from: a */
    public static C37267Ye2 m74615a(View view) {
        int i = C36585Vg4.pickupDate;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.pickupLocation;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C36585Vg4.pickupTime;
                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView3 != null) {
                    return new C37267Ye2((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f46202a;
    }
}
