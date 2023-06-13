package p000;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
/* renamed from: cs6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39421cs6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f75751a;

    /* renamed from: b */
    public final TextView f75752b;

    public C39421cs6(LinearLayout linearLayout, TextView textView) {
        this.f75751a = linearLayout;
        this.f75752b = textView;
    }

    /* renamed from: a */
    public static C39421cs6 m44939a(View view) {
        int i = C41087fh4.errorDetail;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            return new C39421cs6((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f75751a;
    }
}
