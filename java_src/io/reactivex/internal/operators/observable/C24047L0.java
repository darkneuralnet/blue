package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.internal.observers.AbstractC23557b;
/* renamed from: io.reactivex.internal.operators.observable.L0 */
/* loaded from: classes6.dex */
public final class C24047L0 extends Observable<Integer> {

    /* renamed from: b */
    public final int f89745b;

    /* renamed from: c */
    public final long f89746c;

    /* renamed from: io.reactivex.internal.operators.observable.L0$a */
    /* loaded from: classes6.dex */
    public static final class C24048a extends AbstractC23557b<Integer> {
        private static final long serialVersionUID = 396518478098735504L;

        /* renamed from: b */
        public final InterfaceC23436D<? super Integer> f89747b;

        /* renamed from: c */
        public final long f89748c;

        /* renamed from: d */
        public long f89749d;

        /* renamed from: e */
        public boolean f89750e;

        public C24048a(InterfaceC23436D<? super Integer> interfaceC23436D, long j, long j2) {
            this.f89747b = interfaceC23436D;
            this.f89749d = j;
            this.f89748c = j2;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        /* renamed from: a */
        public Integer poll() throws Exception {
            long j = this.f89749d;
            if (j != this.f89748c) {
                this.f89749d = 1 + j;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            if ((i & 1) != 0) {
                this.f89750e = true;
                return 1;
            }
            return 0;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public void clear() {
            this.f89749d = this.f89748c;
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
            return this.f89749d == this.f89748c;
        }

        public void run() {
            if (this.f89750e) {
                return;
            }
            InterfaceC23436D<? super Integer> interfaceC23436D = this.f89747b;
            long j = this.f89748c;
            for (long j2 = this.f89749d; j2 != j && get() == 0; j2++) {
                interfaceC23436D.onNext(Integer.valueOf((int) j2));
            }
            if (get() == 0) {
                lazySet(1);
                interfaceC23436D.onComplete();
            }
        }
    }

    public C24047L0(int i, int i2) {
        this.f89745b = i;
        this.f89746c = i + i2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super Integer> interfaceC23436D) {
        C24048a c24048a = new C24048a(interfaceC23436D, this.f89745b, this.f89746c);
        interfaceC23436D.onSubscribe(c24048a);
        c24048a.run();
    }
}
