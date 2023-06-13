package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
/* renamed from: io.reactivex.internal.operators.observable.G0 */
/* loaded from: classes6.dex */
public final class C24007G0<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23492o<? super Throwable, ? extends T> f89613c;

    /* renamed from: io.reactivex.internal.operators.observable.G0$a */
    /* loaded from: classes6.dex */
    public static final class C24008a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89614b;

        /* renamed from: c */
        public final InterfaceC23492o<? super Throwable, ? extends T> f89615c;

        /* renamed from: d */
        public InterfaceC23465c f89616d;

        public C24008a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23492o<? super Throwable, ? extends T> interfaceC23492o) {
            this.f89614b = interfaceC23436D;
            this.f89615c = interfaceC23492o;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89616d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89616d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89614b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            try {
                T apply = this.f89615c.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f89614b.onError(nullPointerException);
                    return;
                }
                this.f89614b.onNext(apply);
                this.f89614b.onComplete();
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                this.f89614b.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f89614b.onNext(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89616d, interfaceC23465c)) {
                this.f89616d = interfaceC23465c;
                this.f89614b.onSubscribe(this);
            }
        }
    }

    public C24007G0(InterfaceC23434B<T> interfaceC23434B, InterfaceC23492o<? super Throwable, ? extends T> interfaceC23492o) {
        super(interfaceC23434B);
        this.f89613c = interfaceC23492o;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24008a(interfaceC23436D, this.f89613c));
    }
}
