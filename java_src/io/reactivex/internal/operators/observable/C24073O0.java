package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.observable.O0 */
/* loaded from: classes6.dex */
public final class C24073O0<T, R> extends AbstractC23442F<R> {

    /* renamed from: b */
    public final InterfaceC23434B<T> f89848b;

    /* renamed from: c */
    public final R f89849c;

    /* renamed from: d */
    public final InterfaceC23480c<R, ? super T, R> f89850d;

    /* renamed from: io.reactivex.internal.operators.observable.O0$a */
    /* loaded from: classes6.dex */
    public static final class C24074a<T, R> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23445I<? super R> f89851b;

        /* renamed from: c */
        public final InterfaceC23480c<R, ? super T, R> f89852c;

        /* renamed from: d */
        public R f89853d;

        /* renamed from: e */
        public InterfaceC23465c f89854e;

        public C24074a(InterfaceC23445I<? super R> interfaceC23445I, InterfaceC23480c<R, ? super T, R> interfaceC23480c, R r) {
            this.f89851b = interfaceC23445I;
            this.f89853d = r;
            this.f89852c = interfaceC23480c;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89854e.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89854e.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            R r = this.f89853d;
            if (r != null) {
                this.f89853d = null;
                this.f89851b.onSuccess(r);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89853d != null) {
                this.f89853d = null;
                this.f89851b.onError(th);
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            R r = this.f89853d;
            if (r != null) {
                try {
                    this.f89853d = (R) C23544b.m32923e(this.f89852c.apply(r, t), "The reducer returned a null value");
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    this.f89854e.dispose();
                    onError(th);
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89854e, interfaceC23465c)) {
                this.f89854e = interfaceC23465c;
                this.f89851b.onSubscribe(this);
            }
        }
    }

    public C24073O0(InterfaceC23434B<T> interfaceC23434B, R r, InterfaceC23480c<R, ? super T, R> interfaceC23480c) {
        this.f89848b = interfaceC23434B;
        this.f89849c = r;
        this.f89850d = interfaceC23480c;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super R> interfaceC23445I) {
        this.f89848b.subscribe(new C24074a(interfaceC23445I, this.f89850d, this.f89849c));
    }
}
