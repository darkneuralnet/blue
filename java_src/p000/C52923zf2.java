package p000;

import android.view.View;
import android.widget.LinearLayout;
/* renamed from: zf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52923zf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f122011a;

    public C52923zf2(LinearLayout linearLayout) {
        this.f122011a = linearLayout;
    }

    /* renamed from: a */
    public static C52923zf2 m611a(View view) {
        if (view != null) {
            return new C52923zf2((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f122011a;
    }
}
