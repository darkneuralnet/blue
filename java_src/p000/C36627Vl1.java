package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: Vl1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36627Vl1<K, V> extends AbstractC9263X0<K, V> implements InterfaceC37095Xl1<K, V> {

    /* renamed from: g */
    public final InterfaceC41581gX2<K, V> f39699g;

    /* renamed from: h */
    public final IZ3<? super K> f39700h;

    /* renamed from: Vl1$a */
    /* loaded from: classes6.dex */
    public static class C8781a<K, V> extends AbstractC32523Dx1<V> {

        /* renamed from: b */
        public final K f39701b;

        public C8781a(K k) {
            this.f39701b = k;
        }

        @Override // p000.AbstractC32523Dx1, p000.AbstractC31821Ax1, p000.AbstractC33927Jx1
        /* renamed from: a */
        public List<V> delegate() {
            return Collections.emptyList();
        }

        @Override // p000.AbstractC31821Ax1, java.util.Collection
        public boolean add(V v) {
            add(0, v);
            return true;
        }

        @Override // p000.AbstractC31821Ax1, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            addAll(0, collection);
            return true;
        }

        @Override // p000.AbstractC32523Dx1, java.util.List
        public void add(int i, V v) {
            EZ3.m108798q(i, 0);
            String valueOf = String.valueOf(this.f39701b);
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Key does not satisfy predicate: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }

        @Override // p000.AbstractC32523Dx1, java.util.List
        public boolean addAll(int i, Collection<? extends V> collection) {
            EZ3.m108801n(collection);
            EZ3.m108798q(i, 0);
            String valueOf = String.valueOf(this.f39701b);
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Key does not satisfy predicate: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: Vl1$b */
    /* loaded from: classes6.dex */
    public static class C8782b<K, V> extends AbstractC34395Lx1<V> {

        /* renamed from: b */
        public final K f39702b;

        public C8782b(K k) {
            this.f39702b = k;
        }

        @Override // p000.AbstractC34395Lx1, p000.AbstractC31821Ax1, p000.AbstractC33927Jx1
        /* renamed from: a */
        public Set<V> delegate() {
            return Collections.emptySet();
        }

        @Override // p000.AbstractC31821Ax1, java.util.Collection
        public boolean add(V v) {
            String valueOf = String.valueOf(this.f39702b);
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Key does not satisfy predicate: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }

        @Override // p000.AbstractC31821Ax1, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            EZ3.m108801n(collection);
            String valueOf = String.valueOf(this.f39702b);
            StringBuilder sb = new StringBuilder(valueOf.length() + 32);
            sb.append("Key does not satisfy predicate: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: Vl1$c */
    /* loaded from: classes6.dex */
    public class C8783c extends AbstractC31821Ax1<Map.Entry<K, V>> {
        public C8783c() {
        }

        @Override // p000.AbstractC31821Ax1, java.util.Collection
        public boolean remove(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (C36627Vl1.this.f39699g.containsKey(entry.getKey()) && C36627Vl1.this.f39700h.apply((Object) entry.getKey())) {
                    return C36627Vl1.this.f39699g.remove(entry.getKey(), entry.getValue());
                }
                return false;
            }
            return false;
        }

        @Override // p000.AbstractC31821Ax1, p000.AbstractC33927Jx1
        public Collection<Map.Entry<K, V>> delegate() {
            return C44098km0.m28479b(C36627Vl1.this.f39699g.mo24584b(), C36627Vl1.this.mo76375c());
        }
    }

    public C36627Vl1(InterfaceC41581gX2<K, V> interfaceC41581gX2, IZ3<? super K> iz3) {
        this.f39699g = (InterfaceC41581gX2) EZ3.m108801n(interfaceC41581gX2);
        this.f39700h = (IZ3) EZ3.m108801n(iz3);
    }

    @Override // p000.InterfaceC37095Xl1
    /* renamed from: a */
    public InterfaceC41581gX2<K, V> mo72552a() {
        return this.f39699g;
    }

    @Override // p000.InterfaceC37095Xl1
    /* renamed from: c */
    public IZ3<? super Map.Entry<K, V>> mo76375c() {
        return C37907aM2.m71552j(this.f39700h);
    }

    @Override // p000.InterfaceC41581gX2
    public void clear() {
        keySet().clear();
    }

    @Override // p000.InterfaceC41581gX2
    public boolean containsKey(Object obj) {
        if (this.f39699g.containsKey(obj)) {
            return this.f39700h.apply(obj);
        }
        return false;
    }

    @Override // p000.InterfaceC41581gX2
    public Collection<V> get(K k) {
        if (this.f39700h.apply(k)) {
            return this.f39699g.get(k);
        }
        if (this.f39699g instanceof InterfaceC37423Yv5) {
            return new C8782b(k);
        }
        return new C8781a(k);
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: h */
    public Map<K, Collection<V>> mo30368h() {
        return C37907aM2.m71556f(this.f39699g.mo24583f(), this.f39700h);
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: i */
    public Collection<Map.Entry<K, V>> mo74915i() {
        return new C8783c();
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: j */
    public Set<K> mo30367j() {
        return C40052dw5.m43493b(this.f39699g.keySet(), this.f39700h);
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: k */
    public InterfaceC45139mX2<K> mo74914k() {
        return C46325oX2.m20932f(this.f39699g.mo39190d(), this.f39700h);
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: l */
    public Collection<V> mo74913l() {
        return new C37329Yl1(this);
    }

    @Override // p000.AbstractC9263X0
    /* renamed from: m */
    public Iterator<Map.Entry<K, V>> mo74912m() {
        throw new AssertionError("should never be called");
    }

    @Override // p000.InterfaceC41581gX2
    public int size() {
        int i = 0;
        for (Collection<V> collection : mo24583f().values()) {
            i += collection.size();
        }
        return i;
    }
}
