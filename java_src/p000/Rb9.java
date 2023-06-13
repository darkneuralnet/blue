package p000;

import android.util.Base64;
import android.util.Log;
import java.security.SecureRandom;
import java.util.Random;
/* renamed from: Rb9 */
/* loaded from: classes5.dex */
public final class Rb9 {

    /* renamed from: a */
    public static final Random f32296a = new SecureRandom();

    /* renamed from: a */
    public static String m86561a() {
        String str;
        byte[] bArr = new byte[17];
        f32296a.nextBytes(bArr);
        bArr[0] = (byte) ((bArr[0] & 15) | 112);
        String substring = Base64.encodeToString(bArr, 11).substring(0, 22);
        String valueOf = String.valueOf(substring);
        if (valueOf.length() != 0) {
            str = "Generated installation id: ".concat(valueOf);
        } else {
            str = new String("Generated installation id: ");
        }
        Log.d("MLKitInstallationIdGenerator", str);
        return substring;
    }
}
