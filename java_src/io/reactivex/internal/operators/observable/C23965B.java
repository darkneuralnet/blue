package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.fuseable.InterfaceC23549d;
import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.operators.observable.B */
/* loaded from: classes6.dex */
public final class C23965B<T> extends AbstractC23442F<Long> implements InterfaceC23549d<Long> {

    /* renamed from: b */
    public final InterfaceC23434B<T> f89479b;

    /* renamed from: io.reactivex.internal.operators.observable.B$a */
    /* loaded from: classes6.dex */
    public static final class C23966a implements InterfaceC23436D<Object>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23445I<? super Long> f89480b;

        /* renamed from: c */
        public InterfaceC23465c f89481c;

        /* renamed from: d */
        public long f89482d;

        public C23966a(InterfaceC23445I<? super Long> interfaceC23445I) {
            this.f89480b = interfaceC23445I;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89481c.dispose();
            this.f89481c = EnumC23501d.DISPOSED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89481c.mo1769e();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89481c = EnumC23501d.DISPOSED;
            this.f89480b.onSuccess(Long.valueOf(this.f89482d));
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f89481c = EnumC23501d.DISPOSED;
            this.f89480b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(Object obj) {
            this.f89482d++;
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89481c, interfaceC23465c)) {
                this.f89481c = interfaceC23465c;
                this.f89480b.onSubscribe(this);
            }
        }
    }

    public C23965B(InterfaceC23434B<T> interfaceC23434B) {
        this.f89479b = interfaceC23434B;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super Long> interfaceC23445I) {
        this.f89479b.subscribe(new C23966a(interfaceC23445I));
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23549d
    /* renamed from: c */
    public Observable<Long> mo32427c() {
        return C24508a.m31994o(new C23955A(this.f89479b));
    }
}
