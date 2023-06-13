package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23549d;
import io.reactivex.internal.util.C24467c;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.Z */
/* loaded from: classes6.dex */
public final class C24137Z<T> extends AbstractC23461c implements InterfaceC23549d<T> {

    /* renamed from: b */
    public final InterfaceC23434B<T> f90058b;

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23496h> f90059c;

    /* renamed from: d */
    public final boolean f90060d;

    /* renamed from: io.reactivex.internal.operators.observable.Z$a */
    /* loaded from: classes6.dex */
    public static final class C24138a<T> extends AtomicInteger implements InterfaceC23465c, InterfaceC23436D<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: b */
        public final InterfaceC23476f f90061b;

        /* renamed from: d */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23496h> f90063d;

        /* renamed from: e */
        public final boolean f90064e;

        /* renamed from: g */
        public InterfaceC23465c f90066g;

        /* renamed from: h */
        public volatile boolean f90067h;

        /* renamed from: c */
        public final C24467c f90062c = new C24467c();

        /* renamed from: f */
        public final C23464b f90065f = new C23464b();

        /* renamed from: io.reactivex.internal.operators.observable.Z$a$a */
        /* loaded from: classes6.dex */
        public final class C24139a extends AtomicReference<InterfaceC23465c> implements InterfaceC23476f, InterfaceC23465c {
            private static final long serialVersionUID = 8606673141535671828L;

            public C24139a() {
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

            @Override // io.reactivex.InterfaceC23476f
            public void onComplete() {
                C24138a.this.m32550a(this);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onError(Throwable th) {
                C24138a.this.m32549b(this, th);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }
        }

        public C24138a(InterfaceC23476f interfaceC23476f, InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o, boolean z) {
            this.f90061b = interfaceC23476f;
            this.f90063d = interfaceC23492o;
            this.f90064e = z;
            lazySet(1);
        }

        /* renamed from: a */
        public void m32550a(C24138a<T>.C24139a c24139a) {
            this.f90065f.mo32984b(c24139a);
            onComplete();
        }

        /* renamed from: b */
        public void m32549b(C24138a<T>.C24139a c24139a, Throwable th) {
            this.f90065f.mo32984b(c24139a);
            onError(th);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90067h = true;
            this.f90066g.dispose();
            this.f90065f.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90066g.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable m32275b = this.f90062c.m32275b();
                if (m32275b != null) {
                    this.f90061b.onError(m32275b);
                } else {
                    this.f90061b.onComplete();
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90062c.m32276a(th)) {
                if (this.f90064e) {
                    if (decrementAndGet() == 0) {
                        this.f90061b.onError(this.f90062c.m32275b());
                        return;
                    }
                    return;
                }
                dispose();
                if (getAndSet(0) > 0) {
                    this.f90061b.onError(this.f90062c.m32275b());
                    return;
                }
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            try {
                InterfaceC23496h interfaceC23496h = (InterfaceC23496h) C23544b.m32923e(this.f90063d.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C24139a c24139a = new C24139a();
                if (!this.f90067h && this.f90065f.mo32983c(c24139a)) {
                    interfaceC23496h.mo33003g(c24139a);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90066g.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90066g, interfaceC23465c)) {
                this.f90066g = interfaceC23465c;
                this.f90061b.onSubscribe(this);
            }
        }
    }

    public C24137Z(InterfaceC23434B<T> interfaceC23434B, InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o, boolean z) {
        this.f90058b = interfaceC23434B;
        this.f90059c = interfaceC23492o;
        this.f90060d = z;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        this.f90058b.subscribe(new C24138a(interfaceC23476f, this.f90059c, this.f90060d));
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23549d
    /* renamed from: c */
    public Observable<T> mo32427c() {
        return C24508a.m31994o(new C24130Y(this.f90058b, this.f90059c, this.f90060d));
    }
}
