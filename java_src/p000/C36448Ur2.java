package p000;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
/* renamed from: Ur2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36448Ur2<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: j */
    public static final Comparator<Comparable> f38118j = new C8466a();

    /* renamed from: b */
    public final Comparator<? super K> f38119b;

    /* renamed from: c */
    public final boolean f38120c;

    /* renamed from: d */
    public C8472e<K, V> f38121d;

    /* renamed from: e */
    public int f38122e;

    /* renamed from: f */
    public int f38123f;

    /* renamed from: g */
    public final C8472e<K, V> f38124g;

    /* renamed from: h */
    public C36448Ur2<K, V>.C8467b f38125h;

    /* renamed from: i */
    public C36448Ur2<K, V>.C8469c f38126i;

    /* renamed from: Ur2$a */
    /* loaded from: classes6.dex */
    public class C8466a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: Ur2$b */
    /* loaded from: classes6.dex */
    public class C8467b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: Ur2$b$a */
        /* loaded from: classes6.dex */
        public class C8468a extends C36448Ur2<K, V>.AbstractC8471d<Map.Entry<K, V>> {
            public C8468a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return m80745a();
            }
        }

        public C8467b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C36448Ur2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C36448Ur2.this.m80755c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C8468a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            C8472e<K, V> m80755c;
            if (!(obj instanceof Map.Entry) || (m80755c = C36448Ur2.this.m80755c((Map.Entry) obj)) == null) {
                return false;
            }
            C36448Ur2.this.m80752f(m80755c, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C36448Ur2.this.f38122e;
        }
    }

    /* renamed from: Ur2$c */
    /* loaded from: classes6.dex */
    public final class C8469c extends AbstractSet<K> {

        /* renamed from: Ur2$c$a */
        /* loaded from: classes6.dex */
        public class C8470a extends C36448Ur2<K, V>.AbstractC8471d<K> {
            public C8470a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return m80745a().f38140g;
            }
        }

        public C8469c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C36448Ur2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C36448Ur2.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C8470a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return C36448Ur2.this.m80751g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C36448Ur2.this.f38122e;
        }
    }

    /* renamed from: Ur2$d */
    /* loaded from: classes6.dex */
    public abstract class AbstractC8471d<T> implements Iterator<T> {

        /* renamed from: b */
        public C8472e<K, V> f38131b;

        /* renamed from: c */
        public C8472e<K, V> f38132c = null;

        /* renamed from: d */
        public int f38133d;

        public AbstractC8471d() {
            this.f38131b = C36448Ur2.this.f38124g.f38138e;
            this.f38133d = C36448Ur2.this.f38123f;
        }

        /* renamed from: a */
        public final C8472e<K, V> m80745a() {
            C8472e<K, V> c8472e = this.f38131b;
            C36448Ur2 c36448Ur2 = C36448Ur2.this;
            if (c8472e != c36448Ur2.f38124g) {
                if (c36448Ur2.f38123f == this.f38133d) {
                    this.f38131b = c8472e.f38138e;
                    this.f38132c = c8472e;
                    return c8472e;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f38131b != C36448Ur2.this.f38124g;
        }

        @Override // java.util.Iterator
        public final void remove() {
            C8472e<K, V> c8472e = this.f38132c;
            if (c8472e != null) {
                C36448Ur2.this.m80752f(c8472e, true);
                this.f38132c = null;
                this.f38133d = C36448Ur2.this.f38123f;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C36448Ur2() {
        this(f38118j, true);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* renamed from: a */
    public final boolean m80757a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    /* renamed from: b */
    public C8472e<K, V> m80756b(K k, boolean z) {
        int i;
        C8472e<K, V> c8472e;
        Comparable comparable;
        C8472e<K, V> c8472e2;
        Comparator<? super K> comparator = this.f38119b;
        C8472e<K, V> c8472e3 = this.f38121d;
        if (c8472e3 != null) {
            if (comparator == f38118j) {
                comparable = (Comparable) k;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(c8472e3.f38140g);
                } else {
                    i = comparator.compare(k, (K) c8472e3.f38140g);
                }
                if (i == 0) {
                    return c8472e3;
                }
                if (i < 0) {
                    c8472e2 = c8472e3.f38136c;
                } else {
                    c8472e2 = c8472e3.f38137d;
                }
                if (c8472e2 == null) {
                    break;
                }
                c8472e3 = c8472e2;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C8472e<K, V> c8472e4 = this.f38124g;
        if (c8472e3 == null) {
            if (comparator == f38118j && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            c8472e = new C8472e<>(this.f38120c, c8472e3, k, c8472e4, c8472e4.f38139f);
            this.f38121d = c8472e;
        } else {
            c8472e = new C8472e<>(this.f38120c, c8472e3, k, c8472e4, c8472e4.f38139f);
            if (i < 0) {
                c8472e3.f38136c = c8472e;
            } else {
                c8472e3.f38137d = c8472e;
            }
            m80753e(c8472e3, true);
        }
        this.f38122e++;
        this.f38123f++;
        return c8472e;
    }

    /* renamed from: c */
    public C8472e<K, V> m80755c(Map.Entry<?, ?> entry) {
        boolean z;
        C8472e<K, V> m80754d = m80754d(entry.getKey());
        if (m80754d != null && m80757a(m80754d.f38142i, entry.getValue())) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        return m80754d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f38121d = null;
        this.f38122e = 0;
        this.f38123f++;
        C8472e<K, V> c8472e = this.f38124g;
        c8472e.f38139f = c8472e;
        c8472e.f38138e = c8472e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m80754d(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public C8472e<K, V> m80754d(Object obj) {
        if (obj != 0) {
            try {
                return m80756b(obj, false);
            } catch (ClassCastException unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m80753e(C8472e<K, V> c8472e, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (c8472e != null) {
            C8472e<K, V> c8472e2 = c8472e.f38136c;
            C8472e<K, V> c8472e3 = c8472e.f38137d;
            int i5 = 0;
            if (c8472e2 != null) {
                i = c8472e2.f38143j;
            } else {
                i = 0;
            }
            if (c8472e3 != null) {
                i2 = c8472e3.f38143j;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                C8472e<K, V> c8472e4 = c8472e3.f38136c;
                C8472e<K, V> c8472e5 = c8472e3.f38137d;
                if (c8472e5 != null) {
                    i4 = c8472e5.f38143j;
                } else {
                    i4 = 0;
                }
                if (c8472e4 != null) {
                    i5 = c8472e4.f38143j;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    m80748j(c8472e3);
                    m80749i(c8472e);
                } else {
                    m80749i(c8472e);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                C8472e<K, V> c8472e6 = c8472e2.f38136c;
                C8472e<K, V> c8472e7 = c8472e2.f38137d;
                if (c8472e7 != null) {
                    i3 = c8472e7.f38143j;
                } else {
                    i3 = 0;
                }
                if (c8472e6 != null) {
                    i5 = c8472e6.f38143j;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    m80749i(c8472e2);
                    m80748j(c8472e);
                } else {
                    m80748j(c8472e);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                c8472e.f38143j = i + 1;
                if (z) {
                    return;
                }
            } else {
                c8472e.f38143j = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            c8472e = c8472e.f38135b;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C36448Ur2<K, V>.C8467b c8467b = this.f38125h;
        if (c8467b == null) {
            C36448Ur2<K, V>.C8467b c8467b2 = new C8467b();
            this.f38125h = c8467b2;
            return c8467b2;
        }
        return c8467b;
    }

    /* renamed from: f */
    public void m80752f(C8472e<K, V> c8472e, boolean z) {
        C8472e<K, V> m80744a;
        int i;
        if (z) {
            C8472e<K, V> c8472e2 = c8472e.f38139f;
            c8472e2.f38138e = c8472e.f38138e;
            c8472e.f38138e.f38139f = c8472e2;
        }
        C8472e<K, V> c8472e3 = c8472e.f38136c;
        C8472e<K, V> c8472e4 = c8472e.f38137d;
        C8472e<K, V> c8472e5 = c8472e.f38135b;
        int i2 = 0;
        if (c8472e3 != null && c8472e4 != null) {
            if (c8472e3.f38143j > c8472e4.f38143j) {
                m80744a = c8472e3.m80743b();
            } else {
                m80744a = c8472e4.m80744a();
            }
            m80752f(m80744a, false);
            C8472e<K, V> c8472e6 = c8472e.f38136c;
            if (c8472e6 != null) {
                i = c8472e6.f38143j;
                m80744a.f38136c = c8472e6;
                c8472e6.f38135b = m80744a;
                c8472e.f38136c = null;
            } else {
                i = 0;
            }
            C8472e<K, V> c8472e7 = c8472e.f38137d;
            if (c8472e7 != null) {
                i2 = c8472e7.f38143j;
                m80744a.f38137d = c8472e7;
                c8472e7.f38135b = m80744a;
                c8472e.f38137d = null;
            }
            m80744a.f38143j = Math.max(i, i2) + 1;
            m80750h(c8472e, m80744a);
            return;
        }
        if (c8472e3 != null) {
            m80750h(c8472e, c8472e3);
            c8472e.f38136c = null;
        } else if (c8472e4 != null) {
            m80750h(c8472e, c8472e4);
            c8472e.f38137d = null;
        } else {
            m80750h(c8472e, null);
        }
        m80753e(c8472e5, false);
        this.f38122e--;
        this.f38123f++;
    }

    /* renamed from: g */
    public C8472e<K, V> m80751g(Object obj) {
        C8472e<K, V> m80754d = m80754d(obj);
        if (m80754d != null) {
            m80752f(m80754d, true);
        }
        return m80754d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        C8472e<K, V> m80754d = m80754d(obj);
        if (m80754d != null) {
            return m80754d.f38142i;
        }
        return null;
    }

    /* renamed from: h */
    public final void m80750h(C8472e<K, V> c8472e, C8472e<K, V> c8472e2) {
        C8472e<K, V> c8472e3 = c8472e.f38135b;
        c8472e.f38135b = null;
        if (c8472e2 != null) {
            c8472e2.f38135b = c8472e3;
        }
        if (c8472e3 != null) {
            if (c8472e3.f38136c == c8472e) {
                c8472e3.f38136c = c8472e2;
                return;
            } else {
                c8472e3.f38137d = c8472e2;
                return;
            }
        }
        this.f38121d = c8472e2;
    }

    /* renamed from: i */
    public final void m80749i(C8472e<K, V> c8472e) {
        int i;
        int i2;
        C8472e<K, V> c8472e2 = c8472e.f38136c;
        C8472e<K, V> c8472e3 = c8472e.f38137d;
        C8472e<K, V> c8472e4 = c8472e3.f38136c;
        C8472e<K, V> c8472e5 = c8472e3.f38137d;
        c8472e.f38137d = c8472e4;
        if (c8472e4 != null) {
            c8472e4.f38135b = c8472e;
        }
        m80750h(c8472e, c8472e3);
        c8472e3.f38136c = c8472e;
        c8472e.f38135b = c8472e3;
        int i3 = 0;
        if (c8472e2 != null) {
            i = c8472e2.f38143j;
        } else {
            i = 0;
        }
        if (c8472e4 != null) {
            i2 = c8472e4.f38143j;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        c8472e.f38143j = max;
        if (c8472e5 != null) {
            i3 = c8472e5.f38143j;
        }
        c8472e3.f38143j = Math.max(max, i3) + 1;
    }

    /* renamed from: j */
    public final void m80748j(C8472e<K, V> c8472e) {
        int i;
        int i2;
        C8472e<K, V> c8472e2 = c8472e.f38136c;
        C8472e<K, V> c8472e3 = c8472e.f38137d;
        C8472e<K, V> c8472e4 = c8472e2.f38136c;
        C8472e<K, V> c8472e5 = c8472e2.f38137d;
        c8472e.f38136c = c8472e5;
        if (c8472e5 != null) {
            c8472e5.f38135b = c8472e;
        }
        m80750h(c8472e, c8472e2);
        c8472e2.f38137d = c8472e;
        c8472e.f38135b = c8472e2;
        int i3 = 0;
        if (c8472e3 != null) {
            i = c8472e3.f38143j;
        } else {
            i = 0;
        }
        if (c8472e5 != null) {
            i2 = c8472e5.f38143j;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        c8472e.f38143j = max;
        if (c8472e4 != null) {
            i3 = c8472e4.f38143j;
        }
        c8472e2.f38143j = Math.max(max, i3) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C36448Ur2<K, V>.C8469c c8469c = this.f38126i;
        if (c8469c == null) {
            C36448Ur2<K, V>.C8469c c8469c2 = new C8469c();
            this.f38126i = c8469c2;
            return c8469c2;
        }
        return c8469c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k != null) {
            if (v == null && !this.f38120c) {
                throw new NullPointerException("value == null");
            }
            C8472e<K, V> m80756b = m80756b(k, true);
            V v2 = m80756b.f38142i;
            m80756b.f38142i = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        C8472e<K, V> m80751g = m80751g(obj);
        if (m80751g != null) {
            return m80751g.f38142i;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f38122e;
    }

    public C36448Ur2(boolean z) {
        this(f38118j, z);
    }

    public C36448Ur2(Comparator<? super K> comparator, boolean z) {
        this.f38122e = 0;
        this.f38123f = 0;
        this.f38119b = comparator == null ? f38118j : comparator;
        this.f38120c = z;
        this.f38124g = new C8472e<>(z);
    }

    /* renamed from: Ur2$e */
    /* loaded from: classes6.dex */
    public static final class C8472e<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        public C8472e<K, V> f38135b;

        /* renamed from: c */
        public C8472e<K, V> f38136c;

        /* renamed from: d */
        public C8472e<K, V> f38137d;

        /* renamed from: e */
        public C8472e<K, V> f38138e;

        /* renamed from: f */
        public C8472e<K, V> f38139f;

        /* renamed from: g */
        public final K f38140g;

        /* renamed from: h */
        public final boolean f38141h;

        /* renamed from: i */
        public V f38142i;

        /* renamed from: j */
        public int f38143j;

        public C8472e(boolean z) {
            this.f38140g = null;
            this.f38141h = z;
            this.f38139f = this;
            this.f38138e = this;
        }

        /* renamed from: a */
        public C8472e<K, V> m80744a() {
            C8472e<K, V> c8472e = this;
            for (C8472e<K, V> c8472e2 = this.f38136c; c8472e2 != null; c8472e2 = c8472e2.f38136c) {
                c8472e = c8472e2;
            }
            return c8472e;
        }

        /* renamed from: b */
        public C8472e<K, V> m80743b() {
            C8472e<K, V> c8472e = this;
            for (C8472e<K, V> c8472e2 = this.f38137d; c8472e2 != null; c8472e2 = c8472e2.f38137d) {
                c8472e = c8472e2;
            }
            return c8472e;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f38140g;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.f38142i;
            if (v == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f38140g;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f38142i;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            K k = this.f38140g;
            int i = 0;
            if (k == null) {
                hashCode = 0;
            } else {
                hashCode = k.hashCode();
            }
            V v = this.f38142i;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (v == null && !this.f38141h) {
                throw new NullPointerException("value == null");
            }
            V v2 = this.f38142i;
            this.f38142i = v;
            return v2;
        }

        public String toString() {
            return this.f38140g + "=" + this.f38142i;
        }

        public C8472e(boolean z, C8472e<K, V> c8472e, K k, C8472e<K, V> c8472e2, C8472e<K, V> c8472e3) {
            this.f38135b = c8472e;
            this.f38140g = k;
            this.f38141h = z;
            this.f38143j = 1;
            this.f38138e = c8472e2;
            this.f38139f = c8472e3;
            c8472e3.f38138e = this;
            c8472e2.f38139f = this;
        }
    }
}
