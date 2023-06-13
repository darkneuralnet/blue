package p000;

import android.view.View;
import android.widget.Button;
/* renamed from: yd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52310yd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final Button f119868a;

    public C52310yd2(Button button) {
        this.f119868a = button;
    }

    /* renamed from: a */
    public static C52310yd2 m3153a(View view) {
        if (view != null) {
            return new C52310yd2((Button) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public Button getRoot() {
        return this.f119868a;
    }
}
