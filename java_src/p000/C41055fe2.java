package p000;

import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
/* renamed from: fe2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41055fe2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final SwitchCompat f80388a;

    /* renamed from: b */
    public final SwitchCompat f80389b;

    public C41055fe2(SwitchCompat switchCompat, SwitchCompat switchCompat2) {
        this.f80388a = switchCompat;
        this.f80389b = switchCompat2;
    }

    /* renamed from: a */
    public static C41055fe2 m41085a(View view) {
        if (view != null) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            return new C41055fe2(switchCompat, switchCompat);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public SwitchCompat getRoot() {
        return this.f80388a;
    }
}
