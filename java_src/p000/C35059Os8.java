package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* renamed from: Os8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35059Os8<T> {

    /* renamed from: a */
    public final String f27510a;

    /* renamed from: b */
    public final Mb9<String> f27511b;

    /* renamed from: c */
    public final InterfaceC47151pu8<T> f27512c;

    /* renamed from: d */
    public final C44326l89 f27513d;

    /* renamed from: e */
    public final C51933xy8<Void> f27514e;

    /* renamed from: h */
    public final YA8 f27517h;

    /* renamed from: j */
    public final C32746Ev8 f27519j;

    /* renamed from: f */
    public final C51933xy8<?> f27515f = new C51933xy8<>(new C38812bs8(this, null), Hc9.m103649b());

    /* renamed from: g */
    public final Object f27516g = new Object();

    /* renamed from: i */
    public List<InterfaceC43713k69<InterfaceC52969zj8<T>, ?>> f27518i = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public C35059Os8(InterfaceC47151pu8 interfaceC47151pu8, InterfaceC47151pu8<T> interfaceC47151pu82, C32746Ev8 c32746Ev8, Mb9<String> mb9, boolean z, boolean z2) {
        this.f27512c = interfaceC47151pu8;
        this.f27519j = interfaceC47151pu82;
        this.f27511b = c32746Ev8;
        this.f27510a = interfaceC47151pu8.mo16926a();
        final C47704qq8 c47704qq8 = (C47704qq8) interfaceC47151pu8;
        this.f27514e = new C51933xy8<>(new InterfaceC38952c69() { // from class: bo8
            @Override // p000.InterfaceC38952c69
            public final Mb9 zza() {
                return C47704qq8.this.m16921f();
            }
        }, Hc9.m103649b());
        if (z) {
            this.f27517h = YA8.m75471d();
        } else {
            this.f27517h = YA8.m75472c();
        }
        m91221n(new InterfaceC43713k69() { // from class: Eq8
            @Override // p000.InterfaceC43713k69
            public final Mb9 zza(Object obj) {
                return C35059Os8.this.m91229f((InterfaceC52969zj8) obj);
            }
        });
        if (mb9 != null) {
            this.f27513d = C44326l89.m27739c();
        } else {
            this.f27513d = null;
        }
    }

    /* renamed from: d */
    public final Mb9<T> m91231d() {
        String str;
        Mb9<T> mb9;
        this.f27517h.mo61802a();
        if (this.f27515f.m4360h()) {
            mb9 = this.f27512c.mo16924c(null);
        } else {
            YA8 ya8 = this.f27517h;
            String valueOf = String.valueOf(this.f27510a);
            if (valueOf.length() != 0) {
                str = "Get ".concat(valueOf);
            } else {
                str = new String("Get ");
            }
            UB8 mo61801b = ya8.mo61801b(str, 1);
            try {
                Mb9<T> m8425k = C50508va9.m8425k(this.f27515f.m4366b(), KD8.m99067c(new InterfaceC43713k69(null) { // from class: Sq8
                    @Override // p000.InterfaceC43713k69
                    public final Mb9 zza(Object obj) {
                        return C35059Os8.this.m91230e(null, obj);
                    }
                }), Hc9.m103649b());
                mo61801b.m81881a(m8425k);
                mo61801b.close();
                mb9 = m8425k;
            } catch (Throwable th) {
                try {
                    mo61801b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C50508va9.m8428h(this.f27511b);
        return C50508va9.m8428h(mb9);
    }

    /* renamed from: e */
    public final /* synthetic */ Mb9 m91230e(InterfaceC34834Nt8 interfaceC34834Nt8, Object obj) throws Exception {
        return this.f27512c.mo16924c(null);
    }

    /* renamed from: f */
    public final /* synthetic */ Mb9 m91229f(InterfaceC52969zj8 interfaceC52969zj8) throws Exception {
        return this.f27514e.m4366b();
    }

    /* renamed from: g */
    public final /* synthetic */ Mb9 m91228g(InterfaceC43713k69 interfaceC43713k69, Executor executor, Object obj) throws Exception {
        return this.f27512c.mo16925b(interfaceC43713k69, executor, null);
    }

    /* renamed from: h */
    public final /* synthetic */ Mb9 m91227h(InterfaceC43713k69 interfaceC43713k69, Executor executor, Object obj) throws Exception {
        return this.f27512c.mo16925b(interfaceC43713k69, executor, null);
    }

    /* renamed from: i */
    public final Mb9<Void> m91226i(final InterfaceC43713k69<? super T, T> interfaceC43713k69, final Executor executor) {
        String str;
        Mb9<Void> m27738d;
        YA8 ya8 = this.f27517h;
        String valueOf = String.valueOf(this.f27510a);
        if (valueOf.length() != 0) {
            str = "Update ".concat(valueOf);
        } else {
            str = new String("Update ");
        }
        UB8 mo61801b = ya8.mo61801b(str, 1);
        try {
            final Mb9<?> m4366b = this.f27515f.m4366b();
            C44326l89 c44326l89 = this.f27513d;
            if (c44326l89 == null) {
                m27738d = C50508va9.m8425k(m4366b, KD8.m99067c(new InterfaceC43713k69() { // from class: er8
                    @Override // p000.InterfaceC43713k69
                    public final Mb9 zza(Object obj) {
                        return C35059Os8.this.m91228g(interfaceC43713k69, executor, obj);
                    }
                }), Hc9.m103649b());
            } else {
                m27738d = c44326l89.m27738d(KD8.m99068b(new InterfaceC38952c69() { // from class: sq8
                    @Override // p000.InterfaceC38952c69
                    public final Mb9 zza() {
                        final C35059Os8 c35059Os8 = C35059Os8.this;
                        Mb9 mb9 = m4366b;
                        final InterfaceC43713k69 interfaceC43713k692 = interfaceC43713k69;
                        final Executor executor2 = executor;
                        return C50508va9.m8425k(mb9, KD8.m99067c(new InterfaceC43713k69() { // from class: qr8
                            @Override // p000.InterfaceC43713k69
                            public final Mb9 zza(Object obj) {
                                return C35059Os8.this.m91227h(interfaceC43713k692, executor2, obj);
                            }
                        }), Hc9.m103649b());
                    }
                }), Hc9.m103649b());
            }
            C50508va9.m8428h(this.f27511b);
            mo61801b.m81881a(m27738d);
            mo61801b.close();
            return m27738d;
        } catch (Throwable th) {
            try {
                mo61801b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: n */
    public final void m91221n(InterfaceC43713k69<InterfaceC52969zj8<T>, ?> interfaceC43713k69) {
        synchronized (this.f27516g) {
            this.f27518i.add(interfaceC43713k69);
        }
    }
}
