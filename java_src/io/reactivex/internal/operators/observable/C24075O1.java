package io.reactivex.internal.operators.observable;

import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23436D;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.disposables.EnumC23501d;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.queue.C24409c;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.observable.O1 */
/* loaded from: classes6.dex */
public final class C24075O1<T, R> extends Observable<R> {

    /* renamed from: b */
    public final InterfaceC23434B<? extends T>[] f89855b;

    /* renamed from: c */
    public final Iterable<? extends InterfaceC23434B<? extends T>> f89856c;

    /* renamed from: d */
    public final InterfaceC23492o<? super Object[], ? extends R> f89857d;

    /* renamed from: e */
    public final int f89858e;

    /* renamed from: f */
    public final boolean f89859f;

    /* renamed from: io.reactivex.internal.operators.observable.O1$a */
    /* loaded from: classes6.dex */
    public static final class C24076a<T, R> extends AtomicInteger implements InterfaceC23465c {
        private static final long serialVersionUID = 2983708048395377667L;

        /* renamed from: b */
        public final InterfaceC23436D<? super R> f89860b;

        /* renamed from: c */
        public final InterfaceC23492o<? super Object[], ? extends R> f89861c;

        /* renamed from: d */
        public final C24077b<T, R>[] f89862d;

        /* renamed from: e */
        public final T[] f89863e;

        /* renamed from: f */
        public final boolean f89864f;

        /* renamed from: g */
        public volatile boolean f89865g;

        public C24076a(InterfaceC23436D<? super R> interfaceC23436D, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o, int i, boolean z) {
            this.f89860b = interfaceC23436D;
            this.f89861c = interfaceC23492o;
            this.f89862d = new C24077b[i];
            this.f89863e = (T[]) new Object[i];
            this.f89864f = z;
        }

        /* renamed from: a */
        public void m32619a() {
            m32616d();
            m32618b();
        }

        /* renamed from: b */
        public void m32618b() {
            for (C24077b<T, R> c24077b : this.f89862d) {
                c24077b.m32613a();
            }
        }

        /* renamed from: c */
        public boolean m32617c(boolean z, boolean z2, InterfaceC23436D<? super R> interfaceC23436D, boolean z3, C24077b<?, ?> c24077b) {
            if (this.f89865g) {
                m32619a();
                return true;
            } else if (z) {
                if (z3) {
                    if (z2) {
                        Throwable th = c24077b.f89869e;
                        this.f89865g = true;
                        m32619a();
                        if (th != null) {
                            interfaceC23436D.onError(th);
                        } else {
                            interfaceC23436D.onComplete();
                        }
                        return true;
                    }
                    return false;
                }
                Throwable th2 = c24077b.f89869e;
                if (th2 != null) {
                    this.f89865g = true;
                    m32619a();
                    interfaceC23436D.onError(th2);
                    return true;
                } else if (z2) {
                    this.f89865g = true;
                    m32619a();
                    interfaceC23436D.onComplete();
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        /* renamed from: d */
        public void m32616d() {
            for (C24077b<T, R> c24077b : this.f89862d) {
                c24077b.f89867c.clear();
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f89865g) {
                this.f89865g = true;
                m32618b();
                if (getAndIncrement() == 0) {
                    m32616d();
                }
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f89865g;
        }

        /* renamed from: g */
        public void m32615g() {
            Throwable th;
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            C24077b<T, R>[] c24077bArr = this.f89862d;
            InterfaceC23436D<? super R> interfaceC23436D = this.f89860b;
            T[] tArr = this.f89863e;
            boolean z2 = this.f89864f;
            int i = 1;
            while (true) {
                int i2 = 0;
                int i3 = 0;
                for (C24077b<T, R> c24077b : c24077bArr) {
                    if (tArr[i3] == null) {
                        boolean z3 = c24077b.f89868d;
                        T poll = c24077b.f89867c.poll();
                        if (poll == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (m32617c(z3, z, interfaceC23436D, z2, c24077b)) {
                            return;
                        }
                        if (!z) {
                            tArr[i3] = poll;
                        } else {
                            i2++;
                        }
                    } else if (c24077b.f89868d && !z2 && (th = c24077b.f89869e) != null) {
                        this.f89865g = true;
                        m32619a();
                        interfaceC23436D.onError(th);
                        return;
                    }
                    i3++;
                }
                if (i2 != 0) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    try {
                        interfaceC23436D.onNext((Object) C23544b.m32923e(this.f89861c.apply(tArr.clone()), "The zipper returned a null value"));
                        Arrays.fill(tArr, (Object) null);
                    } catch (Throwable th2) {
                        C23475a.m33009b(th2);
                        m32619a();
                        interfaceC23436D.onError(th2);
                        return;
                    }
                }
            }
        }

        /* renamed from: h */
        public void m32614h(InterfaceC23434B<? extends T>[] interfaceC23434BArr, int i) {
            C24077b<T, R>[] c24077bArr = this.f89862d;
            int length = c24077bArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                c24077bArr[i2] = new C24077b<>(this, i);
            }
            lazySet(0);
            this.f89860b.onSubscribe(this);
            for (int i3 = 0; i3 < length && !this.f89865g; i3++) {
                interfaceC23434BArr[i3].subscribe(c24077bArr[i3]);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.O1$b */
    /* loaded from: classes6.dex */
    public static final class C24077b<T, R> implements InterfaceC23436D<T> {

        /* renamed from: b */
        public final C24076a<T, R> f89866b;

        /* renamed from: c */
        public final C24409c<T> f89867c;

        /* renamed from: d */
        public volatile boolean f89868d;

        /* renamed from: e */
        public Throwable f89869e;

        /* renamed from: f */
        public final AtomicReference<InterfaceC23465c> f89870f = new AtomicReference<>();

        public C24077b(C24076a<T, R> c24076a, int i) {
            this.f89866b = c24076a;
            this.f89867c = new C24409c<>(i);
        }

        /* renamed from: a */
        public void m32613a() {
            EnumC23501d.m33000a(this.f89870f);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
            this.f89868d = true;
            this.f89866b.m32615g();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
            this.f89869e = th;
            this.f89868d = true;
            this.f89866b.m32615g();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onNext(T t) {
            this.f89867c.offer(t);
            this.f89866b.m32615g();
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
            EnumC23501d.m32995h(this.f89870f, interfaceC23465c);
        }
    }

    public C24075O1(InterfaceC23434B<? extends T>[] interfaceC23434BArr, Iterable<? extends InterfaceC23434B<? extends T>> iterable, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o, int i, boolean z) {
        this.f89855b = interfaceC23434BArr;
        this.f89856c = iterable;
        this.f89857d = interfaceC23492o;
        this.f89858e = i;
        this.f89859f = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(InterfaceC23436D<? super R> interfaceC23436D) {
        int length;
        InterfaceC23434B<? extends T>[] interfaceC23434BArr = this.f89855b;
        if (interfaceC23434BArr == null) {
            interfaceC23434BArr = new InterfaceC23434B[8];
            length = 0;
            for (InterfaceC23434B<? extends T> interfaceC23434B : this.f89856c) {
                if (length == interfaceC23434BArr.length) {
                    InterfaceC23434B<? extends T>[] interfaceC23434BArr2 = new InterfaceC23434B[(length >> 2) + length];
                    System.arraycopy(interfaceC23434BArr, 0, interfaceC23434BArr2, 0, length);
                    interfaceC23434BArr = interfaceC23434BArr2;
                }
                interfaceC23434BArr[length] = interfaceC23434B;
                length++;
            }
        } else {
            length = interfaceC23434BArr.length;
        }
        if (length == 0) {
            EnumC23502e.m32990d(interfaceC23436D);
        } else {
            new C24076a(interfaceC23436D, this.f89857d, length, this.f89859f).m32614h(interfaceC23434BArr, this.f89858e);
        }
    }
}
