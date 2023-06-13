package co.bird.android.app.feature.map.cluster.bird;

import co.bird.android.app.feature.map.cluster.BaseUnreadyMarkerOverrides;
import co.bird.android.app.feature.map.cluster.BirdMarkerClusterItem;
import co.bird.android.model.wire.WireBird;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J(\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\n2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\nH\u0016¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/bird/UnreadyMarkerOverrideBirds;", "Lco/bird/android/app/feature/map/cluster/BaseUnreadyMarkerOverrides;", "Lco/bird/android/model/wire/WireBird;", "marker", "", "markerId", "Lco/bird/android/app/feature/map/cluster/BirdMarkerClusterItem;", "item", "", "holdIfNotReady", "", "items", "holdNonReadyItems", "LBK2;", "markerOverridesManager", "<init>", "(LBK2;)V", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUnreadyMarkerOverrideBirds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnreadyMarkerOverrideBirds.kt\nco/bird/android/app/feature/map/cluster/bird/UnreadyMarkerOverrideBirds\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n2689#2,10:45\n1855#3,2:55\n1549#3:57\n1620#3,3:58\n*S KotlinDebug\n*F\n+ 1 UnreadyMarkerOverrideBirds.kt\nco/bird/android/app/feature/map/cluster/bird/UnreadyMarkerOverrideBirds\n*L\n36#1:45,10\n39#1:55,2\n41#1:57\n41#1:58,3\n*E\n"})
/* loaded from: classes2.dex */
public final class UnreadyMarkerOverrideBirds extends BaseUnreadyMarkerOverrides<WireBird> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnreadyMarkerOverrideBirds(BK2 markerOverridesManager) {
        super(markerOverridesManager);
        Intrinsics.checkNotNullParameter(markerOverridesManager, "markerOverridesManager");
    }

    @Override // co.bird.android.app.feature.map.cluster.UnreadyMarkerOverrides
    public boolean holdIfNotReady(BirdMarkerClusterItem<WireBird> item) {
        Intrinsics.checkNotNullParameter(item, "item");
        C34360Lt2 mo114098c = getMarkerOverridesManager().mo114098c(item.getMarker());
        boolean m96241c = mo114098c.m96241c();
        if (m96241c) {
            getNotReady().add(new BaseUnreadyMarkerOverrides.HeldClusterItem<>(item, mo114098c));
        } else {
            getReady().add(mo114098c.m96242b());
        }
        return !m96241c;
    }

    @Override // co.bird.android.app.feature.map.cluster.UnreadyMarkerOverrides
    public List<BirdMarkerClusterItem<WireBird>> holdNonReadyItems(List<? extends BirdMarkerClusterItem<WireBird>> items) {
        Sequence asSequence;
        Sequence map;
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(items, "items");
        asSequence = CollectionsKt___CollectionsKt.asSequence(items);
        map = SequencesKt___SequencesKt.map(asSequence, new UnreadyMarkerOverrideBirds$holdNonReadyItems$1(this));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : map) {
            if (((BaseUnreadyMarkerOverrides.HeldClusterItem) obj).getLoadingOverride().m96241c()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        getNotReady().addAll((List) pair.component2());
        List<BaseUnreadyMarkerOverrides.HeldClusterItem> list = (List) pair.component1();
        for (BaseUnreadyMarkerOverrides.HeldClusterItem heldClusterItem : list) {
            getReady().add(heldClusterItem.getLoadingOverride().m96242b());
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
        for (BaseUnreadyMarkerOverrides.HeldClusterItem heldClusterItem2 : list) {
            arrayList3.add(heldClusterItem2.getItem());
        }
        return arrayList3;
    }

    @Override // co.bird.android.app.feature.map.cluster.BaseUnreadyMarkerOverrides
    public String markerId(WireBird marker) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        return marker.getId();
    }
}
