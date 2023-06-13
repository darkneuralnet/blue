package p000;

import android.content.Context;
/* renamed from: Oh2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34954Oh2 implements InterfaceC48812sj1<InterfaceC35422Qh2> {

    /* renamed from: a */
    public final C34720Nh2 f27059a;

    /* renamed from: b */
    public final Y94<Context> f27060b;

    public C34954Oh2(C34720Nh2 c34720Nh2, Y94<Context> y94) {
        this.f27059a = c34720Nh2;
        this.f27060b = y94;
    }

    /* renamed from: a */
    public static C34954Oh2 m91678a(C34720Nh2 c34720Nh2, Y94<Context> y94) {
        return new C34954Oh2(c34720Nh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC35422Qh2 m91676c(C34720Nh2 c34720Nh2, Context context) {
        return (InterfaceC35422Qh2) C51679xZ3.m5002e(c34720Nh2.m93572a(context));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC35422Qh2 get() {
        return m91676c(this.f27059a, this.f27060b.get());
    }
}
