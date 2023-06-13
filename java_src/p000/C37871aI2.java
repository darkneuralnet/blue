package p000;

import android.content.Context;
import android.hardware.SensorManager;
/* renamed from: aI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37871aI2 implements InterfaceC48812sj1<SensorManager> {

    /* renamed from: a */
    public final VH2 f50232a;

    /* renamed from: b */
    public final Y94<Context> f50233b;

    public C37871aI2(VH2 vh2, Y94<Context> y94) {
        this.f50232a = vh2;
        this.f50233b = y94;
    }

    /* renamed from: a */
    public static C37871aI2 m71699a(VH2 vh2, Y94<Context> y94) {
        return new C37871aI2(vh2, y94);
    }

    /* renamed from: c */
    public static SensorManager m71697c(VH2 vh2, Context context) {
        return (SensorManager) C51679xZ3.m5002e(vh2.m80065e(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public SensorManager get() {
        return m71697c(this.f50232a, this.f50233b.get());
    }
}
