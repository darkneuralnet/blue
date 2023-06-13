package p000;

import com.facebook.share.internal.C17296a;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B5\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0096\u0002¨\u0006\u000e"}, m28432d2 = {"LBP5;", "K", "V", "LCP5;", "", "", "g", "LOM5;", "map", "", "", "iterator", "<init>", "(LOM5;Ljava/util/Iterator;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: BP5 */
/* loaded from: classes.dex */
public final class BP5<K, V> extends CP5<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {

    @Metadata(m28433d1 = {"\u0000\r\n\u0000\n\u0002\u0010'\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0017\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\u000e\u001a\u00028\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, m28432d2 = {"BP5$a", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "b", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "c", "getValue", C17296a.f69688o, "(Ljava/lang/Object;)V", "value", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n305#2,4:361\n1#3:365\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n*L\n322#1:361,4\n322#1:365\n*E\n"})
    /* renamed from: BP5$a */
    /* loaded from: classes.dex */
    public static final class C0606a implements Map.Entry<K, V>, KMutableMap.Entry {

        /* renamed from: b */
        public final K f2270b;

        /* renamed from: c */
        public V f2271c;

        /* renamed from: d */
        public final /* synthetic */ BP5<K, V> f2272d;

        public C0606a(BP5<K, V> bp5) {
            this.f2272d = bp5;
            Map.Entry<K, V> m112249d = bp5.m112249d();
            Intrinsics.checkNotNull(m112249d);
            this.f2270b = m112249d.getKey();
            Map.Entry<K, V> m112249d2 = bp5.m112249d();
            Intrinsics.checkNotNull(m112249d2);
            this.f2271c = m112249d2.getValue();
        }

        /* renamed from: a */
        public void m114051a(V v) {
            this.f2271c = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f2270b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f2271c;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            BP5<K, V> bp5 = this.f2272d;
            if (bp5.m112248e().m92379d() == bp5.f4040d) {
                V v2 = (V) getValue();
                bp5.m112248e().put((K) getKey(), v);
                m114051a(v);
                return v2;
            }
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BP5(OM5<K, V> map, Iterator<? extends Map.Entry<? extends K, ? extends V>> iterator) {
        super(map, iterator);
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
    }

    @Override // java.util.Iterator
    /* renamed from: g */
    public Map.Entry<K, V> next() {
        m112250c();
        if (m112249d() != null) {
            return new C0606a(this);
        }
        throw new IllegalStateException();
    }
}
