package io.reactivex.internal.operators.flowable;

import io.reactivex.AbstractC24490k;
import io.reactivex.InterfaceC24494o;
import io.reactivex.exceptions.C23475a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.internal.functions.C23544b;
import io.reactivex.internal.fuseable.InterfaceC23552g;
import io.reactivex.internal.fuseable.InterfaceC23555j;
import io.reactivex.internal.queue.C24408b;
import io.reactivex.internal.subscriptions.EnumC24460d;
import io.reactivex.internal.subscriptions.EnumC24463g;
import io.reactivex.internal.util.C24467c;
import io.reactivex.internal.util.C24468d;
import io.reactivex.plugins.C24508a;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.operators.flowable.w0 */
/* loaded from: classes6.dex */
public final class C23820w0<T, R> extends AbstractC24490k<R> {

    /* renamed from: c */
    public final InterfaceC45761na4<? extends T>[] f89075c;

    /* renamed from: d */
    public final Iterable<? extends InterfaceC45761na4<? extends T>> f89076d;

    /* renamed from: e */
    public final InterfaceC23492o<? super Object[], ? extends R> f89077e;

    /* renamed from: f */
    public final int f89078f;

    /* renamed from: g */
    public final boolean f89079g;

    /* renamed from: io.reactivex.internal.operators.flowable.w0$a */
    /* loaded from: classes6.dex */
    public static final class C23821a<T, R> extends AtomicInteger implements InterfaceC46292oT5 {
        private static final long serialVersionUID = -2434867452883857743L;

        /* renamed from: b */
        public final InterfaceC42141hT5<? super R> f89080b;

        /* renamed from: c */
        public final C23822b<T, R>[] f89081c;

        /* renamed from: d */
        public final InterfaceC23492o<? super Object[], ? extends R> f89082d;

        /* renamed from: e */
        public final AtomicLong f89083e;

        /* renamed from: f */
        public final C24467c f89084f;

        /* renamed from: g */
        public final boolean f89085g;

        /* renamed from: h */
        public volatile boolean f89086h;

        /* renamed from: i */
        public final Object[] f89087i;

        public C23821a(InterfaceC42141hT5<? super R> interfaceC42141hT5, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o, int i, int i2, boolean z) {
            this.f89080b = interfaceC42141hT5;
            this.f89082d = interfaceC23492o;
            this.f89085g = z;
            C23822b<T, R>[] c23822bArr = new C23822b[i];
            for (int i3 = 0; i3 < i; i3++) {
                c23822bArr[i3] = new C23822b<>(this, i2);
            }
            this.f89087i = new Object[i];
            this.f89081c = c23822bArr;
            this.f89083e = new AtomicLong();
            this.f89084f = new C24467c();
        }

        /* renamed from: a */
        public void m32760a() {
            for (C23822b<T, R> c23822b : this.f89081c) {
                c23822b.cancel();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:127:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00d2, code lost:
            if (r14 != 0) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00d6, code lost:
            if (r18.f89086h == false) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00d8, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00db, code lost:
            if (r18.f89085g != false) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00e3, code lost:
            if (r18.f89084f.get() == null) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00e5, code lost:
            m32760a();
            r2.onError(r18.f89084f.m32275b());
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00f1, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00f2, code lost:
            r6 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00f4, code lost:
            if (r6 >= r4) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00f6, code lost:
            r0 = r3[r6];
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00fa, code lost:
            if (r5[r6] != null) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00fc, code lost:
            r10 = r0.f89093g;
            r0 = r0.f89091e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0100, code lost:
            if (r0 == null) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0102, code lost:
            r0 = r0.poll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0107, code lost:
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0108, code lost:
            if (r0 != null) goto L96;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x010a, code lost:
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x010c, code lost:
            r11 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x010e, code lost:
            if (r10 == false) goto L91;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0110, code lost:
            if (r11 == false) goto L91;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0112, code lost:
            m32760a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x011d, code lost:
            if (r18.f89084f.get() == null) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x011f, code lost:
            r2.onError(r18.f89084f.m32275b());
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0129, code lost:
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x012c, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x012d, code lost:
            if (r11 != false) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x012f, code lost:
            r5[r6] = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0132, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x0133, code lost:
            io.reactivex.exceptions.C23475a.m33009b(r0);
            r18.f89084f.m32276a(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x013d, code lost:
            if (r18.f89085g == false) goto L101;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x013f, code lost:
            m32760a();
            r2.onError(r18.f89084f.m32275b());
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x014b, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x014c, code lost:
            r6 = r6 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x0153, code lost:
            if (r12 == 0) goto L118;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0155, code lost:
            r0 = r3.length;
            r6 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x0158, code lost:
            if (r6 >= r0) goto L114;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x015a, code lost:
            r3[r6].mo21023o(r12);
            r6 = r6 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0169, code lost:
            if (r8 == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) goto L118;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x016b, code lost:
            r18.f89083e.addAndGet(-r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0171, code lost:
            r7 = addAndGet(-r7);
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m32759b() {
            boolean z;
            T t;
            boolean z2;
            if (getAndIncrement() != 0) {
                return;
            }
            InterfaceC42141hT5<? super R> interfaceC42141hT5 = this.f89080b;
            C23822b<T, R>[] c23822bArr = this.f89081c;
            int length = c23822bArr.length;
            Object[] objArr = this.f89087i;
            int i = 1;
            do {
                long j = this.f89083e.get();
                long j2 = 0;
                while (true) {
                    int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i2 == 0) {
                        break;
                    } else if (this.f89086h) {
                        return;
                    } else {
                        if (!this.f89085g && this.f89084f.get() != null) {
                            m32760a();
                            interfaceC42141hT5.onError(this.f89084f.m32275b());
                            return;
                        }
                        boolean z3 = false;
                        for (int i3 = 0; i3 < length; i3++) {
                            C23822b<T, R> c23822b = c23822bArr[i3];
                            if (objArr[i3] == null) {
                                try {
                                    z = c23822b.f89093g;
                                    InterfaceC23555j<T> interfaceC23555j = c23822b.f89091e;
                                    if (interfaceC23555j != null) {
                                        t = interfaceC23555j.poll();
                                    } else {
                                        t = null;
                                    }
                                    if (t == null) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                } catch (Throwable th) {
                                    C23475a.m33009b(th);
                                    this.f89084f.m32276a(th);
                                    if (!this.f89085g) {
                                        m32760a();
                                        interfaceC42141hT5.onError(this.f89084f.m32275b());
                                        return;
                                    }
                                }
                                if (z && z2) {
                                    m32760a();
                                    if (this.f89084f.get() != null) {
                                        interfaceC42141hT5.onError(this.f89084f.m32275b());
                                        return;
                                    } else {
                                        interfaceC42141hT5.onComplete();
                                        return;
                                    }
                                }
                                if (!z2) {
                                    objArr[i3] = t;
                                }
                                z3 = true;
                            }
                        }
                        if (z3) {
                            break;
                        }
                        try {
                            interfaceC42141hT5.onNext((Object) C23544b.m32923e(this.f89082d.apply(objArr.clone()), "The zipper returned a null value"));
                            j2++;
                            Arrays.fill(objArr, (Object) null);
                        } catch (Throwable th2) {
                            C23475a.m33009b(th2);
                            m32760a();
                            this.f89084f.m32276a(th2);
                            interfaceC42141hT5.onError(this.f89084f.m32275b());
                            return;
                        }
                    }
                }
            } while (i != 0);
        }

        /* renamed from: c */
        public void m32758c(C23822b<T, R> c23822b, Throwable th) {
            if (this.f89084f.m32276a(th)) {
                c23822b.f89093g = true;
                m32759b();
                return;
            }
            C24508a.m31988u(th);
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            if (!this.f89086h) {
                this.f89086h = true;
                m32760a();
            }
        }

        /* renamed from: d */
        public void m32757d(InterfaceC45761na4<? extends T>[] interfaceC45761na4Arr, int i) {
            C23822b<T, R>[] c23822bArr = this.f89081c;
            for (int i2 = 0; i2 < i && !this.f89086h; i2++) {
                if (this.f89085g || this.f89084f.get() == null) {
                    interfaceC45761na4Arr[i2].mo23497c(c23822bArr[i2]);
                } else {
                    return;
                }
            }
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (EnumC24463g.m32287h(j)) {
                C24468d.m32274a(this.f89083e, j);
                m32759b();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.flowable.w0$b */
    /* loaded from: classes6.dex */
    public static final class C23822b<T, R> extends AtomicReference<InterfaceC46292oT5> implements InterfaceC24494o<T>, InterfaceC46292oT5 {
        private static final long serialVersionUID = -4627193790118206028L;

        /* renamed from: b */
        public final C23821a<T, R> f89088b;

        /* renamed from: c */
        public final int f89089c;

        /* renamed from: d */
        public final int f89090d;

        /* renamed from: e */
        public InterfaceC23555j<T> f89091e;

        /* renamed from: f */
        public long f89092f;

        /* renamed from: g */
        public volatile boolean f89093g;

        /* renamed from: h */
        public int f89094h;

        public C23822b(C23821a<T, R> c23821a, int i) {
            this.f89088b = c23821a;
            this.f89089c = i;
            this.f89090d = i - (i >> 2);
        }

        @Override // io.reactivex.InterfaceC24494o, p000.InterfaceC42141hT5
        /* renamed from: a */
        public void mo31867a(InterfaceC46292oT5 interfaceC46292oT5) {
            if (EnumC24463g.m32289f(this, interfaceC46292oT5)) {
                if (interfaceC46292oT5 instanceof InterfaceC23552g) {
                    InterfaceC23552g interfaceC23552g = (InterfaceC23552g) interfaceC46292oT5;
                    int mo31868b = interfaceC23552g.mo31868b(7);
                    if (mo31868b == 1) {
                        this.f89094h = mo31868b;
                        this.f89091e = interfaceC23552g;
                        this.f89093g = true;
                        this.f89088b.m32759b();
                        return;
                    } else if (mo31868b == 2) {
                        this.f89094h = mo31868b;
                        this.f89091e = interfaceC23552g;
                        interfaceC46292oT5.mo21023o(this.f89089c);
                        return;
                    }
                }
                this.f89091e = new C24408b(this.f89089c);
                interfaceC46292oT5.mo21023o(this.f89089c);
            }
        }

        @Override // p000.InterfaceC46292oT5
        public void cancel() {
            EnumC24463g.m32294a(this);
        }

        @Override // p000.InterfaceC46292oT5
        /* renamed from: o */
        public void mo21023o(long j) {
            if (this.f89094h != 1) {
                long j2 = this.f89092f + j;
                if (j2 >= this.f89090d) {
                    this.f89092f = 0L;
                    get().mo21023o(j2);
                    return;
                }
                this.f89092f = j2;
            }
        }

        @Override // p000.InterfaceC42141hT5
        public void onComplete() {
            this.f89093g = true;
            this.f89088b.m32759b();
        }

        @Override // p000.InterfaceC42141hT5
        public void onError(Throwable th) {
            this.f89088b.m32758c(this, th);
        }

        @Override // p000.InterfaceC42141hT5
        public void onNext(T t) {
            if (this.f89094h != 2) {
                this.f89091e.offer(t);
            }
            this.f89088b.m32759b();
        }
    }

    public C23820w0(InterfaceC45761na4<? extends T>[] interfaceC45761na4Arr, Iterable<? extends InterfaceC45761na4<? extends T>> iterable, InterfaceC23492o<? super Object[], ? extends R> interfaceC23492o, int i, boolean z) {
        this.f89075c = interfaceC45761na4Arr;
        this.f89076d = iterable;
        this.f89077e = interfaceC23492o;
        this.f89078f = i;
        this.f89079g = z;
    }

    @Override // io.reactivex.AbstractC24490k
    /* renamed from: X0 */
    public void mo31967X0(InterfaceC42141hT5<? super R> interfaceC42141hT5) {
        int length;
        InterfaceC45761na4<? extends T>[] interfaceC45761na4Arr = this.f89075c;
        if (interfaceC45761na4Arr == null) {
            interfaceC45761na4Arr = new InterfaceC45761na4[8];
            length = 0;
            for (InterfaceC45761na4<? extends T> interfaceC45761na4 : this.f89076d) {
                if (length == interfaceC45761na4Arr.length) {
                    InterfaceC45761na4<? extends T>[] interfaceC45761na4Arr2 = new InterfaceC45761na4[(length >> 2) + length];
                    System.arraycopy(interfaceC45761na4Arr, 0, interfaceC45761na4Arr2, 0, length);
                    interfaceC45761na4Arr = interfaceC45761na4Arr2;
                }
                interfaceC45761na4Arr[length] = interfaceC45761na4;
                length++;
            }
        } else {
            length = interfaceC45761na4Arr.length;
        }
        int i = length;
        if (i == 0) {
            EnumC24460d.m32301a(interfaceC42141hT5);
            return;
        }
        C23821a c23821a = new C23821a(interfaceC42141hT5, this.f89077e, i, this.f89078f, this.f89079g);
        interfaceC42141hT5.mo31867a(c23821a);
        c23821a.m32757d(interfaceC45761na4Arr, i);
    }
}
