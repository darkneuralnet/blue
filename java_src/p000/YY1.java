package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p000.C37630Zs5;
import p000.InterfaceC45139mX2;
/* renamed from: YY1 */
/* loaded from: classes6.dex */
public abstract class YY1<K, V> extends AbstractC25127kB<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: g */
    public final transient XY1<K, ? extends QY1<V>> f45995g;

    /* renamed from: h */
    public final transient int f45996h;

    /* renamed from: YY1$a */
    /* loaded from: classes6.dex */
    public class C9805a extends AbstractC48175re6<Map.Entry<K, V>> {

        /* renamed from: b */
        public final Iterator<? extends Map.Entry<K, ? extends QY1<V>>> f45997b;

        /* renamed from: c */
        public K f45998c = null;

        /* renamed from: d */
        public Iterator<V> f45999d = C52933zg2.m591g();

        public C9805a() {
            this.f45997b = YY1.this.f45995g.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (!this.f45999d.hasNext()) {
                Map.Entry<K, ? extends QY1<V>> next = this.f45997b.next();
                this.f45998c = next.getKey();
                this.f45999d = next.getValue().iterator();
            }
            K k = this.f45998c;
            Objects.requireNonNull(k);
            return C37907aM2.m71555g(k, this.f45999d.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f45999d.hasNext() || this.f45997b.hasNext();
        }
    }

    /* renamed from: YY1$b */
    /* loaded from: classes6.dex */
    public class C9806b extends AbstractC48175re6<V> {

        /* renamed from: b */
        public Iterator<? extends QY1<V>> f46001b;

        /* renamed from: c */
        public Iterator<V> f46002c = C52933zg2.m591g();

        public C9806b() {
            this.f46001b = YY1.this.f45995g.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f46002c.hasNext() || this.f46001b.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f46002c.hasNext()) {
                this.f46002c = this.f46001b.next().iterator();
            }
            return this.f46002c.next();
        }
    }

    /* renamed from: YY1$c */
    /* loaded from: classes6.dex */
    public static class C9807c<K, V> {

        /* renamed from: a */
        public final Map<K, Collection<V>> f46004a = C49865uV3.m10205f();

        /* renamed from: b */
        public Comparator<? super K> f46005b;

        /* renamed from: c */
        public Comparator<? super V> f46006c;

        /* renamed from: a */
        public Collection<V> mo44125a() {
            return new ArrayList();
        }

        /* renamed from: b */
        public C9807c<K, V> mo44124b(K k, V v) {
            C39948dm0.m43734a(k, v);
            Collection<V> collection = this.f46004a.get(k);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f46004a;
                Collection<V> mo44125a = mo44125a();
                map.put(k, mo44125a);
                collection = mo44125a;
            }
            collection.add(v);
            return this;
        }

        /* renamed from: c */
        public C9807c<K, V> m74900c(Map.Entry<? extends K, ? extends V> entry) {
            return mo44124b(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: YY1$d */
    /* loaded from: classes6.dex */
    public static class C9808d<K, V> extends QY1<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;

        /* renamed from: c */
        public final YY1<K, V> f46007c;

        public C9808d(YY1<K, V> yy1) {
            this.f46007c = yy1;
        }

        @Override // p000.QY1, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return this.f46007c.mo39188g(entry.getKey(), entry.getValue());
            }
            return false;
        }

        @Override // p000.QY1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: j */
        public AbstractC48175re6<Map.Entry<K, V>> iterator() {
            return this.f46007c.mo74912m();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f46007c.size();
        }
    }

    /* renamed from: YY1$e */
    /* loaded from: classes6.dex */
    public static class C9809e {

        /* renamed from: a */
        public static final C37630Zs5.C10426b<YY1> f46008a = C37630Zs5.m72363a(YY1.class, "map");

        /* renamed from: b */
        public static final C37630Zs5.C10426b<YY1> f46009b = C37630Zs5.m72363a(YY1.class, "size");
    }

    /* renamed from: YY1$f */
    /* loaded from: classes6.dex */
    public class C9810f extends ZY1<K> {
        public C9810f() {
        }

        @Override // p000.ZY1, p000.QY1, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return YY1.this.containsKey(obj);
        }

        @Override // p000.InterfaceC45139mX2
        /* renamed from: d3 */
        public int mo20918d3(Object obj) {
            QY1<V> qy1 = YY1.this.f45995g.get(obj);
            if (qy1 == null) {
                return 0;
            }
            return qy1.size();
        }

        @Override // p000.QY1
        /* renamed from: h */
        public boolean mo9378h() {
            return true;
        }

        @Override // p000.ZY1, p000.InterfaceC45139mX2
        /* renamed from: s */
        public AbstractC38616bZ1<K> mo25465F2() {
            return YY1.this.keySet();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, p000.InterfaceC45139mX2
        public int size() {
            return YY1.this.size();
        }

        @Override // p000.ZY1
        /* renamed from: v */
        public InterfaceC45139mX2.InterfaceC26111a<K> mo72966v(int i) {
            Map.Entry<K, ? extends QY1<V>> entry = YY1.this.f45995g.entrySet().mo10675a().get(i);
            return C46325oX2.m20931g(entry.getKey(), entry.getValue().size());
        }

        @Override // p000.ZY1, p000.QY1
        public Object writeReplace() {
            return new C9811g(YY1.this);
        }
    }

    /* renamed from: YY1$g */
    /* loaded from: classes6.dex */
    public static final class C9811g implements Serializable {

        /* renamed from: b */
        public final YY1<?, ?> f46011b;

        public C9811g(YY1<?, ?> yy1) {
            this.f46011b = yy1;
        }

        public Object readResolve() {
            return this.f46011b.mo39190d();
        }
    }

    /* renamed from: YY1$h */
    /* loaded from: classes6.dex */
    public static final class C9812h<K, V> extends QY1<V> {
        private static final long serialVersionUID = 0;

        /* renamed from: c */
        public final transient YY1<K, V> f46012c;

        public C9812h(YY1<K, V> yy1) {
            this.f46012c = yy1;
        }

        @Override // p000.QY1
        /* renamed from: b */
        public int mo9381b(Object[] objArr, int i) {
            AbstractC48175re6<? extends QY1<V>> it = this.f46012c.f45995g.values().iterator();
            while (it.hasNext()) {
                i = it.next().mo9381b(objArr, i);
            }
            return i;
        }

        @Override // p000.QY1, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f46012c.containsValue(obj);
        }

        @Override // p000.QY1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: j */
        public AbstractC48175re6<V> iterator() {
            return this.f46012c.mo74911n();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f46012c.size();
        }
    }

    public YY1(XY1<K, ? extends QY1<V>> xy1, int i) {
        this.f45995g = xy1;
        this.f45996h = i;
    }

    @Override // p000.InterfaceC41581gX2
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.InterfaceC41581gX2
    public boolean containsKey(Object obj) {
        return this.f45995g.containsKey(obj);
    }

    @Override // p000.AbstractC9263X0, p000.InterfaceC41581gX2
    public boolean containsValue(Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // p000.AbstractC9263X0, p000.InterfaceC41581gX2
    @Deprecated
    /* renamed from: e */
    public final boolean mo39189e(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.AbstractC9263X0
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p000.AbstractC9263X0, p000.InterfaceC41581gX2
    /* renamed from: g */
    public /* bridge */ /* synthetic */ boolean mo39188g(Object obj, Object obj2) {
        return super.mo39188g(obj, obj2);
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: h */
    public Map<K, Collection<V>> mo30368h() {
        throw new AssertionError("should never be called");
    }

    @Override // p000.AbstractC9263X0
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: j */
    public Set<K> mo30367j() {
        throw new AssertionError("unreachable");
    }

    @Override // p000.AbstractC9263X0, p000.InterfaceC41581gX2
    /* renamed from: p */
    public XY1<K, Collection<V>> mo24583f() {
        return (XY1<K, ? extends QY1<V>>) this.f45995g;
    }

    @Override // p000.AbstractC9263X0, p000.InterfaceC41581gX2
    @Deprecated
    public final boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: q */
    public QY1<Map.Entry<K, V>> mo74915i() {
        return new C9808d(this);
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: r */
    public ZY1<K> mo74914k() {
        return new C9810f();
    }

    @Override // p000.AbstractC9263X0, p000.InterfaceC41581gX2
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: s */
    public QY1<V> mo74913l() {
        return new C9812h(this);
    }

    @Override // p000.InterfaceC41581gX2
    public int size() {
        return this.f45996h;
    }

    @Override // p000.AbstractC9263X0, p000.InterfaceC41581gX2
    /* renamed from: t */
    public QY1<Map.Entry<K, V>> mo24584b() {
        return (QY1) super.mo24584b();
    }

    @Override // p000.AbstractC9263X0
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: u */
    public AbstractC48175re6<Map.Entry<K, V>> mo74912m() {
        return new C9805a();
    }

    @Override // p000.InterfaceC41581gX2
    /* renamed from: v */
    public abstract QY1<V> get(K k);

    @Override // p000.AbstractC9263X0, p000.InterfaceC41581gX2
    /* renamed from: w */
    public AbstractC38616bZ1<K> keySet() {
        return this.f45995g.keySet();
    }

    @Override // p000.AbstractC9263X0, p000.InterfaceC41581gX2
    /* renamed from: x */
    public ZY1<K> mo39190d() {
        return (ZY1) super.mo39190d();
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: y */
    public AbstractC48175re6<V> mo74911n() {
        return new C9806b();
    }

    /* renamed from: z */
    public QY1<V> m74902z() {
        return (QY1) super.m77565o();
    }
}
