package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.C23505h;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.completable.y */
/* loaded from: classes6.dex */
public final class C23633y extends AbstractC23461c {

    /* renamed from: b */
    public final InterfaceC23496h f88452b;

    /* renamed from: c */
    public final AbstractC23437E f88453c;

    /* renamed from: io.reactivex.internal.operators.completable.y$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC23634a extends AtomicReference<InterfaceC23465c> implements InterfaceC23476f, InterfaceC23465c, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* renamed from: b */
        public final InterfaceC23476f f88454b;

        /* renamed from: c */
        public final C23505h f88455c = new C23505h();

        /* renamed from: d */
        public final InterfaceC23496h f88456d;

        public RunnableC23634a(InterfaceC23476f interfaceC23476f, InterfaceC23496h interfaceC23496h) {
            this.f88454b = interfaceC23476f;
            this.f88456d = interfaceC23496h;
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            EnumC23501d.m33000a(this);
            this.f88455c.dispose();
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return EnumC23501d.m32999b(get());
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onComplete() {
            this.f88454b.onComplete();
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            this.f88454b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this, interfaceC23465c);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f88456d.mo33003g(this);
        }
    }

    public C23633y(InterfaceC23496h interfaceC23496h, AbstractC23437E abstractC23437E) {
        this.f88452b = interfaceC23496h;
        this.f88453c = abstractC23437E;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        RunnableC23634a runnableC23634a = new RunnableC23634a(interfaceC23476f, this.f88452b);
        interfaceC23476f.onSubscribe(runnableC23634a);
        runnableC23634a.f88455c.m32981a(this.f88453c.mo32324d(runnableC23634a));
    }
}
