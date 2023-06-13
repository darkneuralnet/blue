package p000;

import com.amazonaws.services.p026s3.internal.crypto.JceEncryptionConstants;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* renamed from: Uk2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36385Uk2 {
    private C36385Uk2() {
    }

    /* renamed from: a */
    public static SecretKey m80951a(SecretKey secretKey) {
        if (secretKey == null) {
            return null;
        }
        return new SecretKeySpec(secretKey.getEncoded(), JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
    }
}
