package io.reactivex.internal.operators.maybe;

import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
/* renamed from: io.reactivex.internal.operators.maybe.w */
/* loaded from: classes6.dex */
public final class C23912w<T> extends AbstractC23869a<T, T> {

    /* renamed from: io.reactivex.internal.operators.maybe.w$a */
    /* loaded from: classes6.dex */
    public static final class C23913a<T> implements InterfaceC24541s<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89289b;

        /* renamed from: c */
        public InterfaceC23465c f89290c;

        public C23913a(InterfaceC24541s<? super T> interfaceC24541s) {
            this.f89289b = interfaceC24541s;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89290c.dispose();
            this.f89290c = EnumC23501d.DISPOSED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89290c.mo1769e();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f89290c = EnumC23501d.DISPOSED;
            this.f89289b.onComplete();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f89290c = EnumC23501d.DISPOSED;
            this.f89289b.onError(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89290c, interfaceC23465c)) {
                this.f89290c = interfaceC23465c;
                this.f89289b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            this.f89290c = EnumC23501d.DISPOSED;
            this.f89289b.onComplete();
        }
    }

    public C23912w(InterfaceC24574u<T> interfaceC24574u) {
        super(interfaceC24574u);
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f89206b.mo31865a(new C23913a(interfaceC24541s));
    }
}
