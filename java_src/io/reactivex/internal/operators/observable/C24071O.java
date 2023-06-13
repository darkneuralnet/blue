package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.observable.O */
/* loaded from: classes6.dex */
public final class C24071O<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23484g<? super T> f89837c;

    /* renamed from: d */
    public final InterfaceC23484g<? super Throwable> f89838d;

    /* renamed from: e */
    public final InterfaceC23478a f89839e;

    /* renamed from: f */
    public final InterfaceC23478a f89840f;

    /* renamed from: io.reactivex.internal.operators.observable.O$a */
    /* loaded from: classes6.dex */
    public static final class C24072a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89841b;

        /* renamed from: c */
        public final InterfaceC23484g<? super T> f89842c;

        /* renamed from: d */
        public final InterfaceC23484g<? super Throwable> f89843d;

        /* renamed from: e */
        public final InterfaceC23478a f89844e;

        /* renamed from: f */
        public final InterfaceC23478a f89845f;

        /* renamed from: g */
        public InterfaceC23465c f89846g;

        /* renamed from: h */
        public boolean f89847h;

        public C24072a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a, InterfaceC23478a interfaceC23478a2) {
            this.f89841b = interfaceC23436D;
            this.f89842c = interfaceC23484g;
            this.f89843d = interfaceC23484g2;
            this.f89844e = interfaceC23478a;
            this.f89845f = interfaceC23478a2;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89846g.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89846g.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f89847h) {
                return;
            }
            try {
                this.f89844e.run();
                this.f89847h = true;
                this.f89841b.onComplete();
                try {
                    this.f89845f.run();
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    C24508a.m31988u(th);
                }
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                onError(th2);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89847h) {
                C24508a.m31988u(th);
                return;
            }
            this.f89847h = true;
            try {
                this.f89843d.accept(th);
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                th = new CompositeException(th, th2);
            }
            this.f89841b.onError(th);
            try {
                this.f89845f.run();
            } catch (Throwable th3) {
                C23475a.m33009b(th3);
                C24508a.m31988u(th3);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f89847h) {
                return;
            }
            try {
                this.f89842c.accept(t);
                this.f89841b.onNext(t);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89846g.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89846g, interfaceC23465c)) {
                this.f89846g = interfaceC23465c;
                this.f89841b.onSubscribe(this);
            }
        }
    }

    public C24071O(InterfaceC23434B<T> interfaceC23434B, InterfaceC23484g<? super T> interfaceC23484g, InterfaceC23484g<? super Throwable> interfaceC23484g2, InterfaceC23478a interfaceC23478a, InterfaceC23478a interfaceC23478a2) {
        super(interfaceC23434B);
        this.f89837c = interfaceC23484g;
        this.f89838d = interfaceC23484g2;
        this.f89839e = interfaceC23478a;
        this.f89840f = interfaceC23478a2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24072a(interfaceC23436D, this.f89837c, this.f89838d, this.f89839e, this.f89840f));
    }
}
