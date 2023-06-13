package p000;

import android.content.Context;
/* renamed from: GM6 */
/* loaded from: classes6.dex */
public final class GM6 implements InterfaceC50972wM6<FM6> {

    /* renamed from: a */
    public final InterfaceC50972wM6 f11802a;

    /* renamed from: b */
    public final /* synthetic */ int f11803b = 0;

    public GM6(InterfaceC50972wM6<HK6> interfaceC50972wM6) {
        this.f11802a = interfaceC50972wM6;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [hL6, FM6] */
    /* JADX WARN: Type inference failed for: r1v4, types: [MM6, FM6] */
    /* JADX WARN: Type inference failed for: r1v5, types: [dN6, FM6] */
    @Override // p000.InterfaceC50972wM6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ FM6 mo6967a() {
        int i = this.f11803b;
        return i != 0 ? i != 1 ? i != 2 ? new C39717dN6((HK6) this.f11802a.mo6967a()) : new MM6(((TO6) this.f11802a).mo6967a()) : new C42070hL6(C48601sM6.m14271c(this.f11802a)) : new FM6((HK6) this.f11802a.mo6967a());
    }

    public GM6(InterfaceC50972wM6<InterfaceC40920fP6> interfaceC50972wM6, byte[] bArr) {
        this.f11802a = interfaceC50972wM6;
    }

    public GM6(InterfaceC50972wM6<Context> interfaceC50972wM6, char[] cArr) {
        this.f11802a = interfaceC50972wM6;
    }

    public GM6(InterfaceC50972wM6<HK6> interfaceC50972wM6, short[] sArr) {
        this.f11802a = interfaceC50972wM6;
    }
}
