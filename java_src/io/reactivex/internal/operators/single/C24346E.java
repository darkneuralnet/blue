package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.subscriptions.C24459c;
/* renamed from: io.reactivex.internal.operators.single.E */
/* loaded from: classes6.dex */
public final class C24346E<T> extends AbstractC24490k<T> {

    /* renamed from: c */
    public final InterfaceC23447K<? extends T> f90774c;

    /* renamed from: io.reactivex.internal.operators.single.E$a */
    /* loaded from: classes6.dex */
    public static final class C24347a<T> extends C24459c<T> implements InterfaceC23445I<T> {
        private static final long serialVersionUID = 187782011903685568L;

        /* renamed from: d */
        public InterfaceC23465c f90775d;

        public C24347a(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
            super(interfaceC42141hT5);
        }

        @Override // io.reactivex.internal.subscriptions.C24459c, p000.InterfaceC46292oT5
        public void cancel() {
            super.cancel();
            this.f90775d.dispose();
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            this.f91047b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f90775d, interfaceC23465c)) {
                this.f90775d = interfaceC23465c;
                this.f91047b.mo31867a(this);
            }
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            m32302c(t);
        }
    }

    public C24346E(InterfaceC23447K<? extends T> interfaceC23447K) {
        this.f90774c = interfaceC23447K;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f90774c.mo33096a(new C24347a(interfaceC42141hT5));
    }
}
