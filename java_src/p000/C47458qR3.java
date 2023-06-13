package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableMap;
import kotlin.jvm.internal.Intrinsics;
import p000.FR3;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\bA\u0010BJ\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0011\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H\u0016J\u0019\u0010\u0014\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0012H\u0016R\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR.\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\"\u001a\u0004\b\u001c\u0010#\"\u0004\b$\u0010%R$\u0010-\u001a\u0004\u0018\u00018\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00102\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010/\u001a\u0004\b\u0017\u00100\"\u0004\b'\u00101R*\u00105\u001a\u00020.2\u0006\u0010\r\u001a\u00020.8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b3\u0010/\u001a\u0004\b4\u00100\"\u0004\b3\u00101R&\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000107068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00028\u0000068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00109R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00010=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006C"}, m28432d2 = {"LqR3;", "K", "V", "LFR3$a;", "Lkotlin/collections/AbstractMutableMap;", "LoR3;", C17296a.f69688o, "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "", "putAll", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "clear", "b", "LoR3;", "map", "LpX2;", "<set-?>", "c", "LpX2;", DateTokenConverter.CONVERTER_KEY, "()LpX2;", "ownership", "Lqa6;", "Lqa6;", "()Lqa6;", "setNode$runtime_release", "(Lqa6;)V", "node", "e", "Ljava/lang/Object;", "getOperationResult$runtime_release", "()Ljava/lang/Object;", "f", "(Ljava/lang/Object;)V", "operationResult", "", "I", "()I", "(I)V", "modCount", "g", "getSize", "size", "", "", "getEntries", "()Ljava/util/Set;", "entries", "getKeys", UserMetadata.KEYDATA_FILENAME, "", "getValues", "()Ljava/util/Collection;", "values", "<init>", "(LoR3;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qR3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47458qR3<K, V> extends AbstractMutableMap<K, V> implements FR3.InterfaceC2276a<K, V> {

    /* renamed from: b */
    public C46272oR3<K, V> f105304b;

    /* renamed from: c */
    public C46918pX2 f105305c;

    /* renamed from: d */
    public C47542qa6<K, V> f105306d;

    /* renamed from: e */
    public V f105307e;

    /* renamed from: f */
    public int f105308f;

    /* renamed from: g */
    public int f105309g;

    public C47458qR3(C46272oR3<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f105304b = map;
        this.f105305c = new C46918pX2();
        this.f105306d = this.f105304b.m21076e();
        this.f105309g = this.f105304b.size();
    }

    @Override // p000.FR3.InterfaceC2276a
    /* renamed from: a */
    public C46272oR3<K, V> build() {
        C46272oR3<K, V> c46272oR3;
        if (this.f105306d == this.f105304b.m21076e()) {
            c46272oR3 = this.f105304b;
        } else {
            this.f105305c = new C46918pX2();
            c46272oR3 = new C46272oR3<>(this.f105306d, size());
        }
        this.f105304b = c46272oR3;
        return c46272oR3;
    }

    /* renamed from: b */
    public final int m17514b() {
        return this.f105308f;
    }

    /* renamed from: c */
    public final C47542qa6<K, V> m17513c() {
        return this.f105306d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        C47542qa6<K, V> m17380a = C47542qa6.f105443e.m17380a();
        Intrinsics.checkNotNull(m17380a, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f105306d = m17380a;
        m17509g(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f105306d.m17396k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    /* renamed from: d */
    public final C46918pX2 m17512d() {
        return this.f105305c;
    }

    /* renamed from: e */
    public final void m17511e(int i) {
        this.f105308f = i;
    }

    /* renamed from: f */
    public final void m17510f(V v) {
        this.f105307e = v;
    }

    /* renamed from: g */
    public void m17509g(int i) {
        this.f105309g = i;
        this.f105308f++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        return this.f105306d.m17392o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Set<Map.Entry<K, V>> getEntries() {
        return new C48643sR3(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Set<K> getKeys() {
        return new C49829uR3(this);
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return this.f105309g;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public Collection<V> getValues() {
        return new C51014wR3(this);
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        int i;
        this.f105307e = null;
        C47542qa6<K, V> c47542qa6 = this.f105306d;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        this.f105306d = c47542qa6.m17426D(i, k, v, 0, this);
        return this.f105307e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        C46272oR3<K, V> c46272oR3;
        C47458qR3 c47458qR3;
        Intrinsics.checkNotNullParameter(from, "from");
        if (from instanceof C46272oR3) {
            c46272oR3 = (C46272oR3) from;
        } else {
            c46272oR3 = null;
        }
        if (c46272oR3 == null) {
            if (from instanceof C47458qR3) {
                c47458qR3 = (C47458qR3) from;
            } else {
                c47458qR3 = null;
            }
            if (c47458qR3 != null) {
                c46272oR3 = c47458qR3.build();
            } else {
                c46272oR3 = null;
            }
        }
        if (c46272oR3 != null) {
            C39495d01 c39495d01 = new C39495d01(0, 1, null);
            int size = size();
            C47542qa6<K, V> c47542qa6 = this.f105306d;
            C47542qa6<K, V> m21076e = c46272oR3.m21076e();
            Intrinsics.checkNotNull(m21076e, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.f105306d = c47542qa6.m17425E(m21076e, 0, c39495d01, this);
            int size2 = (c46272oR3.size() + size) - c39495d01.m44746a();
            if (size != size2) {
                m17509g(size2);
                return;
            }
            return;
        }
        super.putAll(from);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        this.f105307e = null;
        C47542qa6 m17423G = this.f105306d.m17423G(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (m17423G == null) {
            m17423G = C47542qa6.f105443e.m17380a();
            Intrinsics.checkNotNull(m17423G, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f105306d = m17423G;
        return this.f105307e;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        C47542qa6 m17422H = this.f105306d.m17422H(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (m17422H == null) {
            m17422H = C47542qa6.f105443e.m17380a();
            Intrinsics.checkNotNull(m17422H, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f105306d = m17422H;
        return size != size();
    }
}
