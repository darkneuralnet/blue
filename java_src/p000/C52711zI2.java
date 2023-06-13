package p000;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
/* renamed from: zI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52711zI2 implements InterfaceC48812sj1<DevicePolicyManager> {

    /* renamed from: a */
    public final VH2 f121049a;

    /* renamed from: b */
    public final Y94<Context> f121050b;

    public C52711zI2(VH2 vh2, Y94<Context> y94) {
        this.f121049a = vh2;
        this.f121050b = y94;
    }

    /* renamed from: a */
    public static C52711zI2 m1554a(VH2 vh2, Y94<Context> y94) {
        return new C52711zI2(vh2, y94);
    }

    /* renamed from: c */
    public static DevicePolicyManager m1552c(VH2 vh2, Context context) {
        return (DevicePolicyManager) C51679xZ3.m5002e(vh2.m80112E(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public DevicePolicyManager get() {
        return m1552c(this.f121049a, this.f121050b.get());
    }
}
