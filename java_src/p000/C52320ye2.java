package p000;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
/* renamed from: ye2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52320ye2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f119884a;

    /* renamed from: b */
    public final Button f119885b;

    /* renamed from: c */
    public final Button f119886c;

    public C52320ye2(LinearLayout linearLayout, Button button, Button button2) {
        this.f119884a = linearLayout;
        this.f119885b = button;
        this.f119886c = button2;
    }

    /* renamed from: a */
    public static C52320ye2 m3143a(View view) {
        int i = C51176wi4.primaryButton;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C51176wi4.secondaryButton;
            Button button2 = (Button) C34328Lp6.m96312a(view, i);
            if (button2 != null) {
                return new C52320ye2((LinearLayout) view, button, button2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f119884a;
    }
}
