package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: io.reactivex.internal.operators.observable.G1 */
/* loaded from: classes6.dex */
public final class C24009G1<T, D> extends Observable<T> {

    /* renamed from: b */
    public final Callable<? extends D> f89617b;

    /* renamed from: c */
    public final InterfaceC23492o<? super D, ? extends InterfaceC23434B<? extends T>> f89618c;

    /* renamed from: d */
    public final InterfaceC23484g<? super D> f89619d;

    /* renamed from: e */
    public final boolean f89620e;

    /* renamed from: io.reactivex.internal.operators.observable.G1$a */
    /* loaded from: classes6.dex */
    public static final class C24010a<T, D> extends AtomicBoolean implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = 5904473792286235046L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89621b;

        /* renamed from: c */
        public final D f89622c;

        /* renamed from: d */
        public final InterfaceC23484g<? super D> f89623d;

        /* renamed from: e */
        public final boolean f89624e;

        /* renamed from: f */
        public InterfaceC23465c f89625f;

        public C24010a(InterfaceC23436D<? super T> interfaceC23436D, D d, InterfaceC23484g<? super D> interfaceC23484g, boolean z) {
            this.f89621b = interfaceC23436D;
            this.f89622c = d;
            this.f89623d = interfaceC23484g;
            this.f89624e = z;
        }

        /* renamed from: a */
        public void m32659a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f89623d.accept((D) this.f89622c);
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    C24508a.m31988u(th);
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            m32659a();
            this.f89625f.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return get();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f89624e) {
                if (compareAndSet(false, true)) {
                    try {
                        this.f89623d.accept((D) this.f89622c);
                    } catch (Throwable th) {
                        C23475a.m33009b(th);
                        this.f89621b.onError(th);
                        return;
                    }
                }
                this.f89625f.dispose();
                this.f89621b.onComplete();
                return;
            }
            this.f89621b.onComplete();
            this.f89625f.dispose();
            m32659a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89624e) {
                if (compareAndSet(false, true)) {
                    try {
                        this.f89623d.accept((D) this.f89622c);
                    } catch (Throwable th2) {
                        C23475a.m33009b(th2);
                        th = new CompositeException(th, th2);
                    }
                }
                this.f89625f.dispose();
                this.f89621b.onError(th);
                return;
            }
            this.f89621b.onError(th);
            this.f89625f.dispose();
            m32659a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f89621b.onNext(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89625f, interfaceC23465c)) {
                this.f89625f = interfaceC23465c;
                this.f89621b.onSubscribe(this);
            }
        }
    }

    public C24009G1(Callable<? extends D> callable, InterfaceC23492o<? super D, ? extends InterfaceC23434B<? extends T>> interfaceC23492o, InterfaceC23484g<? super D> interfaceC23484g, boolean z) {
        this.f89617b = callable;
        this.f89618c = interfaceC23492o;
        this.f89619d = interfaceC23484g;
        this.f89620e = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        try {
            D call = this.f89617b.call();
            try {
                ((InterfaceC23434B) C23544b.m32923e(this.f89618c.apply(call), "The sourceSupplier returned a null ObservableSource")).subscribe(new C24010a(interfaceC23436D, call, this.f89619d, this.f89620e));
            } catch (Throwable th) {
                C23475a.m33009b(th);
                try {
                    this.f89619d.accept(call);
                    EnumC23502e.m32987i(th, interfaceC23436D);
                } catch (Throwable th2) {
                    C23475a.m33009b(th2);
                    EnumC23502e.m32987i(new CompositeException(th, th2), interfaceC23436D);
                }
            }
        } catch (Throwable th3) {
            C23475a.m33009b(th3);
            EnumC23502e.m32987i(th3, interfaceC23436D);
        }
    }
}
