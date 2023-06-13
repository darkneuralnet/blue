package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.completable.f */
/* loaded from: classes6.dex */
public final class C23602f extends AbstractC23461c {

    /* renamed from: b */
    public final InterfaceC23496h f88385b;

    /* renamed from: c */
    public final long f88386c;

    /* renamed from: d */
    public final TimeUnit f88387d;

    /* renamed from: e */
    public final AbstractC23437E f88388e;

    /* renamed from: f */
    public final boolean f88389f;

    /* renamed from: io.reactivex.internal.operators.completable.f$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC23603a extends AtomicReference<InterfaceC23465c> implements InterfaceC23476f, Runnable, InterfaceC23465c {
        private static final long serialVersionUID = 465972761105851022L;

        /* renamed from: b */
        public final InterfaceC23476f f88390b;

        /* renamed from: c */
        public final long f88391c;

        /* renamed from: d */
        public final TimeUnit f88392d;

        /* renamed from: e */
        public final AbstractC23437E f88393e;

        /* renamed from: f */
        public final boolean f88394f;

        /* renamed from: g */
        public Throwable f88395g;

        public RunnableC23603a(InterfaceC23476f interfaceC23476f, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, boolean z) {
            this.f88390b = interfaceC23476f;
            this.f88391c = j;
            this.f88392d = timeUnit;
            this.f88393e = abstractC23437E;
            this.f88394f = z;
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
            EnumC23501d.m32998c(this, this.f88393e.mo32323e(this, this.f88391c, this.f88392d));
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            long j;
            this.f88395g = th;
            AbstractC23437E abstractC23437E = this.f88393e;
            if (this.f88394f) {
                j = this.f88391c;
            } else {
                j = 0;
            }
            EnumC23501d.m32998c(this, abstractC23437E.mo32323e(this, j, this.f88392d));
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            if (EnumC23501d.m32995h(this, interfaceC23465c)) {
                this.f88390b.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th = this.f88395g;
            this.f88395g = null;
            if (th != null) {
                this.f88390b.onError(th);
            } else {
                this.f88390b.onComplete();
            }
        }
    }

    public C23602f(InterfaceC23496h interfaceC23496h, long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E, boolean z) {
        this.f88385b = interfaceC23496h;
        this.f88386c = j;
        this.f88387d = timeUnit;
        this.f88388e = abstractC23437E;
        this.f88389f = z;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        this.f88385b.mo33003g(new RunnableC23603a(interfaceC23476f, this.f88386c, this.f88387d, this.f88388e, this.f88389f));
    }
}
