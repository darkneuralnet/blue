package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.C23505h;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.maybe.F */
/* loaded from: classes6.dex */
public final class C23843F<T> extends AbstractC23869a<T, T> {

    /* renamed from: c */
    public final AbstractC23437E f89160c;

    /* renamed from: io.reactivex.internal.operators.maybe.F$a */
    /* loaded from: classes6.dex */
    public static final class C23844a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC24541s<T>, InterfaceC23465c {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: b */
        public final C23505h f89161b = new C23505h();

        /* renamed from: c */
        public final InterfaceC24541s<? super T> f89162c;

        public C23844a(InterfaceC24541s<? super T> interfaceC24541s) {
            this.f89162c = interfaceC24541s;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this);
            this.f89161b.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f89162c.onComplete();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f89162c.onError(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this, interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            this.f89162c.onSuccess(t);
        }
    }

    /* renamed from: io.reactivex.internal.operators.maybe.F$b */
    /* loaded from: classes6.dex */
    public static final class RunnableC23845b<T> implements Runnable {

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89163b;

        /* renamed from: c */
        public final InterfaceC24574u<T> f89164c;

        public RunnableC23845b(InterfaceC24541s<? super T> interfaceC24541s, InterfaceC24574u<T> interfaceC24574u) {
            this.f89163b = interfaceC24541s;
            this.f89164c = interfaceC24574u;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f89164c.mo31865a(this.f89163b);
        }
    }

    public C23843F(InterfaceC24574u<T> interfaceC24574u, AbstractC23437E abstractC23437E) {
        super(interfaceC24574u);
        this.f89160c = abstractC23437E;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        C23844a c23844a = new C23844a(interfaceC24541s);
        interfaceC24541s.onSubscribe(c23844a);
        c23844a.f89161b.m32981a(this.f89160c.mo32324d(new RunnableC23845b(c23844a, this.f89206b)));
    }
}
