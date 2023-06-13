package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24494o;
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
/* renamed from: io.reactivex.internal.operators.flowable.x */
/* loaded from: classes6.dex */
public final class C23823x<T, R> extends AbstractC23695a<T, R> {

    /* renamed from: d */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> f89095d;

    /* renamed from: e */
    public final boolean f89096e;

    /* renamed from: f */
    public final int f89097f;

    /* renamed from: io.reactivex.internal.operators.flowable.x$a */
    /* loaded from: classes6.dex */
    public static final class C23824a<T, R> extends AtomicInteger implements InterfaceC24494o<T>, InterfaceC46292oT5 {
        private static final long serialVersionUID = 8600231336733376951L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super R> f89098b;

        /* renamed from: c */
        public final boolean f89099c;

        /* renamed from: d */
        public final int f89100d;

        /* renamed from: i */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> f89105i;

        /* renamed from: k */
        public InterfaceC46292oT5 f89107k;

        /* renamed from: l */
        public volatile boolean f89108l;

        /* renamed from: e */
        public final AtomicLong f89101e = new AtomicLong();

        /* renamed from: f */
        public final C23464b f89102f = new C23464b();

        /* renamed from: h */
        public final C24467c f89104h = new C24467c();

        /* renamed from: g */
        public final AtomicInteger f89103g = new AtomicInteger(1);

        /* renamed from: j */
        public final AtomicReference<C24409c<R>> f89106j = new AtomicReference<>();

        /* renamed from: io.reactivex.internal.operators.flowable.x$a$a */
        /* loaded from: classes6.dex */
        public final class C23825a extends AtomicReference<InterfaceC23465c> implements InterfaceC23445I<R>, InterfaceC23465c {
            private static final long serialVersionUID = -502562646270949838L;

            public C23825a() {
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

            @Override // io.reactivex.InterfaceC23445I
            public void onError(Throwable th) {
                C23824a.this.m32752f(this, th);
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onSuccess(R r) {
                C23824a.this.m32751g(this, r);
            }
        }

        public C23824a(InterfaceC42141hT5<? super R> interfaceC42141hT5, InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o, boolean z, int i) {
            this.f89098b = interfaceC42141hT5;
            this.f89105i = interfaceC23492o;
            this.f89099c = z;
            this.f89100d = i;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f89107k, interfaceC46292oT5)) {
                this.f89107k = interfaceC46292oT5;
                this.f89098b.mo31867a(this);
                int i = this.f89100d;
                if (i == Integer.MAX_VALUE) {
                    interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
                } else {
                    interfaceC46292oT5.mo21023o(i);
                }
            }
        }

        /* renamed from: b */
        public void m32756b() {
            C24409c<R> c24409c = this.f89106j.get();
            if (c24409c != null) {
                c24409c.clear();
            }
        }

        /* renamed from: c */
        public void m32755c() {
            if (getAndIncrement() == 0) {
                m32754d();
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f89108l = true;
            this.f89107k.cancel();
            this.f89102f.dispose();
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
            if (r12 != 0) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x007b, code lost:
            if (r17.f89108l == false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
            m32756b();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0080, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
            if (r17.f89099c != false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
            if (r17.f89104h.get() == null) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
            r2 = r17.f89104h.m32275b();
            m32756b();
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
            r2 = r17.f89104h.m32275b();
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
            io.reactivex.internal.util.C24468d.m32271d(r17.f89101e, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00d6, code lost:
            if (r17.f89100d == Integer.MAX_VALUE) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00d8, code lost:
            r17.f89107k.mo21023o(r10);
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
        public void m32754d() {
            boolean z;
            R r;
            boolean z2;
            InterfaceC42141hT5<? super R> interfaceC42141hT5 = this.f89098b;
            AtomicInteger atomicInteger = this.f89103g;
            AtomicReference<C24409c<R>> atomicReference = this.f89106j;
            int i = 1;
            do {
                long j = this.f89101e.get();
                long j2 = 0;
                while (true) {
                    int i2 = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                    boolean z3 = false;
                    if (i2 == 0) {
                        break;
                    } else if (this.f89108l) {
                        m32756b();
                        return;
                    } else if (!this.f89099c && this.f89104h.get() != null) {
                        Throwable m32275b = this.f89104h.m32275b();
                        m32756b();
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
                            Throwable m32275b2 = this.f89104h.m32275b();
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
        public C24409c<R> m32753e() {
            C24409c<R> c24409c;
            do {
                C24409c<R> c24409c2 = this.f89106j.get();
                if (c24409c2 != null) {
                    return c24409c2;
                }
                c24409c = new C24409c<>(AbstractC24490k.m32139j());
            } while (!C42482i24.m35337a(this.f89106j, null, c24409c));
            return c24409c;
        }

        /* renamed from: f */
        public void m32752f(C23824a<T, R>.C23825a c23825a, Throwable th) {
            this.f89102f.mo32984b(c23825a);
            if (this.f89104h.m32276a(th)) {
                if (!this.f89099c) {
                    this.f89107k.cancel();
                    this.f89102f.dispose();
                } else if (this.f89100d != Integer.MAX_VALUE) {
                    this.f89107k.mo21023o(1L);
                }
                this.f89103g.decrementAndGet();
                m32755c();
                return;
            }
            C24508a.m31988u(th);
        }

        /* renamed from: g */
        public void m32751g(C23824a<T, R>.C23825a c23825a, R r) {
            this.f89102f.mo32984b(c23825a);
            if (get() == 0) {
                boolean z = false;
                if (compareAndSet(0, 1)) {
                    if (this.f89103g.decrementAndGet() == 0) {
                        z = true;
                    }
                    if (this.f89101e.get() != 0) {
                        this.f89098b.onNext(r);
                        C24409c<R> c24409c = this.f89106j.get();
                        if (z && (c24409c == null || c24409c.isEmpty())) {
                            Throwable m32275b = this.f89104h.m32275b();
                            if (m32275b != null) {
                                this.f89098b.onError(m32275b);
                                return;
                            } else {
                                this.f89098b.onComplete();
                                return;
                            }
                        }
                        C24468d.m32271d(this.f89101e, 1L);
                        if (this.f89100d != Integer.MAX_VALUE) {
                            this.f89107k.mo21023o(1L);
                        }
                    } else {
                        C24409c<R> m32753e = m32753e();
                        synchronized (m32753e) {
                            m32753e.offer(r);
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                    m32754d();
                }
            }
            C24409c<R> m32753e2 = m32753e();
            synchronized (m32753e2) {
                m32753e2.offer(r);
            }
            this.f89103g.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            m32754d();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                C24468d.m32274a(this.f89101e, j);
                m32755c();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f89103g.decrementAndGet();
            m32755c();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f89103g.decrementAndGet();
            if (this.f89104h.m32276a(th)) {
                if (!this.f89099c) {
                    this.f89102f.dispose();
                }
                m32755c();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            try {
                InterfaceC23447K interfaceC23447K = (InterfaceC23447K) C23544b.m32923e(this.f89105i.apply(t), "The mapper returned a null SingleSource");
                this.f89103g.getAndIncrement();
                C23825a c23825a = new C23825a();
                if (!this.f89108l && this.f89102f.mo32983c(c23825a)) {
                    interfaceC23447K.mo33096a(c23825a);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89107k.cancel();
                onError(th);
            }
        }
    }

    public C23823x(AbstractC24490k<T> abstractC24490k, InterfaceC23492o<? super T, ? extends InterfaceC23447K<? extends R>> interfaceC23492o, boolean z, int i) {
        super(abstractC24490k);
        this.f89095d = interfaceC23492o;
        this.f89096e = z;
        this.f89097f = i;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super R> interfaceC42141hT5) {
        this.f88638c.m32166W0(new C23824a(interfaceC42141hT5, this.f89095d, this.f89096e, this.f89097f));
    }
}
