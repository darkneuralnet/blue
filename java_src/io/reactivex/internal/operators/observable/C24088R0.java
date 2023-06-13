package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.C23505h;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.observable.R0 */
/* loaded from: classes6.dex */
public final class C24088R0<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final long f89911c;

    /* renamed from: io.reactivex.internal.operators.observable.R0$a */
    /* loaded from: classes6.dex */
    public static final class C24089a<T> extends AtomicInteger implements InterfaceC23436D<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89912b;

        /* renamed from: c */
        public final C23505h f89913c;

        /* renamed from: d */
        public final InterfaceC23434B<? extends T> f89914d;

        /* renamed from: e */
        public long f89915e;

        public C24089a(InterfaceC23436D<? super T> interfaceC23436D, long j, C23505h c23505h, InterfaceC23434B<? extends T> interfaceC23434B) {
            this.f89912b = interfaceC23436D;
            this.f89913c = c23505h;
            this.f89914d = interfaceC23434B;
            this.f89915e = j;
        }

        /* renamed from: a */
        public void m32604a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f89913c.mo1769e()) {
                    this.f89914d.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            long j = this.f89915e;
            if (j != LongCompanionObject.MAX_VALUE) {
                this.f89915e = j - 1;
            }
            if (j != 0) {
                m32604a();
            } else {
                this.f89912b.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f89912b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f89912b.onNext(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f89913c.m32981a(interfaceC23465c);
        }
    }

    public C24088R0(Observable<T> observable, long j) {
        super(observable);
        this.f89911c = j;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C23505h c23505h = new C23505h();
        interfaceC23436D.onSubscribe(c23505h);
        long j = this.f89911c;
        long j2 = LongCompanionObject.MAX_VALUE;
        if (j != LongCompanionObject.MAX_VALUE) {
            j2 = j - 1;
        }
        new C24089a(interfaceC23436D, j2, c23505h, this.f90078b).m32604a();
    }
}
