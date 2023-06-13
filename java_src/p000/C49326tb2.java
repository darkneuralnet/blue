package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: tb2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49326tb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f110775a;

    /* renamed from: b */
    public final TextView f110776b;

    public C49326tb2(TextView textView, TextView textView2) {
        this.f110775a = textView;
        this.f110776b = textView2;
    }

    /* renamed from: a */
    public static C49326tb2 m12025a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C49326tb2(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f110775a;
    }
}
