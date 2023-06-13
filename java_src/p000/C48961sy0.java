package p000;

import io.reactivex.AbstractC23437E;
import java.util.concurrent.ExecutorService;
/* renamed from: sy0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48961sy0 implements InterfaceC49405tj1<C48368ry0> {

    /* renamed from: a */
    public final Z94<String> f109615a;

    /* renamed from: b */
    public final Z94<InterfaceC50799w41> f109616b;

    /* renamed from: c */
    public final Z94<ExecutorService> f109617c;

    /* renamed from: d */
    public final Z94<AbstractC23437E> f109618d;

    public C48961sy0(Z94<String> z94, Z94<InterfaceC50799w41> z942, Z94<ExecutorService> z943, Z94<AbstractC23437E> z944) {
        this.f109615a = z94;
        this.f109616b = z942;
        this.f109617c = z943;
        this.f109618d = z944;
    }

    /* renamed from: a */
    public static C48961sy0 m13306a(Z94<String> z94, Z94<InterfaceC50799w41> z942, Z94<ExecutorService> z943, Z94<AbstractC23437E> z944) {
        return new C48961sy0(z94, z942, z943, z944);
    }

    /* renamed from: c */
    public static C48368ry0 m13304c(String str, InterfaceC50799w41 interfaceC50799w41, ExecutorService executorService, AbstractC23437E abstractC23437E) {
        return new C48368ry0(str, interfaceC50799w41, executorService, abstractC23437E);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C48368ry0 get() {
        return m13304c(this.f109615a.get(), this.f109616b.get(), this.f109617c.get(), this.f109618d.get());
    }
}
