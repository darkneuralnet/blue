package p000;

import android.util.Base64;
import android.util.Log;
import java.security.SecureRandom;
import java.util.Random;
/* renamed from: io7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42939io7 {

    /* renamed from: a */
    public static final Random f91301a = new SecureRandom();

    /* renamed from: a */
    public static String m31852a() {
        String str;
        byte[] bArr = new byte[17];
        f91301a.nextBytes(bArr);
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
