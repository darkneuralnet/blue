package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.observers.AbstractC23556a;
import io.reactivex.plugins.C24508a;
import java.util.Collection;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.observable.K */
/* loaded from: classes6.dex */
public final class C24037K<T, K> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23492o<? super T, K> f89713c;

    /* renamed from: d */
    public final Callable<? extends Collection<? super K>> f89714d;

    /* renamed from: io.reactivex.internal.operators.observable.K$a */
    /* loaded from: classes6.dex */
    public static final class C24038a<T, K> extends AbstractC23556a<T, T> {

        /* renamed from: g */
        public final Collection<? super K> f89715g;

        /* renamed from: h */
        public final InterfaceC23492o<? super T, K> f89716h;

        public C24038a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23492o<? super T, K> interfaceC23492o, Collection<? super K> collection) {
            super(interfaceC23436D);
            this.f89716h = interfaceC23492o;
            this.f89715g = collection;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            return m32917g(i);
        }

        @Override // io.reactivex.internal.observers.AbstractC23556a, io.reactivex.internal.fuseable.InterfaceC23555j
        public void clear() {
            this.f89715g.clear();
            super.clear();
        }

        @Override // io.reactivex.internal.observers.AbstractC23556a, io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (!this.f88291e) {
                this.f88291e = true;
                this.f89715g.clear();
                this.f88288b.onComplete();
            }
        }

        @Override // io.reactivex.internal.observers.AbstractC23556a, io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f88291e) {
                C24508a.m31988u(th);
                return;
            }
            this.f88291e = true;
            this.f89715g.clear();
            this.f88288b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f88291e) {
                return;
            }
            if (this.f88292f == 0) {
                try {
                    if (this.f89715g.add(C23544b.m32923e(this.f89716h.apply(t), "The keySelector returned a null key"))) {
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
            } while (!this.f89715g.add((Object) C23544b.m32923e(this.f89716h.apply(poll), "The keySelector returned a null key")));
            return poll;
        }
    }

    public C24037K(InterfaceC23434B<T> interfaceC23434B, InterfaceC23492o<? super T, K> interfaceC23492o, Callable<? extends Collection<? super K>> callable) {
        super(interfaceC23434B);
        this.f89713c = interfaceC23492o;
        this.f89714d = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        try {
            this.f90078b.subscribe(new C24038a(interfaceC23436D, this.f89713c, (Collection) C23544b.m32923e(this.f89714d.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C23475a.m33009b(th);
            EnumC23502e.m32987i(th, interfaceC23436D);
        }
    }
}
