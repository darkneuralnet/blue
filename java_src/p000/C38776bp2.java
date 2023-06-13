package p000;

import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import com.nimbusds.jose.JOSEException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: bp2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C38776bp2 {

    /* renamed from: a */
    public static final byte[] f59583a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final byte[] f59584b = {0, 0, 0, 0};

    /* renamed from: c */
    public static final byte[] f59585c = {69, 110, 99, 114, 121, 112, 116, 105, 111, 110};

    /* renamed from: d */
    public static final byte[] f59586d = {73, 110, 116, 101, 103, 114, 105, 116, 121};

    private C38776bp2() {
    }

    /* renamed from: a */
    public static SecretKey m62561a(SecretKey secretKey, C36312Uc1 c36312Uc1, byte[] bArr, byte[] bArr2) throws JOSEException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(f59583a);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(P52.m90872a(length / 2));
            byteArrayOutputStream.write(c36312Uc1.toString().getBytes(C48618sO5.f108725a));
            if (bArr != null) {
                byteArrayOutputStream.write(P52.m90872a(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(f59584b);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(P52.m90872a(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(f59584b);
            }
            byteArrayOutputStream.write(f59585c);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byte[] digest = MessageDigest.getInstance("SHA-" + length).digest(byteArray);
                int length2 = digest.length / 2;
                byte[] bArr3 = new byte[length2];
                System.arraycopy(digest, 0, bArr3, 0, length2);
                return new SecretKeySpec(bArr3, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            } catch (NoSuchAlgorithmException e) {
                throw new JOSEException(e.getMessage(), e);
            }
        } catch (IOException e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
    }

    /* renamed from: b */
    public static SecretKey m62560b(SecretKey secretKey, C36312Uc1 c36312Uc1, byte[] bArr, byte[] bArr2) throws JOSEException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(f59583a);
            byte[] encoded = secretKey.getEncoded();
            byteArrayOutputStream.write(encoded);
            int length = encoded.length * 8;
            byteArrayOutputStream.write(P52.m90872a(length));
            byteArrayOutputStream.write(c36312Uc1.toString().getBytes(C48618sO5.f108725a));
            if (bArr != null) {
                byteArrayOutputStream.write(P52.m90872a(bArr.length));
                byteArrayOutputStream.write(bArr);
            } else {
                byteArrayOutputStream.write(f59584b);
            }
            if (bArr2 != null) {
                byteArrayOutputStream.write(P52.m90872a(bArr2.length));
                byteArrayOutputStream.write(bArr2);
            } else {
                byteArrayOutputStream.write(f59584b);
            }
            byteArrayOutputStream.write(f59586d);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byte[] digest = MessageDigest.getInstance("SHA-" + length).digest(byteArray);
                return new SecretKeySpec(digest, "HMACSHA" + length);
            } catch (NoSuchAlgorithmException e) {
                throw new JOSEException(e.getMessage(), e);
            }
        } catch (IOException e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
    }
}
