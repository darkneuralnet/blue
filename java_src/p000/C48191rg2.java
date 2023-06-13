package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: rg2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48191rg2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f107473a;

    /* renamed from: b */
    public final TextView f107474b;

    /* renamed from: c */
    public final TextView f107475c;

    /* renamed from: d */
    public final TextView f107476d;

    public C48191rg2(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f107473a = constraintLayout;
        this.f107474b = textView;
        this.f107475c = textView2;
        this.f107476d = textView3;
    }

    /* renamed from: a */
    public static C48191rg2 m15583a(View view) {
        int i = C37053Xg4.issues;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C37053Xg4.status;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                i = C37053Xg4.title;
                TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                if (textView3 != null) {
                    return new C48191rg2((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f107473a;
    }
}
