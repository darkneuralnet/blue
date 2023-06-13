package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC23446J;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23483f;
import io.reactivex.internal.disposables.C23499b;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.single.b */
/* loaded from: classes6.dex */
public final class C24358b<T> extends AbstractC23442F<T> {

    /* renamed from: b */
    public final InterfaceC23446J<T> f90799b;

    /* renamed from: io.reactivex.internal.operators.single.b$a */
    /* loaded from: classes6.dex */
    public static final class C24359a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC23444H<T>, InterfaceC23465c {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: b */
        public final InterfaceC23445I<? super T> f90800b;

        public C24359a(InterfaceC23445I<? super T> interfaceC23445I) {
            this.f90800b = interfaceC23445I;
        }

        @Override // io.reactivex.InterfaceC23444H
        /* renamed from: a */
        public void mo4878a(InterfaceC23483f interfaceC23483f) {
            mo4877b(new C23499b(interfaceC23483f));
        }

        @Override // io.reactivex.InterfaceC23444H
        /* renamed from: b */
        public void mo4877b(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32996g(this, interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC23444H
        /* renamed from: c */
        public boolean mo4876c(Throwable th) {
            InterfaceC23465c andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            InterfaceC23465c interfaceC23465c = get();
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (interfaceC23465c != enumC23501d && (andSet = getAndSet(enumC23501d)) != enumC23501d) {
                try {
                    this.f90800b.onError(th);
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

        @Override // io.reactivex.InterfaceC23444H, io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC23444H
        public void onError(Throwable th) {
            if (!mo4876c(th)) {
                C24508a.m31988u(th);
            }
        }

        @Override // io.reactivex.InterfaceC23444H
        public void onSuccess(T t) {
            InterfaceC23465c andSet;
            InterfaceC23465c interfaceC23465c = get();
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (interfaceC23465c != enumC23501d && (andSet = getAndSet(enumC23501d)) != enumC23501d) {
                try {
                    if (t == null) {
                        this.f90800b.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                    } else {
                        this.f90800b.onSuccess(t);
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
            return String.format("%s{%s}", C24359a.class.getSimpleName(), super.toString());
        }
    }

    public C24358b(InterfaceC23446J<T> interfaceC23446J) {
        this.f90799b = interfaceC23446J;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super T> interfaceC23445I) {
        C24359a c24359a = new C24359a(interfaceC23445I);
        interfaceC23445I.onSubscribe(c24359a);
        try {
            this.f90799b.subscribe(c24359a);
        } catch (Throwable th) {
            C23475a.m33009b(th);
            c24359a.onError(th);
        }
    }
}
