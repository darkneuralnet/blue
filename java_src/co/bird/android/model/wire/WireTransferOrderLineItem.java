package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003Jk\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010&\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\"\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, m28432d2 = {"Lco/bird/android/model/wire/WireTransferOrderLineItem;", "", "id", "", "commodity", "commodityType", "usedCondition", "", "transferOrder", "Lco/bird/android/model/wire/WireTransferOrder;", "commodities", "", "originFleet", "Lco/bird/android/model/wire/WireFleet;", "destinationFleet", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/wire/WireTransferOrder;Ljava/util/Map;Lco/bird/android/model/wire/WireFleet;Lco/bird/android/model/wire/WireFleet;)V", "getCommodities", "()Ljava/util/Map;", "getCommodity", "()Ljava/lang/String;", "getCommodityType", "getDestinationFleet", "()Lco/bird/android/model/wire/WireFleet;", "getId", "getOriginFleet", "getTransferOrder", "()Lco/bird/android/model/wire/WireTransferOrder;", "getUsedCondition", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireTransferOrderLineItem {
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
    private final WireFleet destinationFleet;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66771id;
    @JsonProperty("origin_fleet")
    @InterfaceC41208ft5("origin_fleet")
    private final WireFleet originFleet;
    @JsonProperty("transfer_order")
    @InterfaceC41208ft5("transfer_order")
    private final WireTransferOrder transferOrder;
    @JsonProperty("used")
    @InterfaceC41208ft5("used")
    private final boolean usedCondition;

    public WireTransferOrderLineItem() {
        this(null, null, null, false, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final String component1() {
        return this.f66771id;
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

    public final WireTransferOrder component5() {
        return this.transferOrder;
    }

    public final Map<String, String> component6() {
        return this.commodities;
    }

    public final WireFleet component7() {
        return this.originFleet;
    }

    public final WireFleet component8() {
        return this.destinationFleet;
    }

    public final WireTransferOrderLineItem copy(String id, String commodity, String commodityType, boolean z, WireTransferOrder wireTransferOrder, Map<String, String> commodities, WireFleet wireFleet, WireFleet wireFleet2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(commodity, "commodity");
        Intrinsics.checkNotNullParameter(commodityType, "commodityType");
        Intrinsics.checkNotNullParameter(commodities, "commodities");
        return new WireTransferOrderLineItem(id, commodity, commodityType, z, wireTransferOrder, commodities, wireFleet, wireFleet2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireTransferOrderLineItem) {
            WireTransferOrderLineItem wireTransferOrderLineItem = (WireTransferOrderLineItem) obj;
            return Intrinsics.areEqual(this.f66771id, wireTransferOrderLineItem.f66771id) && Intrinsics.areEqual(this.commodity, wireTransferOrderLineItem.commodity) && Intrinsics.areEqual(this.commodityType, wireTransferOrderLineItem.commodityType) && this.usedCondition == wireTransferOrderLineItem.usedCondition && Intrinsics.areEqual(this.transferOrder, wireTransferOrderLineItem.transferOrder) && Intrinsics.areEqual(this.commodities, wireTransferOrderLineItem.commodities) && Intrinsics.areEqual(this.originFleet, wireTransferOrderLineItem.originFleet) && Intrinsics.areEqual(this.destinationFleet, wireTransferOrderLineItem.destinationFleet);
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

    public final WireFleet getDestinationFleet() {
        return this.destinationFleet;
    }

    public final String getId() {
        return this.f66771id;
    }

    public final WireFleet getOriginFleet() {
        return this.originFleet;
    }

    public final WireTransferOrder getTransferOrder() {
        return this.transferOrder;
    }

    public final boolean getUsedCondition() {
        return this.usedCondition;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f66771id.hashCode() * 31) + this.commodity.hashCode()) * 31) + this.commodityType.hashCode()) * 31;
        boolean z = this.usedCondition;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        WireTransferOrder wireTransferOrder = this.transferOrder;
        int hashCode2 = (((i2 + (wireTransferOrder == null ? 0 : wireTransferOrder.hashCode())) * 31) + this.commodities.hashCode()) * 31;
        WireFleet wireFleet = this.originFleet;
        int hashCode3 = (hashCode2 + (wireFleet == null ? 0 : wireFleet.hashCode())) * 31;
        WireFleet wireFleet2 = this.destinationFleet;
        return hashCode3 + (wireFleet2 != null ? wireFleet2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66771id;
        String str2 = this.commodity;
        String str3 = this.commodityType;
        boolean z = this.usedCondition;
        WireTransferOrder wireTransferOrder = this.transferOrder;
        Map<String, String> map = this.commodities;
        WireFleet wireFleet = this.originFleet;
        WireFleet wireFleet2 = this.destinationFleet;
        return "WireTransferOrderLineItem(id=" + str + ", commodity=" + str2 + ", commodityType=" + str3 + ", usedCondition=" + z + ", transferOrder=" + wireTransferOrder + ", commodities=" + map + ", originFleet=" + wireFleet + ", destinationFleet=" + wireFleet2 + ")";
    }

    public WireTransferOrderLineItem(String id, String commodity, String commodityType, boolean z, WireTransferOrder wireTransferOrder, Map<String, String> commodities, WireFleet wireFleet, WireFleet wireFleet2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(commodity, "commodity");
        Intrinsics.checkNotNullParameter(commodityType, "commodityType");
        Intrinsics.checkNotNullParameter(commodities, "commodities");
        this.f66771id = id;
        this.commodity = commodity;
        this.commodityType = commodityType;
        this.usedCondition = z;
        this.transferOrder = wireTransferOrder;
        this.commodities = commodities;
        this.originFleet = wireFleet;
        this.destinationFleet = wireFleet2;
    }

    public /* synthetic */ WireTransferOrderLineItem(String str, String str2, String str3, boolean z, WireTransferOrder wireTransferOrder, Map map, WireFleet wireFleet, WireFleet wireFleet2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : wireTransferOrder, (i & 32) != 0 ? MapsKt__MapsKt.emptyMap() : map, (i & 64) != 0 ? null : wireFleet, (i & 128) == 0 ? wireFleet2 : null);
    }
}
