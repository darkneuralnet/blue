package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23470e;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23495g;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.completable.d */
/* loaded from: classes6.dex */
public final class C23599d extends AbstractC23461c {

    /* renamed from: b */
    public final InterfaceC23495g f88382b;

    /* renamed from: io.reactivex.internal.operators.completable.d$a */
    /* loaded from: classes6.dex */
    public static final class C23600a extends AtomicReference<InterfaceC23465c> implements InterfaceC23470e, InterfaceC23465c {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: b */
        public final InterfaceC23476f f88383b;

        public C23600a(InterfaceC23476f interfaceC23476f) {
            this.f88383b = interfaceC23476f;
        }

        /* renamed from: a */
        public boolean m32898a(Throwable th) {
            InterfaceC23465c andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            InterfaceC23465c interfaceC23465c = get();
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (interfaceC23465c != enumC23501d && (andSet = getAndSet(enumC23501d)) != enumC23501d) {
                try {
                    this.f88383b.onError(th);
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

        @Override // io.reactivex.InterfaceC23470e
        /* renamed from: e */
        public boolean mo32897e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC23470e
        public void onComplete() {
            InterfaceC23465c andSet;
            InterfaceC23465c interfaceC23465c = get();
            EnumC23501d enumC23501d = EnumC23501d.DISPOSED;
            if (interfaceC23465c != enumC23501d && (andSet = getAndSet(enumC23501d)) != enumC23501d) {
                try {
                    this.f88383b.onComplete();
                } finally {
                    if (andSet != null) {
                        andSet.dispose();
                    }
                }
            }
        }

        @Override // io.reactivex.InterfaceC23470e
        public void onError(Throwable th) {
            if (!m32898a(th)) {
                C24508a.m31988u(th);
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C23600a.class.getSimpleName(), super.toString());
        }
    }

    public C23599d(InterfaceC23495g interfaceC23495g) {
        this.f88382b = interfaceC23495g;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        C23600a c23600a = new C23600a(interfaceC23476f);
        interfaceC23476f.onSubscribe(c23600a);
        try {
            this.f88382b.mo28635a(c23600a);
        } catch (Throwable th) {
            C23475a.m33009b(th);
            c23600a.onError(th);
        }
    }
}
