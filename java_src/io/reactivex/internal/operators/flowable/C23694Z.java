package io.reactivex.internal.operators.flowable;

import io.reactivex.InterfaceC24494o;
import io.reactivex.internal.subscriptions.EnumC24463g;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.flowable.Z */
/* loaded from: classes6.dex */
public final class C23694Z<T, U> extends AtomicInteger implements InterfaceC24494o<Object>, InterfaceC46292oT5 {
    private static final long serialVersionUID = 2827772011130406689L;

    /* renamed from: b */
    public final InterfaceC45761na4<T> f88634b;

    /* renamed from: c */
    public final AtomicReference<InterfaceC46292oT5> f88635c = new AtomicReference<>();

    /* renamed from: d */
    public final AtomicLong f88636d = new AtomicLong();

    /* renamed from: e */
    public AbstractC23696a0<T, U> f88637e;

    public C23694Z(InterfaceC45761na4<T> interfaceC45761na4) {
        this.f88634b = interfaceC45761na4;
    }

    @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
    /* renamed from: a */
    public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
        EnumC24463g.m32292c(this.f88635c, this.f88636d, interfaceC46292oT5);
    }

    @Override // p000.InterfaceC46292oT5
    public void cancel() {
        EnumC24463g.m32294a(this.f88635c);
    }

    @Override // p000.InterfaceC46292oT5
    /* renamed from: o */
    public void mo21023o(long j) {
        EnumC24463g.m32293b(this.f88635c, this.f88636d, j);
    }

    @Override // p000.InterfaceC42141hT5
    public void onComplete() {
        this.f88637e.cancel();
        this.f88637e.f88639j.onComplete();
    }

    @Override // p000.InterfaceC42141hT5
    public void onError(Throwable th) {
        this.f88637e.cancel();
        this.f88637e.f88639j.onError(th);
    }

    @Override // p000.InterfaceC42141hT5
    public void onNext(Object obj) {
        if (getAndIncrement() == 0) {
            while (this.f88635c.get() != EnumC24463g.CANCELLED) {
                this.f88634b.mo23497c(this.f88637e);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }
}
