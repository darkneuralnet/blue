package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.SkuOrderStatus;
import co.bird.android.model.constant.TransferOrderDemandSource;
import co.bird.android.model.constant.TransferOrderReason;
import co.bird.android.model.constant.TransferOrderStatus;
import co.bird.android.model.persistence.SkuOrder;
import co.bird.android.model.persistence.nestedstructures.Fleet;
import co.bird.android.model.persistence.nestedstructures.TransferOrder;
import co.bird.android.model.persistence.nestedstructures.TransferOrderLineItem;
import co.bird.android.model.persistence.nestedstructures.Warehouse;
import co.bird.android.model.wire.WireFleet;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireTransferOrder;
import co.bird.android.model.wire.WireTransferOrderLineItem;
import co.bird.android.model.wire.WireWarehouse;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002\u001a\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002\u001a\f\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/model/wire/WireSkuOrder;", "Lco/bird/android/model/persistence/SkuOrder;", C17296a.f69688o, "Lco/bird/android/model/wire/WireTransferOrderLineItem;", "Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireTransferOrder;", "Lco/bird/android/model/persistence/nestedstructures/TransferOrder;", "c", "Lco/bird/android/model/wire/WireFleet;", "Lco/bird/android/model/persistence/nestedstructures/Fleet;", "b", "Lco/bird/android/model/wire/WireWarehouse;", "Lco/bird/android/model/persistence/nestedstructures/Warehouse;", "e", "co.bird.android.repository.operator-order-view"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: pi3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47026pi3 {
    /* renamed from: a */
    public static final SkuOrder m18930a(WireSkuOrder wireSkuOrder) {
        Intrinsics.checkNotNullParameter(wireSkuOrder, "<this>");
        String id = wireSkuOrder.getId();
        Integer packagingQuantity = wireSkuOrder.getPackagingQuantity();
        String packageType = wireSkuOrder.getPackageType();
        int quantity = wireSkuOrder.getQuantity();
        SkuOrderStatus status = wireSkuOrder.getStatus();
        String transferOrderLineItemId = wireSkuOrder.getTransferOrderLineItemId();
        WireTransferOrderLineItem transferOrderLineItem = wireSkuOrder.getTransferOrderLineItem();
        Intrinsics.checkNotNull(transferOrderLineItem);
        return new SkuOrder(id, packagingQuantity, packageType, quantity, status, transferOrderLineItemId, m18927d(transferOrderLineItem), wireSkuOrder.getUpdatedAt());
    }

    /* renamed from: b */
    public static final Fleet m18929b(WireFleet wireFleet) {
        return new Fleet(wireFleet.getId(), wireFleet.getName(), wireFleet.getDescription(), wireFleet.getPartnerId());
    }

    /* renamed from: c */
    public static final TransferOrder m18928c(WireTransferOrder wireTransferOrder) {
        String id = wireTransferOrder.getId();
        TransferOrderDemandSource demandSource = wireTransferOrder.getDemandSource();
        TransferOrderStatus status = wireTransferOrder.getStatus();
        TransferOrderReason reason = wireTransferOrder.getReason();
        String originWarehouseId = wireTransferOrder.getOriginWarehouseId();
        String destinationWarehouseId = wireTransferOrder.getDestinationWarehouseId();
        DateTime actualDeliveryDate = wireTransferOrder.getActualDeliveryDate();
        DateTime targetDeliveryDate = wireTransferOrder.getTargetDeliveryDate();
        Intrinsics.checkNotNull(targetDeliveryDate);
        DateTime createdAt = wireTransferOrder.getCreatedAt();
        DateTime updatedAt = wireTransferOrder.getUpdatedAt();
        WireWarehouse originWarehouse = wireTransferOrder.getOriginWarehouse();
        Intrinsics.checkNotNull(originWarehouse);
        Warehouse m18926e = m18926e(originWarehouse);
        WireWarehouse destinationWarehouse = wireTransferOrder.getDestinationWarehouse();
        Intrinsics.checkNotNull(destinationWarehouse);
        return new TransferOrder(id, demandSource, status, reason, originWarehouseId, destinationWarehouseId, actualDeliveryDate, targetDeliveryDate, createdAt, updatedAt, m18926e, m18926e(destinationWarehouse));
    }

    /* renamed from: d */
    public static final TransferOrderLineItem m18927d(WireTransferOrderLineItem wireTransferOrderLineItem) {
        String id = wireTransferOrderLineItem.getId();
        String commodity = wireTransferOrderLineItem.getCommodity();
        String commodityType = wireTransferOrderLineItem.getCommodityType();
        boolean usedCondition = wireTransferOrderLineItem.getUsedCondition();
        WireTransferOrder transferOrder = wireTransferOrderLineItem.getTransferOrder();
        Intrinsics.checkNotNull(transferOrder);
        TransferOrder m18928c = m18928c(transferOrder);
        Map<String, String> commodities = wireTransferOrderLineItem.getCommodities();
        WireFleet originFleet = wireTransferOrderLineItem.getOriginFleet();
        Intrinsics.checkNotNull(originFleet);
        Fleet m18929b = m18929b(originFleet);
        WireFleet destinationFleet = wireTransferOrderLineItem.getDestinationFleet();
        Intrinsics.checkNotNull(destinationFleet);
        return new TransferOrderLineItem(id, commodity, commodityType, usedCondition, m18928c, commodities, m18929b, m18929b(destinationFleet));
    }

    /* renamed from: e */
    public static final Warehouse m18926e(WireWarehouse wireWarehouse) {
        return new Warehouse(wireWarehouse.getId(), wireWarehouse.getName());
    }
}
