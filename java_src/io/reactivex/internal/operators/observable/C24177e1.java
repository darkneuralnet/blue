package io.reactivex.internal.operators.observable;

import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.InterfaceC23445I;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23481d;
import io.reactivex.internal.disposables.C23498a;
import io.reactivex.internal.fuseable.InterfaceC23549d;
import io.reactivex.internal.queue.C24409c;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: io.reactivex.internal.operators.observable.e1 */
/* loaded from: classes6.dex */
public final class C24177e1<T> extends AbstractC23442F<Boolean> implements InterfaceC23549d<Boolean> {

    /* renamed from: b */
    public final InterfaceC23434B<? extends T> f90175b;

    /* renamed from: c */
    public final InterfaceC23434B<? extends T> f90176c;

    /* renamed from: d */
    public final InterfaceC23481d<? super T, ? super T> f90177d;

    /* renamed from: e */
    public final int f90178e;

    /* renamed from: io.reactivex.internal.operators.observable.e1$a */
    /* loaded from: classes6.dex */
    public static final class C24178a<T> extends AtomicInteger implements InterfaceC23465c {
        private static final long serialVersionUID = -6178010334400373240L;

        /* renamed from: b */
        public final InterfaceC23445I<? super Boolean> f90179b;

        /* renamed from: c */
        public final InterfaceC23481d<? super T, ? super T> f90180c;

        /* renamed from: d */
        public final C23498a f90181d;

        /* renamed from: e */
        public final InterfaceC23434B<? extends T> f90182e;

        /* renamed from: f */
        public final InterfaceC23434B<? extends T> f90183f;

        /* renamed from: g */
        public final C24179b<T>[] f90184g;

        /* renamed from: h */
        public volatile boolean f90185h;

        /* renamed from: i */
        public T f90186i;

        /* renamed from: j */
        public T f90187j;

        public C24178a(InterfaceC23445I<? super Boolean> interfaceC23445I, int i, InterfaceC23434B<? extends T> interfaceC23434B, InterfaceC23434B<? extends T> interfaceC23434B2, InterfaceC23481d<? super T, ? super T> interfaceC23481d) {
            this.f90179b = interfaceC23445I;
            this.f90182e = interfaceC23434B;
            this.f90183f = interfaceC23434B2;
            this.f90180c = interfaceC23481d;
            this.f90184g = r3;
            C24179b<T>[] c24179bArr = {new C24179b<>(this, 0, i), new C24179b<>(this, 1, i)};
            this.f90181d = new C23498a(2);
        }

        /* renamed from: a */
        public void m32515a(C24409c<T> c24409c, C24409c<T> c24409c2) {
            this.f90185h = true;
            c24409c.clear();
            c24409c2.clear();
        }

        /* renamed from: b */
        public void m32514b() {
            boolean z;
            boolean z2;
            Throwable th;
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            C24179b<T>[] c24179bArr = this.f90184g;
            C24179b<T> c24179b = c24179bArr[0];
            C24409c<T> c24409c = c24179b.f90189c;
            C24179b<T> c24179b2 = c24179bArr[1];
            C24409c<T> c24409c2 = c24179b2.f90189c;
            int i = 1;
            while (!this.f90185h) {
                boolean z3 = c24179b.f90191e;
                if (z3 && (th2 = c24179b.f90192f) != null) {
                    m32515a(c24409c, c24409c2);
                    this.f90179b.onError(th2);
                    return;
                }
                boolean z4 = c24179b2.f90191e;
                if (z4 && (th = c24179b2.f90192f) != null) {
                    m32515a(c24409c, c24409c2);
                    this.f90179b.onError(th);
                    return;
                }
                if (this.f90186i == null) {
                    this.f90186i = c24409c.poll();
                }
                if (this.f90186i == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f90187j == null) {
                    this.f90187j = c24409c2.poll();
                }
                T t = this.f90187j;
                if (t == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z3 && z4 && z && z2) {
                    this.f90179b.onSuccess(Boolean.TRUE);
                    return;
                } else if (z3 && z4 && z != z2) {
                    m32515a(c24409c, c24409c2);
                    this.f90179b.onSuccess(Boolean.FALSE);
                    return;
                } else {
                    if (!z && !z2) {
                        try {
                            if (!this.f90180c.test((T) this.f90186i, t)) {
                                m32515a(c24409c, c24409c2);
                                this.f90179b.onSuccess(Boolean.FALSE);
                                return;
                            }
                            this.f90186i = null;
                            this.f90187j = null;
                        } catch (Throwable th3) {
                            C23475a.m33009b(th3);
                            m32515a(c24409c, c24409c2);
                            this.f90179b.onError(th3);
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
        public boolean m32513c(InterfaceC23465c interfaceC23465c, int i) {
            return this.f90181d.m33001a(i, interfaceC23465c);
        }

        /* renamed from: d */
        public void m32512d() {
            C24179b<T>[] c24179bArr = this.f90184g;
            this.f90182e.subscribe(c24179bArr[0]);
            this.f90183f.subscribe(c24179bArr[1]);
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f90185h) {
                this.f90185h = true;
                this.f90181d.dispose();
                if (getAndIncrement() == 0) {
                    C24179b<T>[] c24179bArr = this.f90184g;
                    c24179bArr[0].f90189c.clear();
                    c24179bArr[1].f90189c.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f90185h;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.e1$b */
    /* loaded from: classes6.dex */
    public static final class C24179b<T> implements InterfaceC23436D<T> {

        /* renamed from: b */
        public final C24178a<T> f90188b;

        /* renamed from: c */
        public final C24409c<T> f90189c;

        /* renamed from: d */
        public final int f90190d;

        /* renamed from: e */
        public volatile boolean f90191e;

        /* renamed from: f */
        public Throwable f90192f;

        public C24179b(C24178a<T> c24178a, int i, int i2) {
            this.f90188b = c24178a;
            this.f90190d = i;
            this.f90189c = new C24409c<>(i2);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f90191e = true;
            this.f90188b.m32514b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f90192f = th;
            this.f90191e = true;
            this.f90188b.m32514b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f90189c.offer(t);
            this.f90188b.m32514b();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            this.f90188b.m32513c(interfaceC23465c, this.f90190d);
        }
    }

    public C24177e1(InterfaceC23434B<? extends T> interfaceC23434B, InterfaceC23434B<? extends T> interfaceC23434B2, InterfaceC23481d<? super T, ? super T> interfaceC23481d, int i) {
        this.f90175b = interfaceC23434B;
        this.f90176c = interfaceC23434B2;
        this.f90177d = interfaceC23481d;
        this.f90178e = i;
    }

    @Override // io.reactivex.AbstractC23442F
    /* renamed from: X */
    public void mo14806X(InterfaceC23445I<? super Boolean> interfaceC23445I) {
        C24178a c24178a = new C24178a(interfaceC23445I, this.f90178e, this.f90175b, this.f90176c, this.f90177d);
        interfaceC23445I.onSubscribe(c24178a);
        c24178a.m32512d();
    }

    @Override // io.reactivex.internal.fuseable.InterfaceC23549d
    /* renamed from: c */
    public Observable<Boolean> mo32427c() {
        return C24508a.m31994o(new C24170d1(this.f90175b, this.f90176c, this.f90177d, this.f90178e));
    }
}
