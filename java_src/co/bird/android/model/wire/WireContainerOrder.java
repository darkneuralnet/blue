package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ContainerOrderStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b=\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u0015\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00102J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0018HÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010L\u001a\u00020\bHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¦\u0002\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020\b2\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020\u0012HÖ\u0001J\t\u0010W\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010&R\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\"\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010&R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010!R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010!R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010&¨\u0006X"}, m28432d2 = {"Lco/bird/android/model/wire/WireContainerOrder;", "", "id", "", "actualDeliveryDate", "Lorg/joda/time/DateTime;", "actualPickupDate", "booked", "", "carrierName", "carrierNames", "", "carrierPOCName", "carrierPOCPhone", "containerType", "containerTypes", "notes", "packagingQuantity", "", "packageType", "packageTypes", "shippingCarrierId", "shippingCarrierName", "status", "Lco/bird/android/model/constant/ContainerOrderStatus;", "skuOrders", "", "Lco/bird/android/model/wire/WireSkuOrder;", "targetDeliveryDate", "targetPickupDate", "trackingId", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ContainerOrderStatus;Ljava/util/List;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;)V", "getActualDeliveryDate", "()Lorg/joda/time/DateTime;", "getActualPickupDate", "getBooked", "()Z", "getCarrierName", "()Ljava/lang/String;", "getCarrierNames", "()Ljava/util/Map;", "getCarrierPOCName", "getCarrierPOCPhone", "getContainerType", "getContainerTypes", "getId", "getNotes", "getPackageType", "getPackageTypes", "getPackagingQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShippingCarrierId", "getShippingCarrierName", "getSkuOrders", "()Ljava/util/List;", "getStatus", "()Lco/bird/android/model/constant/ContainerOrderStatus;", "getTargetDeliveryDate", "getTargetPickupDate", "getTrackingId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ContainerOrderStatus;Ljava/util/List;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;)Lco/bird/android/model/wire/WireContainerOrder;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireContainerOrder {
    @JsonProperty("actual_delivery_date")
    @InterfaceC41208ft5("actual_delivery_date")
    private final DateTime actualDeliveryDate;
    @JsonProperty("actual_pickup_date")
    @InterfaceC41208ft5("actual_pickup_date")
    private final DateTime actualPickupDate;
    @JsonProperty("booked")
    @InterfaceC41208ft5("booked")
    private final boolean booked;
    @JsonProperty("carrier_name")
    @InterfaceC41208ft5("carrier_name")
    private final String carrierName;
    @JsonProperty("carrier_names")
    @InterfaceC41208ft5("carrier_names")
    private final Map<String, String> carrierNames;
    @JsonProperty("carrier_poc_name")
    @InterfaceC41208ft5("carrier_poc_name")
    private final String carrierPOCName;
    @JsonProperty("carrier_poc_phone")
    @InterfaceC41208ft5("carrier_poc_phone")
    private final String carrierPOCPhone;
    @JsonProperty("container_type")
    @InterfaceC41208ft5("container_type")
    private final String containerType;
    @JsonProperty("container_types")
    @InterfaceC41208ft5("container_types")
    private final Map<String, String> containerTypes;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66722id;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    @JsonProperty("package_type")
    @InterfaceC41208ft5("package_type")
    private final String packageType;
    @JsonProperty("package_types")
    @InterfaceC41208ft5("package_types")
    private final Map<String, String> packageTypes;
    @JsonProperty("packing_quantity")
    @InterfaceC41208ft5("packing_quantity")
    private final Integer packagingQuantity;
    @InterfaceC41208ft5("shipping_carrier_id")
    private final String shippingCarrierId;
    @InterfaceC41208ft5("shipping_carrier_name")
    private final String shippingCarrierName;
    @JsonProperty("sku_orders")
    @InterfaceC41208ft5("sku_orders")
    private final List<WireSkuOrder> skuOrders;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final ContainerOrderStatus status;
    @JsonProperty("target_delivery_date")
    @InterfaceC41208ft5("target_delivery_date")
    private final DateTime targetDeliveryDate;
    @JsonProperty("target_pickup_date")
    @InterfaceC41208ft5("target_pickup_date")
    private final DateTime targetPickupDate;
    @JsonProperty("tracking_id")
    @InterfaceC41208ft5("tracking_id")
    private final String trackingId;

    public WireContainerOrder() {
        this(null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    public final String component1() {
        return this.f66722id;
    }

    public final Map<String, String> component10() {
        return this.containerTypes;
    }

    public final String component11() {
        return this.notes;
    }

    public final Integer component12() {
        return this.packagingQuantity;
    }

    public final String component13() {
        return this.packageType;
    }

    public final Map<String, String> component14() {
        return this.packageTypes;
    }

    public final String component15() {
        return this.shippingCarrierId;
    }

    public final String component16() {
        return this.shippingCarrierName;
    }

    public final ContainerOrderStatus component17() {
        return this.status;
    }

    public final List<WireSkuOrder> component18() {
        return this.skuOrders;
    }

    public final DateTime component19() {
        return this.targetDeliveryDate;
    }

    public final DateTime component2() {
        return this.actualDeliveryDate;
    }

    public final DateTime component20() {
        return this.targetPickupDate;
    }

    public final String component21() {
        return this.trackingId;
    }

    public final DateTime component3() {
        return this.actualPickupDate;
    }

    public final boolean component4() {
        return this.booked;
    }

    public final String component5() {
        return this.carrierName;
    }

    public final Map<String, String> component6() {
        return this.carrierNames;
    }

    public final String component7() {
        return this.carrierPOCName;
    }

    public final String component8() {
        return this.carrierPOCPhone;
    }

    public final String component9() {
        return this.containerType;
    }

    public final WireContainerOrder copy(String id, DateTime dateTime, DateTime dateTime2, boolean z, String str, Map<String, String> carrierNames, String str2, String str3, String str4, Map<String, String> containerTypes, String str5, Integer num, String str6, Map<String, String> packageTypes, String str7, String str8, ContainerOrderStatus status, List<WireSkuOrder> skuOrders, DateTime dateTime3, DateTime dateTime4, String str9) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(carrierNames, "carrierNames");
        Intrinsics.checkNotNullParameter(containerTypes, "containerTypes");
        Intrinsics.checkNotNullParameter(packageTypes, "packageTypes");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(skuOrders, "skuOrders");
        return new WireContainerOrder(id, dateTime, dateTime2, z, str, carrierNames, str2, str3, str4, containerTypes, str5, num, str6, packageTypes, str7, str8, status, skuOrders, dateTime3, dateTime4, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireContainerOrder) {
            WireContainerOrder wireContainerOrder = (WireContainerOrder) obj;
            return Intrinsics.areEqual(this.f66722id, wireContainerOrder.f66722id) && Intrinsics.areEqual(this.actualDeliveryDate, wireContainerOrder.actualDeliveryDate) && Intrinsics.areEqual(this.actualPickupDate, wireContainerOrder.actualPickupDate) && this.booked == wireContainerOrder.booked && Intrinsics.areEqual(this.carrierName, wireContainerOrder.carrierName) && Intrinsics.areEqual(this.carrierNames, wireContainerOrder.carrierNames) && Intrinsics.areEqual(this.carrierPOCName, wireContainerOrder.carrierPOCName) && Intrinsics.areEqual(this.carrierPOCPhone, wireContainerOrder.carrierPOCPhone) && Intrinsics.areEqual(this.containerType, wireContainerOrder.containerType) && Intrinsics.areEqual(this.containerTypes, wireContainerOrder.containerTypes) && Intrinsics.areEqual(this.notes, wireContainerOrder.notes) && Intrinsics.areEqual(this.packagingQuantity, wireContainerOrder.packagingQuantity) && Intrinsics.areEqual(this.packageType, wireContainerOrder.packageType) && Intrinsics.areEqual(this.packageTypes, wireContainerOrder.packageTypes) && Intrinsics.areEqual(this.shippingCarrierId, wireContainerOrder.shippingCarrierId) && Intrinsics.areEqual(this.shippingCarrierName, wireContainerOrder.shippingCarrierName) && this.status == wireContainerOrder.status && Intrinsics.areEqual(this.skuOrders, wireContainerOrder.skuOrders) && Intrinsics.areEqual(this.targetDeliveryDate, wireContainerOrder.targetDeliveryDate) && Intrinsics.areEqual(this.targetPickupDate, wireContainerOrder.targetPickupDate) && Intrinsics.areEqual(this.trackingId, wireContainerOrder.trackingId);
        }
        return false;
    }

    public final DateTime getActualDeliveryDate() {
        return this.actualDeliveryDate;
    }

    public final DateTime getActualPickupDate() {
        return this.actualPickupDate;
    }

    public final boolean getBooked() {
        return this.booked;
    }

    public final String getCarrierName() {
        return this.carrierName;
    }

    public final Map<String, String> getCarrierNames() {
        return this.carrierNames;
    }

    public final String getCarrierPOCName() {
        return this.carrierPOCName;
    }

    public final String getCarrierPOCPhone() {
        return this.carrierPOCPhone;
    }

    public final String getContainerType() {
        return this.containerType;
    }

    public final Map<String, String> getContainerTypes() {
        return this.containerTypes;
    }

    public final String getId() {
        return this.f66722id;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final String getPackageType() {
        return this.packageType;
    }

    public final Map<String, String> getPackageTypes() {
        return this.packageTypes;
    }

    public final Integer getPackagingQuantity() {
        return this.packagingQuantity;
    }

    public final String getShippingCarrierId() {
        return this.shippingCarrierId;
    }

    public final String getShippingCarrierName() {
        return this.shippingCarrierName;
    }

    public final List<WireSkuOrder> getSkuOrders() {
        return this.skuOrders;
    }

    public final ContainerOrderStatus getStatus() {
        return this.status;
    }

    public final DateTime getTargetDeliveryDate() {
        return this.targetDeliveryDate;
    }

    public final DateTime getTargetPickupDate() {
        return this.targetPickupDate;
    }

    public final String getTrackingId() {
        return this.trackingId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66722id.hashCode() * 31;
        DateTime dateTime = this.actualDeliveryDate;
        int hashCode2 = (hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.actualPickupDate;
        int hashCode3 = (hashCode2 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        boolean z = this.booked;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        String str = this.carrierName;
        int hashCode4 = (((i2 + (str == null ? 0 : str.hashCode())) * 31) + this.carrierNames.hashCode()) * 31;
        String str2 = this.carrierPOCName;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.carrierPOCPhone;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.containerType;
        int hashCode7 = (((hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.containerTypes.hashCode()) * 31;
        String str5 = this.notes;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.packagingQuantity;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.packageType;
        int hashCode10 = (((hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.packageTypes.hashCode()) * 31;
        String str7 = this.shippingCarrierId;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.shippingCarrierName;
        int hashCode12 = (((((hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.status.hashCode()) * 31) + this.skuOrders.hashCode()) * 31;
        DateTime dateTime3 = this.targetDeliveryDate;
        int hashCode13 = (hashCode12 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        DateTime dateTime4 = this.targetPickupDate;
        int hashCode14 = (hashCode13 + (dateTime4 == null ? 0 : dateTime4.hashCode())) * 31;
        String str9 = this.trackingId;
        return hashCode14 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66722id;
        DateTime dateTime = this.actualDeliveryDate;
        DateTime dateTime2 = this.actualPickupDate;
        boolean z = this.booked;
        String str2 = this.carrierName;
        Map<String, String> map = this.carrierNames;
        String str3 = this.carrierPOCName;
        String str4 = this.carrierPOCPhone;
        String str5 = this.containerType;
        Map<String, String> map2 = this.containerTypes;
        String str6 = this.notes;
        Integer num = this.packagingQuantity;
        String str7 = this.packageType;
        Map<String, String> map3 = this.packageTypes;
        String str8 = this.shippingCarrierId;
        String str9 = this.shippingCarrierName;
        ContainerOrderStatus containerOrderStatus = this.status;
        List<WireSkuOrder> list = this.skuOrders;
        DateTime dateTime3 = this.targetDeliveryDate;
        DateTime dateTime4 = this.targetPickupDate;
        String str10 = this.trackingId;
        return "WireContainerOrder(id=" + str + ", actualDeliveryDate=" + dateTime + ", actualPickupDate=" + dateTime2 + ", booked=" + z + ", carrierName=" + str2 + ", carrierNames=" + map + ", carrierPOCName=" + str3 + ", carrierPOCPhone=" + str4 + ", containerType=" + str5 + ", containerTypes=" + map2 + ", notes=" + str6 + ", packagingQuantity=" + num + ", packageType=" + str7 + ", packageTypes=" + map3 + ", shippingCarrierId=" + str8 + ", shippingCarrierName=" + str9 + ", status=" + containerOrderStatus + ", skuOrders=" + list + ", targetDeliveryDate=" + dateTime3 + ", targetPickupDate=" + dateTime4 + ", trackingId=" + str10 + ")";
    }

    public WireContainerOrder(String id, DateTime dateTime, DateTime dateTime2, boolean z, String str, Map<String, String> carrierNames, String str2, String str3, String str4, Map<String, String> containerTypes, String str5, Integer num, String str6, Map<String, String> packageTypes, String str7, String str8, ContainerOrderStatus status, List<WireSkuOrder> skuOrders, DateTime dateTime3, DateTime dateTime4, String str9) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(carrierNames, "carrierNames");
        Intrinsics.checkNotNullParameter(containerTypes, "containerTypes");
        Intrinsics.checkNotNullParameter(packageTypes, "packageTypes");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(skuOrders, "skuOrders");
        this.f66722id = id;
        this.actualDeliveryDate = dateTime;
        this.actualPickupDate = dateTime2;
        this.booked = z;
        this.carrierName = str;
        this.carrierNames = carrierNames;
        this.carrierPOCName = str2;
        this.carrierPOCPhone = str3;
        this.containerType = str4;
        this.containerTypes = containerTypes;
        this.notes = str5;
        this.packagingQuantity = num;
        this.packageType = str6;
        this.packageTypes = packageTypes;
        this.shippingCarrierId = str7;
        this.shippingCarrierName = str8;
        this.status = status;
        this.skuOrders = skuOrders;
        this.targetDeliveryDate = dateTime3;
        this.targetPickupDate = dateTime4;
        this.trackingId = str9;
    }

    public /* synthetic */ WireContainerOrder(String str, DateTime dateTime, DateTime dateTime2, boolean z, String str2, Map map, String str3, String str4, String str5, Map map2, String str6, Integer num, String str7, Map map3, String str8, String str9, ContainerOrderStatus containerOrderStatus, List list, DateTime dateTime3, DateTime dateTime4, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : dateTime, (i & 4) != 0 ? null : dateTime2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? MapsKt__MapsKt.emptyMap() : map, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? MapsKt__MapsKt.emptyMap() : map2, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : num, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? MapsKt__MapsKt.emptyMap() : map3, (i & 16384) != 0 ? null : str8, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : str9, (i & 65536) != 0 ? ContainerOrderStatus.UNKNOWN : containerOrderStatus, (i & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : dateTime3, (i & 524288) != 0 ? null : dateTime4, (i & 1048576) != 0 ? null : str10);
    }
}
