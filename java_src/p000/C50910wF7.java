package p000;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: wF7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50910wF7 extends AbstractMap implements Serializable {

    /* renamed from: k */
    public static final Object f115733k = new Object();

    /* renamed from: b */
    public transient Object f115734b;

    /* renamed from: c */
    public transient int[] f115735c;

    /* renamed from: d */
    public transient Object[] f115736d;

    /* renamed from: e */
    public transient Object[] f115737e;

    /* renamed from: f */
    public transient int f115738f;

    /* renamed from: g */
    public transient int f115739g;

    /* renamed from: h */
    public transient Set f115740h;

    /* renamed from: i */
    public transient Set f115741i;

    /* renamed from: j */
    public transient Collection f115742j;

    public C50910wF7() {
        m7067q(3);
    }

    /* renamed from: d */
    public static /* synthetic */ int m7080d(C50910wF7 c50910wF7) {
        int i = c50910wF7.f115739g;
        c50910wF7.f115739g = i - 1;
        return i;
    }

    /* renamed from: i */
    public static /* synthetic */ Object m7075i(C50910wF7 c50910wF7, int i) {
        return c50910wF7.m7083a()[i];
    }

    /* renamed from: l */
    public static /* synthetic */ Object m7072l(C50910wF7 c50910wF7, int i) {
        return c50910wF7.m7082b()[i];
    }

    /* renamed from: m */
    public static /* synthetic */ Object m7071m(C50910wF7 c50910wF7) {
        Object obj = c50910wF7.f115734b;
        obj.getClass();
        return obj;
    }

    /* renamed from: o */
    public static /* synthetic */ void m7069o(C50910wF7 c50910wF7, int i, Object obj) {
        c50910wF7.m7082b()[i] = obj;
    }

    /* renamed from: A */
    public final void m7085A(int i) {
        this.f115738f = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f115738f & (-32));
    }

    /* renamed from: B */
    public final int[] m7084B() {
        int[] iArr = this.f115735c;
        iArr.getClass();
        return iArr;
    }

    /* renamed from: a */
    public final Object[] m7083a() {
        Object[] objArr = this.f115736d;
        objArr.getClass();
        return objArr;
    }

    /* renamed from: b */
    public final Object[] m7082b() {
        Object[] objArr = this.f115737e;
        objArr.getClass();
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m7065s()) {
            return;
        }
        m7068p();
        Map m7070n = m7070n();
        if (m7070n != null) {
            this.f115738f = C50452vU7.m8609a(size(), 3, 1073741823);
            m7070n.clear();
            this.f115734b = null;
            this.f115739g = 0;
            return;
        }
        Arrays.fill(m7083a(), 0, this.f115739g, (Object) null);
        Arrays.fill(m7082b(), 0, this.f115739g, (Object) null);
        Object obj = this.f115734b;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(m7084B(), 0, this.f115739g, 0);
        this.f115739g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map m7070n = m7070n();
        if (m7070n != null) {
            return m7070n.containsKey(obj);
        }
        if (m7060x(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map m7070n = m7070n();
        if (m7070n == null) {
            for (int i = 0; i < this.f115739g; i++) {
                if (C45986nw9.m22158a(obj, m7082b()[i])) {
                    return true;
                }
            }
            return false;
        }
        return m7070n.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f115741i;
        if (set == null) {
            C44344lA7 c44344lA7 = new C44344lA7(this);
            this.f115741i = c44344lA7;
            return c44344lA7;
        }
        return set;
    }

    /* renamed from: g */
    public final int m7077g() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map m7070n = m7070n();
        if (m7070n != null) {
            return m7070n.get(obj);
        }
        int m7060x = m7060x(obj);
        if (m7060x == -1) {
            return null;
        }
        return m7082b()[m7060x];
    }

    /* renamed from: h */
    public final int m7076h(int i) {
        int i2 = i + 1;
        if (i2 < this.f115739g) {
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
        Set set = this.f115740h;
        if (set == null) {
            C37831aD7 c37831aD7 = new C37831aD7(this);
            this.f115740h = c37831aD7;
            return c37831aD7;
        }
        return set;
    }

    /* renamed from: n */
    public final Map m7070n() {
        Object obj = this.f115734b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* renamed from: p */
    public final void m7068p() {
        this.f115738f += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (m7065s()) {
            C50566vg7.m8260d(m7065s(), "Arrays already allocated");
            int i = this.f115738f;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f115734b = C44398lG7.m27446d(max2);
            m7085A(max2 - 1);
            this.f115735c = new int[i];
            this.f115736d = new Object[i];
            this.f115737e = new Object[i];
        }
        Map m7070n = m7070n();
        if (m7070n != null) {
            return m7070n.put(obj, obj2);
        }
        int[] m7084B = m7084B();
        Object[] m7083a = m7083a();
        Object[] m7082b = m7082b();
        int i2 = this.f115739g;
        int i3 = i2 + 1;
        int m43054a = C40256eH7.m43054a(obj);
        int m7061w = m7061w();
        int i4 = m43054a & m7061w;
        Object obj3 = this.f115734b;
        obj3.getClass();
        int m27447c = C44398lG7.m27447c(obj3, i4);
        if (m27447c == 0) {
            if (i3 > m7061w) {
                m7061w = m7059y(m7061w, C44398lG7.m27449a(m7061w), m43054a, i2);
            } else {
                Object obj4 = this.f115734b;
                obj4.getClass();
                C44398lG7.m27445e(obj4, i4, i3);
            }
        } else {
            int i5 = ~m7061w;
            int i6 = m43054a & i5;
            int i7 = 0;
            while (true) {
                int i8 = m27447c - 1;
                int i9 = m7084B[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && C45986nw9.m22158a(obj, m7083a[i8])) {
                    Object obj5 = m7082b[i8];
                    m7082b[i8] = obj2;
                    return obj5;
                }
                int i11 = i9 & m7061w;
                i7++;
                if (i11 == 0) {
                    if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(m7061w() + 1, 1.0f);
                        int m7077g = m7077g();
                        while (m7077g >= 0) {
                            linkedHashMap.put(m7083a()[m7077g], m7082b()[m7077g]);
                            m7077g = m7076h(m7077g);
                        }
                        this.f115734b = linkedHashMap;
                        this.f115735c = null;
                        this.f115736d = null;
                        this.f115737e = null;
                        m7068p();
                        return linkedHashMap.put(obj, obj2);
                    } else if (i3 > m7061w) {
                        m7061w = m7059y(m7061w, C44398lG7.m27449a(m7061w), m43054a, i2);
                    } else {
                        m7084B[i8] = (i3 & m7061w) | i10;
                    }
                } else {
                    m27447c = i11;
                }
            }
        }
        int length = m7084B().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f115735c = Arrays.copyOf(m7084B(), min);
            this.f115736d = Arrays.copyOf(m7083a(), min);
            this.f115737e = Arrays.copyOf(m7082b(), min);
        }
        m7084B()[i2] = (~m7061w) & m43054a;
        m7083a()[i2] = obj;
        m7082b()[i2] = obj2;
        this.f115739g = i3;
        m7068p();
        return null;
    }

    /* renamed from: q */
    public final void m7067q(int i) {
        this.f115738f = C50452vU7.m8609a(12, 1, 1073741823);
    }

    /* renamed from: r */
    public final void m7066r(int i, int i2) {
        Object obj = this.f115734b;
        obj.getClass();
        int[] m7084B = m7084B();
        Object[] m7083a = m7083a();
        Object[] m7082b = m7082b();
        int size = size() - 1;
        if (i < size) {
            Object obj2 = m7083a[size];
            m7083a[i] = obj2;
            m7082b[i] = m7082b[size];
            m7083a[size] = null;
            m7082b[size] = null;
            m7084B[i] = m7084B[size];
            m7084B[size] = 0;
            int m43054a = C40256eH7.m43054a(obj2) & i2;
            int m27447c = C44398lG7.m27447c(obj, m43054a);
            int i3 = size + 1;
            if (m27447c == i3) {
                C44398lG7.m27445e(obj, m43054a, i + 1);
                return;
            }
            while (true) {
                int i4 = m27447c - 1;
                int i5 = m7084B[i4];
                int i6 = i5 & i2;
                if (i6 != i3) {
                    m27447c = i6;
                } else {
                    m7084B[i4] = ((i + 1) & i2) | (i5 & (~i2));
                    return;
                }
            }
        } else {
            m7083a[i] = null;
            m7082b[i] = null;
            m7084B[i] = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map m7070n = m7070n();
        if (m7070n != null) {
            return m7070n.remove(obj);
        }
        Object m7058z = m7058z(obj);
        if (m7058z == f115733k) {
            return null;
        }
        return m7058z;
    }

    /* renamed from: s */
    public final boolean m7065s() {
        return this.f115734b == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map m7070n = m7070n();
        if (m7070n != null) {
            return m7070n.size();
        }
        return this.f115739g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f115742j;
        if (collection == null) {
            DE7 de7 = new DE7(this);
            this.f115742j = de7;
            return de7;
        }
        return collection;
    }

    /* renamed from: w */
    public final int m7061w() {
        return (1 << (this.f115738f & 31)) - 1;
    }

    /* renamed from: x */
    public final int m7060x(Object obj) {
        if (m7065s()) {
            return -1;
        }
        int m43054a = C40256eH7.m43054a(obj);
        int m7061w = m7061w();
        Object obj2 = this.f115734b;
        obj2.getClass();
        int m27447c = C44398lG7.m27447c(obj2, m43054a & m7061w);
        if (m27447c == 0) {
            return -1;
        }
        int i = ~m7061w;
        int i2 = m43054a & i;
        do {
            int i3 = m27447c - 1;
            int i4 = m7084B()[i3];
            if ((i4 & i) == i2 && C45986nw9.m22158a(obj, m7083a()[i3])) {
                return i3;
            }
            m27447c = i4 & m7061w;
        } while (m27447c != 0);
        return -1;
    }

    /* renamed from: y */
    public final int m7059y(int i, int i2, int i3, int i4) {
        Object m27446d = C44398lG7.m27446d(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C44398lG7.m27445e(m27446d, i3 & i5, i4 + 1);
        }
        Object obj = this.f115734b;
        obj.getClass();
        int[] m7084B = m7084B();
        for (int i6 = 0; i6 <= i; i6++) {
            int m27447c = C44398lG7.m27447c(obj, i6);
            while (m27447c != 0) {
                int i7 = m27447c - 1;
                int i8 = m7084B[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int m27447c2 = C44398lG7.m27447c(m27446d, i10);
                C44398lG7.m27445e(m27446d, i10, m27447c);
                m7084B[i7] = ((~i5) & i9) | (m27447c2 & i5);
                m27447c = i8 & i;
            }
        }
        this.f115734b = m27446d;
        m7085A(i5);
        return i5;
    }

    /* renamed from: z */
    public final Object m7058z(Object obj) {
        if (m7065s()) {
            return f115733k;
        }
        int m7061w = m7061w();
        Object obj2 = this.f115734b;
        obj2.getClass();
        int m27448b = C44398lG7.m27448b(obj, null, m7061w, obj2, m7084B(), m7083a(), null);
        if (m27448b == -1) {
            return f115733k;
        }
        Object obj3 = m7082b()[m27448b];
        m7066r(m27448b, m7061w);
        this.f115739g--;
        m7068p();
        return obj3;
    }

    public C50910wF7(int i) {
        m7067q(12);
    }
}
