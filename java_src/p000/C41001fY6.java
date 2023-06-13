package p000;

import android.util.Base64;
import java.util.Random;
/* renamed from: fY6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41001fY6 {

    /* renamed from: a */
    public static final Random f80317a = new Random();

    /* renamed from: a */
    public static String m41198a() {
        byte[] bArr = new byte[16];
        f80317a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
