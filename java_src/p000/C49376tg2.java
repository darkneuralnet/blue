package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: tg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49376tg2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f110856a;

    /* renamed from: b */
    public final View f110857b;

    /* renamed from: c */
    public final TextView f110858c;

    /* renamed from: d */
    public final TextView f110859d;

    /* renamed from: e */
    public final TextView f110860e;

    /* renamed from: f */
    public final TextView f110861f;

    public C49376tg2(ConstraintLayout constraintLayout, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f110856a = constraintLayout;
        this.f110857b = view;
        this.f110858c = textView;
        this.f110859d = textView2;
        this.f110860e = textView3;
        this.f110861f = textView4;
    }

    /* renamed from: a */
    public static C49376tg2 m11930a(View view) {
        int i = C44062ki4.dot;
        View m96312a = C34328Lp6.m96312a(view, i);
        if (m96312a != null) {
            i = C44062ki4.email;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C44062ki4.repair;
                TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView2 != null) {
                    i = C44062ki4.role;
                    TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView3 != null) {
                        i = C44062ki4.time;
                        TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView4 != null) {
                            return new C49376tg2((ConstraintLayout) view, m96312a, textView, textView2, textView3, textView4);
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
        return this.f110856a;
    }
}
