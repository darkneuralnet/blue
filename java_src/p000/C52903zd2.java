package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: zd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52903zd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f121655a;

    /* renamed from: b */
    public final TextView f121656b;

    /* renamed from: c */
    public final TextView f121657c;

    public C52903zd2(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.f121655a = constraintLayout;
        this.f121656b = textView;
        this.f121657c = textView2;
    }

    /* renamed from: a */
    public static C52903zd2 m970a(View view) {
        int i = C32616Eh4.capacity;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C32616Eh4.title;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C52903zd2((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f121655a;
    }
}
