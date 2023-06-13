package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Vf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36574Vf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f39417a;

    /* renamed from: b */
    public final TextView f39418b;

    /* renamed from: c */
    public final TextView f39419c;

    /* renamed from: d */
    public final TextView f39420d;

    /* renamed from: e */
    public final TextView f39421e;

    public C36574Vf2(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f39417a = constraintLayout;
        this.f39418b = textView;
        this.f39419c = textView2;
        this.f39420d = textView3;
        this.f39421e = textView4;
    }

    /* renamed from: a */
    public static C36574Vf2 m79592a(View view) {
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
                        return new C36574Vf2((ConstraintLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f39417a;
    }
}
