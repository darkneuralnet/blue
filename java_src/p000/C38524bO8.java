package p000;
/* renamed from: bO8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38524bO8 {
    /* renamed from: a */
    public static boolean m64568a(CharSequence charSequence, CharSequence charSequence2) {
        int m64567b;
        int length = charSequence.length();
        if (charSequence == "application/x-protobuf") {
            return true;
        }
        if (length != "application/x-protobuf".length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = "application/x-protobuf".charAt(i);
            if (charAt != charAt2 && ((m64567b = m64567b(charAt)) >= 26 || m64567b != m64567b(charAt2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static int m64567b(char c) {
        return (char) ((c | ' ') - 97);
    }
}
