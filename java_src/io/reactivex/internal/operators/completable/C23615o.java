package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23476f;
import io.reactivex.disposables.InterfaceC23465c;
/* renamed from: io.reactivex.internal.operators.completable.o */
/* loaded from: classes6.dex */
public final class C23615o<T> extends AbstractC23461c {

    /* renamed from: b */
    public final InterfaceC23447K<T> f88413b;

    /* renamed from: io.reactivex.internal.operators.completable.o$a */
    /* loaded from: classes6.dex */
    public static final class C23616a<T> implements InterfaceC23445I<T> {

        /* renamed from: b */
        public final InterfaceC23476f f88414b;

        public C23616a(InterfaceC23476f interfaceC23476f) {
            this.f88414b = interfaceC23476f;
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            this.f88414b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f88414b.onSubscribe(interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            this.f88414b.onComplete();
        }
    }

    public C23615o(InterfaceC23447K<T> interfaceC23447K) {
        this.f88413b = interfaceC23447K;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        this.f88413b.mo33096a(new C23616a(interfaceC23476f));
    }
}
