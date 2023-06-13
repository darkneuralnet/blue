package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.q0 */
/* loaded from: classes6.dex */
public final class C23790q0<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final long f88952d;

    /* renamed from: e */
    public final TimeUnit f88953e;

    /* renamed from: f */
    public final AbstractC23437E f88954f;

    /* renamed from: g */
    public final boolean f88955g;

    /* renamed from: io.reactivex.internal.operators.flowable.q0$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC23791a<T> extends AtomicInteger implements InterfaceC24494o<T>, InterfaceC46292oT5, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88956b;

        /* renamed from: c */
        public final long f88957c;

        /* renamed from: d */
        public final TimeUnit f88958d;

        /* renamed from: e */
        public final AbstractC23437E.AbstractC23440c f88959e;

        /* renamed from: f */
        public final boolean f88960f;

        /* renamed from: g */
        public final AtomicReference<T> f88961g = new AtomicReference<>();

        /* renamed from: h */
        public final AtomicLong f88962h = new AtomicLong();

        /* renamed from: i */
        public InterfaceC46292oT5 f88963i;

        /* renamed from: j */
        public volatile boolean f88964j;

        /* renamed from: k */
        public Throwable f88965k;

        /* renamed from: l */
        public volatile boolean f88966l;

        /* renamed from: m */
        public volatile boolean f88967m;

        /* renamed from: n */
        public long f88968n;

        /* renamed from: o */
        public boolean f88969o;

        public RunnableC23791a(InterfaceC42141hT5<? super T> interfaceC42141hT5, long j, TimeUnit timeUnit, AbstractC23437E.AbstractC23440c abstractC23440c, boolean z) {
            this.f88956b = interfaceC42141hT5;
            this.f88957c = j;
            this.f88958d = timeUnit;
            this.f88959e = abstractC23440c;
            this.f88960f = z;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88963i, interfaceC46292oT5)) {
                this.f88963i = interfaceC46292oT5;
                this.f88956b.mo31867a(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        /* renamed from: b */
        public void m32791b() {
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.f88961g;
            AtomicLong atomicLong = this.f88962h;
            InterfaceC42141hT5<? super T> interfaceC42141hT5 = this.f88956b;
            int i = 1;
            while (!this.f88966l) {
                boolean z2 = this.f88964j;
                if (z2 && this.f88965k != null) {
                    atomicReference.lazySet(null);
                    interfaceC42141hT5.onError(this.f88965k);
                    this.f88959e.dispose();
                    return;
                }
                if (atomicReference.get() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z2) {
                    if (!z && this.f88960f) {
                        T andSet = atomicReference.getAndSet(null);
                        long j = this.f88968n;
                        if (j != atomicLong.get()) {
                            this.f88968n = j + 1;
                            interfaceC42141hT5.onNext(andSet);
                            interfaceC42141hT5.onComplete();
                        } else {
                            interfaceC42141hT5.onError(new MissingBackpressureException("Could not emit final value due to lack of requests"));
                        }
                    } else {
                        atomicReference.lazySet(null);
                        interfaceC42141hT5.onComplete();
                    }
                    this.f88959e.dispose();
                    return;
                }
                if (z) {
                    if (this.f88967m) {
                        this.f88969o = false;
                        this.f88967m = false;
                    }
                } else if (!this.f88969o || this.f88967m) {
                    T andSet2 = atomicReference.getAndSet(null);
                    long j2 = this.f88968n;
                    if (j2 != atomicLong.get()) {
                        interfaceC42141hT5.onNext(andSet2);
                        this.f88968n = j2 + 1;
                        this.f88967m = false;
                        this.f88969o = true;
                        this.f88959e.mo32319c(this, this.f88957c, this.f88958d);
                    } else {
                        this.f88963i.cancel();
                        interfaceC42141hT5.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                        this.f88959e.dispose();
                        return;
                    }
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f88966l = true;
            this.f88963i.cancel();
            this.f88959e.dispose();
            if (getAndIncrement() == 0) {
                this.f88961g.lazySet(null);
            }
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                C24468d.m32274a(this.f88962h, j);
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f88964j = true;
            m32791b();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f88965k = th;
            this.f88964j = true;
            m32791b();
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            this.f88961g.set(t);
            m32791b();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f88967m = true;
            m32791b();
        }
    }

    public C23790q0(AbstractC24490k<T> abstractC24490k, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, boolean z) {
        super(abstractC24490k);
        this.f88952d = j;
        this.f88953e = timeUnit;
        this.f88954f = abstractC23437E;
        this.f88955g = z;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f88638c.m32166W0(new RunnableC23791a(interfaceC42141hT5, this.f88952d, this.f88953e, this.f88954f.mo8041b(), this.f88955g));
    }
}
