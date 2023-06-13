package p000;

import android.view.View;
import com.google.android.material.chip.ChipGroup;
/* renamed from: Rd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35620Rd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ChipGroup f32353a;

    public C35620Rd2(ChipGroup chipGroup) {
        this.f32353a = chipGroup;
    }

    /* renamed from: a */
    public static C35620Rd2 m86538a(View view) {
        if (view != null) {
            return new C35620Rd2((ChipGroup) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ChipGroup getRoot() {
        return this.f32353a;
    }
}
