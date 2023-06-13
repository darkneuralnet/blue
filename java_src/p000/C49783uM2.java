package p000;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
/* renamed from: uM2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49783uM2 {

    /* renamed from: a */
    public final String f112239a;

    /* renamed from: b */
    public final KeyGenParameterSpec f112240b;

    /* renamed from: uM2$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C29173a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f112241a;

        static {
            int[] iArr = new int[EnumC29178c.values().length];
            f112241a = iArr;
            try {
                iArr[EnumC29178c.AES256_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: uM2$b */
    /* loaded from: classes.dex */
    public static final class C29174b {

        /* renamed from: a */
        public final String f112242a;

        /* renamed from: b */
        public KeyGenParameterSpec f112243b;

        /* renamed from: c */
        public EnumC29178c f112244c;

        /* renamed from: d */
        public boolean f112245d;

        /* renamed from: e */
        public int f112246e;

        /* renamed from: f */
        public boolean f112247f;

        /* renamed from: g */
        public final Context f112248g;

        /* renamed from: uM2$b$a */
        /* loaded from: classes.dex */
        public static class C29175a {

            /* renamed from: uM2$b$a$a */
            /* loaded from: classes.dex */
            public static class C29176a {
                private C29176a() {
                }

                /* renamed from: a */
                public static void m10405a(KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            /* renamed from: uM2$b$a$b */
            /* loaded from: classes.dex */
            public static class C29177b {
                private C29177b() {
                }

                /* renamed from: a */
                public static void m10404a(KeyGenParameterSpec.Builder builder, int i, int i2) {
                    builder.setUserAuthenticationParameters(i, i2);
                }
            }

            private C29175a() {
            }

            /* renamed from: a */
            public static C49783uM2 m10407a(C29174b c29174b) throws GeneralSecurityException, IOException {
                EnumC29178c enumC29178c = c29174b.f112244c;
                if (enumC29178c == null && c29174b.f112243b == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (enumC29178c == EnumC29178c.AES256_GCM) {
                    KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(c29174b.f112242a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256);
                    if (c29174b.f112245d) {
                        keySize.setUserAuthenticationRequired(true);
                        if (Build.VERSION.SDK_INT >= 30) {
                            C29177b.m10404a(keySize, c29174b.f112246e, 3);
                        } else {
                            keySize.setUserAuthenticationValidityDurationSeconds(c29174b.f112246e);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 28 && c29174b.f112247f && c29174b.f112248g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        C29176a.m10405a(keySize);
                    }
                    c29174b.f112243b = keySize.build();
                }
                KeyGenParameterSpec keyGenParameterSpec = c29174b.f112243b;
                if (keyGenParameterSpec != null) {
                    return new C49783uM2(C51561xM2.m5420c(keyGenParameterSpec), c29174b.f112243b);
                }
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }

            /* renamed from: b */
            public static String m10406b(KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }
        }

        public C29174b(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        /* renamed from: a */
        public C49783uM2 m10409a() throws GeneralSecurityException, IOException {
            return C29175a.m10407a(this);
        }

        /* renamed from: b */
        public C29174b m10408b(EnumC29178c enumC29178c) {
            if (C29173a.f112241a[enumC29178c.ordinal()] == 1) {
                if (this.f112243b == null) {
                    this.f112244c = enumC29178c;
                    return this;
                }
                throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
            }
            throw new IllegalArgumentException("Unsupported scheme: " + enumC29178c);
        }

        public C29174b(Context context, String str) {
            this.f112248g = context.getApplicationContext();
            this.f112242a = str;
        }
    }

    /* renamed from: uM2$c */
    /* loaded from: classes.dex */
    public enum EnumC29178c {
        AES256_GCM
    }

    public C49783uM2(String str, Object obj) {
        this.f112239a = str;
        this.f112240b = (KeyGenParameterSpec) obj;
    }

    /* renamed from: a */
    public String m10411a() {
        return this.f112239a;
    }

    /* renamed from: b */
    public boolean m10410b() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.f112239a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f112239a + ", isKeyStoreBacked=" + m10410b() + "}";
    }
}
