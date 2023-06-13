package io.reactivex.internal.operators.single;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.single.D */
/* loaded from: classes6.dex */
public final class C24344D extends AbstractC23442F<Long> {

    /* renamed from: b */
    public final long f90770b;

    /* renamed from: c */
    public final TimeUnit f90771c;

    /* renamed from: d */
    public final AbstractC23437E f90772d;

    /* renamed from: io.reactivex.internal.operators.single.D$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC24345a extends AtomicReference<InterfaceC23465c> implements InterfaceC23465c, Runnable {
        private static final long serialVersionUID = 8465401857522493082L;

        /* renamed from: b */
        public final InterfaceC23445I<? super Long> f90773b;

        public RunnableC24345a(InterfaceC23445I<? super Long> interfaceC23445I) {
            this.f90773b = interfaceC23445I;
        }

        /* renamed from: a */
        public void m32403a(InterfaceC23465c interfaceC23465c) {
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
            this.f90773b.onSuccess(0L);
        }
    }

    public C24344D(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        this.f90770b = j;
        this.f90771c = timeUnit;
        this.f90772d = abstractC23437E;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super Long> interfaceC23445I) {
        RunnableC24345a runnableC24345a = new RunnableC24345a(interfaceC23445I);
        interfaceC23445I.onSubscribe(runnableC24345a);
        runnableC24345a.m32403a(this.f90772d.mo32323e(runnableC24345a, this.f90770b, this.f90771c));
    }
}
