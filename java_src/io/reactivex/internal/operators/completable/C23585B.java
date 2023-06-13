package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.completable.B */
/* loaded from: classes6.dex */
public final class C23585B extends AbstractC23461c {

    /* renamed from: b */
    public final long f88353b;

    /* renamed from: c */
    public final TimeUnit f88354c;

    /* renamed from: d */
    public final AbstractC23437E f88355d;

    /* renamed from: io.reactivex.internal.operators.completable.B$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC23586a extends AtomicReference<InterfaceC23465c> implements InterfaceC23465c, Runnable {
        private static final long serialVersionUID = 3167244060586201109L;

        /* renamed from: b */
        public final InterfaceC23476f f88356b;

        public RunnableC23586a(InterfaceC23476f interfaceC23476f) {
            this.f88356b = interfaceC23476f;
        }

        /* renamed from: a */
        public void m32901a(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32998c(this, interfaceC23465c);
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

        @Override // java.lang.Runnable
        public void run() {
            this.f88356b.onComplete();
        }
    }

    public C23585B(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        this.f88353b = j;
        this.f88354c = timeUnit;
        this.f88355d = abstractC23437E;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        RunnableC23586a runnableC23586a = new RunnableC23586a(interfaceC23476f);
        interfaceC23476f.onSubscribe(runnableC23586a);
        runnableC23586a.m32901a(this.f88355d.mo32323e(runnableC23586a, this.f88353b, this.f88354c));
    }
}
