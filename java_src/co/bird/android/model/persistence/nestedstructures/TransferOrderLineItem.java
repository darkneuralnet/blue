package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003Je\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u0010&\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/TransferOrderLineItem;", "", "id", "", "commodity", "commodityType", "usedCondition", "", "transferOrder", "Lco/bird/android/model/persistence/nestedstructures/TransferOrder;", "commodities", "", "originFleet", "Lco/bird/android/model/persistence/nestedstructures/Fleet;", "destinationFleet", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/persistence/nestedstructures/TransferOrder;Ljava/util/Map;Lco/bird/android/model/persistence/nestedstructures/Fleet;Lco/bird/android/model/persistence/nestedstructures/Fleet;)V", "getCommodities", "()Ljava/util/Map;", "getCommodity", "()Ljava/lang/String;", "getCommodityType", "getDestinationFleet", "()Lco/bird/android/model/persistence/nestedstructures/Fleet;", "getId", "getOriginFleet", "getTransferOrder", "()Lco/bird/android/model/persistence/nestedstructures/TransferOrder;", "getUsedCondition", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TransferOrderLineItem {
    @JsonProperty("commodities")
    @InterfaceC41208ft5("commodities")
    private final Map<String, String> commodities;
    @JsonProperty("commodity")
    @InterfaceC41208ft5("commodity")
    private final String commodity;
    @JsonProperty("commodity_type")
    @InterfaceC41208ft5("commodity_type")
    private final String commodityType;
    @JsonProperty("destination_fleet")
    @InterfaceC41208ft5("destination_fleet")
    private final Fleet destinationFleet;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66705id;
    @JsonProperty("origin_fleet")
    @InterfaceC41208ft5("origin_fleet")
    private final Fleet originFleet;
    @JsonProperty("transfer_order")
    @InterfaceC41208ft5("transfer_order")
    private final TransferOrder transferOrder;
    @JsonProperty("used")
    @InterfaceC41208ft5("used")
    private final boolean usedCondition;

    public TransferOrderLineItem(String id, String commodity, String commodityType, boolean z, TransferOrder transferOrder, Map<String, String> commodities, Fleet originFleet, Fleet destinationFleet) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(commodity, "commodity");
        Intrinsics.checkNotNullParameter(commodityType, "commodityType");
        Intrinsics.checkNotNullParameter(transferOrder, "transferOrder");
        Intrinsics.checkNotNullParameter(commodities, "commodities");
        Intrinsics.checkNotNullParameter(originFleet, "originFleet");
        Intrinsics.checkNotNullParameter(destinationFleet, "destinationFleet");
        this.f66705id = id;
        this.commodity = commodity;
        this.commodityType = commodityType;
        this.usedCondition = z;
        this.transferOrder = transferOrder;
        this.commodities = commodities;
        this.originFleet = originFleet;
        this.destinationFleet = destinationFleet;
    }

    public final String component1() {
        return this.f66705id;
    }

    public final String component2() {
        return this.commodity;
    }

    public final String component3() {
        return this.commodityType;
    }

    public final boolean component4() {
        return this.usedCondition;
    }

    public final TransferOrder component5() {
        return this.transferOrder;
    }

    public final Map<String, String> component6() {
        return this.commodities;
    }

    public final Fleet component7() {
        return this.originFleet;
    }

    public final Fleet component8() {
        return this.destinationFleet;
    }

    public final TransferOrderLineItem copy(String id, String commodity, String commodityType, boolean z, TransferOrder transferOrder, Map<String, String> commodities, Fleet originFleet, Fleet destinationFleet) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(commodity, "commodity");
        Intrinsics.checkNotNullParameter(commodityType, "commodityType");
        Intrinsics.checkNotNullParameter(transferOrder, "transferOrder");
        Intrinsics.checkNotNullParameter(commodities, "commodities");
        Intrinsics.checkNotNullParameter(originFleet, "originFleet");
        Intrinsics.checkNotNullParameter(destinationFleet, "destinationFleet");
        return new TransferOrderLineItem(id, commodity, commodityType, z, transferOrder, commodities, originFleet, destinationFleet);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransferOrderLineItem) {
            TransferOrderLineItem transferOrderLineItem = (TransferOrderLineItem) obj;
            return Intrinsics.areEqual(this.f66705id, transferOrderLineItem.f66705id) && Intrinsics.areEqual(this.commodity, transferOrderLineItem.commodity) && Intrinsics.areEqual(this.commodityType, transferOrderLineItem.commodityType) && this.usedCondition == transferOrderLineItem.usedCondition && Intrinsics.areEqual(this.transferOrder, transferOrderLineItem.transferOrder) && Intrinsics.areEqual(this.commodities, transferOrderLineItem.commodities) && Intrinsics.areEqual(this.originFleet, transferOrderLineItem.originFleet) && Intrinsics.areEqual(this.destinationFleet, transferOrderLineItem.destinationFleet);
        }
        return false;
    }

    public final Map<String, String> getCommodities() {
        return this.commodities;
    }

    public final String getCommodity() {
        return this.commodity;
    }

    public final String getCommodityType() {
        return this.commodityType;
    }

    public final Fleet getDestinationFleet() {
        return this.destinationFleet;
    }

    public final String getId() {
        return this.f66705id;
    }

    public final Fleet getOriginFleet() {
        return this.originFleet;
    }

    public final TransferOrder getTransferOrder() {
        return this.transferOrder;
    }

    public final boolean getUsedCondition() {
        return this.usedCondition;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f66705id.hashCode() * 31) + this.commodity.hashCode()) * 31) + this.commodityType.hashCode()) * 31;
        boolean z = this.usedCondition;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((((((hashCode + i) * 31) + this.transferOrder.hashCode()) * 31) + this.commodities.hashCode()) * 31) + this.originFleet.hashCode()) * 31) + this.destinationFleet.hashCode();
    }

    public String toString() {
        String str = this.f66705id;
        String str2 = this.commodity;
        String str3 = this.commodityType;
        boolean z = this.usedCondition;
        TransferOrder transferOrder = this.transferOrder;
        Map<String, String> map = this.commodities;
        Fleet fleet = this.originFleet;
        Fleet fleet2 = this.destinationFleet;
        return "TransferOrderLineItem(id=" + str + ", commodity=" + str2 + ", commodityType=" + str3 + ", usedCondition=" + z + ", transferOrder=" + transferOrder + ", commodities=" + map + ", originFleet=" + fleet + ", destinationFleet=" + fleet2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TransferOrderLineItem(String str, String str2, String str3, boolean z, TransferOrder transferOrder, Map map, Fleet fleet, Fleet fleet2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z, transferOrder, r7, fleet, fleet2);
        Map map2;
        Map emptyMap;
        if ((i & 32) != 0) {
            emptyMap = MapsKt__MapsKt.emptyMap();
            map2 = emptyMap;
        } else {
            map2 = map;
        }
    }
}
