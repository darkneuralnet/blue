package p000;

import android.view.View;
import android.widget.Button;
/* renamed from: Xf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37042Xf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final Button f43542a;

    /* renamed from: b */
    public final Button f43543b;

    public C37042Xf2(Button button, Button button2) {
        this.f43542a = button;
        this.f43543b = button2;
    }

    /* renamed from: a */
    public static C37042Xf2 m76724a(View view) {
        if (view != null) {
            Button button = (Button) view;
            return new C37042Xf2(button, button);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public Button getRoot() {
        return this.f43542a;
    }
}
