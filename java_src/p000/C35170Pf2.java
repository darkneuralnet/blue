package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: Pf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35170Pf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f28861a;

    /* renamed from: b */
    public final TextView f28862b;

    public C35170Pf2(TextView textView, TextView textView2) {
        this.f28861a = textView;
        this.f28862b = textView2;
    }

    /* renamed from: a */
    public static C35170Pf2 m89968a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C35170Pf2(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f28861a;
    }
}
