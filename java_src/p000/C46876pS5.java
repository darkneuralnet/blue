package p000;

import java.security.AccessController;
import java.security.PrivilegedAction;
import kotlin.UByte;
/* renamed from: pS5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46876pS5 {

    /* renamed from: a */
    public static String f103689a;

    /* renamed from: pS5$a */
    /* loaded from: classes8.dex */
    public static class C27295a implements PrivilegedAction<String> {
        @Override // java.security.PrivilegedAction
        /* renamed from: a */
        public String run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            try {
                f103689a = (String) AccessController.doPrivileged(new C27295a());
            } catch (Exception unused) {
                f103689a = String.format("%n", new Object[0]);
            }
        } catch (Exception unused2) {
            f103689a = "\n";
        }
    }

    /* renamed from: a */
    public static char[] m19299a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & UByte.MAX_VALUE);
        }
        return cArr;
    }

    /* renamed from: b */
    public static String m19298b(byte[] bArr) {
        return new String(m19299a(bArr));
    }

    /* renamed from: c */
    public static String m19297c(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int m20762b = C46386od6.m20762b(bArr, cArr);
        if (m20762b >= 0) {
            return new String(cArr, 0, m20762b);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    /* renamed from: d */
    public static byte[] m19296d(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    /* renamed from: e */
    public static String m19295e(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) ((c - 'A') + 97);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }
}
