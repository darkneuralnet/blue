package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.C23505h;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.observable.F0 */
/* loaded from: classes6.dex */
public final class C23997F0<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23492o<? super Throwable, ? extends InterfaceC23434B<? extends T>> f89585c;

    /* renamed from: d */
    public final boolean f89586d;

    /* renamed from: io.reactivex.internal.operators.observable.F0$a */
    /* loaded from: classes6.dex */
    public static final class C23998a<T> implements InterfaceC23436D<T> {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89587b;

        /* renamed from: c */
        public final InterfaceC23492o<? super Throwable, ? extends InterfaceC23434B<? extends T>> f89588c;

        /* renamed from: d */
        public final boolean f89589d;

        /* renamed from: e */
        public final C23505h f89590e = new C23505h();

        /* renamed from: f */
        public boolean f89591f;

        /* renamed from: g */
        public boolean f89592g;

        public C23998a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23492o<? super Throwable, ? extends InterfaceC23434B<? extends T>> interfaceC23492o, boolean z) {
            this.f89587b = interfaceC23436D;
            this.f89588c = interfaceC23492o;
            this.f89589d = z;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f89592g) {
                return;
            }
            this.f89592g = true;
            this.f89591f = true;
            this.f89587b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f89591f) {
                if (this.f89592g) {
                    C24508a.m31988u(th);
                    return;
                } else {
                    this.f89587b.onError(th);
                    return;
                }
            }
            this.f89591f = true;
            if (this.f89589d && !(th instanceof Exception)) {
                this.f89587b.onError(th);
                return;
            }
            try {
                InterfaceC23434B<? extends T> apply = this.f89588c.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("Observable is null");
                    nullPointerException.initCause(th);
                    this.f89587b.onError(nullPointerException);
                    return;
                }
                apply.subscribe(this);
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                this.f89587b.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f89592g) {
                return;
            }
            this.f89587b.onNext(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f89590e.m32981a(interfaceC23465c);
        }
    }

    public C23997F0(InterfaceC23434B<T> interfaceC23434B, InterfaceC23492o<? super Throwable, ? extends InterfaceC23434B<? extends T>> interfaceC23492o, boolean z) {
        super(interfaceC23434B);
        this.f89585c = interfaceC23492o;
        this.f89586d = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C23998a c23998a = new C23998a(interfaceC23436D, this.f89585c, this.f89586d);
        interfaceC23436D.onSubscribe(c23998a.f89590e);
        this.f90078b.subscribe(c23998a);
    }
}
