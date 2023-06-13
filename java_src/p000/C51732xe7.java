package p000;
/* renamed from: xe7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51732xe7 {
    /* renamed from: a */
    public static String m4900a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m4899b(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m4899b(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: b */
    public static boolean m4899b(char c) {
        return c >= 'A' && c <= 'Z';
    }
}
