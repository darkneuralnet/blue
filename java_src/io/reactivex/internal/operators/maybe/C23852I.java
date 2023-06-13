package io.reactivex.internal.operators.maybe;

import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.maybe.I */
/* loaded from: classes6.dex */
public final class C23852I<T, U> extends AbstractC23869a<T, T> {

    /* renamed from: c */
    public final InterfaceC24574u<U> f89176c;

    /* renamed from: d */
    public final InterfaceC24574u<? extends T> f89177d;

    /* renamed from: io.reactivex.internal.operators.maybe.I$a */
    /* loaded from: classes6.dex */
    public static final class C23853a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC24541s<T> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89178b;

        public C23853a(InterfaceC24541s<? super T> interfaceC24541s) {
            this.f89178b = interfaceC24541s;
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f89178b.onComplete();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f89178b.onError(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this, interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            this.f89178b.onSuccess(t);
        }
    }

    /* renamed from: io.reactivex.internal.operators.maybe.I$b */
    /* loaded from: classes6.dex */
    public static final class C23854b<T, U> extends AtomicReference<InterfaceC23465c> implements InterfaceC24541s<T>, InterfaceC23465c {
        private static final long serialVersionUID = -5955289211445418871L;

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89179b;

        /* renamed from: c */
        public final C23855c<T, U> f89180c = new C23855c<>(this);

        /* renamed from: d */
        public final InterfaceC24574u<? extends T> f89181d;

        /* renamed from: e */
        public final C23853a<T> f89182e;

        public C23854b(InterfaceC24541s<? super T> interfaceC24541s, InterfaceC24574u<? extends T> interfaceC24574u) {
            C23853a<T> c23853a;
            this.f89179b = interfaceC24541s;
            this.f89181d = interfaceC24574u;
            if (interfaceC24574u != null) {
                c23853a = new C23853a<>(interfaceC24541s);
            } else {
                c23853a = null;
            }
            this.f89182e = c23853a;
        }

        /* renamed from: a */
        public void m32743a() {
            if (EnumC23501d.m33000a(this)) {
                InterfaceC24574u<? extends T> interfaceC24574u = this.f89181d;
                if (interfaceC24574u == null) {
                    this.f89179b.onError(new TimeoutException());
                } else {
                    interfaceC24574u.mo31865a(this.f89182e);
                }
            }
        }

        /* renamed from: b */
        public void m32742b(Throwable th) {
            if (EnumC23501d.m33000a(this)) {
                this.f89179b.onError(th);
            } else {
                C24508a.m31988u(th);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this);
            EnumC23501d.m33000a(this.f89180c);
            C23853a<T> c23853a = this.f89182e;
            if (c23853a != null) {
                EnumC23501d.m33000a(c23853a);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            EnumC23501d.m33000a(this.f89180c);
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (getAndSet(enumC23501d) != enumC23501d) {
                this.f89179b.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            EnumC23501d.m33000a(this.f89180c);
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (getAndSet(enumC23501d) != enumC23501d) {
                this.f89179b.onError(th);
            } else {
                C24508a.m31988u(th);
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this, interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            EnumC23501d.m33000a(this.f89180c);
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (getAndSet(enumC23501d) != enumC23501d) {
                this.f89179b.onSuccess(t);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.maybe.I$c */
    /* loaded from: classes6.dex */
    public static final class C23855c<T, U> extends AtomicReference<InterfaceC23465c> implements InterfaceC24541s<Object> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* renamed from: b */
        public final C23854b<T, U> f89183b;

        public C23855c(C23854b<T, U> c23854b) {
            this.f89183b = c23854b;
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f89183b.m32743a();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f89183b.m32742b(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this, interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(Object obj) {
            this.f89183b.m32743a();
        }
    }

    public C23852I(InterfaceC24574u<T> interfaceC24574u, InterfaceC24574u<U> interfaceC24574u2, InterfaceC24574u<? extends T> interfaceC24574u3) {
        super(interfaceC24574u);
        this.f89176c = interfaceC24574u2;
        this.f89177d = interfaceC24574u3;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        C23854b c23854b = new C23854b(interfaceC24541s, this.f89177d);
        interfaceC24541s.onSubscribe(c23854b);
        this.f89176c.mo31865a(c23854b.f89180c);
        this.f89206b.mo31865a(c23854b);
    }
}
