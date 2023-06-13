package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: wd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51124wd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f116278a;

    public C51124wd2(TextView textView) {
        this.f116278a = textView;
    }

    /* renamed from: a */
    public static C51124wd2 m6588a(View view) {
        if (view != null) {
            return new C51124wd2((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f116278a;
    }
}
