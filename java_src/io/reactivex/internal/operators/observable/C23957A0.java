package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.util.C24467c;
import io.reactivex.internal.util.C24477l;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.A0 */
/* loaded from: classes6.dex */
public final class C23957A0<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23496h f89456c;

    /* renamed from: io.reactivex.internal.operators.observable.A0$a */
    /* loaded from: classes6.dex */
    public static final class C23958a<T> extends AtomicInteger implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = -4592979584110982903L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89457b;

        /* renamed from: c */
        public final AtomicReference<InterfaceC23465c> f89458c = new AtomicReference<>();

        /* renamed from: d */
        public final C23959a f89459d = new C23959a(this);

        /* renamed from: e */
        public final C24467c f89460e = new C24467c();

        /* renamed from: f */
        public volatile boolean f89461f;

        /* renamed from: g */
        public volatile boolean f89462g;

        /* renamed from: io.reactivex.internal.operators.observable.A0$a$a */
        /* loaded from: classes6.dex */
        public static final class C23959a extends AtomicReference<InterfaceC23465c> implements InterfaceC23476f {
            private static final long serialVersionUID = -2935427570954647017L;

            /* renamed from: b */
            public final C23958a<?> f89463b;

            public C23959a(C23958a<?> c23958a) {
                this.f89463b = c23958a;
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onComplete() {
                this.f89463b.m32687a();
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onError(Throwable th) {
                this.f89463b.m32686b(th);
            }

            @Override // io.reactivex.InterfaceC23476f
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }
        }

        public C23958a(InterfaceC23436D<? super T> interfaceC23436D) {
            this.f89457b = interfaceC23436D;
        }

        /* renamed from: a */
        public void m32687a() {
            this.f89462g = true;
            if (this.f89461f) {
                C24477l.m32254b(this.f89457b, this, this.f89460e);
            }
        }

        /* renamed from: b */
        public void m32686b(Throwable th) {
            EnumC23501d.m33000a(this.f89458c);
            C24477l.m32252d(this.f89457b, th, this, this.f89460e);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this.f89458c);
            EnumC23501d.m33000a(this.f89459d);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(this.f89458c.get());
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89461f = true;
            if (this.f89462g) {
                C24477l.m32254b(this.f89457b, this, this.f89460e);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            EnumC23501d.m33000a(this.f89459d);
            C24477l.m32252d(this.f89457b, th, this, this.f89460e);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            C24477l.m32250f(this.f89457b, t, this, this.f89460e);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this.f89458c, interfaceC23465c);
        }
    }

    public C23957A0(Observable<T> observable, InterfaceC23496h interfaceC23496h) {
        super(observable);
        this.f89456c = interfaceC23496h;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C23958a c23958a = new C23958a(interfaceC23436D);
        interfaceC23436D.onSubscribe(c23958a);
        this.f90078b.subscribe(c23958a);
        this.f89456c.mo33003g(c23958a.f89459d);
    }
}
