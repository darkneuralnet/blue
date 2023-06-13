package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* renamed from: Yv5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC37423Yv5<K, V> extends InterfaceC41581gX2<K, V> {
    @Override // p000.InterfaceC41581gX2
    /* renamed from: b */
    Set<Map.Entry<K, V>> mo24584b();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC41581gX2
    /* bridge */ /* synthetic */ default Collection get(Object obj) {
        return get((InterfaceC37423Yv5<K, V>) obj);
    }

    @Override // p000.InterfaceC41581gX2
    Set<V> get(K k);
}
