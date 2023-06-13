package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.C23505h;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.util.C24475k;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.observable.B1 */
/* loaded from: classes6.dex */
public final class C23970B1<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final long f89494c;

    /* renamed from: d */
    public final TimeUnit f89495d;

    /* renamed from: e */
    public final AbstractC23437E f89496e;

    /* renamed from: f */
    public final InterfaceC23434B<? extends T> f89497f;

    /* renamed from: io.reactivex.internal.operators.observable.B1$a */
    /* loaded from: classes6.dex */
    public static final class C23971a<T> implements InterfaceC23436D<T> {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89498b;

        /* renamed from: c */
        public final AtomicReference<InterfaceC23465c> f89499c;

        public C23971a(InterfaceC23436D<? super T> interfaceC23436D, AtomicReference<InterfaceC23465c> atomicReference) {
            this.f89498b = interfaceC23436D;
            this.f89499c = atomicReference;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89498b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f89498b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f89498b.onNext(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32998c(this.f89499c, interfaceC23465c);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.B1$b */
    /* loaded from: classes6.dex */
    public static final class C23972b<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<T>, InterfaceC23465c, InterfaceC23974d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89500b;

        /* renamed from: c */
        public final long f89501c;

        /* renamed from: d */
        public final TimeUnit f89502d;

        /* renamed from: e */
        public final AbstractC23437E.AbstractC23440c f89503e;

        /* renamed from: f */
        public final C23505h f89504f = new C23505h();

        /* renamed from: g */
        public final AtomicLong f89505g = new AtomicLong();

        /* renamed from: h */
        public final AtomicReference<InterfaceC23465c> f89506h = new AtomicReference<>();

        /* renamed from: i */
        public InterfaceC23434B<? extends T> f89507i;

        public C23972b(InterfaceC23436D<? super T> interfaceC23436D, long j, TimeUnit timeUnit, AbstractC23437E.AbstractC23440c abstractC23440c, InterfaceC23434B<? extends T> interfaceC23434B) {
            this.f89500b = interfaceC23436D;
            this.f89501c = j;
            this.f89502d = timeUnit;
            this.f89503e = abstractC23440c;
            this.f89507i = interfaceC23434B;
        }

        @Override // io.reactivex.internal.operators.observable.C23970B1.InterfaceC23974d
        /* renamed from: b */
        public void mo32674b(long j) {
            if (this.f89505g.compareAndSet(j, LongCompanionObject.MAX_VALUE)) {
                EnumC23501d.m33000a(this.f89506h);
                InterfaceC23434B<? extends T> interfaceC23434B = this.f89507i;
                this.f89507i = null;
                interfaceC23434B.subscribe(new C23971a(this.f89500b, this));
                this.f89503e.dispose();
            }
        }

        /* renamed from: c */
        public void m32676c(long j) {
            this.f89504f.m32981a(this.f89503e.mo32319c(new RunnableC23975e(j, this), this.f89501c, this.f89502d));
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this.f89506h);
            EnumC23501d.m33000a(this);
            this.f89503e.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f89505g.getAndSet(LongCompanionObject.MAX_VALUE) != LongCompanionObject.MAX_VALUE) {
                this.f89504f.dispose();
                this.f89500b.onComplete();
                this.f89503e.dispose();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89505g.getAndSet(LongCompanionObject.MAX_VALUE) != LongCompanionObject.MAX_VALUE) {
                this.f89504f.dispose();
                this.f89500b.onError(th);
                this.f89503e.dispose();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            long j = this.f89505g.get();
            if (j != LongCompanionObject.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.f89505g.compareAndSet(j, j2)) {
                    this.f89504f.get().dispose();
                    this.f89500b.onNext(t);
                    m32676c(j2);
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this.f89506h, interfaceC23465c);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.B1$c */
    /* loaded from: classes6.dex */
    public static final class C23973c<T> extends AtomicLong implements InterfaceC23436D<T>, InterfaceC23465c, InterfaceC23974d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89508b;

        /* renamed from: c */
        public final long f89509c;

        /* renamed from: d */
        public final TimeUnit f89510d;

        /* renamed from: e */
        public final AbstractC23437E.AbstractC23440c f89511e;

        /* renamed from: f */
        public final C23505h f89512f = new C23505h();

        /* renamed from: g */
        public final AtomicReference<InterfaceC23465c> f89513g = new AtomicReference<>();

        public C23973c(InterfaceC23436D<? super T> interfaceC23436D, long j, TimeUnit timeUnit, AbstractC23437E.AbstractC23440c abstractC23440c) {
            this.f89508b = interfaceC23436D;
            this.f89509c = j;
            this.f89510d = timeUnit;
            this.f89511e = abstractC23440c;
        }

        @Override // io.reactivex.internal.operators.observable.C23970B1.InterfaceC23974d
        /* renamed from: b */
        public void mo32674b(long j) {
            if (compareAndSet(j, LongCompanionObject.MAX_VALUE)) {
                EnumC23501d.m33000a(this.f89513g);
                this.f89508b.onError(new TimeoutException(C24475k.m32257d(this.f89509c, this.f89510d)));
                this.f89511e.dispose();
            }
        }

        /* renamed from: c */
        public void m32675c(long j) {
            this.f89512f.m32981a(this.f89511e.mo32319c(new RunnableC23975e(j, this), this.f89509c, this.f89510d));
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this.f89513g);
            this.f89511e.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(this.f89513g.get());
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (getAndSet(LongCompanionObject.MAX_VALUE) != LongCompanionObject.MAX_VALUE) {
                this.f89512f.dispose();
                this.f89508b.onComplete();
                this.f89511e.dispose();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (getAndSet(LongCompanionObject.MAX_VALUE) != LongCompanionObject.MAX_VALUE) {
                this.f89512f.dispose();
                this.f89508b.onError(th);
                this.f89511e.dispose();
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
                    this.f89512f.get().dispose();
                    this.f89508b.onNext(t);
                    m32675c(j2);
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this.f89513g, interfaceC23465c);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.B1$d */
    /* loaded from: classes6.dex */
    public interface InterfaceC23974d {
        /* renamed from: b */
        void mo32674b(long j);
    }

    /* renamed from: io.reactivex.internal.operators.observable.B1$e */
    /* loaded from: classes6.dex */
    public static final class RunnableC23975e implements Runnable {

        /* renamed from: b */
        public final InterfaceC23974d f89514b;

        /* renamed from: c */
        public final long f89515c;

        public RunnableC23975e(long j, InterfaceC23974d interfaceC23974d) {
            this.f89515c = j;
            this.f89514b = interfaceC23974d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f89514b.mo32674b(this.f89515c);
        }
    }

    public C23970B1(Observable<T> observable, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, InterfaceC23434B<? extends T> interfaceC23434B) {
        super(observable);
        this.f89494c = j;
        this.f89495d = timeUnit;
        this.f89496e = abstractC23437E;
        this.f89497f = interfaceC23434B;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        if (this.f89497f == null) {
            C23973c c23973c = new C23973c(interfaceC23436D, this.f89494c, this.f89495d, this.f89496e.mo8041b());
            interfaceC23436D.onSubscribe(c23973c);
            c23973c.m32675c(0L);
            this.f90078b.subscribe(c23973c);
            return;
        }
        C23972b c23972b = new C23972b(interfaceC23436D, this.f89494c, this.f89495d, this.f89496e.mo8041b(), this.f89497f);
        interfaceC23436D.onSubscribe(c23972b);
        c23972b.m32676c(0L);
        this.f90078b.subscribe(c23972b);
    }
}
