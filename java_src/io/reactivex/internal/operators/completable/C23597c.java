package io.reactivex.internal.operators.completable;

import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.C23505h;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.operators.completable.c */
/* loaded from: classes6.dex */
public final class C23597c extends AbstractC23461c {

    /* renamed from: b */
    public final Iterable<? extends InterfaceC23496h> f88378b;

    /* renamed from: io.reactivex.internal.operators.completable.c$a */
    /* loaded from: classes6.dex */
    public static final class C23598a extends AtomicInteger implements InterfaceC23476f {
        private static final long serialVersionUID = -7965400327305809232L;

        /* renamed from: b */
        public final InterfaceC23476f f88379b;

        /* renamed from: c */
        public final Iterator<? extends InterfaceC23496h> f88380c;

        /* renamed from: d */
        public final C23505h f88381d = new C23505h();

        public C23598a(InterfaceC23476f interfaceC23476f, Iterator<? extends InterfaceC23496h> it) {
            this.f88379b = interfaceC23476f;
            this.f88380c = it;
        }

        /* renamed from: a */
        public void m32899a() {
            if (this.f88381d.mo1769e() || getAndIncrement() != 0) {
                return;
            }
            Iterator<? extends InterfaceC23496h> it = this.f88380c;
            while (!this.f88381d.mo1769e()) {
                try {
                    if (!it.hasNext()) {
                        this.f88379b.onComplete();
                        return;
                    }
                    try {
                        ((InterfaceC23496h) C23544b.m32923e(it.next(), "The CompletableSource returned is null")).mo33003g(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    } catch (Throwable th) {
                        C23475a.m33009b(th);
                        this.f88379b.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    C23475a.m33009b(th2);
                    this.f88379b.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onComplete() {
            m32899a();
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onError(Throwable th) {
            this.f88379b.onError(th);
        }

        @Override // io.reactivex.InterfaceC23476f
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f88381d.m32981a(interfaceC23465c);
        }
    }

    public C23597c(Iterable<? extends InterfaceC23496h> iterable) {
        this.f88378b = iterable;
    }

    @Override // io.reactivex.AbstractC23461c
    /* renamed from: W */
    public void mo31912W(InterfaceC23476f interfaceC23476f) {
        try {
            C23598a c23598a = new C23598a(interfaceC23476f, (Iterator) C23544b.m32923e(this.f88378b.iterator(), "The iterator returned is null"));
            interfaceC23476f.onSubscribe(c23598a.f88381d);
            c23598a.m32899a();
        } catch (Throwable th) {
            C23475a.m33009b(th);
            EnumC23502e.m32989g(th, interfaceC23476f);
        }
    }
}
