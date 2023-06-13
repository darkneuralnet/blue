package io.reactivex.subjects;

import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23555j;
import io.reactivex.internal.observers.AbstractC23557b;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.subjects.i */
/* loaded from: classes8.dex */
public final class C24570i<T> extends AbstractC24569h<T> {

    /* renamed from: b */
    public final C24409c<T> f91269b;

    /* renamed from: c */
    public final AtomicReference<InterfaceC23436D<? super T>> f91270c;

    /* renamed from: d */
    public final AtomicReference<Runnable> f91271d;

    /* renamed from: e */
    public final boolean f91272e;

    /* renamed from: f */
    public volatile boolean f91273f;

    /* renamed from: g */
    public volatile boolean f91274g;

    /* renamed from: h */
    public Throwable f91275h;

    /* renamed from: i */
    public final AtomicBoolean f91276i;

    /* renamed from: j */
    public final AbstractC23557b<T> f91277j;

    /* renamed from: k */
    public boolean f91278k;

    /* renamed from: io.reactivex.subjects.i$a */
    /* loaded from: classes8.dex */
    public final class C24571a extends AbstractC23557b<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        public C24571a() {
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            if ((i & 2) != 0) {
                C24570i.this.f91278k = true;
                return 2;
            }
            return 0;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public void clear() {
            C24570i.this.f91269b.clear();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!C24570i.this.f91273f) {
                C24570i.this.f91273f = true;
                C24570i.this.m31874h();
                C24570i.this.f91270c.lazySet(null);
                if (C24570i.this.f91277j.getAndIncrement() == 0) {
                    C24570i.this.f91270c.lazySet(null);
                    C24570i c24570i = C24570i.this;
                    if (!c24570i.f91278k) {
                        c24570i.f91269b.clear();
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return C24570i.this.f91273f;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public boolean isEmpty() {
            return C24570i.this.f91269b.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() throws Exception {
            return C24570i.this.f91269b.poll();
        }
    }

    public C24570i(int i, boolean z) {
        this.f91269b = new C24409c<>(C23544b.m32922f(i, "capacityHint"));
        this.f91271d = new AtomicReference<>();
        this.f91272e = z;
        this.f91270c = new AtomicReference<>();
        this.f91276i = new AtomicBoolean();
        this.f91277j = new C24571a();
    }

    /* renamed from: c */
    public static <T> C24570i<T> m31877c() {
        return new C24570i<>(Observable.bufferSize(), true);
    }

    /* renamed from: e */
    public static <T> C24570i<T> m31876e(int i) {
        return new C24570i<>(i, true);
    }

    /* renamed from: g */
    public static <T> C24570i<T> m31875g(int i, Runnable runnable) {
        return new C24570i<>(i, runnable, true);
    }

    /* renamed from: h */
    public void m31874h() {
        Runnable runnable = this.f91271d.get();
        if (runnable != null && C42482i24.m35337a(this.f91271d, runnable, null)) {
            runnable.run();
        }
    }

    /* renamed from: i */
    public void m31873i() {
        if (this.f91277j.getAndIncrement() != 0) {
            return;
        }
        InterfaceC23436D<? super T> interfaceC23436D = this.f91270c.get();
        int i = 1;
        while (interfaceC23436D == null) {
            i = this.f91277j.addAndGet(-i);
            if (i == 0) {
                return;
            }
            interfaceC23436D = this.f91270c.get();
        }
        if (this.f91278k) {
            m31872j(interfaceC23436D);
        } else {
            m31871k(interfaceC23436D);
        }
    }

    /* renamed from: j */
    public void m31872j(InterfaceC23436D<? super T> interfaceC23436D) {
        C24409c<T> c24409c = this.f91269b;
        int i = 1;
        boolean z = !this.f91272e;
        while (!this.f91273f) {
            boolean z2 = this.f91274g;
            if (z && z2 && m31869m(c24409c, interfaceC23436D)) {
                return;
            }
            interfaceC23436D.onNext(null);
            if (z2) {
                m31870l(interfaceC23436D);
                return;
            }
            i = this.f91277j.addAndGet(-i);
            if (i == 0) {
                return;
            }
        }
        this.f91270c.lazySet(null);
    }

    /* renamed from: k */
    public void m31871k(InterfaceC23436D<? super T> interfaceC23436D) {
        boolean z;
        C24409c<T> c24409c = this.f91269b;
        boolean z2 = !this.f91272e;
        boolean z3 = true;
        int i = 1;
        while (!this.f91273f) {
            boolean z4 = this.f91274g;
            Object obj = (T) this.f91269b.poll();
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            if (z4) {
                if (z2 && z3) {
                    if (m31869m(c24409c, interfaceC23436D)) {
                        return;
                    }
                    z3 = false;
                }
                if (z) {
                    m31870l(interfaceC23436D);
                    return;
                }
            }
            if (z) {
                i = this.f91277j.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                interfaceC23436D.onNext(obj);
            }
        }
        this.f91270c.lazySet(null);
        c24409c.clear();
    }

    /* renamed from: l */
    public void m31870l(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f91270c.lazySet(null);
        Throwable th = this.f91275h;
        if (th != null) {
            interfaceC23436D.onError(th);
        } else {
            interfaceC23436D.onComplete();
        }
    }

    /* renamed from: m */
    public boolean m31869m(InterfaceC23555j<T> interfaceC23555j, InterfaceC23436D<? super T> interfaceC23436D) {
        Throwable th = this.f91275h;
        if (th != null) {
            this.f91270c.lazySet(null);
            interfaceC23555j.clear();
            interfaceC23436D.onError(th);
            return true;
        }
        return false;
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onComplete() {
        if (!this.f91274g && !this.f91273f) {
            this.f91274g = true;
            m31874h();
            m31873i();
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onError(Throwable th) {
        C23544b.m32923e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f91274g && !this.f91273f) {
            this.f91275h = th;
            this.f91274g = true;
            m31874h();
            m31873i();
            return;
        }
        C24508a.m31988u(th);
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onNext(T t) {
        C23544b.m32923e(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f91274g && !this.f91273f) {
            this.f91269b.offer(t);
            m31873i();
        }
    }

    @Override // io.reactivex.InterfaceC23436D
    public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        if (this.f91274g || this.f91273f) {
            interfaceC23465c.dispose();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        if (!this.f91276i.get() && this.f91276i.compareAndSet(false, true)) {
            interfaceC23436D.onSubscribe(this.f91277j);
            this.f91270c.lazySet(interfaceC23436D);
            if (this.f91273f) {
                this.f91270c.lazySet(null);
                return;
            } else {
                m31873i();
                return;
            }
        }
        EnumC23502e.m32987i(new IllegalStateException("Only a single observer allowed."), interfaceC23436D);
    }

    public C24570i(int i, Runnable runnable, boolean z) {
        this.f91269b = new C24409c<>(C23544b.m32922f(i, "capacityHint"));
        this.f91271d = new AtomicReference<>(C23544b.m32923e(runnable, "onTerminate"));
        this.f91272e = z;
        this.f91270c = new AtomicReference<>();
        this.f91276i = new AtomicBoolean();
        this.f91277j = new C24571a();
    }
}
