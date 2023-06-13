package p000;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: Mn7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C34545Mn7 extends AbstractMap implements Serializable {

    /* renamed from: k */
    public static final Object f23579k = new Object();

    /* renamed from: b */
    public transient Object f23580b;

    /* renamed from: c */
    public transient int[] f23581c;

    /* renamed from: d */
    public transient Object[] f23582d;

    /* renamed from: e */
    public transient Object[] f23583e;

    /* renamed from: f */
    public transient int f23584f;

    /* renamed from: g */
    public transient int f23585g;

    /* renamed from: h */
    public transient Set f23586h;

    /* renamed from: i */
    public transient Set f23587i;

    /* renamed from: j */
    public transient Collection f23588j;

    public C34545Mn7() {
        m94808q(3);
    }

    /* renamed from: d */
    public static /* synthetic */ int m94821d(C34545Mn7 c34545Mn7) {
        int i = c34545Mn7.f23585g;
        c34545Mn7.f23585g = i - 1;
        return i;
    }

    /* renamed from: i */
    public static /* synthetic */ Object m94816i(C34545Mn7 c34545Mn7, int i) {
        return c34545Mn7.m94824a()[i];
    }

    /* renamed from: l */
    public static /* synthetic */ Object m94813l(C34545Mn7 c34545Mn7, int i) {
        return c34545Mn7.m94823b()[i];
    }

    /* renamed from: m */
    public static /* synthetic */ Object m94812m(C34545Mn7 c34545Mn7) {
        Object obj = c34545Mn7.f23580b;
        obj.getClass();
        return obj;
    }

    /* renamed from: o */
    public static /* synthetic */ void m94810o(C34545Mn7 c34545Mn7, int i, Object obj) {
        c34545Mn7.m94823b()[i] = obj;
    }

    /* renamed from: A */
    public final void m94826A(int i) {
        this.f23584f = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f23584f & (-32));
    }

    /* renamed from: B */
    public final int[] m94825B() {
        int[] iArr = this.f23581c;
        iArr.getClass();
        return iArr;
    }

    /* renamed from: a */
    public final Object[] m94824a() {
        Object[] objArr = this.f23582d;
        objArr.getClass();
        return objArr;
    }

    /* renamed from: b */
    public final Object[] m94823b() {
        Object[] objArr = this.f23583e;
        objArr.getClass();
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m94806s()) {
            return;
        }
        m94809p();
        Map m94811n = m94811n();
        if (m94811n != null) {
            this.f23584f = TN7.m83706a(size(), 3, 1073741823);
            m94811n.clear();
            this.f23580b = null;
            this.f23585g = 0;
            return;
        }
        Arrays.fill(m94824a(), 0, this.f23585g, (Object) null);
        Arrays.fill(m94823b(), 0, this.f23585g, (Object) null);
        Object obj = this.f23580b;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m94825B(), 0, this.f23585g, 0);
        this.f23585g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map m94811n = m94811n();
        if (m94811n != null) {
            return m94811n.containsKey(obj);
        }
        if (m94801x(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map m94811n = m94811n();
        if (m94811n == null) {
            for (int i = 0; i < this.f23585g; i++) {
                if (QX7.m88418a(obj, m94823b()[i])) {
                    return true;
                }
            }
            return false;
        }
        return m94811n.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f23587i;
        if (set == null) {
            C44075kj7 c44075kj7 = new C44075kj7(this);
            this.f23587i = c44075kj7;
            return c44075kj7;
        }
        return set;
    }

    /* renamed from: g */
    public final int m94818g() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map m94811n = m94811n();
        if (m94811n != null) {
            return m94811n.get(obj);
        }
        int m94801x = m94801x(obj);
        if (m94801x == -1) {
            return null;
        }
        return m94823b()[m94801x];
    }

    /* renamed from: h */
    public final int m94817h(int i) {
        int i2 = i + 1;
        if (i2 < this.f23585g) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f23586h;
        if (set == null) {
            C38741bl7 c38741bl7 = new C38741bl7(this);
            this.f23586h = c38741bl7;
            return c38741bl7;
        }
        return set;
    }

    /* renamed from: n */
    public final Map m94811n() {
        Object obj = this.f23580b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* renamed from: p */
    public final void m94809p() {
        this.f23584f += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (m94806s()) {
            C41211ft8.m40585e(m94806s(), "Arrays already allocated");
            int i = this.f23584f;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f23580b = C32682Eo7.m108337d(max2);
            m94826A(max2 - 1);
            this.f23581c = new int[i];
            this.f23582d = new Object[i];
            this.f23583e = new Object[i];
        }
        Map m94811n = m94811n();
        if (m94811n != null) {
            return m94811n.put(obj, obj2);
        }
        int[] m94825B = m94825B();
        Object[] m94824a = m94824a();
        Object[] m94823b = m94823b();
        int i2 = this.f23585g;
        int i3 = i2 + 1;
        int m6275b = C51249wp7.m6275b(obj);
        int m94802w = m94802w();
        int i4 = m6275b & m94802w;
        Object obj3 = this.f23580b;
        obj3.getClass();
        int m108338c = C32682Eo7.m108338c(obj3, i4);
        if (m108338c == 0) {
            if (i3 > m94802w) {
                m94802w = m94800y(m94802w, C32682Eo7.m108340a(m94802w), m6275b, i2);
            } else {
                Object obj4 = this.f23580b;
                obj4.getClass();
                C32682Eo7.m108336e(obj4, i4, i3);
            }
        } else {
            int i5 = ~m94802w;
            int i6 = m6275b & i5;
            int i7 = 0;
            while (true) {
                int i8 = m108338c - 1;
                int i9 = m94825B[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && QX7.m88418a(obj, m94824a[i8])) {
                    Object obj5 = m94823b[i8];
                    m94823b[i8] = obj2;
                    return obj5;
                }
                int i11 = i9 & m94802w;
                i7++;
                if (i11 == 0) {
                    if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(m94802w() + 1, 1.0f);
                        int m94818g = m94818g();
                        while (m94818g >= 0) {
                            linkedHashMap.put(m94824a()[m94818g], m94823b()[m94818g]);
                            m94818g = m94817h(m94818g);
                        }
                        this.f23580b = linkedHashMap;
                        this.f23581c = null;
                        this.f23582d = null;
                        this.f23583e = null;
                        m94809p();
                        return linkedHashMap.put(obj, obj2);
                    } else if (i3 > m94802w) {
                        m94802w = m94800y(m94802w, C32682Eo7.m108340a(m94802w), m6275b, i2);
                    } else {
                        m94825B[i8] = (i3 & m94802w) | i10;
                    }
                } else {
                    m108338c = i11;
                }
            }
        }
        int length = m94825B().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f23581c = Arrays.copyOf(m94825B(), min);
            this.f23582d = Arrays.copyOf(m94824a(), min);
            this.f23583e = Arrays.copyOf(m94823b(), min);
        }
        m94825B()[i2] = (~m94802w) & m6275b;
        m94824a()[i2] = obj;
        m94823b()[i2] = obj2;
        this.f23585g = i3;
        m94809p();
        return null;
    }

    /* renamed from: q */
    public final void m94808q(int i) {
        this.f23584f = TN7.m83706a(12, 1, 1073741823);
    }

    /* renamed from: r */
    public final void m94807r(int i, int i2) {
        Object obj = this.f23580b;
        obj.getClass();
        int[] m94825B = m94825B();
        Object[] m94824a = m94824a();
        Object[] m94823b = m94823b();
        int size = size() - 1;
        if (i < size) {
            Object obj2 = m94824a[size];
            m94824a[i] = obj2;
            m94823b[i] = m94823b[size];
            m94824a[size] = null;
            m94823b[size] = null;
            m94825B[i] = m94825B[size];
            m94825B[size] = 0;
            int m6275b = C51249wp7.m6275b(obj2) & i2;
            int m108338c = C32682Eo7.m108338c(obj, m6275b);
            int i3 = size + 1;
            if (m108338c == i3) {
                C32682Eo7.m108336e(obj, m6275b, i + 1);
                return;
            }
            while (true) {
                int i4 = m108338c - 1;
                int i5 = m94825B[i4];
                int i6 = i5 & i2;
                if (i6 != i3) {
                    m108338c = i6;
                } else {
                    m94825B[i4] = ((i + 1) & i2) | (i5 & (~i2));
                    return;
                }
            }
        } else {
            m94824a[i] = null;
            m94823b[i] = null;
            m94825B[i] = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map m94811n = m94811n();
        if (m94811n != null) {
            return m94811n.remove(obj);
        }
        Object m94799z = m94799z(obj);
        if (m94799z == f23579k) {
            return null;
        }
        return m94799z;
    }

    /* renamed from: s */
    public final boolean m94806s() {
        return this.f23580b == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map m94811n = m94811n();
        if (m94811n != null) {
            return m94811n.size();
        }
        return this.f23585g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f23588j;
        if (collection == null) {
            C36174Tm7 c36174Tm7 = new C36174Tm7(this);
            this.f23588j = c36174Tm7;
            return c36174Tm7;
        }
        return collection;
    }

    /* renamed from: w */
    public final int m94802w() {
        return (1 << (this.f23584f & 31)) - 1;
    }

    /* renamed from: x */
    public final int m94801x(Object obj) {
        if (m94806s()) {
            return -1;
        }
        int m6275b = C51249wp7.m6275b(obj);
        int m94802w = m94802w();
        Object obj2 = this.f23580b;
        obj2.getClass();
        int m108338c = C32682Eo7.m108338c(obj2, m6275b & m94802w);
        if (m108338c == 0) {
            return -1;
        }
        int i = ~m94802w;
        int i2 = m6275b & i;
        do {
            int i3 = m108338c - 1;
            int i4 = m94825B()[i3];
            if ((i4 & i) == i2 && QX7.m88418a(obj, m94824a()[i3])) {
                return i3;
            }
            m108338c = i4 & m94802w;
        } while (m108338c != 0);
        return -1;
    }

    /* renamed from: y */
    public final int m94800y(int i, int i2, int i3, int i4) {
        Object m108337d = C32682Eo7.m108337d(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C32682Eo7.m108336e(m108337d, i3 & i5, i4 + 1);
        }
        Object obj = this.f23580b;
        obj.getClass();
        int[] m94825B = m94825B();
        for (int i6 = 0; i6 <= i; i6++) {
            int m108338c = C32682Eo7.m108338c(obj, i6);
            while (m108338c != 0) {
                int i7 = m108338c - 1;
                int i8 = m94825B[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int m108338c2 = C32682Eo7.m108338c(m108337d, i10);
                C32682Eo7.m108336e(m108337d, i10, m108338c);
                m94825B[i7] = ((~i5) & i9) | (m108338c2 & i5);
                m108338c = i8 & i;
            }
        }
        this.f23580b = m108337d;
        m94826A(i5);
        return i5;
    }

    /* renamed from: z */
    public final Object m94799z(Object obj) {
        if (m94806s()) {
            return f23579k;
        }
        int m94802w = m94802w();
        Object obj2 = this.f23580b;
        obj2.getClass();
        int m108339b = C32682Eo7.m108339b(obj, null, m94802w, obj2, m94825B(), m94824a(), null);
        if (m108339b == -1) {
            return f23579k;
        }
        Object obj3 = m94823b()[m108339b];
        m94807r(m108339b, m94802w);
        this.f23585g--;
        m94809p();
        return obj3;
    }

    public C34545Mn7(int i) {
        m94808q(12);
    }
}
