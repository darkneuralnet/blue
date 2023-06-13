package io.reactivex.internal.operators.observable;

import io.reactivex.C24576w;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.observable.I */
/* loaded from: classes6.dex */
public final class C24021I<T, R> extends AbstractC24145a<T, R> {

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends C24576w<R>> f89664c;

    /* renamed from: io.reactivex.internal.operators.observable.I$a */
    /* loaded from: classes6.dex */
    public static final class C24022a<T, R> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f89665b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends C24576w<R>> f89666c;

        /* renamed from: d */
        public boolean f89667d;

        /* renamed from: e */
        public InterfaceC23465c f89668e;

        public C24022a(InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23492o<? super T, ? extends C24576w<R>> interfaceC23492o) {
            this.f89665b = interfaceC23436D;
            this.f89666c = interfaceC23492o;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89668e.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89668e.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f89667d) {
                return;
            }
            this.f89667d = true;
            this.f89665b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89667d) {
                C24508a.m31988u(th);
                return;
            }
            this.f89667d = true;
            this.f89665b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f89667d) {
                if (t instanceof C24576w) {
                    C24576w c24576w = (C24576w) t;
                    if (c24576w.m31857g()) {
                        C24508a.m31988u(c24576w.m31860d());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                C24576w c24576w2 = (C24576w) C23544b.m32923e(this.f89666c.apply(t), "The selector returned a null Notification");
                if (c24576w2.m31857g()) {
                    this.f89668e.dispose();
                    onError(c24576w2.m31860d());
                } else if (c24576w2.m31858f()) {
                    this.f89668e.dispose();
                    onComplete();
                } else {
                    this.f89665b.onNext((Object) c24576w2.m31859e());
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f89668e.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89668e, interfaceC23465c)) {
                this.f89668e = interfaceC23465c;
                this.f89665b.onSubscribe(this);
            }
        }
    }

    public C24021I(InterfaceC23434B<T> interfaceC23434B, InterfaceC23492o<? super T, ? extends C24576w<R>> interfaceC23492o) {
        super(interfaceC23434B);
        this.f89664c = interfaceC23492o;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        this.f90078b.subscribe(new C24022a(interfaceC23436D, this.f89664c));
    }
}
