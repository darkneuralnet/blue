package p000;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: kF7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43796kF7 extends AbstractMap implements Serializable {

    /* renamed from: k */
    public static final Object f94162k = new Object();

    /* renamed from: b */
    public transient Object f94163b;

    /* renamed from: c */
    public transient int[] f94164c;

    /* renamed from: d */
    public transient Object[] f94165d;

    /* renamed from: e */
    public transient Object[] f94166e;

    /* renamed from: f */
    public transient int f94167f;

    /* renamed from: g */
    public transient int f94168g;

    /* renamed from: h */
    public transient Set f94169h;

    /* renamed from: i */
    public transient Set f94170i;

    /* renamed from: j */
    public transient Collection f94171j;

    public C43796kF7() {
        m29123m(3);
    }

    /* renamed from: h */
    public static /* synthetic */ Object m29128h(C43796kF7 c43796kF7) {
        Object obj = c43796kF7.f94163b;
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m29121o()) {
            return;
        }
        m29124l();
        Map m29126j = m29126j();
        if (m29126j == null) {
            Object[] objArr = this.f94165d;
            objArr.getClass();
            Arrays.fill(objArr, 0, this.f94168g, (Object) null);
            Object[] objArr2 = this.f94166e;
            objArr2.getClass();
            Arrays.fill(objArr2, 0, this.f94168g, (Object) null);
            Object obj = this.f94163b;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            int[] iArr = this.f94164c;
            iArr.getClass();
            Arrays.fill(iArr, 0, this.f94168g, 0);
            this.f94168g = 0;
            return;
        }
        this.f94167f = C39188cW7.m61254a(size(), 3, 1073741823);
        m29126j.clear();
        this.f94163b = null;
        this.f94168g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map m29126j = m29126j();
        if (m29126j != null) {
            return m29126j.containsKey(obj);
        }
        if (m29119q(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map m29126j = m29126j();
        if (m29126j == null) {
            for (int i = 0; i < this.f94168g; i++) {
                Object[] objArr = this.f94166e;
                objArr.getClass();
                if (C42418hv9.m35483a(obj, objArr[i])) {
                    return true;
                }
            }
            return false;
        }
        return m29126j.containsValue(obj);
    }

    /* renamed from: e */
    public final int m29131e() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f94170i;
        if (set == null) {
            C44235kz7 c44235kz7 = new C44235kz7(this);
            this.f94170i = c44235kz7;
            return c44235kz7;
        }
        return set;
    }

    /* renamed from: f */
    public final int m29130f(int i) {
        int i2 = i + 1;
        if (i2 < this.f94168g) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map m29126j = m29126j();
        if (m29126j != null) {
            return m29126j.get(obj);
        }
        int m29119q = m29119q(obj);
        if (m29119q == -1) {
            return null;
        }
        Object[] objArr = this.f94166e;
        objArr.getClass();
        return objArr[m29119q];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public final Map m29126j() {
        Object obj = this.f94163b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f94169h;
        if (set == null) {
            RC7 rc7 = new RC7(this);
            this.f94169h = rc7;
            return rc7;
        }
        return set;
    }

    /* renamed from: l */
    public final void m29124l() {
        this.f94167f += 32;
    }

    /* renamed from: m */
    public final void m29123m(int i) {
        this.f94167f = C39188cW7.m61254a(12, 1, 1073741823);
    }

    /* renamed from: n */
    public final void m29122n(int i, int i2) {
        Object obj = this.f94163b;
        obj.getClass();
        int[] iArr = this.f94164c;
        iArr.getClass();
        Object[] objArr = this.f94165d;
        objArr.getClass();
        Object[] objArr2 = this.f94166e;
        objArr2.getClass();
        int size = size() - 1;
        if (i < size) {
            Object obj2 = objArr[size];
            objArr[i] = obj2;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            iArr[i] = iArr[size];
            iArr[size] = 0;
            int m86996a = RG7.m86996a(obj2) & i2;
            int m71714c = C37858aG7.m71714c(obj, m86996a);
            int i3 = size + 1;
            if (m71714c == i3) {
                C37858aG7.m71712e(obj, m86996a, i + 1);
                return;
            }
            while (true) {
                int i4 = m71714c - 1;
                int i5 = iArr[i4];
                int i6 = i5 & i2;
                if (i6 != i3) {
                    m71714c = i6;
                } else {
                    iArr[i4] = ((i + 1) & i2) | (i5 & (~i2));
                    return;
                }
            }
        } else {
            objArr[i] = null;
            objArr2[i] = null;
            iArr[i] = 0;
        }
    }

    /* renamed from: o */
    public final boolean m29121o() {
        return this.f94163b == null;
    }

    /* renamed from: p */
    public final int m29120p() {
        return (1 << (this.f94167f & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (m29121o()) {
            C31899Bf7.m113726d(m29121o(), "Arrays already allocated");
            int i = this.f94167f;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f94163b = C37858aG7.m71713d(max2);
            m29116t(max2 - 1);
            this.f94164c = new int[i];
            this.f94165d = new Object[i];
            this.f94166e = new Object[i];
        }
        Map m29126j = m29126j();
        if (m29126j == null) {
            int[] iArr = this.f94164c;
            iArr.getClass();
            Object[] objArr = this.f94165d;
            objArr.getClass();
            Object[] objArr2 = this.f94166e;
            objArr2.getClass();
            int i2 = this.f94168g;
            int i3 = i2 + 1;
            int m86996a = RG7.m86996a(obj);
            int m29120p = m29120p();
            int i4 = m86996a & m29120p;
            Object obj3 = this.f94163b;
            obj3.getClass();
            int m71714c = C37858aG7.m71714c(obj3, i4);
            if (m71714c == 0) {
                if (i3 > m29120p) {
                    m29120p = m29118r(m29120p, C37858aG7.m71716a(m29120p), m86996a, i2);
                } else {
                    Object obj4 = this.f94163b;
                    obj4.getClass();
                    C37858aG7.m71712e(obj4, i4, i3);
                }
            } else {
                int i5 = ~m29120p;
                int i6 = m86996a & i5;
                int i7 = 0;
                while (true) {
                    int i8 = m71714c - 1;
                    int i9 = iArr[i8];
                    int i10 = i9 & i5;
                    if (i10 == i6 && C42418hv9.m35483a(obj, objArr[i8])) {
                        Object obj5 = objArr2[i8];
                        objArr2[i8] = obj2;
                        return obj5;
                    }
                    int i11 = i9 & m29120p;
                    i7++;
                    if (i11 == 0) {
                        if (i7 >= 9) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(m29120p() + 1, 1.0f);
                            int m29131e = m29131e();
                            while (m29131e >= 0) {
                                Object[] objArr3 = this.f94165d;
                                objArr3.getClass();
                                Object obj6 = objArr3[m29131e];
                                Object[] objArr4 = this.f94166e;
                                objArr4.getClass();
                                linkedHashMap.put(obj6, objArr4[m29131e]);
                                m29131e = m29130f(m29131e);
                            }
                            this.f94163b = linkedHashMap;
                            this.f94164c = null;
                            this.f94165d = null;
                            this.f94166e = null;
                            m29124l();
                            return linkedHashMap.put(obj, obj2);
                        } else if (i3 > m29120p) {
                            m29120p = m29118r(m29120p, C37858aG7.m71716a(m29120p), m86996a, i2);
                        } else {
                            iArr[i8] = (i3 & m29120p) | i10;
                        }
                    } else {
                        m71714c = i11;
                    }
                }
            }
            int[] iArr2 = this.f94164c;
            iArr2.getClass();
            int length = iArr2.length;
            if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
                int[] iArr3 = this.f94164c;
                iArr3.getClass();
                this.f94164c = Arrays.copyOf(iArr3, min);
                Object[] objArr5 = this.f94165d;
                objArr5.getClass();
                this.f94165d = Arrays.copyOf(objArr5, min);
                Object[] objArr6 = this.f94166e;
                objArr6.getClass();
                this.f94166e = Arrays.copyOf(objArr6, min);
            }
            int[] iArr4 = this.f94164c;
            iArr4.getClass();
            iArr4[i2] = (~m29120p) & m86996a;
            Object[] objArr7 = this.f94165d;
            objArr7.getClass();
            objArr7[i2] = obj;
            Object[] objArr8 = this.f94166e;
            objArr8.getClass();
            objArr8[i2] = obj2;
            this.f94168g = i3;
            m29124l();
            return null;
        }
        return m29126j.put(obj, obj2);
    }

    /* renamed from: q */
    public final int m29119q(Object obj) {
        if (m29121o()) {
            return -1;
        }
        int m86996a = RG7.m86996a(obj);
        int m29120p = m29120p();
        Object obj2 = this.f94163b;
        obj2.getClass();
        int m71714c = C37858aG7.m71714c(obj2, m86996a & m29120p);
        if (m71714c == 0) {
            return -1;
        }
        int i = ~m29120p;
        int i2 = m86996a & i;
        do {
            int i3 = m71714c - 1;
            int[] iArr = this.f94164c;
            iArr.getClass();
            int i4 = iArr[i3];
            if ((i4 & i) == i2) {
                Object[] objArr = this.f94165d;
                objArr.getClass();
                if (C42418hv9.m35483a(obj, objArr[i3])) {
                    return i3;
                }
            }
            m71714c = i4 & m29120p;
        } while (m71714c != 0);
        return -1;
    }

    /* renamed from: r */
    public final int m29118r(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object m71713d = C37858aG7.m71713d(i2);
        if (i4 != 0) {
            C37858aG7.m71712e(m71713d, i3 & i5, i4 + 1);
        }
        Object obj = this.f94163b;
        obj.getClass();
        int[] iArr = this.f94164c;
        iArr.getClass();
        for (int i6 = 0; i6 <= i; i6++) {
            int m71714c = C37858aG7.m71714c(obj, i6);
            while (m71714c != 0) {
                int i7 = m71714c - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int m71714c2 = C37858aG7.m71714c(m71713d, i10);
                C37858aG7.m71712e(m71713d, i10, m71714c);
                iArr[i7] = ((~i5) & i9) | (m71714c2 & i5);
                m71714c = i8 & i;
            }
        }
        this.f94163b = m71713d;
        m29116t(i5);
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map m29126j = m29126j();
        if (m29126j != null) {
            return m29126j.remove(obj);
        }
        Object m29117s = m29117s(obj);
        if (m29117s == f94162k) {
            return null;
        }
        return m29117s;
    }

    /* renamed from: s */
    public final Object m29117s(Object obj) {
        if (m29121o()) {
            return f94162k;
        }
        int m29120p = m29120p();
        Object obj2 = this.f94163b;
        obj2.getClass();
        int[] iArr = this.f94164c;
        iArr.getClass();
        Object[] objArr = this.f94165d;
        objArr.getClass();
        int m71715b = C37858aG7.m71715b(obj, null, m29120p, obj2, iArr, objArr, null);
        if (m71715b == -1) {
            return f94162k;
        }
        Object[] objArr2 = this.f94166e;
        objArr2.getClass();
        Object obj3 = objArr2[m71715b];
        m29122n(m71715b, m29120p);
        this.f94168g--;
        m29124l();
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map m29126j = m29126j();
        if (m29126j != null) {
            return m29126j.size();
        }
        return this.f94168g;
    }

    /* renamed from: t */
    public final void m29116t(int i) {
        this.f94167f = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f94167f & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f94171j;
        if (collection == null) {
            C49716uE7 c49716uE7 = new C49716uE7(this);
            this.f94171j = c49716uE7;
            return c49716uE7;
        }
        return collection;
    }

    public C43796kF7(int i) {
        m29123m(12);
    }
}
