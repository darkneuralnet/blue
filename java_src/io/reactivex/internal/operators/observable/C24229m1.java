package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.disposables.EnumC23501d;
/* renamed from: io.reactivex.internal.operators.observable.m1 */
/* loaded from: classes6.dex */
public final class C24229m1<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23494q<? super T> f90365c;

    /* renamed from: io.reactivex.internal.operators.observable.m1$a */
    /* loaded from: classes6.dex */
    public static final class C24230a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90366b;

        /* renamed from: c */
        public final InterfaceC23494q<? super T> f90367c;

        /* renamed from: d */
        public InterfaceC23465c f90368d;

        /* renamed from: e */
        public boolean f90369e;

        public C24230a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23494q<? super T> interfaceC23494q) {
            this.f90366b = interfaceC23436D;
            this.f90367c = interfaceC23494q;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90368d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90368d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90366b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90366b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90369e) {
                this.f90366b.onNext(t);
                return;
            }
            try {
                if (!this.f90367c.test(t)) {
                    this.f90369e = true;
                    this.f90366b.onNext(t);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90368d.dispose();
                this.f90366b.onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90368d, interfaceC23465c)) {
                this.f90368d = interfaceC23465c;
                this.f90366b.onSubscribe(this);
            }
        }
    }

    public C24229m1(InterfaceC23434B<T> interfaceC23434B, InterfaceC23494q<? super T> interfaceC23494q) {
        super(interfaceC23434B);
        this.f90365c = interfaceC23494q;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24230a(interfaceC23436D, this.f90365c));
    }
}
