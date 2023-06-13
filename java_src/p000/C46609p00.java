package p000;

import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
/* renamed from: p00  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46609p00 extends Provider implements InterfaceC33206Gv0 {

    /* renamed from: b */
    public static String f102888b = "BouncyCastle Security Provider v1.69";

    /* renamed from: c */
    public static final InterfaceC38035aa4 f102889c = new C47202q00();

    /* renamed from: d */
    public static final Map f102890d = new HashMap();

    /* renamed from: e */
    public static final Class f102891e = C34502Mj0.m94998a(C46609p00.class, "java.security.cert.PKIXRevocationChecker");

    /* renamed from: f */
    public static final String[] f102892f = {"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};

    /* renamed from: g */
    public static final String[] f102893g = {"SipHash", "SipHash128", "Poly1305"};

    /* renamed from: h */
    public static final String[] f102894h = {JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM, "ARC4", "ARIA", "Blowfish", "Camellia", "CAST5", "CAST6", "ChaCha", "DES", "DESede", "GOST28147", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC2", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Shacal2", "Skipjack", "SM4", "TEA", "Twofish", "Threefish", "VMPC", "VMPCKSA3", "XTEA", "XSalsa20", "OpenSSLPBKDF", "DSTU7624", "GOST3412_2015", "Zuc"};

    /* renamed from: i */
    public static final String[] f102895i = {"X509", "IES", "COMPOSITE"};

    /* renamed from: j */
    public static final String[] f102896j = {"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC"};

    /* renamed from: k */
    public static final String[] f102897k = {"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka"};

    /* renamed from: l */
    public static final String[] f102898l = {"BC", "BCFKS", "PKCS12"};

    /* renamed from: m */
    public static final String[] f102899m = {"DRBG"};

    /* renamed from: p00$a */
    /* loaded from: classes8.dex */
    public class C27117a implements PrivilegedAction {
        public C27117a() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            C46609p00.this.m20173h();
            return null;
        }
    }

    public C46609p00() {
        super("BC", 1.69d, f102888b);
        AccessController.doPrivileged(new C27117a());
    }

    /* renamed from: e */
    public void m20176e(C5448N c5448n, InterfaceC13287bp interfaceC13287bp) {
        Map map = f102890d;
        synchronized (map) {
            map.put(c5448n, interfaceC13287bp);
        }
    }

    /* renamed from: f */
    public final void m20175f(String str, String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            Class m94998a = C34502Mj0.m94998a(C46609p00.class, str + strArr[i] + "$Mappings");
            if (m94998a != null) {
                try {
                    ((AbstractC3357I9) m94998a.newInstance()).m102852a(this);
                } catch (Exception e) {
                    throw new InternalError("cannot create instance of " + str + strArr[i] + "$Mappings : " + e);
                }
            }
        }
    }

    /* renamed from: g */
    public final void m20174g() {
        m20176e(BD3.f2087r, new SN5());
        m20176e(BD3.f2091v, new C40404eY2());
        m20176e(BD3.f2092w, new DH6());
        m20176e(InterfaceC41015fa2.f80335a, new DH6());
        m20176e(BD3.f2050F, new GH6());
        m20176e(InterfaceC41015fa2.f80336b, new GH6());
        m20176e(BD3.f2082m, new C45651nO2());
        m20176e(BD3.f2083n, new C42093hO2());
        m20176e(BD3.f2070a, new C37107Xm4());
        m20176e(BD3.f2068X, new C48143rb4());
        m20176e(BD3.f2069Y, new C48143rb4());
        m20176e(InterfaceC52074yD3.f119005I0, new C33586Il2());
    }

    /* renamed from: h */
    public final void m20173h() {
        String str;
        String str2;
        m20175f("org.bouncycastle.jcajce.provider.digest.", f102897k);
        m20175f("org.bouncycastle.jcajce.provider.symmetric.", f102892f);
        m20175f("org.bouncycastle.jcajce.provider.symmetric.", f102893g);
        m20175f("org.bouncycastle.jcajce.provider.symmetric.", f102894h);
        m20175f("org.bouncycastle.jcajce.provider.asymmetric.", f102895i);
        m20175f("org.bouncycastle.jcajce.provider.asymmetric.", f102896j);
        m20175f("org.bouncycastle.jcajce.provider.keystore.", f102898l);
        m20175f("org.bouncycastle.jcajce.provider.drbg.", f102899m);
        m20174g();
        put("X509Store.CERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertCollection");
        put("X509Store.ATTRIBUTECERTIFICATE/COLLECTION", "org.bouncycastle.jce.provider.X509StoreAttrCertCollection");
        put("X509Store.CRL/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCRLCollection");
        put("X509Store.CERTIFICATEPAIR/COLLECTION", "org.bouncycastle.jce.provider.X509StoreCertPairCollection");
        put("X509Store.CERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCerts");
        put("X509Store.CRL/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCRLs");
        put("X509Store.ATTRIBUTECERTIFICATE/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPAttrCerts");
        put("X509Store.CERTIFICATEPAIR/LDAP", "org.bouncycastle.jce.provider.X509StoreLDAPCertPairs");
        put("X509StreamParser.CERTIFICATE", "org.bouncycastle.jce.provider.X509CertParser");
        put("X509StreamParser.ATTRIBUTECERTIFICATE", "org.bouncycastle.jce.provider.X509AttrCertParser");
        put("X509StreamParser.CRL", "org.bouncycastle.jce.provider.X509CRLParser");
        put("X509StreamParser.CERTIFICATEPAIR", "org.bouncycastle.jce.provider.X509CertPairParser");
        put("Cipher.BROKENPBEWITHMD5ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithMD5AndDES");
        put("Cipher.BROKENPBEWITHSHA1ANDDES", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$BrokePBEWithSHA1AndDES");
        put("Cipher.OLDPBEWITHSHAANDTWOFISH-CBC", "org.bouncycastle.jce.provider.BrokenJCEBlockCipher$OldPBEWithSHAAndTwofish");
        Class cls = f102891e;
        put("CertPathValidator.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathValidatorSpi");
        put("CertPathBuilder.RFC3281", "org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi");
        if (cls != null) {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8";
            put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi_8");
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi_8";
        } else {
            str = "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi";
            put("CertPathValidator.RFC3280", "org.bouncycastle.jce.provider.PKIXCertPathValidatorSpi");
            str2 = "org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi";
        }
        put("CertPathBuilder.RFC3280", str2);
        put("CertPathValidator.PKIX", str);
        put("CertPathBuilder.PKIX", str2);
        put("CertStore.Collection", "org.bouncycastle.jce.provider.CertStoreCollectionSpi");
        put("CertStore.LDAP", "org.bouncycastle.jce.provider.X509LDAPCertStoreSpi");
        put("CertStore.Multi", "org.bouncycastle.jce.provider.MultiCertStoreSpi");
        put("Alg.Alias.CertStore.X509LDAP", "LDAP");
    }
}
