package co.bird.android.model.wire;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000(\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\b\u001a\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\u0002\u001a\u0012\u0010\r\u001a\u00020\u0002*\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006¨\u0006\u000f"}, m28432d2 = {"filteredItems", "", "Lco/bird/android/model/wire/WireSuccessfulScannedItem;", "skuModel", "", "fallbackReturnAll", "", "hasScanItems", "Lco/bird/android/model/wire/WireSkuScannedItems;", "inboundMissingItems", "inboundScans", "toWireSkuScanItem", "Lco/bird/android/model/wire/WireSkuScanItem;", "toWireSuccessfulScannedItem", "received", "model-wire_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nWireSkuScannedItems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WireSkuScannedItems.kt\nco/bird/android/model/wire/WireSkuScannedItemsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n766#2:139\n857#2,2:140\n766#2:142\n857#2,2:143\n766#2:145\n857#2,2:146\n*S KotlinDebug\n*F\n+ 1 WireSkuScannedItems.kt\nco/bird/android/model/wire/WireSkuScannedItemsKt\n*L\n92#1:139\n92#1:140,2\n99#1:142\n99#1:143,2\n111#1:145\n111#1:146,2\n*E\n"})
/* loaded from: classes4.dex */
public final class WireSkuScannedItemsKt {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    public static final List<WireSuccessfulScannedItem> filteredItems(List<WireSuccessfulScannedItem> list, String str, boolean z) {
        List<WireSuccessfulScannedItem> list2;
        String str2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (str != null) {
            list2 = new ArrayList<>();
            for (?? r2 : list) {
                WireSkuVehicle bird = ((WireSuccessfulScannedItem) r2).getBird();
                if (bird != null) {
                    str2 = bird.getModelVersionTitle();
                } else {
                    str2 = null;
                }
                if (Intrinsics.areEqual(str2, str)) {
                    list2.add(r2);
                }
            }
        } else {
            list2 = list;
        }
        if (!list2.isEmpty() || !z) {
            return list2;
        }
        return list;
    }

    public static /* synthetic */ List filteredItems$default(List list, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return filteredItems(list, str, z);
    }

    public static final boolean hasScanItems(WireSkuScannedItems wireSkuScannedItems) {
        Intrinsics.checkNotNullParameter(wireSkuScannedItems, "<this>");
        if ((!wireSkuScannedItems.getSuccessfulScannedItems().isEmpty()) || (!wireSkuScannedItems.getFailedScannedItems().isEmpty())) {
            return true;
        }
        return false;
    }

    public static final List<WireSuccessfulScannedItem> inboundMissingItems(List<WireSuccessfulScannedItem> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((WireSuccessfulScannedItem) obj).getReceived()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List<WireSuccessfulScannedItem> inboundScans(List<WireSuccessfulScannedItem> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((WireSuccessfulScannedItem) obj).getReceived()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final WireSkuScanItem toWireSkuScanItem(WireSuccessfulScannedItem wireSuccessfulScannedItem) {
        Intrinsics.checkNotNullParameter(wireSuccessfulScannedItem, "<this>");
        return new WireSkuScanItem(wireSuccessfulScannedItem.getItemId(), wireSuccessfulScannedItem.getItemDisplayName(), null, 0, 0, wireSuccessfulScannedItem.getBird(), null, null, 132, null);
    }

    public static final WireSuccessfulScannedItem toWireSuccessfulScannedItem(WireSkuScanItem wireSkuScanItem, boolean z) {
        Intrinsics.checkNotNullParameter(wireSkuScanItem, "<this>");
        String itemId = wireSkuScanItem.getItemId();
        String itemDisplayName = wireSkuScanItem.getItemDisplayName();
        WireSkuVehicle bird = wireSkuScanItem.getBird();
        DateTime now = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now, "now()");
        DateTime now2 = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(now2, "now()");
        return new WireSuccessfulScannedItem("", itemId, itemDisplayName, null, bird, z, null, now, now2, 72, null);
    }
}
