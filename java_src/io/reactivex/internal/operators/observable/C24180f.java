package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.observable.f */
/* loaded from: classes6.dex */
public final class C24180f<T> extends AbstractC24145a<T, Boolean> {

    /* renamed from: c */
    public final InterfaceC23494q<? super T> f90193c;

    /* renamed from: io.reactivex.internal.operators.observable.f$a */
    /* loaded from: classes6.dex */
    public static final class C24181a<T> implements InterfaceC23436D<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23436D<? super Boolean> f90194b;

        /* renamed from: c */
        public final InterfaceC23494q<? super T> f90195c;

        /* renamed from: d */
        public InterfaceC23465c f90196d;

        /* renamed from: e */
        public boolean f90197e;

        public C24181a(InterfaceC23436D<? super Boolean> interfaceC23436D, InterfaceC23494q<? super T> interfaceC23494q) {
            this.f90194b = interfaceC23436D;
            this.f90195c = interfaceC23494q;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f90196d.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90196d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            if (this.f90197e) {
                return;
            }
            this.f90197e = true;
            this.f90194b.onNext(Boolean.TRUE);
            this.f90194b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            if (this.f90197e) {
                C24508a.m31988u(th);
                return;
            }
            this.f90197e = true;
            this.f90194b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            if (this.f90197e) {
                return;
            }
            try {
                if (!this.f90195c.test(t)) {
                    this.f90197e = true;
                    this.f90196d.dispose();
                    this.f90194b.onNext(Boolean.FALSE);
                    this.f90194b.onComplete();
                }
            } catch (Throwable th) {
                C23475a.m33009b(th);
                this.f90196d.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90196d, interfaceC23465c)) {
                this.f90196d = interfaceC23465c;
                this.f90194b.onSubscribe(this);
            }
        }
    }

    public C24180f(InterfaceC23434B<T> interfaceC23434B, InterfaceC23494q<? super T> interfaceC23494q) {
        super(interfaceC23434B);
        this.f90193c = interfaceC23494q;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super Boolean> interfaceC23436D) {
        this.f90078b.subscribe(new C24181a(interfaceC23436D, this.f90193c));
    }
}
