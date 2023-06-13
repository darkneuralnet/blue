package p000;

import android.net.Uri;
import com.google.android.gms.internal.recaptcha.zzes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* renamed from: qq8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47704qq8<T> implements InterfaceC47151pu8<T> {

    /* renamed from: a */
    public final String f105914a;

    /* renamed from: b */
    public final Mb9<Uri> f105915b;

    /* renamed from: c */
    public final InterfaceC31738An8<T> f105916c;

    /* renamed from: d */
    public final Executor f105917d;

    /* renamed from: e */
    public final P78 f105918e;

    /* renamed from: f */
    public final C45262mj8<T> f105919f;

    /* renamed from: g */
    public final YA8 f105920g;

    /* renamed from: h */
    public final Object f105921h = new Object();

    /* renamed from: i */
    public final C44326l89 f105922i = C44326l89.m27739c();

    /* renamed from: j */
    public Mb9<T> f105923j = null;

    public C47704qq8(String str, Mb9<Uri> mb9, InterfaceC31738An8<T> interfaceC31738An8, Executor executor, P78 p78, C45262mj8<T> c45262mj8, YA8 ya8) {
        this.f105914a = str;
        this.f105915b = C50508va9.m8428h(mb9);
        this.f105916c = interfaceC31738An8;
        this.f105917d = Hc9.m103648c(executor);
        this.f105918e = p78;
        this.f105919f = c45262mj8;
        this.f105920g = ya8;
    }

    /* renamed from: d */
    public static AbstractC32503Du8 m16923d() {
        return C36670Vp8.m79378b();
    }

    @Override // p000.InterfaceC47151pu8
    /* renamed from: a */
    public final String mo16926a() {
        return this.f105914a;
    }

    @Override // p000.InterfaceC47151pu8
    /* renamed from: b */
    public final Mb9<Void> mo16925b(final InterfaceC43713k69<? super T, T> interfaceC43713k69, final Executor executor, InterfaceC39443cu8 interfaceC39443cu8) {
        final Mb9<T> m16915l = m16915l();
        return this.f105922i.m27738d(KD8.m99068b(new InterfaceC38952c69() { // from class: zo8
            @Override // p000.InterfaceC38952c69
            public final Mb9 zza() {
                final C47704qq8 c47704qq8 = C47704qq8.this;
                Mb9 mb9 = m16915l;
                InterfaceC43713k69 interfaceC43713k692 = interfaceC43713k69;
                Executor executor2 = executor;
                final Mb9 m8425k = C50508va9.m8425k(mb9, new InterfaceC43713k69() { // from class: Lo8
                    @Override // p000.InterfaceC43713k69
                    public final Mb9 zza(Object obj) {
                        return C47704qq8.this.m16922e(obj);
                    }
                }, Hc9.m103649b());
                final Mb9 m8425k2 = C50508va9.m8425k(m8425k, interfaceC43713k692, executor2);
                return C50508va9.m8425k(m8425k2, KD8.m99067c(new InterfaceC43713k69() { // from class: Ip8
                    @Override // p000.InterfaceC43713k69
                    public final Mb9 zza(Object obj) {
                        return C47704qq8.this.m16919h(m8425k, m8425k2, obj);
                    }
                }), Hc9.m103649b());
            }
        }), Hc9.m103649b());
    }

    @Override // p000.InterfaceC47151pu8
    /* renamed from: c */
    public final Mb9<T> mo16924c(InterfaceC34834Nt8 interfaceC34834Nt8) {
        return m16915l();
    }

    /* renamed from: e */
    public final /* synthetic */ Mb9 m16922e(Object obj) throws Exception {
        Mb9<T> mb9;
        synchronized (this.f105921h) {
            mb9 = this.f105923j;
        }
        return mb9;
    }

    /* renamed from: f */
    public final /* synthetic */ Mb9 m16921f() throws Exception {
        return C50508va9.m8428h(C50508va9.m8425k(this.f105915b, KD8.m99067c(new InterfaceC43713k69() { // from class: Yo8
            @Override // p000.InterfaceC43713k69
            public final Mb9 zza(Object obj) {
                return C47704qq8.this.m16918i((Uri) obj);
            }
        }), this.f105917d));
    }

    /* renamed from: g */
    public final /* synthetic */ Mb9 m16920g(Void r1) throws Exception {
        return C50508va9.m8430f(m16914m((Uri) C50508va9.m8424l(this.f105915b)));
    }

    /* renamed from: h */
    public final /* synthetic */ Mb9 m16919h(Mb9 mb9, final Mb9 mb92, Object obj) throws Exception {
        if (!C50508va9.m8424l(mb9).equals(C50508va9.m8424l(mb92))) {
            Mb9 m8425k = C50508va9.m8425k(mb92, KD8.m99067c(new InterfaceC43713k69() { // from class: wp8
                @Override // p000.InterfaceC43713k69
                public final Mb9 zza(Object obj2) {
                    return C47704qq8.this.m16916k(mb92, obj2);
                }
            }), this.f105917d);
            synchronized (this.f105921h) {
            }
            return m8425k;
        }
        return C50508va9.m8429g();
    }

    /* renamed from: i */
    public final /* synthetic */ Mb9 m16918i(Uri uri) throws Exception {
        Uri m42380a = C40638ev8.m42380a(uri, ".bak");
        try {
            if (this.f105918e.m90723d(m42380a)) {
                this.f105918e.m90724c(m42380a, uri);
            }
            return C50508va9.m8429g();
        } catch (IOException e) {
            return C50508va9.m8431e(e);
        }
    }

    /* renamed from: j */
    public final /* synthetic */ Mb9 m16917j() throws Exception {
        try {
            return C50508va9.m8430f(m16914m((Uri) C50508va9.m8424l(this.f105915b)));
        } catch (IOException e) {
            if (!(e instanceof zzes) && !(e.getCause() instanceof zzes)) {
                return C50508va9.m8425k(C50508va9.m8431e(e), KD8.m99067c(new InterfaceC43713k69() { // from class: kp8
                    @Override // p000.InterfaceC43713k69
                    public final Mb9 zza(Object obj) {
                        return C47704qq8.this.m16920g((Void) obj);
                    }
                }), this.f105917d);
            }
            return C50508va9.m8431e(e);
        }
    }

    /* renamed from: k */
    public final /* synthetic */ Mb9 m16916k(Mb9 mb9, Object obj) throws Exception {
        String str;
        Uri uri = (Uri) C50508va9.m8424l(this.f105915b);
        Uri m42380a = C40638ev8.m42380a(uri, ".tmp");
        try {
            YA8 ya8 = this.f105920g;
            String valueOf = String.valueOf(this.f105914a);
            if (valueOf.length() != 0) {
                str = "Write ".concat(valueOf);
            } else {
                str = new String("Write ");
            }
            UB8 mo61801b = ya8.mo61801b(str, 1);
            C32332Db8 c32332Db8 = new C32332Db8();
            try {
                P78 p78 = this.f105918e;
                C51753xg8 m4886b = C51753xg8.m4886b();
                m4886b.m4885c(c32332Db8);
                OutputStream outputStream = (OutputStream) p78.m90726a(m42380a, m4886b);
                try {
                    ((Np9) obj).mo81211e(outputStream);
                    c32332Db8.m110118b();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    mo61801b.close();
                    this.f105918e.m90724c(m42380a, uri);
                    synchronized (this.f105921h) {
                        this.f105923j = mb9;
                    }
                    return C50508va9.m8429g();
                } catch (Throwable th) {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                throw C35545Qu8.m87582a(this.f105918e, uri, e);
            }
        } catch (IOException e2) {
            if (this.f105918e.m90723d(m42380a)) {
                try {
                    this.f105918e.m90725b(m42380a);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }

    /* renamed from: l */
    public final Mb9<T> m16915l() {
        Mb9<T> mb9;
        synchronized (this.f105921h) {
            Mb9<T> mb92 = this.f105923j;
            if (mb92 != null && mb92.isDone()) {
                try {
                    C50508va9.m8424l(this.f105923j);
                } catch (ExecutionException unused) {
                    this.f105923j = null;
                }
            }
            if (this.f105923j == null) {
                this.f105923j = C50508va9.m8428h(this.f105922i.m27738d(KD8.m99068b(new InterfaceC38952c69() { // from class: no8
                    @Override // p000.InterfaceC38952c69
                    public final Mb9 zza() {
                        return C47704qq8.this.m16917j();
                    }
                }), this.f105917d));
            }
            mb9 = this.f105923j;
        }
        return mb9;
    }

    /* renamed from: m */
    public final T m16914m(Uri uri) throws IOException {
        String str;
        try {
            try {
                YA8 ya8 = this.f105920g;
                String valueOf = String.valueOf(this.f105914a);
                if (valueOf.length() != 0) {
                    str = "Read ".concat(valueOf);
                } else {
                    str = new String("Read ");
                }
                UB8 mo61801b = ya8.mo61801b(str, 1);
                try {
                    InputStream inputStream = (InputStream) this.f105918e.m90726a(uri, C42267hg8.m36100b());
                    InterfaceC31738An8<T> interfaceC31738An8 = this.f105916c;
                    T t = (T) ((AbstractC41241fw8) interfaceC31738An8).mo40425b().mo93340z().mo35762b(inputStream, ((AbstractC41241fw8) interfaceC31738An8).mo40426a());
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    mo61801b.close();
                    return t;
                } catch (Throwable th) {
                    try {
                        mo61801b.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                if (!this.f105918e.m90723d(uri)) {
                    return this.f105916c.zza();
                }
                throw e;
            }
        } catch (IOException e2) {
            throw C35545Qu8.m87582a(this.f105918e, uri, e2);
        }
    }
}
