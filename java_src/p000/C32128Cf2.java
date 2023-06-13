package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Cf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32128Cf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f4443a;

    /* renamed from: b */
    public final TextView f4444b;

    /* renamed from: c */
    public final TextView f4445c;

    /* renamed from: d */
    public final TextView f4446d;

    public C32128Cf2(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f4443a = constraintLayout;
        this.f4444b = textView;
        this.f4445c = textView2;
        this.f4446d = textView3;
    }

    /* renamed from: a */
    public static C32128Cf2 m111924a(View view) {
        int i = C39912di4.code;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C39912di4.model;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C39912di4.reason;
                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView3 != null) {
                    return new C32128Cf2((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f4443a;
    }
}
