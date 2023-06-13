package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.internal.observers.AbstractC23557b;
/* renamed from: io.reactivex.internal.operators.observable.M0 */
/* loaded from: classes6.dex */
public final class C24058M0 extends Observable<Long> {

    /* renamed from: b */
    public final long f89796b;

    /* renamed from: c */
    public final long f89797c;

    /* renamed from: io.reactivex.internal.operators.observable.M0$a */
    /* loaded from: classes6.dex */
    public static final class C24059a extends AbstractC23557b<Long> {
        private static final long serialVersionUID = 396518478098735504L;

        /* renamed from: b */
        public final InterfaceC23436D<? super Long> f89798b;

        /* renamed from: c */
        public final long f89799c;

        /* renamed from: d */
        public long f89800d;

        /* renamed from: e */
        public boolean f89801e;

        public C24059a(InterfaceC23436D<? super Long> interfaceC23436D, long j, long j2) {
            this.f89798b = interfaceC23436D;
            this.f89800d = j;
            this.f89799c = j2;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        /* renamed from: a */
        public Long poll() throws Exception {
            long j = this.f89800d;
            if (j != this.f89799c) {
                this.f89800d = 1 + j;
                return Long.valueOf(j);
            }
            lazySet(1);
            return null;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            if ((i & 1) != 0) {
                this.f89801e = true;
                return 1;
            }
            return 0;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public void clear() {
            this.f89800d = this.f89799c;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            set(1);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return get() != 0;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public boolean isEmpty() {
            return this.f89800d == this.f89799c;
        }

        public void run() {
            if (this.f89801e) {
                return;
            }
            InterfaceC23436D<? super Long> interfaceC23436D = this.f89798b;
            long j = this.f89799c;
            for (long j2 = this.f89800d; j2 != j && get() == 0; j2++) {
                interfaceC23436D.onNext(Long.valueOf(j2));
            }
            if (get() == 0) {
                lazySet(1);
                interfaceC23436D.onComplete();
            }
        }
    }

    public C24058M0(long j, long j2) {
        this.f89796b = j;
        this.f89797c = j2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super Long> interfaceC23436D) {
        long j = this.f89796b;
        C24059a c24059a = new C24059a(interfaceC23436D, j, j + this.f89797c);
        interfaceC23436D.onSubscribe(c24059a);
        c24059a.run();
    }
}
