package p000;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;
/* renamed from: LM6 */
/* loaded from: classes6.dex */
public final class LM6 implements InterfaceC50972wM6<KM6> {

    /* renamed from: a */
    public final InterfaceC50972wM6 f21316a;

    /* renamed from: b */
    public final InterfaceC50972wM6 f21317b;

    /* renamed from: c */
    public final InterfaceC50972wM6 f21318c;

    /* renamed from: d */
    public final InterfaceC50972wM6 f21319d;

    /* renamed from: e */
    public final InterfaceC50972wM6 f21320e;

    /* renamed from: f */
    public final InterfaceC50972wM6 f21321f;

    /* renamed from: g */
    public final /* synthetic */ int f21322g = 0;

    public LM6(InterfaceC50972wM6<HK6> interfaceC50972wM6, InterfaceC50972wM6<InterfaceC40920fP6> interfaceC50972wM62, InterfaceC50972wM6<C46823pM6> interfaceC50972wM63, InterfaceC50972wM6<Executor> interfaceC50972wM64, InterfaceC50972wM6<C51556xL6> interfaceC50972wM65, InterfaceC50972wM6<PJ6> interfaceC50972wM66) {
        this.f21316a = interfaceC50972wM6;
        this.f21317b = interfaceC50972wM62;
        this.f21318c = interfaceC50972wM63;
        this.f21319d = interfaceC50972wM64;
        this.f21320e = interfaceC50972wM65;
        this.f21321f = interfaceC50972wM66;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [KM6, AM6] */
    @Override // p000.InterfaceC50972wM6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ KM6 mo6967a() {
        if (this.f21322g == 0) {
            Object mo6967a = this.f21316a.mo6967a();
            InterfaceC46230oM6 m14271c = C48601sM6.m14271c(this.f21317b);
            Object mo6967a2 = this.f21318c.mo6967a();
            return new KM6((HK6) mo6967a, m14271c, (C46823pM6) mo6967a2, C48601sM6.m14271c(this.f21319d), (C51556xL6) this.f21320e.mo6967a(), (PJ6) this.f21321f.mo6967a());
        }
        String str = (String) this.f21321f.mo6967a();
        Object mo6967a3 = this.f21317b.mo6967a();
        Object mo6967a4 = this.f21320e.mo6967a();
        Context mo6967a5 = ((TO6) this.f21319d).mo6967a();
        Object mo6967a6 = this.f21318c.mo6967a();
        return new AM6(str != null ? new File(mo6967a5.getExternalFilesDir(null), str) : mo6967a5.getExternalFilesDir(null), (BK6) mo6967a3, (C51556xL6) mo6967a4, mo6967a5, (MM6) mo6967a6, C48601sM6.m14271c(this.f21316a));
    }

    public LM6(InterfaceC50972wM6<String> interfaceC50972wM6, InterfaceC50972wM6<BK6> interfaceC50972wM62, InterfaceC50972wM6<C51556xL6> interfaceC50972wM63, InterfaceC50972wM6<Context> interfaceC50972wM64, InterfaceC50972wM6<MM6> interfaceC50972wM65, InterfaceC50972wM6<Executor> interfaceC50972wM66, byte[] bArr) {
        this.f21321f = interfaceC50972wM6;
        this.f21317b = interfaceC50972wM62;
        this.f21320e = interfaceC50972wM63;
        this.f21319d = interfaceC50972wM64;
        this.f21318c = interfaceC50972wM65;
        this.f21316a = interfaceC50972wM66;
    }
}
