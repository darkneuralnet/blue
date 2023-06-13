package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.z */
/* loaded from: classes6.dex */
public final class C24331z<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23447K<? extends T> f90736c;

    /* renamed from: io.reactivex.internal.operators.observable.z$a */
    /* loaded from: classes6.dex */
    public static final class C24332a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<T>, InterfaceC23445I<T>, InterfaceC23465c {
        private static final long serialVersionUID = -1953724749712440952L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90737b;

        /* renamed from: c */
        public InterfaceC23447K<? extends T> f90738c;

        /* renamed from: d */
        public boolean f90739d;

        public C24332a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23447K<? extends T> interfaceC23447K) {
            this.f90737b = interfaceC23436D;
            this.f90738c = interfaceC23447K;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90739d = true;
            EnumC23501d.m32998c(this, null);
            InterfaceC23447K<? extends T> interfaceC23447K = this.f90738c;
            this.f90738c = null;
            interfaceC23447K.mo33096a(this);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90737b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f90737b.onNext(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this, interfaceC23465c) && !this.f90739d) {
                this.f90737b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            this.f90737b.onNext(t);
            this.f90737b.onComplete();
        }
    }

    public C24331z(Observable<T> observable, InterfaceC23447K<? extends T> interfaceC23447K) {
        super(observable);
        this.f90736c = interfaceC23447K;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24332a(interfaceC23436D, this.f90736c));
    }
}
