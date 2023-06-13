package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* renamed from: ph5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C47018ph5<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b */
    public C27336c<K, V> f103932b;

    /* renamed from: c */
    public C27336c<K, V> f103933c;

    /* renamed from: d */
    public final WeakHashMap<AbstractC27339f<K, V>, Boolean> f103934d = new WeakHashMap<>();

    /* renamed from: e */
    public int f103935e = 0;

    /* renamed from: ph5$a */
    /* loaded from: classes.dex */
    public static class C27334a<K, V> extends AbstractC27338e<K, V> {
        public C27334a(C27336c<K, V> c27336c, C27336c<K, V> c27336c2) {
            super(c27336c, c27336c2);
        }

        @Override // p000.C47018ph5.AbstractC27338e
        /* renamed from: b */
        public C27336c<K, V> mo18963b(C27336c<K, V> c27336c) {
            return c27336c.f103939e;
        }

        @Override // p000.C47018ph5.AbstractC27338e
        /* renamed from: c */
        public C27336c<K, V> mo18962c(C27336c<K, V> c27336c) {
            return c27336c.f103938d;
        }
    }

    /* renamed from: ph5$b */
    /* loaded from: classes.dex */
    public static class C27335b<K, V> extends AbstractC27338e<K, V> {
        public C27335b(C27336c<K, V> c27336c, C27336c<K, V> c27336c2) {
            super(c27336c, c27336c2);
        }

        @Override // p000.C47018ph5.AbstractC27338e
        /* renamed from: b */
        public C27336c<K, V> mo18963b(C27336c<K, V> c27336c) {
            return c27336c.f103938d;
        }

        @Override // p000.C47018ph5.AbstractC27338e
        /* renamed from: c */
        public C27336c<K, V> mo18962c(C27336c<K, V> c27336c) {
            return c27336c.f103939e;
        }
    }

    /* renamed from: ph5$c */
    /* loaded from: classes.dex */
    public static class C27336c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b */
        public final K f103936b;

        /* renamed from: c */
        public final V f103937c;

        /* renamed from: d */
        public C27336c<K, V> f103938d;

        /* renamed from: e */
        public C27336c<K, V> f103939e;

        public C27336c(K k, V v) {
            this.f103936b = k;
            this.f103937c = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C27336c)) {
                return false;
            }
            C27336c c27336c = (C27336c) obj;
            if (this.f103936b.equals(c27336c.f103936b) && this.f103937c.equals(c27336c.f103937c)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f103936b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f103937c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f103936b.hashCode() ^ this.f103937c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f103936b + "=" + this.f103937c;
        }
    }

    /* renamed from: ph5$d */
    /* loaded from: classes.dex */
    public class C27337d extends AbstractC27339f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        public C27336c<K, V> f103940b;

        /* renamed from: c */
        public boolean f103941c = true;

        public C27337d() {
        }

        @Override // p000.C47018ph5.AbstractC27339f
        /* renamed from: a */
        public void mo18959a(C27336c<K, V> c27336c) {
            boolean z;
            C27336c<K, V> c27336c2 = this.f103940b;
            if (c27336c == c27336c2) {
                C27336c<K, V> c27336c3 = c27336c2.f103939e;
                this.f103940b = c27336c3;
                if (c27336c3 == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f103941c = z;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public Map.Entry<K, V> next() {
            C27336c<K, V> c27336c;
            if (this.f103941c) {
                this.f103941c = false;
                this.f103940b = C47018ph5.this.f103932b;
            } else {
                C27336c<K, V> c27336c2 = this.f103940b;
                if (c27336c2 != null) {
                    c27336c = c27336c2.f103938d;
                } else {
                    c27336c = null;
                }
                this.f103940b = c27336c;
            }
            return this.f103940b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f103941c) {
                if (C47018ph5.this.f103932b != null) {
                    return true;
                }
                return false;
            }
            C27336c<K, V> c27336c = this.f103940b;
            if (c27336c != null && c27336c.f103938d != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: ph5$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC27338e<K, V> extends AbstractC27339f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        public C27336c<K, V> f103943b;

        /* renamed from: c */
        public C27336c<K, V> f103944c;

        public AbstractC27338e(C27336c<K, V> c27336c, C27336c<K, V> c27336c2) {
            this.f103943b = c27336c2;
            this.f103944c = c27336c;
        }

        @Override // p000.C47018ph5.AbstractC27339f
        /* renamed from: a */
        public void mo18959a(C27336c<K, V> c27336c) {
            if (this.f103943b == c27336c && c27336c == this.f103944c) {
                this.f103944c = null;
                this.f103943b = null;
            }
            C27336c<K, V> c27336c2 = this.f103943b;
            if (c27336c2 == c27336c) {
                this.f103943b = mo18963b(c27336c2);
            }
            if (this.f103944c == c27336c) {
                this.f103944c = m18960e();
            }
        }

        /* renamed from: b */
        public abstract C27336c<K, V> mo18963b(C27336c<K, V> c27336c);

        /* renamed from: c */
        public abstract C27336c<K, V> mo18962c(C27336c<K, V> c27336c);

        @Override // java.util.Iterator
        /* renamed from: d */
        public Map.Entry<K, V> next() {
            C27336c<K, V> c27336c = this.f103944c;
            this.f103944c = m18960e();
            return c27336c;
        }

        /* renamed from: e */
        public final C27336c<K, V> m18960e() {
            C27336c<K, V> c27336c = this.f103944c;
            C27336c<K, V> c27336c2 = this.f103943b;
            if (c27336c != c27336c2 && c27336c2 != null) {
                return mo18962c(c27336c);
            }
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f103944c != null;
        }
    }

    /* renamed from: ph5$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC27339f<K, V> {
        /* renamed from: a */
        public abstract void mo18959a(C27336c<K, V> c27336c);
    }

    /* renamed from: a */
    public Map.Entry<K, V> m18971a() {
        return this.f103932b;
    }

    /* renamed from: b */
    public C27336c<K, V> mo18970b(K k) {
        C27336c<K, V> c27336c = this.f103932b;
        while (c27336c != null && !c27336c.f103936b.equals(k)) {
            c27336c = c27336c.f103938d;
        }
        return c27336c;
    }

    /* renamed from: c */
    public C47018ph5<K, V>.C27337d m18969c() {
        C47018ph5<K, V>.C27337d c27337d = new C27337d();
        this.f103934d.put(c27337d, Boolean.FALSE);
        return c27337d;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C27335b c27335b = new C27335b(this.f103933c, this.f103932b);
        this.f103934d.put(c27335b, Boolean.FALSE);
        return c27335b;
    }

    /* renamed from: e */
    public Map.Entry<K, V> m18968e() {
        return this.f103933c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C47018ph5)) {
            return false;
        }
        C47018ph5 c47018ph5 = (C47018ph5) obj;
        if (size() != c47018ph5.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = c47018ph5.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        if (!it.hasNext() && !it2.hasNext()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public C27336c<K, V> m18967f(K k, V v) {
        C27336c<K, V> c27336c = new C27336c<>(k, v);
        this.f103935e++;
        C27336c<K, V> c27336c2 = this.f103933c;
        if (c27336c2 == null) {
            this.f103932b = c27336c;
            this.f103933c = c27336c;
            return c27336c;
        }
        c27336c2.f103938d = c27336c;
        c27336c.f103939e = c27336c2;
        this.f103933c = c27336c;
        return c27336c;
    }

    /* renamed from: h */
    public V mo18966h(K k, V v) {
        C27336c<K, V> mo18970b = mo18970b(k);
        if (mo18970b != null) {
            return mo18970b.f103937c;
        }
        m18967f(k, v);
        return null;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        C27334a c27334a = new C27334a(this.f103932b, this.f103933c);
        this.f103934d.put(c27334a, Boolean.FALSE);
        return c27334a;
    }

    /* renamed from: j */
    public V mo18965j(K k) {
        C27336c<K, V> mo18970b = mo18970b(k);
        if (mo18970b == null) {
            return null;
        }
        this.f103935e--;
        if (!this.f103934d.isEmpty()) {
            for (AbstractC27339f<K, V> abstractC27339f : this.f103934d.keySet()) {
                abstractC27339f.mo18959a(mo18970b);
            }
        }
        C27336c<K, V> c27336c = mo18970b.f103939e;
        if (c27336c != null) {
            c27336c.f103938d = mo18970b.f103938d;
        } else {
            this.f103932b = mo18970b.f103938d;
        }
        C27336c<K, V> c27336c2 = mo18970b.f103938d;
        if (c27336c2 != null) {
            c27336c2.f103939e = c27336c;
        } else {
            this.f103933c = c27336c;
        }
        mo18970b.f103938d = null;
        mo18970b.f103939e = null;
        return mo18970b.f103937c;
    }

    public int size() {
        return this.f103935e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
