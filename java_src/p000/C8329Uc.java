package p000;

import android.content.Context;
import android.util.Log;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;
import p000.C9107Wc;
/* renamed from: Uc */
/* loaded from: classes6.dex */
public final class C8329Uc {

    /* renamed from: d */
    public static final String f37649d = "Uc";

    /* renamed from: a */
    public final InterfaceC47055pl2 f37650a;

    /* renamed from: b */
    public final InterfaceC27152p8 f37651b;

    /* renamed from: c */
    public C45869nl2 f37652c;

    /* renamed from: Uc$b */
    /* loaded from: classes6.dex */
    public static final class C8331b {

        /* renamed from: a */
        public InterfaceC46462ol2 f37653a = null;

        /* renamed from: b */
        public InterfaceC47055pl2 f37654b = null;

        /* renamed from: c */
        public String f37655c = null;

        /* renamed from: d */
        public InterfaceC27152p8 f37656d = null;

        /* renamed from: e */
        public boolean f37657e = true;

        /* renamed from: f */
        public C33811Jk2 f37658f = null;

        /* renamed from: g */
        public KeyStore f37659g = null;

        /* renamed from: h */
        public C45869nl2 f37660h;

        /* renamed from: d */
        public synchronized C8329Uc m81274d() throws GeneralSecurityException, IOException {
            if (this.f37655c != null) {
                this.f37656d = m81271g();
            }
            this.f37660h = m81272f();
            return new C8329Uc(this);
        }

        /* renamed from: e */
        public final C45869nl2 m81273e() throws GeneralSecurityException, IOException {
            InterfaceC27152p8 interfaceC27152p8 = this.f37656d;
            if (interfaceC27152p8 != null) {
                try {
                    return C45869nl2.m23214j(C44683ll2.m26871j(this.f37653a, interfaceC27152p8));
                } catch (InvalidProtocolBufferException | GeneralSecurityException e) {
                    Log.w(C8329Uc.f37649d, "cannot decrypt keyset: ", e);
                }
            }
            return C45869nl2.m23214j(C37076Xj0.m76533a(this.f37653a));
        }

        /* renamed from: f */
        public final C45869nl2 m81272f() throws GeneralSecurityException, IOException {
            try {
                return m81273e();
            } catch (FileNotFoundException e) {
                if (Log.isLoggable(C8329Uc.f37649d, 4)) {
                    Log.i(C8329Uc.f37649d, String.format("keyset not found, will generate a new one. %s", e.getMessage()));
                }
                if (this.f37658f != null) {
                    C45869nl2 m23223a = C45869nl2.m23215i().m23223a(this.f37658f);
                    C45869nl2 m23216h = m23223a.m23216h(m23223a.m23220d().m26874g().m25098K(0).m25088K());
                    if (this.f37656d != null) {
                        m23216h.m23220d().m26869l(this.f37654b, this.f37656d);
                    } else {
                        C37076Xj0.m76532b(m23216h.m23220d(), this.f37654b);
                    }
                    return m23216h;
                }
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }

        /* renamed from: g */
        public final InterfaceC27152p8 m81271g() throws GeneralSecurityException {
            C9107Wc c9107Wc;
            if (!C8329Uc.m81278d()) {
                Log.w(C8329Uc.f37649d, "Android Keystore requires at least Android M");
                return null;
            }
            if (this.f37659g != null) {
                c9107Wc = new C9107Wc.C9109b().m78141b(this.f37659g).m78142a();
            } else {
                c9107Wc = new C9107Wc();
            }
            boolean m78145e = c9107Wc.m78145e(this.f37655c);
            if (!m78145e) {
                try {
                    C9107Wc.m78146d(this.f37655c);
                } catch (GeneralSecurityException | ProviderException e) {
                    Log.w(C8329Uc.f37649d, "cannot use Android Keystore, it'll be disabled", e);
                    return null;
                }
            }
            try {
                return c9107Wc.mo11804b(this.f37655c);
            } catch (GeneralSecurityException | ProviderException e2) {
                if (!m78145e) {
                    Log.w(C8329Uc.f37649d, "cannot use Android Keystore, it'll be disabled", e2);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f37655c), e2);
            }
        }

        /* renamed from: h */
        public C8331b m81270h(C33811Jk2 c33811Jk2) {
            this.f37658f = c33811Jk2;
            return this;
        }

        /* renamed from: i */
        public C8331b m81269i(String str) {
            if (str.startsWith("android-keystore://")) {
                if (this.f37657e) {
                    this.f37655c = str;
                    return this;
                }
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }

        /* renamed from: j */
        public C8331b m81268j(Context context, String str, String str2) throws IOException {
            if (context != null) {
                if (str != null) {
                    this.f37653a = new C37216Xy5(context, str, str2);
                    this.f37654b = new C37450Yy5(context, str, str2);
                    return this;
                }
                throw new IllegalArgumentException("need a keyset name");
            }
            throw new IllegalArgumentException("need an Android context");
        }
    }

    /* renamed from: d */
    public static boolean m81278d() {
        return true;
    }

    /* renamed from: c */
    public synchronized C44683ll2 m81279c() throws GeneralSecurityException {
        return this.f37652c.m23220d();
    }

    public C8329Uc(C8331b c8331b) throws GeneralSecurityException, IOException {
        this.f37650a = c8331b.f37654b;
        this.f37651b = c8331b.f37656d;
        this.f37652c = c8331b.f37660h;
    }
}
