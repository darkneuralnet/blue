package p000;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: ng2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45819ng2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f100305a;

    /* renamed from: b */
    public final Button f100306b;

    /* renamed from: c */
    public final TextView f100307c;

    public C45819ng2(LinearLayout linearLayout, Button button, TextView textView) {
        this.f100305a = linearLayout;
        this.f100306b = button;
        this.f100307c = textView;
    }

    /* renamed from: a */
    public static C45819ng2 m23333a(View view) {
        int i = C44062ki4.add;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C44062ki4.description;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                return new C45819ng2((LinearLayout) view, button, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f100305a;
    }
}
