package p000;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
/* renamed from: bZ3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C38618bZ3 {
    /* renamed from: a */
    public static String m64354a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "M/d/yy";
                    }
                    throw new IllegalArgumentException("Unknown DateFormat style: " + i);
                }
                return "MMM d, yyyy";
            }
            return "MMMM d, yyyy";
        }
        return "EEEE, MMMM d, yyyy";
    }

    /* renamed from: b */
    public static String m64353b(int i) {
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "h:mm a";
                }
                throw new IllegalArgumentException("Unknown DateFormat style: " + i);
            }
            return "h:mm:ss a";
        }
        return "h:mm:ss a z";
    }

    /* renamed from: c */
    public static DateFormat m64352c(int i, int i2) {
        return new SimpleDateFormat(m64354a(i) + " " + m64353b(i2), Locale.US);
    }
}
