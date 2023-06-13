package p000;

import ch.qos.logback.core.CoreConstants;
import java.util.ConcurrentModificationException;
import java.util.Map;
/* renamed from: NA5 */
/* loaded from: classes.dex */
public class NA5<K, V> {

    /* renamed from: e */
    public static Object[] f24230e;

    /* renamed from: f */
    public static int f24231f;

    /* renamed from: g */
    public static Object[] f24232g;

    /* renamed from: h */
    public static int f24233h;

    /* renamed from: b */
    public int[] f24234b;

    /* renamed from: c */
    public Object[] f24235c;

    /* renamed from: d */
    public int f24236d;

    public NA5() {
        this.f24234b = C51342wz0.f116939a;
        this.f24235c = C51342wz0.f116941c;
        this.f24236d = 0;
    }

    /* renamed from: a */
    private void m94272a(int i) {
        if (i == 8) {
            synchronized (NA5.class) {
                Object[] objArr = f24232g;
                if (objArr != null) {
                    this.f24235c = objArr;
                    f24232g = (Object[]) objArr[0];
                    this.f24234b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f24233h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (NA5.class) {
                Object[] objArr2 = f24230e;
                if (objArr2 != null) {
                    this.f24235c = objArr2;
                    f24230e = (Object[]) objArr2[0];
                    this.f24234b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f24231f--;
                    return;
                }
            }
        }
        this.f24234b = new int[i];
        this.f24235c = new Object[i << 1];
    }

    /* renamed from: b */
    public static int m94271b(int[] iArr, int i, int i2) {
        try {
            return C51342wz0.m6015a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    public static void m94269d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (NA5.class) {
                if (f24233h < 10) {
                    objArr[0] = f24232g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f24232g = objArr;
                    f24233h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (NA5.class) {
                if (f24231f < 10) {
                    objArr[0] = f24230e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f24230e = objArr;
                    f24231f++;
                }
            }
        }
    }

    /* renamed from: c */
    public void m94270c(int i) {
        int i2 = this.f24236d;
        int[] iArr = this.f24234b;
        if (iArr.length < i) {
            Object[] objArr = this.f24235c;
            m94272a(i);
            if (this.f24236d > 0) {
                System.arraycopy(iArr, 0, this.f24234b, 0, i2);
                System.arraycopy(objArr, 0, this.f24235c, 0, i2 << 1);
            }
            m94269d(iArr, objArr, i2);
        }
        if (this.f24236d == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        int i = this.f24236d;
        if (i > 0) {
            int[] iArr = this.f24234b;
            Object[] objArr = this.f24235c;
            this.f24234b = C51342wz0.f116939a;
            this.f24235c = C51342wz0.f116941c;
            this.f24236d = 0;
            m94269d(iArr, objArr, i);
        }
        if (this.f24236d <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(Object obj) {
        return m94267f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m94265h(obj) >= 0;
    }

    /* renamed from: e */
    int m94268e(Object obj, int i) {
        int i2 = this.f24236d;
        if (i2 == 0) {
            return -1;
        }
        int m94271b = m94271b(this.f24234b, i2, i);
        if (m94271b < 0) {
            return m94271b;
        }
        if (obj.equals(this.f24235c[m94271b << 1])) {
            return m94271b;
        }
        int i3 = m94271b + 1;
        while (i3 < i2 && this.f24234b[i3] == i) {
            if (obj.equals(this.f24235c[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = m94271b - 1; i4 >= 0 && this.f24234b[i4] == i; i4--) {
            if (obj.equals(this.f24235c[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NA5) {
            NA5 na5 = (NA5) obj;
            if (size() != na5.size()) {
                return false;
            }
            for (int i = 0; i < this.f24236d; i++) {
                K m94264i = m94264i(i);
                V m94263m = m94263m(i);
                Object obj2 = na5.get(m94264i);
                if (m94263m == null) {
                    if (obj2 != null || !na5.containsKey(m94264i)) {
                        return false;
                    }
                } else if (!m94263m.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f24236d; i2++) {
                K m94264i2 = m94264i(i2);
                V m94263m2 = m94263m(i2);
                Object obj3 = map.get(m94264i2);
                if (m94263m2 == null) {
                    if (obj3 != null || !map.containsKey(m94264i2)) {
                        return false;
                    }
                } else if (!m94263m2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m94267f(Object obj) {
        return obj == null ? m94266g() : m94268e(obj, obj.hashCode());
    }

    /* renamed from: g */
    public int m94266g() {
        int i = this.f24236d;
        if (i == 0) {
            return -1;
        }
        int m94271b = m94271b(this.f24234b, i, 0);
        if (m94271b < 0) {
            return m94271b;
        }
        if (this.f24235c[m94271b << 1] == null) {
            return m94271b;
        }
        int i2 = m94271b + 1;
        while (i2 < i && this.f24234b[i2] == 0) {
            if (this.f24235c[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = m94271b - 1; i3 >= 0 && this.f24234b[i3] == 0; i3--) {
            if (this.f24235c[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int m94267f = m94267f(obj);
        if (m94267f >= 0) {
            return (V) this.f24235c[(m94267f << 1) + 1];
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m94265h(Object obj) {
        int i = this.f24236d * 2;
        Object[] objArr = this.f24235c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int hashCode;
        int[] iArr = this.f24234b;
        Object[] objArr = this.f24235c;
        int i = this.f24236d;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            int i5 = iArr[i3];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i4 += hashCode ^ i5;
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    public K m94264i(int i) {
        return (K) this.f24235c[i << 1];
    }

    public boolean isEmpty() {
        return this.f24236d <= 0;
    }

    /* renamed from: j */
    public void mo34406j(NA5<? extends K, ? extends V> na5) {
        int i = na5.f24236d;
        m94270c(this.f24236d + i);
        if (this.f24236d == 0) {
            if (i > 0) {
                System.arraycopy(na5.f24234b, 0, this.f24234b, 0, i);
                System.arraycopy(na5.f24235c, 0, this.f24235c, 0, i << 1);
                this.f24236d = i;
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            put(na5.m94264i(i2), na5.m94263m(i2));
        }
    }

    /* renamed from: k */
    public V mo34405k(int i) {
        Object[] objArr = this.f24235c;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f24236d;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.f24234b;
            int i5 = 8;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                if (i3 > 8) {
                    i5 = i3 + (i3 >> 1);
                }
                m94272a(i5);
                if (i3 == this.f24236d) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f24234b, 0, i);
                        System.arraycopy(objArr, 0, this.f24235c, 0, i2);
                    }
                    if (i < i4) {
                        int i6 = i + 1;
                        int i7 = i4 - i;
                        System.arraycopy(iArr, i6, this.f24234b, i, i7);
                        System.arraycopy(objArr, i6 << 1, this.f24235c, i2, i7 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i < i4) {
                    int i8 = i + 1;
                    int i9 = i4 - i;
                    System.arraycopy(iArr, i8, iArr, i, i9);
                    Object[] objArr2 = this.f24235c;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i2, i9 << 1);
                }
                Object[] objArr3 = this.f24235c;
                int i10 = i4 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            }
            if (i3 == this.f24236d) {
                this.f24236d = i4;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return v;
    }

    /* renamed from: l */
    public V mo34404l(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f24235c;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* renamed from: m */
    public V m94263m(int i) {
        return (V) this.f24235c[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int m94268e;
        int i2 = this.f24236d;
        if (k == null) {
            m94268e = m94266g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            m94268e = m94268e(k, hashCode);
        }
        if (m94268e >= 0) {
            int i3 = (m94268e << 1) + 1;
            Object[] objArr = this.f24235c;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~m94268e;
        int[] iArr = this.f24234b;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.f24235c;
            m94272a(i5);
            if (i2 == this.f24236d) {
                int[] iArr2 = this.f24234b;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f24235c, 0, objArr2.length);
                }
                m94269d(iArr, objArr2, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr3 = this.f24234b;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f24235c;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f24236d - i4) << 1);
        }
        int i7 = this.f24236d;
        if (i2 == i7) {
            int[] iArr4 = this.f24234b;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f24235c;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f24236d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        if (v2 == null) {
            return put(k, v);
        }
        return v2;
    }

    public V remove(Object obj) {
        int m94267f = m94267f(obj);
        if (m94267f >= 0) {
            return mo34405k(m94267f);
        }
        return null;
    }

    public V replace(K k, V v) {
        int m94267f = m94267f(k);
        if (m94267f >= 0) {
            return mo34404l(m94267f, v);
        }
        return null;
    }

    public int size() {
        return this.f24236d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f24236d * 28);
        sb.append(CoreConstants.CURLY_LEFT);
        for (int i = 0; i < this.f24236d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K m94264i = m94264i(i);
            if (m94264i != this) {
                sb.append(m94264i);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m94263m = m94263m(i);
            if (m94263m != this) {
                sb.append(m94263m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int m94267f = m94267f(obj);
        if (m94267f >= 0) {
            V m94263m = m94263m(m94267f);
            if (obj2 == m94263m || (obj2 != null && obj2.equals(m94263m))) {
                mo34405k(m94267f);
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean replace(K k, V v, V v2) {
        int m94267f = m94267f(k);
        if (m94267f >= 0) {
            V m94263m = m94263m(m94267f);
            if (m94263m == v || (v != null && v.equals(m94263m))) {
                mo34404l(m94267f, v2);
                return true;
            }
            return false;
        }
        return false;
    }

    public NA5(int i) {
        if (i == 0) {
            this.f24234b = C51342wz0.f116939a;
            this.f24235c = C51342wz0.f116941c;
        } else {
            m94272a(i);
        }
        this.f24236d = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NA5(NA5<K, V> na5) {
        this();
        if (na5 != 0) {
            mo34406j(na5);
        }
    }
}
