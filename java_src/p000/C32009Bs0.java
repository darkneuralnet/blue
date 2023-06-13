package p000;

import android.view.View;
import android.widget.LinearLayout;
/* renamed from: Bs0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32009Bs0 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f2981a;

    public C32009Bs0(LinearLayout linearLayout) {
        this.f2981a = linearLayout;
    }

    /* renamed from: a */
    public static C32009Bs0 m113426a(View view) {
        if (view != null) {
            return new C32009Bs0((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f2981a;
    }
}
