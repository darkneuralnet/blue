package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23550e;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.operators.observable.a1 */
/* loaded from: classes6.dex */
public final class C24149a1 {

    /* renamed from: io.reactivex.internal.operators.observable.a1$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC24150a<T> extends AtomicInteger implements InterfaceC23550e<T>, Runnable {
        private static final long serialVersionUID = 3880992722410194083L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90091b;

        /* renamed from: c */
        public final T f90092c;

        public RunnableC24150a(InterfaceC23436D<? super T> interfaceC23436D, T t) {
            this.f90091b = interfaceC23436D;
            this.f90092c = t;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            if ((i & 1) != 0) {
                lazySet(1);
                return 1;
            }
            return 0;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public void clear() {
            lazySet(3);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            set(3);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return get() == 3;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() throws Exception {
            if (get() == 1) {
                lazySet(3);
                return this.f90092c;
            }
            return null;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f90091b.onNext((T) this.f90092c);
                if (get() == 2) {
                    lazySet(3);
                    this.f90091b.onComplete();
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.a1$b */
    /* loaded from: classes6.dex */
    public static final class C24151b<T, R> extends Observable<R> {

        /* renamed from: b */
        public final T f90093b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> f90094c;

        public C24151b(T t, InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o) {
            this.f90093b = t;
            this.f90094c = interfaceC23492o;
        }

        @Override // io.reactivex.Observable
        public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
            try {
                InterfaceC23434B interfaceC23434B = (InterfaceC23434B) C23544b.m32923e(this.f90094c.apply((T) this.f90093b), "The mapper returned a null ObservableSource");
                if (interfaceC23434B instanceof Callable) {
                    try {
                        Object call = ((Callable) interfaceC23434B).call();
                        if (call == null) {
                            EnumC23502e.m32990d(interfaceC23436D);
                            return;
                        }
                        RunnableC24150a runnableC24150a = new RunnableC24150a(interfaceC23436D, call);
                        interfaceC23436D.onSubscribe(runnableC24150a);
                        runnableC24150a.run();
                        return;
                    } catch (Throwable th) {
                        C23475a.m33009b(th);
                        EnumC23502e.m32987i(th, interfaceC23436D);
                        return;
                    }
                }
                interfaceC23434B.subscribe(interfaceC23436D);
            } catch (Throwable th2) {
                EnumC23502e.m32987i(th2, interfaceC23436D);
            }
        }
    }

    private C24149a1() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T, U> Observable<U> m32535a(T t, InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends U>> interfaceC23492o) {
        return C24508a.m31994o(new C24151b(t, interfaceC23492o));
    }

    /* renamed from: b */
    public static <T, R> boolean m32534b(InterfaceC23434B<T> interfaceC23434B, InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o) {
        if (interfaceC23434B instanceof Callable) {
            try {
                Object obj = (Object) ((Callable) interfaceC23434B).call();
                if (obj == 0) {
                    EnumC23502e.m32990d(interfaceC23436D);
                    return true;
                }
                try {
                    InterfaceC23434B interfaceC23434B2 = (InterfaceC23434B) C23544b.m32923e(interfaceC23492o.apply(obj), "The mapper returned a null ObservableSource");
                    if (interfaceC23434B2 instanceof Callable) {
                        try {
                            Object call = ((Callable) interfaceC23434B2).call();
                            if (call == null) {
                                EnumC23502e.m32990d(interfaceC23436D);
                                return true;
                            }
                            RunnableC24150a runnableC24150a = new RunnableC24150a(interfaceC23436D, call);
                            interfaceC23436D.onSubscribe(runnableC24150a);
                            runnableC24150a.run();
                        } catch (Throwable th) {
                            C23475a.m33009b(th);
                            EnumC23502e.m32987i(th, interfaceC23436D);
                            return true;
                        }
                    } else {
                        interfaceC23434B2.subscribe(interfaceC23436D);
                    }
                    return true;
                } catch (Throwable th2) {
                    C23475a.m33009b(th2);
                    EnumC23502e.m32987i(th2, interfaceC23436D);
                    return true;
                }
            } catch (Throwable th3) {
                C23475a.m33009b(th3);
                EnumC23502e.m32987i(th3, interfaceC23436D);
                return true;
            }
        }
        return false;
    }
}
