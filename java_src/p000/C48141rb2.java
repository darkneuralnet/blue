package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: rb2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48141rb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f107306a;

    /* renamed from: b */
    public final TextView f107307b;

    public C48141rb2(TextView textView, TextView textView2) {
        this.f107306a = textView;
        this.f107307b = textView2;
    }

    /* renamed from: a */
    public static C48141rb2 m15721a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C48141rb2(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f107306a;
    }
}
