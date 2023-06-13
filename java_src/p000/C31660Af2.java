package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Af2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31660Af2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f908a;

    /* renamed from: b */
    public final TextView f909b;

    /* renamed from: c */
    public final TextView f910c;

    public C31660Af2(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.f908a = constraintLayout;
        this.f909b = textView;
        this.f910c = textView2;
    }

    /* renamed from: a */
    public static C31660Af2 m115410a(View view) {
        int i = C39912di4.count;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C39912di4.title;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C31660Af2((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f908a;
    }
}
