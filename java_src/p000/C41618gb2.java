package p000;

import android.view.View;
import android.widget.Button;
/* renamed from: gb2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41618gb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final Button f82461a;

    public C41618gb2(Button button) {
        this.f82461a = button;
    }

    /* renamed from: a */
    public static C41618gb2 m39110a(View view) {
        if (view != null) {
            return new C41618gb2((Button) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public Button getRoot() {
        return this.f82461a;
    }
}
