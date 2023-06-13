package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.C23505h;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import io.reactivex.subscribers.C24572a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.f0 */
/* loaded from: classes6.dex */
public final class C23739f0<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final long f88784d;

    /* renamed from: e */
    public final TimeUnit f88785e;

    /* renamed from: f */
    public final AbstractC23437E f88786f;

    /* renamed from: g */
    public final boolean f88787g;

    /* renamed from: io.reactivex.internal.operators.flowable.f0$a */
    /* loaded from: classes6.dex */
    public static final class C23740a<T> extends AbstractRunnableC23742c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        /* renamed from: i */
        public final AtomicInteger f88788i;

        public C23740a(InterfaceC42141hT5<? super T> interfaceC42141hT5, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
            super(interfaceC42141hT5, j, timeUnit, abstractC23437E);
            this.f88788i = new AtomicInteger(1);
        }

        @Override // io.reactivex.internal.operators.flowable.C23739f0.AbstractRunnableC23742c
        /* renamed from: c */
        public void mo32803c() {
            m32802d();
            if (this.f88788i.decrementAndGet() == 0) {
                this.f88789b.onComplete();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f88788i.incrementAndGet() == 2) {
                m32802d();
                if (this.f88788i.decrementAndGet() == 0) {
                    this.f88789b.onComplete();
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.f0$b */
    /* loaded from: classes6.dex */
    public static final class C23741b<T> extends AbstractRunnableC23742c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        public C23741b(InterfaceC42141hT5<? super T> interfaceC42141hT5, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
            super(interfaceC42141hT5, j, timeUnit, abstractC23437E);
        }

        @Override // io.reactivex.internal.operators.flowable.C23739f0.AbstractRunnableC23742c
        /* renamed from: c */
        public void mo32803c() {
            this.f88789b.onComplete();
        }

        @Override // java.lang.Runnable
        public void run() {
            m32802d();
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.f0$c */
    /* loaded from: classes6.dex */
    public static abstract class AbstractRunnableC23742c<T> extends AtomicReference<T> implements InterfaceC24494o<T>, InterfaceC46292oT5, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88789b;

        /* renamed from: c */
        public final long f88790c;

        /* renamed from: d */
        public final TimeUnit f88791d;

        /* renamed from: e */
        public final AbstractC23437E f88792e;

        /* renamed from: f */
        public final AtomicLong f88793f = new AtomicLong();

        /* renamed from: g */
        public final C23505h f88794g = new C23505h();

        /* renamed from: h */
        public InterfaceC46292oT5 f88795h;

        public AbstractRunnableC23742c(InterfaceC42141hT5<? super T> interfaceC42141hT5, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
            this.f88789b = interfaceC42141hT5;
            this.f88790c = j;
            this.f88791d = timeUnit;
            this.f88792e = abstractC23437E;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88795h, interfaceC46292oT5)) {
                this.f88795h = interfaceC46292oT5;
                this.f88789b.mo31867a(this);
                C23505h c23505h = this.f88794g;
                AbstractC23437E abstractC23437E = this.f88792e;
                long j = this.f88790c;
                c23505h.m32981a(abstractC23437E.mo32326f(this, j, j, this.f88791d));
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        /* renamed from: b */
        public void m32804b() {
            EnumC23501d.m33000a(this.f88794g);
        }

        /* renamed from: c */
        public abstract void mo32803c();

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            m32804b();
            this.f88795h.cancel();
        }

        /* renamed from: d */
        public void m32802d() {
            T andSet = getAndSet(null);
            if (andSet != null) {
                if (this.f88793f.get() != 0) {
                    this.f88789b.onNext(andSet);
                    C24468d.m32271d(this.f88793f, 1L);
                    return;
                }
                cancel();
                this.f88789b.onError(new MissingBackpressureException("Couldn't emit value due to lack of requests!"));
            }
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                C24468d.m32274a(this.f88793f, j);
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            m32804b();
            mo32803c();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            m32804b();
            this.f88789b.onError(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            lazySet(t);
        }
    }

    public C23739f0(AbstractC24490k<T> abstractC24490k, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, boolean z) {
        super(abstractC24490k);
        this.f88784d = j;
        this.f88785e = timeUnit;
        this.f88786f = abstractC23437E;
        this.f88787g = z;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        C24572a c24572a = new C24572a(interfaceC42141hT5);
        if (this.f88787g) {
            this.f88638c.m32166W0(new C23740a(c24572a, this.f88784d, this.f88785e, this.f88786f));
        } else {
            this.f88638c.m32166W0(new C23741b(c24572a, this.f88784d, this.f88785e, this.f88786f));
        }
    }
}
