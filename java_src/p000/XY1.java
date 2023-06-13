package p000;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import p000.QY1;
/* renamed from: XY1 */
/* loaded from: classes6.dex */
public abstract class XY1<K, V> implements Map<K, V>, Serializable {

    /* renamed from: e */
    public static final Map.Entry<?, ?>[] f43378e = new Map.Entry[0];

    /* renamed from: b */
    public transient AbstractC38616bZ1<Map.Entry<K, V>> f43379b;

    /* renamed from: c */
    public transient AbstractC38616bZ1<K> f43380c;

    /* renamed from: d */
    public transient QY1<V> f43381d;

    /* renamed from: XY1$a */
    /* loaded from: classes6.dex */
    public static class C9426a<K, V> {

        /* renamed from: a */
        public Comparator<? super V> f43382a;

        /* renamed from: b */
        public Object[] f43383b;

        /* renamed from: c */
        public int f43384c;

        /* renamed from: d */
        public boolean f43385d;

        /* renamed from: e */
        public C9427a f43386e;

        /* renamed from: XY1$a$a */
        /* loaded from: classes6.dex */
        public static final class C9427a {

            /* renamed from: a */
            public final Object f43387a;

            /* renamed from: b */
            public final Object f43388b;

            /* renamed from: c */
            public final Object f43389c;

            public C9427a(Object obj, Object obj2, Object obj3) {
                this.f43387a = obj;
                this.f43388b = obj2;
                this.f43389c = obj3;
            }

            /* renamed from: a */
            public IllegalArgumentException m76870a() {
                String valueOf = String.valueOf(this.f43387a);
                String valueOf2 = String.valueOf(this.f43388b);
                String valueOf3 = String.valueOf(this.f43387a);
                String valueOf4 = String.valueOf(this.f43389c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(valueOf);
                sb.append("=");
                sb.append(valueOf2);
                sb.append(" and ");
                sb.append(valueOf3);
                sb.append("=");
                sb.append(valueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public C9426a() {
            this(4);
        }

        /* renamed from: i */
        public static <V> void m76871i(Object[] objArr, int i, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i];
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 2;
                Object obj = objArr[i3];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i3 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i2] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i, AbstractC53114zy3.m60a(comparator).m56e(C37907aM2.m71542t()));
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 * 2;
                objArr[i5] = entryArr[i4].getKey();
                objArr[i5 + 1] = entryArr[i4].getValue();
            }
        }

        /* renamed from: a */
        public XY1<K, V> m76879a() {
            return m76877c();
        }

        /* renamed from: b */
        public final XY1<K, V> m76878b(boolean z) {
            Object[] objArr;
            C9427a c9427a;
            C9427a c9427a2;
            if (z && (c9427a2 = this.f43386e) != null) {
                throw c9427a2.m76870a();
            }
            int i = this.f43384c;
            if (this.f43382a == null) {
                objArr = this.f43383b;
            } else {
                if (this.f43385d) {
                    this.f43383b = Arrays.copyOf(this.f43383b, i * 2);
                }
                objArr = this.f43383b;
                if (!z) {
                    objArr = m76875e(objArr, this.f43384c);
                    if (objArr.length < this.f43383b.length) {
                        i = objArr.length >>> 1;
                    }
                }
                m76871i(objArr, i, this.f43382a);
            }
            this.f43385d = true;
            C35532Qt4 m87661j = C35532Qt4.m87661j(i, objArr, this);
            if (z && (c9427a = this.f43386e) != null) {
                throw c9427a.m76870a();
            }
            return m87661j;
        }

        /* renamed from: c */
        public XY1<K, V> m76877c() {
            return m76878b(true);
        }

        /* renamed from: d */
        public final void m76876d(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f43383b;
            if (i2 > objArr.length) {
                this.f43383b = Arrays.copyOf(objArr, QY1.AbstractC6798b.m88413c(objArr.length, i2));
                this.f43385d = false;
            }
        }

        /* renamed from: e */
        public final Object[] m76875e(Object[] objArr, int i) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                Object obj = objArr[i2 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i2);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i - bitSet.cardinality()) * 2];
            int i3 = 0;
            int i4 = 0;
            while (i3 < i * 2) {
                if (bitSet.get(i3 >>> 1)) {
                    i3 += 2;
                } else {
                    int i5 = i4 + 1;
                    int i6 = i3 + 1;
                    Object obj2 = objArr[i3];
                    Objects.requireNonNull(obj2);
                    objArr2[i4] = obj2;
                    i4 = i5 + 1;
                    i3 = i6 + 1;
                    Object obj3 = objArr[i6];
                    Objects.requireNonNull(obj3);
                    objArr2[i5] = obj3;
                }
            }
            return objArr2;
        }

        /* renamed from: f */
        public C9426a<K, V> m76874f(K k, V v) {
            m76876d(this.f43384c + 1);
            C39948dm0.m43734a(k, v);
            Object[] objArr = this.f43383b;
            int i = this.f43384c;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.f43384c = i + 1;
            return this;
        }

        /* renamed from: g */
        public C9426a<K, V> m76873g(Map.Entry<? extends K, ? extends V> entry) {
            return m76874f(entry.getKey(), entry.getValue());
        }

        /* renamed from: h */
        public C9426a<K, V> m76872h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m76876d(this.f43384c + ((Collection) iterable).size());
            }
            for (Map.Entry<? extends K, ? extends V> entry : iterable) {
                m76873g(entry);
            }
            return this;
        }

        public C9426a(int i) {
            this.f43383b = new Object[i * 2];
            this.f43384c = 0;
            this.f43385d = false;
        }
    }

    /* renamed from: XY1$b */
    /* loaded from: classes6.dex */
    public static class C9428b<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        public final Object f43390b;

        /* renamed from: c */
        public final Object f43391c;

        public C9428b(XY1<K, V> xy1) {
            Object[] objArr = new Object[xy1.size()];
            Object[] objArr2 = new Object[xy1.size()];
            AbstractC48175re6<Map.Entry<K, V>> it = xy1.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.f43390b = objArr;
            this.f43391c = objArr2;
        }

        /* renamed from: a */
        public final Object m76869a() {
            Object[] objArr = (Object[]) this.f43390b;
            Object[] objArr2 = (Object[]) this.f43391c;
            C9426a<K, V> m76868b = m76868b(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                m76868b.m76874f((K) objArr[i], (V) objArr2[i]);
            }
            return m76868b.m76877c();
        }

        /* renamed from: b */
        public C9426a<K, V> m76868b(int i) {
            return new C9426a<>(i);
        }

        public final Object readResolve() {
            Object obj = this.f43390b;
            if (!(obj instanceof AbstractC38616bZ1)) {
                return m76869a();
            }
            AbstractC38616bZ1 abstractC38616bZ1 = (AbstractC38616bZ1) obj;
            C9426a<K, V> m76868b = m76868b(abstractC38616bZ1.size());
            AbstractC48175re6 it = abstractC38616bZ1.iterator();
            AbstractC48175re6 it2 = ((QY1) this.f43391c).iterator();
            while (it.hasNext()) {
                m76868b.m76874f((K) it.next(), (V) it2.next());
            }
            return m76868b.m76877c();
        }
    }

    /* renamed from: a */
    public static <K, V> C9426a<K, V> m76888a() {
        return new C9426a<>();
    }

    /* renamed from: b */
    public static <K, V> XY1<K, V> m76887b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        int i;
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        } else {
            i = 4;
        }
        C9426a c9426a = new C9426a(i);
        c9426a.m76872h(iterable);
        return c9426a.m76879a();
    }

    /* renamed from: h */
    public static <K, V> XY1<K, V> m76881h() {
        return (XY1<K, V>) C35532Qt4.f31125i;
    }

    /* renamed from: c */
    public abstract AbstractC38616bZ1<Map.Entry<K, V>> mo76886c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: d */
    public abstract AbstractC38616bZ1<K> mo76885d();

    /* renamed from: e */
    public abstract QY1<V> mo76884e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return C37907aM2.m71558d(this, obj);
    }

    @Override // java.util.Map
    /* renamed from: f */
    public AbstractC38616bZ1<Map.Entry<K, V>> entrySet() {
        AbstractC38616bZ1<Map.Entry<K, V>> abstractC38616bZ1 = this.f43379b;
        if (abstractC38616bZ1 == null) {
            AbstractC38616bZ1<Map.Entry<K, V>> mo76886c = mo76886c();
            this.f43379b = mo76886c;
            return mo76886c;
        }
        return abstractC38616bZ1;
    }

    @Override // java.util.Map
    /* renamed from: g */
    public AbstractC38616bZ1<K> keySet() {
        AbstractC38616bZ1<K> abstractC38616bZ1 = this.f43380c;
        if (abstractC38616bZ1 == null) {
            AbstractC38616bZ1<K> mo76885d = mo76885d();
            this.f43380c = mo76885d;
            return mo76885d;
        }
        return abstractC38616bZ1;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public int hashCode() {
        return C40052dw5.m43491d(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i */
    public QY1<V> values() {
        QY1<V> qy1 = this.f43381d;
        if (qy1 == null) {
            QY1<V> mo76884e = mo76884e();
            this.f43381d = mo76884e;
            return mo76884e;
        }
        return qy1;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return C37907aM2.m71546p(this);
    }

    public Object writeReplace() {
        return new C9428b(this);
    }
}
