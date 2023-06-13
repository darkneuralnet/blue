package p000;
/* renamed from: UP7 */
/* loaded from: classes6.dex */
public class UP7 {

    /* renamed from: a */
    public static final char[] f37359a = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    public static String m81551a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            char[] cArr = f37359a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
