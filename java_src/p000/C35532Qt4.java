package p000;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.UByte;
import kotlin.UShort;
import p000.XY1;
/* renamed from: Qt4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35532Qt4<K, V> extends XY1<K, V> {

    /* renamed from: i */
    public static final XY1<Object, Object> f31125i = new C35532Qt4(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: f */
    public final transient Object f31126f;

    /* renamed from: g */
    public final transient Object[] f31127g;

    /* renamed from: h */
    public final transient int f31128h;

    /* renamed from: Qt4$a */
    /* loaded from: classes6.dex */
    public static class C6969a<K, V> extends AbstractC38616bZ1<Map.Entry<K, V>> {

        /* renamed from: d */
        public final transient XY1<K, V> f31129d;

        /* renamed from: e */
        public final transient Object[] f31130e;

        /* renamed from: f */
        public final transient int f31131f;

        /* renamed from: g */
        public final transient int f31132g;

        /* renamed from: Qt4$a$a */
        /* loaded from: classes6.dex */
        public class C6970a extends VY1<Map.Entry<K, V>> {
            public C6970a() {
            }

            @Override // java.util.List
            /* renamed from: Q */
            public Map.Entry<K, V> get(int i) {
                EZ3.m108803l(i, C6969a.this.f31132g);
                int i2 = i * 2;
                Object obj = C6969a.this.f31130e[C6969a.this.f31131f + i2];
                Objects.requireNonNull(obj);
                Object obj2 = C6969a.this.f31130e[i2 + (C6969a.this.f31131f ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // p000.QY1
            /* renamed from: h */
            public boolean mo9378h() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return C6969a.this.f31132g;
            }
        }

        public C6969a(XY1<K, V> xy1, Object[] objArr, int i, int i2) {
            this.f31129d = xy1;
            this.f31130e = objArr;
            this.f31131f = i;
            this.f31132g = i2;
        }

        @Override // p000.QY1
        /* renamed from: b */
        public int mo9381b(Object[] objArr, int i) {
            return mo10675a().mo9381b(objArr, i);
        }

        @Override // p000.QY1, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f31129d.get(key))) {
                return false;
            }
            return true;
        }

        @Override // p000.QY1
        /* renamed from: h */
        public boolean mo9378h() {
            return true;
        }

        @Override // p000.AbstractC38616bZ1, p000.QY1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: j */
        public AbstractC48175re6<Map.Entry<K, V>> iterator() {
            return mo10675a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f31132g;
        }

        @Override // p000.AbstractC38616bZ1
        /* renamed from: y */
        public VY1<Map.Entry<K, V>> mo9379y() {
            return new C6970a();
        }
    }

    /* renamed from: Qt4$b */
    /* loaded from: classes6.dex */
    public static final class C6971b<K> extends AbstractC38616bZ1<K> {

        /* renamed from: d */
        public final transient XY1<K, ?> f31134d;

        /* renamed from: e */
        public final transient VY1<K> f31135e;

        public C6971b(XY1<K, ?> xy1, VY1<K> vy1) {
            this.f31134d = xy1;
            this.f31135e = vy1;
        }

        @Override // p000.AbstractC38616bZ1, p000.QY1
        /* renamed from: a */
        public VY1<K> mo10675a() {
            return this.f31135e;
        }

        @Override // p000.QY1
        /* renamed from: b */
        public int mo9381b(Object[] objArr, int i) {
            return mo10675a().mo9381b(objArr, i);
        }

        @Override // p000.QY1, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f31134d.get(obj) != null;
        }

        @Override // p000.QY1
        /* renamed from: h */
        public boolean mo9378h() {
            return true;
        }

        @Override // p000.AbstractC38616bZ1, p000.QY1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: j */
        public AbstractC48175re6<K> iterator() {
            return mo10675a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f31134d.size();
        }
    }

    /* renamed from: Qt4$c */
    /* loaded from: classes6.dex */
    public static final class C6972c extends VY1<Object> {

        /* renamed from: d */
        public final transient Object[] f31136d;

        /* renamed from: e */
        public final transient int f31137e;

        /* renamed from: f */
        public final transient int f31138f;

        public C6972c(Object[] objArr, int i, int i2) {
            this.f31136d = objArr;
            this.f31137e = i;
            this.f31138f = i2;
        }

        @Override // java.util.List
        public Object get(int i) {
            EZ3.m108803l(i, this.f31138f);
            Object obj = this.f31136d[(i * 2) + this.f31137e];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // p000.QY1
        /* renamed from: h */
        public boolean mo9378h() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f31138f;
        }
    }

    public C35532Qt4(Object obj, Object[] objArr, int i) {
        this.f31126f = obj;
        this.f31127g = objArr;
        this.f31128h = i;
    }

    /* renamed from: j */
    public static <K, V> C35532Qt4<K, V> m87661j(int i, Object[] objArr, XY1.C9426a<K, V> c9426a) {
        if (i == 0) {
            return (C35532Qt4) f31125i;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            C39948dm0.m43734a(obj, obj2);
            return new C35532Qt4<>(null, objArr, 1);
        }
        EZ3.m108798q(i, objArr.length >> 1);
        Object m87660k = m87660k(objArr, i, AbstractC38616bZ1.m64361u(i), 0);
        if (m87660k instanceof Object[]) {
            Object[] objArr2 = (Object[]) m87660k;
            XY1.C9426a.C9427a c9427a = (XY1.C9426a.C9427a) objArr2[2];
            if (c9426a != null) {
                c9426a.f43386e = c9427a;
                Object obj3 = objArr2[0];
                int intValue = ((Integer) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, intValue * 2);
                m87660k = obj3;
                i = intValue;
            } else {
                throw c9427a.m76870a();
            }
        }
        return new C35532Qt4<>(m87660k, objArr, i);
    }

    /* renamed from: k */
    public static Object m87660k(Object[] objArr, int i, int i2, int i3) {
        XY1.C9426a.C9427a c9427a = null;
        if (i == 1) {
            Object obj = objArr[i3];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i3 ^ 1];
            Objects.requireNonNull(obj2);
            C39948dm0.m43734a(obj, obj2);
            return null;
        }
        int i4 = i2 - 1;
        int i5 = -1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                int i8 = (i7 * 2) + i3;
                int i9 = (i6 * 2) + i3;
                Object obj3 = objArr[i8];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i8 ^ 1];
                Objects.requireNonNull(obj4);
                C39948dm0.m43734a(obj3, obj4);
                int m7052b = C50922wH1.m7052b(obj3.hashCode());
                while (true) {
                    int i10 = m7052b & i4;
                    int i11 = bArr[i10] & UByte.MAX_VALUE;
                    if (i11 == 255) {
                        bArr[i10] = (byte) i9;
                        if (i6 < i7) {
                            objArr[i9] = obj3;
                            objArr[i9 ^ 1] = obj4;
                        }
                        i6++;
                    } else if (obj3.equals(objArr[i11])) {
                        int i12 = i11 ^ 1;
                        Object obj5 = objArr[i12];
                        Objects.requireNonNull(obj5);
                        c9427a = new XY1.C9426a.C9427a(obj3, obj4, obj5);
                        objArr[i12] = obj4;
                        break;
                    } else {
                        m7052b = i10 + 1;
                    }
                }
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), c9427a};
        } else if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i; i14++) {
                int i15 = (i14 * 2) + i3;
                int i16 = (i13 * 2) + i3;
                Object obj6 = objArr[i15];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i15 ^ 1];
                Objects.requireNonNull(obj7);
                C39948dm0.m43734a(obj6, obj7);
                int m7052b2 = C50922wH1.m7052b(obj6.hashCode());
                while (true) {
                    int i17 = m7052b2 & i4;
                    int i18 = sArr[i17] & UShort.MAX_VALUE;
                    if (i18 == 65535) {
                        sArr[i17] = (short) i16;
                        if (i13 < i14) {
                            objArr[i16] = obj6;
                            objArr[i16 ^ 1] = obj7;
                        }
                        i13++;
                    } else if (obj6.equals(objArr[i18])) {
                        int i19 = i18 ^ 1;
                        Object obj8 = objArr[i19];
                        Objects.requireNonNull(obj8);
                        c9427a = new XY1.C9426a.C9427a(obj6, obj7, obj8);
                        objArr[i19] = obj7;
                        break;
                    } else {
                        m7052b2 = i17 + 1;
                    }
                }
            }
            return i13 == i ? sArr : new Object[]{sArr, Integer.valueOf(i13), c9427a};
        } else {
            int[] iArr = new int[i2];
            Arrays.fill(iArr, -1);
            int i20 = 0;
            int i21 = 0;
            while (i20 < i) {
                int i22 = (i20 * 2) + i3;
                int i23 = (i21 * 2) + i3;
                Object obj9 = objArr[i22];
                Objects.requireNonNull(obj9);
                Object obj10 = objArr[i22 ^ 1];
                Objects.requireNonNull(obj10);
                C39948dm0.m43734a(obj9, obj10);
                int m7052b3 = C50922wH1.m7052b(obj9.hashCode());
                while (true) {
                    int i24 = m7052b3 & i4;
                    int i25 = iArr[i24];
                    if (i25 == i5) {
                        iArr[i24] = i23;
                        if (i21 < i20) {
                            objArr[i23] = obj9;
                            objArr[i23 ^ 1] = obj10;
                        }
                        i21++;
                    } else if (obj9.equals(objArr[i25])) {
                        int i26 = i25 ^ 1;
                        Object obj11 = objArr[i26];
                        Objects.requireNonNull(obj11);
                        c9427a = new XY1.C9426a.C9427a(obj9, obj10, obj11);
                        objArr[i26] = obj10;
                        break;
                    } else {
                        m7052b3 = i24 + 1;
                        i5 = -1;
                    }
                }
                i20++;
                i5 = -1;
            }
            return i21 == i ? iArr : new Object[]{iArr, Integer.valueOf(i21), c9427a};
        }
    }

    /* renamed from: l */
    public static Object m87659l(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int m7052b = C50922wH1.m7052b(obj2.hashCode());
                while (true) {
                    int i3 = m7052b & length;
                    int i4 = bArr[i3] & UByte.MAX_VALUE;
                    if (i4 == 255) {
                        return null;
                    }
                    if (obj2.equals(objArr[i4])) {
                        return objArr[i4 ^ 1];
                    }
                    m7052b = i3 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int m7052b2 = C50922wH1.m7052b(obj2.hashCode());
                while (true) {
                    int i5 = m7052b2 & length2;
                    int i6 = sArr[i5] & UShort.MAX_VALUE;
                    if (i6 == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[i6])) {
                        return objArr[i6 ^ 1];
                    }
                    m7052b2 = i5 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int m7052b3 = C50922wH1.m7052b(obj2.hashCode());
                while (true) {
                    int i7 = m7052b3 & length3;
                    int i8 = iArr[i7];
                    if (i8 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i8])) {
                        return objArr[i8 ^ 1];
                    }
                    m7052b3 = i7 + 1;
                }
            }
        }
    }

    @Override // p000.XY1
    /* renamed from: c */
    public AbstractC38616bZ1<Map.Entry<K, V>> mo76886c() {
        return new C6969a(this, this.f31127g, 0, this.f31128h);
    }

    @Override // p000.XY1
    /* renamed from: d */
    public AbstractC38616bZ1<K> mo76885d() {
        return new C6971b(this, new C6972c(this.f31127g, 0, this.f31128h));
    }

    @Override // p000.XY1
    /* renamed from: e */
    public QY1<V> mo76884e() {
        return new C6972c(this.f31127g, 1, this.f31128h);
    }

    @Override // p000.XY1, java.util.Map
    public V get(Object obj) {
        V v = (V) m87659l(this.f31126f, this.f31127g, this.f31128h, 0, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // java.util.Map
    public int size() {
        return this.f31128h;
    }
}
