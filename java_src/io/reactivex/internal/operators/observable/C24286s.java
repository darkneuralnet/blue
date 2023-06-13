package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.observable.s */
/* loaded from: classes6.dex */
public final class C24286s<T, U> extends AbstractC24145a<T, U> {

    /* renamed from: c */
    public final Callable<? extends U> f90545c;

    /* renamed from: d */
    public final InterfaceC23479b<? super U, ? super T> f90546d;

    /* renamed from: io.reactivex.internal.operators.observable.s$a */
    /* loaded from: classes6.dex */
    public static final class C24287a<T, U> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super U> f90547b;

        /* renamed from: c */
        public final InterfaceC23479b<? super U, ? super T> f90548c;

        /* renamed from: d */
        public final U f90549d;

        /* renamed from: e */
        public InterfaceC23465c f90550e;

        /* renamed from: f */
        public boolean f90551f;

        public C24287a(InterfaceC23436D<? super U> interfaceC23436D, U u, InterfaceC23479b<? super U, ? super T> interfaceC23479b) {
            this.f90547b = interfaceC23436D;
            this.f90548c = interfaceC23479b;
            this.f90549d = u;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90550e.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90550e.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f90551f) {
                return;
            }
            this.f90551f = true;
            this.f90547b.onNext((U) this.f90549d);
            this.f90547b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90551f) {
                C24508a.m31988u(th);
                return;
            }
            this.f90551f = true;
            this.f90547b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90551f) {
                return;
            }
            try {
                this.f90548c.accept((U) this.f90549d, t);
            } catch (Throwable th) {
                this.f90550e.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90550e, interfaceC23465c)) {
                this.f90550e = interfaceC23465c;
                this.f90547b.onSubscribe(this);
            }
        }
    }

    public C24286s(InterfaceC23434B<T> interfaceC23434B, Callable<? extends U> callable, InterfaceC23479b<? super U, ? super T> interfaceC23479b) {
        super(interfaceC23434B);
        this.f90545c = callable;
        this.f90546d = interfaceC23479b;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super U> interfaceC23436D) {
        try {
            this.f90078b.subscribe(new C24287a(interfaceC23436D, C23544b.m32923e(this.f90545c.call(), "The initialSupplier returned a null value"), this.f90546d));
        } catch (Throwable th) {
            EnumC23502e.m32987i(th, interfaceC23436D);
        }
    }
}
