package p000;

import java.util.Arrays;
/* renamed from: Wd3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C36791Wd3 {
    /* renamed from: a */
    public static boolean m78113a(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                return Arrays.deepEquals((Object[]) obj, (Object[]) obj2);
            }
            if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                return Arrays.equals((boolean[]) obj, (boolean[]) obj2);
            }
            if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                return Arrays.equals((byte[]) obj, (byte[]) obj2);
            }
            if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                return Arrays.equals((char[]) obj, (char[]) obj2);
            }
            if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                return Arrays.equals((double[]) obj, (double[]) obj2);
            }
            if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                return Arrays.equals((float[]) obj, (float[]) obj2);
            }
            if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                return Arrays.equals((int[]) obj, (int[]) obj2);
            }
            if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                return Arrays.equals((long[]) obj, (long[]) obj2);
            }
            if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                return Arrays.equals((short[]) obj, (short[]) obj2);
            }
            return obj.equals(obj2);
        } else if (obj == obj2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m78112b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: c */
    public static int m78111c(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: d */
    public static String m78110d(Object obj) {
        if (obj == null) {
            return "null";
        }
        return obj.toString();
    }
}
