package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.internal.fuseable.InterfaceC23554i;
import io.reactivex.internal.queue.C24408b;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.internal.subscriptions.AbstractC24457a;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.L */
/* loaded from: classes6.dex */
public final class C23662L<T> extends AbstractC23695a<T, T> {

    /* renamed from: d */
    public final int f88516d;

    /* renamed from: e */
    public final boolean f88517e;

    /* renamed from: f */
    public final boolean f88518f;

    /* renamed from: g */
    public final InterfaceC23478a f88519g;

    /* renamed from: io.reactivex.internal.operators.flowable.L$a */
    /* loaded from: classes6.dex */
    public static final class C23663a<T> extends AbstractC24457a<T> implements InterfaceC24494o<T> {
        private static final long serialVersionUID = -2514538129242366402L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88520b;

        /* renamed from: c */
        public final InterfaceC23554i<T> f88521c;

        /* renamed from: d */
        public final boolean f88522d;

        /* renamed from: e */
        public final InterfaceC23478a f88523e;

        /* renamed from: f */
        public InterfaceC46292oT5 f88524f;

        /* renamed from: g */
        public volatile boolean f88525g;

        /* renamed from: h */
        public volatile boolean f88526h;

        /* renamed from: i */
        public Throwable f88527i;

        /* renamed from: j */
        public final AtomicLong f88528j = new AtomicLong();

        /* renamed from: k */
        public boolean f88529k;

        public C23663a(InterfaceC42141hT5<? super T> interfaceC42141hT5, int i, boolean z, boolean z2, InterfaceC23478a interfaceC23478a) {
            InterfaceC23554i<T> c24408b;
            this.f88520b = interfaceC42141hT5;
            this.f88523e = interfaceC23478a;
            this.f88522d = z2;
            if (z) {
                c24408b = new C24409c<>(i);
            } else {
                c24408b = new C24408b<>(i);
            }
            this.f88521c = c24408b;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88524f, interfaceC46292oT5)) {
                this.f88524f = interfaceC46292oT5;
                this.f88520b.mo31867a(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            if ((i & 2) != 0) {
                this.f88529k = true;
                return 2;
            }
            return 0;
        }

        /* renamed from: c */
        public boolean m32882c(boolean z, boolean z2, InterfaceC42141hT5<? super T> interfaceC42141hT5) {
            if (this.f88525g) {
                this.f88521c.clear();
                return true;
            } else if (z) {
                if (this.f88522d) {
                    if (z2) {
                        Throwable th = this.f88527i;
                        if (th != null) {
                            interfaceC42141hT5.onError(th);
                        } else {
                            interfaceC42141hT5.onComplete();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable th2 = this.f88527i;
                if (th2 != null) {
                    this.f88521c.clear();
                    interfaceC42141hT5.onError(th2);
                    return true;
                } else if (z2) {
                    interfaceC42141hT5.onComplete();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            if (!this.f88525g) {
                this.f88525g = true;
                this.f88524f.cancel();
                if (!this.f88529k && getAndIncrement() == 0) {
                    this.f88521c.clear();
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public void clear() {
            this.f88521c.clear();
        }

        /* renamed from: d */
        public void m32881d() {
            int i;
            boolean z;
            if (getAndIncrement() == 0) {
                InterfaceC23554i<T> interfaceC23554i = this.f88521c;
                InterfaceC42141hT5<? super T> interfaceC42141hT5 = this.f88520b;
                int i2 = 1;
                while (!m32882c(this.f88526h, interfaceC23554i.isEmpty(), interfaceC42141hT5)) {
                    long j = this.f88528j.get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        }
                        boolean z2 = this.f88526h;
                        Object obj = (T) interfaceC23554i.poll();
                        if (obj == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (m32882c(z2, z, interfaceC42141hT5)) {
                            return;
                        }
                        if (z) {
                            break;
                        }
                        interfaceC42141hT5.onNext(obj);
                        j2++;
                    }
                    if (i == 0 && m32882c(this.f88526h, interfaceC23554i.isEmpty(), interfaceC42141hT5)) {
                        return;
                    }
                    if (j2 != 0 && j != LongCompanionObject.MAX_VALUE) {
                        this.f88528j.addAndGet(-j2);
                    }
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public boolean isEmpty() {
            return this.f88521c.isEmpty();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (!this.f88529k && EnumC24463g.m32287h(j)) {
                C24468d.m32274a(this.f88528j, j);
                m32881d();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f88526h = true;
            if (this.f88529k) {
                this.f88520b.onComplete();
            } else {
                m32881d();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f88527i = th;
            this.f88526h = true;
            if (this.f88529k) {
                this.f88520b.onError(th);
            } else {
                m32881d();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (!this.f88521c.offer(t)) {
                this.f88524f.cancel();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.f88523e.run();
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
            } else if (this.f88529k) {
                this.f88520b.onNext(null);
            } else {
                m32881d();
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() throws Exception {
            return this.f88521c.poll();
        }
    }

    public C23662L(AbstractC24490k<T> abstractC24490k, int i, boolean z, boolean z2, InterfaceC23478a interfaceC23478a) {
        super(abstractC24490k);
        this.f88516d = i;
        this.f88517e = z;
        this.f88518f = z2;
        this.f88519g = interfaceC23478a;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f88638c.m32166W0(new C23663a(interfaceC42141hT5, this.f88516d, this.f88517e, this.f88518f, this.f88519g));
    }
}
