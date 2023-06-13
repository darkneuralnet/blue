package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
import java.util.NoSuchElementException;
/* renamed from: io.reactivex.internal.operators.observable.h1 */
/* loaded from: classes6.dex */
public final class C24195h1<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC23434B<? extends T> f90231b;

    /* renamed from: c */
    public final T f90232c;

    /* renamed from: io.reactivex.internal.operators.observable.h1$a */
    /* loaded from: classes6.dex */
    public static final class C24196a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f90233b;

        /* renamed from: c */
        public final T f90234c;

        /* renamed from: d */
        public InterfaceC23465c f90235d;

        /* renamed from: e */
        public T f90236e;

        /* renamed from: f */
        public boolean f90237f;

        public C24196a(InterfaceC23445I<? super T> interfaceC23445I, T t) {
            this.f90233b = interfaceC23445I;
            this.f90234c = t;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90235d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90235d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f90237f) {
                return;
            }
            this.f90237f = true;
            T t = this.f90236e;
            this.f90236e = null;
            if (t == null) {
                t = this.f90234c;
            }
            if (t != null) {
                this.f90233b.onSuccess(t);
            } else {
                this.f90233b.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90237f) {
                C24508a.m31988u(th);
                return;
            }
            this.f90237f = true;
            this.f90233b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90237f) {
                return;
            }
            if (this.f90236e != null) {
                this.f90237f = true;
                this.f90235d.dispose();
                this.f90233b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.f90236e = t;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90235d, interfaceC23465c)) {
                this.f90235d = interfaceC23465c;
                this.f90233b.onSubscribe(this);
            }
        }
    }

    public C24195h1(InterfaceC23434B<? extends T> interfaceC23434B, T t) {
        this.f90231b = interfaceC23434B;
        this.f90232c = t;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f90231b.subscribe(new C24196a(interfaceC23445I, this.f90232c));
    }
}
