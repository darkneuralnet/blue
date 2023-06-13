package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.HibernationBatchFrequency;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u000fHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\u0081\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000bHÆ\u0001J\u0013\u0010.\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u000bHÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00063"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OperatorWakeBirdsConfig;", "", "enabled", "", "enableWakeIndividual", "enableBatchWake", "enableSweepWake", "enableSleepIndividual", "enableBulkScannerWake", "enableHibernate", "bulkWakeMaxVehicles", "", "bulkWakeMaxRetries", "enableSleepPowerline", "hibernationBatchFrequency", "Lco/bird/android/model/constant/HibernationBatchFrequency;", "forceSleepBatteryThreshold", "(ZZZZZZZIIZLco/bird/android/model/constant/HibernationBatchFrequency;I)V", "getBulkWakeMaxRetries", "()I", "getBulkWakeMaxVehicles", "getEnableBatchWake", "()Z", "getEnableBulkScannerWake", "getEnableHibernate", "getEnableSleepIndividual", "getEnableSleepPowerline", "getEnableSweepWake", "getEnableWakeIndividual", "getEnabled", "getForceSleepBatteryThreshold", "getHibernationBatchFrequency", "()Lco/bird/android/model/constant/HibernationBatchFrequency;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorWakeBirdsConfig {
    @JsonProperty("bulk_wake_max_retries")
    @InterfaceC41208ft5("bulk_wake_max_retries")
    private final int bulkWakeMaxRetries;
    @JsonProperty("bulk_wake_max_vehicles")
    @InterfaceC41208ft5("bulk_wake_max_vehicles")
    private final int bulkWakeMaxVehicles;
    @JsonProperty("enable_batch_wake")
    @InterfaceC41208ft5("enable_batch_wake")
    private final boolean enableBatchWake;
    @JsonProperty("enable_bulk_scanner_wake")
    @InterfaceC41208ft5("enable_bulk_scanner_wake")
    private final boolean enableBulkScannerWake;
    @JsonProperty("enable_hibernate")
    @InterfaceC41208ft5("enable_hibernate")
    private final boolean enableHibernate;
    @JsonProperty("enable_sleep_individual")
    @InterfaceC41208ft5("enable_sleep_individual")
    private final boolean enableSleepIndividual;
    @JsonProperty("enable_sleep_powerline")
    @InterfaceC41208ft5("enable_sleep_powerline")
    private final boolean enableSleepPowerline;
    @JsonProperty("enable_sweep_wake")
    @InterfaceC41208ft5("enable_sweep_wake")
    private final boolean enableSweepWake;
    @JsonProperty("enable_wake_individual")
    @InterfaceC41208ft5("enable_wake_individual")
    private final boolean enableWakeIndividual;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("force_sleep_battery_threshold")
    @InterfaceC41208ft5("force_sleep_battery_threshold")
    private final int forceSleepBatteryThreshold;
    @JsonProperty("hibernation_batch_frequency")
    @InterfaceC41208ft5("hibernation_batch_frequency")
    private final HibernationBatchFrequency hibernationBatchFrequency;

    public OperatorWakeBirdsConfig() {
        this(false, false, false, false, false, false, false, 0, 0, false, null, 0, 4095, null);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final boolean component10() {
        return this.enableSleepPowerline;
    }

    public final HibernationBatchFrequency component11() {
        return this.hibernationBatchFrequency;
    }

    public final int component12() {
        return this.forceSleepBatteryThreshold;
    }

    public final boolean component2() {
        return this.enableWakeIndividual;
    }

    public final boolean component3() {
        return this.enableBatchWake;
    }

    public final boolean component4() {
        return this.enableSweepWake;
    }

    public final boolean component5() {
        return this.enableSleepIndividual;
    }

    public final boolean component6() {
        return this.enableBulkScannerWake;
    }

    public final boolean component7() {
        return this.enableHibernate;
    }

    public final int component8() {
        return this.bulkWakeMaxVehicles;
    }

    public final int component9() {
        return this.bulkWakeMaxRetries;
    }

    public final OperatorWakeBirdsConfig copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, int i2, boolean z8, HibernationBatchFrequency hibernationBatchFrequency, int i3) {
        Intrinsics.checkNotNullParameter(hibernationBatchFrequency, "hibernationBatchFrequency");
        return new OperatorWakeBirdsConfig(z, z2, z3, z4, z5, z6, z7, i, i2, z8, hibernationBatchFrequency, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorWakeBirdsConfig) {
            OperatorWakeBirdsConfig operatorWakeBirdsConfig = (OperatorWakeBirdsConfig) obj;
            return this.enabled == operatorWakeBirdsConfig.enabled && this.enableWakeIndividual == operatorWakeBirdsConfig.enableWakeIndividual && this.enableBatchWake == operatorWakeBirdsConfig.enableBatchWake && this.enableSweepWake == operatorWakeBirdsConfig.enableSweepWake && this.enableSleepIndividual == operatorWakeBirdsConfig.enableSleepIndividual && this.enableBulkScannerWake == operatorWakeBirdsConfig.enableBulkScannerWake && this.enableHibernate == operatorWakeBirdsConfig.enableHibernate && this.bulkWakeMaxVehicles == operatorWakeBirdsConfig.bulkWakeMaxVehicles && this.bulkWakeMaxRetries == operatorWakeBirdsConfig.bulkWakeMaxRetries && this.enableSleepPowerline == operatorWakeBirdsConfig.enableSleepPowerline && this.hibernationBatchFrequency == operatorWakeBirdsConfig.hibernationBatchFrequency && this.forceSleepBatteryThreshold == operatorWakeBirdsConfig.forceSleepBatteryThreshold;
        }
        return false;
    }

    public final int getBulkWakeMaxRetries() {
        return this.bulkWakeMaxRetries;
    }

    public final int getBulkWakeMaxVehicles() {
        return this.bulkWakeMaxVehicles;
    }

    public final boolean getEnableBatchWake() {
        return this.enableBatchWake;
    }

    public final boolean getEnableBulkScannerWake() {
        return this.enableBulkScannerWake;
    }

    public final boolean getEnableHibernate() {
        return this.enableHibernate;
    }

    public final boolean getEnableSleepIndividual() {
        return this.enableSleepIndividual;
    }

    public final boolean getEnableSleepPowerline() {
        return this.enableSleepPowerline;
    }

    public final boolean getEnableSweepWake() {
        return this.enableSweepWake;
    }

    public final boolean getEnableWakeIndividual() {
        return this.enableWakeIndividual;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getForceSleepBatteryThreshold() {
        return this.forceSleepBatteryThreshold;
    }

    public final HibernationBatchFrequency getHibernationBatchFrequency() {
        return this.hibernationBatchFrequency;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.enableWakeIndividual;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.enableBatchWake;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r23 = this.enableSweepWake;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        ?? r24 = this.enableSleepIndividual;
        int i8 = r24;
        if (r24 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        ?? r25 = this.enableBulkScannerWake;
        int i10 = r25;
        if (r25 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        ?? r26 = this.enableHibernate;
        int i12 = r26;
        if (r26 != 0) {
            i12 = 1;
        }
        int hashCode = (((((i11 + i12) * 31) + Integer.hashCode(this.bulkWakeMaxVehicles)) * 31) + Integer.hashCode(this.bulkWakeMaxRetries)) * 31;
        boolean z2 = this.enableSleepPowerline;
        return ((((hashCode + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.hibernationBatchFrequency.hashCode()) * 31) + Integer.hashCode(this.forceSleepBatteryThreshold);
    }

    public String toString() {
        boolean z = this.enabled;
        boolean z2 = this.enableWakeIndividual;
        boolean z3 = this.enableBatchWake;
        boolean z4 = this.enableSweepWake;
        boolean z5 = this.enableSleepIndividual;
        boolean z6 = this.enableBulkScannerWake;
        boolean z7 = this.enableHibernate;
        int i = this.bulkWakeMaxVehicles;
        int i2 = this.bulkWakeMaxRetries;
        boolean z8 = this.enableSleepPowerline;
        HibernationBatchFrequency hibernationBatchFrequency = this.hibernationBatchFrequency;
        int i3 = this.forceSleepBatteryThreshold;
        return "OperatorWakeBirdsConfig(enabled=" + z + ", enableWakeIndividual=" + z2 + ", enableBatchWake=" + z3 + ", enableSweepWake=" + z4 + ", enableSleepIndividual=" + z5 + ", enableBulkScannerWake=" + z6 + ", enableHibernate=" + z7 + ", bulkWakeMaxVehicles=" + i + ", bulkWakeMaxRetries=" + i2 + ", enableSleepPowerline=" + z8 + ", hibernationBatchFrequency=" + hibernationBatchFrequency + ", forceSleepBatteryThreshold=" + i3 + ")";
    }

    public OperatorWakeBirdsConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, int i2, boolean z8, HibernationBatchFrequency hibernationBatchFrequency, int i3) {
        Intrinsics.checkNotNullParameter(hibernationBatchFrequency, "hibernationBatchFrequency");
        this.enabled = z;
        this.enableWakeIndividual = z2;
        this.enableBatchWake = z3;
        this.enableSweepWake = z4;
        this.enableSleepIndividual = z5;
        this.enableBulkScannerWake = z6;
        this.enableHibernate = z7;
        this.bulkWakeMaxVehicles = i;
        this.bulkWakeMaxRetries = i2;
        this.enableSleepPowerline = z8;
        this.hibernationBatchFrequency = hibernationBatchFrequency;
        this.forceSleepBatteryThreshold = i3;
    }

    public /* synthetic */ OperatorWakeBirdsConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, int i2, boolean z8, HibernationBatchFrequency hibernationBatchFrequency, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? false : z2, (i4 & 4) != 0 ? false : z3, (i4 & 8) != 0 ? false : z4, (i4 & 16) != 0 ? false : z5, (i4 & 32) != 0 ? false : z6, (i4 & 64) != 0 ? false : z7, (i4 & 128) != 0 ? 10 : i, (i4 & 256) != 0 ? 0 : i2, (i4 & 512) != 0 ? false : z8, (i4 & 1024) != 0 ? HibernationBatchFrequency.UNKNOWN : hibernationBatchFrequency, (i4 & 2048) == 0 ? i3 : 0);
    }
}
