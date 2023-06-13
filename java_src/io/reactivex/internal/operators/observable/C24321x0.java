package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.observers.AbstractC23556a;
/* renamed from: io.reactivex.internal.operators.observable.x0 */
/* loaded from: classes6.dex */
public final class C24321x0<T, U> extends AbstractC24145a<T, U> {

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends U> f90696c;

    /* renamed from: io.reactivex.internal.operators.observable.x0$a */
    /* loaded from: classes6.dex */
    public static final class C24322a<T, U> extends AbstractC23556a<T, U> {

        /* renamed from: g */
        public final InterfaceC23492o<? super T, ? extends U> f90697g;

        public C24322a(InterfaceC23436D<? super U> interfaceC23436D, InterfaceC23492o<? super T, ? extends U> interfaceC23492o) {
            super(interfaceC23436D);
            this.f90697g = interfaceC23492o;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            return m32917g(i);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f88291e) {
                return;
            }
            if (this.f88292f != 0) {
                this.f88288b.onNext(null);
                return;
            }
            try {
                this.f88288b.onNext(C23544b.m32923e(this.f90697g.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                m32918d(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public U poll() throws Exception {
            T poll = this.f88290d.poll();
            if (poll != null) {
                return (U) C23544b.m32923e(this.f90697g.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    public C24321x0(InterfaceC23434B<T> interfaceC23434B, InterfaceC23492o<? super T, ? extends U> interfaceC23492o) {
        super(interfaceC23434B);
        this.f90696c = interfaceC23492o;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super U> interfaceC23436D) {
        this.f90078b.subscribe(new C24322a(interfaceC23436D, this.f90696c));
    }
}
