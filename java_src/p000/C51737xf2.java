package p000;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: xf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51737xf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f117944a;

    /* renamed from: b */
    public final TextView f117945b;

    /* renamed from: c */
    public final Button f117946c;

    /* renamed from: d */
    public final TextView f117947d;

    public C51737xf2(ConstraintLayout constraintLayout, TextView textView, Button button, TextView textView2) {
        this.f117944a = constraintLayout;
        this.f117945b = textView;
        this.f117946c = button;
        this.f117947d = textView2;
    }

    /* renamed from: a */
    public static C51737xf2 m4896a(View view) {
        int i = C42866ih4.count;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C42866ih4.done;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C42866ih4.label;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C51737xf2((ConstraintLayout) view, textView, button, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f117944a;
    }
}
