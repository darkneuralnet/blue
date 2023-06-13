package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import p000.FR3;
import p000.OM5;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\n\u001a\u00020\u00062\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\bH\u0016J\u001b\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u000bH\u0096\u0002J\u001c\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u000f\u001a\u00020\r2\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\bH\u0016J\"\u0010\u0010\u001a\u00020\r2\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\bH\u0016J\u001d\u0010\u0011\u001a\u00020\r2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\"\u0010\u0012\u001a\u00020\r2\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\bH\u0016¨\u0006\u0017"}, m28432d2 = {"LyM5;", "K", "V", "LAM5;", "", "element", "", "c", "", "elements", "e", "", "iterator", "", "h", "removeAll", "retainAll", "f", "containsAll", "LOM5;", "map", "<init>", "(LOM5;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapEntrySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n1#1,360:1\n1179#2,2:361\n1253#2,4:363\n1726#2,3:410\n84#3,2:367\n129#3,4:369\n133#3:374\n121#3:375\n134#3,5:377\n86#3,7:382\n139#3,2:389\n125#3:391\n141#3,6:397\n149#3,3:406\n93#3:409\n70#4:373\n2180#5:376\n2073#5,2:392\n1686#5:394\n2075#5,2:395\n2077#5,3:403\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapEntrySet\n*L\n209#1:361,2\n209#1:363,4\n216#1:410,3\n210#1:367,2\n210#1:369,4\n210#1:374\n210#1:375\n210#1:377,5\n210#1:382,7\n210#1:389,2\n210#1:391\n210#1:397,6\n210#1:406,3\n210#1:409\n210#1:373\n210#1:376\n210#1:392,2\n210#1:394\n210#1:395,2\n210#1:403,3\n*E\n"})
/* renamed from: yM5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52157yM5<K, V> extends AM5<K, V, Map.Entry<K, V>> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52157yM5(OM5<K, V> map) {
        super(map);
        Intrinsics.checkNotNullParameter(map, "map");
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) m3556c((Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) m3555e(collection)).booleanValue();
    }

    /* renamed from: c */
    public Void m3556c(Map.Entry<K, V> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        PM5.m90375b();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (TypeIntrinsics.isMutableMapEntry(obj)) {
            return m3554f((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public Void m3555e(Collection<? extends Map.Entry<K, V>> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        PM5.m90375b();
        throw new KotlinNothingValueException();
    }

    /* renamed from: f */
    public boolean m3554f(Map.Entry<K, V> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return Intrinsics.areEqual(m115865a().get(element.getKey()), element.getValue());
    }

    /* renamed from: h */
    public boolean m3553h(Map.Entry<K, V> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (m115865a().remove(element.getKey()) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new BP5(m115865a(), ((InterfaceC39209cZ1) m115865a().m92378f().m92374g().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (TypeIntrinsics.isMutableMapEntry(obj)) {
            return m3553h((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (m115865a().remove(((Map.Entry) it.next()).getKey()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        int collectionSizeOrDefault;
        int mapCapacity;
        int coerceAtLeast;
        Object obj;
        FR3<K, V> m92374g;
        int m92373h;
        boolean z;
        AbstractC48600sM5 m14280b;
        Object obj2;
        boolean z2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(collectionSizeOrDefault);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(mapCapacity, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(coerceAtLeast);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair m28425to = TuplesKt.m28425to(entry.getKey(), entry.getValue());
            linkedHashMap.put(m28425to.getFirst(), m28425to.getSecond());
        }
        OM5<K, V> m115865a = m115865a();
        boolean z3 = false;
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
            Iterator<Map.Entry<K, V>> it2 = m115865a.entrySet().iterator();
            while (true) {
                z = true;
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<K, V> next = it2.next();
                if (linkedHashMap.containsKey(next.getKey()) && Intrinsics.areEqual(linkedHashMap.get(next.getKey()), next.getValue())) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    builder.remove(next.getKey());
                    z3 = true;
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
        return z3;
    }
}
