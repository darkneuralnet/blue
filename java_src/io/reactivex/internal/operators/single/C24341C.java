package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23447K;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.util.C24475k;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.single.C */
/* loaded from: classes6.dex */
public final class C24341C<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC23447K<T> f90758b;

    /* renamed from: c */
    public final long f90759c;

    /* renamed from: d */
    public final TimeUnit f90760d;

    /* renamed from: e */
    public final AbstractC23437E f90761e;

    /* renamed from: f */
    public final InterfaceC23447K<? extends T> f90762f;

    /* renamed from: io.reactivex.internal.operators.single.C$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC24342a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23445I<T>, Runnable, InterfaceC23465c {
        private static final long serialVersionUID = 37497744973048446L;

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f90763b;

        /* renamed from: c */
        public final AtomicReference<InterfaceC23465c> f90764c = new AtomicReference<>();

        /* renamed from: d */
        public final C24343a<T> f90765d;

        /* renamed from: e */
        public InterfaceC23447K<? extends T> f90766e;

        /* renamed from: f */
        public final long f90767f;

        /* renamed from: g */
        public final TimeUnit f90768g;

        /* renamed from: io.reactivex.internal.operators.single.C$a$a */
        /* loaded from: classes6.dex */
        public static final class C24343a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23445I<T> {
            private static final long serialVersionUID = 2071387740092105509L;

            /* renamed from: b */
            public final InterfaceC23445I<? super T> f90769b;

            public C24343a(InterfaceC23445I<? super T> interfaceC23445I) {
                this.f90769b = interfaceC23445I;
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onError(Throwable th) {
                this.f90769b.onError(th);
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onSubscribe(InterfaceC23465c interfaceC23465c) {
                EnumC23501d.m32995h(this, interfaceC23465c);
            }

            @Override // io.reactivex.InterfaceC23445I
            public void onSuccess(T t) {
                this.f90769b.onSuccess(t);
            }
        }

        public RunnableC24342a(InterfaceC23445I<? super T> interfaceC23445I, InterfaceC23447K<? extends T> interfaceC23447K, long j, TimeUnit timeUnit) {
            this.f90763b = interfaceC23445I;
            this.f90766e = interfaceC23447K;
            this.f90767f = j;
            this.f90768g = timeUnit;
            if (interfaceC23447K != null) {
                this.f90765d = new C24343a<>(interfaceC23445I);
            } else {
                this.f90765d = null;
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this);
            EnumC23501d.m33000a(this.f90764c);
            C24343a<T> c24343a = this.f90765d;
            if (c24343a != null) {
                EnumC23501d.m33000a(c24343a);
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            InterfaceC23465c interfaceC23465c = get();
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (interfaceC23465c != enumC23501d && compareAndSet(interfaceC23465c, enumC23501d)) {
                EnumC23501d.m33000a(this.f90764c);
                this.f90763b.onError(th);
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this, interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSuccess(T t) {
            InterfaceC23465c interfaceC23465c = get();
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (interfaceC23465c != enumC23501d && compareAndSet(interfaceC23465c, enumC23501d)) {
                EnumC23501d.m33000a(this.f90764c);
                this.f90763b.onSuccess(t);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC23465c interfaceC23465c = get();
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (interfaceC23465c != enumC23501d && compareAndSet(interfaceC23465c, enumC23501d)) {
                if (interfaceC23465c != null) {
                    interfaceC23465c.dispose();
                }
                InterfaceC23447K<? extends T> interfaceC23447K = this.f90766e;
                if (interfaceC23447K == null) {
                    this.f90763b.onError(new TimeoutException(C24475k.m32257d(this.f90767f, this.f90768g)));
                    return;
                }
                this.f90766e = null;
                interfaceC23447K.mo33096a(this.f90765d);
            }
        }
    }

    public C24341C(InterfaceC23447K<T> interfaceC23447K, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, InterfaceC23447K<? extends T> interfaceC23447K2) {
        this.f90758b = interfaceC23447K;
        this.f90759c = j;
        this.f90760d = timeUnit;
        this.f90761e = abstractC23437E;
        this.f90762f = interfaceC23447K2;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        RunnableC24342a runnableC24342a = new RunnableC24342a(interfaceC23445I, this.f90762f, this.f90759c, this.f90760d);
        interfaceC23445I.onSubscribe(runnableC24342a);
        EnumC23501d.m32998c(runnableC24342a.f90764c, this.f90761e.mo32323e(runnableC24342a, this.f90759c, this.f90760d));
        this.f90758b.mo33096a(runnableC24342a);
    }
}
