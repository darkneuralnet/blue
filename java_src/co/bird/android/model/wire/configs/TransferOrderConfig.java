package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\bHÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006("}, m28432d2 = {"Lco/bird/android/model/wire/configs/TransferOrderConfig;", "", "enableTransferOrder", "", "enableOperatorTransferOrder", "enableScrapOrder", "enableContainerOrderLookup", "minSkuInboundScanBeforeProcessAllowed", "", "allowSkuScanOverride", "overrideUploadBOLViaSignedUrl", "enablePickupTestRide", "requestScrapOrderReason", "(ZZZZIZZZZ)V", "getAllowSkuScanOverride", "()Z", "getEnableContainerOrderLookup", "getEnableOperatorTransferOrder", "getEnablePickupTestRide", "getEnableScrapOrder", "getEnableTransferOrder", "getMinSkuInboundScanBeforeProcessAllowed", "()I", "getOverrideUploadBOLViaSignedUrl", "getRequestScrapOrderReason", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TransferOrderConfig {
    @JsonProperty("allow_sku_scan_override")
    @InterfaceC41208ft5("allow_sku_scan_override")
    private final boolean allowSkuScanOverride;
    @JsonProperty("enable_container_order_lookup")
    @InterfaceC41208ft5("enable_container_order_lookup")
    private final boolean enableContainerOrderLookup;
    @JsonProperty("enable_operator_transfer_order")
    @InterfaceC41208ft5("enable_operator_transfer_order")
    private final boolean enableOperatorTransferOrder;
    @JsonProperty("enable_pickup_test_ride")
    @InterfaceC41208ft5("enable_pickup_test_ride")
    private final boolean enablePickupTestRide;
    @JsonProperty("enable_scrap_order")
    @InterfaceC41208ft5("enable_scrap_order")
    private final boolean enableScrapOrder;
    @JsonProperty("enable_transfer_order")
    @InterfaceC41208ft5("enable_transfer_order")
    private final boolean enableTransferOrder;
    @JsonProperty("min_sku_inbound_scan_before_process_allowed")
    @InterfaceC41208ft5("min_sku_inbound_scan_before_process_allowed")
    private final int minSkuInboundScanBeforeProcessAllowed;
    @JsonProperty("override_upload_bol_via_signed_url")
    @InterfaceC41208ft5("override_upload_bol_via_signed_url")
    private final boolean overrideUploadBOLViaSignedUrl;
    @JsonProperty("request_scrap_order_reason")
    @InterfaceC41208ft5("request_scrap_order_reason")
    private final boolean requestScrapOrderReason;

    public TransferOrderConfig() {
        this(false, false, false, false, 0, false, false, false, false, 511, null);
    }

    public final boolean component1() {
        return this.enableTransferOrder;
    }

    public final boolean component2() {
        return this.enableOperatorTransferOrder;
    }

    public final boolean component3() {
        return this.enableScrapOrder;
    }

    public final boolean component4() {
        return this.enableContainerOrderLookup;
    }

    public final int component5() {
        return this.minSkuInboundScanBeforeProcessAllowed;
    }

    public final boolean component6() {
        return this.allowSkuScanOverride;
    }

    public final boolean component7() {
        return this.overrideUploadBOLViaSignedUrl;
    }

    public final boolean component8() {
        return this.enablePickupTestRide;
    }

    public final boolean component9() {
        return this.requestScrapOrderReason;
    }

    public final TransferOrderConfig copy(boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, boolean z6, boolean z7, boolean z8) {
        return new TransferOrderConfig(z, z2, z3, z4, i, z5, z6, z7, z8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransferOrderConfig) {
            TransferOrderConfig transferOrderConfig = (TransferOrderConfig) obj;
            return this.enableTransferOrder == transferOrderConfig.enableTransferOrder && this.enableOperatorTransferOrder == transferOrderConfig.enableOperatorTransferOrder && this.enableScrapOrder == transferOrderConfig.enableScrapOrder && this.enableContainerOrderLookup == transferOrderConfig.enableContainerOrderLookup && this.minSkuInboundScanBeforeProcessAllowed == transferOrderConfig.minSkuInboundScanBeforeProcessAllowed && this.allowSkuScanOverride == transferOrderConfig.allowSkuScanOverride && this.overrideUploadBOLViaSignedUrl == transferOrderConfig.overrideUploadBOLViaSignedUrl && this.enablePickupTestRide == transferOrderConfig.enablePickupTestRide && this.requestScrapOrderReason == transferOrderConfig.requestScrapOrderReason;
        }
        return false;
    }

    public final boolean getAllowSkuScanOverride() {
        return this.allowSkuScanOverride;
    }

    public final boolean getEnableContainerOrderLookup() {
        return this.enableContainerOrderLookup;
    }

    public final boolean getEnableOperatorTransferOrder() {
        return this.enableOperatorTransferOrder;
    }

    public final boolean getEnablePickupTestRide() {
        return this.enablePickupTestRide;
    }

    public final boolean getEnableScrapOrder() {
        return this.enableScrapOrder;
    }

    public final boolean getEnableTransferOrder() {
        return this.enableTransferOrder;
    }

    public final int getMinSkuInboundScanBeforeProcessAllowed() {
        return this.minSkuInboundScanBeforeProcessAllowed;
    }

    public final boolean getOverrideUploadBOLViaSignedUrl() {
        return this.overrideUploadBOLViaSignedUrl;
    }

    public final boolean getRequestScrapOrderReason() {
        return this.requestScrapOrderReason;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean z = this.enableTransferOrder;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.enableOperatorTransferOrder;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.enableScrapOrder;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r23 = this.enableContainerOrderLookup;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int hashCode = (((i5 + i6) * 31) + Integer.hashCode(this.minSkuInboundScanBeforeProcessAllowed)) * 31;
        ?? r24 = this.allowSkuScanOverride;
        int i7 = r24;
        if (r24 != 0) {
            i7 = 1;
        }
        int i8 = (hashCode + i7) * 31;
        ?? r25 = this.overrideUploadBOLViaSignedUrl;
        int i9 = r25;
        if (r25 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        ?? r26 = this.enablePickupTestRide;
        int i11 = r26;
        if (r26 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z2 = this.requestScrapOrderReason;
        return i12 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.enableTransferOrder;
        boolean z2 = this.enableOperatorTransferOrder;
        boolean z3 = this.enableScrapOrder;
        boolean z4 = this.enableContainerOrderLookup;
        int i = this.minSkuInboundScanBeforeProcessAllowed;
        boolean z5 = this.allowSkuScanOverride;
        boolean z6 = this.overrideUploadBOLViaSignedUrl;
        boolean z7 = this.enablePickupTestRide;
        boolean z8 = this.requestScrapOrderReason;
        return "TransferOrderConfig(enableTransferOrder=" + z + ", enableOperatorTransferOrder=" + z2 + ", enableScrapOrder=" + z3 + ", enableContainerOrderLookup=" + z4 + ", minSkuInboundScanBeforeProcessAllowed=" + i + ", allowSkuScanOverride=" + z5 + ", overrideUploadBOLViaSignedUrl=" + z6 + ", enablePickupTestRide=" + z7 + ", requestScrapOrderReason=" + z8 + ")";
    }

    public TransferOrderConfig(boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.enableTransferOrder = z;
        this.enableOperatorTransferOrder = z2;
        this.enableScrapOrder = z3;
        this.enableContainerOrderLookup = z4;
        this.minSkuInboundScanBeforeProcessAllowed = i;
        this.allowSkuScanOverride = z5;
        this.overrideUploadBOLViaSignedUrl = z6;
        this.enablePickupTestRide = z7;
        this.requestScrapOrderReason = z8;
    }

    public /* synthetic */ TransferOrderConfig(boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, boolean z6, boolean z7, boolean z8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? false : z4, (i2 & 16) != 0 ? 1 : i, (i2 & 32) != 0 ? false : z5, (i2 & 64) != 0 ? false : z6, (i2 & 128) != 0 ? false : z7, (i2 & 256) == 0 ? z8 : false);
    }
}
