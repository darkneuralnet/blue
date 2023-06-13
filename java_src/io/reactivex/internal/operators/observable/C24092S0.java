package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23482e;
import io.reactivex.internal.disposables.C23505h;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.operators.observable.S0 */
/* loaded from: classes6.dex */
public final class C24092S0<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23482e f89923c;

    /* renamed from: io.reactivex.internal.operators.observable.S0$a */
    /* loaded from: classes6.dex */
    public static final class C24093a<T> extends AtomicInteger implements InterfaceC23436D<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89924b;

        /* renamed from: c */
        public final C23505h f89925c;

        /* renamed from: d */
        public final InterfaceC23434B<? extends T> f89926d;

        /* renamed from: e */
        public final InterfaceC23482e f89927e;

        public C24093a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23482e interfaceC23482e, C23505h c23505h, InterfaceC23434B<? extends T> interfaceC23434B) {
            this.f89924b = interfaceC23436D;
            this.f89925c = c23505h;
            this.f89926d = interfaceC23434B;
            this.f89927e = interfaceC23482e;
        }

        /* renamed from: a */
        public void m32603a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                do {
                    this.f89926d.subscribe(this);
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            try {
                if (this.f89927e.mo33005a()) {
                    this.f89924b.onComplete();
                } else {
                    m32603a();
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89924b.onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f89924b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f89924b.onNext(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f89925c.m32981a(interfaceC23465c);
        }
    }

    public C24092S0(Observable<T> observable, InterfaceC23482e interfaceC23482e) {
        super(observable);
        this.f89923c = interfaceC23482e;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C23505h c23505h = new C23505h();
        interfaceC23436D.onSubscribe(c23505h);
        new C24093a(interfaceC23436D, this.f89923c, c23505h, this.f90078b).m32603a();
    }
}
