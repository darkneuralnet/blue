package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, m28432d2 = {"Lco/bird/api/request/SkuItemScanRequestBody;", "", "skuOrderId", "", "scanIdentifier", "previousScanIdentifier", "inbound", "", "validateOnly", "nonServiceCenter", "force", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZ)V", "getForce", "()Z", "getInbound", "getNonServiceCenter", "getPreviousScanIdentifier", "()Ljava/lang/String;", "getScanIdentifier", "getSkuOrderId", "getValidateOnly", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class SkuItemScanRequestBody {
    @JsonProperty("force")
    @InterfaceC41208ft5("force")
    private final boolean force;
    @JsonProperty("inbound")
    @InterfaceC41208ft5("inbound")
    private final boolean inbound;
    @JsonProperty("non_service_center")
    @InterfaceC41208ft5("non_service_center")
    private final boolean nonServiceCenter;
    @JsonProperty("prev_scan_identifier")
    @InterfaceC41208ft5("prev_scan_identifier")
    private final String previousScanIdentifier;
    @JsonProperty("scan_identifier")
    @InterfaceC41208ft5("scan_identifier")
    private final String scanIdentifier;
    @JsonProperty("sku_order_id")
    @InterfaceC41208ft5("sku_order_id")
    private final String skuOrderId;
    @JsonProperty("validate_only")
    @InterfaceC41208ft5("validate_only")
    private final boolean validateOnly;

    public SkuItemScanRequestBody(String skuOrderId, String scanIdentifier, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        this.skuOrderId = skuOrderId;
        this.scanIdentifier = scanIdentifier;
        this.previousScanIdentifier = str;
        this.inbound = z;
        this.validateOnly = z2;
        this.nonServiceCenter = z3;
        this.force = z4;
    }

    public static /* synthetic */ SkuItemScanRequestBody copy$default(SkuItemScanRequestBody skuItemScanRequestBody, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skuItemScanRequestBody.skuOrderId;
        }
        if ((i & 2) != 0) {
            str2 = skuItemScanRequestBody.scanIdentifier;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = skuItemScanRequestBody.previousScanIdentifier;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            z = skuItemScanRequestBody.inbound;
        }
        boolean z5 = z;
        if ((i & 16) != 0) {
            z2 = skuItemScanRequestBody.validateOnly;
        }
        boolean z6 = z2;
        if ((i & 32) != 0) {
            z3 = skuItemScanRequestBody.nonServiceCenter;
        }
        boolean z7 = z3;
        if ((i & 64) != 0) {
            z4 = skuItemScanRequestBody.force;
        }
        return skuItemScanRequestBody.copy(str, str4, str5, z5, z6, z7, z4);
    }

    public final String component1() {
        return this.skuOrderId;
    }

    public final String component2() {
        return this.scanIdentifier;
    }

    public final String component3() {
        return this.previousScanIdentifier;
    }

    public final boolean component4() {
        return this.inbound;
    }

    public final boolean component5() {
        return this.validateOnly;
    }

    public final boolean component6() {
        return this.nonServiceCenter;
    }

    public final boolean component7() {
        return this.force;
    }

    public final SkuItemScanRequestBody copy(String skuOrderId, String scanIdentifier, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(skuOrderId, "skuOrderId");
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        return new SkuItemScanRequestBody(skuOrderId, scanIdentifier, str, z, z2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuItemScanRequestBody) {
            SkuItemScanRequestBody skuItemScanRequestBody = (SkuItemScanRequestBody) obj;
            return Intrinsics.areEqual(this.skuOrderId, skuItemScanRequestBody.skuOrderId) && Intrinsics.areEqual(this.scanIdentifier, skuItemScanRequestBody.scanIdentifier) && Intrinsics.areEqual(this.previousScanIdentifier, skuItemScanRequestBody.previousScanIdentifier) && this.inbound == skuItemScanRequestBody.inbound && this.validateOnly == skuItemScanRequestBody.validateOnly && this.nonServiceCenter == skuItemScanRequestBody.nonServiceCenter && this.force == skuItemScanRequestBody.force;
        }
        return false;
    }

    public final boolean getForce() {
        return this.force;
    }

    public final boolean getInbound() {
        return this.inbound;
    }

    public final boolean getNonServiceCenter() {
        return this.nonServiceCenter;
    }

    public final String getPreviousScanIdentifier() {
        return this.previousScanIdentifier;
    }

    public final String getScanIdentifier() {
        return this.scanIdentifier;
    }

    public final String getSkuOrderId() {
        return this.skuOrderId;
    }

    public final boolean getValidateOnly() {
        return this.validateOnly;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.skuOrderId.hashCode() * 31) + this.scanIdentifier.hashCode()) * 31;
        String str = this.previousScanIdentifier;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.inbound;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.validateOnly;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.nonServiceCenter;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.force;
        return i6 + (z4 ? 1 : z4 ? 1 : 0);
    }

    public String toString() {
        String str = this.skuOrderId;
        String str2 = this.scanIdentifier;
        String str3 = this.previousScanIdentifier;
        boolean z = this.inbound;
        boolean z2 = this.validateOnly;
        boolean z3 = this.nonServiceCenter;
        boolean z4 = this.force;
        return "SkuItemScanRequestBody(skuOrderId=" + str + ", scanIdentifier=" + str2 + ", previousScanIdentifier=" + str3 + ", inbound=" + z + ", validateOnly=" + z2 + ", nonServiceCenter=" + z3 + ", force=" + z4 + ")";
    }

    public /* synthetic */ SkuItemScanRequestBody(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, z, (i & 16) != 0 ? false : z2, z3, z4);
    }
}
