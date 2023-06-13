package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24467c;
import io.reactivex.internal.util.C24468d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.v */
/* loaded from: classes6.dex */
public final class C23813v<T, R> extends AbstractC23695a<T, R> {

    /* renamed from: d */
    public final InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> f89046d;

    /* renamed from: e */
    public final boolean f89047e;

    /* renamed from: f */
    public final int f89048f;

    /* renamed from: io.reactivex.internal.operators.flowable.v$a */
    /* loaded from: classes6.dex */
    public static final class C23814a<T, R> extends AtomicInteger implements InterfaceC24494o<T>, InterfaceC46292oT5 {
        private static final long serialVersionUID = 8600231336733376951L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super R> f89049b;

        /* renamed from: c */
        public final boolean f89050c;

        /* renamed from: d */
        public final int f89051d;

        /* renamed from: i */
        public final InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> f89056i;

        /* renamed from: k */
        public InterfaceC46292oT5 f89058k;

        /* renamed from: l */
        public volatile boolean f89059l;

        /* renamed from: e */
        public final AtomicLong f89052e = new AtomicLong();

        /* renamed from: f */
        public final C23464b f89053f = new C23464b();

        /* renamed from: h */
        public final C24467c f89055h = new C24467c();

        /* renamed from: g */
        public final AtomicInteger f89054g = new AtomicInteger(1);

        /* renamed from: j */
        public final AtomicReference<C24409c<R>> f89057j = new AtomicReference<>();

        /* renamed from: io.reactivex.internal.operators.flowable.v$a$a */
        /* loaded from: classes6.dex */
        public final class C23815a extends AtomicReference<InterfaceC23465c> implements InterfaceC24541s<R>, InterfaceC23465c {
            private static final long serialVersionUID = -502562646270949838L;

            public C23815a() {
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

            @Override // io.reactivex.InterfaceC24541s
            public void onComplete() {
                C23814a.this.m32766f(this);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onError(Throwable th) {
                C23814a.this.m32765g(this, th);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }

            @Override // io.reactivex.InterfaceC24541s
            public void onSuccess(R r) {
                C23814a.this.m32764i(this, r);
            }
        }

        public C23814a(InterfaceC42141hT5<? super R> interfaceC42141hT5, InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o, boolean z, int i) {
            this.f89049b = interfaceC42141hT5;
            this.f89056i = interfaceC23492o;
            this.f89050c = z;
            this.f89051d = i;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f89058k, interfaceC46292oT5)) {
                this.f89058k = interfaceC46292oT5;
                this.f89049b.mo31867a(this);
                int i = this.f89051d;
                if (i == Integer.MAX_VALUE) {
                    interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
                } else {
                    interfaceC46292oT5.mo21023o(i);
                }
            }
        }

        /* renamed from: b */
        public void m32770b() {
            C24409c<R> c24409c = this.f89057j.get();
            if (c24409c != null) {
                c24409c.clear();
            }
        }

        /* renamed from: c */
        public void m32769c() {
            if (getAndIncrement() == 0) {
                m32768d();
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f89059l = true;
            this.f89058k.cancel();
            this.f89053f.dispose();
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
            if (r12 != 0) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x007b, code lost:
            if (r17.f89059l == false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
            m32770b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0080, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
            if (r17.f89050c != false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
            if (r17.f89055h.get() == null) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
            r2 = r17.f89055h.m32275b();
            m32770b();
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00a0, code lost:
            if (r2.get() != 0) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00a2, code lost:
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00a4, code lost:
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00a5, code lost:
            r7 = r3.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00ab, code lost:
            if (r7 == null) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00b1, code lost:
            if (r7.isEmpty() == false) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00b3, code lost:
            r13 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00b4, code lost:
            if (r6 == false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:
            if (r13 == false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
            r2 = r17.f89055h.m32275b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00be, code lost:
            if (r2 == null) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00c0, code lost:
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00c4, code lost:
            r1.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00c7, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00ca, code lost:
            if (r10 == 0) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00cc, code lost:
            io.reactivex.internal.util.C24468d.m32271d(r17.f89052e, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00d6, code lost:
            if (r17.f89051d == Integer.MAX_VALUE) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00d8, code lost:
            r17.f89058k.mo21023o(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00dd, code lost:
            r5 = addAndGet(-r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
            return;
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m32768d() {
            boolean z;
            R r;
            boolean z2;
            InterfaceC42141hT5<? super R> interfaceC42141hT5 = this.f89049b;
            AtomicInteger atomicInteger = this.f89054g;
            AtomicReference<C24409c<R>> atomicReference = this.f89057j;
            int i = 1;
            do {
                long j = this.f89052e.get();
                long j2 = 0;
                while (true) {
                    int i2 = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    boolean z3 = false;
                    if (i2 == 0) {
                        break;
                    } else if (this.f89059l) {
                        m32770b();
                        return;
                    } else if (!this.f89050c && this.f89055h.get() != null) {
                        Throwable m32275b = this.f89055h.m32275b();
                        m32770b();
                        interfaceC42141hT5.onError(m32275b);
                        return;
                    } else {
                        if (atomicInteger.get() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C24409c<R> c24409c = atomicReference.get();
                        if (c24409c != null) {
                            r = c24409c.poll();
                        } else {
                            r = (Object) null;
                        }
                        if (r == null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z && z2) {
                            Throwable m32275b2 = this.f89055h.m32275b();
                            if (m32275b2 != null) {
                                interfaceC42141hT5.onError(m32275b2);
                                return;
                            } else {
                                interfaceC42141hT5.onComplete();
                                return;
                            }
                        } else if (z2) {
                            break;
                        } else {
                            interfaceC42141hT5.onNext(r);
                            j2++;
                        }
                    }
                }
            } while (i != 0);
        }

        /* renamed from: e */
        public C24409c<R> m32767e() {
            C24409c<R> c24409c;
            do {
                C24409c<R> c24409c2 = this.f89057j.get();
                if (c24409c2 != null) {
                    return c24409c2;
                }
                c24409c = new C24409c<>(AbstractC24490k.m32139j());
            } while (!C42482i24.m35337a(this.f89057j, null, c24409c));
            return c24409c;
        }

        /* renamed from: f */
        public void m32766f(C23814a<T, R>.C23815a c23815a) {
            this.f89053f.mo32984b(c23815a);
            if (get() == 0) {
                boolean z = false;
                if (compareAndSet(0, 1)) {
                    if (this.f89054g.decrementAndGet() == 0) {
                        z = true;
                    }
                    C24409c<R> c24409c = this.f89057j.get();
                    if (z && (c24409c == null || c24409c.isEmpty())) {
                        Throwable m32275b = this.f89055h.m32275b();
                        if (m32275b != null) {
                            this.f89049b.onError(m32275b);
                            return;
                        } else {
                            this.f89049b.onComplete();
                            return;
                        }
                    }
                    if (this.f89051d != Integer.MAX_VALUE) {
                        this.f89058k.mo21023o(1L);
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    m32768d();
                    return;
                }
            }
            this.f89054g.decrementAndGet();
            if (this.f89051d != Integer.MAX_VALUE) {
                this.f89058k.mo21023o(1L);
            }
            m32769c();
        }

        /* renamed from: g */
        public void m32765g(C23814a<T, R>.C23815a c23815a, Throwable th) {
            this.f89053f.mo32984b(c23815a);
            if (this.f89055h.m32276a(th)) {
                if (!this.f89050c) {
                    this.f89058k.cancel();
                    this.f89053f.dispose();
                } else if (this.f89051d != Integer.MAX_VALUE) {
                    this.f89058k.mo21023o(1L);
                }
                this.f89054g.decrementAndGet();
                m32769c();
                return;
            }
            C24508a.m31988u(th);
        }

        /* renamed from: i */
        public void m32764i(C23814a<T, R>.C23815a c23815a, R r) {
            this.f89053f.mo32984b(c23815a);
            if (get() == 0) {
                boolean z = false;
                if (compareAndSet(0, 1)) {
                    if (this.f89054g.decrementAndGet() == 0) {
                        z = true;
                    }
                    if (this.f89052e.get() != 0) {
                        this.f89049b.onNext(r);
                        C24409c<R> c24409c = this.f89057j.get();
                        if (z && (c24409c == null || c24409c.isEmpty())) {
                            Throwable m32275b = this.f89055h.m32275b();
                            if (m32275b != null) {
                                this.f89049b.onError(m32275b);
                                return;
                            } else {
                                this.f89049b.onComplete();
                                return;
                            }
                        }
                        C24468d.m32271d(this.f89052e, 1L);
                        if (this.f89051d != Integer.MAX_VALUE) {
                            this.f89058k.mo21023o(1L);
                        }
                    } else {
                        C24409c<R> m32767e = m32767e();
                        synchronized (m32767e) {
                            m32767e.offer(r);
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    m32768d();
                }
            }
            C24409c<R> m32767e2 = m32767e();
            synchronized (m32767e2) {
                m32767e2.offer(r);
            }
            this.f89054g.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            m32768d();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                C24468d.m32274a(this.f89052e, j);
                m32769c();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f89054g.decrementAndGet();
            m32769c();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f89054g.decrementAndGet();
            if (this.f89055h.m32276a(th)) {
                if (!this.f89050c) {
                    this.f89053f.dispose();
                }
                m32769c();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            try {
                InterfaceC24574u interfaceC24574u = (InterfaceC24574u) C23544b.m32923e(this.f89056i.apply(t), "The mapper returned a null MaybeSource");
                this.f89054g.getAndIncrement();
                C23815a c23815a = new C23815a();
                if (!this.f89059l && this.f89053f.mo32983c(c23815a)) {
                    interfaceC24574u.mo31865a(c23815a);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89058k.cancel();
                onError(th);
            }
        }
    }

    public C23813v(AbstractC24490k<T> abstractC24490k, InterfaceC23492o<? super T, ? extends InterfaceC24574u<? extends R>> interfaceC23492o, boolean z, int i) {
        super(abstractC24490k);
        this.f89046d = interfaceC23492o;
        this.f89047e = z;
        this.f89048f = i;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super R> interfaceC42141hT5) {
        this.f88638c.m32166W0(new C23814a(interfaceC42141hT5, this.f89046d, this.f89047e, this.f89048f));
    }
}
