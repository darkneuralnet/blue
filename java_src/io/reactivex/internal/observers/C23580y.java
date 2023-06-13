package io.reactivex.internal.observers;

import io.reactivex.InterfaceC23476f;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
/* renamed from: io.reactivex.internal.observers.y */
/* loaded from: classes6.dex */
public final class C23580y<T> implements InterfaceC23476f, InterfaceC46292oT5 {

    /* renamed from: b */
    public final InterfaceC42141hT5<? super T> f88338b;

    /* renamed from: c */
    public InterfaceC23465c f88339c;

    public C23580y(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f88338b = interfaceC42141hT5;
    }

    @Override // p000.InterfaceC46292oT5
    public void cancel() {
        this.f88339c.dispose();
    }

    @Override // p000.InterfaceC46292oT5
    /* renamed from: o */
    public void mo21023o(long j) {
    }

    @Override // io.reactivex.InterfaceC23476f
    public void onComplete() {
        this.f88338b.onComplete();
    }

    @Override // io.reactivex.InterfaceC23476f
    public void onError(Throwable th) {
        this.f88338b.onError(th);
    }

    @Override // io.reactivex.InterfaceC23476f
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        if (EnumC23501d.m32993j(this.f88339c, interfaceC23465c)) {
            this.f88339c = interfaceC23465c;
            this.f88338b.mo31867a(this);
        }
    }
}
