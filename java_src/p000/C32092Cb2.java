package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Cb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32092Cb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f4291a;

    /* renamed from: b */
    public final TextView f4292b;

    /* renamed from: c */
    public final TextView f4293c;

    public C32092Cb2(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.f4291a = constraintLayout;
        this.f4292b = textView;
        this.f4293c = textView2;
    }

    /* renamed from: a */
    public static C32092Cb2 m112084a(View view) {
        int i = C39912di4.headerText;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C39912di4.statusText;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C32092Cb2((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f4291a;
    }
}
