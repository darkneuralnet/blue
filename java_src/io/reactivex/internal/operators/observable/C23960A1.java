package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.C23505h;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.operators.observable.C23970B1;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.observable.A1 */
/* loaded from: classes6.dex */
public final class C23960A1<T, U, V> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23434B<U> f89464c;

    /* renamed from: d */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<V>> f89465d;

    /* renamed from: e */
    public final InterfaceC23434B<? extends T> f89466e;

    /* renamed from: io.reactivex.internal.operators.observable.A1$a */
    /* loaded from: classes6.dex */
    public static final class C23961a extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<Object>, InterfaceC23465c {
        private static final long serialVersionUID = 8708641127342403073L;

        /* renamed from: b */
        public final InterfaceC23964d f89467b;

        /* renamed from: c */
        public final long f89468c;

        public C23961a(long j, InterfaceC23964d interfaceC23964d) {
            this.f89468c = j;
            this.f89467b = interfaceC23964d;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            Object obj = get();
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (obj != enumC23501d) {
                lazySet(enumC23501d);
                this.f89467b.mo32674b(this.f89468c);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            Object obj = get();
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (obj != enumC23501d) {
                lazySet(enumC23501d);
                this.f89467b.mo32683a(this.f89468c, th);
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(Object obj) {
            InterfaceC23465c interfaceC23465c = (InterfaceC23465c) get();
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (interfaceC23465c != enumC23501d) {
                interfaceC23465c.dispose();
                lazySet(enumC23501d);
                this.f89467b.mo32674b(this.f89468c);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this, interfaceC23465c);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.A1$b */
    /* loaded from: classes6.dex */
    public static final class C23962b<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<T>, InterfaceC23465c, InterfaceC23964d {
        private static final long serialVersionUID = -7508389464265974549L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89469b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<?>> f89470c;

        /* renamed from: d */
        public final C23505h f89471d = new C23505h();

        /* renamed from: e */
        public final AtomicLong f89472e = new AtomicLong();

        /* renamed from: f */
        public final AtomicReference<InterfaceC23465c> f89473f = new AtomicReference<>();

        /* renamed from: g */
        public InterfaceC23434B<? extends T> f89474g;

        public C23962b(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23492o<? super T, ? extends InterfaceC23434B<?>> interfaceC23492o, InterfaceC23434B<? extends T> interfaceC23434B) {
            this.f89469b = interfaceC23436D;
            this.f89470c = interfaceC23492o;
            this.f89474g = interfaceC23434B;
        }

        @Override // io.reactivex.internal.operators.observable.C23960A1.InterfaceC23964d
        /* renamed from: a */
        public void mo32683a(long j, Throwable th) {
            if (this.f89472e.compareAndSet(j, LongCompanionObject.MAX_VALUE)) {
                EnumC23501d.m33000a(this);
                this.f89469b.onError(th);
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.internal.operators.observable.C23970B1.InterfaceC23974d
        /* renamed from: b */
        public void mo32674b(long j) {
            if (this.f89472e.compareAndSet(j, LongCompanionObject.MAX_VALUE)) {
                EnumC23501d.m33000a(this.f89473f);
                InterfaceC23434B<? extends T> interfaceC23434B = this.f89474g;
                this.f89474g = null;
                interfaceC23434B.subscribe(new C23970B1.C23971a(this.f89469b, this));
            }
        }

        /* renamed from: c */
        public void m32685c(InterfaceC23434B<?> interfaceC23434B) {
            if (interfaceC23434B != null) {
                C23961a c23961a = new C23961a(0L, this);
                if (this.f89471d.m32981a(c23961a)) {
                    interfaceC23434B.subscribe(c23961a);
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this.f89473f);
            EnumC23501d.m33000a(this);
            this.f89471d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f89472e.getAndSet(LongCompanionObject.MAX_VALUE) != LongCompanionObject.MAX_VALUE) {
                this.f89471d.dispose();
                this.f89469b.onComplete();
                this.f89471d.dispose();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89472e.getAndSet(LongCompanionObject.MAX_VALUE) != LongCompanionObject.MAX_VALUE) {
                this.f89471d.dispose();
                this.f89469b.onError(th);
                this.f89471d.dispose();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            long j = this.f89472e.get();
            if (j != LongCompanionObject.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.f89472e.compareAndSet(j, j2)) {
                    InterfaceC23465c interfaceC23465c = this.f89471d.get();
                    if (interfaceC23465c != null) {
                        interfaceC23465c.dispose();
                    }
                    this.f89469b.onNext(t);
                    try {
                        InterfaceC23434B interfaceC23434B = (InterfaceC23434B) C23544b.m32923e(this.f89470c.apply(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        C23961a c23961a = new C23961a(j2, this);
                        if (this.f89471d.m32981a(c23961a)) {
                            interfaceC23434B.subscribe(c23961a);
                        }
                    } catch (Throwable th) {
                        C23475a.m33009b(th);
                        this.f89473f.get().dispose();
                        this.f89472e.getAndSet(LongCompanionObject.MAX_VALUE);
                        this.f89469b.onError(th);
                    }
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this.f89473f, interfaceC23465c);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.A1$c */
    /* loaded from: classes6.dex */
    public static final class C23963c<T> extends AtomicLong implements InterfaceC23436D<T>, InterfaceC23465c, InterfaceC23964d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89475b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<?>> f89476c;

        /* renamed from: d */
        public final C23505h f89477d = new C23505h();

        /* renamed from: e */
        public final AtomicReference<InterfaceC23465c> f89478e = new AtomicReference<>();

        public C23963c(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23492o<? super T, ? extends InterfaceC23434B<?>> interfaceC23492o) {
            this.f89475b = interfaceC23436D;
            this.f89476c = interfaceC23492o;
        }

        @Override // io.reactivex.internal.operators.observable.C23960A1.InterfaceC23964d
        /* renamed from: a */
        public void mo32683a(long j, Throwable th) {
            if (compareAndSet(j, LongCompanionObject.MAX_VALUE)) {
                EnumC23501d.m33000a(this.f89478e);
                this.f89475b.onError(th);
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.internal.operators.observable.C23970B1.InterfaceC23974d
        /* renamed from: b */
        public void mo32674b(long j) {
            if (compareAndSet(j, LongCompanionObject.MAX_VALUE)) {
                EnumC23501d.m33000a(this.f89478e);
                this.f89475b.onError(new TimeoutException());
            }
        }

        /* renamed from: c */
        public void m32684c(InterfaceC23434B<?> interfaceC23434B) {
            if (interfaceC23434B != null) {
                C23961a c23961a = new C23961a(0L, this);
                if (this.f89477d.m32981a(c23961a)) {
                    interfaceC23434B.subscribe(c23961a);
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this.f89478e);
            this.f89477d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(this.f89478e.get());
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (getAndSet(LongCompanionObject.MAX_VALUE) != LongCompanionObject.MAX_VALUE) {
                this.f89477d.dispose();
                this.f89475b.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (getAndSet(LongCompanionObject.MAX_VALUE) != LongCompanionObject.MAX_VALUE) {
                this.f89477d.dispose();
                this.f89475b.onError(th);
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            long j = get();
            if (j != LongCompanionObject.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    InterfaceC23465c interfaceC23465c = this.f89477d.get();
                    if (interfaceC23465c != null) {
                        interfaceC23465c.dispose();
                    }
                    this.f89475b.onNext(t);
                    try {
                        InterfaceC23434B interfaceC23434B = (InterfaceC23434B) C23544b.m32923e(this.f89476c.apply(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        C23961a c23961a = new C23961a(j2, this);
                        if (this.f89477d.m32981a(c23961a)) {
                            interfaceC23434B.subscribe(c23961a);
                        }
                    } catch (Throwable th) {
                        C23475a.m33009b(th);
                        this.f89478e.get().dispose();
                        getAndSet(LongCompanionObject.MAX_VALUE);
                        this.f89475b.onError(th);
                    }
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this.f89478e, interfaceC23465c);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.A1$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC23964d extends C23970B1.InterfaceC23974d {
        /* renamed from: a */
        void mo32683a(long j, Throwable th);
    }

    public C23960A1(Observable<T> observable, InterfaceC23434B<U> interfaceC23434B, InterfaceC23492o<? super T, ? extends InterfaceC23434B<V>> interfaceC23492o, InterfaceC23434B<? extends T> interfaceC23434B2) {
        super(observable);
        this.f89464c = interfaceC23434B;
        this.f89465d = interfaceC23492o;
        this.f89466e = interfaceC23434B2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        if (this.f89466e == null) {
            C23963c c23963c = new C23963c(interfaceC23436D, this.f89465d);
            interfaceC23436D.onSubscribe(c23963c);
            c23963c.m32684c(this.f89464c);
            this.f90078b.subscribe(c23963c);
            return;
        }
        C23962b c23962b = new C23962b(interfaceC23436D, this.f89465d, this.f89466e);
        interfaceC23436D.onSubscribe(c23962b);
        c23962b.m32685c(this.f89464c);
        this.f90078b.subscribe(c23962b);
    }
}
