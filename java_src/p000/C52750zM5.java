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
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0096\u0002J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0016\u0010\u0011\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u0016\u0010\u0013\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¨\u0006\u0018"}, m28432d2 = {"LzM5;", "K", "V", "LAM5;", "element", "", "c", "(Ljava/lang/Object;)Ljava/lang/Void;", "", "elements", "e", "LDP5;", "f", "", "remove", "(Ljava/lang/Object;)Z", "removeAll", "retainAll", "contains", "containsAll", "LOM5;", "map", "<init>", "(LOM5;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n1#1,360:1\n1855#2,2:361\n1726#2,3:406\n84#3,2:363\n129#3,4:365\n133#3:370\n121#3:371\n134#3,5:373\n86#3,7:378\n139#3,2:385\n125#3:387\n141#3,6:393\n149#3,3:402\n93#3:405\n70#4:369\n2180#5:372\n2073#5,2:388\n1686#5:390\n2075#5,2:391\n2077#5,3:399\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n*L\n227#1:361,2\n237#1:406,3\n234#1:363,2\n234#1:365,4\n234#1:370\n234#1:371\n234#1:373,5\n234#1:378,7\n234#1:385,2\n234#1:387\n234#1:393,6\n234#1:402,3\n234#1:405\n234#1:369\n234#1:372\n234#1:388,2\n234#1:390\n234#1:391,2\n234#1:399,3\n*E\n"})
/* renamed from: zM5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52750zM5<K, V> extends AM5<K, V, K> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52750zM5(OM5<K, V> map) {
        super(map);
        Intrinsics.checkNotNullParameter(map, "map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) m1509c(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) m1508e(collection)).booleanValue();
    }

    /* renamed from: c */
    public Void m1509c(K k) {
        PM5.m90375b();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return m115865a().containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!m115865a().containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public Void m1508e(Collection<? extends K> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        PM5.m90375b();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* renamed from: f */
    public DP5<K, V> iterator() {
        return new DP5<>(m115865a(), ((InterfaceC39209cZ1) m115865a().m92378f().m92374g().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return m115865a().remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        while (true) {
            boolean z = false;
            for (Object obj : elements) {
                if (m115865a().remove(obj) != null || z) {
                    z = true;
                }
            }
            return z;
        }
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
                if (!set.contains(next.getKey())) {
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
