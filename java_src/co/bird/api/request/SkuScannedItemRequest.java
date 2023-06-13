package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/api/request/SkuScannedItemRequest;", "", "scanIdentifier", "", "scrapReason", "(Ljava/lang/String;Ljava/lang/String;)V", "getScanIdentifier", "()Ljava/lang/String;", "getScrapReason", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class SkuScannedItemRequest {
    @JsonProperty("scan_identifier")
    @InterfaceC41208ft5("scan_identifier")
    private final String scanIdentifier;
    @JsonProperty("scrap_reason")
    @InterfaceC41208ft5("scrap_reason")
    private final String scrapReason;

    public SkuScannedItemRequest(String scanIdentifier, String str) {
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        this.scanIdentifier = scanIdentifier;
        this.scrapReason = str;
    }

    public static /* synthetic */ SkuScannedItemRequest copy$default(SkuScannedItemRequest skuScannedItemRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skuScannedItemRequest.scanIdentifier;
        }
        if ((i & 2) != 0) {
            str2 = skuScannedItemRequest.scrapReason;
        }
        return skuScannedItemRequest.copy(str, str2);
    }

    public final String component1() {
        return this.scanIdentifier;
    }

    public final String component2() {
        return this.scrapReason;
    }

    public final SkuScannedItemRequest copy(String scanIdentifier, String str) {
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        return new SkuScannedItemRequest(scanIdentifier, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuScannedItemRequest) {
            SkuScannedItemRequest skuScannedItemRequest = (SkuScannedItemRequest) obj;
            return Intrinsics.areEqual(this.scanIdentifier, skuScannedItemRequest.scanIdentifier) && Intrinsics.areEqual(this.scrapReason, skuScannedItemRequest.scrapReason);
        }
        return false;
    }

    public final String getScanIdentifier() {
        return this.scanIdentifier;
    }

    public final String getScrapReason() {
        return this.scrapReason;
    }

    public int hashCode() {
        int hashCode = this.scanIdentifier.hashCode() * 31;
        String str = this.scrapReason;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.scanIdentifier;
        String str2 = this.scrapReason;
        return "SkuScannedItemRequest(scanIdentifier=" + str + ", scrapReason=" + str2 + ")";
    }
}
