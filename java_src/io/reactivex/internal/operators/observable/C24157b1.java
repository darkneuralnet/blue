package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.observable.b1 */
/* loaded from: classes6.dex */
public final class C24157b1<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23480c<T, T, T> f90114c;

    /* renamed from: io.reactivex.internal.operators.observable.b1$a */
    /* loaded from: classes6.dex */
    public static final class C24158a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90115b;

        /* renamed from: c */
        public final InterfaceC23480c<T, T, T> f90116c;

        /* renamed from: d */
        public InterfaceC23465c f90117d;

        /* renamed from: e */
        public T f90118e;

        /* renamed from: f */
        public boolean f90119f;

        public C24158a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23480c<T, T, T> interfaceC23480c) {
            this.f90115b = interfaceC23436D;
            this.f90116c = interfaceC23480c;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90117d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90117d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f90119f) {
                return;
            }
            this.f90119f = true;
            this.f90115b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90119f) {
                C24508a.m31988u(th);
                return;
            }
            this.f90119f = true;
            this.f90115b.onError(th);
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object] */
        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90119f) {
                return;
            }
            InterfaceC23436D<? super T> interfaceC23436D = this.f90115b;
            T t2 = this.f90118e;
            if (t2 == null) {
                this.f90118e = t;
                interfaceC23436D.onNext(t);
                return;
            }
            try {
                ?? r4 = (T) C23544b.m32923e(this.f90116c.apply(t2, t), "The value returned by the accumulator is null");
                this.f90118e = r4;
                interfaceC23436D.onNext(r4);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90117d.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90117d, interfaceC23465c)) {
                this.f90117d = interfaceC23465c;
                this.f90115b.onSubscribe(this);
            }
        }
    }

    public C24157b1(InterfaceC23434B<T> interfaceC23434B, InterfaceC23480c<T, T, T> interfaceC23480c) {
        super(interfaceC23434B);
        this.f90114c = interfaceC23480c;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24158a(interfaceC23436D, this.f90114c));
    }
}
