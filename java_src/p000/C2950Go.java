package p000;
/* renamed from: Go */
/* loaded from: classes6.dex */
public final class C2950Go {
    private C2950Go() {
    }

    /* renamed from: a */
    public static boolean m104713a(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: b */
    public static String m104712b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m104713a(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m104713a(c)) {
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
}
