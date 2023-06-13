package io.reactivex.internal.operators.flowable;

import io.reactivex.InterfaceC24494o;
import io.reactivex.internal.subscriptions.C24462f;
import io.reactivex.internal.subscriptions.EnumC24460d;
import io.reactivex.processors.AbstractC24509a;
/* renamed from: io.reactivex.internal.operators.flowable.a0 */
/* loaded from: classes6.dex */
public abstract class AbstractC23696a0<T, U> extends C24462f implements InterfaceC24494o<T> {
    private static final long serialVersionUID = -5604623027276966720L;

    /* renamed from: j */
    public final InterfaceC42141hT5<? super T> f88639j;

    /* renamed from: k */
    public final AbstractC24509a<U> f88640k;

    /* renamed from: l */
    public final InterfaceC46292oT5 f88641l;

    /* renamed from: m */
    public long f88642m;

    public AbstractC23696a0(InterfaceC42141hT5<? super T> interfaceC42141hT5, AbstractC24509a<U> abstractC24509a, InterfaceC46292oT5 interfaceC46292oT5) {
        super(false);
        this.f88639j = interfaceC42141hT5;
        this.f88640k = abstractC24509a;
        this.f88641l = interfaceC46292oT5;
    }

    @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
    /* renamed from: a */
    public final void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
        m32295f(interfaceC46292oT5);
    }

    @Override // io.reactivex.internal.subscriptions.C24462f, p000.InterfaceC46292oT5
    public final void cancel() {
        super.cancel();
        this.f88641l.cancel();
    }

    /* renamed from: g */
    public final void m32853g(U u) {
        m32295f(EnumC24460d.INSTANCE);
        long j = this.f88642m;
        if (j != 0) {
            this.f88642m = 0L;
            m32296e(j);
        }
        this.f88641l.mo21023o(1L);
        this.f88640k.onNext(u);
    }

    @Override // p000.InterfaceC42141hT5
    public final void onNext(T t) {
        this.f88642m++;
        this.f88639j.onNext(t);
    }
}
