package co.bird.android.app.feature.map.modelmanager;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000¨\u0006\u0006"}, m28432d2 = {"alreadyContains", "", "T", "", "Lco/bird/android/app/feature/map/modelmanager/Filter;", "filter", "co.bird.android.feature.map"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nMapModelManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapModelManager.kt\nco/bird/android/app/feature/map/modelmanager/MapModelManagerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1747#2,3:31\n*S KotlinDebug\n*F\n+ 1 MapModelManager.kt\nco/bird/android/app/feature/map/modelmanager/MapModelManagerKt\n*L\n29#1:31,3\n*E\n"})
/* loaded from: classes2.dex */
public final class MapModelManagerKt {
    public static final <T> boolean alreadyContains(List<? extends Filter<T>> list, Filter<T> filter) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(filter, "filter");
        List<? extends Filter<T>> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((Filter) it.next()).getId(), filter.getId())) {
                return true;
            }
        }
        return false;
    }
}
