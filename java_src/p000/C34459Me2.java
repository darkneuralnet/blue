package p000;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
/* renamed from: Me2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34459Me2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f23354a;

    /* renamed from: b */
    public final Button f23355b;

    /* renamed from: c */
    public final AppCompatTextView f23356c;

    /* renamed from: d */
    public final Button f23357d;

    /* renamed from: e */
    public final AppCompatTextView f23358e;

    public C34459Me2(LinearLayout linearLayout, Button button, AppCompatTextView appCompatTextView, Button button2, AppCompatTextView appCompatTextView2) {
        this.f23354a = linearLayout;
        this.f23355b = button;
        this.f23356c = appCompatTextView;
        this.f23357d = button2;
        this.f23358e = appCompatTextView2;
    }

    /* renamed from: a */
    public static C34459Me2 m95092a(View view) {
        int i = C35190Ph4.copyButton;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C35190Ph4.description;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C34328Lp6.m96312a(view, i);
            if (appCompatTextView != null) {
                i = C35190Ph4.sendButton;
                Button button2 = (Button) C34328Lp6.m96312a(view, i);
                if (button2 != null) {
                    i = C35190Ph4.title;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C34328Lp6.m96312a(view, i);
                    if (appCompatTextView2 != null) {
                        return new C34459Me2((LinearLayout) view, button, appCompatTextView, button2, appCompatTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f23354a;
    }
}
