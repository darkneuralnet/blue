package p000;

import android.view.View;
import android.widget.Button;
/* renamed from: mg2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45226mg2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final Button f98546a;

    public C45226mg2(Button button) {
        this.f98546a = button;
    }

    /* renamed from: a */
    public static C45226mg2 m25182a(View view) {
        if (view != null) {
            return new C45226mg2((Button) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public Button getRoot() {
        return this.f98546a;
    }
}
