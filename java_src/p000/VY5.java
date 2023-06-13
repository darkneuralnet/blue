package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
/* renamed from: VY5 */
/* loaded from: classes.dex */
public class VY5 {
    private VY5() {
    }

    /* renamed from: a */
    public static void m79751a(Collection<Integer> collection, int i) {
        HZ3.m103736b(collection.contains(Integer.valueOf(i)), String.format(Locale.US, "Effects target %s is not in the supported list %s.", m79750b(i), m79749c(collection)));
    }

    /* renamed from: b */
    public static String m79750b(int i) {
        ArrayList arrayList = new ArrayList();
        if ((i & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return UY5.m81348a("|", arrayList);
    }

    /* renamed from: c */
    public static String m79749c(Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : collection) {
            arrayList.add(m79750b(num.intValue()));
        }
        return "[" + UY5.m81348a(", ", arrayList) + "]";
    }

    /* renamed from: d */
    public static int m79748d(int i) {
        int i2 = 0;
        while (i != 0) {
            i2 += i & 1;
            i >>= 1;
        }
        return i2;
    }

    /* renamed from: e */
    public static boolean m79747e(int i, int i2) {
        return (i & i2) == i2;
    }
}
