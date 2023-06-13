package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Bb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31858Bb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f2539a;

    /* renamed from: b */
    public final TextView f2540b;

    /* renamed from: c */
    public final TextView f2541c;

    /* renamed from: d */
    public final TextView f2542d;

    /* renamed from: e */
    public final TextView f2543e;

    /* renamed from: f */
    public final TextView f2544f;

    public C31858Bb2(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f2539a = constraintLayout;
        this.f2540b = textView;
        this.f2541c = textView2;
        this.f2542d = textView3;
        this.f2543e = textView4;
        this.f2544f = textView5;
    }

    /* renamed from: a */
    public static C31858Bb2 m113832a(View view) {
        int i = C39912di4.headerText;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C39912di4.lineItem1;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C39912di4.lineItem2;
                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView3 != null) {
                    i = C39912di4.statusText;
                    TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                    if (textView4 != null) {
                        i = C39912di4.viewAction;
                        TextView textView5 = (TextView) C34328Lp6.m96312a(view, i);
                        if (textView5 != null) {
                            return new C31858Bb2((ConstraintLayout) view, textView, textView2, textView3, textView4, textView5);
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
        return this.f2539a;
    }
}
