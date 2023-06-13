package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: Wd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36790Wd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f41418a;

    /* renamed from: b */
    public final TextView f41419b;

    public C36790Wd2(TextView textView, TextView textView2) {
        this.f41418a = textView;
        this.f41419b = textView2;
    }

    /* renamed from: a */
    public static C36790Wd2 m78115a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C36790Wd2(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f41418a;
    }
}
