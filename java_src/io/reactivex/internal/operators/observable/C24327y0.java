package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.functions.C23544b;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.observable.y0 */
/* loaded from: classes6.dex */
public final class C24327y0<T, R> extends AbstractC24145a<T, InterfaceC23434B<? extends R>> {

    /* renamed from: c */
    public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> f90712c;

    /* renamed from: d */
    public final InterfaceC23492o<? super Throwable, ? extends InterfaceC23434B<? extends R>> f90713d;

    /* renamed from: e */
    public final Callable<? extends InterfaceC23434B<? extends R>> f90714e;

    /* renamed from: io.reactivex.internal.operators.observable.y0$a */
    /* loaded from: classes6.dex */
    public static final class C24328a<T, R> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super InterfaceC23434B<? extends R>> f90715b;

        /* renamed from: c */
        public final InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> f90716c;

        /* renamed from: d */
        public final InterfaceC23492o<? super Throwable, ? extends InterfaceC23434B<? extends R>> f90717d;

        /* renamed from: e */
        public final Callable<? extends InterfaceC23434B<? extends R>> f90718e;

        /* renamed from: f */
        public InterfaceC23465c f90719f;

        public C24328a(InterfaceC23436D<? super InterfaceC23434B<? extends R>> interfaceC23436D, InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o, InterfaceC23492o<? super Throwable, ? extends InterfaceC23434B<? extends R>> interfaceC23492o2, Callable<? extends InterfaceC23434B<? extends R>> callable) {
            this.f90715b = interfaceC23436D;
            this.f90716c = interfaceC23492o;
            this.f90717d = interfaceC23492o2;
            this.f90718e = callable;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90719f.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90719f.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            try {
                this.f90715b.onNext((InterfaceC23434B) C23544b.m32923e(this.f90718e.call(), "The onComplete ObservableSource returned is null"));
                this.f90715b.onComplete();
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90715b.onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            try {
                this.f90715b.onNext((InterfaceC23434B) C23544b.m32923e(this.f90717d.apply(th), "The onError ObservableSource returned is null"));
                this.f90715b.onComplete();
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                this.f90715b.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            try {
                this.f90715b.onNext((InterfaceC23434B) C23544b.m32923e(this.f90716c.apply(t), "The onNext ObservableSource returned is null"));
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90715b.onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90719f, interfaceC23465c)) {
                this.f90719f = interfaceC23465c;
                this.f90715b.onSubscribe(this);
            }
        }
    }

    public C24327y0(InterfaceC23434B<T> interfaceC23434B, InterfaceC23492o<? super T, ? extends InterfaceC23434B<? extends R>> interfaceC23492o, InterfaceC23492o<? super Throwable, ? extends InterfaceC23434B<? extends R>> interfaceC23492o2, Callable<? extends InterfaceC23434B<? extends R>> callable) {
        super(interfaceC23434B);
        this.f90712c = interfaceC23492o;
        this.f90713d = interfaceC23492o2;
        this.f90714e = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super InterfaceC23434B<? extends R>> interfaceC23436D) {
        this.f90078b.subscribe(new C24328a(interfaceC23436D, this.f90712c, this.f90713d, this.f90714e));
    }
}
