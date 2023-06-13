package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: xy8 */
/* loaded from: classes6.dex */
public final class C51933xy8<T> {

    /* renamed from: a */
    public final RunnableC35104Ox8<T> f118488a;

    /* renamed from: b */
    public final AtomicLong f118489b = new AtomicLong(m4359i(Integer.MIN_VALUE, Integer.MIN_VALUE));

    /* renamed from: c */
    public final AtomicReference<C44819ly8<T>> f118490c = new AtomicReference<>(null);

    /* renamed from: d */
    public final AtomicReference<Mb9<T>> f118491d = new AtomicReference<>(null);

    /* renamed from: e */
    public final Executor f118492e = Hc9.m103648c(Hc9.m103649b());

    /* renamed from: f */
    public final Md9<T> f118493f;

    public C51933xy8(InterfaceC38952c69<T> interfaceC38952c69, Executor executor) {
        Md9<T> m95101D = Md9.m95101D();
        this.f118493f = m95101D;
        RunnableC35104Ox8<T> runnableC35104Ox8 = new RunnableC35104Ox8<>(interfaceC38952c69, executor);
        this.f118488a = runnableC35104Ox8;
        m95101D.mo9243o(runnableC35104Ox8, Hc9.m103649b());
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m4361g(C51933xy8 c51933xy8) {
        long j;
        int i;
        int i2;
        boolean z;
        do {
            j = c51933xy8.f118489b.get();
            i = (int) j;
            i2 = (int) (j >>> 32);
            if (i != Integer.MIN_VALUE) {
                if (i == -2147483647) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i2++;
                }
            } else {
                StringBuilder sb = new StringBuilder(33);
                sb.append("Refcount is: ");
                sb.append(j);
                throw new AssertionError(sb.toString());
            }
        } while (!c51933xy8.f118489b.compareAndSet(j, m4359i(i2, i - 1)));
        return z;
    }

    /* renamed from: i */
    public static long m4359i(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    /* renamed from: b */
    public final Mb9<T> m4366b() {
        long j;
        final int i;
        Mb9 m8433c;
        if (!this.f118493f.isDone()) {
            do {
                j = this.f118489b.get();
                i = (int) (j >>> 32);
            } while (!this.f118489b.compareAndSet(j, m4359i(i, ((int) j) + 1)));
            final Md9 m95101D = Md9.m95101D();
            Mb9<T> andSet = this.f118491d.getAndSet(m95101D);
            if (andSet == null) {
                m8433c = C50508va9.m8427i(KD8.m99068b(new InterfaceC38952c69() { // from class: Gw8
                    @Override // p000.InterfaceC38952c69
                    public final Mb9 zza() {
                        return C51933xy8.this.m4365c(i);
                    }
                }), Hc9.m103649b());
            } else {
                m8433c = C50508va9.m8433c(andSet, Throwable.class, KD8.m99067c(new InterfaceC43713k69() { // from class: Tw8
                    @Override // p000.InterfaceC43713k69
                    public final Mb9 zza(Object obj) {
                        return C51933xy8.this.m4364d(i, (Throwable) obj);
                    }
                }), this.f118492e);
            }
            m95101D.mo9251g(m8433c);
            final C37678Zx8 c37678Zx8 = new C37678Zx8(this, i, null);
            m95101D.mo9243o(new Runnable() { // from class: qx8
                @Override // java.lang.Runnable
                public final void run() {
                    C51933xy8.this.m4362f(m95101D, c37678Zx8);
                }
            }, Hc9.m103649b());
            return c37678Zx8;
        }
        return this.f118493f;
    }

    /* renamed from: d */
    public final /* synthetic */ Mb9 m4364d(int i, Throwable th) throws Exception {
        return m4365c(i);
    }

    /* renamed from: f */
    public final /* synthetic */ void m4362f(Md9 md9, C37678Zx8 c37678Zx8) {
        try {
            ((Md9<T>) this.f118493f).mo9235w(C50508va9.m8424l(md9));
            c37678Zx8.mo9251g(this.f118493f);
        } catch (Throwable unused) {
            c37678Zx8.mo9251g(md9);
        }
    }

    /* renamed from: h */
    public final boolean m4360h() {
        return this.f118493f.isDone();
    }

    /* renamed from: j */
    public final Mb9<T> m4365c(int i) {
        C44819ly8<T> c44819ly8;
        InterfaceC38952c69 interfaceC38952c69;
        Executor executor;
        int i2;
        if (((int) (this.f118489b.get() >>> 32)) > i) {
            return C50508va9.m8432d();
        }
        C44819ly8 c44819ly82 = new C44819ly8(i);
        do {
            c44819ly8 = this.f118490c.get();
            if (c44819ly8 != null) {
                i2 = c44819ly8.f97032i;
                if (i2 > i) {
                    return C50508va9.m8432d();
                }
            }
        } while (!C42482i24.m35337a(this.f118490c, c44819ly8, c44819ly82));
        if (((int) (this.f118489b.get() >>> 32)) > i) {
            c44819ly82.cancel(true);
            C42482i24.m35337a(this.f118490c, c44819ly82, null);
            return c44819ly82;
        }
        interfaceC38952c69 = this.f118488a.f27614b;
        executor = this.f118488a.f27615c;
        if (interfaceC38952c69 != null && executor != null) {
            c44819ly82.mo9251g(C50508va9.m8427i(KD8.m99068b(interfaceC38952c69), executor));
        } else {
            c44819ly82.mo9251g(this.f118493f);
        }
        return c44819ly82;
    }
}
