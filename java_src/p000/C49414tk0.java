package p000;

import io.reactivex.AbstractC23437E;
import java.util.concurrent.ExecutorService;
import p000.InterfaceC41706gk0;
/* renamed from: tk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49414tk0 implements InterfaceC49405tj1<InterfaceC41706gk0.InterfaceC22420b> {

    /* renamed from: a */
    public final Z94<ExecutorService> f110952a;

    /* renamed from: b */
    public final Z94<AbstractC23437E> f110953b;

    /* renamed from: c */
    public final Z94<ExecutorService> f110954c;

    public C49414tk0(Z94<ExecutorService> z94, Z94<AbstractC23437E> z942, Z94<ExecutorService> z943) {
        this.f110952a = z94;
        this.f110953b = z942;
        this.f110954c = z943;
    }

    /* renamed from: a */
    public static C49414tk0 m11833a(Z94<ExecutorService> z94, Z94<AbstractC23437E> z942, Z94<ExecutorService> z943) {
        return new C49414tk0(z94, z942, z943);
    }

    /* renamed from: c */
    public static InterfaceC41706gk0.InterfaceC22420b m11831c(ExecutorService executorService, AbstractC23437E abstractC23437E, ExecutorService executorService2) {
        return (InterfaceC41706gk0.InterfaceC22420b) C52272yZ3.m3257d(InterfaceC41706gk0.AbstractC22421c.m37848m(executorService, abstractC23437E, executorService2));
    }

    @Override // p000.Z94
    /* renamed from: b */
    public InterfaceC41706gk0.InterfaceC22420b get() {
        return m11831c(this.f110952a.get(), this.f110953b.get(), this.f110954c.get());
    }
}
