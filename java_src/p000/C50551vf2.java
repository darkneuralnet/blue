package p000;

import android.view.View;
import android.widget.Button;
/* renamed from: vf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50551vf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final Button f114460a;

    public C50551vf2(Button button) {
        this.f114460a = button;
    }

    /* renamed from: a */
    public static C50551vf2 m8274a(View view) {
        if (view != null) {
            return new C50551vf2((Button) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public Button getRoot() {
        return this.f114460a;
    }
}
