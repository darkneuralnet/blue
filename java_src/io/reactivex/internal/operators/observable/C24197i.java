package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.observable.i */
/* loaded from: classes6.dex */
public final class C24197i<T> extends AbstractC24145a<T, Boolean> {

    /* renamed from: c */
    public final InterfaceC23494q<? super T> f90238c;

    /* renamed from: io.reactivex.internal.operators.observable.i$a */
    /* loaded from: classes6.dex */
    public static final class C24198a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super Boolean> f90239b;

        /* renamed from: c */
        public final InterfaceC23494q<? super T> f90240c;

        /* renamed from: d */
        public InterfaceC23465c f90241d;

        /* renamed from: e */
        public boolean f90242e;

        public C24198a(InterfaceC23436D<? super Boolean> interfaceC23436D, InterfaceC23494q<? super T> interfaceC23494q) {
            this.f90239b = interfaceC23436D;
            this.f90240c = interfaceC23494q;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90241d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90241d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (!this.f90242e) {
                this.f90242e = true;
                this.f90239b.onNext(Boolean.FALSE);
                this.f90239b.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90242e) {
                C24508a.m31988u(th);
                return;
            }
            this.f90242e = true;
            this.f90239b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90242e) {
                return;
            }
            try {
                if (this.f90240c.test(t)) {
                    this.f90242e = true;
                    this.f90241d.dispose();
                    this.f90239b.onNext(Boolean.TRUE);
                    this.f90239b.onComplete();
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90241d.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90241d, interfaceC23465c)) {
                this.f90241d = interfaceC23465c;
                this.f90239b.onSubscribe(this);
            }
        }
    }

    public C24197i(InterfaceC23434B<T> interfaceC23434B, InterfaceC23494q<? super T> interfaceC23494q) {
        super(interfaceC23434B);
        this.f90238c = interfaceC23494q;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super Boolean> interfaceC23436D) {
        this.f90078b.subscribe(new C24198a(interfaceC23436D, this.f90238c));
    }
}
