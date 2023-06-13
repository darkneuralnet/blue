package co.bird.android.app.feature.map.p008ui.renderer;

import co.bird.android.model.Polygonable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/app/feature/map/ui/renderer/PolygonableMap;", "V", "", "Ljava/util/concurrent/ConcurrentHashMap;", "Lco/bird/android/model/Polygonable;", "()V", "atomicSet", "Ljava/util/concurrent/atomic/AtomicReference;", "", "polygonableIdMap", "", "polygonables", "getPolygonables", "()Ljava/util/Set;", "containsKey", "", "key", "get", "(Lco/bird/android/model/Polygonable;)Ljava/lang/Object;", "put", "value", "(Lco/bird/android/model/Polygonable;Ljava/lang/Object;)Ljava/lang/Object;", "putIfAbsent", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.renderer.PolygonableMap */
/* loaded from: classes2.dex */
public final class PolygonableMap<V> extends ConcurrentHashMap<Polygonable, V> {
    private final AtomicReference<Set<Polygonable>> atomicSet;
    private final ConcurrentHashMap<String, V> polygonableIdMap;

    public PolygonableMap() {
        Set emptySet;
        emptySet = SetsKt__SetsKt.emptySet();
        this.atomicSet = new AtomicReference<>(emptySet);
        this.polygonableIdMap = new ConcurrentHashMap<>();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof Polygonable) {
            return containsKey((Polygonable) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<Polygonable, V>> entrySet() {
        return (Set<Map.Entry<Polygonable, V>>) getEntries();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ V get(Object obj) {
        if (obj instanceof Polygonable) {
            return get((Polygonable) obj);
        }
        return null;
    }

    public /* bridge */ Set<Map.Entry<Polygonable, Object>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<Polygonable> getKeys() {
        return super.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ Object getOrDefault(Polygonable polygonable, Object obj) {
        return super.getOrDefault((Object) polygonable, (Polygonable) obj);
    }

    public final Set<Polygonable> getPolygonables() {
        Set<Polygonable> set = this.atomicSet.get();
        Intrinsics.checkNotNullExpressionValue(set, "atomicSet.get()");
        return set;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Polygonable> keySet() {
        return getKeys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((Polygonable) obj, (Polygonable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return putIfAbsent((Polygonable) obj, (Polygonable) obj2);
    }

    public /* bridge */ Object remove(Polygonable polygonable) {
        return super.remove((Object) polygonable);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) getValues();
    }

    public boolean containsKey(Polygonable key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.polygonableIdMap.containsKey(key.getId());
    }

    public V get(Polygonable key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.polygonableIdMap.get(key.getId());
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof Polygonable) ? obj2 : getOrDefault((Polygonable) obj, obj2);
    }

    public V put(Polygonable key, V value) {
        Set<Polygonable> plus;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        AtomicReference<Set<Polygonable>> atomicReference = this.atomicSet;
        Set<Polygonable> set = atomicReference.get();
        Intrinsics.checkNotNullExpressionValue(set, "atomicSet.get()");
        plus = SetsKt___SetsKt.plus(set, key);
        atomicReference.set(plus);
        return this.polygonableIdMap.put(key.getId(), value);
    }

    public V putIfAbsent(Polygonable key, V value) {
        Set<Polygonable> plus;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        AtomicReference<Set<Polygonable>> atomicReference = this.atomicSet;
        Set<Polygonable> set = atomicReference.get();
        Intrinsics.checkNotNullExpressionValue(set, "atomicSet.get()");
        plus = SetsKt___SetsKt.plus(set, key);
        atomicReference.set(plus);
        super.putIfAbsent((PolygonableMap<V>) key, (Polygonable) value);
        return this.polygonableIdMap.putIfAbsent(key.getId(), value);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ V remove(Object obj) {
        if (obj instanceof Polygonable) {
            return (V) remove((Polygonable) obj);
        }
        return null;
    }

    public /* bridge */ boolean remove(Polygonable polygonable, Object obj) {
        return super.remove((Object) polygonable, obj);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof Polygonable) && obj2 != null) {
            return remove((Polygonable) obj, obj2);
        }
        return false;
    }
}
