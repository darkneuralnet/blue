package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: Vd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36556Vd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f39355a;

    /* renamed from: b */
    public final TextView f39356b;

    /* renamed from: c */
    public final TextView f39357c;

    public C36556Vd2(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f39355a = linearLayout;
        this.f39356b = textView;
        this.f39357c = textView2;
    }

    /* renamed from: a */
    public static C36556Vd2 m79639a(View view) {
        int i = C39912di4.detail;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C39912di4.title;
            TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
            if (textView2 != null) {
                return new C36556Vd2((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f39355a;
    }
}
