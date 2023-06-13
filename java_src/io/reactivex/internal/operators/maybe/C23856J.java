package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24541s;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23501d;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.maybe.J */
/* loaded from: classes6.dex */
public final class C23856J extends AbstractC24507p<Long> {

    /* renamed from: b */
    public final long f89184b;

    /* renamed from: c */
    public final TimeUnit f89185c;

    /* renamed from: d */
    public final AbstractC23437E f89186d;

    /* renamed from: io.reactivex.internal.operators.maybe.J$a */
    /* loaded from: classes6.dex */
    public static final class RunnableC23857a extends AtomicReference<InterfaceC23465c> implements InterfaceC23465c, Runnable {
        private static final long serialVersionUID = 2875964065294031672L;

        /* renamed from: b */
        public final InterfaceC24541s<? super Long> f89187b;

        public RunnableC23857a(InterfaceC24541s<? super Long> interfaceC24541s) {
            this.f89187b = interfaceC24541s;
        }

        /* renamed from: a */
        public void m32741a(InterfaceC23465c interfaceC23465c) {
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
            this.f89187b.onSuccess(0L);
        }
    }

    public C23856J(long j, TimeUnit timeUnit, AbstractC23437E abstractC23437E) {
        this.f89184b = j;
        this.f89185c = timeUnit;
        this.f89186d = abstractC23437E;
    }

    @Override // io.reactivex.AbstractC24507p
    /* renamed from: S */
    public void mo31908S(InterfaceC24541s<? super Long> interfaceC24541s) {
        RunnableC23857a runnableC23857a = new RunnableC23857a(interfaceC24541s);
        interfaceC24541s.onSubscribe(runnableC23857a);
        runnableC23857a.m32741a(this.f89186d.mo32323e(runnableC23857a, this.f89184b, this.f89185c));
    }
}
