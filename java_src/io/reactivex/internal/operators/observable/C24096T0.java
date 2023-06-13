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
/* renamed from: io.reactivex.internal.operators.observable.T0 */
/* loaded from: classes6.dex */
public final class C24096T0<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23492o<? super Observable<Object>, ? extends InterfaceC23434B<?>> f89937c;

    /* renamed from: io.reactivex.internal.operators.observable.T0$a */
    /* loaded from: classes6.dex */
    public static final class C24097a<T> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = 802743776666017014L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89938b;

        /* renamed from: e */
        public final AbstractC24569h<Object> f89941e;

        /* renamed from: h */
        public final InterfaceC23434B<T> f89944h;

        /* renamed from: i */
        public volatile boolean f89945i;

        /* renamed from: c */
        public final AtomicInteger f89939c = new AtomicInteger();

        /* renamed from: d */
        public final C24467c f89940d = new C24467c();

        /* renamed from: f */
        public final C24097a<T>.C24098a f89942f = new C24098a();

        /* renamed from: g */
        public final AtomicReference<InterfaceC23465c> f89943g = new AtomicReference<>();

        /* renamed from: io.reactivex.internal.operators.observable.T0$a$a */
        /* loaded from: classes6.dex */
        public final class C24098a extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            public C24098a() {
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onComplete() {
                C24097a.this.m32602a();
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onError(Throwable th) {
                C24097a.this.m32601b(th);
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onNext(Object obj) {
                C24097a.this.m32600c();
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }
        }

        public C24097a(InterfaceC23436D<? super T> interfaceC23436D, AbstractC24569h<Object> abstractC24569h, InterfaceC23434B<T> interfaceC23434B) {
            this.f89938b = interfaceC23436D;
            this.f89941e = abstractC24569h;
            this.f89944h = interfaceC23434B;
        }

        /* renamed from: a */
        public void m32602a() {
            EnumC23501d.m33000a(this.f89943g);
            C24477l.m32254b(this.f89938b, this, this.f89940d);
        }

        /* renamed from: b */
        public void m32601b(Throwable th) {
            EnumC23501d.m33000a(this.f89943g);
            C24477l.m32252d(this.f89938b, th, this, this.f89940d);
        }

        /* renamed from: c */
        public void m32600c() {
            m32599d();
        }

        /* renamed from: d */
        public void m32599d() {
            if (this.f89939c.getAndIncrement() == 0) {
                while (!mo1769e()) {
                    if (!this.f89945i) {
                        this.f89945i = true;
                        this.f89944h.subscribe(this);
                    }
                    if (this.f89939c.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this.f89943g);
            EnumC23501d.m33000a(this.f89942f);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(this.f89943g.get());
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            EnumC23501d.m32998c(this.f89943g, null);
            this.f89945i = false;
            this.f89941e.onNext(0);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            EnumC23501d.m33000a(this.f89942f);
            C24477l.m32252d(this.f89938b, th, this, this.f89940d);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            C24477l.m32250f(this.f89938b, t, this, this.f89940d);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this.f89943g, interfaceC23465c);
        }
    }

    public C24096T0(InterfaceC23434B<T> interfaceC23434B, InterfaceC23492o<? super Observable<Object>, ? extends InterfaceC23434B<?>> interfaceC23492o) {
        super(interfaceC23434B);
        this.f89937c = interfaceC23492o;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        AbstractC24569h<T> m31878a = C24558d.m31902e().m31878a();
        try {
            InterfaceC23434B interfaceC23434B = (InterfaceC23434B) C23544b.m32923e(this.f89937c.apply(m31878a), "The handler returned a null ObservableSource");
            C24097a c24097a = new C24097a(interfaceC23436D, m31878a, this.f90078b);
            interfaceC23436D.onSubscribe(c24097a);
            interfaceC23434B.subscribe(c24097a.f89942f);
            c24097a.m32599d();
        } catch (Throwable th) {
            C23475a.m33009b(th);
            EnumC23502e.m32987i(th, interfaceC23436D);
        }
    }
}
