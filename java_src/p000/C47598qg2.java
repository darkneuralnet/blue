package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: qg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47598qg2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f105598a;

    /* renamed from: b */
    public final TextView f105599b;

    /* renamed from: c */
    public final TextView f105600c;

    /* renamed from: d */
    public final TextView f105601d;

    public C47598qg2(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f105598a = constraintLayout;
        this.f105599b = textView;
        this.f105600c = textView2;
        this.f105601d = textView3;
    }

    /* renamed from: a */
    public static C47598qg2 m17253a(View view) {
        int i = C44062ki4.issues;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C44062ki4.status;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C44062ki4.title;
                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView3 != null) {
                    return new C47598qg2((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f105598a;
    }
}
