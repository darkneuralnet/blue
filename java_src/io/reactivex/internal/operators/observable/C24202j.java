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
/* renamed from: io.reactivex.internal.operators.observable.j */
/* loaded from: classes6.dex */
public final class C24202j<T> extends AbstractC23442F<Boolean> implements InterfaceC23549d<Boolean> {

    /* renamed from: b */
    public final InterfaceC23434B<T> f90248b;

    /* renamed from: c */
    public final InterfaceC23494q<? super T> f90249c;

    /* renamed from: io.reactivex.internal.operators.observable.j$a */
    /* loaded from: classes6.dex */
    public static final class C24203a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23445I<? super Boolean> f90250b;

        /* renamed from: c */
        public final InterfaceC23494q<? super T> f90251c;

        /* renamed from: d */
        public InterfaceC23465c f90252d;

        /* renamed from: e */
        public boolean f90253e;

        public C24203a(InterfaceC23445I<? super Boolean> interfaceC23445I, InterfaceC23494q<? super T> interfaceC23494q) {
            this.f90250b = interfaceC23445I;
            this.f90251c = interfaceC23494q;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90252d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90252d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (!this.f90253e) {
                this.f90253e = true;
                this.f90250b.onSuccess(Boolean.FALSE);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90253e) {
                C24508a.m31988u(th);
                return;
            }
            this.f90253e = true;
            this.f90250b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90253e) {
                return;
            }
            try {
                if (this.f90251c.test(t)) {
                    this.f90253e = true;
                    this.f90252d.dispose();
                    this.f90250b.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90252d.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90252d, interfaceC23465c)) {
                this.f90252d = interfaceC23465c;
                this.f90250b.onSubscribe(this);
            }
        }
    }

    public C24202j(InterfaceC23434B<T> interfaceC23434B, InterfaceC23494q<? super T> interfaceC23494q) {
        this.f90248b = interfaceC23434B;
        this.f90249c = interfaceC23494q;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super Boolean> interfaceC23445I) {
        this.f90248b.subscribe(new C24203a(interfaceC23445I, this.f90249c));
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23549d
    /* renamed from: c */
    public Observable<Boolean> mo32427c() {
        return C24508a.m31994o(new C24197i(this.f90248b, this.f90249c));
    }
}
