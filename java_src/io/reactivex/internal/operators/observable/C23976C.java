package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC24578y;
import io.reactivex.InterfaceC24579z;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23483f;
import io.reactivex.internal.disposables.C23499b;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.C */
/* loaded from: classes6.dex */
public final class C23976C<T> extends Observable<T> {

    /* renamed from: b */
    public final InterfaceC24579z<T> f89516b;

    /* renamed from: io.reactivex.internal.operators.observable.C$a */
    /* loaded from: classes6.dex */
    public static final class C23977a<T> extends AtomicReference<InterfaceC23465c> implements InterfaceC24578y<T>, InterfaceC23465c {
        private static final long serialVersionUID = -3434801548987643227L;

        /* renamed from: b */
        public final InterfaceC23436D<? super T> f89517b;

        public C23977a(InterfaceC23436D<? super T> interfaceC23436D) {
            this.f89517b = interfaceC23436D;
        }

        @Override // io.reactivex.InterfaceC24578y
        /* renamed from: a */
        public void mo11916a(InterfaceC23483f interfaceC23483f) {
            mo11915b(new C23499b(interfaceC23483f));
        }

        @Override // io.reactivex.InterfaceC24578y
        /* renamed from: b */
        public void mo11915b(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32996g(this, interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC24578y
        /* renamed from: c */
        public boolean mo11914c(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (!mo1769e()) {
                try {
                    this.f89517b.onError(th);
                    dispose();
                    return true;
                } catch (Throwable th2) {
                    dispose();
                    throw th2;
                }
            }
            return false;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this);
        }

        @Override // io.reactivex.InterfaceC24578y, io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC24489j
        public void onComplete() {
            if (!mo1769e()) {
                try {
                    this.f89517b.onComplete();
                } finally {
                    dispose();
                }
            }
        }

        @Override // io.reactivex.InterfaceC24489j
        public void onError(Throwable th) {
            if (!mo11914c(th)) {
                C24508a.m31988u(th);
            }
        }

        @Override // io.reactivex.InterfaceC24489j
        public void onNext(T t) {
            if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else if (!mo1769e()) {
                this.f89517b.onNext(t);
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C23977a.class.getSimpleName(), super.toString());
        }
    }

    public C23976C(InterfaceC24579z<T> interfaceC24579z) {
        this.f89516b = interfaceC24579z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super T> interfaceC23436D) {
        C23977a c23977a = new C23977a(interfaceC23436D);
        interfaceC23436D.onSubscribe(c23977a);
        try {
            this.f89516b.subscribe(c23977a);
        } catch (Throwable th) {
            C23475a.m33009b(th);
            c23977a.onError(th);
        }
    }
}
