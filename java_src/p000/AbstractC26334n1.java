package p000;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p000.AbstractC4667L0;
/* renamed from: n1 */
/* loaded from: classes6.dex */
public abstract class AbstractC26334n1<K, V> extends AbstractC4667L0<K, V> implements InterfaceC37423Yv5<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    public AbstractC26334n1(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // p000.AbstractC4667L0
    /* renamed from: E */
    public <E> Collection<E> mo24587E(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // p000.AbstractC4667L0
    /* renamed from: F */
    public Collection<V> mo24586F(K k, Collection<V> collection) {
        return new AbstractC4667L0.C4683l(k, (Set) collection);
    }

    @Override // p000.AbstractC4667L0
    /* renamed from: H */
    public abstract Set<V> mo24582x();

    @Override // p000.AbstractC9263X0
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p000.AbstractC9263X0, p000.InterfaceC41581gX2
    /* renamed from: f */
    public Map<K, Collection<V>> mo24583f() {
        return super.mo24583f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC4667L0, p000.InterfaceC41581gX2
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((AbstractC26334n1<K, V>) obj);
    }

    @Override // p000.AbstractC4667L0, p000.AbstractC9263X0, p000.InterfaceC41581gX2
    public boolean put(K k, V v) {
        return super.put(k, v);
    }

    @Override // p000.AbstractC4667L0, p000.AbstractC9263X0, p000.InterfaceC41581gX2
    /* renamed from: b */
    public Set<Map.Entry<K, V>> mo24584b() {
        return (Set) super.mo24584b();
    }

    @Override // p000.AbstractC4667L0, p000.InterfaceC41581gX2
    public Set<V> get(K k) {
        return (Set) super.get((AbstractC26334n1<K, V>) k);
    }
}
