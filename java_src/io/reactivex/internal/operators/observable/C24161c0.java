package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.observable.c0 */
/* loaded from: classes6.dex */
public final class C24161c0<T, R> extends AbstractC24145a<T, R> {

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends Iterable<? extends R>> f90124c;

    /* renamed from: io.reactivex.internal.operators.observable.c0$a */
    /* loaded from: classes6.dex */
    public static final class C24162a<T, R> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f90125b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends Iterable<? extends R>> f90126c;

        /* renamed from: d */
        public InterfaceC23465c f90127d;

        public C24162a(InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23492o<? super T, ? extends Iterable<? extends R>> interfaceC23492o) {
            this.f90125b = interfaceC23436D;
            this.f90126c = interfaceC23492o;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90127d.dispose();
            this.f90127d = EnumC23501d.DISPOSED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90127d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            InterfaceC23465c interfaceC23465c = this.f90127d;
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (interfaceC23465c == enumC23501d) {
                return;
            }
            this.f90127d = enumC23501d;
            this.f90125b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            InterfaceC23465c interfaceC23465c = this.f90127d;
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (interfaceC23465c == enumC23501d) {
                C24508a.m31988u(th);
                return;
            }
            this.f90127d = enumC23501d;
            this.f90125b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90127d == EnumC23501d.DISPOSED) {
                return;
            }
            try {
                InterfaceC23436D<? super R> interfaceC23436D = this.f90125b;
                for (R r : this.f90126c.apply(t)) {
                    try {
                        try {
                            interfaceC23436D.onNext((Object) C23544b.m32923e(r, "The iterator returned a null value"));
                        } catch (Throwable th) {
                            C23475a.m33009b(th);
                            this.f90127d.dispose();
                            onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        C23475a.m33009b(th2);
                        this.f90127d.dispose();
                        onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                C23475a.m33009b(th3);
                this.f90127d.dispose();
                onError(th3);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90127d, interfaceC23465c)) {
                this.f90127d = interfaceC23465c;
                this.f90125b.onSubscribe(this);
            }
        }
    }

    public C24161c0(InterfaceC23434B<T> interfaceC23434B, InterfaceC23492o<? super T, ? extends Iterable<? extends R>> interfaceC23492o) {
        super(interfaceC23434B);
        this.f90124c = interfaceC23492o;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        this.f90078b.subscribe(new C24162a(interfaceC23436D, this.f90124c));
    }
}
