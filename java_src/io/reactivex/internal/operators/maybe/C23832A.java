package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.maybe.A */
/* loaded from: classes6.dex */
public final class C23832A<T> extends AbstractC23869a<T, T> {

    /* renamed from: c */
    public final AbstractC23437E f89131c;

    /* renamed from: io.reactivex.internal.operators.maybe.A$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC23833a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC24541s<T>, InterfaceC23465c, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89132b;

        /* renamed from: c */
        public final AbstractC23437E f89133c;

        /* renamed from: d */
        public T f89134d;

        /* renamed from: e */
        public Throwable f89135e;

        public RunnableC23833a(InterfaceC24541s<? super T> interfaceC24541s, AbstractC23437E abstractC23437E) {
            this.f89132b = interfaceC24541s;
            this.f89133c = abstractC23437E;
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

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            EnumC23501d.m32998c(this, this.f89133c.mo32324d(this));
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f89135e = th;
            EnumC23501d.m32998c(this, this.f89133c.mo32324d(this));
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this, interfaceC23465c)) {
                this.f89132b.onSubscribe(this);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            this.f89134d = t;
            EnumC23501d.m32998c(this, this.f89133c.mo32324d(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f89135e;
            if (th != null) {
                this.f89135e = null;
                this.f89132b.onError(th);
                return;
            }
            T t = this.f89134d;
            if (t != null) {
                this.f89134d = null;
                this.f89132b.onSuccess(t);
                return;
            }
            this.f89132b.onComplete();
        }
    }

    public C23832A(InterfaceC24574u<T> interfaceC24574u, AbstractC23437E abstractC23437E) {
        super(interfaceC24574u);
        this.f89131c = abstractC23437E;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        this.f89206b.mo31865a(new RunnableC23833a(interfaceC24541s, this.f89131c));
    }
}
