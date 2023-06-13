package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: g56  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41328g56 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f81577a;

    /* renamed from: b */
    public final TextView f81578b;

    public C41328g56(TextView textView, TextView textView2) {
        this.f81577a = textView;
        this.f81578b = textView2;
    }

    /* renamed from: a */
    public static C41328g56 m40078a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C41328g56(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f81577a;
    }
}
