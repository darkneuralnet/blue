package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import kotlin.UByte;
/* renamed from: U31 */
/* loaded from: classes7.dex */
public class U31 {
    /* renamed from: a */
    public static byte[] m82037a(String str, String str2) {
        if (C44504lS5.m27273b(str) && C44504lS5.m27273b(str2)) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                messageDigest.update(str2.getBytes());
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException unused) {
                return new byte[0];
            }
        }
        return new byte[0];
    }

    /* renamed from: b */
    public static String m82036b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(String.format(Locale.US, "%02x", Integer.valueOf(b & UByte.MAX_VALUE)));
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m82035c(String str) {
        if (C44504lS5.m27273b(str)) {
            return m82036b(m82037a("SHA-1", str));
        }
        return "";
    }
}
