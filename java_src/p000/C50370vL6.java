package p000;

import android.content.Context;
import java.util.concurrent.Executor;
/* renamed from: vL6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50370vL6 implements InterfaceC50972wM6<C49778uL6> {

    /* renamed from: a */
    public final InterfaceC50972wM6 f113866a;

    /* renamed from: b */
    public final InterfaceC50972wM6 f113867b;

    /* renamed from: c */
    public final InterfaceC50972wM6 f113868c;

    /* renamed from: d */
    public final InterfaceC50972wM6 f113869d;

    /* renamed from: e */
    public final InterfaceC50972wM6 f113870e;

    /* renamed from: f */
    public final InterfaceC50972wM6 f113871f;

    /* renamed from: g */
    public final InterfaceC50972wM6 f113872g;

    /* renamed from: h */
    public final InterfaceC50972wM6 f113873h;

    /* renamed from: i */
    public final /* synthetic */ int f113874i = 0;

    public C50370vL6(InterfaceC50972wM6<C46823pM6> interfaceC50972wM6, InterfaceC50972wM6<InterfaceC40920fP6> interfaceC50972wM62, InterfaceC50972wM6<C48592sL6> interfaceC50972wM63, InterfaceC50972wM6<C39717dN6> interfaceC50972wM64, InterfaceC50972wM6<FM6> interfaceC50972wM65, InterfaceC50972wM6<KM6> interfaceC50972wM66, InterfaceC50972wM6<OM6> interfaceC50972wM67, InterfaceC50972wM6<C50379vM6> interfaceC50972wM68) {
        this.f113866a = interfaceC50972wM6;
        this.f113867b = interfaceC50972wM62;
        this.f113868c = interfaceC50972wM63;
        this.f113869d = interfaceC50972wM64;
        this.f113870e = interfaceC50972wM65;
        this.f113871f = interfaceC50972wM66;
        this.f113872g = interfaceC50972wM67;
        this.f113873h = interfaceC50972wM68;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [BK6, uL6] */
    @Override // p000.InterfaceC50972wM6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C49778uL6 mo6967a() {
        if (this.f113874i == 0) {
            Object mo6967a = this.f113866a.mo6967a();
            return new C49778uL6((C46823pM6) mo6967a, C48601sM6.m14271c(this.f113867b), (C48592sL6) this.f113868c.mo6967a(), (C39717dN6) this.f113869d.mo6967a(), (FM6) this.f113870e.mo6967a(), (KM6) this.f113871f.mo6967a(), (OM6) this.f113872g.mo6967a(), (C50379vM6) this.f113873h.mo6967a());
        }
        Context mo6967a2 = ((TO6) this.f113866a).mo6967a();
        Object mo6967a3 = this.f113872g.mo6967a();
        Object mo6967a4 = this.f113873h.mo6967a();
        InterfaceC46230oM6 m14271c = C48601sM6.m14271c(this.f113867b);
        Object mo6967a5 = this.f113870e.mo6967a();
        Object mo6967a6 = this.f113871f.mo6967a();
        return new BK6(mo6967a2, (C46823pM6) mo6967a3, (C49778uL6) mo6967a4, m14271c, (C51556xL6) mo6967a5, (C44442lL6) mo6967a6, C48601sM6.m14271c(this.f113868c), C48601sM6.m14271c(this.f113869d));
    }

    public C50370vL6(InterfaceC50972wM6<Context> interfaceC50972wM6, InterfaceC50972wM6<C46823pM6> interfaceC50972wM62, InterfaceC50972wM6<C49778uL6> interfaceC50972wM63, InterfaceC50972wM6<InterfaceC40920fP6> interfaceC50972wM64, InterfaceC50972wM6<C51556xL6> interfaceC50972wM65, InterfaceC50972wM6<C44442lL6> interfaceC50972wM66, InterfaceC50972wM6<Executor> interfaceC50972wM67, InterfaceC50972wM6<Executor> interfaceC50972wM68, byte[] bArr) {
        this.f113866a = interfaceC50972wM6;
        this.f113872g = interfaceC50972wM62;
        this.f113873h = interfaceC50972wM63;
        this.f113867b = interfaceC50972wM64;
        this.f113870e = interfaceC50972wM65;
        this.f113871f = interfaceC50972wM66;
        this.f113868c = interfaceC50972wM67;
        this.f113869d = interfaceC50972wM68;
    }
}
