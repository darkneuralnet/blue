package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: ZZ */
/* loaded from: classes3.dex */
public final class C10295ZZ implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f48770a;

    /* renamed from: b */
    public final Button f48771b;

    /* renamed from: c */
    public final LinearLayout f48772c;

    /* renamed from: d */
    public final TextView f48773d;

    /* renamed from: e */
    public final TextView f48774e;

    public C10295ZZ(LinearLayout linearLayout, Button button, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.f48770a = linearLayout;
        this.f48771b = button;
        this.f48772c = linearLayout2;
        this.f48773d = textView;
        this.f48774e = textView2;
    }

    /* renamed from: a */
    public static C10295ZZ m72925a(View view) {
        int i = C39912di4.confirm;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C39912di4.container;
            LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
            if (linearLayout != null) {
                i = C39912di4.message;
                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                if (textView != null) {
                    i = C39912di4.title;
                    TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView2 != null) {
                        return new C10295ZZ((LinearLayout) view, button, linearLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C10295ZZ m72923c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C35442Qj4.bottom_sheet_order_complete, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m72925a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f48770a;
    }
}
