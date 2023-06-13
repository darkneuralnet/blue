package io.reactivex.processors;

import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.internal.subscriptions.AbstractC24457a;
import io.reactivex.internal.subscriptions.EnumC24460d;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.processors.d */
/* loaded from: classes8.dex */
public final class C24513d<T> extends AbstractC24509a<T> {

    /* renamed from: c */
    public final C24409c<T> f91153c;

    /* renamed from: d */
    public final AtomicReference<Runnable> f91154d;

    /* renamed from: e */
    public final boolean f91155e;

    /* renamed from: f */
    public volatile boolean f91156f;

    /* renamed from: g */
    public Throwable f91157g;

    /* renamed from: h */
    public final AtomicReference<InterfaceC42141hT5<? super T>> f91158h;

    /* renamed from: i */
    public volatile boolean f91159i;

    /* renamed from: j */
    public final AtomicBoolean f91160j;

    /* renamed from: k */
    public final AbstractC24457a<T> f91161k;

    /* renamed from: l */
    public final AtomicLong f91162l;

    /* renamed from: m */
    public boolean f91163m;

    /* renamed from: io.reactivex.processors.d$a */
    /* loaded from: classes8.dex */
    public final class C24514a extends AbstractC24457a<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        public C24514a() {
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            if ((i & 2) != 0) {
                C24513d.this.f91163m = true;
                return 2;
            }
            return 0;
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            if (C24513d.this.f91159i) {
                return;
            }
            C24513d.this.f91159i = true;
            C24513d.this.m31971A1();
            C24513d.this.f91158h.lazySet(null);
            if (C24513d.this.f91161k.getAndIncrement() == 0) {
                C24513d.this.f91158h.lazySet(null);
                C24513d c24513d = C24513d.this;
                if (!c24513d.f91163m) {
                    c24513d.f91153c.clear();
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public void clear() {
            C24513d.this.f91153c.clear();
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public boolean isEmpty() {
            return C24513d.this.f91153c.isEmpty();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                C24468d.m32274a(C24513d.this.f91162l, j);
                C24513d.this.m31970B1();
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() {
            return C24513d.this.f91153c.poll();
        }
    }

    public C24513d(int i) {
        this(i, null, true);
    }

    /* renamed from: z1 */
    public static <T> C24513d<T> m31965z1(int i) {
        return new C24513d<>(i);
    }

    /* renamed from: A1 */
    public void m31971A1() {
        Runnable andSet = this.f91154d.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    /* renamed from: B1 */
    public void m31970B1() {
        if (this.f91161k.getAndIncrement() != 0) {
            return;
        }
        InterfaceC42141hT5<? super T> interfaceC42141hT5 = this.f91158h.get();
        int i = 1;
        while (interfaceC42141hT5 == null) {
            i = this.f91161k.addAndGet(-i);
            if (i == 0) {
                return;
            }
            interfaceC42141hT5 = this.f91158h.get();
        }
        if (this.f91163m) {
            m31969C1(interfaceC42141hT5);
        } else {
            m31968D1(interfaceC42141hT5);
        }
    }

    /* renamed from: C1 */
    public void m31969C1(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        C24409c<T> c24409c = this.f91153c;
        int i = 1;
        boolean z = !this.f91155e;
        while (!this.f91159i) {
            boolean z2 = this.f91156f;
            if (z && z2 && this.f91157g != null) {
                c24409c.clear();
                this.f91158h.lazySet(null);
                interfaceC42141hT5.onError(this.f91157g);
                return;
            }
            interfaceC42141hT5.onNext(null);
            if (z2) {
                this.f91158h.lazySet(null);
                Throwable th = this.f91157g;
                if (th != null) {
                    interfaceC42141hT5.onError(th);
                    return;
                } else {
                    interfaceC42141hT5.onComplete();
                    return;
                }
            }
            i = this.f91161k.addAndGet(-i);
            if (i == 0) {
                return;
            }
        }
        this.f91158h.lazySet(null);
    }

    /* renamed from: D1 */
    public void m31968D1(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        int i;
        long j;
        boolean z;
        C24409c<T> c24409c = this.f91153c;
        boolean z2 = true;
        boolean z3 = !this.f91155e;
        int i2 = 1;
        while (true) {
            long j2 = this.f91162l.get();
            long j3 = 0;
            while (true) {
                i = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
                if (i != 0) {
                    boolean z4 = this.f91156f;
                    T poll = c24409c.poll();
                    if (poll == null) {
                        z = z2;
                    } else {
                        z = false;
                    }
                    j = j3;
                    if (m31966y1(z3, z4, z, interfaceC42141hT5, c24409c)) {
                        return;
                    }
                    if (z) {
                        break;
                    }
                    interfaceC42141hT5.onNext(poll);
                    j3 = 1 + j;
                    z2 = true;
                } else {
                    j = j3;
                    break;
                }
            }
            if (i == 0 && m31966y1(z3, this.f91156f, c24409c.isEmpty(), interfaceC42141hT5, c24409c)) {
                return;
            }
            if (j != 0 && j2 != LongCompanionObject.MAX_VALUE) {
                this.f91162l.addAndGet(-j);
            }
            i2 = this.f91161k.addAndGet(-i2);
            if (i2 == 0) {
                return;
            }
            z2 = true;
        }
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        if (!this.f91160j.get() && this.f91160j.compareAndSet(false, true)) {
            interfaceC42141hT5.mo31867a(this.f91161k);
            this.f91158h.set(interfaceC42141hT5);
            if (this.f91159i) {
                this.f91158h.lazySet(null);
                return;
            } else {
                m31970B1();
                return;
            }
        }
        EnumC24460d.m32300c(new IllegalStateException("This processor allows only a single Subscriber"), interfaceC42141hT5);
    }

    @Override // p000.InterfaceC42141hT5
    /* renamed from: a */
    public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
        if (!this.f91156f && !this.f91159i) {
            interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
        } else {
            interfaceC46292oT5.cancel();
        }
    }

    @Override // p000.InterfaceC42141hT5
    public void onComplete() {
        if (!this.f91156f && !this.f91159i) {
            this.f91156f = true;
            m31971A1();
            m31970B1();
        }
    }

    @Override // p000.InterfaceC42141hT5
    public void onError(Throwable th) {
        C23544b.m32923e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f91156f && !this.f91159i) {
            this.f91157g = th;
            this.f91156f = true;
            m31971A1();
            m31970B1();
            return;
        }
        C24508a.m31988u(th);
    }

    @Override // p000.InterfaceC42141hT5
    public void onNext(T t) {
        C23544b.m32923e(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f91156f && !this.f91159i) {
            this.f91153c.offer(t);
            m31970B1();
        }
    }

    /* renamed from: y1 */
    public boolean m31966y1(boolean z, boolean z2, boolean z3, InterfaceC42141hT5<? super T> interfaceC42141hT5, C24409c<T> c24409c) {
        if (this.f91159i) {
            c24409c.clear();
            this.f91158h.lazySet(null);
            return true;
        } else if (z2) {
            if (z && this.f91157g != null) {
                c24409c.clear();
                this.f91158h.lazySet(null);
                interfaceC42141hT5.onError(this.f91157g);
                return true;
            } else if (z3) {
                Throwable th = this.f91157g;
                this.f91158h.lazySet(null);
                if (th != null) {
                    interfaceC42141hT5.onError(th);
                } else {
                    interfaceC42141hT5.onComplete();
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public C24513d(int i, Runnable runnable, boolean z) {
        this.f91153c = new C24409c<>(C23544b.m32922f(i, "capacityHint"));
        this.f91154d = new AtomicReference<>(runnable);
        this.f91155e = z;
        this.f91158h = new AtomicReference<>();
        this.f91160j = new AtomicBoolean();
        this.f91161k = new C24514a();
        this.f91162l = new AtomicLong();
    }
}
