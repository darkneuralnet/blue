package p000;

import android.view.View;
import android.widget.Button;
/* renamed from: lf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44623lf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final Button f96523a;

    public C44623lf2(Button button) {
        this.f96523a = button;
    }

    /* renamed from: a */
    public static C44623lf2 m27021a(View view) {
        if (view != null) {
            return new C44623lf2((Button) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public Button getRoot() {
        return this.f96523a;
    }
}
