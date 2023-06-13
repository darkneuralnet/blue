package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* renamed from: Wl1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36861Wl1<K, V> extends C36627Vl1<K, V> implements InterfaceC37563Zl1<K, V> {

    /* renamed from: Wl1$a */
    /* loaded from: classes6.dex */
    public class C9163a extends C36627Vl1<K, V>.C8783c implements Set<Map.Entry<K, V>> {
        public C9163a(C36861Wl1 c36861Wl1) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return C40052dw5.m43494a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return C40052dw5.m43491d(this);
        }
    }

    public C36861Wl1(InterfaceC37423Yv5<K, V> interfaceC37423Yv5, IZ3<? super K> iz3) {
        super(interfaceC37423Yv5, iz3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.C36627Vl1, p000.InterfaceC41581gX2
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((C36861Wl1<K, V>) obj);
    }

    @Override // p000.C36627Vl1, p000.AbstractC9263X0
    /* renamed from: p */
    public Set<Map.Entry<K, V>> mo74915i() {
        return new C9163a(this);
    }

    @Override // p000.C36627Vl1, p000.InterfaceC37095Xl1
    /* renamed from: a */
    public InterfaceC37423Yv5<K, V> mo72552a() {
        return (InterfaceC37423Yv5) this.f39699g;
    }

    @Override // p000.AbstractC9263X0, p000.InterfaceC41581gX2
    /* renamed from: b */
    public Set<Map.Entry<K, V>> mo24584b() {
        return (Set) super.mo24584b();
    }

    @Override // p000.C36627Vl1, p000.InterfaceC41581gX2
    public Set<V> get(K k) {
        return (Set) super.get((C36861Wl1<K, V>) k);
    }
}
