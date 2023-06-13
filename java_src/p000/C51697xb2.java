package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: xb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51697xb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f117840a;

    /* renamed from: b */
    public final TextView f117841b;

    /* renamed from: c */
    public final TextView f117842c;

    public C51697xb2(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.f117840a = constraintLayout;
        this.f117841b = textView;
        this.f117842c = textView2;
    }

    /* renamed from: a */
    public static C51697xb2 m4967a(View view) {
        int i = C42866ih4.header2;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C42866ih4.required;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C51697xb2((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f117840a;
    }
}
