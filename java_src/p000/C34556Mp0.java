package p000;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
/* renamed from: Mp0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C34556Mp0<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: k */
    public static final Object f23627k = new Object();

    /* renamed from: b */
    public transient Object f23628b;

    /* renamed from: c */
    public transient int[] f23629c;

    /* renamed from: d */
    public transient Object[] f23630d;

    /* renamed from: e */
    public transient Object[] f23631e;

    /* renamed from: f */
    public transient int f23632f;

    /* renamed from: g */
    public transient int f23633g;

    /* renamed from: h */
    public transient Set<K> f23634h;

    /* renamed from: i */
    public transient Set<Map.Entry<K, V>> f23635i;

    /* renamed from: j */
    public transient Collection<V> f23636j;

    /* renamed from: Mp0$a */
    /* loaded from: classes6.dex */
    public class C5387a extends C34556Mp0<K, V>.AbstractC5391e<K> {
        public C5387a() {
            super(C34556Mp0.this, null);
        }

        @Override // p000.C34556Mp0.AbstractC5391e
        /* renamed from: b */
        public K mo94712b(int i) {
            return (K) C34556Mp0.this.m94758I(i);
        }
    }

    /* renamed from: Mp0$b */
    /* loaded from: classes6.dex */
    public class C5388b extends C34556Mp0<K, V>.AbstractC5391e<Map.Entry<K, V>> {
        public C5388b() {
            super(C34556Mp0.this, null);
        }

        @Override // p000.C34556Mp0.AbstractC5391e
        /* renamed from: d */
        public Map.Entry<K, V> mo94712b(int i) {
            return new C5393g(i);
        }
    }

    /* renamed from: Mp0$c */
    /* loaded from: classes6.dex */
    public class C5389c extends C34556Mp0<K, V>.AbstractC5391e<V> {
        public C5389c() {
            super(C34556Mp0.this, null);
        }

        @Override // p000.C34556Mp0.AbstractC5391e
        /* renamed from: b */
        public V mo94712b(int i) {
            return (V) C34556Mp0.this.m94742Y(i);
        }
    }

    /* renamed from: Mp0$d */
    /* loaded from: classes6.dex */
    public class C5390d extends AbstractSet<Map.Entry<K, V>> {
        public C5390d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C34556Mp0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> m94717x = C34556Mp0.this.m94717x();
            if (m94717x != null) {
                return m94717x.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int m94761E = C34556Mp0.this.m94761E(entry.getKey());
            if (m94761E == -1 || !C37025Xd3.m76748a(C34556Mp0.this.m94742Y(m94761E), entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return C34556Mp0.this.m94715z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> m94717x = C34556Mp0.this.m94717x();
            if (m94717x != null) {
                return m94717x.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C34556Mp0.this.m94755L()) {
                return false;
            }
            int m94763C = C34556Mp0.this.m94763C();
            int m91328f = C35024Op0.m91328f(entry.getKey(), entry.getValue(), m94763C, C34556Mp0.this.m94751P(), C34556Mp0.this.m94753N(), C34556Mp0.this.m94752O(), C34556Mp0.this.m94750Q());
            if (m91328f == -1) {
                return false;
            }
            C34556Mp0.this.m94756K(m91328f, m94763C);
            C34556Mp0.m94736e(C34556Mp0.this);
            C34556Mp0.this.m94762D();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C34556Mp0.this.size();
        }
    }

    /* renamed from: Mp0$f */
    /* loaded from: classes6.dex */
    public class C5392f extends AbstractSet<K> {
        public C5392f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C34556Mp0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C34556Mp0.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return C34556Mp0.this.m94757J();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> m94717x = C34556Mp0.this.m94717x();
            if (m94717x != null) {
                return m94717x.keySet().remove(obj);
            }
            if (C34556Mp0.this.m94754M(obj) != C34556Mp0.f23627k) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C34556Mp0.this.size();
        }
    }

    /* renamed from: Mp0$g */
    /* loaded from: classes6.dex */
    public final class C5393g extends AbstractC5804O0<K, V> {

        /* renamed from: b */
        public final K f23646b;

        /* renamed from: c */
        public int f23647c;

        public C5393g(int i) {
            this.f23646b = (K) C34556Mp0.this.m94758I(i);
            this.f23647c = i;
        }

        /* renamed from: a */
        public final void m94710a() {
            int i = this.f23647c;
            if (i == -1 || i >= C34556Mp0.this.size() || !C37025Xd3.m76748a(this.f23646b, C34556Mp0.this.m94758I(this.f23647c))) {
                this.f23647c = C34556Mp0.this.m94761E(this.f23646b);
            }
        }

        @Override // p000.AbstractC5804O0, java.util.Map.Entry
        public K getKey() {
            return this.f23646b;
        }

        @Override // p000.AbstractC5804O0, java.util.Map.Entry
        public V getValue() {
            Map<K, V> m94717x = C34556Mp0.this.m94717x();
            if (m94717x != null) {
                return (V) C48162rd3.m15690a(m94717x.get(this.f23646b));
            }
            m94710a();
            int i = this.f23647c;
            if (i == -1) {
                return (V) C48162rd3.m15689b();
            }
            return (V) C34556Mp0.this.m94742Y(i);
        }

        @Override // p000.AbstractC5804O0, java.util.Map.Entry
        public V setValue(V v) {
            Map<K, V> m94717x = C34556Mp0.this.m94717x();
            if (m94717x != null) {
                return (V) C48162rd3.m15690a(m94717x.put(this.f23646b, v));
            }
            m94710a();
            int i = this.f23647c;
            if (i == -1) {
                C34556Mp0.this.put(this.f23646b, v);
                return (V) C48162rd3.m15689b();
            }
            V v2 = (V) C34556Mp0.this.m94742Y(i);
            C34556Mp0.this.m94743X(this.f23647c, v);
            return v2;
        }
    }

    /* renamed from: Mp0$h */
    /* loaded from: classes6.dex */
    public class C5394h extends AbstractCollection<V> {
        public C5394h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C34556Mp0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return C34556Mp0.this.m94741Z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C34556Mp0.this.size();
        }
    }

    public C34556Mp0() {
        m94760F(3);
    }

    /* renamed from: e */
    public static /* synthetic */ int m94736e(C34556Mp0 c34556Mp0) {
        int i = c34556Mp0.f23633g;
        c34556Mp0.f23633g = i - 1;
        return i;
    }

    /* renamed from: r */
    public static <K, V> C34556Mp0<K, V> m94723r() {
        return new C34556Mp0<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            m94760F(readInt);
            for (int i = 0; i < readInt; i++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Invalid size: ");
        sb.append(readInt);
        throw new InvalidObjectException(sb.toString());
    }

    /* renamed from: w */
    public static <K, V> C34556Mp0<K, V> m94718w(int i) {
        return new C34556Mp0<>(i);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> m94715z = m94715z();
        while (m94715z.hasNext()) {
            Map.Entry<K, V> next = m94715z.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    /* renamed from: A */
    public int m94765A() {
        return isEmpty() ? -1 : 0;
    }

    /* renamed from: B */
    public int m94764B(int i) {
        int i2 = i + 1;
        if (i2 < this.f23633g) {
            return i2;
        }
        return -1;
    }

    /* renamed from: C */
    public final int m94763C() {
        return (1 << (this.f23632f & 31)) - 1;
    }

    /* renamed from: D */
    public void m94762D() {
        this.f23632f += 32;
    }

    /* renamed from: E */
    public final int m94761E(Object obj) {
        if (m94755L()) {
            return -1;
        }
        int m7051c = C50922wH1.m7051c(obj);
        int m94763C = m94763C();
        int m91326h = C35024Op0.m91326h(m94751P(), m7051c & m94763C);
        if (m91326h == 0) {
            return -1;
        }
        int m91332b = C35024Op0.m91332b(m7051c, m94763C);
        do {
            int i = m91326h - 1;
            int m94716y = m94716y(i);
            if (C35024Op0.m91332b(m94716y, m94763C) == m91332b && C37025Xd3.m76748a(obj, m94758I(i))) {
                return i;
            }
            m91326h = C35024Op0.m91331c(m94716y, m94763C);
        } while (m91326h != 0);
        return -1;
    }

    /* renamed from: F */
    public void m94760F(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        EZ3.m108810e(z, "Expected size must be >= 0");
        this.f23632f = C41344g72.m39992a(i, 1, 1073741823);
    }

    /* renamed from: H */
    public void m94759H(int i, K k, V v, int i2, int i3) {
        m94746U(i, C35024Op0.m91330d(i2, 0, i3));
        m94744W(i, k);
        m94743X(i, v);
    }

    /* renamed from: I */
    public final K m94758I(int i) {
        return (K) m94752O()[i];
    }

    /* renamed from: J */
    public Iterator<K> m94757J() {
        Map<K, V> m94717x = m94717x();
        if (m94717x != null) {
            return m94717x.keySet().iterator();
        }
        return new C5387a();
    }

    /* renamed from: K */
    public void m94756K(int i, int i2) {
        Object m94751P = m94751P();
        int[] m94753N = m94753N();
        Object[] m94752O = m94752O();
        Object[] m94750Q = m94750Q();
        int size = size() - 1;
        if (i < size) {
            Object obj = m94752O[size];
            m94752O[i] = obj;
            m94750Q[i] = m94750Q[size];
            m94752O[size] = null;
            m94750Q[size] = null;
            m94753N[i] = m94753N[size];
            m94753N[size] = 0;
            int m7051c = C50922wH1.m7051c(obj) & i2;
            int m91326h = C35024Op0.m91326h(m94751P, m7051c);
            int i3 = size + 1;
            if (m91326h == i3) {
                C35024Op0.m91325i(m94751P, m7051c, i + 1);
                return;
            }
            while (true) {
                int i4 = m91326h - 1;
                int i5 = m94753N[i4];
                int m91331c = C35024Op0.m91331c(i5, i2);
                if (m91331c == i3) {
                    m94753N[i4] = C35024Op0.m91330d(i5, i + 1, i2);
                    return;
                }
                m91326h = m91331c;
            }
        } else {
            m94752O[i] = null;
            m94750Q[i] = null;
            m94753N[i] = 0;
        }
    }

    /* renamed from: L */
    public boolean m94755L() {
        return this.f23628b == null;
    }

    /* renamed from: M */
    public final Object m94754M(Object obj) {
        if (m94755L()) {
            return f23627k;
        }
        int m94763C = m94763C();
        int m91328f = C35024Op0.m91328f(obj, null, m94763C, m94751P(), m94753N(), m94752O(), null);
        if (m91328f == -1) {
            return f23627k;
        }
        V m94742Y = m94742Y(m91328f);
        m94756K(m91328f, m94763C);
        this.f23633g--;
        m94762D();
        return m94742Y;
    }

    /* renamed from: N */
    public final int[] m94753N() {
        int[] iArr = this.f23629c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* renamed from: O */
    public final Object[] m94752O() {
        Object[] objArr = this.f23630d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* renamed from: P */
    public final Object m94751P() {
        Object obj = this.f23628b;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: Q */
    public final Object[] m94750Q() {
        Object[] objArr = this.f23631e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* renamed from: R */
    public void m94749R(int i) {
        this.f23629c = Arrays.copyOf(m94753N(), i);
        this.f23630d = Arrays.copyOf(m94752O(), i);
        this.f23631e = Arrays.copyOf(m94750Q(), i);
    }

    /* renamed from: S */
    public final void m94748S(int i) {
        int min;
        int length = m94753N().length;
        if (i > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            m94749R(min);
        }
    }

    /* renamed from: T */
    public final int m94747T(int i, int i2, int i3, int i4) {
        Object m91333a = C35024Op0.m91333a(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C35024Op0.m91325i(m91333a, i3 & i5, i4 + 1);
        }
        Object m94751P = m94751P();
        int[] m94753N = m94753N();
        for (int i6 = 0; i6 <= i; i6++) {
            int m91326h = C35024Op0.m91326h(m94751P, i6);
            while (m91326h != 0) {
                int i7 = m91326h - 1;
                int i8 = m94753N[i7];
                int m91332b = C35024Op0.m91332b(i8, i) | i6;
                int i9 = m91332b & i5;
                int m91326h2 = C35024Op0.m91326h(m91333a, i9);
                C35024Op0.m91325i(m91333a, i9, m91326h);
                m94753N[i7] = C35024Op0.m91330d(m91332b, m91326h2, i5);
                m91326h = C35024Op0.m91331c(i8, i);
            }
        }
        this.f23628b = m91333a;
        m94745V(i5);
        return i5;
    }

    /* renamed from: U */
    public final void m94746U(int i, int i2) {
        m94753N()[i] = i2;
    }

    /* renamed from: V */
    public final void m94745V(int i) {
        this.f23632f = C35024Op0.m91330d(this.f23632f, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    /* renamed from: W */
    public final void m94744W(int i, K k) {
        m94752O()[i] = k;
    }

    /* renamed from: X */
    public final void m94743X(int i, V v) {
        m94750Q()[i] = v;
    }

    /* renamed from: Y */
    public final V m94742Y(int i) {
        return (V) m94750Q()[i];
    }

    /* renamed from: Z */
    public Iterator<V> m94741Z() {
        Map<K, V> m94717x = m94717x();
        if (m94717x != null) {
            return m94717x.values().iterator();
        }
        return new C5389c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (m94755L()) {
            return;
        }
        m94762D();
        Map<K, V> m94717x = m94717x();
        if (m94717x != null) {
            this.f23632f = C41344g72.m39992a(size(), 3, 1073741823);
            m94717x.clear();
            this.f23628b = null;
            this.f23633g = 0;
            return;
        }
        Arrays.fill(m94752O(), 0, this.f23633g, (Object) null);
        Arrays.fill(m94750Q(), 0, this.f23633g, (Object) null);
        C35024Op0.m91327g(m94751P());
        Arrays.fill(m94753N(), 0, this.f23633g, 0);
        this.f23633g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> m94717x = m94717x();
        if (m94717x != null) {
            return m94717x.containsKey(obj);
        }
        if (m94761E(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> m94717x = m94717x();
        if (m94717x != null) {
            return m94717x.containsValue(obj);
        }
        for (int i = 0; i < this.f23633g; i++) {
            if (C37025Xd3.m76748a(obj, m94742Y(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f23635i;
        if (set == null) {
            Set<Map.Entry<K, V>> m94722s = m94722s();
            this.f23635i = m94722s;
            return m94722s;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> m94717x = m94717x();
        if (m94717x != null) {
            return m94717x.get(obj);
        }
        int m94761E = m94761E(obj);
        if (m94761E == -1) {
            return null;
        }
        m94727n(m94761E);
        return m94742Y(m94761E);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f23634h;
        if (set == null) {
            Set<K> m94720u = m94720u();
            this.f23634h = m94720u;
            return m94720u;
        }
        return set;
    }

    /* renamed from: n */
    public void m94727n(int i) {
    }

    /* renamed from: o */
    public int m94726o(int i, int i2) {
        return i - 1;
    }

    /* renamed from: p */
    public int m94725p() {
        EZ3.m108794u(m94755L(), "Arrays already allocated");
        int i = this.f23632f;
        int m91324j = C35024Op0.m91324j(i);
        this.f23628b = C35024Op0.m91333a(m91324j);
        m94745V(m91324j - 1);
        this.f23629c = new int[i];
        this.f23630d = new Object[i];
        this.f23631e = new Object[i];
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        int m94747T;
        int i;
        if (m94755L()) {
            m94725p();
        }
        Map<K, V> m94717x = m94717x();
        if (m94717x != null) {
            return m94717x.put(k, v);
        }
        int[] m94753N = m94753N();
        Object[] m94752O = m94752O();
        Object[] m94750Q = m94750Q();
        int i2 = this.f23633g;
        int i3 = i2 + 1;
        int m7051c = C50922wH1.m7051c(k);
        int m94763C = m94763C();
        int i4 = m7051c & m94763C;
        int m91326h = C35024Op0.m91326h(m94751P(), i4);
        if (m91326h == 0) {
            if (i3 > m94763C) {
                m94747T = m94747T(m94763C, C35024Op0.m91329e(m94763C), m7051c, i2);
                i = m94747T;
            } else {
                C35024Op0.m91325i(m94751P(), i4, i3);
                i = m94763C;
            }
        } else {
            int m91332b = C35024Op0.m91332b(m7051c, m94763C);
            int i5 = 0;
            while (true) {
                int i6 = m91326h - 1;
                int i7 = m94753N[i6];
                if (C35024Op0.m91332b(i7, m94763C) == m91332b && C37025Xd3.m76748a(k, m94752O[i6])) {
                    V v2 = (V) m94750Q[i6];
                    m94750Q[i6] = v;
                    m94727n(i6);
                    return v2;
                }
                int m91331c = C35024Op0.m91331c(i7, m94763C);
                i5++;
                if (m91331c == 0) {
                    if (i5 >= 9) {
                        return m94724q().put(k, v);
                    }
                    if (i3 > m94763C) {
                        m94747T = m94747T(m94763C, C35024Op0.m91329e(m94763C), m7051c, i2);
                    } else {
                        m94753N[i6] = C35024Op0.m91330d(i7, i3, m94763C);
                    }
                } else {
                    m91326h = m91331c;
                }
            }
        }
        m94748S(i3);
        m94759H(i2, k, v, m7051c, i);
        this.f23633g = i3;
        m94762D();
        return null;
    }

    /* renamed from: q */
    public Map<K, V> m94724q() {
        Map<K, V> m94721t = m94721t(m94763C() + 1);
        int m94765A = m94765A();
        while (m94765A >= 0) {
            m94721t.put(m94758I(m94765A), m94742Y(m94765A));
            m94765A = m94764B(m94765A);
        }
        this.f23628b = m94721t;
        this.f23629c = null;
        this.f23630d = null;
        this.f23631e = null;
        m94762D();
        return m94721t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> m94717x = m94717x();
        if (m94717x != null) {
            return m94717x.remove(obj);
        }
        V v = (V) m94754M(obj);
        if (v == f23627k) {
            return null;
        }
        return v;
    }

    /* renamed from: s */
    public Set<Map.Entry<K, V>> m94722s() {
        return new C5390d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> m94717x = m94717x();
        if (m94717x != null) {
            return m94717x.size();
        }
        return this.f23633g;
    }

    /* renamed from: t */
    public Map<K, V> m94721t(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    /* renamed from: u */
    public Set<K> m94720u() {
        return new C5392f();
    }

    /* renamed from: v */
    public Collection<V> m94719v() {
        return new C5394h();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f23636j;
        if (collection == null) {
            Collection<V> m94719v = m94719v();
            this.f23636j = m94719v;
            return m94719v;
        }
        return collection;
    }

    /* renamed from: x */
    public Map<K, V> m94717x() {
        Object obj = this.f23628b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* renamed from: y */
    public final int m94716y(int i) {
        return m94753N()[i];
    }

    /* renamed from: z */
    public Iterator<Map.Entry<K, V>> m94715z() {
        Map<K, V> m94717x = m94717x();
        if (m94717x != null) {
            return m94717x.entrySet().iterator();
        }
        return new C5388b();
    }

    public C34556Mp0(int i) {
        m94760F(i);
    }

    /* renamed from: Mp0$e */
    /* loaded from: classes6.dex */
    public abstract class AbstractC5391e<T> implements Iterator<T> {

        /* renamed from: b */
        public int f23641b;

        /* renamed from: c */
        public int f23642c;

        /* renamed from: d */
        public int f23643d;

        public AbstractC5391e() {
            this.f23641b = C34556Mp0.this.f23632f;
            this.f23642c = C34556Mp0.this.m94765A();
            this.f23643d = -1;
        }

        /* renamed from: a */
        public final void m94713a() {
            if (C34556Mp0.this.f23632f == this.f23641b) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        /* renamed from: b */
        public abstract T mo94712b(int i);

        /* renamed from: c */
        public void m94711c() {
            this.f23641b += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23642c >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            m94713a();
            if (hasNext()) {
                int i = this.f23642c;
                this.f23643d = i;
                T mo94712b = mo94712b(i);
                this.f23642c = C34556Mp0.this.m94764B(this.f23642c);
                return mo94712b;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            m94713a();
            if (this.f23643d >= 0) {
                z = true;
            } else {
                z = false;
            }
            C39948dm0.m43731d(z);
            m94711c();
            C34556Mp0 c34556Mp0 = C34556Mp0.this;
            c34556Mp0.remove(c34556Mp0.m94758I(this.f23643d));
            this.f23642c = C34556Mp0.this.m94726o(this.f23642c, this.f23643d);
            this.f23643d = -1;
        }

        public /* synthetic */ AbstractC5391e(C34556Mp0 c34556Mp0, C5387a c5387a) {
            this();
        }
    }
}
