package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.ArrayDeque;
/* renamed from: io.reactivex.internal.operators.observable.j1 */
/* loaded from: classes6.dex */
public final class C24206j1<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final int f90264c;

    /* renamed from: io.reactivex.internal.operators.observable.j1$a */
    /* loaded from: classes6.dex */
    public static final class C24207a<T> extends ArrayDeque<T> implements InterfaceC23436D<T>, InterfaceC23465c {
        private static final long serialVersionUID = -3807491841935125653L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90265b;

        /* renamed from: c */
        public final int f90266c;

        /* renamed from: d */
        public InterfaceC23465c f90267d;

        public C24207a(InterfaceC23436D<? super T> interfaceC23436D, int i) {
            super(i);
            this.f90265b = interfaceC23436D;
            this.f90266c = i;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90267d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90267d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90265b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90265b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90266c == size()) {
                this.f90265b.onNext((T) poll());
            }
            offer(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90267d, interfaceC23465c)) {
                this.f90267d = interfaceC23465c;
                this.f90265b.onSubscribe(this);
            }
        }
    }

    public C24206j1(InterfaceC23434B<T> interfaceC23434B, int i) {
        super(interfaceC23434B);
        this.f90264c = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24207a(interfaceC23436D, this.f90264c));
    }
}
