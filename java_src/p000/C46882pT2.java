package p000;

import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Map;
/* renamed from: pT2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46882pT2 {
    /* renamed from: a */
    public static final C53102zx1 m19252a(String str, Object[] objArr) {
        Throwable m19244i = m19244i(objArr);
        if (m19244i != null) {
            objArr = m19236q(objArr);
        }
        return m19251b(str, objArr, m19244i);
    }

    /* renamed from: b */
    public static final C53102zx1 m19251b(String str, Object[] objArr, Throwable th) {
        int i;
        if (str == null) {
            return new C53102zx1(null, objArr, th);
        }
        if (objArr == null) {
            return new C53102zx1(str);
        }
        StringBuilder sb = new StringBuilder(str.length() + 50);
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length) {
            int indexOf = str.indexOf("{}", i3);
            if (indexOf == -1) {
                if (i3 == 0) {
                    return new C53102zx1(str, objArr, th);
                }
                sb.append((CharSequence) str, i3, str.length());
                return new C53102zx1(sb.toString(), objArr, th);
            }
            if (m19241l(str, indexOf)) {
                if (!m19242k(str, indexOf)) {
                    i2--;
                    sb.append((CharSequence) str, i3, indexOf - 1);
                    sb.append(CoreConstants.CURLY_LEFT);
                    i = indexOf + 1;
                    i3 = i;
                    i2++;
                } else {
                    sb.append((CharSequence) str, i3, indexOf - 1);
                    m19247f(sb, objArr[i2], new HashMap());
                }
            } else {
                sb.append((CharSequence) str, i3, indexOf);
                m19247f(sb, objArr[i2], new HashMap());
            }
            i = indexOf + 2;
            i3 = i;
            i2++;
        }
        sb.append((CharSequence) str, i3, str.length());
        return new C53102zx1(sb.toString(), objArr, th);
    }

    /* renamed from: c */
    public static void m19250c(StringBuilder sb, boolean[] zArr) {
        sb.append('[');
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(zArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: d */
    public static void m19249d(StringBuilder sb, byte[] bArr) {
        sb.append('[');
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append((int) bArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: e */
    public static void m19248e(StringBuilder sb, char[] cArr) {
        sb.append('[');
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(cArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: f */
    public static void m19247f(StringBuilder sb, Object obj, Map<Object[], Object> map) {
        if (obj == null) {
            sb.append("null");
        } else if (!obj.getClass().isArray()) {
            m19238o(sb, obj);
        } else if (obj instanceof boolean[]) {
            m19250c(sb, (boolean[]) obj);
        } else if (obj instanceof byte[]) {
            m19249d(sb, (byte[]) obj);
        } else if (obj instanceof char[]) {
            m19248e(sb, (char[]) obj);
        } else if (obj instanceof short[]) {
            m19237p(sb, (short[]) obj);
        } else if (obj instanceof int[]) {
            m19243j(sb, (int[]) obj);
        } else if (obj instanceof long[]) {
            m19240m(sb, (long[]) obj);
        } else if (obj instanceof float[]) {
            m19245h(sb, (float[]) obj);
        } else if (obj instanceof double[]) {
            m19246g(sb, (double[]) obj);
        } else {
            m19239n(sb, (Object[]) obj, map);
        }
    }

    /* renamed from: g */
    public static void m19246g(StringBuilder sb, double[] dArr) {
        sb.append('[');
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(dArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: h */
    public static void m19245h(StringBuilder sb, float[] fArr) {
        sb.append('[');
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(fArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: i */
    public static Throwable m19244i(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                return (Throwable) obj;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static void m19243j(StringBuilder sb, int[] iArr) {
        sb.append('[');
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(iArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: k */
    public static final boolean m19242k(String str, int i) {
        return i >= 2 && str.charAt(i - 2) == '\\';
    }

    /* renamed from: l */
    public static final boolean m19241l(String str, int i) {
        return i != 0 && str.charAt(i - 1) == '\\';
    }

    /* renamed from: m */
    public static void m19240m(StringBuilder sb, long[] jArr) {
        sb.append('[');
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(jArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: n */
    public static void m19239n(StringBuilder sb, Object[] objArr, Map<Object[], Object> map) {
        sb.append('[');
        if (!map.containsKey(objArr)) {
            map.put(objArr, null);
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                m19247f(sb, objArr[i], map);
                if (i != length - 1) {
                    sb.append(", ");
                }
            }
            map.remove(objArr);
        } else {
            sb.append("...");
        }
        sb.append(']');
    }

    /* renamed from: o */
    public static void m19238o(StringBuilder sb, Object obj) {
        try {
            sb.append(obj.toString());
        } catch (Throwable th) {
            C49993ui6.m9851d("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + "]", th);
            sb.append("[FAILED toString()]");
        }
    }

    /* renamed from: p */
    public static void m19237p(StringBuilder sb, short[] sArr) {
        sb.append('[');
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            sb.append((int) sArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
    }

    /* renamed from: q */
    public static Object[] m19236q(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            int length = objArr.length - 1;
            Object[] objArr2 = new Object[length];
            if (length > 0) {
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return objArr2;
        }
        throw new IllegalStateException("non-sensical empty or null argument array");
    }
}
