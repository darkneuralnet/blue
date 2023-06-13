package p000;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
/* renamed from: bh5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38699bh5 {

    /* renamed from: a */
    public static final SSLSocketFactory f57906a;

    static {
        try {
            f57906a = m64139a();
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            throw new RuntimeException("Could not initialize SSLSocketFactory.", e);
        }
    }

    private C38699bh5() {
        throw new AssertionError("private constructor");
    }

    /* renamed from: a */
    public static SSLSocketFactory m64139a() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        return sSLContext.getSocketFactory();
    }
}
