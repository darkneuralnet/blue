package p000;

import co.bird.android.config.tweaks.dsl.Tweaks;
/* renamed from: ib6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42808ib6 implements InterfaceC48812sj1<Tweaks> {

    /* renamed from: a */
    public final Y94<InterfaceC6097Oh> f87515a;

    public C42808ib6(Y94<InterfaceC6097Oh> y94) {
        this.f87515a = y94;
    }

    /* renamed from: a */
    public static C42808ib6 m33767a(Y94<InterfaceC6097Oh> y94) {
        return new C42808ib6(y94);
    }

    /* renamed from: c */
    public static Tweaks m33765c(InterfaceC6097Oh interfaceC6097Oh) {
        return (Tweaks) C51679xZ3.m5002e(C41622gb6.m39088a(interfaceC6097Oh));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public Tweaks get() {
        return m33765c(this.f87515a.get());
    }
}
