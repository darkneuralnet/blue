package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: Ua2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36295Ua2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f37563a;

    /* renamed from: b */
    public final TextView f37564b;

    public C36295Ua2(LinearLayout linearLayout, TextView textView) {
        this.f37563a = linearLayout;
        this.f37564b = textView;
    }

    /* renamed from: a */
    public static C36295Ua2 m81342a(View view) {
        int i = C38698bh4.footer;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            return new C36295Ua2((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f37563a;
    }
}
