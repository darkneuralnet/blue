package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.observable.w1 */
/* loaded from: classes6.dex */
public final class C24317w1<T> extends AbstractC24145a<T, T> {

    /* renamed from: c */
    public final InterfaceC23494q<? super T> f90687c;

    /* renamed from: io.reactivex.internal.operators.observable.w1$a */
    /* loaded from: classes6.dex */
    public static final class C24318a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f90688b;

        /* renamed from: c */
        public final InterfaceC23494q<? super T> f90689c;

        /* renamed from: d */
        public InterfaceC23465c f90690d;

        /* renamed from: e */
        public boolean f90691e;

        public C24318a(InterfaceC23436D<? super T> interfaceC23436D, InterfaceC23494q<? super T> interfaceC23494q) {
            this.f90688b = interfaceC23436D;
            this.f90689c = interfaceC23494q;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90690d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90690d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f90691e) {
                return;
            }
            this.f90691e = true;
            this.f90688b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90691e) {
                C24508a.m31988u(th);
                return;
            }
            this.f90691e = true;
            this.f90688b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90691e) {
                return;
            }
            try {
                if (!this.f90689c.test(t)) {
                    this.f90691e = true;
                    this.f90690d.dispose();
                    this.f90688b.onComplete();
                    return;
                }
                this.f90688b.onNext(t);
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90690d.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90690d, interfaceC23465c)) {
                this.f90690d = interfaceC23465c;
                this.f90688b.onSubscribe(this);
            }
        }
    }

    public C24317w1(InterfaceC23434B<T> interfaceC23434B, InterfaceC23494q<? super T> interfaceC23494q) {
        super(interfaceC23434B);
        this.f90687c = interfaceC23494q;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        this.f90078b.subscribe(new C24318a(interfaceC23436D, this.f90687c));
    }
}
