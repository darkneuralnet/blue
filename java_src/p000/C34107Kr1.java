package p000;

import co.bird.android.model.persistence.FleetStatusSummary;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\t"}, m28432d2 = {"LKr1;", "", "", "Lco/bird/android/model/persistence/FleetStatusSummary;", "summaries", "LH6;", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetsOverviewConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetsOverviewConverter.kt\nco/bird/android/feature/fleetstatus/common/fleets/adapters/FleetsOverviewConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1549#2:18\n1620#2,3:19\n1#3:22\n*S KotlinDebug\n*F\n+ 1 FleetsOverviewConverter.kt\nco/bird/android/feature/fleetstatus/common/fleets/adapters/FleetsOverviewConverter\n*L\n12#1:18\n12#1:19,3\n*E\n"})
/* renamed from: Kr1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34107Kr1 {
    /* renamed from: a */
    public final List<C3023H6> m98235a(List<FleetStatusSummary> summaries) {
        int collectionSizeOrDefault;
        List mutableList;
        List<C3023H6> listOf;
        Intrinsics.checkNotNullParameter(summaries, "summaries");
        List<FleetStatusSummary> list = summaries;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (FleetStatusSummary fleetStatusSummary : list) {
            arrayList.add(new C2637G6(fleetStatusSummary, C38125aj4.item_fleet_status_summary, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf;
    }
}
