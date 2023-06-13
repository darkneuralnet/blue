package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: lc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44593lc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f96424a;

    /* renamed from: b */
    public final TextView f96425b;

    /* renamed from: c */
    public final TextView f96426c;

    /* renamed from: d */
    public final TextView f96427d;

    public C44593lc2(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f96424a = constraintLayout;
        this.f96425b = textView;
        this.f96426c = textView2;
        this.f96427d = textView3;
    }

    /* renamed from: a */
    public static C44593lc2 m27092a(View view) {
        int i = C39912di4.ctaButton;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C39912di4.headerText;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C39912di4.lineItem1;
                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView3 != null) {
                    return new C44593lc2((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f96424a;
    }
}
