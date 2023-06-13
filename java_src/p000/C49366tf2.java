package p000;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: tf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49366tf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f110845a;

    /* renamed from: b */
    public final Button f110846b;

    /* renamed from: c */
    public final TextView f110847c;

    /* renamed from: d */
    public final TextView f110848d;

    public C49366tf2(ConstraintLayout constraintLayout, Button button, TextView textView, TextView textView2) {
        this.f110845a = constraintLayout;
        this.f110846b = button;
        this.f110847c = textView;
        this.f110848d = textView2;
    }

    /* renamed from: a */
    public static C49366tf2 m11955a(View view) {
        int i = C42283hi4.button;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C42283hi4.count;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C42283hi4.label;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    return new C49366tf2((ConstraintLayout) view, button, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f110845a;
    }
}
