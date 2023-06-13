package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23484g;
/* renamed from: io.reactivex.internal.operators.completable.h */
/* loaded from: classes6.dex */
public final class C23606h extends AbstractC23461c {

    /* renamed from: b */
    public final InterfaceC23496h f88401b;

    /* renamed from: c */
    public final InterfaceC23484g<? super Throwable> f88402c;

    /* renamed from: io.reactivex.internal.operators.completable.h$a */
    /* loaded from: classes6.dex */
    public final class C23607a implements InterfaceC23476f {

        /* renamed from: b */
        public final InterfaceC23476f f88403b;

        public C23607a(InterfaceC23476f interfaceC23476f) {
            this.f88403b = interfaceC23476f;
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onComplete() {
            try {
                C23606h.this.f88402c.accept(null);
                this.f88403b.onComplete();
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f88403b.onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            try {
                C23606h.this.f88402c.accept(th);
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                th = new CompositeException(th, th2);
            }
            this.f88403b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f88403b.onSubscribe(interfaceC23465c);
        }
    }

    public C23606h(InterfaceC23496h interfaceC23496h, InterfaceC23484g<? super Throwable> interfaceC23484g) {
        this.f88401b = interfaceC23496h;
        this.f88402c = interfaceC23484g;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        this.f88401b.mo33003g(new C23607a(interfaceC23476f));
    }
}
