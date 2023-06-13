package p000;

import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import com.nimbusds.jose.KeyLengthException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: Vt0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36698Vt0 {

    /* renamed from: a */
    public final SecretKey f39876a;

    /* renamed from: b */
    public final SecretKey f39877b;

    /* renamed from: c */
    public final SecretKey f39878c;

    /* renamed from: d */
    public final int f39879d;

    public C36698Vt0(SecretKey secretKey) throws KeyLengthException {
        this.f39876a = secretKey;
        byte[] encoded = secretKey.getEncoded();
        if (encoded.length == 32) {
            this.f39877b = new SecretKeySpec(encoded, 0, 16, "HMACSHA256");
            this.f39878c = new SecretKeySpec(encoded, 16, 16, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            this.f39879d = 16;
        } else if (encoded.length == 48) {
            this.f39877b = new SecretKeySpec(encoded, 0, 24, "HMACSHA384");
            this.f39878c = new SecretKeySpec(encoded, 24, 24, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            this.f39879d = 24;
        } else if (encoded.length == 64) {
            this.f39877b = new SecretKeySpec(encoded, 0, 32, "HMACSHA512");
            this.f39878c = new SecretKeySpec(encoded, 32, 32, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            this.f39879d = 32;
        } else {
            throw new KeyLengthException("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
        }
    }

    /* renamed from: a */
    public SecretKey m79310a() {
        return this.f39878c;
    }

    /* renamed from: b */
    public SecretKey m79309b() {
        return this.f39877b;
    }

    /* renamed from: c */
    public int m79308c() {
        return this.f39879d;
    }
}
