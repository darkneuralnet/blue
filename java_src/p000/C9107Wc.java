package p000;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
/* renamed from: Wc */
/* loaded from: classes6.dex */
public final class C9107Wc implements InterfaceC49426tl2 {

    /* renamed from: c */
    public static final String f41393c = "Wc";

    /* renamed from: a */
    public final String f41394a;

    /* renamed from: b */
    public KeyStore f41395b;

    /* renamed from: Wc$b */
    /* loaded from: classes6.dex */
    public static final class C9109b {

        /* renamed from: a */
        public String f41396a = null;

        /* renamed from: b */
        public KeyStore f41397b;

        public C9109b() {
            this.f41397b = null;
            if (C9107Wc.m78144f()) {
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    this.f41397b = keyStore;
                    keyStore.load(null);
                    return;
                } catch (IOException | GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            }
            throw new IllegalStateException("need Android Keystore on Android M or newer");
        }

        /* renamed from: a */
        public C9107Wc m78142a() {
            return new C9107Wc(this);
        }

        /* renamed from: b */
        public C9109b m78141b(KeyStore keyStore) {
            if (keyStore != null) {
                this.f41397b = keyStore;
                return this;
            }
            throw new IllegalArgumentException("val cannot be null");
        }
    }

    /* renamed from: d */
    public static void m78146d(String str) throws GeneralSecurityException {
        if (!new C9107Wc().m78145e(str)) {
            String m115337b = C31700Aj6.m115337b("android-keystore://", str);
            KeyGenerator keyGenerator = KeyGenerator.getInstance(JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM, "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(m115337b, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
            keyGenerator.generateKey();
            return;
        }
        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str));
    }

    /* renamed from: f */
    public static boolean m78144f() {
        return true;
    }

    /* renamed from: g */
    public static InterfaceC27152p8 m78143g(InterfaceC27152p8 interfaceC27152p8) throws GeneralSecurityException {
        byte[] m43714c = C39961dn4.m43714c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(m43714c, interfaceC27152p8.mo3715b(interfaceC27152p8.mo3716a(m43714c, bArr), bArr))) {
            return interfaceC27152p8;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r3.toLowerCase(java.util.Locale.US).startsWith("android-keystore://") != false) goto L14;
     */
    @Override // p000.InterfaceC49426tl2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized boolean mo11805a(String str) {
        String str2 = this.f41394a;
        boolean z = true;
        if (str2 != null && str2.equals(str)) {
            return true;
        }
        if (this.f41394a == null) {
        }
        z = false;
        return z;
    }

    @Override // p000.InterfaceC49426tl2
    /* renamed from: b */
    public synchronized InterfaceC27152p8 mo11804b(String str) throws GeneralSecurityException {
        String str2 = this.f41394a;
        if (str2 != null && !str2.equals(str)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f41394a, str));
        }
        return m78143g(new C8706Vc(C31700Aj6.m115337b("android-keystore://", str), this.f41395b));
    }

    /* renamed from: e */
    public synchronized boolean m78145e(String str) throws GeneralSecurityException {
        String str2;
        try {
        } catch (NullPointerException unused) {
            Log.w(f41393c, "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f41395b = keyStore;
                keyStore.load(null);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            } catch (InterruptedException unused2) {
            }
            return this.f41395b.containsAlias(str2);
        }
        return this.f41395b.containsAlias(C31700Aj6.m115337b("android-keystore://", str));
    }

    public C9107Wc() throws GeneralSecurityException {
        this(new C9109b());
    }

    public C9107Wc(C9109b c9109b) {
        this.f41394a = c9109b.f41396a;
        this.f41395b = c9109b.f41397b;
    }
}
