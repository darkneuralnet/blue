package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireContainerOrder;
import co.bird.android.model.wire.WireItemScrapReason;
import co.bird.android.model.wire.WireSkuOrder;
import co.bird.android.model.wire.WireSkuScanItem;
import co.bird.android.model.wire.WireSkuScannedItems;
import co.bird.android.model.wire.WireTransferOrder;
import co.bird.android.model.wire.WireTransferOrderClosedIncompleteReason;
import co.bird.android.model.wire.WireTransferOrderFilter;
import co.bird.api.request.BillOfLadingRequestBody;
import co.bird.api.request.BulkSkuItemScanRequestBody;
import co.bird.api.request.SkuItemScanRequestBody;
import co.bird.api.request.SkuOrderMissingRequestBody;
import co.bird.api.request.TestRideRequestBody;
import co.bird.api.response.BulkScanItemResponse;
import co.bird.api.response.OperatorOrderMetadataResponse;
import co.bird.api.response.OperatorOrderViewsResponse;
import co.bird.api.response.ScrapOrderViewResponse;
import co.bird.api.response.ServiceCenterOrderViewResponse;
import co.bird.api.response.TestRideResponse;
import co.bird.api.response.TransferOrderVehicleViewResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.util.List;
import kotlin.Metadata;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J<\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\tH'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\tH'J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\tH'J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\t2\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'J\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\t2\b\b\u0001\u0010\u001a\u001a\u00020\u0019H'J\u0012\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\u001a\u001a\u00020\u001dH'J\u0012\u0010!\u001a\u00020\u001e2\b\b\u0001\u0010 \u001a\u00020\u0002H'J\u0014\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00070\tH'J\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\t2\b\b\u0001\u0010$\u001a\u00020\u0002H'J\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\t2\b\b\u0001\u0010\u001a\u001a\u00020'H'J\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\t2\b\b\u0001\u0010\u001a\u001a\u00020*H'J\u0018\u0010.\u001a\b\u0012\u0004\u0012\u00020%0\t2\b\b\u0001\u0010\u001a\u001a\u00020-H'J\u001e\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00070\t2\b\b\u0001\u0010/\u001a\u00020\u0002H'J\"\u00104\u001a\b\u0012\u0004\u0012\u0002030\t2\b\b\u0001\u0010 \u001a\u00020\u00022\b\b\u0001\u00102\u001a\u00020\u0002H'J\u0018\u00106\u001a\b\u0012\u0004\u0012\u0002050\t2\b\b\u0001\u0010/\u001a\u00020\u0002H'¨\u00067"}, m28432d2 = {"Lh86;", "", "", "warehouseId", "Lorg/joda/time/DateTime;", "startDate", "endDate", "", "statusFilters", "Lio/reactivex/F;", "Lco/bird/api/response/ServiceCenterOrderViewResponse;", "o", "Lco/bird/api/response/OperatorOrderViewsResponse;", "e", "Lco/bird/api/response/ScrapOrderViewResponse;", "h", "Lco/bird/android/model/wire/WireTransferOrderFilter;", "c", "Lco/bird/api/response/OperatorOrderMetadataResponse;", "n", "skuOrderId", "Lco/bird/android/model/wire/WireSkuOrder;", "m", "Lco/bird/android/model/wire/WireSkuScannedItems;", "i", "Lco/bird/api/request/SkuItemScanRequestBody;", "body", "Lco/bird/android/model/wire/WireSkuScanItem;", "q", "Lco/bird/api/request/SkuOrderMissingRequestBody;", "Lio/reactivex/c;", "f", "id", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireItemScrapReason;", "O", "containerOrderId", "Lco/bird/android/model/wire/WireContainerOrder;", "l", "Lco/bird/api/request/BulkSkuItemScanRequestBody;", "Lco/bird/api/response/BulkScanItemResponse;", "g", "Lco/bird/api/request/TestRideRequestBody;", "Lco/bird/api/response/TestRideResponse;", "k", "Lco/bird/api/request/BillOfLadingRequestBody;", "j", "transferOrderId", "Lco/bird/android/model/wire/WireTransferOrderClosedIncompleteReason;", "p", "reason", "Lco/bird/android/model/wire/WireTransferOrder;", "b", "Lco/bird/api/response/TransferOrderVehicleViewResponse;", C17296a.f69688o, "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: h86  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC41951h86 {
    @NA1("v1/sku-order/scrap-reasons")
    /* renamed from: O */
    AbstractC23442F<List<WireItemScrapReason>> m36827O();

    @NA1("v1/transfer-order-vehicle-view/operator-accept-details")
    /* renamed from: a */
    AbstractC23442F<TransferOrderVehicleViewResponse> m36826a(@InterfaceC37017Xc4("transfer_order_id") String str);

    @CD3("v1/transfer-order/close-incomplete")
    /* renamed from: b */
    AbstractC23442F<WireTransferOrder> m36825b(@InterfaceC37017Xc4("id") String str, @InterfaceC37017Xc4("reason") String str2);

    @NA1("v1/order-view/status-filters")
    /* renamed from: c */
    AbstractC23442F<List<WireTransferOrderFilter>> m36824c();

    @KF0("v1/sku-order/scanned-item")
    /* renamed from: d */
    AbstractC23461c m36823d(@InterfaceC37017Xc4("id") String str);

    @NA1("v1/order-view/operator-active")
    /* renamed from: e */
    AbstractC23442F<OperatorOrderViewsResponse> m36822e();

    @CD3("v1/sku-order/scanned-items/not-received")
    /* renamed from: f */
    AbstractC23461c m36821f(@InterfaceC6404PY SkuOrderMissingRequestBody skuOrderMissingRequestBody);

    @AD3("v1/sku-order/scanned-items")
    /* renamed from: g */
    AbstractC23442F<BulkScanItemResponse> m36820g(@InterfaceC6404PY BulkSkuItemScanRequestBody bulkSkuItemScanRequestBody);

    @NA1("/v1/order-view/scrap-active")
    /* renamed from: h */
    AbstractC23442F<ScrapOrderViewResponse> m36819h(@InterfaceC37017Xc4("warehouse_id") String str);

    @NA1("v1/sku-order/scanned-item")
    /* renamed from: i */
    AbstractC23442F<WireSkuScannedItems> m36818i(@InterfaceC37017Xc4("sku_order_id") String str);

    @CD3("v1/container-order/bill-of-lading")
    /* renamed from: j */
    AbstractC23442F<WireContainerOrder> m36817j(@InterfaceC6404PY BillOfLadingRequestBody billOfLadingRequestBody);

    @AD3("v1/test-ride/start")
    /* renamed from: k */
    AbstractC23442F<TestRideResponse> m36816k(@InterfaceC6404PY TestRideRequestBody testRideRequestBody);

    @NA1("v1/container-order/by-id")
    /* renamed from: l */
    AbstractC23442F<WireContainerOrder> m36815l(@InterfaceC37017Xc4("id") String str);

    @NA1("v1/sku-order/by-id")
    /* renamed from: m */
    AbstractC23442F<WireSkuOrder> m36814m(@InterfaceC37017Xc4("id") String str);

    @NA1("v1/order-view/operator-active-metadata")
    /* renamed from: n */
    AbstractC23442F<OperatorOrderMetadataResponse> m36813n();

    @NA1("v1/order-view/service-center-active")
    /* renamed from: o */
    AbstractC23442F<ServiceCenterOrderViewResponse> m36812o(@InterfaceC37017Xc4("warehouse_id") String str, @InterfaceC37017Xc4("start_date") DateTime dateTime, @InterfaceC37017Xc4("end_date") DateTime dateTime2, @InterfaceC37017Xc4("status_filters") List<String> list);

    @NA1("v1/transfer-order/closed-incomplete-reasons")
    /* renamed from: p */
    AbstractC23442F<List<WireTransferOrderClosedIncompleteReason>> m36811p(@InterfaceC37017Xc4("transfer_order_id") String str);

    @AD3("v1/sku-order/scanned-item")
    /* renamed from: q */
    AbstractC23442F<WireSkuScanItem> m36810q(@InterfaceC6404PY SkuItemScanRequestBody skuItemScanRequestBody);
}
