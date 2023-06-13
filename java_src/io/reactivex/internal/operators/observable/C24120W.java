package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.observers.AbstractC23556a;
/* renamed from: io.reactivex.internal.operators.observable.W */
/* loaded from: classes6.dex */
public final class C24120W<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23494q<? super T> f89991c;

    /* renamed from: io.reactivex.internal.operators.observable.W$a */
    /* loaded from: classes6.dex */
    public static final class C24121a<T> extends AbstractC23556a<T, T> {

        /* renamed from: g */
        public final InterfaceC23494q<? super T> f89992g;

        public C24121a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23494q<? super T> interfaceC23494q) {
            super(interfaceC23436D);
            this.f89992g = interfaceC23494q;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            return m32917g(i);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f88292f == 0) {
                try {
                    if (this.f89992g.test(t)) {
                        this.f88288b.onNext(t);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    m32918d(th);
                    return;
                }
            }
            this.f88288b.onNext(null);
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() throws Exception {
            T poll;
            do {
                poll = this.f88290d.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f89992g.test(poll));
            return poll;
        }
    }

    public C24120W(InterfaceC23434B<T> interfaceC23434B, InterfaceC23494q<? super T> interfaceC23494q) {
        super(interfaceC23434B);
        this.f89991c = interfaceC23494q;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24121a(interfaceC23436D, this.f89991c));
    }
}
