package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
/* renamed from: Mp6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34562Mp6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final View f23661a;

    /* renamed from: b */
    public final Button f23662b;

    /* renamed from: c */
    public final Button f23663c;

    /* renamed from: d */
    public final Button f23664d;

    /* renamed from: e */
    public final Button f23665e;

    /* renamed from: f */
    public final Button f23666f;

    public C34562Mp6(View view, Button button, Button button2, Button button3, Button button4, Button button5) {
        this.f23661a = view;
        this.f23662b = button;
        this.f23663c = button2;
        this.f23664d = button3;
        this.f23665e = button4;
        this.f23666f = button5;
    }

    /* renamed from: a */
    public static C34562Mp6 m94692a(View view) {
        int i = C36585Vg4.cancelMechanic;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C36585Vg4.claim;
            Button button2 = (Button) C34328Lp6.m96312a(view, i);
            if (button2 != null) {
                i = C36585Vg4.details;
                Button button3 = (Button) C34328Lp6.m96312a(view, i);
                if (button3 != null) {
                    i = C36585Vg4.navigateMechanic;
                    Button button4 = (Button) C34328Lp6.m96312a(view, i);
                    if (button4 != null) {
                        i = C36585Vg4.replaceQr;
                        Button button5 = (Button) C34328Lp6.m96312a(view, i);
                        if (button5 != null) {
                            return new C34562Mp6(view, button, button2, button3, button4, button5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public static C34562Mp6 m94691b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C39311cj4.view_bird_mechanic_option_sheet, viewGroup);
            return m94692a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p000.InterfaceC34094Kp6
    public View getRoot() {
        return this.f23661a;
    }
}
