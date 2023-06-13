package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.observers.AbstractC23556a;
/* renamed from: io.reactivex.internal.operators.observable.M */
/* loaded from: classes6.dex */
public final class C24056M<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23484g<? super T> f89794c;

    /* renamed from: io.reactivex.internal.operators.observable.M$a */
    /* loaded from: classes6.dex */
    public static final class C24057a<T> extends AbstractC23556a<T, T> {

        /* renamed from: g */
        public final InterfaceC23484g<? super T> f89795g;

        public C24057a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23484g<? super T> interfaceC23484g) {
            super(interfaceC23436D);
            this.f89795g = interfaceC23484g;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            return m32917g(i);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f88288b.onNext(t);
            if (this.f88292f == 0) {
                try {
                    this.f89795g.accept(t);
                } catch (Throwable th) {
                    m32918d(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() throws Exception {
            T poll = this.f88290d.poll();
            if (poll != null) {
                this.f89795g.accept(poll);
            }
            return poll;
        }
    }

    public C24056M(InterfaceC23434B<T> interfaceC23434B, InterfaceC23484g<? super T> interfaceC23484g) {
        super(interfaceC23434B);
        this.f89794c = interfaceC23484g;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24057a(interfaceC23436D, this.f89794c));
    }
}
