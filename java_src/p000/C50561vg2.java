package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
/* renamed from: vg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50561vg2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f114487a;

    /* renamed from: b */
    public final TextView f114488b;

    public C50561vg2(FrameLayout frameLayout, TextView textView) {
        this.f114487a = frameLayout;
        this.f114488b = textView;
    }

    /* renamed from: a */
    public static C50561vg2 m8269a(View view) {
        int i = C44655li4.title;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            return new C50561vg2((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f114487a;
    }
}
