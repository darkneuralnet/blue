package p000;

import android.view.View;
import android.widget.LinearLayout;
/* renamed from: ED1 */
/* loaded from: classes2.dex */
public final class ED1 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f7118a;

    public ED1(LinearLayout linearLayout) {
        this.f7118a = linearLayout;
    }

    /* renamed from: a */
    public static ED1 m109292a(View view) {
        if (view != null) {
            return new ED1((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f7118a;
    }
}
