package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23506a;
import io.reactivex.internal.functions.C23544b;
import java.util.Collection;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.observable.D1 */
/* loaded from: classes6.dex */
public final class C23987D1<T, U extends Collection<? super T>> extends AbstractC24145a<T, U> {

    /* renamed from: c */
    public final Callable<U> f89546c;

    /* renamed from: io.reactivex.internal.operators.observable.D1$a */
    /* loaded from: classes6.dex */
    public static final class C23988a<T, U extends Collection<? super T>> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super U> f89547b;

        /* renamed from: c */
        public InterfaceC23465c f89548c;

        /* renamed from: d */
        public U f89549d;

        public C23988a(InterfaceC23436D<? super U> interfaceC23436D, U u) {
            this.f89547b = interfaceC23436D;
            this.f89549d = u;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89548c.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89548c.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            U u = this.f89549d;
            this.f89549d = null;
            this.f89547b.onNext(u);
            this.f89547b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f89549d = null;
            this.f89547b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f89549d.add(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89548c, interfaceC23465c)) {
                this.f89548c = interfaceC23465c;
                this.f89547b.onSubscribe(this);
            }
        }
    }

    public C23987D1(InterfaceC23434B<T> interfaceC23434B, int i) {
        super(interfaceC23434B);
        this.f89546c = C23506a.m32969e(i);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super U> interfaceC23436D) {
        try {
            this.f90078b.subscribe(new C23988a(interfaceC23436D, (Collection) C23544b.m32923e(this.f89546c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C23475a.m33009b(th);
            EnumC23502e.m32987i(th, interfaceC23436D);
        }
    }

    public C23987D1(InterfaceC23434B<T> interfaceC23434B, Callable<U> callable) {
        super(interfaceC23434B);
        this.f89546c = callable;
    }
}
