package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.fuseable.InterfaceC23550e;
import io.reactivex.internal.observers.AbstractC23557b;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.observable.N */
/* loaded from: classes6.dex */
public final class C24063N<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23478a f89810c;

    /* renamed from: io.reactivex.internal.operators.observable.N$a */
    /* loaded from: classes6.dex */
    public static final class C24064a<T> extends AbstractC23557b<T> implements InterfaceC23436D<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89811b;

        /* renamed from: c */
        public final InterfaceC23478a f89812c;

        /* renamed from: d */
        public InterfaceC23465c f89813d;

        /* renamed from: e */
        public InterfaceC23550e<T> f89814e;

        /* renamed from: f */
        public boolean f89815f;

        public C24064a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23478a interfaceC23478a) {
            this.f89811b = interfaceC23436D;
            this.f89812c = interfaceC23478a;
        }

        /* renamed from: a */
        public void m32626a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f89812c.run();
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    C24508a.m31988u(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public int mo31868b(int i) {
            InterfaceC23550e<T> interfaceC23550e = this.f89814e;
            boolean z = false;
            if (interfaceC23550e == null || (i & 4) != 0) {
                return 0;
            }
            int mo31868b = interfaceC23550e.mo31868b(i);
            if (mo31868b != 0) {
                if (mo31868b == 1) {
                    z = true;
                }
                this.f89815f = z;
            }
            return mo31868b;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public void clear() {
            this.f89814e.clear();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89813d.dispose();
            m32626a();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89813d.mo1769e();
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public boolean isEmpty() {
            return this.f89814e.isEmpty();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89811b.onComplete();
            m32626a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f89811b.onError(th);
            m32626a();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f89811b.onNext(t);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89813d, interfaceC23465c)) {
                this.f89813d = interfaceC23465c;
                if (interfaceC23465c instanceof InterfaceC23550e) {
                    this.f89814e = (InterfaceC23550e) interfaceC23465c;
                }
                this.f89811b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public T poll() throws Exception {
            T poll = this.f89814e.poll();
            if (poll == null && this.f89815f) {
                m32626a();
            }
            return poll;
        }
    }

    public C24063N(InterfaceC23434B<T> interfaceC23434B, InterfaceC23478a interfaceC23478a) {
        super(interfaceC23434B);
        this.f89810c = interfaceC23478a;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24064a(interfaceC23436D, this.f89810c));
    }
}
