package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23506a;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23549d;
import io.reactivex.plugins.C24508a;
import java.util.Collection;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.observable.E1 */
/* loaded from: classes6.dex */
public final class C23994E1<T, U extends Collection<? super T>> extends AbstractC23442F<U> implements InterfaceC23549d<U> {

    /* renamed from: b */
    public final InterfaceC23434B<T> f89579b;

    /* renamed from: c */
    public final Callable<U> f89580c;

    /* renamed from: io.reactivex.internal.operators.observable.E1$a */
    /* loaded from: classes6.dex */
    public static final class C23995a<T, U extends Collection<? super T>> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23445I<? super U> f89581b;

        /* renamed from: c */
        public U f89582c;

        /* renamed from: d */
        public InterfaceC23465c f89583d;

        public C23995a(InterfaceC23445I<? super U> interfaceC23445I, U u) {
            this.f89581b = interfaceC23445I;
            this.f89582c = u;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89583d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89583d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            U u = this.f89582c;
            this.f89582c = null;
            this.f89581b.onSuccess(u);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f89582c = null;
            this.f89581b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f89582c.add(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89583d, interfaceC23465c)) {
                this.f89583d = interfaceC23465c;
                this.f89581b.onSubscribe(this);
            }
        }
    }

    public C23994E1(InterfaceC23434B<T> interfaceC23434B, int i) {
        this.f89579b = interfaceC23434B;
        this.f89580c = C23506a.m32969e(i);
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super U> interfaceC23445I) {
        try {
            this.f89579b.subscribe(new C23995a(interfaceC23445I, (Collection) C23544b.m32923e(this.f89580c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C23475a.m33009b(th);
            EnumC23502e.m32986j(th, interfaceC23445I);
        }
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23549d
    /* renamed from: c */
    public Observable<U> mo32427c() {
        return C24508a.m31994o(new C23987D1(this.f89579b, this.f89580c));
    }

    public C23994E1(InterfaceC23434B<T> interfaceC23434B, Callable<U> callable) {
        this.f89579b = interfaceC23434B;
        this.f89580c = callable;
    }
}
