package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\u000eHÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003Jk\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0007HÖ\u0001J\t\u0010-\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, m28432d2 = {"Lco/bird/android/model/wire/configs/BeaconConfig;", "", "enablePassiveBeaconScans", "", "enableBluetoothScanReporting", "enableIBeaconScanReporting", "ibeaconBatchSubmitPeriod", "", "monitoredIBeaconProximityUUIDs", "", "", "headlessScanPeriod", "", "headlessScanMode", "Lco/bird/android/model/wire/configs/HeadlessScanMode;", "headlessScanPeriodicInterval", "enableRecentIBeaconReporting", "(ZZZILjava/util/List;JLco/bird/android/model/wire/configs/HeadlessScanMode;JZ)V", "getEnableBluetoothScanReporting", "()Z", "getEnableIBeaconScanReporting", "getEnablePassiveBeaconScans", "getEnableRecentIBeaconReporting", "getHeadlessScanMode", "()Lco/bird/android/model/wire/configs/HeadlessScanMode;", "getHeadlessScanPeriod", "()J", "getHeadlessScanPeriodicInterval", "getIbeaconBatchSubmitPeriod", "()I", "getMonitoredIBeaconProximityUUIDs", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BeaconConfig {
    @JsonProperty("enable_bluetooth_scan_reporting")
    @InterfaceC41208ft5("enable_bluetooth_scan_reporting")
    private final boolean enableBluetoothScanReporting;
    @JsonProperty("enable_ibeacon_scan_reporting")
    @InterfaceC41208ft5("enable_ibeacon_scan_reporting")
    private final boolean enableIBeaconScanReporting;
    @JsonProperty("enable_passive_beacon_scans")
    @InterfaceC41208ft5("enable_passive_beacon_scans")
    private final boolean enablePassiveBeaconScans;
    @JsonProperty("enable_recent_ibeacon_reporting")
    @InterfaceC41208ft5("enable_recent_ibeacon_reporting")
    private final boolean enableRecentIBeaconReporting;
    @JsonProperty("headless_scan_mode")
    @InterfaceC41208ft5("headless_scan_mode")
    private final HeadlessScanMode headlessScanMode;
    @JsonProperty("headless_scan_period")
    @InterfaceC41208ft5("headless_scan_period")
    private final long headlessScanPeriod;
    @JsonProperty("headless_scan_periodic_interval")
    @InterfaceC41208ft5("headless_scan_periodic_interval")
    private final long headlessScanPeriodicInterval;
    @JsonProperty("ibeacon_batch_submit_period")
    @InterfaceC41208ft5("ibeacon_batch_submit_period")
    private final int ibeaconBatchSubmitPeriod;
    @JsonProperty("monitored_ibeacon_proximity_uuids")
    @InterfaceC41208ft5("monitored_ibeacon_proximity_uuids")
    private final List<String> monitoredIBeaconProximityUUIDs;

    public BeaconConfig() {
        this(false, false, false, 0, null, 0L, null, 0L, false, 511, null);
    }

    public final boolean component1() {
        return this.enablePassiveBeaconScans;
    }

    public final boolean component2() {
        return this.enableBluetoothScanReporting;
    }

    public final boolean component3() {
        return this.enableIBeaconScanReporting;
    }

    public final int component4() {
        return this.ibeaconBatchSubmitPeriod;
    }

    public final List<String> component5() {
        return this.monitoredIBeaconProximityUUIDs;
    }

    public final long component6() {
        return this.headlessScanPeriod;
    }

    public final HeadlessScanMode component7() {
        return this.headlessScanMode;
    }

    public final long component8() {
        return this.headlessScanPeriodicInterval;
    }

    public final boolean component9() {
        return this.enableRecentIBeaconReporting;
    }

    public final BeaconConfig copy(boolean z, boolean z2, boolean z3, int i, List<String> list, long j, HeadlessScanMode headlessScanMode, long j2, boolean z4) {
        Intrinsics.checkNotNullParameter(headlessScanMode, "headlessScanMode");
        return new BeaconConfig(z, z2, z3, i, list, j, headlessScanMode, j2, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BeaconConfig) {
            BeaconConfig beaconConfig = (BeaconConfig) obj;
            return this.enablePassiveBeaconScans == beaconConfig.enablePassiveBeaconScans && this.enableBluetoothScanReporting == beaconConfig.enableBluetoothScanReporting && this.enableIBeaconScanReporting == beaconConfig.enableIBeaconScanReporting && this.ibeaconBatchSubmitPeriod == beaconConfig.ibeaconBatchSubmitPeriod && Intrinsics.areEqual(this.monitoredIBeaconProximityUUIDs, beaconConfig.monitoredIBeaconProximityUUIDs) && this.headlessScanPeriod == beaconConfig.headlessScanPeriod && this.headlessScanMode == beaconConfig.headlessScanMode && this.headlessScanPeriodicInterval == beaconConfig.headlessScanPeriodicInterval && this.enableRecentIBeaconReporting == beaconConfig.enableRecentIBeaconReporting;
        }
        return false;
    }

    public final boolean getEnableBluetoothScanReporting() {
        return this.enableBluetoothScanReporting;
    }

    public final boolean getEnableIBeaconScanReporting() {
        return this.enableIBeaconScanReporting;
    }

    public final boolean getEnablePassiveBeaconScans() {
        return this.enablePassiveBeaconScans;
    }

    public final boolean getEnableRecentIBeaconReporting() {
        return this.enableRecentIBeaconReporting;
    }

    public final HeadlessScanMode getHeadlessScanMode() {
        return this.headlessScanMode;
    }

    public final long getHeadlessScanPeriod() {
        return this.headlessScanPeriod;
    }

    public final long getHeadlessScanPeriodicInterval() {
        return this.headlessScanPeriodicInterval;
    }

    public final int getIbeaconBatchSubmitPeriod() {
        return this.ibeaconBatchSubmitPeriod;
    }

    public final List<String> getMonitoredIBeaconProximityUUIDs() {
        return this.monitoredIBeaconProximityUUIDs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z = this.enablePassiveBeaconScans;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.enableBluetoothScanReporting;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.enableIBeaconScanReporting;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int hashCode = (((i3 + i4) * 31) + Integer.hashCode(this.ibeaconBatchSubmitPeriod)) * 31;
        List<String> list = this.monitoredIBeaconProximityUUIDs;
        int hashCode2 = (((((((hashCode + (list == null ? 0 : list.hashCode())) * 31) + Long.hashCode(this.headlessScanPeriod)) * 31) + this.headlessScanMode.hashCode()) * 31) + Long.hashCode(this.headlessScanPeriodicInterval)) * 31;
        boolean z2 = this.enableRecentIBeaconReporting;
        return hashCode2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.enablePassiveBeaconScans;
        boolean z2 = this.enableBluetoothScanReporting;
        boolean z3 = this.enableIBeaconScanReporting;
        int i = this.ibeaconBatchSubmitPeriod;
        List<String> list = this.monitoredIBeaconProximityUUIDs;
        long j = this.headlessScanPeriod;
        HeadlessScanMode headlessScanMode = this.headlessScanMode;
        long j2 = this.headlessScanPeriodicInterval;
        boolean z4 = this.enableRecentIBeaconReporting;
        return "BeaconConfig(enablePassiveBeaconScans=" + z + ", enableBluetoothScanReporting=" + z2 + ", enableIBeaconScanReporting=" + z3 + ", ibeaconBatchSubmitPeriod=" + i + ", monitoredIBeaconProximityUUIDs=" + list + ", headlessScanPeriod=" + j + ", headlessScanMode=" + headlessScanMode + ", headlessScanPeriodicInterval=" + j2 + ", enableRecentIBeaconReporting=" + z4 + ")";
    }

    public BeaconConfig(boolean z, boolean z2, boolean z3, int i, List<String> list, long j, HeadlessScanMode headlessScanMode, long j2, boolean z4) {
        Intrinsics.checkNotNullParameter(headlessScanMode, "headlessScanMode");
        this.enablePassiveBeaconScans = z;
        this.enableBluetoothScanReporting = z2;
        this.enableIBeaconScanReporting = z3;
        this.ibeaconBatchSubmitPeriod = i;
        this.monitoredIBeaconProximityUUIDs = list;
        this.headlessScanPeriod = j;
        this.headlessScanMode = headlessScanMode;
        this.headlessScanPeriodicInterval = j2;
        this.enableRecentIBeaconReporting = z4;
    }

    public /* synthetic */ BeaconConfig(boolean z, boolean z2, boolean z3, int i, List list, long j, HeadlessScanMode headlessScanMode, long j2, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? 30 : i, (i2 & 16) != 0 ? null : list, (i2 & 32) != 0 ? 10L : j, (i2 & 64) != 0 ? HeadlessScanMode.NONE : headlessScanMode, (i2 & 128) != 0 ? 3600L : j2, (i2 & 256) == 0 ? z4 : false);
    }
}
