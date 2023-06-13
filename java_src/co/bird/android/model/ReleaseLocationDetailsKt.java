package co.bird.android.model;

import co.bird.android.model.wire.WireDrop;
import co.bird.android.model.wire.configs.Config;
import co.bird.android.model.wire.configs.DeliveryConfig;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, m28432d2 = {"hour", "", "Ljava/util/Calendar;", "toReleaseLocationDetails", "", "Lco/bird/android/model/ReleaseLocationDetails;", "Lco/bird/android/model/AvailableDeliveries;", "user", "Lco/bird/android/model/User;", "config", "Lco/bird/android/model/wire/configs/DeliveryConfig;", "Lco/bird/android/model/wire/WireDrop;", "Lco/bird/android/model/wire/configs/Config;", "active", "", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nReleaseLocationDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseLocationDetails.kt\nco/bird/android/model/ReleaseLocationDetailsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,206:1\n1549#2:207\n1620#2,3:208\n1549#2:211\n1620#2,3:212\n1549#2:215\n1620#2,3:216\n*S KotlinDebug\n*F\n+ 1 ReleaseLocationDetails.kt\nco/bird/android/model/ReleaseLocationDetailsKt\n*L\n194#1:207\n194#1:208,3\n198#1:211\n198#1:212,3\n199#1:215\n199#1:216,3\n*E\n"})
/* loaded from: classes4.dex */
public final class ReleaseLocationDetailsKt {
    public static final int hour(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        return calendar.get(11);
    }

    public static final List<ReleaseLocationDetails> toReleaseLocationDetails(List<WireDrop> list, Config config, boolean z) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        List<WireDrop> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireDrop wireDrop : list2) {
            arrayList.add(new DropReleaseLocationDetails(config, wireDrop, z));
        }
        return arrayList;
    }

    public static final List<ReleaseLocationDetails> toReleaseLocationDetails(AvailableDeliveries availableDeliveries, User user, DeliveryConfig config) {
        int collectionSizeOrDefault;
        List emptyList;
        List list;
        List<ReleaseLocationDetails> plus;
        List<Delivery> deliveries;
        int collectionSizeOrDefault2;
        Intrinsics.checkNotNullParameter(availableDeliveries, "<this>");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(config, "config");
        List<Delivery> deliveries2 = availableDeliveries.getDeliveries();
        int i = 10;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(deliveries2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Iterator it = deliveries2.iterator(); it.hasNext(); it = it) {
            arrayList.add(new DeliveryReleaseLocationDetails(config, (Delivery) it.next(), null, true, null, null, false, null, 244, null));
            i = i;
        }
        int i2 = i;
        DeliveryRoute currentRoute = availableDeliveries.getCurrentRoute();
        if (currentRoute != null && (deliveries = currentRoute.getDeliveries()) != null) {
            List<Delivery> list2 = deliveries;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, i2);
            list = new ArrayList(collectionSizeOrDefault2);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                Iterator it3 = it2;
                List list3 = list;
                list3.add(new DeliveryReleaseLocationDetails(config, (Delivery) it2.next(), user.getId(), true, null, null, false, null, 240, null));
                list = list3;
                it2 = it3;
            }
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list = emptyList;
        }
        plus = CollectionsKt___CollectionsKt.plus((Collection) arrayList, (Iterable) list);
        return plus;
    }
}
