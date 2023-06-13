package p000;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: La2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34189La2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f21695a;

    /* renamed from: b */
    public final Button f21696b;

    /* renamed from: c */
    public final Button f21697c;

    /* renamed from: d */
    public final Button f21698d;

    /* renamed from: e */
    public final Button f21699e;

    /* renamed from: f */
    public final TextView f21700f;

    /* renamed from: g */
    public final TextView f21701g;

    /* renamed from: h */
    public final Button f21702h;

    /* renamed from: i */
    public final Button f21703i;

    public C34189La2(ConstraintLayout constraintLayout, Button button, Button button2, Button button3, Button button4, TextView textView, TextView textView2, Button button5, Button button6) {
        this.f21695a = constraintLayout;
        this.f21696b = button;
        this.f21697c = button2;
        this.f21698d = button3;
        this.f21699e = button4;
        this.f21700f = textView;
        this.f21701g = textView2;
        this.f21702h = button5;
        this.f21703i = button6;
    }

    /* renamed from: a */
    public static C34189La2 m96626a(View view) {
        int i = C34722Nh4.diagnostics;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C34722Nh4.faq;
            Button button2 = (Button) C34328Lp6.m96312a(view, i);
            if (button2 != null) {
                i = C34722Nh4.pair;
                Button button3 = (Button) C34328Lp6.m96312a(view, i);
                if (button3 != null) {
                    i = C34722Nh4.reset;
                    Button button4 = (Button) C34328Lp6.m96312a(view, i);
                    if (button4 != null) {
                        i = C34722Nh4.serialNumber;
                        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView != null) {
                            i = C34722Nh4.serialNumberLabel;
                            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                            if (textView2 != null) {
                                i = C34722Nh4.sleepWake;
                                Button button5 = (Button) C34328Lp6.m96312a(view, i);
                                if (button5 != null) {
                                    i = C34722Nh4.unpair;
                                    Button button6 = (Button) C34328Lp6.m96312a(view, i);
                                    if (button6 != null) {
                                        return new C34189La2((ConstraintLayout) view, button, button2, button3, button4, textView, textView2, button5, button6);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f21695a;
    }
}
