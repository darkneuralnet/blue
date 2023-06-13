package io.reactivex.internal.operators.maybe;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24541s;
import io.reactivex.InterfaceC24574u;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.internal.disposables.C23505h;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.subscriptions.EnumC24460d;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import io.reactivex.internal.util.EnumC24479n;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.maybe.c */
/* loaded from: classes6.dex */
public final class C23871c<T> extends AbstractC24490k<T> {

    /* renamed from: c */
    public final Iterable<? extends InterfaceC24574u<? extends T>> f89210c;

    /* renamed from: io.reactivex.internal.operators.maybe.c$a */
    /* loaded from: classes6.dex */
    public static final class C23872a<T> extends AtomicInteger implements InterfaceC24541s<T>, InterfaceC46292oT5 {
        private static final long serialVersionUID = 3520831347801429610L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f89211b;

        /* renamed from: f */
        public final Iterator<? extends InterfaceC24574u<? extends T>> f89215f;

        /* renamed from: g */
        public long f89216g;

        /* renamed from: c */
        public final AtomicLong f89212c = new AtomicLong();

        /* renamed from: e */
        public final C23505h f89214e = new C23505h();

        /* renamed from: d */
        public final AtomicReference<Object> f89213d = new AtomicReference<>(EnumC24479n.COMPLETE);

        public C23872a(InterfaceC42141hT5<? super T> interfaceC42141hT5, Iterator<? extends InterfaceC24574u<? extends T>> it) {
            this.f89211b = interfaceC42141hT5;
            this.f89215f = it;
        }

        /* renamed from: a */
        public void m32734a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<Object> atomicReference = this.f89213d;
            InterfaceC42141hT5<? super T> interfaceC42141hT5 = this.f89211b;
            C23505h c23505h = this.f89214e;
            while (!c23505h.mo1769e()) {
                Object obj = atomicReference.get();
                if (obj != null) {
                    boolean z = true;
                    if (obj != EnumC24479n.COMPLETE) {
                        long j = this.f89216g;
                        if (j != this.f89212c.get()) {
                            this.f89216g = j + 1;
                            atomicReference.lazySet(null);
                            interfaceC42141hT5.onNext(obj);
                        } else {
                            z = false;
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (z && !c23505h.mo1769e()) {
                        try {
                            if (this.f89215f.hasNext()) {
                                try {
                                    ((InterfaceC24574u) C23544b.m32923e(this.f89215f.next(), "The source Iterator returned a null MaybeSource")).mo31865a(this);
                                } catch (Throwable th) {
                                    C23475a.m33009b(th);
                                    interfaceC42141hT5.onError(th);
                                    return;
                                }
                            } else {
                                interfaceC42141hT5.onComplete();
                            }
                        } catch (Throwable th2) {
                            C23475a.m33009b(th2);
                            interfaceC42141hT5.onError(th2);
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            this.f89214e.dispose();
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                C24468d.m32274a(this.f89212c, j);
                m32734a();
            }
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onComplete() {
            this.f89213d.lazySet(EnumC24479n.COMPLETE);
            m32734a();
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onError(Throwable th) {
            this.f89211b.onError(th);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f89214e.m32981a(interfaceC23465c);
        }

        @Override // io.reactivex.InterfaceC24541s
        public void onSuccess(T t) {
            this.f89213d.lazySet(t);
            m32734a();
        }
    }

    public C23871c(Iterable<? extends InterfaceC24574u<? extends T>> iterable) {
        this.f89210c = iterable;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        try {
            C23872a c23872a = new C23872a(interfaceC42141hT5, (Iterator) C23544b.m32923e(this.f89210c.iterator(), "The sources Iterable returned a null Iterator"));
            interfaceC42141hT5.mo31867a(c23872a);
            c23872a.m32734a();
        } catch (Throwable th) {
            C23475a.m33009b(th);
            EnumC24460d.m32300c(th, interfaceC42141hT5);
        }
    }
}
