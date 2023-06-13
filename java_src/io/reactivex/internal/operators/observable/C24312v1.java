package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.observable.v1 */
/* loaded from: classes6.dex */
public final class C24312v1<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23494q<? super T> f90664c;

    /* renamed from: io.reactivex.internal.operators.observable.v1$a */
    /* loaded from: classes6.dex */
    public static final class C24313a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90665b;

        /* renamed from: c */
        public final InterfaceC23494q<? super T> f90666c;

        /* renamed from: d */
        public InterfaceC23465c f90667d;

        /* renamed from: e */
        public boolean f90668e;

        public C24313a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23494q<? super T> interfaceC23494q) {
            this.f90665b = interfaceC23436D;
            this.f90666c = interfaceC23494q;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90667d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90667d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (!this.f90668e) {
                this.f90668e = true;
                this.f90665b.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (!this.f90668e) {
                this.f90668e = true;
                this.f90665b.onError(th);
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (!this.f90668e) {
                this.f90665b.onNext(t);
                try {
                    if (this.f90666c.test(t)) {
                        this.f90668e = true;
                        this.f90667d.dispose();
                        this.f90665b.onComplete();
                    }
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    this.f90667d.dispose();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90667d, interfaceC23465c)) {
                this.f90667d = interfaceC23465c;
                this.f90665b.onSubscribe(this);
            }
        }
    }

    public C24312v1(InterfaceC23434B<T> interfaceC23434B, InterfaceC23494q<? super T> interfaceC23494q) {
        super(interfaceC23434B);
        this.f90664c = interfaceC23494q;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24313a(interfaceC23436D, this.f90664c));
    }
}
