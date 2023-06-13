package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24541s;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
/* renamed from: io.reactivex.internal.operators.maybe.u */
/* loaded from: classes6.dex */
public final class C23908u<T> extends AbstractC24507p<T> {

    /* renamed from: b */
    public final InterfaceC23447K<T> f89284b;

    /* renamed from: io.reactivex.internal.operators.maybe.u$a */
    /* loaded from: classes6.dex */
    public static final class C23909a<T> implements InterfaceC23445I<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89285b;

        /* renamed from: c */
        public InterfaceC23465c f89286c;

        public C23909a(InterfaceC24541s<? super T> interfaceC24541s) {
            this.f89285b = interfaceC24541s;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89286c.dispose();
            this.f89286c = EnumC23501d.DISPOSED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89286c.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            this.f89286c = EnumC23501d.DISPOSED;
            this.f89285b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89286c, interfaceC23465c)) {
                this.f89286c = interfaceC23465c;
                this.f89285b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            this.f89286c = EnumC23501d.DISPOSED;
            this.f89285b.onSuccess(t);
        }
    }

    public C23908u(InterfaceC23447K<T> interfaceC23447K) {
        this.f89284b = interfaceC23447K;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f89284b.mo33096a(new C23909a(interfaceC24541s));
    }
}
