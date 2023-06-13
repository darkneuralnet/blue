package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.NoSuchElementException;
/* renamed from: io.reactivex.internal.operators.maybe.M */
/* loaded from: classes6.dex */
public final class C23862M<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC24574u<T> f89192b;

    /* renamed from: c */
    public final T f89193c;

    /* renamed from: io.reactivex.internal.operators.maybe.M$a */
    /* loaded from: classes6.dex */
    public static final class C23863a<T> implements InterfaceC24541s<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f89194b;

        /* renamed from: c */
        public final T f89195c;

        /* renamed from: d */
        public InterfaceC23465c f89196d;

        public C23863a(InterfaceC23445I<? super T> interfaceC23445I, T t) {
            this.f89194b = interfaceC23445I;
            this.f89195c = t;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89196d.dispose();
            this.f89196d = EnumC23501d.DISPOSED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89196d.mo1769e();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f89196d = EnumC23501d.DISPOSED;
            T t = this.f89195c;
            if (t != null) {
                this.f89194b.onSuccess(t);
            } else {
                this.f89194b.onError(new NoSuchElementException("The MaybeSource is empty"));
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f89196d = EnumC23501d.DISPOSED;
            this.f89194b.onError(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89196d, interfaceC23465c)) {
                this.f89196d = interfaceC23465c;
                this.f89194b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            this.f89196d = EnumC23501d.DISPOSED;
            this.f89194b.onSuccess(t);
        }
    }

    public C23862M(InterfaceC24574u<T> interfaceC24574u, T t) {
        this.f89192b = interfaceC24574u;
        this.f89193c = t;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        this.f89192b.mo31865a(new C23863a(interfaceC23445I, this.f89193c));
    }
}
