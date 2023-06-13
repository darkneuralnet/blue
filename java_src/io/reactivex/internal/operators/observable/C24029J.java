package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.util.EnumC24472h;
/* renamed from: io.reactivex.internal.operators.observable.J */
/* loaded from: classes6.dex */
public final class C24029J<T> extends AbstractC24145a<T, T> {

    /* renamed from: io.reactivex.internal.operators.observable.J$a */
    /* loaded from: classes6.dex */
    public static final class C24030a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public InterfaceC23436D<? super T> f89693b;

        /* renamed from: c */
        public InterfaceC23465c f89694c;

        public C24030a(InterfaceC23436D<? super T> interfaceC23436D) {
            this.f89693b = interfaceC23436D;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            InterfaceC23465c interfaceC23465c = this.f89694c;
            this.f89694c = EnumC24472h.INSTANCE;
            this.f89693b = EnumC24472h.m32265b();
            interfaceC23465c.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89694c.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            InterfaceC23436D<? super T> interfaceC23436D = this.f89693b;
            this.f89694c = EnumC24472h.INSTANCE;
            this.f89693b = EnumC24472h.m32265b();
            interfaceC23436D.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            InterfaceC23436D<? super T> interfaceC23436D = this.f89693b;
            this.f89694c = EnumC24472h.INSTANCE;
            this.f89693b = EnumC24472h.m32265b();
            interfaceC23436D.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f89693b.onNext(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89694c, interfaceC23465c)) {
                this.f89694c = interfaceC23465c;
                this.f89693b.onSubscribe(this);
            }
        }
    }

    public C24029J(InterfaceC23434B<T> interfaceC23434B) {
        super(interfaceC23434B);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24030a(interfaceC23436D));
    }
}
