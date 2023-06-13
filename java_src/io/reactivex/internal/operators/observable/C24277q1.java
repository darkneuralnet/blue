package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.observable.q1 */
/* loaded from: classes6.dex */
public final class C24277q1<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final long f90507c;

    /* renamed from: io.reactivex.internal.operators.observable.q1$a */
    /* loaded from: classes6.dex */
    public static final class C24278a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90508b;

        /* renamed from: c */
        public boolean f90509c;

        /* renamed from: d */
        public InterfaceC23465c f90510d;

        /* renamed from: e */
        public long f90511e;

        public C24278a(InterfaceC23436D<? super T> interfaceC23436D, long j) {
            this.f90508b = interfaceC23436D;
            this.f90511e = j;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90510d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90510d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (!this.f90509c) {
                this.f90509c = true;
                this.f90510d.dispose();
                this.f90508b.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90509c) {
                C24508a.m31988u(th);
                return;
            }
            this.f90509c = true;
            this.f90510d.dispose();
            this.f90508b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            boolean z;
            if (!this.f90509c) {
                long j = this.f90511e;
                long j2 = j - 1;
                this.f90511e = j2;
                if (j > 0) {
                    if (j2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f90508b.onNext(t);
                    if (z) {
                        onComplete();
                    }
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90510d, interfaceC23465c)) {
                this.f90510d = interfaceC23465c;
                if (this.f90511e == 0) {
                    this.f90509c = true;
                    interfaceC23465c.dispose();
                    EnumC23502e.m32990d(this.f90508b);
                    return;
                }
                this.f90508b.onSubscribe(this);
            }
        }
    }

    public C24277q1(InterfaceC23434B<T> interfaceC23434B, long j) {
        super(interfaceC23434B);
        this.f90507c = j;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24278a(interfaceC23436D, this.f90507c));
    }
}
