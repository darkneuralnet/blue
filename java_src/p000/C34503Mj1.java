package p000;

import java.util.HashMap;
import java.util.Map;
import p000.C47018ph5;
/* renamed from: Mj1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C34503Mj1<K, V> extends C47018ph5<K, V> {

    /* renamed from: f */
    public final HashMap<K, C47018ph5.C27336c<K, V>> f23434f = new HashMap<>();

    @Override // p000.C47018ph5
    /* renamed from: b */
    public C47018ph5.C27336c<K, V> mo18970b(K k) {
        return this.f23434f.get(k);
    }

    public boolean contains(K k) {
        return this.f23434f.containsKey(k);
    }

    @Override // p000.C47018ph5
    /* renamed from: h */
    public V mo18966h(K k, V v) {
        C47018ph5.C27336c<K, V> mo18970b = mo18970b(k);
        if (mo18970b != null) {
            return mo18970b.f103937c;
        }
        this.f23434f.put(k, m18967f(k, v));
        return null;
    }

    @Override // p000.C47018ph5
    /* renamed from: j */
    public V mo18965j(K k) {
        V v = (V) super.mo18965j(k);
        this.f23434f.remove(k);
        return v;
    }

    /* renamed from: o */
    public Map.Entry<K, V> m94997o(K k) {
        if (contains(k)) {
            return this.f23434f.get(k).f103939e;
        }
        return null;
    }
}
