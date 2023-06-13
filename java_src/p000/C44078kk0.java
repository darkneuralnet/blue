package p000;

import io.reactivex.AbstractC23437E;
import java.util.concurrent.ExecutorService;
import p000.InterfaceC41706gk0;
/* renamed from: kk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44078kk0 implements InterfaceC49405tj1<AbstractC23437E> {

    /* renamed from: a */
    public final Z94<ExecutorService> f94845a;

    public C44078kk0(Z94<ExecutorService> z94) {
        this.f94845a = z94;
    }

    /* renamed from: a */
    public static C44078kk0 m28558a(Z94<ExecutorService> z94) {
        return new C44078kk0(z94);
    }

    /* renamed from: c */
    public static AbstractC23437E m28556c(ExecutorService executorService) {
        return (AbstractC23437E) C52272yZ3.m3257d(InterfaceC41706gk0.AbstractC22421c.m37857d(executorService));
    }

    @Override // p000.Z94
    /* renamed from: b */
    public AbstractC23437E get() {
        return m28556c(this.f94845a.get());
    }
}
