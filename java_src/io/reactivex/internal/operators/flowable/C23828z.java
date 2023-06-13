package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23546a;
import io.reactivex.internal.subscriptions.AbstractC24458b;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24468d;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: io.reactivex.internal.operators.flowable.z */
/* loaded from: classes6.dex */
public final class C23828z<T> extends AbstractC24490k<T> {

    /* renamed from: c */
    public final T[] f89125c;

    /* renamed from: io.reactivex.internal.operators.flowable.z$a */
    /* loaded from: classes6.dex */
    public static final class C23829a<T> extends AbstractC23831c<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: e */
        public final InterfaceC23546a<? super T> f89126e;

        public C23829a(InterfaceC23546a<? super T> interfaceC23546a, T[] tArr) {
            super(tArr);
            this.f89126e = interfaceC23546a;
        }

        @Override // io.reactivex.internal.operators.flowable.C23828z.AbstractC23831c
        /* renamed from: a */
        public void mo32747a() {
            T[] tArr = this.f89128b;
            int length = tArr.length;
            InterfaceC23546a<? super T> interfaceC23546a = this.f89126e;
            for (int i = this.f89129c; i != length; i++) {
                if (this.f89130d) {
                    return;
                }
                T t = tArr[i];
                if (t == null) {
                    interfaceC23546a.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                interfaceC23546a.mo32761h(t);
            }
            if (this.f89130d) {
                return;
            }
            interfaceC23546a.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.C23828z.AbstractC23831c
        /* renamed from: c */
        public void mo32746c(long j) {
            T[] tArr = this.f89128b;
            int length = tArr.length;
            int i = this.f89129c;
            InterfaceC23546a<? super T> interfaceC23546a = this.f89126e;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 != j && i != length) {
                        if (this.f89130d) {
                            return;
                        }
                        T t = tArr[i];
                        if (t == null) {
                            interfaceC23546a.onError(new NullPointerException("The element at index " + i + " is null"));
                            return;
                        }
                        if (interfaceC23546a.mo32761h(t)) {
                            j2++;
                        }
                        i++;
                    } else if (i == length) {
                        if (!this.f89130d) {
                            interfaceC23546a.onComplete();
                            return;
                        }
                        return;
                    } else {
                        j = get();
                        if (j2 == j) {
                            this.f89129c = i;
                            j = addAndGet(-j2);
                        }
                    }
                }
            } while (j != 0);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.z$b */
    /* loaded from: classes6.dex */
    public static final class C23830b<T> extends AbstractC23831c<T> {
        private static final long serialVersionUID = 2587302975077663557L;

        /* renamed from: e */
        public final InterfaceC42141hT5<? super T> f89127e;

        public C23830b(InterfaceC42141hT5<? super T> interfaceC42141hT5, T[] tArr) {
            super(tArr);
            this.f89127e = interfaceC42141hT5;
        }

        @Override // io.reactivex.internal.operators.flowable.C23828z.AbstractC23831c
        /* renamed from: a */
        public void mo32747a() {
            T[] tArr = this.f89128b;
            int length = tArr.length;
            InterfaceC42141hT5<? super T> interfaceC42141hT5 = this.f89127e;
            for (int i = this.f89129c; i != length; i++) {
                if (this.f89130d) {
                    return;
                }
                T t = tArr[i];
                if (t == null) {
                    interfaceC42141hT5.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                interfaceC42141hT5.onNext(t);
            }
            if (this.f89130d) {
                return;
            }
            interfaceC42141hT5.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.C23828z.AbstractC23831c
        /* renamed from: c */
        public void mo32746c(long j) {
            T[] tArr = this.f89128b;
            int length = tArr.length;
            int i = this.f89129c;
            InterfaceC42141hT5<? super T> interfaceC42141hT5 = this.f89127e;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 != j && i != length) {
                        if (this.f89130d) {
                            return;
                        }
                        T t = tArr[i];
                        if (t == null) {
                            interfaceC42141hT5.onError(new NullPointerException("The element at index " + i + " is null"));
                            return;
                        }
                        interfaceC42141hT5.onNext(t);
                        j2++;
                        i++;
                    } else if (i == length) {
                        if (!this.f89130d) {
                            interfaceC42141hT5.onComplete();
                            return;
                        }
                        return;
                    } else {
                        j = get();
                        if (j2 == j) {
                            this.f89129c = i;
                            j = addAndGet(-j2);
                        }
                    }
                }
            } while (j != 0);
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.z$c */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC23831c<T> extends AbstractC24458b<T> {
        private static final long serialVersionUID = -2252972430506210021L;

        /* renamed from: b */
        public final T[] f89128b;

        /* renamed from: c */
        public int f89129c;

        /* renamed from: d */
        public volatile boolean f89130d;

        public AbstractC23831c(T[] tArr) {
            this.f89128b = tArr;
        }

        /* renamed from: a */
        public abstract void mo32747a();

        @Override // io.reactivex.internal.fuseable.InterfaceC23551f
        /* renamed from: b */
        public final int mo31868b(int i) {
            return i & 1;
        }

        /* renamed from: c */
        public abstract void mo32746c(long j);

        @Override // p000.InterfaceC46292oT5
        public final void cancel() {
            this.f89130d = true;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public final void clear() {
            this.f89129c = this.f89128b.length;
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public final boolean isEmpty() {
            return this.f89129c == this.f89128b.length;
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public final void mo21023o(long j) {
            if (EnumC24463g.m32287h(j) && C24468d.m32274a(this, j) == 0) {
                if (j == LongCompanionObject.MAX_VALUE) {
                    mo32747a();
                } else {
                    mo32746c(j);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.InterfaceC23555j
        public final T poll() {
            int i = this.f89129c;
            T[] tArr = this.f89128b;
            if (i == tArr.length) {
                return null;
            }
            this.f89129c = i + 1;
            return (T) C23544b.m32923e(tArr[i], "array element is null");
        }
    }

    public C23828z(T[] tArr) {
        this.f89125c = tArr;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super T> interfaceC42141hT5) {
        if (interfaceC42141hT5 instanceof InterfaceC23546a) {
            interfaceC42141hT5.mo31867a(new C23829a((InterfaceC23546a) interfaceC42141hT5, this.f89125c));
        } else {
            interfaceC42141hT5.mo31867a(new C23830b(interfaceC42141hT5, this.f89125c));
        }
    }
}
