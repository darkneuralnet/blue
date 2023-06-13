package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.subjects.C24558d;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.K0 */
/* loaded from: classes6.dex */
public final class C24039K0<T, R> extends AbstractC24145a<T, R> {

    /* renamed from: c */
    public final InterfaceC23492o<? super Observable<T>, ? extends InterfaceC23434B<R>> f89717c;

    /* renamed from: io.reactivex.internal.operators.observable.K0$a */
    /* loaded from: classes6.dex */
    public static final class C24040a<T, R> implements InterfaceC23436D<T> {

        /* renamed from: b */
        public final C24558d<T> f89718b;

        /* renamed from: c */
        public final AtomicReference<InterfaceC23465c> f89719c;

        public C24040a(C24558d<T> c24558d, AtomicReference<InterfaceC23465c> atomicReference) {
            this.f89718b = c24558d;
            this.f89719c = atomicReference;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89718b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f89718b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f89718b.onNext(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this.f89719c, interfaceC23465c);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.K0$b */
    /* loaded from: classes6.dex */
    public static final class C24041b<T, R> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<R>, InterfaceC23465c {
        private static final long serialVersionUID = 854110278590336484L;

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f89720b;

        /* renamed from: c */
        public InterfaceC23465c f89721c;

        public C24041b(InterfaceC23436D<? super R> interfaceC23436D) {
            this.f89720b = interfaceC23436D;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89721c.dispose();
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89721c.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            EnumC23501d.m33000a(this);
            this.f89720b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            EnumC23501d.m33000a(this);
            this.f89720b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(R r) {
            this.f89720b.onNext(r);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89721c, interfaceC23465c)) {
                this.f89721c = interfaceC23465c;
                this.f89720b.onSubscribe(this);
            }
        }
    }

    public C24039K0(InterfaceC23434B<T> interfaceC23434B, InterfaceC23492o<? super Observable<T>, ? extends InterfaceC23434B<R>> interfaceC23492o) {
        super(interfaceC23434B);
        this.f89717c = interfaceC23492o;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        C24558d m31902e = C24558d.m31902e();
        try {
            InterfaceC23434B interfaceC23434B = (InterfaceC23434B) C23544b.m32923e(this.f89717c.apply(m31902e), "The selector returned a null ObservableSource");
            C24041b c24041b = new C24041b(interfaceC23436D);
            interfaceC23434B.subscribe(c24041b);
            this.f90078b.subscribe(new C24040a(m31902e, c24041b));
        } catch (Throwable th) {
            C23475a.m33009b(th);
            EnumC23502e.m32987i(th, interfaceC23436D);
        }
    }
}
