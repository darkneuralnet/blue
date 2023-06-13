package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.operators.completable.E */
/* loaded from: classes6.dex */
public final class C23590E<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC23496h f88361b;

    /* renamed from: c */
    public final Callable<? extends T> f88362c;

    /* renamed from: d */
    public final T f88363d;

    /* renamed from: io.reactivex.internal.operators.completable.E$a */
    /* loaded from: classes6.dex */
    public final class C23591a implements InterfaceC23476f {

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f88364b;

        public C23591a(InterfaceC23445I<? super T> interfaceC23445I) {
            this.f88364b = interfaceC23445I;
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onComplete() {
            T call;
            C23590E c23590e = C23590E.this;
            Callable<? extends T> callable = c23590e.f88362c;
            if (callable != null) {
                try {
                    call = callable.call();
                } catch (Throwable th) {
                    C23475a.m33009b(th);
                    this.f88364b.onError(th);
                    return;
                }
            } else {
                call = c23590e.f88363d;
            }
            if (call == null) {
                this.f88364b.onError(new NullPointerException("The value supplied is null"));
            } else {
                this.f88364b.onSuccess(call);
            }
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            this.f88364b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f88364b.onSubscribe(interfaceC23465c);
        }
    }

    public C23590E(InterfaceC23496h interfaceC23496h, Callable<? extends T> callable, T t) {
        this.f88361b = interfaceC23496h;
        this.f88363d = t;
        this.f88362c = callable;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f88361b.mo33003g(new C23591a(interfaceC23445I));
    }
}
