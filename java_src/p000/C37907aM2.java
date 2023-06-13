package p000;

import ch.qos.logback.core.CoreConstants;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p000.C40052dw5;
/* renamed from: aM2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37907aM2 {

    /* renamed from: aM2$a */
    /* loaded from: classes6.dex */
    public class C10638a extends AbstractC5804O0<K, V2> {

        /* renamed from: b */
        public final /* synthetic */ Map.Entry f50336b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC10648i f50337c;

        public C10638a(Map.Entry entry, InterfaceC10648i interfaceC10648i) {
            this.f50336b = entry;
            this.f50337c = interfaceC10648i;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, K] */
        @Override // p000.AbstractC5804O0, java.util.Map.Entry
        public K getKey() {
            return this.f50336b.getKey();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, V2] */
        @Override // p000.AbstractC5804O0, java.util.Map.Entry
        public V2 getValue() {
            return this.f50337c.mo71532a(this.f50336b.getKey(), this.f50336b.getValue());
        }
    }

    /* renamed from: aM2$b */
    /* loaded from: classes6.dex */
    public class C10639b implements InterfaceC50859wA1<Map.Entry<K, V1>, Map.Entry<K, V2>> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC10648i f50338b;

        public C10639b(InterfaceC10648i interfaceC10648i) {
            this.f50338b = interfaceC10648i;
        }

        @Override // p000.InterfaceC50859wA1
        /* renamed from: a */
        public Map.Entry<K, V2> apply(Map.Entry<K, V1> entry) {
            return C37907aM2.m71544r(this.f50338b, entry);
        }
    }

    /* renamed from: aM2$c */
    /* loaded from: classes6.dex */
    public class C10640c extends AbstractC50261v96<Map.Entry<K, V>, K> {
        public C10640c(Iterator it) {
            super(it);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, K] */
        @Override // p000.AbstractC50261v96
        /* renamed from: b */
        public K mo574a(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }

    /* renamed from: aM2$d */
    /* loaded from: classes6.dex */
    public class C10641d extends AbstractC50261v96<Map.Entry<K, V>, V> {
        public C10641d(Iterator it) {
            super(it);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [V, java.lang.Object] */
        @Override // p000.AbstractC50261v96
        /* renamed from: b */
        public V mo574a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* renamed from: aM2$e */
    /* loaded from: classes6.dex */
    public class C10642e implements InterfaceC10648i<K, V1, V2> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC50859wA1 f50339a;

        public C10642e(InterfaceC50859wA1 interfaceC50859wA1) {
            this.f50339a = interfaceC50859wA1;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, V2] */
        @Override // p000.C37907aM2.InterfaceC10648i
        /* renamed from: a */
        public V2 mo71532a(K k, V1 v1) {
            return this.f50339a.apply(v1);
        }
    }

    /* renamed from: aM2$f */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC10643f<K, V> extends AbstractC10661q<K, V> {

        /* renamed from: e */
        public final Map<K, V> f50340e;

        /* renamed from: f */
        public final IZ3<? super Map.Entry<K, V>> f50341f;

        public AbstractC10643f(Map<K, V> map, IZ3<? super Map.Entry<K, V>> iz3) {
            this.f50340e = map;
            this.f50341f = iz3;
        }

        @Override // p000.C37907aM2.AbstractC10661q
        /* renamed from: c */
        public Collection<V> mo71521c() {
            return new C10655l(this, this.f50340e, this.f50341f);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f50340e.containsKey(obj) && m71536d(obj, this.f50340e.get(obj));
        }

        /* renamed from: d */
        public boolean m71536d(Object obj, V v) {
            return this.f50341f.apply(C37907aM2.m71555g(obj, v));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            V v = this.f50340e.get(obj);
            if (v == null || !m71536d(obj, v)) {
                return null;
            }
            return v;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            EZ3.m108811d(m71536d(k, v));
            return this.f50340e.put(k, v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                EZ3.m108811d(m71536d(entry.getKey(), entry.getValue()));
            }
            this.f50340e.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            if (containsKey(obj)) {
                return this.f50340e.remove(obj);
            }
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: aM2$g */
    /* loaded from: classes6.dex */
    public static abstract class EnumC10644g implements InterfaceC50859wA1<Map.Entry<?, ?>, Object> {

        /* renamed from: b */
        public static final EnumC10644g f50342b = new C10645a("KEY", 0);

        /* renamed from: c */
        public static final EnumC10644g f50343c = new C10646b("VALUE", 1);

        /* renamed from: d */
        public static final /* synthetic */ EnumC10644g[] f50344d = m71535a();

        /* renamed from: aM2$g$a */
        /* loaded from: classes6.dex */
        public enum C10645a extends EnumC10644g {
            public C10645a(String str, int i) {
                super(str, i, null);
            }

            @Override // p000.InterfaceC50859wA1
            /* renamed from: b */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* renamed from: aM2$g$b */
        /* loaded from: classes6.dex */
        public enum C10646b extends EnumC10644g {
            public C10646b(String str, int i) {
                super(str, i, null);
            }

            @Override // p000.InterfaceC50859wA1
            /* renamed from: b */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        public EnumC10644g(String str, int i) {
        }

        /* renamed from: a */
        public static /* synthetic */ EnumC10644g[] m71535a() {
            return new EnumC10644g[]{f50342b, f50343c};
        }

        public static EnumC10644g valueOf(String str) {
            return (EnumC10644g) Enum.valueOf(EnumC10644g.class, str);
        }

        public static EnumC10644g[] values() {
            return (EnumC10644g[]) f50344d.clone();
        }

        public /* synthetic */ EnumC10644g(String str, int i, C10640c c10640c) {
            this(str, i);
        }
    }

    /* renamed from: aM2$h */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC10647h<K, V> extends C40052dw5.AbstractC19913d<Map.Entry<K, V>> {
        /* renamed from: a */
        public abstract Map<K, V> mo71527a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo71527a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object m71548n = C37907aM2.m71548n(mo71527a(), key);
            if (!C37025Xd3.m76748a(m71548n, entry.getValue())) {
                return false;
            }
            if (m71548n == null && !mo71527a().containsKey(key)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo71527a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return mo71527a().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // p000.C40052dw5.AbstractC19913d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) EZ3.m108801n(collection));
            } catch (UnsupportedOperationException unused) {
                return C40052dw5.m43483l(this, collection.iterator());
            }
        }

        @Override // p000.C40052dw5.AbstractC19913d, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) EZ3.m108801n(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet m43488g = C40052dw5.m43488g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        m43488g.add(((Map.Entry) obj).getKey());
                    }
                }
                return mo71527a().keySet().retainAll(m43488g);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo71527a().size();
        }
    }

    /* renamed from: aM2$i */
    /* loaded from: classes6.dex */
    public interface InterfaceC10648i<K, V1, V2> {
        /* renamed from: a */
        V2 mo71532a(K k, V1 v1);
    }

    /* renamed from: aM2$j */
    /* loaded from: classes6.dex */
    public static class C10649j<K, V> extends AbstractC10643f<K, V> {

        /* renamed from: g */
        public final Set<Map.Entry<K, V>> f50345g;

        /* renamed from: aM2$j$a */
        /* loaded from: classes6.dex */
        public class C10650a extends AbstractC34395Lx1<Map.Entry<K, V>> {

            /* renamed from: aM2$j$a$a */
            /* loaded from: classes6.dex */
            public class C10651a extends AbstractC50261v96<Map.Entry<K, V>, Map.Entry<K, V>> {

                /* renamed from: aM2$j$a$a$a */
                /* loaded from: classes6.dex */
                public class C10652a extends AbstractC33693Ix1<K, V> {

                    /* renamed from: b */
                    public final /* synthetic */ Map.Entry f50348b;

                    public C10652a(Map.Entry entry) {
                        this.f50348b = entry;
                    }

                    @Override // p000.AbstractC33693Ix1, p000.AbstractC33927Jx1
                    /* renamed from: a */
                    public Map.Entry<K, V> delegate() {
                        return this.f50348b;
                    }

                    @Override // p000.AbstractC33693Ix1, java.util.Map.Entry
                    public V setValue(V v) {
                        EZ3.m108811d(C10649j.this.m71536d(getKey(), v));
                        return (V) super.setValue(v);
                    }
                }

                public C10651a(Iterator it) {
                    super(it);
                }

                @Override // p000.AbstractC50261v96
                /* renamed from: b */
                public Map.Entry<K, V> mo574a(Map.Entry<K, V> entry) {
                    return new C10652a(entry);
                }
            }

            public C10650a() {
            }

            @Override // p000.AbstractC34395Lx1, p000.AbstractC31821Ax1, p000.AbstractC33927Jx1
            /* renamed from: a */
            public Set<Map.Entry<K, V>> delegate() {
                return C10649j.this.f50345g;
            }

            @Override // p000.AbstractC31821Ax1, java.util.Collection, java.lang.Iterable
            public Iterator<Map.Entry<K, V>> iterator() {
                return new C10651a(C10649j.this.f50345g.iterator());
            }

            public /* synthetic */ C10650a(C10649j c10649j, C10640c c10640c) {
                this();
            }
        }

        /* renamed from: aM2$j$b */
        /* loaded from: classes6.dex */
        public class C10653b extends C10658n<K, V> {
            public C10653b() {
                super(C10649j.this);
            }

            @Override // p000.C37907aM2.C10658n, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (C10649j.this.containsKey(obj)) {
                    C10649j.this.f50340e.remove(obj);
                    return true;
                }
                return false;
            }

            @Override // p000.C40052dw5.AbstractC19913d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                C10649j c10649j = C10649j.this;
                return C10649j.m71531e(c10649j.f50340e, c10649j.f50341f, collection);
            }

            @Override // p000.C40052dw5.AbstractC19913d, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                C10649j c10649j = C10649j.this;
                return C10649j.m71530f(c10649j.f50340e, c10649j.f50341f, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return C34819Ns2.m93253i(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) C34819Ns2.m93253i(iterator()).toArray(tArr);
            }
        }

        public C10649j(Map<K, V> map, IZ3<? super Map.Entry<K, V>> iz3) {
            super(map, iz3);
            this.f50345g = C40052dw5.m43493b(map.entrySet(), this.f50341f);
        }

        /* renamed from: e */
        public static <K, V> boolean m71531e(Map<K, V> map, IZ3<? super Map.Entry<K, V>> iz3, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (iz3.apply(next) && collection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        /* renamed from: f */
        public static <K, V> boolean m71530f(Map<K, V> map, IZ3<? super Map.Entry<K, V>> iz3, Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (iz3.apply(next) && !collection.contains(next.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // p000.C37907aM2.AbstractC10661q
        /* renamed from: a */
        public Set<Map.Entry<K, V>> mo71523a() {
            return new C10650a(this, null);
        }

        @Override // p000.C37907aM2.AbstractC10661q
        /* renamed from: b */
        public Set<K> mo71522b() {
            return new C10653b();
        }
    }

    /* renamed from: aM2$k */
    /* loaded from: classes6.dex */
    public static class C10654k<K, V> extends AbstractC10643f<K, V> {

        /* renamed from: g */
        public final IZ3<? super K> f50351g;

        public C10654k(Map<K, V> map, IZ3<? super K> iz3, IZ3<? super Map.Entry<K, V>> iz32) {
            super(map, iz32);
            this.f50351g = iz3;
        }

        @Override // p000.C37907aM2.AbstractC10661q
        /* renamed from: a */
        public Set<Map.Entry<K, V>> mo71523a() {
            return C40052dw5.m43493b(this.f50340e.entrySet(), this.f50341f);
        }

        @Override // p000.C37907aM2.AbstractC10661q
        /* renamed from: b */
        public Set<K> mo71522b() {
            return C40052dw5.m43493b(this.f50340e.keySet(), this.f50351g);
        }

        @Override // p000.C37907aM2.AbstractC10643f, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f50340e.containsKey(obj) && this.f50351g.apply(obj);
        }
    }

    /* renamed from: aM2$l */
    /* loaded from: classes6.dex */
    public static final class C10655l<K, V> extends C10660p<K, V> {

        /* renamed from: c */
        public final Map<K, V> f50352c;

        /* renamed from: d */
        public final IZ3<? super Map.Entry<K, V>> f50353d;

        public C10655l(Map<K, V> map, Map<K, V> map2, IZ3<? super Map.Entry<K, V>> iz3) {
            super(map);
            this.f50352c = map2;
            this.f50353d = iz3;
        }

        @Override // p000.C37907aM2.C10660p, java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            Iterator<Map.Entry<K, V>> it = this.f50352c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f50353d.apply(next) && C37025Xd3.m76748a(next.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // p000.C37907aM2.C10660p, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f50352c.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f50353d.apply(next) && collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // p000.C37907aM2.C10660p, java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f50352c.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f50353d.apply(next) && !collection.contains(next.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return C34819Ns2.m93253i(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C34819Ns2.m93253i(iterator()).toArray(tArr);
        }
    }

    /* renamed from: aM2$m */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC10656m<K, V> extends AbstractMap<K, V> {

        /* renamed from: aM2$m$a */
        /* loaded from: classes6.dex */
        public class C10657a extends AbstractC10647h<K, V> {
            public C10657a() {
            }

            @Override // p000.C37907aM2.AbstractC10647h
            /* renamed from: a */
            public Map<K, V> mo71527a() {
                return AbstractC10656m.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return AbstractC10656m.this.mo71525a();
            }
        }

        /* renamed from: a */
        public abstract Iterator<Map.Entry<K, V>> mo71525a();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            C52933zg2.m595c(mo71525a());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new C10657a();
        }
    }

    /* renamed from: aM2$n */
    /* loaded from: classes6.dex */
    public static class C10658n<K, V> extends C40052dw5.AbstractC19913d<K> {

        /* renamed from: b */
        public final Map<K, V> f50355b;

        public C10658n(Map<K, V> map) {
            this.f50355b = (Map) EZ3.m108801n(map);
        }

        /* renamed from: a */
        public Map<K, V> m71526a() {
            return this.f50355b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            m71526a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return m71526a().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return m71526a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return C37907aM2.m71553i(m71526a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj)) {
                m71526a().remove(obj);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return m71526a().size();
        }
    }

    /* renamed from: aM2$o */
    /* loaded from: classes6.dex */
    public static class C10659o<K, V1, V2> extends AbstractC10656m<K, V2> {

        /* renamed from: b */
        public final Map<K, V1> f50356b;

        /* renamed from: c */
        public final InterfaceC10648i<? super K, ? super V1, V2> f50357c;

        public C10659o(Map<K, V1> map, InterfaceC10648i<? super K, ? super V1, V2> interfaceC10648i) {
            this.f50356b = (Map) EZ3.m108801n(map);
            this.f50357c = (InterfaceC10648i) EZ3.m108801n(interfaceC10648i);
        }

        @Override // p000.C37907aM2.AbstractC10656m
        /* renamed from: a */
        public Iterator<Map.Entry<K, V2>> mo71525a() {
            return C52933zg2.m577u(this.f50356b.entrySet().iterator(), C37907aM2.m71561a(this.f50357c));
        }

        @Override // p000.C37907aM2.AbstractC10656m, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f50356b.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f50356b.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 get(Object obj) {
            V1 v1 = this.f50356b.get(obj);
            if (v1 == null && !this.f50356b.containsKey(obj)) {
                return null;
            }
            return this.f50357c.mo71532a(obj, (Object) C48162rd3.m15690a(v1));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f50356b.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V2 remove(Object obj) {
            if (this.f50356b.containsKey(obj)) {
                return this.f50357c.mo71532a(obj, (Object) C48162rd3.m15690a(this.f50356b.remove(obj)));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f50356b.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V2> values() {
            return new C10660p(this);
        }
    }

    /* renamed from: aM2$p */
    /* loaded from: classes6.dex */
    public static class C10660p<K, V> extends AbstractCollection<V> {

        /* renamed from: b */
        public final Map<K, V> f50358b;

        public C10660p(Map<K, V> map) {
            this.f50358b = (Map) EZ3.m108801n(map);
        }

        /* renamed from: a */
        public final Map<K, V> m71524a() {
            return this.f50358b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            m71524a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return m71524a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return m71524a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return C37907aM2.m71541u(m71524a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : m71524a().entrySet()) {
                    if (C37025Xd3.m76748a(obj, entry.getValue())) {
                        m71524a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) EZ3.m108801n(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet m43489f = C40052dw5.m43489f();
                for (Map.Entry<K, V> entry : m71524a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        m43489f.add(entry.getKey());
                    }
                }
                return m71524a().keySet().removeAll(m43489f);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) EZ3.m108801n(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet m43489f = C40052dw5.m43489f();
                for (Map.Entry<K, V> entry : m71524a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        m43489f.add(entry.getKey());
                    }
                }
                return m71524a().keySet().retainAll(m43489f);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return m71524a().size();
        }
    }

    /* renamed from: aM2$q */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC10661q<K, V> extends AbstractMap<K, V> {

        /* renamed from: b */
        public transient Set<Map.Entry<K, V>> f50359b;

        /* renamed from: c */
        public transient Set<K> f50360c;

        /* renamed from: d */
        public transient Collection<V> f50361d;

        /* renamed from: a */
        public abstract Set<Map.Entry<K, V>> mo71523a();

        /* renamed from: b */
        public Set<K> mo71522b() {
            return new C10658n(this);
        }

        /* renamed from: c */
        public Collection<V> mo71521c() {
            return new C10660p(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f50359b;
            if (set == null) {
                Set<Map.Entry<K, V>> mo71523a = mo71523a();
                this.f50359b = mo71523a;
                return mo71523a;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            Set<K> set = this.f50360c;
            if (set == null) {
                Set<K> mo71522b = mo71522b();
                this.f50360c = mo71522b;
                return mo71522b;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f50361d;
            if (collection == null) {
                Collection<V> mo71521c = mo71521c();
                this.f50361d = mo71521c;
                return mo71521c;
            }
            return collection;
        }
    }

    private C37907aM2() {
    }

    /* renamed from: a */
    public static <K, V1, V2> InterfaceC50859wA1<Map.Entry<K, V1>, Map.Entry<K, V2>> m71561a(InterfaceC10648i<? super K, ? super V1, V2> interfaceC10648i) {
        EZ3.m108801n(interfaceC10648i);
        return new C10639b(interfaceC10648i);
    }

    /* renamed from: b */
    public static <K, V1, V2> InterfaceC10648i<K, V1, V2> m71560b(InterfaceC50859wA1<? super V1, V2> interfaceC50859wA1) {
        EZ3.m108801n(interfaceC50859wA1);
        return new C10642e(interfaceC50859wA1);
    }

    /* renamed from: c */
    public static int m71559c(int i) {
        if (i < 3) {
            C39948dm0.m43733b(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: d */
    public static boolean m71558d(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: e */
    public static <K, V> Map<K, V> m71557e(AbstractC10643f<K, V> abstractC10643f, IZ3<? super Map.Entry<K, V>> iz3) {
        return new C10649j(abstractC10643f.f50340e, JZ3.m100201b(abstractC10643f.f50341f, iz3));
    }

    /* renamed from: f */
    public static <K, V> Map<K, V> m71556f(Map<K, V> map, IZ3<? super K> iz3) {
        EZ3.m108801n(iz3);
        IZ3 m71552j = m71552j(iz3);
        if (map instanceof AbstractC10643f) {
            return m71557e((AbstractC10643f) map, m71552j);
        }
        return new C10654k((Map) EZ3.m108801n(map), iz3, m71552j);
    }

    /* renamed from: g */
    public static <K, V> Map.Entry<K, V> m71555g(K k, V v) {
        return new SY1(k, v);
    }

    /* renamed from: h */
    public static <K> InterfaceC50859wA1<Map.Entry<K, ?>, K> m71554h() {
        return EnumC10644g.f50342b;
    }

    /* renamed from: i */
    public static <K, V> Iterator<K> m71553i(Iterator<Map.Entry<K, V>> it) {
        return new C10640c(it);
    }

    /* renamed from: j */
    public static <K> IZ3<Map.Entry<K, ?>> m71552j(IZ3<? super K> iz3) {
        return JZ3.m100199d(iz3, m71554h());
    }

    /* renamed from: k */
    public static <K extends Enum<K>, V> EnumMap<K, V> m71551k(Class<K> cls) {
        return new EnumMap<>((Class) EZ3.m108801n(cls));
    }

    /* renamed from: l */
    public static <K, V> IdentityHashMap<K, V> m71550l() {
        return new IdentityHashMap<>();
    }

    /* renamed from: m */
    public static boolean m71549m(Map<?, ?> map, Object obj) {
        EZ3.m108801n(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: n */
    public static <V> V m71548n(Map<?, V> map, Object obj) {
        EZ3.m108801n(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: o */
    public static <V> V m71547o(Map<?, V> map, Object obj) {
        EZ3.m108801n(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: p */
    public static String m71546p(Map<?, ?> map) {
        StringBuilder m28478c = C44098km0.m28478c(map.size());
        m28478c.append(CoreConstants.CURLY_LEFT);
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                m28478c.append(", ");
            }
            m28478c.append(entry.getKey());
            m28478c.append('=');
            m28478c.append(entry.getValue());
            z = false;
        }
        m28478c.append(CoreConstants.CURLY_RIGHT);
        return m28478c.toString();
    }

    /* renamed from: q */
    public static <K, V1, V2> Map<K, V2> m71545q(Map<K, V1> map, InterfaceC10648i<? super K, ? super V1, V2> interfaceC10648i) {
        return new C10659o(map, interfaceC10648i);
    }

    /* renamed from: r */
    public static <V2, K, V1> Map.Entry<K, V2> m71544r(InterfaceC10648i<? super K, ? super V1, V2> interfaceC10648i, Map.Entry<K, V1> entry) {
        EZ3.m108801n(interfaceC10648i);
        EZ3.m108801n(entry);
        return new C10638a(entry, interfaceC10648i);
    }

    /* renamed from: s */
    public static <K, V1, V2> Map<K, V2> m71543s(Map<K, V1> map, InterfaceC50859wA1<? super V1, V2> interfaceC50859wA1) {
        return m71545q(map, m71560b(interfaceC50859wA1));
    }

    /* renamed from: t */
    public static <V> InterfaceC50859wA1<Map.Entry<?, V>, V> m71542t() {
        return EnumC10644g.f50343c;
    }

    /* renamed from: u */
    public static <K, V> Iterator<V> m71541u(Iterator<Map.Entry<K, V>> it) {
        return new C10641d(it);
    }

    /* renamed from: v */
    public static <V> IZ3<Map.Entry<?, V>> m71540v(IZ3<? super V> iz3) {
        return JZ3.m100199d(iz3, m71542t());
    }
}
