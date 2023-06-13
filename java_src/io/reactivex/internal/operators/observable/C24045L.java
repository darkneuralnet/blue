package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.observers.AbstractC23556a;
/* renamed from: io.reactivex.internal.operators.observable.L */
/* loaded from: classes6.dex */
public final class C24045L<T, K> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23492o<? super T, K> f89739c;

    /* renamed from: d */
    public final InterfaceC23481d<? super K, ? super K> f89740d;

    /* renamed from: io.reactivex.internal.operators.observable.L$a */
    /* loaded from: classes6.dex */
    public static final class C24046a<T, K> extends AbstractC23556a<T, T> {

        /* renamed from: g */
        public final InterfaceC23492o<? super T, K> f89741g;

        /* renamed from: h */
        public final InterfaceC23481d<? super K, ? super K> f89742h;

        /* renamed from: i */
        public K f89743i;

        /* renamed from: j */
        public boolean f89744j;

        public C24046a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23492o<? super T, K> interfaceC23492o, InterfaceC23481d<? super K, ? super K> interfaceC23481d) {
            super(interfaceC23436D);
            this.f89741g = interfaceC23492o;
            this.f89742h = interfaceC23481d;
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
                this.f88288b.onNext(t);
                return;
            }
            try {
                K apply = this.f89741g.apply(t);
                if (this.f89744j) {
                    boolean test = this.f89742h.test((K) this.f89743i, apply);
                    this.f89743i = apply;
                    if (test) {
                        return;
                    }
                } else {
                    this.f89744j = true;
                    this.f89743i = apply;
                }
                this.f88288b.onNext(t);
            } catch (Throwable th) {
                m32918d(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() throws Exception {
            while (true) {
                T poll = this.f88290d.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f89741g.apply(poll);
                if (!this.f89744j) {
                    this.f89744j = true;
                    this.f89743i = apply;
                    return poll;
                } else if (!this.f89742h.test((K) this.f89743i, apply)) {
                    this.f89743i = apply;
                    return poll;
                } else {
                    this.f89743i = apply;
                }
            }
        }
    }

    public C24045L(InterfaceC23434B<T> interfaceC23434B, InterfaceC23492o<? super T, K> interfaceC23492o, InterfaceC23481d<? super K, ? super K> interfaceC23481d) {
        super(interfaceC23434B);
        this.f89739c = interfaceC23492o;
        this.f89740d = interfaceC23481d;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24046a(interfaceC23436D, this.f89739c, this.f89740d));
    }
}
