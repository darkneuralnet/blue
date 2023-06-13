package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001B©\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010,J\u000b\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010:\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010;\u001a\u00020\u000eHÆ\u0003J²\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\u00032\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\bHÖ\u0001J\t\u0010A\u001a\u00020\nHÖ\u0001R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001e\u0010\u0017R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001f\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b'\u0010\u0017R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b(\u0010\u001aR\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b)\u0010\u001aR\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b*\u0010\u001aR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,¨\u0006B"}, m28432d2 = {"Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;", "", "enabled", "", "method", "Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;", "methodBlockedRideDialog", "timeoutSeconds", "", "helpArticle", "", "resultRequired", "locationServicesRequired", "requiredProximityToNestMeters", "", "requiredHorizontalAccuracyMeters", "horizontalAccuracyAllowanceMetersPerSecond", "allowDeviceLocationIfAccurateAfterSeconds", "skipBirdScan", "showArMarker", "mocked", "(Ljava/lang/Boolean;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)V", "getAllowDeviceLocationIfAccurateAfterSeconds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHelpArticle", "()Ljava/lang/String;", "getHorizontalAccuracyAllowanceMetersPerSecond", "getLocationServicesRequired", "getMethod", "()Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;", "getMethodBlockedRideDialog", "getMocked", "()Z", "getRequiredHorizontalAccuracyMeters", "()D", "getRequiredProximityToNestMeters", "getResultRequired", "getShowArMarker", "getSkipBirdScan", "getTimeoutSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Boolean;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Lco/bird/android/model/wire/configs/ParkingLocationVerificationMethod;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Double;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Z)Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ParkingLocationVerificationConfig {
    @JsonProperty("allow_device_location_if_accurate_after_seconds")
    @InterfaceC41208ft5("allow_device_location_if_accurate_after_seconds")
    private final Double allowDeviceLocationIfAccurateAfterSeconds;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final Boolean enabled;
    @JsonProperty("help_article")
    @InterfaceC41208ft5("help_article")
    private final String helpArticle;
    @JsonProperty("horizontal_accuracy_allowance_meters_per_second")
    @InterfaceC41208ft5("horizontal_accuracy_allowance_meters_per_second")
    private final Double horizontalAccuracyAllowanceMetersPerSecond;
    @JsonProperty("location_services_required")
    @InterfaceC41208ft5("location_services_required")
    private final Boolean locationServicesRequired;
    @JsonProperty("method")
    @InterfaceC41208ft5("method")
    private final ParkingLocationVerificationMethod method;
    @JsonProperty("method_blocked_ride_dialog")
    @InterfaceC41208ft5("method_blocked_ride_dialog")
    private final ParkingLocationVerificationMethod methodBlockedRideDialog;
    @JsonProperty("mocked")
    @InterfaceC41208ft5("mocked")
    private final boolean mocked;
    @JsonProperty("required_horizontal_accuracy_meters")
    @InterfaceC41208ft5("required_horizontal_accuracy_meters")
    private final double requiredHorizontalAccuracyMeters;
    @JsonProperty("required_proximity_to_nest_meters")
    @InterfaceC41208ft5("required_proximity_to_nest_meters")
    private final Double requiredProximityToNestMeters;
    @JsonProperty("result_required")
    @InterfaceC41208ft5("result_required")
    private final Boolean resultRequired;
    @JsonProperty("show_ar_marker")
    @InterfaceC41208ft5("show_ar_marker")
    private final Boolean showArMarker;
    @JsonProperty("skip_bird_scan")
    @InterfaceC41208ft5("skip_bird_scan")
    private final Boolean skipBirdScan;
    @JsonProperty("timeout_seconds")
    @InterfaceC41208ft5("timeout_seconds")
    private final Integer timeoutSeconds;

    public ParkingLocationVerificationConfig() {
        this(null, null, null, null, null, null, null, null, 0.0d, null, null, null, null, false, 16383, null);
    }

    public final Boolean component1() {
        return this.enabled;
    }

    public final Double component10() {
        return this.horizontalAccuracyAllowanceMetersPerSecond;
    }

    public final Double component11() {
        return this.allowDeviceLocationIfAccurateAfterSeconds;
    }

    public final Boolean component12() {
        return this.skipBirdScan;
    }

    public final Boolean component13() {
        return this.showArMarker;
    }

    public final boolean component14() {
        return this.mocked;
    }

    public final ParkingLocationVerificationMethod component2() {
        return this.method;
    }

    public final ParkingLocationVerificationMethod component3() {
        return this.methodBlockedRideDialog;
    }

    public final Integer component4() {
        return this.timeoutSeconds;
    }

    public final String component5() {
        return this.helpArticle;
    }

    public final Boolean component6() {
        return this.resultRequired;
    }

    public final Boolean component7() {
        return this.locationServicesRequired;
    }

    public final Double component8() {
        return this.requiredProximityToNestMeters;
    }

    public final double component9() {
        return this.requiredHorizontalAccuracyMeters;
    }

    public final ParkingLocationVerificationConfig copy(Boolean bool, ParkingLocationVerificationMethod parkingLocationVerificationMethod, ParkingLocationVerificationMethod parkingLocationVerificationMethod2, Integer num, String str, Boolean bool2, Boolean bool3, Double d, double d2, Double d3, Double d4, Boolean bool4, Boolean bool5, boolean z) {
        return new ParkingLocationVerificationConfig(bool, parkingLocationVerificationMethod, parkingLocationVerificationMethod2, num, str, bool2, bool3, d, d2, d3, d4, bool4, bool5, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParkingLocationVerificationConfig) {
            ParkingLocationVerificationConfig parkingLocationVerificationConfig = (ParkingLocationVerificationConfig) obj;
            return Intrinsics.areEqual(this.enabled, parkingLocationVerificationConfig.enabled) && this.method == parkingLocationVerificationConfig.method && this.methodBlockedRideDialog == parkingLocationVerificationConfig.methodBlockedRideDialog && Intrinsics.areEqual(this.timeoutSeconds, parkingLocationVerificationConfig.timeoutSeconds) && Intrinsics.areEqual(this.helpArticle, parkingLocationVerificationConfig.helpArticle) && Intrinsics.areEqual(this.resultRequired, parkingLocationVerificationConfig.resultRequired) && Intrinsics.areEqual(this.locationServicesRequired, parkingLocationVerificationConfig.locationServicesRequired) && Intrinsics.areEqual((Object) this.requiredProximityToNestMeters, (Object) parkingLocationVerificationConfig.requiredProximityToNestMeters) && Double.compare(this.requiredHorizontalAccuracyMeters, parkingLocationVerificationConfig.requiredHorizontalAccuracyMeters) == 0 && Intrinsics.areEqual((Object) this.horizontalAccuracyAllowanceMetersPerSecond, (Object) parkingLocationVerificationConfig.horizontalAccuracyAllowanceMetersPerSecond) && Intrinsics.areEqual((Object) this.allowDeviceLocationIfAccurateAfterSeconds, (Object) parkingLocationVerificationConfig.allowDeviceLocationIfAccurateAfterSeconds) && Intrinsics.areEqual(this.skipBirdScan, parkingLocationVerificationConfig.skipBirdScan) && Intrinsics.areEqual(this.showArMarker, parkingLocationVerificationConfig.showArMarker) && this.mocked == parkingLocationVerificationConfig.mocked;
        }
        return false;
    }

    public final Double getAllowDeviceLocationIfAccurateAfterSeconds() {
        return this.allowDeviceLocationIfAccurateAfterSeconds;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final String getHelpArticle() {
        return this.helpArticle;
    }

    public final Double getHorizontalAccuracyAllowanceMetersPerSecond() {
        return this.horizontalAccuracyAllowanceMetersPerSecond;
    }

    public final Boolean getLocationServicesRequired() {
        return this.locationServicesRequired;
    }

    public final ParkingLocationVerificationMethod getMethod() {
        return this.method;
    }

    public final ParkingLocationVerificationMethod getMethodBlockedRideDialog() {
        return this.methodBlockedRideDialog;
    }

    public final boolean getMocked() {
        return this.mocked;
    }

    public final double getRequiredHorizontalAccuracyMeters() {
        return this.requiredHorizontalAccuracyMeters;
    }

    public final Double getRequiredProximityToNestMeters() {
        return this.requiredProximityToNestMeters;
    }

    public final Boolean getResultRequired() {
        return this.resultRequired;
    }

    public final Boolean getShowArMarker() {
        return this.showArMarker;
    }

    public final Boolean getSkipBirdScan() {
        return this.skipBirdScan;
    }

    public final Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Boolean bool = this.enabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        ParkingLocationVerificationMethod parkingLocationVerificationMethod = this.method;
        int hashCode2 = (hashCode + (parkingLocationVerificationMethod == null ? 0 : parkingLocationVerificationMethod.hashCode())) * 31;
        ParkingLocationVerificationMethod parkingLocationVerificationMethod2 = this.methodBlockedRideDialog;
        int hashCode3 = (hashCode2 + (parkingLocationVerificationMethod2 == null ? 0 : parkingLocationVerificationMethod2.hashCode())) * 31;
        Integer num = this.timeoutSeconds;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.helpArticle;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.resultRequired;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.locationServicesRequired;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Double d = this.requiredProximityToNestMeters;
        int hashCode8 = (((hashCode7 + (d == null ? 0 : d.hashCode())) * 31) + Double.hashCode(this.requiredHorizontalAccuracyMeters)) * 31;
        Double d2 = this.horizontalAccuracyAllowanceMetersPerSecond;
        int hashCode9 = (hashCode8 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.allowDeviceLocationIfAccurateAfterSeconds;
        int hashCode10 = (hashCode9 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Boolean bool4 = this.skipBirdScan;
        int hashCode11 = (hashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.showArMarker;
        int hashCode12 = (hashCode11 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        boolean z = this.mocked;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode12 + i;
    }

    public String toString() {
        Boolean bool = this.enabled;
        ParkingLocationVerificationMethod parkingLocationVerificationMethod = this.method;
        ParkingLocationVerificationMethod parkingLocationVerificationMethod2 = this.methodBlockedRideDialog;
        Integer num = this.timeoutSeconds;
        String str = this.helpArticle;
        Boolean bool2 = this.resultRequired;
        Boolean bool3 = this.locationServicesRequired;
        Double d = this.requiredProximityToNestMeters;
        double d2 = this.requiredHorizontalAccuracyMeters;
        Double d3 = this.horizontalAccuracyAllowanceMetersPerSecond;
        Double d4 = this.allowDeviceLocationIfAccurateAfterSeconds;
        Boolean bool4 = this.skipBirdScan;
        Boolean bool5 = this.showArMarker;
        boolean z = this.mocked;
        return "ParkingLocationVerificationConfig(enabled=" + bool + ", method=" + parkingLocationVerificationMethod + ", methodBlockedRideDialog=" + parkingLocationVerificationMethod2 + ", timeoutSeconds=" + num + ", helpArticle=" + str + ", resultRequired=" + bool2 + ", locationServicesRequired=" + bool3 + ", requiredProximityToNestMeters=" + d + ", requiredHorizontalAccuracyMeters=" + d2 + ", horizontalAccuracyAllowanceMetersPerSecond=" + d3 + ", allowDeviceLocationIfAccurateAfterSeconds=" + d4 + ", skipBirdScan=" + bool4 + ", showArMarker=" + bool5 + ", mocked=" + z + ")";
    }

    public ParkingLocationVerificationConfig(Boolean bool, ParkingLocationVerificationMethod parkingLocationVerificationMethod, ParkingLocationVerificationMethod parkingLocationVerificationMethod2, Integer num, String str, Boolean bool2, Boolean bool3, Double d, double d2, Double d3, Double d4, Boolean bool4, Boolean bool5, boolean z) {
        this.enabled = bool;
        this.method = parkingLocationVerificationMethod;
        this.methodBlockedRideDialog = parkingLocationVerificationMethod2;
        this.timeoutSeconds = num;
        this.helpArticle = str;
        this.resultRequired = bool2;
        this.locationServicesRequired = bool3;
        this.requiredProximityToNestMeters = d;
        this.requiredHorizontalAccuracyMeters = d2;
        this.horizontalAccuracyAllowanceMetersPerSecond = d3;
        this.allowDeviceLocationIfAccurateAfterSeconds = d4;
        this.skipBirdScan = bool4;
        this.showArMarker = bool5;
        this.mocked = z;
    }

    public /* synthetic */ ParkingLocationVerificationConfig(Boolean bool, ParkingLocationVerificationMethod parkingLocationVerificationMethod, ParkingLocationVerificationMethod parkingLocationVerificationMethod2, Integer num, String str, Boolean bool2, Boolean bool3, Double d, double d2, Double d3, Double d4, Boolean bool4, Boolean bool5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? ParkingLocationVerificationMethod.NONE : parkingLocationVerificationMethod, (i & 4) != 0 ? ParkingLocationVerificationMethod.NONE : parkingLocationVerificationMethod2, (i & 8) != 0 ? 30 : num, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : bool2, (i & 64) != 0 ? null : bool3, (i & 128) != 0 ? null : d, (i & 256) != 0 ? 3.0d : d2, (i & 512) != 0 ? null : d3, (i & 1024) != 0 ? null : d4, (i & 2048) != 0 ? null : bool4, (i & 4096) == 0 ? bool5 : null, (i & 8192) != 0 ? false : z);
    }
}
