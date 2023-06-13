package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import okhttp3.CipherSuite;
import okhttp3.TlsVersion;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u0002\u0010\t¨\u0006\u000b"}, m28432d2 = {"", "Lokhttp3/TlsVersion;", C17296a.f69688o, "[Lokhttp3/TlsVersion;", "b", "()[Lokhttp3/TlsVersion;", "TLS_VERSIONS", "Lokhttp3/CipherSuite;", "[Lokhttp3/CipherSuite;", "()[Lokhttp3/CipherSuite;", "CIPHER_SUITES", "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Q43 */
/* loaded from: classes4.dex */
public final class Q43 {

    /* renamed from: a */
    public static final TlsVersion[] f29803a = {TlsVersion.TLS_1_3, TlsVersion.TLS_1_2};

    /* renamed from: b */
    public static final CipherSuite[] f29804b;

    static {
        CipherSuite cipherSuite = CipherSuite.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;
        CipherSuite cipherSuite2 = CipherSuite.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;
        f29804b = new CipherSuite[]{CipherSuite.TLS_AES_128_GCM_SHA256, CipherSuite.TLS_AES_256_GCM_SHA384, CipherSuite.TLS_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, cipherSuite, cipherSuite, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, cipherSuite2, cipherSuite2, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384};
    }

    /* renamed from: a */
    public static final CipherSuite[] m88954a() {
        return f29804b;
    }

    /* renamed from: b */
    public static final TlsVersion[] m88953b() {
        return f29803a;
    }
}
