package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.operators.single.h */
/* loaded from: classes6.dex */
public final class C24371h<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC23447K<T> f90828b;

    /* renamed from: c */
    public final InterfaceC23478a f90829c;

    /* renamed from: io.reactivex.internal.operators.single.h$a */
    /* loaded from: classes6.dex */
    public static final class C24372a<T> extends AtomicInteger implements InterfaceC23445I<T>, InterfaceC23465c {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f90830b;

        /* renamed from: c */
        public final InterfaceC23478a f90831c;

        /* renamed from: d */
        public InterfaceC23465c f90832d;

        public C24372a(InterfaceC23445I<? super T> interfaceC23445I, InterfaceC23478a interfaceC23478a) {
            this.f90830b = interfaceC23445I;
            this.f90831c = interfaceC23478a;
        }

        /* renamed from: a */
        public void m32395a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f90831c.run();
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    C24508a.m31988u(th);
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90832d.dispose();
            m32395a();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90832d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            this.f90830b.onError(th);
            m32395a();
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90832d, interfaceC23465c)) {
                this.f90832d = interfaceC23465c;
                this.f90830b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            this.f90830b.onSuccess(t);
            m32395a();
        }
    }

    public C24371h(InterfaceC23447K<T> interfaceC23447K, InterfaceC23478a interfaceC23478a) {
        this.f90828b = interfaceC23447K;
        this.f90829c = interfaceC23478a;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f90828b.mo33096a(new C24372a(interfaceC23445I, this.f90829c));
    }
}
