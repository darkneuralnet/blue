package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.observers.AbstractC23557b;
import io.reactivex.internal.util.C24467c;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.Y */
/* loaded from: classes6.dex */
public final class C24130Y<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23496h> f90037c;

    /* renamed from: d */
    public final boolean f90038d;

    /* renamed from: io.reactivex.internal.operators.observable.Y$a */
    /* loaded from: classes6.dex */
    public static final class C24131a<T> extends AbstractC23557b<T> implements InterfaceC23436D<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90039b;

        /* renamed from: d */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23496h> f90041d;

        /* renamed from: e */
        public final boolean f90042e;

        /* renamed from: g */
        public InterfaceC23465c f90044g;

        /* renamed from: h */
        public volatile boolean f90045h;

        /* renamed from: c */
        public final C24467c f90040c = new C24467c();

        /* renamed from: f */
        public final C23464b f90043f = new C23464b();

        /* renamed from: io.reactivex.internal.operators.observable.Y$a$a */
        /* loaded from: classes6.dex */
        public final class C24132a extends AtomicReference<InterfaceC23465c> implements InterfaceC23476f, InterfaceC23465c {
            private static final long serialVersionUID = 8606673141535671828L;

            public C24132a() {
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
                C24131a.this.m32555a(this);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onError(Throwable th) {
                C24131a.this.m32554c(this, th);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }
        }

        public C24131a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o, boolean z) {
            this.f90039b = interfaceC23436D;
            this.f90041d = interfaceC23492o;
            this.f90042e = z;
            lazySet(1);
        }

        /* renamed from: a */
        public void m32555a(C24131a<T>.C24132a c24132a) {
            this.f90043f.mo32984b(c24132a);
            onComplete();
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            return i & 2;
        }

        /* renamed from: c */
        public void m32554c(C24131a<T>.C24132a c24132a, Throwable th) {
            this.f90043f.mo32984b(c24132a);
            onError(th);
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public void clear() {
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90045h = true;
            this.f90044g.dispose();
            this.f90043f.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90044g.mo1769e();
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable m32275b = this.f90040c.m32275b();
                if (m32275b != null) {
                    this.f90039b.onError(m32275b);
                } else {
                    this.f90039b.onComplete();
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90040c.m32276a(th)) {
                if (this.f90042e) {
                    if (decrementAndGet() == 0) {
                        this.f90039b.onError(this.f90040c.m32275b());
                        return;
                    }
                    return;
                }
                dispose();
                if (getAndSet(0) > 0) {
                    this.f90039b.onError(this.f90040c.m32275b());
                    return;
                }
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            try {
                InterfaceC23496h interfaceC23496h = (InterfaceC23496h) C23544b.m32923e(this.f90041d.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C24132a c24132a = new C24132a();
                if (!this.f90045h && this.f90043f.mo32983c(c24132a)) {
                    interfaceC23496h.mo33003g(c24132a);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90044g.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90044g, interfaceC23465c)) {
                this.f90044g = interfaceC23465c;
                this.f90039b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() throws Exception {
            return null;
        }
    }

    public C24130Y(InterfaceC23434B<T> interfaceC23434B, InterfaceC23492o<? super T, ? extends InterfaceC23496h> interfaceC23492o, boolean z) {
        super(interfaceC23434B);
        this.f90037c = interfaceC23492o;
        this.f90038d = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24131a(interfaceC23436D, this.f90037c, this.f90038d));
    }
}
