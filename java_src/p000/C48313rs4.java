package p000;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aA\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a;\u0010\t\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\f¨\u0006\u000f"}, m28432d2 = {"K", "V", "", "", "key", "value", "", C17296a.f69688o, "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z", "b", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "", "Ljava/lang/Object;", "ProduceAnotherFrame", "FramePending", "runtime_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1408:1\n361#2,7:1409\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n*L\n1400#1:1409,7\n*E\n"})
/* renamed from: rs4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48313rs4 {

    /* renamed from: a */
    public static final Object f107807a = new Object();

    /* renamed from: b */
    public static final Object f107808b = new Object();

    /* renamed from: a */
    public static final <K, V> boolean m15150a(Map<K, List<V>> map, K k, V v) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        List<V> list = map.get(k);
        if (list == null) {
            list = new ArrayList<>();
            map.put(k, list);
        }
        return list.add(v);
    }

    /* renamed from: b */
    public static final <K, V> V m15149b(Map<K, List<V>> map, K k) {
        Object removeFirst;
        Intrinsics.checkNotNullParameter(map, "<this>");
        List<V> list = map.get(k);
        if (list != null) {
            removeFirst = CollectionsKt__MutableCollectionsKt.removeFirst(list);
            V v = (V) removeFirst;
            if (list.isEmpty()) {
                map.remove(k);
                return v;
            }
            return v;
        }
        return null;
    }
}
