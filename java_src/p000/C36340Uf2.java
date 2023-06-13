package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: Uf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36340Uf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f37721a;

    /* renamed from: b */
    public final TextView f37722b;

    /* renamed from: c */
    public final TextView f37723c;

    public C36340Uf2(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.f37721a = constraintLayout;
        this.f37722b = textView;
        this.f37723c = textView2;
    }

    /* renamed from: a */
    public static C36340Uf2 m81205a(View view) {
        int i = C37530Zh4.amount;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C37530Zh4.label;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C36340Uf2((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f37721a;
    }
}
