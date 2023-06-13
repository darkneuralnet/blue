package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0002\u0010\u0016J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003J\t\u00100\u001a\u00020\u0012HÆ\u0003J\t\u00101\u001a\u00020\u0014HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010#J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J¦\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\u00032\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020BHÖ\u0001R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001c¨\u0006C"}, m28432d2 = {"Lco/bird/android/model/wire/configs/PrivateBirdConfig;", "", "showRangeInsteadOfBatteryPercentage", "", "showSleepWakeButton", "maxDistanceToShowAnnotationMeters", "", "useBirdUserActions", "enableMyBirdScreenRenters", "enableMyBirdScreenOwners", "scanForSmartlockInForeground", "useConsolidatedPrivateBirdList", "enableBirdAir", "enableBirdBike", "enableDiagnostics", "birdAirFirmwareConfig", "Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;", "adHocPairing", "Lco/bird/android/model/wire/configs/PrivateBirdAdHocPairingConfig;", "mobileConfig", "Lco/bird/android/model/wire/configs/PrivateBirdMobileConfig;", "forceBluetoothActions", "(ZZLjava/lang/Double;ZZZZZZZZLco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;Lco/bird/android/model/wire/configs/PrivateBirdAdHocPairingConfig;Lco/bird/android/model/wire/configs/PrivateBirdMobileConfig;Z)V", "getAdHocPairing", "()Lco/bird/android/model/wire/configs/PrivateBirdAdHocPairingConfig;", "getBirdAirFirmwareConfig", "()Lco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;", "getEnableBirdAir", "()Z", "getEnableBirdBike", "getEnableDiagnostics", "getEnableMyBirdScreenOwners", "getEnableMyBirdScreenRenters", "getForceBluetoothActions", "getMaxDistanceToShowAnnotationMeters", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMobileConfig", "()Lco/bird/android/model/wire/configs/PrivateBirdMobileConfig;", "getScanForSmartlockInForeground", "getShowRangeInsteadOfBatteryPercentage", "getShowSleepWakeButton", "getUseBirdUserActions", "getUseConsolidatedPrivateBirdList", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZZLjava/lang/Double;ZZZZZZZZLco/bird/android/model/wire/configs/PrivateBirdFirmwareConfig;Lco/bird/android/model/wire/configs/PrivateBirdAdHocPairingConfig;Lco/bird/android/model/wire/configs/PrivateBirdMobileConfig;Z)Lco/bird/android/model/wire/configs/PrivateBirdConfig;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PrivateBirdConfig {
    @JsonProperty("ad_hoc_pairing")
    @InterfaceC41208ft5("ad_hoc_pairing")
    private final PrivateBirdAdHocPairingConfig adHocPairing;
    @JsonProperty("bird_air_firmware")
    @InterfaceC41208ft5("bird_air_firmware")
    private final PrivateBirdFirmwareConfig birdAirFirmwareConfig;
    @JsonProperty("enable_bird_air")
    @InterfaceC41208ft5("enable_bird_air")
    private final boolean enableBirdAir;
    @JsonProperty("enable_bird_bike")
    @InterfaceC41208ft5("enable_bird_bike")
    private final boolean enableBirdBike;
    @JsonProperty("enable_diagnostics")
    @InterfaceC41208ft5("enable_diagnostics")
    private final boolean enableDiagnostics;
    @JsonProperty("enable_my_bird_screen_owners")
    @InterfaceC41208ft5("enable_my_bird_screen_owners")
    private final boolean enableMyBirdScreenOwners;
    @JsonProperty("enable_my_bird_screen_renters")
    @InterfaceC41208ft5("enable_my_bird_screen_renters")
    private final boolean enableMyBirdScreenRenters;
    @InterfaceC52952zi1(deserialize = false, serialize = false)
    private final boolean forceBluetoothActions;
    @JsonProperty("max_distance_to_show_annotation_meters")
    @InterfaceC41208ft5("max_distance_to_show_annotation_meters")
    private final Double maxDistanceToShowAnnotationMeters;
    @JsonProperty("mobile")
    @InterfaceC41208ft5("mobile")
    private final PrivateBirdMobileConfig mobileConfig;
    @JsonProperty("scan_for_smartlock_in_foreground")
    @InterfaceC41208ft5("scan_for_smartlock_in_foreground")
    private final boolean scanForSmartlockInForeground;
    @JsonProperty("show_range_instead_of_battery_percentage")
    @InterfaceC41208ft5("show_range_instead_of_battery_percentage")
    private final boolean showRangeInsteadOfBatteryPercentage;
    @JsonProperty("show_sleep_wake_button")
    @InterfaceC41208ft5("show_sleep_wake_button")
    private final boolean showSleepWakeButton;
    @JsonProperty("use_bird_user_actions")
    @InterfaceC41208ft5("use_bird_user_actions")
    private final boolean useBirdUserActions;
    @JsonProperty("use_consolidated_private_bird_list")
    @InterfaceC41208ft5("use_consolidated_private_bird_list")
    private final boolean useConsolidatedPrivateBirdList;

    public PrivateBirdConfig() {
        this(false, false, null, false, false, false, false, false, false, false, false, null, null, null, false, 32767, null);
    }

    public final boolean component1() {
        return this.showRangeInsteadOfBatteryPercentage;
    }

    public final boolean component10() {
        return this.enableBirdBike;
    }

    public final boolean component11() {
        return this.enableDiagnostics;
    }

    public final PrivateBirdFirmwareConfig component12() {
        return this.birdAirFirmwareConfig;
    }

    public final PrivateBirdAdHocPairingConfig component13() {
        return this.adHocPairing;
    }

    public final PrivateBirdMobileConfig component14() {
        return this.mobileConfig;
    }

    public final boolean component15() {
        return this.forceBluetoothActions;
    }

    public final boolean component2() {
        return this.showSleepWakeButton;
    }

    public final Double component3() {
        return this.maxDistanceToShowAnnotationMeters;
    }

    public final boolean component4() {
        return this.useBirdUserActions;
    }

    public final boolean component5() {
        return this.enableMyBirdScreenRenters;
    }

    public final boolean component6() {
        return this.enableMyBirdScreenOwners;
    }

    public final boolean component7() {
        return this.scanForSmartlockInForeground;
    }

    public final boolean component8() {
        return this.useConsolidatedPrivateBirdList;
    }

    public final boolean component9() {
        return this.enableBirdAir;
    }

    public final PrivateBirdConfig copy(boolean z, boolean z2, Double d, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, PrivateBirdFirmwareConfig birdAirFirmwareConfig, PrivateBirdAdHocPairingConfig adHocPairing, PrivateBirdMobileConfig mobileConfig, boolean z11) {
        Intrinsics.checkNotNullParameter(birdAirFirmwareConfig, "birdAirFirmwareConfig");
        Intrinsics.checkNotNullParameter(adHocPairing, "adHocPairing");
        Intrinsics.checkNotNullParameter(mobileConfig, "mobileConfig");
        return new PrivateBirdConfig(z, z2, d, z3, z4, z5, z6, z7, z8, z9, z10, birdAirFirmwareConfig, adHocPairing, mobileConfig, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrivateBirdConfig) {
            PrivateBirdConfig privateBirdConfig = (PrivateBirdConfig) obj;
            return this.showRangeInsteadOfBatteryPercentage == privateBirdConfig.showRangeInsteadOfBatteryPercentage && this.showSleepWakeButton == privateBirdConfig.showSleepWakeButton && Intrinsics.areEqual((Object) this.maxDistanceToShowAnnotationMeters, (Object) privateBirdConfig.maxDistanceToShowAnnotationMeters) && this.useBirdUserActions == privateBirdConfig.useBirdUserActions && this.enableMyBirdScreenRenters == privateBirdConfig.enableMyBirdScreenRenters && this.enableMyBirdScreenOwners == privateBirdConfig.enableMyBirdScreenOwners && this.scanForSmartlockInForeground == privateBirdConfig.scanForSmartlockInForeground && this.useConsolidatedPrivateBirdList == privateBirdConfig.useConsolidatedPrivateBirdList && this.enableBirdAir == privateBirdConfig.enableBirdAir && this.enableBirdBike == privateBirdConfig.enableBirdBike && this.enableDiagnostics == privateBirdConfig.enableDiagnostics && Intrinsics.areEqual(this.birdAirFirmwareConfig, privateBirdConfig.birdAirFirmwareConfig) && Intrinsics.areEqual(this.adHocPairing, privateBirdConfig.adHocPairing) && Intrinsics.areEqual(this.mobileConfig, privateBirdConfig.mobileConfig) && this.forceBluetoothActions == privateBirdConfig.forceBluetoothActions;
        }
        return false;
    }

    public final PrivateBirdAdHocPairingConfig getAdHocPairing() {
        return this.adHocPairing;
    }

    public final PrivateBirdFirmwareConfig getBirdAirFirmwareConfig() {
        return this.birdAirFirmwareConfig;
    }

    public final boolean getEnableBirdAir() {
        return this.enableBirdAir;
    }

    public final boolean getEnableBirdBike() {
        return this.enableBirdBike;
    }

    public final boolean getEnableDiagnostics() {
        return this.enableDiagnostics;
    }

    public final boolean getEnableMyBirdScreenOwners() {
        return this.enableMyBirdScreenOwners;
    }

    public final boolean getEnableMyBirdScreenRenters() {
        return this.enableMyBirdScreenRenters;
    }

    public final boolean getForceBluetoothActions() {
        return this.forceBluetoothActions;
    }

    public final Double getMaxDistanceToShowAnnotationMeters() {
        return this.maxDistanceToShowAnnotationMeters;
    }

    public final PrivateBirdMobileConfig getMobileConfig() {
        return this.mobileConfig;
    }

    public final boolean getScanForSmartlockInForeground() {
        return this.scanForSmartlockInForeground;
    }

    public final boolean getShowRangeInsteadOfBatteryPercentage() {
        return this.showRangeInsteadOfBatteryPercentage;
    }

    public final boolean getShowSleepWakeButton() {
        return this.showSleepWakeButton;
    }

    public final boolean getUseBirdUserActions() {
        return this.useBirdUserActions;
    }

    public final boolean getUseConsolidatedPrivateBirdList() {
        return this.useConsolidatedPrivateBirdList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    public int hashCode() {
        boolean z = this.showRangeInsteadOfBatteryPercentage;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.showSleepWakeButton;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        Double d = this.maxDistanceToShowAnnotationMeters;
        int hashCode = (i3 + (d == null ? 0 : d.hashCode())) * 31;
        ?? r22 = this.useBirdUserActions;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode + i4) * 31;
        ?? r23 = this.enableMyBirdScreenRenters;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        ?? r24 = this.enableMyBirdScreenOwners;
        int i8 = r24;
        if (r24 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        ?? r25 = this.scanForSmartlockInForeground;
        int i10 = r25;
        if (r25 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        ?? r26 = this.useConsolidatedPrivateBirdList;
        int i12 = r26;
        if (r26 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        ?? r27 = this.enableBirdAir;
        int i14 = r27;
        if (r27 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        ?? r28 = this.enableBirdBike;
        int i16 = r28;
        if (r28 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        ?? r29 = this.enableDiagnostics;
        int i18 = r29;
        if (r29 != 0) {
            i18 = 1;
        }
        int hashCode2 = (((((((i17 + i18) * 31) + this.birdAirFirmwareConfig.hashCode()) * 31) + this.adHocPairing.hashCode()) * 31) + this.mobileConfig.hashCode()) * 31;
        boolean z2 = this.forceBluetoothActions;
        return hashCode2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.showRangeInsteadOfBatteryPercentage;
        boolean z2 = this.showSleepWakeButton;
        Double d = this.maxDistanceToShowAnnotationMeters;
        boolean z3 = this.useBirdUserActions;
        boolean z4 = this.enableMyBirdScreenRenters;
        boolean z5 = this.enableMyBirdScreenOwners;
        boolean z6 = this.scanForSmartlockInForeground;
        boolean z7 = this.useConsolidatedPrivateBirdList;
        boolean z8 = this.enableBirdAir;
        boolean z9 = this.enableBirdBike;
        boolean z10 = this.enableDiagnostics;
        PrivateBirdFirmwareConfig privateBirdFirmwareConfig = this.birdAirFirmwareConfig;
        PrivateBirdAdHocPairingConfig privateBirdAdHocPairingConfig = this.adHocPairing;
        PrivateBirdMobileConfig privateBirdMobileConfig = this.mobileConfig;
        boolean z11 = this.forceBluetoothActions;
        return "PrivateBirdConfig(showRangeInsteadOfBatteryPercentage=" + z + ", showSleepWakeButton=" + z2 + ", maxDistanceToShowAnnotationMeters=" + d + ", useBirdUserActions=" + z3 + ", enableMyBirdScreenRenters=" + z4 + ", enableMyBirdScreenOwners=" + z5 + ", scanForSmartlockInForeground=" + z6 + ", useConsolidatedPrivateBirdList=" + z7 + ", enableBirdAir=" + z8 + ", enableBirdBike=" + z9 + ", enableDiagnostics=" + z10 + ", birdAirFirmwareConfig=" + privateBirdFirmwareConfig + ", adHocPairing=" + privateBirdAdHocPairingConfig + ", mobileConfig=" + privateBirdMobileConfig + ", forceBluetoothActions=" + z11 + ")";
    }

    public PrivateBirdConfig(boolean z, boolean z2, Double d, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, PrivateBirdFirmwareConfig birdAirFirmwareConfig, PrivateBirdAdHocPairingConfig adHocPairing, PrivateBirdMobileConfig mobileConfig, boolean z11) {
        Intrinsics.checkNotNullParameter(birdAirFirmwareConfig, "birdAirFirmwareConfig");
        Intrinsics.checkNotNullParameter(adHocPairing, "adHocPairing");
        Intrinsics.checkNotNullParameter(mobileConfig, "mobileConfig");
        this.showRangeInsteadOfBatteryPercentage = z;
        this.showSleepWakeButton = z2;
        this.maxDistanceToShowAnnotationMeters = d;
        this.useBirdUserActions = z3;
        this.enableMyBirdScreenRenters = z4;
        this.enableMyBirdScreenOwners = z5;
        this.scanForSmartlockInForeground = z6;
        this.useConsolidatedPrivateBirdList = z7;
        this.enableBirdAir = z8;
        this.enableBirdBike = z9;
        this.enableDiagnostics = z10;
        this.birdAirFirmwareConfig = birdAirFirmwareConfig;
        this.adHocPairing = adHocPairing;
        this.mobileConfig = mobileConfig;
        this.forceBluetoothActions = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PrivateBirdConfig(boolean z, boolean z2, Double d, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, PrivateBirdFirmwareConfig privateBirdFirmwareConfig, PrivateBirdAdHocPairingConfig privateBirdAdHocPairingConfig, PrivateBirdMobileConfig privateBirdMobileConfig, boolean z11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r4, r6, r7, r8, r10, r11, r12, r13, r14, r42, r16, r5, (i & 16384) == 0 ? z11 : r15);
        PrivateBirdAdHocPairingConfig privateBirdAdHocPairingConfig2;
        PrivateBirdFirmwareConfig privateBirdFirmwareConfig2;
        boolean z12;
        PrivateBirdMobileConfig privateBirdMobileConfig2;
        boolean z13 = (i & 1) != 0 ? false : z;
        boolean z14 = (i & 2) != 0 ? false : z2;
        Double d2 = (i & 4) != 0 ? null : d;
        boolean z15 = (i & 8) != 0 ? false : z3;
        boolean z16 = (i & 16) != 0 ? false : z4;
        boolean z17 = (i & 32) != 0 ? true : z5;
        boolean z18 = (i & 64) != 0 ? false : z6;
        boolean z19 = (i & 128) != 0 ? false : z7;
        boolean z20 = (i & 256) != 0 ? false : z8;
        boolean z21 = (i & 512) != 0 ? false : z9;
        boolean z22 = (i & 1024) != 0 ? false : z10;
        PrivateBirdFirmwareConfig privateBirdFirmwareConfig3 = (i & 2048) != 0 ? new PrivateBirdFirmwareConfig(null, null, null, null, null, null, false, 127, null) : privateBirdFirmwareConfig;
        PrivateBirdAdHocPairingConfig privateBirdAdHocPairingConfig3 = (i & 4096) != 0 ? new PrivateBirdAdHocPairingConfig(null, 1, null) : privateBirdAdHocPairingConfig;
        if ((i & 8192) != 0) {
            privateBirdAdHocPairingConfig2 = privateBirdAdHocPairingConfig3;
            privateBirdFirmwareConfig2 = privateBirdFirmwareConfig3;
            z12 = false;
            privateBirdMobileConfig2 = new PrivateBirdMobileConfig(false, 1, null);
        } else {
            privateBirdAdHocPairingConfig2 = privateBirdAdHocPairingConfig3;
            privateBirdFirmwareConfig2 = privateBirdFirmwareConfig3;
            z12 = false;
            privateBirdMobileConfig2 = privateBirdMobileConfig;
        }
    }
}
