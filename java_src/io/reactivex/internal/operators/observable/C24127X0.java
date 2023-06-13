package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.util.C24467c;
import io.reactivex.internal.util.C24477l;
import io.reactivex.subjects.AbstractC24569h;
import io.reactivex.subjects.C24558d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.X0 */
/* loaded from: classes6.dex */
public final class C24127X0<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23492o<? super Observable<Throwable>, ? extends InterfaceC23434B<?>> f90027c;

    /* renamed from: io.reactivex.internal.operators.observable.X0$a */
    /* loaded from: classes6.dex */
    public static final class C24128a<T> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = 802743776666017014L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90028b;

        /* renamed from: e */
        public final AbstractC24569h<Throwable> f90031e;

        /* renamed from: h */
        public final InterfaceC23434B<T> f90034h;

        /* renamed from: i */
        public volatile boolean f90035i;

        /* renamed from: c */
        public final AtomicInteger f90029c = new AtomicInteger();

        /* renamed from: d */
        public final C24467c f90030d = new C24467c();

        /* renamed from: f */
        public final C24128a<T>.C24129a f90032f = new C24129a();

        /* renamed from: g */
        public final AtomicReference<InterfaceC23465c> f90033g = new AtomicReference<>();

        /* renamed from: io.reactivex.internal.operators.observable.X0$a$a */
        /* loaded from: classes6.dex */
        public final class C24129a extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            public C24129a() {
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onComplete() {
                C24128a.this.m32559a();
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onError(Throwable th) {
                C24128a.this.m32558b(th);
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onNext(Object obj) {
                C24128a.this.m32557c();
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }
        }

        public C24128a(InterfaceC23436D<? super T> interfaceC23436D, AbstractC24569h<Throwable> abstractC24569h, InterfaceC23434B<T> interfaceC23434B) {
            this.f90028b = interfaceC23436D;
            this.f90031e = abstractC24569h;
            this.f90034h = interfaceC23434B;
        }

        /* renamed from: a */
        public void m32559a() {
            EnumC23501d.m33000a(this.f90033g);
            C24477l.m32254b(this.f90028b, this, this.f90030d);
        }

        /* renamed from: b */
        public void m32558b(Throwable th) {
            EnumC23501d.m33000a(this.f90033g);
            C24477l.m32252d(this.f90028b, th, this, this.f90030d);
        }

        /* renamed from: c */
        public void m32557c() {
            m32556d();
        }

        /* renamed from: d */
        public void m32556d() {
            if (this.f90029c.getAndIncrement() == 0) {
                while (!mo1769e()) {
                    if (!this.f90035i) {
                        this.f90035i = true;
                        this.f90034h.subscribe(this);
                    }
                    if (this.f90029c.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this.f90033g);
            EnumC23501d.m33000a(this.f90032f);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(this.f90033g.get());
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            EnumC23501d.m33000a(this.f90032f);
            C24477l.m32254b(this.f90028b, this, this.f90030d);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            EnumC23501d.m32998c(this.f90033g, null);
            this.f90035i = false;
            this.f90031e.onNext(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            C24477l.m32250f(this.f90028b, t, this, this.f90030d);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32998c(this.f90033g, interfaceC23465c);
        }
    }

    public C24127X0(InterfaceC23434B<T> interfaceC23434B, InterfaceC23492o<? super Observable<Throwable>, ? extends InterfaceC23434B<?>> interfaceC23492o) {
        super(interfaceC23434B);
        this.f90027c = interfaceC23492o;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        AbstractC24569h<T> m31878a = C24558d.m31902e().m31878a();
        try {
            InterfaceC23434B interfaceC23434B = (InterfaceC23434B) C23544b.m32923e(this.f90027c.apply(m31878a), "The handler returned a null ObservableSource");
            C24128a c24128a = new C24128a(interfaceC23436D, m31878a, this.f90078b);
            interfaceC23436D.onSubscribe(c24128a);
            interfaceC23434B.subscribe(c24128a.f90032f);
            c24128a.m32556d();
        } catch (Throwable th) {
            C23475a.m33009b(th);
            EnumC23502e.m32987i(th, interfaceC23436D);
        }
    }
}
