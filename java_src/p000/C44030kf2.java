package p000;

import android.view.View;
import co.bird.android.feature.fleetstatus.kpi.views.PeriodView;
/* renamed from: kf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44030kf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final PeriodView f94722a;

    public C44030kf2(PeriodView periodView) {
        this.f94722a = periodView;
    }

    /* renamed from: a */
    public static C44030kf2 m28687a(View view) {
        if (view != null) {
            return new C44030kf2((PeriodView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public PeriodView getRoot() {
        return this.f94722a;
    }
}
