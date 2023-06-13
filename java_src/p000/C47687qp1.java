package p000;

import co.bird.android.model.persistence.nestedstructures.FleetRating;
import co.bird.android.model.persistence.nestedstructures.FleetRatingGroup;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, m28432d2 = {"Lqp1;", "", "Lco/bird/android/model/persistence/nestedstructures/FleetRating;", "rating", "", "LH6;", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetRatingConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetRatingConverter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetRatingConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,28:1\n1549#2:29\n1620#2,3:30\n*S KotlinDebug\n*F\n+ 1 FleetRatingConverter.kt\nco/bird/android/feature/fleetstatus/state/status/adapters/FleetRatingConverter\n*L\n17#1:29\n17#1:30,3\n*E\n"})
/* renamed from: qp1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47687qp1 {
    /* renamed from: a */
    public final List<C3023H6> m16952a(FleetRating rating) {
        int collectionSizeOrDefault;
        List mutableList;
        List<C3023H6> mutableListOf;
        Intrinsics.checkNotNullParameter(rating, "rating");
        C3023H6[] c3023h6Arr = new C3023H6[1];
        C2637G6 c2637g6 = new C2637G6(rating, C38125aj4.item_fleet_rating_average, false, 4, null);
        List<FleetRatingGroup> groups = rating.getGroups();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(groups, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (FleetRatingGroup fleetRatingGroup : groups) {
            arrayList.add(new C2637G6(fleetRatingGroup, C38125aj4.item_fleet_rating_group, false));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        c3023h6Arr[0] = new C3023H6(mutableList, c2637g6, null, 4, null);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(c3023h6Arr);
        return mutableListOf;
    }
}
