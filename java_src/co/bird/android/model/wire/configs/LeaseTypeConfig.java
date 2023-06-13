package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.location.places.Place;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003Jm\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001J\u0013\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\tHÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014¨\u0006-"}, m28432d2 = {"Lco/bird/android/model/wire/configs/LeaseTypeConfig;", "", "enabled", "", "initialChargeAmount", "", "delinquentFeeAmount", "returnRefundAmount", "leaseDurationSeconds", "", "autoscanTimeoutSeconds", "autoscanRequiredToStart", "autoscanRequiredToEnd", "returnLeaseAssetMaxUploadAttempts", "leaseExemptionDurationSeconds", "(ZJJJIJZZJI)V", "getAutoscanRequiredToEnd", "()Z", "getAutoscanRequiredToStart", "getAutoscanTimeoutSeconds", "()J", "getDelinquentFeeAmount", "getEnabled", "getInitialChargeAmount", "getLeaseDurationSeconds", "()I", "getLeaseExemptionDurationSeconds", "getReturnLeaseAssetMaxUploadAttempts", "getReturnRefundAmount", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LeaseTypeConfig {
    @JsonProperty("autoscan_required_to_end")
    @InterfaceC41208ft5("autoscan_required_to_end")
    private final boolean autoscanRequiredToEnd;
    @JsonProperty("autoscan_required_to_start")
    @InterfaceC41208ft5("autoscan_required_to_start")
    private final boolean autoscanRequiredToStart;
    @JsonProperty("autoscan_timeout_seconds")
    @InterfaceC41208ft5("autoscan_timeout_seconds")
    private final long autoscanTimeoutSeconds;
    @JsonProperty("delinquent_fee_amount")
    @InterfaceC41208ft5("delinquent_fee_amount")
    private final long delinquentFeeAmount;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("initial_charge_amount")
    @InterfaceC41208ft5("initial_charge_amount")
    private final long initialChargeAmount;
    @JsonProperty("lease_duration_seconds")
    @InterfaceC41208ft5("lease_duration_seconds")
    private final int leaseDurationSeconds;
    @JsonProperty("lease_exemption_duration_seconds")
    @InterfaceC41208ft5("lease_exemption_duration_seconds")
    private final int leaseExemptionDurationSeconds;
    @JsonProperty("return_lease_asset_max_upload_attempts")
    @InterfaceC41208ft5("return_lease_asset_max_upload_attempts")
    private final long returnLeaseAssetMaxUploadAttempts;
    @JsonProperty("return_refund_amount")
    @InterfaceC41208ft5("return_refund_amount")
    private final long returnRefundAmount;

    public LeaseTypeConfig() {
        this(false, 0L, 0L, 0L, 0, 0L, false, false, 0L, 0, Place.TYPE_SUBLOCALITY_LEVEL_1, null);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final int component10() {
        return this.leaseExemptionDurationSeconds;
    }

    public final long component2() {
        return this.initialChargeAmount;
    }

    public final long component3() {
        return this.delinquentFeeAmount;
    }

    public final long component4() {
        return this.returnRefundAmount;
    }

    public final int component5() {
        return this.leaseDurationSeconds;
    }

    public final long component6() {
        return this.autoscanTimeoutSeconds;
    }

    public final boolean component7() {
        return this.autoscanRequiredToStart;
    }

    public final boolean component8() {
        return this.autoscanRequiredToEnd;
    }

    public final long component9() {
        return this.returnLeaseAssetMaxUploadAttempts;
    }

    public final LeaseTypeConfig copy(boolean z, long j, long j2, long j3, int i, long j4, boolean z2, boolean z3, long j5, int i2) {
        return new LeaseTypeConfig(z, j, j2, j3, i, j4, z2, z3, j5, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LeaseTypeConfig) {
            LeaseTypeConfig leaseTypeConfig = (LeaseTypeConfig) obj;
            return this.enabled == leaseTypeConfig.enabled && this.initialChargeAmount == leaseTypeConfig.initialChargeAmount && this.delinquentFeeAmount == leaseTypeConfig.delinquentFeeAmount && this.returnRefundAmount == leaseTypeConfig.returnRefundAmount && this.leaseDurationSeconds == leaseTypeConfig.leaseDurationSeconds && this.autoscanTimeoutSeconds == leaseTypeConfig.autoscanTimeoutSeconds && this.autoscanRequiredToStart == leaseTypeConfig.autoscanRequiredToStart && this.autoscanRequiredToEnd == leaseTypeConfig.autoscanRequiredToEnd && this.returnLeaseAssetMaxUploadAttempts == leaseTypeConfig.returnLeaseAssetMaxUploadAttempts && this.leaseExemptionDurationSeconds == leaseTypeConfig.leaseExemptionDurationSeconds;
        }
        return false;
    }

    public final boolean getAutoscanRequiredToEnd() {
        return this.autoscanRequiredToEnd;
    }

    public final boolean getAutoscanRequiredToStart() {
        return this.autoscanRequiredToStart;
    }

    public final long getAutoscanTimeoutSeconds() {
        return this.autoscanTimeoutSeconds;
    }

    public final long getDelinquentFeeAmount() {
        return this.delinquentFeeAmount;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final long getInitialChargeAmount() {
        return this.initialChargeAmount;
    }

    public final int getLeaseDurationSeconds() {
        return this.leaseDurationSeconds;
    }

    public final int getLeaseExemptionDurationSeconds() {
        return this.leaseExemptionDurationSeconds;
    }

    public final long getReturnLeaseAssetMaxUploadAttempts() {
        return this.returnLeaseAssetMaxUploadAttempts;
    }

    public final long getReturnRefundAmount() {
        return this.returnRefundAmount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((((((((((r0 * 31) + Long.hashCode(this.initialChargeAmount)) * 31) + Long.hashCode(this.delinquentFeeAmount)) * 31) + Long.hashCode(this.returnRefundAmount)) * 31) + Integer.hashCode(this.leaseDurationSeconds)) * 31) + Long.hashCode(this.autoscanTimeoutSeconds)) * 31;
        ?? r2 = this.autoscanRequiredToStart;
        int i = r2;
        if (r2 != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.autoscanRequiredToEnd;
        return ((((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Long.hashCode(this.returnLeaseAssetMaxUploadAttempts)) * 31) + Integer.hashCode(this.leaseExemptionDurationSeconds);
    }

    public String toString() {
        boolean z = this.enabled;
        long j = this.initialChargeAmount;
        long j2 = this.delinquentFeeAmount;
        long j3 = this.returnRefundAmount;
        int i = this.leaseDurationSeconds;
        long j4 = this.autoscanTimeoutSeconds;
        boolean z2 = this.autoscanRequiredToStart;
        boolean z3 = this.autoscanRequiredToEnd;
        long j5 = this.returnLeaseAssetMaxUploadAttempts;
        int i2 = this.leaseExemptionDurationSeconds;
        return "LeaseTypeConfig(enabled=" + z + ", initialChargeAmount=" + j + ", delinquentFeeAmount=" + j2 + ", returnRefundAmount=" + j3 + ", leaseDurationSeconds=" + i + ", autoscanTimeoutSeconds=" + j4 + ", autoscanRequiredToStart=" + z2 + ", autoscanRequiredToEnd=" + z3 + ", returnLeaseAssetMaxUploadAttempts=" + j5 + ", leaseExemptionDurationSeconds=" + i2 + ")";
    }

    public LeaseTypeConfig(boolean z, long j, long j2, long j3, int i, long j4, boolean z2, boolean z3, long j5, int i2) {
        this.enabled = z;
        this.initialChargeAmount = j;
        this.delinquentFeeAmount = j2;
        this.returnRefundAmount = j3;
        this.leaseDurationSeconds = i;
        this.autoscanTimeoutSeconds = j4;
        this.autoscanRequiredToStart = z2;
        this.autoscanRequiredToEnd = z3;
        this.returnLeaseAssetMaxUploadAttempts = j5;
        this.leaseExemptionDurationSeconds = i2;
    }

    public /* synthetic */ LeaseTypeConfig(boolean z, long j, long j2, long j3, int i, long j4, boolean z2, boolean z3, long j5, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? 0L : j2, (i3 & 8) == 0 ? j3 : 0L, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 5L : j4, (i3 & 64) != 0 ? false : z2, (i3 & 128) == 0 ? z3 : false, (i3 & 256) == 0 ? j5 : 5L, (i3 & 512) != 0 ? 300 : i2);
    }
}
