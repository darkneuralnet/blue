package p000;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: w31  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50789w31 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f115211a;

    /* renamed from: b */
    public final TextView f115212b;

    /* renamed from: c */
    public final Button f115213c;

    /* renamed from: d */
    public final TextView f115214d;

    /* renamed from: e */
    public final TextView f115215e;

    public C50789w31(LinearLayout linearLayout, TextView textView, Button button, TextView textView2, TextView textView3) {
        this.f115211a = linearLayout;
        this.f115212b = textView;
        this.f115213c = button;
        this.f115214d = textView2;
        this.f115215e = textView3;
    }

    /* renamed from: a */
    public static C50789w31 m7525a(View view) {
        int i = C36585Vg4.cancelButton;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C36585Vg4.confirmButton;
            Button button = (Button) C34328Lp6.m96312a(view, i);
            if (button != null) {
                i = C36585Vg4.header;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C36585Vg4.mainText;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        return new C50789w31((LinearLayout) view, textView, button, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f115211a;
    }
}
