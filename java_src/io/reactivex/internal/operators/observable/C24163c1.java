package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.observable.c1 */
/* loaded from: classes6.dex */
public final class C24163c1<T, R> extends AbstractC24145a<T, R> {

    /* renamed from: c */
    public final InterfaceC23480c<R, ? super T, R> f90128c;

    /* renamed from: d */
    public final Callable<R> f90129d;

    /* renamed from: io.reactivex.internal.operators.observable.c1$a */
    /* loaded from: classes6.dex */
    public static final class C24164a<T, R> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f90130b;

        /* renamed from: c */
        public final InterfaceC23480c<R, ? super T, R> f90131c;

        /* renamed from: d */
        public R f90132d;

        /* renamed from: e */
        public InterfaceC23465c f90133e;

        /* renamed from: f */
        public boolean f90134f;

        public C24164a(InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23480c<R, ? super T, R> interfaceC23480c, R r) {
            this.f90130b = interfaceC23436D;
            this.f90131c = interfaceC23480c;
            this.f90132d = r;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90133e.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90133e.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f90134f) {
                return;
            }
            this.f90134f = true;
            this.f90130b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90134f) {
                C24508a.m31988u(th);
                return;
            }
            this.f90134f = true;
            this.f90130b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90134f) {
                return;
            }
            try {
                R r = (R) C23544b.m32923e(this.f90131c.apply(this.f90132d, t), "The accumulator returned a null value");
                this.f90132d = r;
                this.f90130b.onNext(r);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90133e.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90133e, interfaceC23465c)) {
                this.f90133e = interfaceC23465c;
                this.f90130b.onSubscribe(this);
                this.f90130b.onNext((R) this.f90132d);
            }
        }
    }

    public C24163c1(InterfaceC23434B<T> interfaceC23434B, Callable<R> callable, InterfaceC23480c<R, ? super T, R> interfaceC23480c) {
        super(interfaceC23434B);
        this.f90128c = interfaceC23480c;
        this.f90129d = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        try {
            this.f90078b.subscribe(new C24164a(interfaceC23436D, this.f90128c, C23544b.m32923e(this.f90129d.call(), "The seed supplied is null")));
        } catch (Throwable th) {
            C23475a.m33009b(th);
            EnumC23502e.m32987i(th, interfaceC23436D);
        }
    }
}
