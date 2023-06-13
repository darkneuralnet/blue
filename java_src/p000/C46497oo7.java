package p000;

import android.util.Base64;
/* renamed from: oo7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46497oo7 {

    /* renamed from: a */
    public static final C41753go7 f102524a;

    static {
        byte[] decode = Base64.decode("xBkDPNxUEiMRX5vPP2wqvCR4Grb8GZQqrKNyC0Y", 3);
        byte[] decode2 = Base64.decode("xJXZd/zR0io4+XWtcwbtnyYutpO4NX7DhE3xBg4", 3);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[i] ^ decode2[i]);
        }
        f102524a = new C41753go7("722550545529", Base64.encodeToString(bArr, 3), "82c62205f0ef0ea96608a8");
    }
}
