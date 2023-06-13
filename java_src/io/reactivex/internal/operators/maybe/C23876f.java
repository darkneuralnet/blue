package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.maybe.f */
/* loaded from: classes6.dex */
public final class C23876f<T> extends AbstractC24507p<T> {

    /* renamed from: b */
    public final InterfaceC24574u<T> f89220b;

    /* renamed from: c */
    public final InterfaceC23496h f89221c;

    /* renamed from: io.reactivex.internal.operators.maybe.f$a */
    /* loaded from: classes6.dex */
    public static final class C23877a<T> implements InterfaceC24541s<T> {

        /* renamed from: b */
        public final AtomicReference<InterfaceC23465c> f89222b;

        /* renamed from: c */
        public final InterfaceC24541s<? super T> f89223c;

        public C23877a(AtomicReference<InterfaceC23465c> atomicReference, InterfaceC24541s<? super T> interfaceC24541s) {
            this.f89222b = atomicReference;
            this.f89223c = interfaceC24541s;
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f89223c.onComplete();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f89223c.onError(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32998c(this.f89222b, interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            this.f89223c.onSuccess(t);
        }
    }

    /* renamed from: io.reactivex.internal.operators.maybe.f$b */
    /* loaded from: classes6.dex */
    public static final class C23878b<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23476f, InterfaceC23465c {
        private static final long serialVersionUID = 703409937383992161L;

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89224b;

        /* renamed from: c */
        public final InterfaceC24574u<T> f89225c;

        public C23878b(InterfaceC24541s<? super T> interfaceC24541s, InterfaceC24574u<T> interfaceC24574u) {
            this.f89224b = interfaceC24541s;
            this.f89225c = interfaceC24574u;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onComplete() {
            this.f89225c.mo31865a(new C23877a(this, this.f89224b));
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            this.f89224b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this, interfaceC23465c)) {
                this.f89224b.onSubscribe(this);
            }
        }
    }

    public C23876f(InterfaceC24574u<T> interfaceC24574u, InterfaceC23496h interfaceC23496h) {
        this.f89220b = interfaceC24574u;
        this.f89221c = interfaceC23496h;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f89221c.mo33003g(new C23878b(interfaceC24541s, this.f89220b));
    }
}
