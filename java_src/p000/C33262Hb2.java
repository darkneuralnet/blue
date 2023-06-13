package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: Hb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33262Hb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f13610a;

    /* renamed from: b */
    public final TextView f13611b;

    public C33262Hb2(TextView textView, TextView textView2) {
        this.f13610a = textView;
        this.f13611b = textView2;
    }

    /* renamed from: a */
    public static C33262Hb2 m103683a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C33262Hb2(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f13610a;
    }
}
