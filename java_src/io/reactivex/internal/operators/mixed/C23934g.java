package io.reactivex.internal.operators.mixed;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23550e;
import io.reactivex.internal.fuseable.InterfaceC23555j;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.internal.util.C24467c;
import io.reactivex.internal.util.C24475k;
import io.reactivex.internal.util.EnumC24474j;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.mixed.g */
/* loaded from: classes6.dex */
public final class C23934g<T> extends AbstractC23461c {

    /* renamed from: b */
    public final Observable<T> f89361b;

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23496h> f89362c;

    /* renamed from: d */
    public final EnumC24474j f89363d;

    /* renamed from: e */
    public final int f89364e;

    /* renamed from: io.reactivex.internal.operators.mixed.g$a */
    /* loaded from: classes6.dex */
    public static final class C23935a<T> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = 3610901111000061034L;

        /* renamed from: b */
        public final InterfaceC23476f f89365b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23496h> f89366c;

        /* renamed from: d */
        public final EnumC24474j f89367d;

        /* renamed from: e */
        public final C24467c f89368e = new C24467c();

        /* renamed from: f */
        public final C23936a f89369f = new C23936a(this);

        /* renamed from: g */
        public final int f89370g;

        /* renamed from: h */
        public InterfaceC23555j<T> f89371h;

        /* renamed from: i */
        public InterfaceC23465c f89372i;

        /* renamed from: j */
        public volatile boolean f89373j;

        /* renamed from: k */
        public volatile boolean f89374k;

        /* renamed from: l */
        public volatile boolean f89375l;

        /* renamed from: io.reactivex.internal.operators.mixed.g$a$a */
        /* loaded from: classes6.dex */
        public static final class C23936a extends AtomicReference<InterfaceC23465c> implements InterfaceC23476f {
            private static final long serialVersionUID = 5638352172918776687L;

            /* renamed from: b */
            public final C23935a<?> f89376b;

            public C23936a(C23935a<?> c23935a) {
                this.f89376b = c23935a;
            }

            /* renamed from: a */
            public void m32713a() {
                EnumC23501d.m33000a(this);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onComplete() {
                this.f89376b.m32715b();
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onError(Throwable th) {
                this.f89376b.m32714c(th);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32998c(this, interfaceC23465c);
            }
        }

        public C23935a(InterfaceC23476f interfaceC23476f, InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o, EnumC24474j enumC24474j, int i) {
            this.f89365b = interfaceC23476f;
            this.f89366c = interfaceC23492o;
            this.f89367d = enumC24474j;
            this.f89370g = i;
        }

        /* renamed from: a */
        public void m32716a() {
            InterfaceC23496h interfaceC23496h;
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            C24467c c24467c = this.f89368e;
            EnumC24474j enumC24474j = this.f89367d;
            while (!this.f89375l) {
                if (!this.f89373j) {
                    if (enumC24474j == EnumC24474j.BOUNDARY && c24467c.get() != null) {
                        this.f89375l = true;
                        this.f89371h.clear();
                        this.f89365b.onError(c24467c.m32275b());
                        return;
                    }
                    boolean z2 = this.f89374k;
                    try {
                        T poll = this.f89371h.poll();
                        if (poll != null) {
                            interfaceC23496h = (InterfaceC23496h) C23544b.m32923e(this.f89366c.apply(poll), "The mapper returned a null CompletableSource");
                            z = false;
                        } else {
                            interfaceC23496h = null;
                            z = true;
                        }
                        if (z2 && z) {
                            this.f89375l = true;
                            Throwable m32275b = c24467c.m32275b();
                            if (m32275b != null) {
                                this.f89365b.onError(m32275b);
                                return;
                            } else {
                                this.f89365b.onComplete();
                                return;
                            }
                        } else if (!z) {
                            this.f89373j = true;
                            interfaceC23496h.mo33003g(this.f89369f);
                        }
                    } catch (Throwable th) {
                        C23475a.m33009b(th);
                        this.f89375l = true;
                        this.f89371h.clear();
                        this.f89372i.dispose();
                        c24467c.m32276a(th);
                        this.f89365b.onError(c24467c.m32275b());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f89371h.clear();
        }

        /* renamed from: b */
        public void m32715b() {
            this.f89373j = false;
            m32716a();
        }

        /* renamed from: c */
        public void m32714c(Throwable th) {
            if (this.f89368e.m32276a(th)) {
                if (this.f89367d == EnumC24474j.IMMEDIATE) {
                    this.f89375l = true;
                    this.f89372i.dispose();
                    Throwable m32275b = this.f89368e.m32275b();
                    if (m32275b != C24475k.f91077a) {
                        this.f89365b.onError(m32275b);
                    }
                    if (getAndIncrement() == 0) {
                        this.f89371h.clear();
                        return;
                    }
                    return;
                }
                this.f89373j = false;
                m32716a();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89375l = true;
            this.f89372i.dispose();
            this.f89369f.m32713a();
            if (getAndIncrement() == 0) {
                this.f89371h.clear();
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89375l;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89374k = true;
            m32716a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89368e.m32276a(th)) {
                if (this.f89367d == EnumC24474j.IMMEDIATE) {
                    this.f89375l = true;
                    this.f89369f.m32713a();
                    Throwable m32275b = this.f89368e.m32275b();
                    if (m32275b != C24475k.f91077a) {
                        this.f89365b.onError(m32275b);
                    }
                    if (getAndIncrement() == 0) {
                        this.f89371h.clear();
                        return;
                    }
                    return;
                }
                this.f89374k = true;
                m32716a();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (t != null) {
                this.f89371h.offer(t);
            }
            m32716a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89372i, interfaceC23465c)) {
                this.f89372i = interfaceC23465c;
                if (interfaceC23465c instanceof InterfaceC23550e) {
                    InterfaceC23550e interfaceC23550e = (InterfaceC23550e) interfaceC23465c;
                    int mo31868b = interfaceC23550e.mo31868b(3);
                    if (mo31868b == 1) {
                        this.f89371h = interfaceC23550e;
                        this.f89374k = true;
                        this.f89365b.onSubscribe(this);
                        m32716a();
                        return;
                    } else if (mo31868b == 2) {
                        this.f89371h = interfaceC23550e;
                        this.f89365b.onSubscribe(this);
                        return;
                    }
                }
                this.f89371h = new C24409c(this.f89370g);
                this.f89365b.onSubscribe(this);
            }
        }
    }

    public C23934g(Observable<T> observable, InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o, EnumC24474j enumC24474j, int i) {
        this.f89361b = observable;
        this.f89362c = interfaceC23492o;
        this.f89363d = enumC24474j;
        this.f89364e = i;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        if (!C23952m.m32690a(this.f89361b, this.f89362c, interfaceC23476f)) {
            this.f89361b.subscribe(new C23935a(interfaceC23476f, this.f89362c, this.f89363d, this.f89364e));
        }
    }
}
