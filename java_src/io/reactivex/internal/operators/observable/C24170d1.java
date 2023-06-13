package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.internal.disposables.C23498a;
import io.reactivex.internal.queue.C24409c;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.operators.observable.d1 */
/* loaded from: classes6.dex */
public final class C24170d1<T> extends Observable<Boolean> {

    /* renamed from: b */
    public final InterfaceC23434B<? extends T> f90146b;

    /* renamed from: c */
    public final InterfaceC23434B<? extends T> f90147c;

    /* renamed from: d */
    public final InterfaceC23481d<? super T, ? super T> f90148d;

    /* renamed from: e */
    public final int f90149e;

    /* renamed from: io.reactivex.internal.operators.observable.d1$a */
    /* loaded from: classes6.dex */
    public static final class C24171a<T> extends AtomicInteger implements InterfaceC23465c {
        private static final long serialVersionUID = -6178010334400373240L;

        /* renamed from: b */
        public final InterfaceC23436D<? super Boolean> f90150b;

        /* renamed from: c */
        public final InterfaceC23481d<? super T, ? super T> f90151c;

        /* renamed from: d */
        public final C23498a f90152d;

        /* renamed from: e */
        public final InterfaceC23434B<? extends T> f90153e;

        /* renamed from: f */
        public final InterfaceC23434B<? extends T> f90154f;

        /* renamed from: g */
        public final C24172b<T>[] f90155g;

        /* renamed from: h */
        public volatile boolean f90156h;

        /* renamed from: i */
        public T f90157i;

        /* renamed from: j */
        public T f90158j;

        public C24171a(InterfaceC23436D<? super Boolean> interfaceC23436D, int i, InterfaceC23434B<? extends T> interfaceC23434B, InterfaceC23434B<? extends T> interfaceC23434B2, InterfaceC23481d<? super T, ? super T> interfaceC23481d) {
            this.f90150b = interfaceC23436D;
            this.f90153e = interfaceC23434B;
            this.f90154f = interfaceC23434B2;
            this.f90151c = interfaceC23481d;
            this.f90155g = r3;
            C24172b<T>[] c24172bArr = {new C24172b<>(this, 0, i), new C24172b<>(this, 1, i)};
            this.f90152d = new C23498a(2);
        }

        /* renamed from: a */
        public void m32523a(C24409c<T> c24409c, C24409c<T> c24409c2) {
            this.f90156h = true;
            c24409c.clear();
            c24409c2.clear();
        }

        /* renamed from: b */
        public void m32522b() {
            boolean z;
            boolean z2;
            Throwable th;
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            C24172b<T>[] c24172bArr = this.f90155g;
            C24172b<T> c24172b = c24172bArr[0];
            C24409c<T> c24409c = c24172b.f90160c;
            C24172b<T> c24172b2 = c24172bArr[1];
            C24409c<T> c24409c2 = c24172b2.f90160c;
            int i = 1;
            while (!this.f90156h) {
                boolean z3 = c24172b.f90162e;
                if (z3 && (th2 = c24172b.f90163f) != null) {
                    m32523a(c24409c, c24409c2);
                    this.f90150b.onError(th2);
                    return;
                }
                boolean z4 = c24172b2.f90162e;
                if (z4 && (th = c24172b2.f90163f) != null) {
                    m32523a(c24409c, c24409c2);
                    this.f90150b.onError(th);
                    return;
                }
                if (this.f90157i == null) {
                    this.f90157i = c24409c.poll();
                }
                if (this.f90157i == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f90158j == null) {
                    this.f90158j = c24409c2.poll();
                }
                T t = this.f90158j;
                if (t == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z3 && z4 && z && z2) {
                    this.f90150b.onNext(Boolean.TRUE);
                    this.f90150b.onComplete();
                    return;
                } else if (z3 && z4 && z != z2) {
                    m32523a(c24409c, c24409c2);
                    this.f90150b.onNext(Boolean.FALSE);
                    this.f90150b.onComplete();
                    return;
                } else {
                    if (!z && !z2) {
                        try {
                            if (!this.f90151c.test((T) this.f90157i, t)) {
                                m32523a(c24409c, c24409c2);
                                this.f90150b.onNext(Boolean.FALSE);
                                this.f90150b.onComplete();
                                return;
                            }
                            this.f90157i = null;
                            this.f90158j = null;
                        } catch (Throwable th3) {
                            C23475a.m33009b(th3);
                            m32523a(c24409c, c24409c2);
                            this.f90150b.onError(th3);
                            return;
                        }
                    }
                    if (z || z2) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                }
            }
            c24409c.clear();
            c24409c2.clear();
        }

        /* renamed from: c */
        public boolean m32521c(InterfaceC23465c interfaceC23465c, int i) {
            return this.f90152d.m33001a(i, interfaceC23465c);
        }

        /* renamed from: d */
        public void m32520d() {
            C24172b<T>[] c24172bArr = this.f90155g;
            this.f90153e.subscribe(c24172bArr[0]);
            this.f90154f.subscribe(c24172bArr[1]);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f90156h) {
                this.f90156h = true;
                this.f90152d.dispose();
                if (getAndIncrement() == 0) {
                    C24172b<T>[] c24172bArr = this.f90155g;
                    c24172bArr[0].f90160c.clear();
                    c24172bArr[1].f90160c.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90156h;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.d1$b */
    /* loaded from: classes6.dex */
    public static final class C24172b<T> implements InterfaceC23436D<T> {

        /* renamed from: b */
        public final C24171a<T> f90159b;

        /* renamed from: c */
        public final C24409c<T> f90160c;

        /* renamed from: d */
        public final int f90161d;

        /* renamed from: e */
        public volatile boolean f90162e;

        /* renamed from: f */
        public Throwable f90163f;

        public C24172b(C24171a<T> c24171a, int i, int i2) {
            this.f90159b = c24171a;
            this.f90161d = i;
            this.f90160c = new C24409c<>(i2);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90162e = true;
            this.f90159b.m32522b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90163f = th;
            this.f90162e = true;
            this.f90159b.m32522b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f90160c.offer(t);
            this.f90159b.m32522b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f90159b.m32521c(interfaceC23465c, this.f90161d);
        }
    }

    public C24170d1(InterfaceC23434B<? extends T> interfaceC23434B, InterfaceC23434B<? extends T> interfaceC23434B2, InterfaceC23481d<? super T, ? super T> interfaceC23481d, int i) {
        this.f90146b = interfaceC23434B;
        this.f90147c = interfaceC23434B2;
        this.f90148d = interfaceC23481d;
        this.f90149e = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super Boolean> interfaceC23436D) {
        C24171a c24171a = new C24171a(interfaceC23436D, this.f90149e, this.f90146b, this.f90147c, this.f90148d);
        interfaceC23436D.onSubscribe(c24171a);
        c24171a.m32520d();
    }
}
