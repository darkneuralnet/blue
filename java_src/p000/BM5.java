package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.FR3;
import p000.OM5;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0016J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0096\u0002J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0016J\u0016\u0010\u0011\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u0016\u0010\u0013\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0016¨\u0006\u0018"}, m28432d2 = {"LBM5;", "K", "V", "LAM5;", "element", "", "c", "(Ljava/lang/Object;)Ljava/lang/Void;", "", "elements", "e", "LEP5;", "f", "", "remove", "(Ljava/lang/Object;)Z", "removeAll", "retainAll", "contains", "containsAll", "LOM5;", "map", "<init>", "(LOM5;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapValueSet\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,360:1\n84#2,2:361\n129#2,4:363\n133#2:368\n121#2:369\n134#2,5:371\n86#2,7:376\n139#2,2:383\n125#2:385\n141#2,6:391\n149#2,3:400\n93#2:403\n84#2,2:404\n129#2,4:406\n133#2:411\n121#2:412\n134#2,5:414\n86#2,7:419\n139#2,2:426\n125#2:428\n141#2,6:434\n149#2,3:443\n93#2:446\n70#3:367\n70#3:410\n2180#4:370\n2073#4,2:386\n1686#4:388\n2075#4,2:389\n2077#4,3:397\n2180#4:413\n2073#4,2:429\n1686#4:431\n2075#4,2:432\n2077#4,3:440\n1726#5,3:447\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapValueSet\n*L\n250#1:361,2\n250#1:363,4\n250#1:368\n250#1:369\n250#1:371,5\n250#1:376,7\n250#1:383,2\n250#1:385\n250#1:391,6\n250#1:400,3\n250#1:403\n254#1:404,2\n254#1:406,4\n254#1:411\n254#1:412\n254#1:414,5\n254#1:419,7\n254#1:426,2\n254#1:428\n254#1:434,6\n254#1:443,3\n254#1:446\n250#1:367\n254#1:410\n250#1:370\n250#1:386,2\n250#1:388\n250#1:389,2\n250#1:397,3\n254#1:413\n254#1:429,2\n254#1:431\n254#1:432,2\n254#1:440,3\n258#1:447,3\n*E\n"})
/* renamed from: BM5 */
/* loaded from: classes.dex */
public final class BM5<K, V> extends AM5<K, V, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BM5(OM5<K, V> map) {
        super(map);
        Intrinsics.checkNotNullParameter(map, "map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) m114075c(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) m114074e(collection)).booleanValue();
    }

    /* renamed from: c */
    public Void m114075c(V v) {
        PM5.m90375b();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return m115865a().containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!m115865a().containsValue(obj)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public Void m114074e(Collection<? extends V> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        PM5.m90375b();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* renamed from: f */
    public EP5<K, V> iterator() {
        return new EP5<>(m115865a(), ((InterfaceC39209cZ1) m115865a().m92378f().m92374g().entrySet()).iterator());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return m115865a().m92375j(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        Set set;
        Object obj;
        FR3<K, V> m92374g;
        int m92373h;
        boolean z;
        AbstractC48600sM5 m14280b;
        Object obj2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        set = CollectionsKt___CollectionsKt.toSet(elements);
        OM5<K, V> m115865a = m115865a();
        boolean z2 = false;
        do {
            obj = PM5.f28349a;
            synchronized (obj) {
                HP5 mo13271h = m115865a.mo13271h();
                Intrinsics.checkNotNull(mo13271h, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                OM5.C5980a c5980a = (OM5.C5980a) C51564xM5.m5415B((OM5.C5980a) mo13271h);
                m92374g = c5980a.m92374g();
                m92373h = c5980a.m92373h();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(m92374g);
            FR3.InterfaceC2276a<K, V> builder = m92374g.builder();
            Iterator<Map.Entry<K, V>> it = m115865a.entrySet().iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<K, V> next = it.next();
                if (set.contains(next.getValue())) {
                    builder.remove(next.getKey());
                    z2 = true;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            FR3<K, V> build = builder.build();
            if (Intrinsics.areEqual(build, m92374g)) {
                break;
            }
            HP5 mo13271h2 = m115865a.mo13271h();
            Intrinsics.checkNotNull(mo13271h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            OM5.C5980a c5980a2 = (OM5.C5980a) mo13271h2;
            C51564xM5.m5411F();
            synchronized (C51564xM5.m5412E()) {
                m14280b = AbstractC48600sM5.f108670e.m14280b();
                OM5.C5980a c5980a3 = (OM5.C5980a) C51564xM5.m5385c0(c5980a2, m115865a, m14280b);
                obj2 = PM5.f28349a;
                synchronized (obj2) {
                    if (c5980a3.m92373h() == m92373h) {
                        c5980a3.m92372i(build);
                        c5980a3.m92371j(c5980a3.m92373h() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            C51564xM5.m5404M(m14280b, m115865a);
        } while (!z);
        return z2;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        Set set;
        Object obj;
        FR3<K, V> m92374g;
        int m92373h;
        boolean z;
        AbstractC48600sM5 m14280b;
        Object obj2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        set = CollectionsKt___CollectionsKt.toSet(elements);
        OM5<K, V> m115865a = m115865a();
        boolean z2 = false;
        do {
            obj = PM5.f28349a;
            synchronized (obj) {
                HP5 mo13271h = m115865a.mo13271h();
                Intrinsics.checkNotNull(mo13271h, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                OM5.C5980a c5980a = (OM5.C5980a) C51564xM5.m5415B((OM5.C5980a) mo13271h);
                m92374g = c5980a.m92374g();
                m92373h = c5980a.m92373h();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(m92374g);
            FR3.InterfaceC2276a<K, V> builder = m92374g.builder();
            Iterator<Map.Entry<K, V>> it = m115865a.entrySet().iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<K, V> next = it.next();
                if (!set.contains(next.getValue())) {
                    builder.remove(next.getKey());
                    z2 = true;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            FR3<K, V> build = builder.build();
            if (Intrinsics.areEqual(build, m92374g)) {
                break;
            }
            HP5 mo13271h2 = m115865a.mo13271h();
            Intrinsics.checkNotNull(mo13271h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            OM5.C5980a c5980a2 = (OM5.C5980a) mo13271h2;
            C51564xM5.m5411F();
            synchronized (C51564xM5.m5412E()) {
                m14280b = AbstractC48600sM5.f108670e.m14280b();
                OM5.C5980a c5980a3 = (OM5.C5980a) C51564xM5.m5385c0(c5980a2, m115865a, m14280b);
                obj2 = PM5.f28349a;
                synchronized (obj2) {
                    if (c5980a3.m92373h() == m92373h) {
                        c5980a3.m92372i(build);
                        c5980a3.m92371j(c5980a3.m92373h() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            C51564xM5.m5404M(m14280b, m115865a);
        } while (!z);
        return z2;
    }
}
