package p000;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: tc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49336tc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f110788a;

    /* renamed from: b */
    public final Button f110789b;

    /* renamed from: c */
    public final TextView f110790c;

    /* renamed from: d */
    public final TextView f110791d;

    public C49336tc2(ConstraintLayout constraintLayout, Button button, TextView textView, TextView textView2) {
        this.f110788a = constraintLayout;
        this.f110789b = button;
        this.f110790c = textView;
        this.f110791d = textView2;
    }

    /* renamed from: a */
    public static C49336tc2 m12012a(View view) {
        int i = C39912di4.acceptDelivery;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C39912di4.acceptedCount;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C39912di4.acceptedLabel;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C49336tc2((ConstraintLayout) view, button, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110788a;
    }
}
