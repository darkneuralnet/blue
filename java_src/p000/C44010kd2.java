package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: kd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44010kd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f94677a;

    /* renamed from: b */
    public final TextView f94678b;

    /* renamed from: c */
    public final TextView f94679c;

    public C44010kd2(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.f94677a = constraintLayout;
        this.f94678b = textView;
        this.f94679c = textView2;
    }

    /* renamed from: a */
    public static C44010kd2 m28716a(View view) {
        int i = C39912di4.headerText;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C39912di4.status;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C44010kd2((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f94677a;
    }
}
