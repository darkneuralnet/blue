package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.completable.u */
/* loaded from: classes6.dex */
public final class C23625u extends AbstractC23461c {

    /* renamed from: b */
    public final InterfaceC23496h f88428b;

    /* renamed from: c */
    public final AbstractC23437E f88429c;

    /* renamed from: io.reactivex.internal.operators.completable.u$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC23626a extends AtomicReference<InterfaceC23465c> implements InterfaceC23476f, InterfaceC23465c, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: b */
        public final InterfaceC23476f f88430b;

        /* renamed from: c */
        public final AbstractC23437E f88431c;

        /* renamed from: d */
        public Throwable f88432d;

        public RunnableC23626a(InterfaceC23476f interfaceC23476f, AbstractC23437E abstractC23437E) {
            this.f88430b = interfaceC23476f;
            this.f88431c = abstractC23437E;
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
            EnumC23501d.m32998c(this, this.f88431c.mo32324d(this));
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            this.f88432d = th;
            EnumC23501d.m32998c(this, this.f88431c.mo32324d(this));
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this, interfaceC23465c)) {
                this.f88430b.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f88432d;
            if (th != null) {
                this.f88432d = null;
                this.f88430b.onError(th);
                return;
            }
            this.f88430b.onComplete();
        }
    }

    public C23625u(InterfaceC23496h interfaceC23496h, AbstractC23437E abstractC23437E) {
        this.f88428b = interfaceC23496h;
        this.f88429c = abstractC23437E;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        this.f88428b.mo33003g(new RunnableC23626a(interfaceC23476f, this.f88429c));
    }
}
