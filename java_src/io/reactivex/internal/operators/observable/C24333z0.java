package io.reactivex.internal.operators.observable;

import io.reactivex.C24576w;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
/* renamed from: io.reactivex.internal.operators.observable.z0 */
/* loaded from: classes6.dex */
public final class C24333z0<T> extends AbstractC24145a<T, C24576w<T>> {

    /* renamed from: io.reactivex.internal.operators.observable.z0$a */
    /* loaded from: classes6.dex */
    public static final class C24334a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super C24576w<T>> f90740b;

        /* renamed from: c */
        public InterfaceC23465c f90741c;

        public C24334a(InterfaceC23436D<? super C24576w<T>> interfaceC23436D) {
            this.f90740b = interfaceC23436D;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90741c.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90741c.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90740b.onNext(C24576w.m31863a());
            this.f90740b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90740b.onNext(C24576w.m31862b(th));
            this.f90740b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f90740b.onNext(C24576w.m31861c(t));
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90741c, interfaceC23465c)) {
                this.f90741c = interfaceC23465c;
                this.f90740b.onSubscribe(this);
            }
        }
    }

    public C24333z0(InterfaceC23434B<T> interfaceC23434B) {
        super(interfaceC23434B);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super C24576w<T>> interfaceC23436D) {
        this.f90078b.subscribe(new C24334a(interfaceC23436D));
    }
}
