package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: Pd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35152Pd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f28776a;

    public C35152Pd2(TextView textView) {
        this.f28776a = textView;
    }

    /* renamed from: a */
    public static C35152Pd2 m90053a(View view) {
        if (view != null) {
            return new C35152Pd2((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f28776a;
    }
}
