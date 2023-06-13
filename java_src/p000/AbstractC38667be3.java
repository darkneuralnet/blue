package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0007\n\u0002\u0010\u001f\n\u0002\b\u0007\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u0004BB\u0012\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003\u0012#\u0010(\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00010$¢\u0006\u0004\b<\u0010=J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u001a\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J!\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0015\u001a\u00020\u000f2\u0014\u0010\u0014\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0019\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\rJ+\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0096\u0002J3\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00182\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0096\u0002J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001H$¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\u00020\u000f2\u0014\u0010\u0014\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H$J\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00028\u0000H$¢\u0006\u0004\b\u001f\u0010 J\b\u0010!\u001a\u00020\u000fH$R\"\u0010#\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"R1\u0010(\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b%\u0012\b\b&\u0012\u0004\b\b(\u0006\u0012\u0006\u0012\u0004\u0018\u00018\u00010$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010'R\"\u0010)\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R,\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/0.8VX\u0096\u0004¢\u0006\f\u0012\u0004\b2\u00103\u001a\u0004\b0\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00101R \u0010;\u001a\b\u0012\u0004\u0012\u00028\u0001078VX\u0096\u0004¢\u0006\f\u0012\u0004\b:\u00103\u001a\u0004\b8\u00109¨\u0006>"}, m28432d2 = {"Lbe3;", "K", "V", "", "Lkotlin/properties/ReadWriteProperty;", "", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "", "clear", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "remove", "thisRef", "Lkotlin/reflect/KProperty;", "property", "h", "j", "b", "(Ljava/lang/Object;Ljava/lang/Object;)V", "c", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)V", C17296a.f69688o, "Ljava/util/Map;", "initialMap", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlin/jvm/functions/Function1;", "createDefaultValue", "delegateMap", "", "g", "()I", "size", "", "", "e", "()Ljava/util/Set;", "getEntries$annotations", "()V", "entries", "f", UserMetadata.KEYDATA_FILENAME, "", "i", "()Ljava/util/Collection;", "getValues$annotations", "values", "<init>", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)V", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: be3  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38667be3<K, V> implements Map<K, V>, ReadWriteProperty<Object, Map<K, V>>, KMutableMap {

    /* renamed from: b */
    public final Map<K, V> f57806b;

    /* renamed from: c */
    public final Function1<K, V> f57807c;

    /* renamed from: d */
    public final Map<K, V> f57808d;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC38667be3(Map<K, V> map, Function1<? super K, ? extends V> createDefaultValue) {
        Intrinsics.checkNotNullParameter(createDefaultValue, "createDefaultValue");
        this.f57806b = map;
        this.f57807c = createDefaultValue;
        this.f57808d = new LinkedHashMap();
    }

    /* renamed from: a */
    public abstract void mo29249a();

    /* renamed from: b */
    public abstract void mo29248b(K k, V v);

    /* renamed from: c */
    public abstract void mo29247c(Map<? extends K, ? extends V> map);

    @Override // java.util.Map
    public void clear() {
        this.f57808d.clear();
        Map<K, V> map = this.f57806b;
        if (map != null) {
            map.clear();
        }
        mo29249a();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (this.f57808d.containsKey(obj)) {
            return true;
        }
        Map<K, V> map = this.f57806b;
        return map != null && map.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (this.f57808d.containsValue(obj)) {
            return true;
        }
        Map<K, V> map = this.f57806b;
        return map != null && map.containsValue(obj);
    }

    /* renamed from: d */
    public abstract void mo29246d(K k);

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r0 == null) goto L10;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Set<Map.Entry<K, V>> m64225e() {
        Set mutableSet;
        Set<Map.Entry<K, V>> entrySet;
        Set mutableSet2;
        Map<K, V> map = this.f57806b;
        if (map != null && (entrySet = map.entrySet()) != null) {
            mutableSet2 = CollectionsKt___CollectionsKt.toMutableSet(this.f57808d.entrySet());
            mutableSet = SetsKt___SetsKt.plus((Set) entrySet, (Iterable) mutableSet2);
        }
        mutableSet = CollectionsKt___CollectionsKt.toMutableSet(this.f57808d.entrySet());
        Intrinsics.checkNotNull(mutableSet, "null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.collections.MutableMap.MutableEntry<K of dev.b3nedikt.restring.internal.repository.observable.ObservableMap, V of dev.b3nedikt.restring.internal.repository.observable.ObservableMap>>");
        return TypeIntrinsics.asMutableSet(mutableSet);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return m64225e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
        r0 = kotlin.collections.SetsKt___SetsKt.plus((java.util.Set) r0, (java.lang.Iterable) r2.f57808d.keySet());
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Set<K> m64224f() {
        Set<K> keySet;
        Map<K, V> map = this.f57806b;
        if (map == null || (r0 = map.keySet()) == null || keySet == null) {
            keySet = this.f57808d.keySet();
        }
        Intrinsics.checkNotNull(keySet, "null cannot be cast to non-null type kotlin.collections.MutableSet<K of dev.b3nedikt.restring.internal.repository.observable.ObservableMap>");
        return TypeIntrinsics.asMutableSet(keySet);
    }

    /* renamed from: g */
    public int m64223g() {
        int size = this.f57808d.size();
        Map<K, V> map = this.f57806b;
        return size + (map != null ? map.size() : 0);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        V v;
        V v2 = this.f57808d.get(obj);
        if (!this.f57808d.containsKey(obj)) {
            Map<K, V> map = this.f57806b;
            if (map != null) {
                v = map.get(obj);
            } else {
                v = null;
            }
            if (v != null) {
                this.f57808d.put(obj, v);
                return v;
            }
            V invoke = this.f57807c.invoke(obj);
            if (invoke != null) {
                put(obj, invoke);
            } else {
                this.f57808d.put(obj, v);
            }
            return invoke;
        }
        return v2;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    /* renamed from: h */
    public Map<K, V> getValue(Object obj, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r0 == null) goto L10;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Collection<V> m64221i() {
        List filterNotNull;
        Collection<V> values;
        List filterNotNull2;
        Map<K, V> map = this.f57806b;
        if (map != null && (values = map.values()) != null) {
            filterNotNull2 = CollectionsKt___CollectionsKt.filterNotNull(this.f57808d.values());
            filterNotNull = CollectionsKt___CollectionsKt.plus((Collection) values, (Iterable) filterNotNull2);
        }
        filterNotNull = CollectionsKt___CollectionsKt.filterNotNull(this.f57808d.values());
        Intrinsics.checkNotNull(filterNotNull, "null cannot be cast to non-null type kotlin.collections.MutableCollection<V of dev.b3nedikt.restring.internal.repository.observable.ObservableMap>");
        return TypeIntrinsics.asMutableCollection(filterNotNull);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (this.f57808d.isEmpty()) {
            Map<K, V> map = this.f57806b;
            return map != null && map.isEmpty();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.properties.ReadWriteProperty
    /* renamed from: j */
    public void setValue(Object obj, KProperty<?> property, Map<K, V> value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        putAll(value);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return m64224f();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        V put = this.f57808d.put(k, v);
        mo29248b(k, v);
        return put;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.f57808d.putAll(from);
        mo29247c(from);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        V remove = this.f57808d.remove(obj);
        if (remove == null) {
            Map<K, V> map = this.f57806b;
            if (map != null) {
                remove = map.remove(obj);
            } else {
                remove = null;
            }
        }
        mo29246d(obj);
        return remove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m64223g();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m64221i();
    }
}
