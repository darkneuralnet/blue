package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.disposables.C23505h;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.observable.W0 */
/* loaded from: classes6.dex */
public final class C24122W0<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23494q<? super Throwable> f89993c;

    /* renamed from: d */
    public final long f89994d;

    /* renamed from: io.reactivex.internal.operators.observable.W0$a */
    /* loaded from: classes6.dex */
    public static final class C24123a<T> extends AtomicInteger implements InterfaceC23436D<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89995b;

        /* renamed from: c */
        public final C23505h f89996c;

        /* renamed from: d */
        public final InterfaceC23434B<? extends T> f89997d;

        /* renamed from: e */
        public final InterfaceC23494q<? super Throwable> f89998e;

        /* renamed from: f */
        public long f89999f;

        public C24123a(InterfaceC23436D<? super T> interfaceC23436D, long j, InterfaceC23494q<? super Throwable> interfaceC23494q, C23505h c23505h, InterfaceC23434B<? extends T> interfaceC23434B) {
            this.f89995b = interfaceC23436D;
            this.f89996c = c23505h;
            this.f89997d = interfaceC23434B;
            this.f89998e = interfaceC23494q;
            this.f89999f = j;
        }

        /* renamed from: a */
        public void m32571a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f89996c.mo1769e()) {
                    this.f89997d.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89995b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            long j = this.f89999f;
            if (j != LongCompanionObject.MAX_VALUE) {
                this.f89999f = j - 1;
            }
            if (j == 0) {
                this.f89995b.onError(th);
                return;
            }
            try {
                if (!this.f89998e.test(th)) {
                    this.f89995b.onError(th);
                } else {
                    m32571a();
                }
            } catch (Throwable th2) {
                C23475a.m33009b(th2);
                this.f89995b.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f89995b.onNext(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f89996c.m32981a(interfaceC23465c);
        }
    }

    public C24122W0(Observable<T> observable, long j, InterfaceC23494q<? super Throwable> interfaceC23494q) {
        super(observable);
        this.f89993c = interfaceC23494q;
        this.f89994d = j;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C23505h c23505h = new C23505h();
        interfaceC23436D.onSubscribe(c23505h);
        new C24123a(interfaceC23436D, this.f89994d, this.f89993c, c23505h, this.f90078b).m32571a();
    }
}
