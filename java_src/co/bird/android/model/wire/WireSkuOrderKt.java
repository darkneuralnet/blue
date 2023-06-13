package co.bird.android.model.wire;

import co.bird.android.model.constant.SkuOrderStatus;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0005\u001a\n\u0010\u0007\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\t\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\n\u001a\u00020\u0004*\u00020\u0002¨\u0006\u000b"}, m28432d2 = {"commodity", "", "Lco/bird/android/model/wire/WireTransferOrderLineItem;", "completed", "", "Lco/bird/android/model/wire/WireSkuOrder;", "packingType", "readyForPickup", "received", "receivedInDestination", "vehicleType", "model-wire_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireSkuOrderKt {
    public static final String commodity(WireTransferOrderLineItem wireTransferOrderLineItem) {
        Intrinsics.checkNotNullParameter(wireTransferOrderLineItem, "<this>");
        Map<String, String> commodities = wireTransferOrderLineItem.getCommodities();
        String upperCase = wireTransferOrderLineItem.getCommodity().toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
        String str = commodities.get(upperCase);
        if (str == null) {
            return wireTransferOrderLineItem.getCommodity();
        }
        return str;
    }

    public static final boolean completed(WireSkuOrder wireSkuOrder) {
        Intrinsics.checkNotNullParameter(wireSkuOrder, "<this>");
        if (wireSkuOrder.getStatus() != SkuOrderStatus.PROCESSED && wireSkuOrder.getStatus() != SkuOrderStatus.COMPLETED) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r2 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String packingType(WireSkuOrder wireSkuOrder) {
        Map<String, String> packageTypes;
        String str;
        Intrinsics.checkNotNullParameter(wireSkuOrder, "<this>");
        WireContainerOrder containerOrder = wireSkuOrder.getContainerOrder();
        if (containerOrder != null && (packageTypes = containerOrder.getPackageTypes()) != null) {
            String packageType = wireSkuOrder.getPackageType();
            if (packageType != null) {
                str = packageType.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toUpperCase()");
            }
            str = "";
            return packageTypes.get(str);
        }
        return null;
    }

    public static final boolean readyForPickup(WireSkuOrder wireSkuOrder) {
        Intrinsics.checkNotNullParameter(wireSkuOrder, "<this>");
        if (wireSkuOrder.getStatus() == SkuOrderStatus.READY_FOR_PICKUP) {
            return true;
        }
        return false;
    }

    public static final boolean received(WireSkuOrder wireSkuOrder) {
        Intrinsics.checkNotNullParameter(wireSkuOrder, "<this>");
        if (wireSkuOrder.getStatus() != SkuOrderStatus.RECEIVED && wireSkuOrder.getStatus() != SkuOrderStatus.READY_FOR_PROCESSING) {
            return false;
        }
        return true;
    }

    public static final boolean receivedInDestination(WireSkuOrder wireSkuOrder) {
        Intrinsics.checkNotNullParameter(wireSkuOrder, "<this>");
        if (wireSkuOrder.getStatus() != SkuOrderStatus.PROCESSED && wireSkuOrder.getStatus() != SkuOrderStatus.PROCESSED_WITH_OSD && wireSkuOrder.getStatus() != SkuOrderStatus.RECEIVED && wireSkuOrder.getStatus() != SkuOrderStatus.RECEIVED_WITH_OSD) {
            return false;
        }
        return true;
    }

    public static final boolean vehicleType(WireTransferOrderLineItem wireTransferOrderLineItem) {
        Intrinsics.checkNotNullParameter(wireTransferOrderLineItem, "<this>");
        return Intrinsics.areEqual(wireTransferOrderLineItem.getCommodityType(), "vehicle");
    }
}
