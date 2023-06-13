package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.fuseable.InterfaceC23549d;
import io.reactivex.plugins.C24508a;
import java.util.NoSuchElementException;
/* renamed from: io.reactivex.internal.operators.observable.T */
/* loaded from: classes6.dex */
public final class C24094T<T> extends AbstractC23442F<T> implements InterfaceC23549d<T> {

    /* renamed from: b */
    public final InterfaceC23434B<T> f89928b;

    /* renamed from: c */
    public final long f89929c;

    /* renamed from: d */
    public final T f89930d;

    /* renamed from: io.reactivex.internal.operators.observable.T$a */
    /* loaded from: classes6.dex */
    public static final class C24095a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f89931b;

        /* renamed from: c */
        public final long f89932c;

        /* renamed from: d */
        public final T f89933d;

        /* renamed from: e */
        public InterfaceC23465c f89934e;

        /* renamed from: f */
        public long f89935f;

        /* renamed from: g */
        public boolean f89936g;

        public C24095a(InterfaceC23445I<? super T> interfaceC23445I, long j, T t) {
            this.f89931b = interfaceC23445I;
            this.f89932c = j;
            this.f89933d = t;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89934e.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89934e.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (!this.f89936g) {
                this.f89936g = true;
                T t = this.f89933d;
                if (t != null) {
                    this.f89931b.onSuccess(t);
                } else {
                    this.f89931b.onError(new NoSuchElementException());
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89936g) {
                C24508a.m31988u(th);
                return;
            }
            this.f89936g = true;
            this.f89931b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f89936g) {
                return;
            }
            long j = this.f89935f;
            if (j == this.f89932c) {
                this.f89936g = true;
                this.f89934e.dispose();
                this.f89931b.onSuccess(t);
                return;
            }
            this.f89935f = j + 1;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89934e, interfaceC23465c)) {
                this.f89934e = interfaceC23465c;
                this.f89931b.onSubscribe(this);
            }
        }
    }

    public C24094T(InterfaceC23434B<T> interfaceC23434B, long j, T t) {
        this.f89928b = interfaceC23434B;
        this.f89929c = j;
        this.f89930d = t;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f89928b.subscribe(new C24095a(interfaceC23445I, this.f89929c, this.f89930d));
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23549d
    /* renamed from: c */
    public Observable<T> mo32427c() {
        return C24508a.m31994o(new C24082Q(this.f89928b, this.f89929c, this.f89930d, true));
    }
}
