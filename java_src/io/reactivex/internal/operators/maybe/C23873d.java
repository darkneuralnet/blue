package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24516r;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24573t;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23483f;
import io.reactivex.internal.disposables.C23499b;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.maybe.d */
/* loaded from: classes6.dex */
public final class C23873d<T> extends AbstractC24507p<T> {

    /* renamed from: b */
    public final InterfaceC24573t<T> f89217b;

    /* renamed from: io.reactivex.internal.operators.maybe.d$a */
    /* loaded from: classes6.dex */
    public static final class C23874a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC24516r<T>, InterfaceC23465c {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: b */
        public final InterfaceC24541s<? super T> f89218b;

        public C23874a(InterfaceC24541s<? super T> interfaceC24541s) {
            this.f89218b = interfaceC24541s;
        }

        @Override // io.reactivex.InterfaceC24516r
        /* renamed from: a */
        public void mo13821a(InterfaceC23483f interfaceC23483f) {
            m32733b(new C23499b(interfaceC23483f));
        }

        /* renamed from: b */
        public void m32733b(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32996g(this, interfaceC23465c);
        }

        /* renamed from: c */
        public boolean m32732c(Throwable th) {
            InterfaceC23465c andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            InterfaceC23465c interfaceC23465c = get();
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (interfaceC23465c != enumC23501d && (andSet = getAndSet(enumC23501d)) != enumC23501d) {
                try {
                    this.f89218b.onError(th);
                } finally {
                    if (andSet != null) {
                        andSet.dispose();
                    }
                }
            }
            return false;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.InterfaceC24516r, io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC24516r
        public void onComplete() {
            InterfaceC23465c andSet;
            InterfaceC23465c interfaceC23465c = get();
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (interfaceC23465c != enumC23501d && (andSet = getAndSet(enumC23501d)) != enumC23501d) {
                try {
                    this.f89218b.onComplete();
                } finally {
                    if (andSet != null) {
                        andSet.dispose();
                    }
                }
            }
        }

        @Override // io.reactivex.InterfaceC24516r
        public void onError(Throwable th) {
            if (!m32732c(th)) {
                C24508a.m31988u(th);
            }
        }

        @Override // io.reactivex.InterfaceC24516r
        public void onSuccess(T t) {
            InterfaceC23465c andSet;
            InterfaceC23465c interfaceC23465c = get();
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (interfaceC23465c != enumC23501d && (andSet = getAndSet(enumC23501d)) != enumC23501d) {
                try {
                    if (t == null) {
                        this.f89218b.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                    } else {
                        this.f89218b.onSuccess(t);
                    }
                    if (andSet != null) {
                        andSet.dispose();
                    }
                } catch (Throwable th) {
                    if (andSet != null) {
                        andSet.dispose();
                    }
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C23874a.class.getSimpleName(), super.toString());
        }
    }

    public C23873d(InterfaceC24573t<T> interfaceC24573t) {
        this.f89217b = interfaceC24573t;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super T> interfaceC24541s) {
        C23874a c23874a = new C23874a(interfaceC24541s);
        interfaceC24541s.onSubscribe(c23874a);
        try {
            this.f89217b.mo30092a(c23874a);
        } catch (Throwable th) {
            C23475a.m33009b(th);
            c23874a.onError(th);
        }
    }
}
