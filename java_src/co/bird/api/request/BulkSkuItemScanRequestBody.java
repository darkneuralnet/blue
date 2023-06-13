package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m28432d2 = {"Lco/bird/api/request/BulkSkuItemScanRequestBody;", "", "skuOrderId", "", "scannedItems", "", "Lco/bird/api/request/SkuScannedItemRequest;", "inbound", "", "nonServiceCenter", "(Ljava/lang/String;Ljava/util/List;ZZ)V", "getInbound", "()Z", "getNonServiceCenter", "getScannedItems", "()Ljava/util/List;", "getSkuOrderId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BulkSkuItemScanRequestBody {
    @JsonProperty("inbound")
    @InterfaceC41208ft5("inbound")
    private final boolean inbound;
    @JsonProperty("non_service_center")
    @InterfaceC41208ft5("non_service_center")
    private final boolean nonServiceCenter;
    @JsonProperty("scanned_items")
    @InterfaceC41208ft5("scanned_items")
    private final List<SkuScannedItemRequest> scannedItems;
    @JsonProperty("sku_order_id")
    @InterfaceC41208ft5("sku_order_id")
    private final String skuOrderId;

    public BulkSkuItemScanRequestBody(String skuOrderId, List<SkuScannedItemRequest> scannedItems, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        Intrinsics.checkNotNullParameter(scannedItems, "scannedItems");
        this.skuOrderId = skuOrderId;
        this.scannedItems = scannedItems;
        this.inbound = z;
        this.nonServiceCenter = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BulkSkuItemScanRequestBody copy$default(BulkSkuItemScanRequestBody bulkSkuItemScanRequestBody, String str, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bulkSkuItemScanRequestBody.skuOrderId;
        }
        if ((i & 2) != 0) {
            list = bulkSkuItemScanRequestBody.scannedItems;
        }
        if ((i & 4) != 0) {
            z = bulkSkuItemScanRequestBody.inbound;
        }
        if ((i & 8) != 0) {
            z2 = bulkSkuItemScanRequestBody.nonServiceCenter;
        }
        return bulkSkuItemScanRequestBody.copy(str, list, z, z2);
    }

    public final String component1() {
        return this.skuOrderId;
    }

    public final List<SkuScannedItemRequest> component2() {
        return this.scannedItems;
    }

    public final boolean component3() {
        return this.inbound;
    }

    public final boolean component4() {
        return this.nonServiceCenter;
    }

    public final BulkSkuItemScanRequestBody copy(String skuOrderId, List<SkuScannedItemRequest> scannedItems, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        Intrinsics.checkNotNullParameter(scannedItems, "scannedItems");
        return new BulkSkuItemScanRequestBody(skuOrderId, scannedItems, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BulkSkuItemScanRequestBody) {
            BulkSkuItemScanRequestBody bulkSkuItemScanRequestBody = (BulkSkuItemScanRequestBody) obj;
            return Intrinsics.areEqual(this.skuOrderId, bulkSkuItemScanRequestBody.skuOrderId) && Intrinsics.areEqual(this.scannedItems, bulkSkuItemScanRequestBody.scannedItems) && this.inbound == bulkSkuItemScanRequestBody.inbound && this.nonServiceCenter == bulkSkuItemScanRequestBody.nonServiceCenter;
        }
        return false;
    }

    public final boolean getInbound() {
        return this.inbound;
    }

    public final boolean getNonServiceCenter() {
        return this.nonServiceCenter;
    }

    public final List<SkuScannedItemRequest> getScannedItems() {
        return this.scannedItems;
    }

    public final String getSkuOrderId() {
        return this.skuOrderId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.skuOrderId.hashCode() * 31) + this.scannedItems.hashCode()) * 31;
        boolean z = this.inbound;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.nonServiceCenter;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.skuOrderId;
        List<SkuScannedItemRequest> list = this.scannedItems;
        boolean z = this.inbound;
        boolean z2 = this.nonServiceCenter;
        return "BulkSkuItemScanRequestBody(skuOrderId=" + str + ", scannedItems=" + list + ", inbound=" + z + ", nonServiceCenter=" + z2 + ")";
    }
}
