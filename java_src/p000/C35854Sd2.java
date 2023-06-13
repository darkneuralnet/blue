package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: Sd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35854Sd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f33980a;

    /* renamed from: b */
    public final TextView f33981b;

    public C35854Sd2(TextView textView, TextView textView2) {
        this.f33980a = textView;
        this.f33981b = textView2;
    }

    /* renamed from: a */
    public static C35854Sd2 m85180a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C35854Sd2(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f33980a;
    }
}
