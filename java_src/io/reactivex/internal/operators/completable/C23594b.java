package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.completable.b */
/* loaded from: classes6.dex */
public final class C23594b extends AbstractC23461c {

    /* renamed from: b */
    public final InterfaceC23496h f88372b;

    /* renamed from: c */
    public final InterfaceC23496h f88373c;

    /* renamed from: io.reactivex.internal.operators.completable.b$a */
    /* loaded from: classes6.dex */
    public static final class C23595a implements InterfaceC23476f {

        /* renamed from: b */
        public final AtomicReference<InterfaceC23465c> f88374b;

        /* renamed from: c */
        public final InterfaceC23476f f88375c;

        public C23595a(AtomicReference<InterfaceC23465c> atomicReference, InterfaceC23476f interfaceC23476f) {
            this.f88374b = atomicReference;
            this.f88375c = interfaceC23476f;
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onComplete() {
            this.f88375c.onComplete();
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            this.f88375c.onError(th);
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32998c(this.f88374b, interfaceC23465c);
        }
    }

    /* renamed from: io.reactivex.internal.operators.completable.b$b */
    /* loaded from: classes6.dex */
    public static final class C23596b extends AtomicReference<InterfaceC23465c> implements InterfaceC23476f, InterfaceC23465c {
        private static final long serialVersionUID = -4101678820158072998L;

        /* renamed from: b */
        public final InterfaceC23476f f88376b;

        /* renamed from: c */
        public final InterfaceC23496h f88377c;

        public C23596b(InterfaceC23476f interfaceC23476f, InterfaceC23496h interfaceC23496h) {
            this.f88376b = interfaceC23476f;
            this.f88377c = interfaceC23496h;
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
            this.f88377c.mo33003g(new C23595a(this, this.f88376b));
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            this.f88376b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this, interfaceC23465c)) {
                this.f88376b.onSubscribe(this);
            }
        }
    }

    public C23594b(InterfaceC23496h interfaceC23496h, InterfaceC23496h interfaceC23496h2) {
        this.f88372b = interfaceC23496h;
        this.f88373c = interfaceC23496h2;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        this.f88372b.mo33003g(new C23596b(interfaceC23476f, this.f88373c));
    }
}
