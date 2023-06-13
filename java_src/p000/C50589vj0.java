package p000;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
/* renamed from: vj0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C50589vj0 {
    /* renamed from: a */
    public static Cipher m8239a(String str, Provider provider) throws NoSuchAlgorithmException, NoSuchPaddingException {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }
}
