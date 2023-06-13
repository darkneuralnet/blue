package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
/* renamed from: V4 */
/* loaded from: classes3.dex */
public final class C8539V4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f38557a;

    /* renamed from: b */
    public final Button f38558b;

    /* renamed from: c */
    public final Button f38559c;

    /* renamed from: d */
    public final Button f38560d;

    /* renamed from: e */
    public final LinearProgressIndicator f38561e;

    public C8539V4(LinearLayout linearLayout, Button button, Button button2, Button button3, LinearProgressIndicator linearProgressIndicator) {
        this.f38557a = linearLayout;
        this.f38558b = button;
        this.f38559c = button2;
        this.f38560d = button3;
        this.f38561e = linearProgressIndicator;
    }

    /* renamed from: a */
    public static C8539V4 m80456a(View view) {
        int i = C47620qi4.cardPay;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C47620qi4.gPay;
            Button button2 = (Button) C34328Lp6.m96312a(view, i);
            if (button2 != null) {
                i = C47620qi4.paypal;
                Button button3 = (Button) C34328Lp6.m96312a(view, i);
                if (button3 != null) {
                    i = C47620qi4.progressBar;
                    LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) C34328Lp6.m96312a(view, i);
                    if (linearProgressIndicator != null) {
                        return new C8539V4((LinearLayout) view, button, button2, button3, linearProgressIndicator);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C8539V4 m80454c(LayoutInflater layoutInflater) {
        return m80453d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C8539V4 m80453d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39932dk4.activity_purchase_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m80456a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f38557a;
    }
}
