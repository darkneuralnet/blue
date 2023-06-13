package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.fuseable.InterfaceC23549d;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.observable.g */
/* loaded from: classes6.dex */
public final class C24184g<T> extends AbstractC23442F<Boolean> implements InterfaceC23549d<Boolean> {

    /* renamed from: b */
    public final InterfaceC23434B<T> f90201b;

    /* renamed from: c */
    public final InterfaceC23494q<? super T> f90202c;

    /* renamed from: io.reactivex.internal.operators.observable.g$a */
    /* loaded from: classes6.dex */
    public static final class C24185a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23445I<? super Boolean> f90203b;

        /* renamed from: c */
        public final InterfaceC23494q<? super T> f90204c;

        /* renamed from: d */
        public InterfaceC23465c f90205d;

        /* renamed from: e */
        public boolean f90206e;

        public C24185a(InterfaceC23445I<? super Boolean> interfaceC23445I, InterfaceC23494q<? super T> interfaceC23494q) {
            this.f90203b = interfaceC23445I;
            this.f90204c = interfaceC23494q;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90205d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90205d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f90206e) {
                return;
            }
            this.f90206e = true;
            this.f90203b.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90206e) {
                C24508a.m31988u(th);
                return;
            }
            this.f90206e = true;
            this.f90203b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90206e) {
                return;
            }
            try {
                if (!this.f90204c.test(t)) {
                    this.f90206e = true;
                    this.f90205d.dispose();
                    this.f90203b.onSuccess(Boolean.FALSE);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90205d.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90205d, interfaceC23465c)) {
                this.f90205d = interfaceC23465c;
                this.f90203b.onSubscribe(this);
            }
        }
    }

    public C24184g(InterfaceC23434B<T> interfaceC23434B, InterfaceC23494q<? super T> interfaceC23494q) {
        this.f90201b = interfaceC23434B;
        this.f90202c = interfaceC23494q;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super Boolean> interfaceC23445I) {
        this.f90201b.subscribe(new C24185a(interfaceC23445I, this.f90202c));
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23549d
    /* renamed from: c */
    public Observable<Boolean> mo32427c() {
        return C24508a.m31994o(new C24180f(this.f90201b, this.f90202c));
    }
}
