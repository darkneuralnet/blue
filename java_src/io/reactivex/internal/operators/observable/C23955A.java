package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
/* renamed from: io.reactivex.internal.operators.observable.A */
/* loaded from: classes6.dex */
public final class C23955A<T> extends AbstractC24145a<T, Long> {

    /* renamed from: io.reactivex.internal.operators.observable.A$a */
    /* loaded from: classes6.dex */
    public static final class C23956a implements InterfaceC23436D<Object>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super Long> f89453b;

        /* renamed from: c */
        public InterfaceC23465c f89454c;

        /* renamed from: d */
        public long f89455d;

        public C23956a(InterfaceC23436D<? super Long> interfaceC23436D) {
            this.f89453b = interfaceC23436D;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89454c.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89454c.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89453b.onNext(Long.valueOf(this.f89455d));
            this.f89453b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f89453b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(Object obj) {
            this.f89455d++;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89454c, interfaceC23465c)) {
                this.f89454c = interfaceC23465c;
                this.f89453b.onSubscribe(this);
            }
        }
    }

    public C23955A(InterfaceC23434B<T> interfaceC23434B) {
        super(interfaceC23434B);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super Long> interfaceC23436D) {
        this.f90078b.subscribe(new C23956a(interfaceC23436D));
    }
}
