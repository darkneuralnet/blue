package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: ic2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42814ic2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f87527a;

    public C42814ic2(TextView textView) {
        this.f87527a = textView;
    }

    /* renamed from: a */
    public static C42814ic2 m33754a(View view) {
        if (view != null) {
            return new C42814ic2((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f87527a;
    }
}
