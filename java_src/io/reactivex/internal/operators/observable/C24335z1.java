package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.schedulers.C24551b;
import java.util.concurrent.TimeUnit;
/* renamed from: io.reactivex.internal.operators.observable.z1 */
/* loaded from: classes6.dex */
public final class C24335z1<T> extends AbstractC24145a<T, C24551b<T>> {

    /* renamed from: c */
    public final AbstractC23437E f90742c;

    /* renamed from: d */
    public final TimeUnit f90743d;

    /* renamed from: io.reactivex.internal.operators.observable.z1$a */
    /* loaded from: classes6.dex */
    public static final class C24336a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super C24551b<T>> f90744b;

        /* renamed from: c */
        public final TimeUnit f90745c;

        /* renamed from: d */
        public final AbstractC23437E f90746d;

        /* renamed from: e */
        public long f90747e;

        /* renamed from: f */
        public InterfaceC23465c f90748f;

        public C24336a(InterfaceC23436D<? super C24551b<T>> interfaceC23436D, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
            this.f90744b = interfaceC23436D;
            this.f90746d = abstractC23437E;
            this.f90745c = timeUnit;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90748f.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90748f.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90744b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90744b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            long m33168c = this.f90746d.m33168c(this.f90745c);
            long j = this.f90747e;
            this.f90747e = m33168c;
            this.f90744b.onNext(new C24551b(t, m33168c - j, this.f90745c));
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90748f, interfaceC23465c)) {
                this.f90748f = interfaceC23465c;
                this.f90747e = this.f90746d.m33168c(this.f90745c);
                this.f90744b.onSubscribe(this);
            }
        }
    }

    public C24335z1(InterfaceC23434B<T> interfaceC23434B, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        super(interfaceC23434B);
        this.f90742c = abstractC23437E;
        this.f90743d = timeUnit;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super C24551b<T>> interfaceC23436D) {
        this.f90078b.subscribe(new C24336a(interfaceC23436D, this.f90743d, this.f90742c));
    }
}
