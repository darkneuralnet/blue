package io.reactivex.internal.operators.maybe;

import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
/* renamed from: io.reactivex.internal.operators.maybe.v */
/* loaded from: classes6.dex */
public final class C23910v<T> extends AbstractC23869a<T, T> {

    /* renamed from: io.reactivex.internal.operators.maybe.v$a */
    /* loaded from: classes6.dex */
    public static final class C23911a<T> implements InterfaceC24541s<T>, InterfaceC23465c {

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89287b;

        /* renamed from: c */
        public InterfaceC23465c f89288c;

        public C23911a(InterfaceC24541s<? super T> interfaceC24541s) {
            this.f89287b = interfaceC24541s;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            this.f89288c.dispose();
            this.f89288c = EnumC23501d.DISPOSED;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89288c.mo1769e();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f89287b.onComplete();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f89287b.onError(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32993j(this.f89288c, interfaceC23465c)) {
                this.f89288c = interfaceC23465c;
                this.f89287b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            this.f89287b.onSuccess(t);
        }
    }

    public C23910v(InterfaceC24574u<T> interfaceC24574u) {
        super(interfaceC24574u);
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f89206b.mo31865a(new C23911a(interfaceC24541s));
    }
}
