package p000;

import java.util.concurrent.Executor;
/* renamed from: rM6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48009rM6 implements InterfaceC50972wM6<C46823pM6> {

    /* renamed from: a */
    public final InterfaceC50972wM6 f106899a;

    /* renamed from: b */
    public final InterfaceC50972wM6 f106900b;

    /* renamed from: c */
    public final InterfaceC50972wM6 f106901c;

    /* renamed from: d */
    public final InterfaceC50972wM6 f106902d;

    /* renamed from: e */
    public final /* synthetic */ int f106903e = 0;

    public C48009rM6(InterfaceC50972wM6<HK6> interfaceC50972wM6, InterfaceC50972wM6<InterfaceC40920fP6> interfaceC50972wM62, InterfaceC50972wM6<C51556xL6> interfaceC50972wM63, InterfaceC50972wM6<Executor> interfaceC50972wM64) {
        this.f106899a = interfaceC50972wM6;
        this.f106900b = interfaceC50972wM62;
        this.f106901c = interfaceC50972wM63;
        this.f106902d = interfaceC50972wM64;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [pM6, sL6] */
    /* JADX WARN: Type inference failed for: r4v2, types: [pM6, vM6] */
    @Override // p000.InterfaceC50972wM6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C46823pM6 mo6967a() {
        int i = this.f106903e;
        if (i == 0) {
            Object mo6967a = this.f106899a.mo6967a();
            return new C46823pM6((HK6) mo6967a, C48601sM6.m14271c(this.f106900b), (C51556xL6) this.f106901c.mo6967a(), C48601sM6.m14271c(this.f106902d));
        } else if (i == 1) {
            return new C48592sL6((HK6) this.f106899a.mo6967a(), C48601sM6.m14271c(this.f106900b), C48601sM6.m14271c(this.f106901c), (C51556xL6) this.f106902d.mo6967a());
        } else {
            Object mo6967a2 = this.f106901c.mo6967a();
            Object mo6967a3 = this.f106900b.mo6967a();
            return new C50379vM6((C46823pM6) mo6967a2, (HK6) mo6967a3, (C42070hL6) this.f106899a.mo6967a(), (PJ6) this.f106902d.mo6967a());
        }
    }

    public C48009rM6(InterfaceC50972wM6<HK6> interfaceC50972wM6, InterfaceC50972wM6<InterfaceC40920fP6> interfaceC50972wM62, InterfaceC50972wM6<BK6> interfaceC50972wM63, InterfaceC50972wM6<C51556xL6> interfaceC50972wM64, byte[] bArr) {
        this.f106899a = interfaceC50972wM6;
        this.f106900b = interfaceC50972wM62;
        this.f106901c = interfaceC50972wM63;
        this.f106902d = interfaceC50972wM64;
    }

    public C48009rM6(InterfaceC50972wM6<C46823pM6> interfaceC50972wM6, InterfaceC50972wM6<HK6> interfaceC50972wM62, InterfaceC50972wM6<C42070hL6> interfaceC50972wM63, InterfaceC50972wM6<PJ6> interfaceC50972wM64, char[] cArr) {
        this.f106901c = interfaceC50972wM6;
        this.f106900b = interfaceC50972wM62;
        this.f106899a = interfaceC50972wM63;
        this.f106902d = interfaceC50972wM64;
    }
}
