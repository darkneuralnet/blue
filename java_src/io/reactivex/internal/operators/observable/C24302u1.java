package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.util.C24467c;
import io.reactivex.internal.util.C24477l;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.u1 */
/* loaded from: classes6.dex */
public final class C24302u1<T, U> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23434B<? extends U> f90623c;

    /* renamed from: io.reactivex.internal.operators.observable.u1$a */
    /* loaded from: classes6.dex */
    public static final class C24303a<T, U> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = 1418547743690811973L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90624b;

        /* renamed from: c */
        public final AtomicReference<InterfaceC23465c> f90625c = new AtomicReference<>();

        /* renamed from: d */
        public final C24303a<T, U>.C24304a f90626d = new C24304a();

        /* renamed from: e */
        public final C24467c f90627e = new C24467c();

        /* renamed from: io.reactivex.internal.operators.observable.u1$a$a */
        /* loaded from: classes6.dex */
        public final class C24304a extends AtomicReference<InterfaceC23465c> implements InterfaceC23436D<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            public C24304a() {
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onComplete() {
                C24303a.this.m32417a();
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onError(Throwable th) {
                C24303a.this.m32416b(th);
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onNext(U u) {
                EnumC23501d.m33000a(this);
                C24303a.this.m32417a();
            }

            @Override // io.reactivex.InterfaceC23436D
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }
        }

        public C24303a(InterfaceC23436D<? super T> interfaceC23436D) {
            this.f90624b = interfaceC23436D;
        }

        /* renamed from: a */
        public void m32417a() {
            EnumC23501d.m33000a(this.f90625c);
            C24477l.m32254b(this.f90624b, this, this.f90627e);
        }

        /* renamed from: b */
        public void m32416b(Throwable th) {
            EnumC23501d.m33000a(this.f90625c);
            C24477l.m32252d(this.f90624b, th, this, this.f90627e);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this.f90625c);
            EnumC23501d.m33000a(this.f90626d);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(this.f90625c.get());
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            EnumC23501d.m33000a(this.f90626d);
            C24477l.m32254b(this.f90624b, this, this.f90627e);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            EnumC23501d.m33000a(this.f90626d);
            C24477l.m32252d(this.f90624b, th, this, this.f90627e);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            C24477l.m32250f(this.f90624b, t, this, this.f90627e);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this.f90625c, interfaceC23465c);
        }
    }

    public C24302u1(InterfaceC23434B<T> interfaceC23434B, InterfaceC23434B<? extends U> interfaceC23434B2) {
        super(interfaceC23434B);
        this.f90623c = interfaceC23434B2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C24303a c24303a = new C24303a(interfaceC23436D);
        interfaceC23436D.onSubscribe(c24303a);
        this.f90623c.subscribe(c24303a.f90626d);
        this.f90078b.subscribe(c24303a);
    }
}
