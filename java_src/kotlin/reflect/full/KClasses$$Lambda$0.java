package kotlin.reflect.full;

import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class KClasses$$Lambda$0 implements DFS.Neighbors {
    public static final KClasses$$Lambda$0 INSTANCE = new KClasses$$Lambda$0();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        Iterable _get_allSupertypes_$lambda$14;
        _get_allSupertypes_$lambda$14 = KClasses._get_allSupertypes_$lambda$14((KType) obj);
        return _get_allSupertypes_$lambda$14;
    }
}
