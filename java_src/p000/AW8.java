package p000;

import kotlin.UByte;
/* renamed from: AW8 */
/* loaded from: classes6.dex */
public abstract class AW8 {

    /* renamed from: b */
    public static final char[] f680b = "0123456789abcdef".toCharArray();

    /* renamed from: g */
    public static AW8 m115679g(byte[] bArr) {
        return new C40392eW8(bArr);
    }

    /* renamed from: h */
    public static AW8 m115678h(long j) {
        return new C46322oW8(j);
    }

    /* renamed from: a */
    public abstract int mo20945a();

    /* renamed from: b */
    public abstract int mo20944b();

    /* renamed from: c */
    public abstract long mo20943c();

    /* renamed from: d */
    public abstract boolean mo20942d(AW8 aw8);

    /* renamed from: e */
    public abstract byte[] mo20941e();

    public final boolean equals(Object obj) {
        if (obj instanceof AW8) {
            AW8 aw8 = (AW8) obj;
            if (mo20944b() == aw8.mo20944b() && mo20942d(aw8)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public byte[] mo42813f() {
        return mo20941e();
    }

    public final int hashCode() {
        if (mo20944b() >= 32) {
            return mo20945a();
        }
        byte[] mo42813f = mo42813f();
        int i = mo42813f[0] & UByte.MAX_VALUE;
        for (int i2 = 1; i2 < mo42813f.length; i2++) {
            i |= (mo42813f[i2] & UByte.MAX_VALUE) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] mo42813f = mo42813f();
        int length = mo42813f.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : mo42813f) {
            char[] cArr = f680b;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
