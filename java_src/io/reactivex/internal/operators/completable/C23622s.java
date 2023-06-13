package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.plugins.C24508a;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.operators.completable.s */
/* loaded from: classes6.dex */
public final class C23622s extends AbstractC23461c {

    /* renamed from: b */
    public final Iterable<? extends InterfaceC23496h> f88423b;

    /* renamed from: io.reactivex.internal.operators.completable.s$a */
    /* loaded from: classes6.dex */
    public static final class C23623a extends AtomicBoolean implements InterfaceC23476f {
        private static final long serialVersionUID = -7730517613164279224L;

        /* renamed from: b */
        public final C23464b f88424b;

        /* renamed from: c */
        public final InterfaceC23476f f88425c;

        /* renamed from: d */
        public final AtomicInteger f88426d;

        public C23623a(InterfaceC23476f interfaceC23476f, C23464b c23464b, AtomicInteger atomicInteger) {
            this.f88425c = interfaceC23476f;
            this.f88424b = c23464b;
            this.f88426d = atomicInteger;
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onComplete() {
            if (this.f88426d.decrementAndGet() == 0 && compareAndSet(false, true)) {
                this.f88425c.onComplete();
            }
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            this.f88424b.dispose();
            if (compareAndSet(false, true)) {
                this.f88425c.onError(th);
            } else {
                C24508a.m31988u(th);
            }
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f88424b.mo32983c(interfaceC23465c);
        }
    }

    public C23622s(Iterable<? extends InterfaceC23496h> iterable) {
        this.f88423b = iterable;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        C23464b c23464b = new C23464b();
        interfaceC23476f.onSubscribe(c23464b);
        try {
            Iterator it = (Iterator) C23544b.m32923e(this.f88423b.iterator(), "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            C23623a c23623a = new C23623a(interfaceC23476f, c23464b, atomicInteger);
            while (!c23464b.mo1769e()) {
                try {
                    if (!it.hasNext()) {
                        c23623a.onComplete();
                        return;
                    } else if (c23464b.mo1769e()) {
                        return;
                    } else {
                        try {
                            InterfaceC23496h interfaceC23496h = (InterfaceC23496h) C23544b.m32923e(it.next(), "The iterator returned a null CompletableSource");
                            if (c23464b.mo1769e()) {
                                return;
                            }
                            atomicInteger.getAndIncrement();
                            interfaceC23496h.mo33003g(c23623a);
                        } catch (Throwable th) {
                            C23475a.m33009b(th);
                            c23464b.dispose();
                            c23623a.onError(th);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    C23475a.m33009b(th2);
                    c23464b.dispose();
                    c23623a.onError(th2);
                    return;
                }
            }
        } catch (Throwable th3) {
            C23475a.m33009b(th3);
            interfaceC23476f.onError(th3);
        }
    }
}
