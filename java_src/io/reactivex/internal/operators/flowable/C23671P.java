package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.P */
/* loaded from: classes6.dex */
public final class C23671P<T> extends AbstractC23695a<T, T> {

    /* renamed from: io.reactivex.internal.operators.flowable.P$a */
    /* loaded from: classes6.dex */
    public static final class C23672a<T> extends AtomicInteger implements InterfaceC24494o<T>, InterfaceC46292oT5 {
        private static final long serialVersionUID = 163080509307634843L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super T> f88552b;

        /* renamed from: c */
        public InterfaceC46292oT5 f88553c;

        /* renamed from: d */
        public volatile boolean f88554d;

        /* renamed from: e */
        public Throwable f88555e;

        /* renamed from: f */
        public volatile boolean f88556f;

        /* renamed from: g */
        public final AtomicLong f88557g = new AtomicLong();

        /* renamed from: h */
        public final AtomicReference<T> f88558h = new AtomicReference<>();

        public C23672a(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
            this.f88552b = interfaceC42141hT5;
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32286i(this.f88553c, interfaceC46292oT5)) {
                this.f88553c = interfaceC46292oT5;
                this.f88552b.mo31867a(this);
                interfaceC46292oT5.mo21023o(LongCompanionObject.MAX_VALUE);
            }
        }

        /* renamed from: b */
        public boolean m32878b(boolean z, boolean z2, InterfaceC42141hT5<?> interfaceC42141hT5, AtomicReference<T> atomicReference) {
            if (this.f88556f) {
                atomicReference.lazySet(null);
                return true;
            } else if (z) {
                Throwable th = this.f88555e;
                if (th != null) {
                    atomicReference.lazySet(null);
                    interfaceC42141hT5.onError(th);
                    return true;
                } else if (z2) {
                    interfaceC42141hT5.onComplete();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        /* renamed from: c */
        public void m32877c() {
            boolean z;
            boolean z2;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC42141hT5<? super T> interfaceC42141hT5 = this.f88552b;
            AtomicLong atomicLong = this.f88557g;
            AtomicReference<T> atomicReference = this.f88558h;
            int i = 1;
            do {
                long j = 0;
                while (true) {
                    z = false;
                    if (j == atomicLong.get()) {
                        break;
                    }
                    boolean z3 = this.f88554d;
                    Object obj = (T) atomicReference.getAndSet(null);
                    if (obj == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (m32878b(z3, z2, interfaceC42141hT5, atomicReference)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    interfaceC42141hT5.onNext(obj);
                    j++;
                }
                if (j == atomicLong.get()) {
                    boolean z4 = this.f88554d;
                    if (atomicReference.get() == null) {
                        z = true;
                    }
                    if (m32878b(z4, z, interfaceC42141hT5, atomicReference)) {
                        return;
                    }
                }
                if (j != 0) {
                    C24468d.m32271d(atomicLong, j);
                }
                i = addAndGet(-i);
            } while (i != 0);
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            if (!this.f88556f) {
                this.f88556f = true;
                this.f88553c.cancel();
                if (getAndIncrement() == 0) {
                    this.f88558h.lazySet(null);
                }
            }
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                C24468d.m32274a(this.f88557g, j);
                m32877c();
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f88554d = true;
            m32877c();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f88555e = th;
            this.f88554d = true;
            m32877c();
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            this.f88558h.lazySet(t);
            m32877c();
        }
    }

    public C23671P(AbstractC24490k<T> abstractC24490k) {
        super(abstractC24490k);
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        this.f88638c.m32166W0(new C23672a(interfaceC42141hT5));
    }
}
