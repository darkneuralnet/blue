package p000;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* renamed from: zN7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52761zN7 extends AbstractMap implements Serializable {

    /* renamed from: k */
    public static final Object f121259k = new Object();

    /* renamed from: b */
    public transient Object f121260b;

    /* renamed from: c */
    public transient int[] f121261c;

    /* renamed from: d */
    public transient Object[] f121262d;

    /* renamed from: e */
    public transient Object[] f121263e;

    /* renamed from: f */
    public transient int f121264f;

    /* renamed from: g */
    public transient int f121265g;

    /* renamed from: h */
    public transient Set f121266h;

    /* renamed from: i */
    public transient Set f121267i;

    /* renamed from: j */
    public transient Collection f121268j;

    public C52761zN7() {
        m1446m(3);
    }

    /* renamed from: h */
    public static /* synthetic */ Object m1451h(C52761zN7 c52761zN7) {
        Object obj = c52761zN7.f121260b;
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (m1444o()) {
            return;
        }
        m1447l();
        Map m1449j = m1449j();
        if (m1449j == null) {
            Object[] objArr = this.f121262d;
            objArr.getClass();
            Arrays.fill(objArr, 0, this.f121265g, (Object) null);
            Object[] objArr2 = this.f121263e;
            objArr2.getClass();
            Arrays.fill(objArr2, 0, this.f121265g, (Object) null);
            Object obj = this.f121260b;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            int[] iArr = this.f121261c;
            iArr.getClass();
            Arrays.fill(iArr, 0, this.f121265g, 0);
            this.f121265g = 0;
            return;
        }
        this.f121264f = HZ7.m103727a(size(), 3, 1073741823);
        m1449j.clear();
        this.f121260b = null;
        this.f121265g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map m1449j = m1449j();
        if (m1449j != null) {
            return m1449j.containsKey(obj);
        }
        if (m1442q(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map m1449j = m1449j();
        if (m1449j == null) {
            for (int i = 0; i < this.f121265g; i++) {
                Object[] objArr = this.f121263e;
                objArr.getClass();
                if (C31998Bq7.m113442a(obj, objArr[i])) {
                    return true;
                }
            }
            return false;
        }
        return m1449j.containsValue(obj);
    }

    /* renamed from: e */
    public final int m1454e() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f121267i;
        if (set == null) {
            EL7 el7 = new EL7(this);
            this.f121267i = el7;
            return el7;
        }
        return set;
    }

    /* renamed from: f */
    public final int m1453f(int i) {
        int i2 = i + 1;
        if (i2 < this.f121265g) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map m1449j = m1449j();
        if (m1449j != null) {
            return m1449j.get(obj);
        }
        int m1442q = m1442q(obj);
        if (m1442q == -1) {
            return null;
        }
        Object[] objArr = this.f121263e;
        objArr.getClass();
        return objArr[m1442q];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public final Map m1449j() {
        Object obj = this.f121260b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f121266h;
        if (set == null) {
            CM7 cm7 = new CM7(this);
            this.f121266h = cm7;
            return cm7;
        }
        return set;
    }

    /* renamed from: l */
    public final void m1447l() {
        this.f121264f += 32;
    }

    /* renamed from: m */
    public final void m1446m(int i) {
        this.f121264f = HZ7.m103727a(12, 1, 1073741823);
    }

    /* renamed from: n */
    public final void m1445n(int i, int i2) {
        Object obj = this.f121260b;
        obj.getClass();
        int[] iArr = this.f121261c;
        iArr.getClass();
        Object[] objArr = this.f121262d;
        objArr.getClass();
        Object[] objArr2 = this.f121263e;
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
            int m44309a = C39727dO7.m44309a(obj2) & i2;
            int m92359c = ON7.m92359c(obj, m44309a);
            int i3 = size + 1;
            if (m92359c == i3) {
                ON7.m92357e(obj, m44309a, i + 1);
                return;
            }
            while (true) {
                int i4 = m92359c - 1;
                int i5 = iArr[i4];
                int i6 = i5 & i2;
                if (i6 != i3) {
                    m92359c = i6;
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
    public final boolean m1444o() {
        return this.f121260b == null;
    }

    /* renamed from: p */
    public final int m1443p() {
        return (1 << (this.f121264f & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (m1444o()) {
            C34833Nt7.m93210d(m1444o(), "Arrays already allocated");
            int i = this.f121264f;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f121260b = ON7.m92358d(max2);
            m1439t(max2 - 1);
            this.f121261c = new int[i];
            this.f121262d = new Object[i];
            this.f121263e = new Object[i];
        }
        Map m1449j = m1449j();
        if (m1449j == null) {
            int[] iArr = this.f121261c;
            iArr.getClass();
            Object[] objArr = this.f121262d;
            objArr.getClass();
            Object[] objArr2 = this.f121263e;
            objArr2.getClass();
            int i2 = this.f121265g;
            int i3 = i2 + 1;
            int m44309a = C39727dO7.m44309a(obj);
            int m1443p = m1443p();
            int i4 = m44309a & m1443p;
            Object obj3 = this.f121260b;
            obj3.getClass();
            int m92359c = ON7.m92359c(obj3, i4);
            if (m92359c == 0) {
                if (i3 > m1443p) {
                    m1443p = m1441r(m1443p, ON7.m92361a(m1443p), m44309a, i2);
                } else {
                    Object obj4 = this.f121260b;
                    obj4.getClass();
                    ON7.m92357e(obj4, i4, i3);
                }
            } else {
                int i5 = ~m1443p;
                int i6 = m44309a & i5;
                int i7 = 0;
                while (true) {
                    int i8 = m92359c - 1;
                    int i9 = iArr[i8];
                    int i10 = i9 & i5;
                    if (i10 == i6 && C31998Bq7.m113442a(obj, objArr[i8])) {
                        Object obj5 = objArr2[i8];
                        objArr2[i8] = obj2;
                        return obj5;
                    }
                    int i11 = i9 & m1443p;
                    i7++;
                    if (i11 == 0) {
                        if (i7 >= 9) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(m1443p() + 1, 1.0f);
                            int m1454e = m1454e();
                            while (m1454e >= 0) {
                                Object[] objArr3 = this.f121262d;
                                objArr3.getClass();
                                Object obj6 = objArr3[m1454e];
                                Object[] objArr4 = this.f121263e;
                                objArr4.getClass();
                                linkedHashMap.put(obj6, objArr4[m1454e]);
                                m1454e = m1453f(m1454e);
                            }
                            this.f121260b = linkedHashMap;
                            this.f121261c = null;
                            this.f121262d = null;
                            this.f121263e = null;
                            m1447l();
                            return linkedHashMap.put(obj, obj2);
                        } else if (i3 > m1443p) {
                            m1443p = m1441r(m1443p, ON7.m92361a(m1443p), m44309a, i2);
                        } else {
                            iArr[i8] = (i3 & m1443p) | i10;
                        }
                    } else {
                        m92359c = i11;
                    }
                }
            }
            int[] iArr2 = this.f121261c;
            iArr2.getClass();
            int length = iArr2.length;
            if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
                int[] iArr3 = this.f121261c;
                iArr3.getClass();
                this.f121261c = Arrays.copyOf(iArr3, min);
                Object[] objArr5 = this.f121262d;
                objArr5.getClass();
                this.f121262d = Arrays.copyOf(objArr5, min);
                Object[] objArr6 = this.f121263e;
                objArr6.getClass();
                this.f121263e = Arrays.copyOf(objArr6, min);
            }
            int[] iArr4 = this.f121261c;
            iArr4.getClass();
            iArr4[i2] = (~m1443p) & m44309a;
            Object[] objArr7 = this.f121262d;
            objArr7.getClass();
            objArr7[i2] = obj;
            Object[] objArr8 = this.f121263e;
            objArr8.getClass();
            objArr8[i2] = obj2;
            this.f121265g = i3;
            m1447l();
            return null;
        }
        return m1449j.put(obj, obj2);
    }

    /* renamed from: q */
    public final int m1442q(Object obj) {
        if (m1444o()) {
            return -1;
        }
        int m44309a = C39727dO7.m44309a(obj);
        int m1443p = m1443p();
        Object obj2 = this.f121260b;
        obj2.getClass();
        int m92359c = ON7.m92359c(obj2, m44309a & m1443p);
        if (m92359c == 0) {
            return -1;
        }
        int i = ~m1443p;
        int i2 = m44309a & i;
        do {
            int i3 = m92359c - 1;
            int[] iArr = this.f121261c;
            iArr.getClass();
            int i4 = iArr[i3];
            if ((i4 & i) == i2) {
                Object[] objArr = this.f121262d;
                objArr.getClass();
                if (C31998Bq7.m113442a(obj, objArr[i3])) {
                    return i3;
                }
            }
            m92359c = i4 & m1443p;
        } while (m92359c != 0);
        return -1;
    }

    /* renamed from: r */
    public final int m1441r(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object m92358d = ON7.m92358d(i2);
        if (i4 != 0) {
            ON7.m92357e(m92358d, i3 & i5, i4 + 1);
        }
        Object obj = this.f121260b;
        obj.getClass();
        int[] iArr = this.f121261c;
        iArr.getClass();
        for (int i6 = 0; i6 <= i; i6++) {
            int m92359c = ON7.m92359c(obj, i6);
            while (m92359c != 0) {
                int i7 = m92359c - 1;
                int i8 = iArr[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int m92359c2 = ON7.m92359c(m92358d, i10);
                ON7.m92357e(m92358d, i10, m92359c);
                iArr[i7] = ((~i5) & i9) | (m92359c2 & i5);
                m92359c = i8 & i;
            }
        }
        this.f121260b = m92358d;
        m1439t(i5);
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map m1449j = m1449j();
        if (m1449j != null) {
            return m1449j.remove(obj);
        }
        Object m1440s = m1440s(obj);
        if (m1440s == f121259k) {
            return null;
        }
        return m1440s;
    }

    /* renamed from: s */
    public final Object m1440s(Object obj) {
        if (m1444o()) {
            return f121259k;
        }
        int m1443p = m1443p();
        Object obj2 = this.f121260b;
        obj2.getClass();
        int[] iArr = this.f121261c;
        iArr.getClass();
        Object[] objArr = this.f121262d;
        objArr.getClass();
        int m92360b = ON7.m92360b(obj, null, m1443p, obj2, iArr, objArr, null);
        if (m92360b == -1) {
            return f121259k;
        }
        Object[] objArr2 = this.f121263e;
        objArr2.getClass();
        Object obj3 = objArr2[m92360b];
        m1445n(m92360b, m1443p);
        this.f121265g--;
        m1447l();
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map m1449j = m1449j();
        if (m1449j != null) {
            return m1449j.size();
        }
        return this.f121265g;
    }

    /* renamed from: t */
    public final void m1439t(int i) {
        this.f121264f = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f121264f & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f121268j;
        if (collection == null) {
            C43275jN7 c43275jN7 = new C43275jN7(this);
            this.f121268j = c43275jN7;
            return c43275jN7;
        }
        return collection;
    }

    public C52761zN7(int i) {
        m1446m(12);
    }
}
