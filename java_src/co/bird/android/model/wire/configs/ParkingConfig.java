package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b>\b\u0086\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001dJ\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0013HÆ\u0003J\t\u0010B\u001a\u00020\u0013HÆ\u0003J\t\u0010C\u001a\u00020\u0013HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u001aHÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010;J\t\u0010K\u001a\u00020\u0007HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\fHÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003Jä\u0001\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020\u00032\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020\u0013HÖ\u0001J\t\u0010W\u001a\u00020\fHÖ\u0001R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0015\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\u0019\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001fR\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;¨\u0006X"}, m28432d2 = {"Lco/bird/android/model/wire/configs/ParkingConfig;", "", "enableRiderParkingNestAnnotation", "", "parkingIncentiveValue", "", "parkingMinimumZoomLevel", "", "enableRiderParkingReview", "enableOutsideServiceAreaRiderBarParkingFineMessage", "showParkingAnnouncement", "parkingAnnouncementCityName", "", "enableNoParkZoneNoEndRideButton", "enableHorizontalAccuracyLocation", "enableRiderParkingNestRadius", "enableNestDetailsScreen", "enableAndroidBackgroundRidePhotoUpload", "maxMetersFromParkingNestToBeClose", "", "closeToNestParkingRateMinutes", "closeToNestParkingLimit", "enableCloseToNestParking", "allowLockInNoParking", "disableParkingBottomShelfDisplay", "parkingLocationVerification", "Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;", "riderNestAdditionalBufferMeters", "useAreaKeys", "(ZJDZZZLjava/lang/String;ZZZZZIIIZZZLco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;Ljava/lang/Double;Ljava/lang/Boolean;)V", "getAllowLockInNoParking", "()Z", "getCloseToNestParkingLimit", "()I", "getCloseToNestParkingRateMinutes", "getDisableParkingBottomShelfDisplay", "getEnableAndroidBackgroundRidePhotoUpload", "getEnableCloseToNestParking", "getEnableHorizontalAccuracyLocation", "getEnableNestDetailsScreen", "getEnableNoParkZoneNoEndRideButton", "getEnableOutsideServiceAreaRiderBarParkingFineMessage", "getEnableRiderParkingNestAnnotation", "getEnableRiderParkingNestRadius", "getEnableRiderParkingReview", "getMaxMetersFromParkingNestToBeClose", "getParkingAnnouncementCityName", "()Ljava/lang/String;", "getParkingIncentiveValue", "()J", "getParkingLocationVerification", "()Lco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;", "getParkingMinimumZoomLevel", "()D", "getRiderNestAdditionalBufferMeters", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getShowParkingAnnouncement", "getUseAreaKeys", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZJDZZZLjava/lang/String;ZZZZZIIIZZZLco/bird/android/model/wire/configs/ParkingLocationVerificationConfig;Ljava/lang/Double;Ljava/lang/Boolean;)Lco/bird/android/model/wire/configs/ParkingConfig;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ParkingConfig {
    @JsonProperty("allow_lock_in_no_parking")
    @InterfaceC41208ft5("allow_lock_in_no_parking")
    private final boolean allowLockInNoParking;
    @JsonProperty("close_to_nest_parking_limit")
    @InterfaceC41208ft5("close_to_nest_parking_limit")
    private final int closeToNestParkingLimit;
    @JsonProperty("close_to_nest_parking_rate_minutes")
    @InterfaceC41208ft5("close_to_nest_parking_rate_minutes")
    private final int closeToNestParkingRateMinutes;
    @JsonProperty("disable_parking_bottom_shelf_display")
    @InterfaceC41208ft5("disable_parking_bottom_shelf_display")
    private final boolean disableParkingBottomShelfDisplay;
    @JsonProperty("enable_android_background_ride_photo_upload")
    @InterfaceC41208ft5("enable_android_background_ride_photo_upload")
    private final boolean enableAndroidBackgroundRidePhotoUpload;
    @JsonProperty("enable_close_to_nest_parking")
    @InterfaceC41208ft5("enable_close_to_nest_parking")
    private final boolean enableCloseToNestParking;
    @JsonProperty("enable_horizontal_accuracy_location")
    @InterfaceC41208ft5("enable_horizontal_accuracy_location")
    private final boolean enableHorizontalAccuracyLocation;
    @JsonProperty("enable_nest_details_screen")
    @InterfaceC41208ft5("enable_nest_details_screen")
    private final boolean enableNestDetailsScreen;
    @JsonProperty("enable_no_park_zone_no_end_ride_button")
    @InterfaceC41208ft5("enable_no_park_zone_no_end_ride_button")
    private final boolean enableNoParkZoneNoEndRideButton;
    @JsonProperty("enable_outside_service_area_rider_bar_parking_fine_message")
    @InterfaceC41208ft5("enable_outside_service_area_rider_bar_parking_fine_message")
    private final boolean enableOutsideServiceAreaRiderBarParkingFineMessage;
    @JsonProperty("enable_rider_parking_nest_annotation")
    @InterfaceC41208ft5("enable_rider_parking_nest_annotation")
    private final boolean enableRiderParkingNestAnnotation;
    @JsonProperty("enable_rider_parking_nest_radius")
    @InterfaceC41208ft5("enable_rider_parking_nest_radius")
    private final boolean enableRiderParkingNestRadius;
    @JsonProperty("enable_rider_parking_review")
    @InterfaceC41208ft5("enable_rider_parking_review")
    private final boolean enableRiderParkingReview;
    @JsonProperty("max_meters_from_parking_nest_to_be_close")
    @InterfaceC41208ft5("max_meters_from_parking_nest_to_be_close")
    private final int maxMetersFromParkingNestToBeClose;
    @JsonProperty("parking_announcement_city_name")
    @InterfaceC41208ft5("parking_announcement_city_name")
    private final String parkingAnnouncementCityName;
    @JsonProperty("parking_incentive_value")
    @InterfaceC41208ft5("parking_incentive_value")
    private final long parkingIncentiveValue;
    @JsonProperty("parking_location_verification")
    @InterfaceC41208ft5("parking_location_verification")
    private final ParkingLocationVerificationConfig parkingLocationVerification;
    @JsonProperty("parking_minimum_zoom_level")
    @InterfaceC41208ft5("parking_minimum_zoom_level")
    private final double parkingMinimumZoomLevel;
    @JsonProperty("rider_nest_additional_buffer_meters")
    @InterfaceC41208ft5("rider_nest_additional_buffer_meters")
    private final Double riderNestAdditionalBufferMeters;
    @JsonProperty("show_parking_announcement")
    @InterfaceC41208ft5("show_parking_announcement")
    private final boolean showParkingAnnouncement;
    @JsonProperty("use_area_keys")
    @InterfaceC41208ft5("use_area_keys")
    private final Boolean useAreaKeys;

    public ParkingConfig() {
        this(false, 0L, 0.0d, false, false, false, null, false, false, false, false, false, 0, 0, 0, false, false, false, null, null, null, 2097151, null);
    }

    public final boolean component1() {
        return this.enableRiderParkingNestAnnotation;
    }

    public final boolean component10() {
        return this.enableRiderParkingNestRadius;
    }

    public final boolean component11() {
        return this.enableNestDetailsScreen;
    }

    public final boolean component12() {
        return this.enableAndroidBackgroundRidePhotoUpload;
    }

    public final int component13() {
        return this.maxMetersFromParkingNestToBeClose;
    }

    public final int component14() {
        return this.closeToNestParkingRateMinutes;
    }

    public final int component15() {
        return this.closeToNestParkingLimit;
    }

    public final boolean component16() {
        return this.enableCloseToNestParking;
    }

    public final boolean component17() {
        return this.allowLockInNoParking;
    }

    public final boolean component18() {
        return this.disableParkingBottomShelfDisplay;
    }

    public final ParkingLocationVerificationConfig component19() {
        return this.parkingLocationVerification;
    }

    public final long component2() {
        return this.parkingIncentiveValue;
    }

    public final Double component20() {
        return this.riderNestAdditionalBufferMeters;
    }

    public final Boolean component21() {
        return this.useAreaKeys;
    }

    public final double component3() {
        return this.parkingMinimumZoomLevel;
    }

    public final boolean component4() {
        return this.enableRiderParkingReview;
    }

    public final boolean component5() {
        return this.enableOutsideServiceAreaRiderBarParkingFineMessage;
    }

    public final boolean component6() {
        return this.showParkingAnnouncement;
    }

    public final String component7() {
        return this.parkingAnnouncementCityName;
    }

    public final boolean component8() {
        return this.enableNoParkZoneNoEndRideButton;
    }

    public final boolean component9() {
        return this.enableHorizontalAccuracyLocation;
    }

    public final ParkingConfig copy(boolean z, long j, double d, boolean z2, boolean z3, boolean z4, String parkingAnnouncementCityName, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, int i2, int i3, boolean z10, boolean z11, boolean z12, ParkingLocationVerificationConfig parkingLocationVerification, Double d2, Boolean bool) {
        Intrinsics.checkNotNullParameter(parkingAnnouncementCityName, "parkingAnnouncementCityName");
        Intrinsics.checkNotNullParameter(parkingLocationVerification, "parkingLocationVerification");
        return new ParkingConfig(z, j, d, z2, z3, z4, parkingAnnouncementCityName, z5, z6, z7, z8, z9, i, i2, i3, z10, z11, z12, parkingLocationVerification, d2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParkingConfig) {
            ParkingConfig parkingConfig = (ParkingConfig) obj;
            return this.enableRiderParkingNestAnnotation == parkingConfig.enableRiderParkingNestAnnotation && this.parkingIncentiveValue == parkingConfig.parkingIncentiveValue && Double.compare(this.parkingMinimumZoomLevel, parkingConfig.parkingMinimumZoomLevel) == 0 && this.enableRiderParkingReview == parkingConfig.enableRiderParkingReview && this.enableOutsideServiceAreaRiderBarParkingFineMessage == parkingConfig.enableOutsideServiceAreaRiderBarParkingFineMessage && this.showParkingAnnouncement == parkingConfig.showParkingAnnouncement && Intrinsics.areEqual(this.parkingAnnouncementCityName, parkingConfig.parkingAnnouncementCityName) && this.enableNoParkZoneNoEndRideButton == parkingConfig.enableNoParkZoneNoEndRideButton && this.enableHorizontalAccuracyLocation == parkingConfig.enableHorizontalAccuracyLocation && this.enableRiderParkingNestRadius == parkingConfig.enableRiderParkingNestRadius && this.enableNestDetailsScreen == parkingConfig.enableNestDetailsScreen && this.enableAndroidBackgroundRidePhotoUpload == parkingConfig.enableAndroidBackgroundRidePhotoUpload && this.maxMetersFromParkingNestToBeClose == parkingConfig.maxMetersFromParkingNestToBeClose && this.closeToNestParkingRateMinutes == parkingConfig.closeToNestParkingRateMinutes && this.closeToNestParkingLimit == parkingConfig.closeToNestParkingLimit && this.enableCloseToNestParking == parkingConfig.enableCloseToNestParking && this.allowLockInNoParking == parkingConfig.allowLockInNoParking && this.disableParkingBottomShelfDisplay == parkingConfig.disableParkingBottomShelfDisplay && Intrinsics.areEqual(this.parkingLocationVerification, parkingConfig.parkingLocationVerification) && Intrinsics.areEqual((Object) this.riderNestAdditionalBufferMeters, (Object) parkingConfig.riderNestAdditionalBufferMeters) && Intrinsics.areEqual(this.useAreaKeys, parkingConfig.useAreaKeys);
        }
        return false;
    }

    public final boolean getAllowLockInNoParking() {
        return this.allowLockInNoParking;
    }

    public final int getCloseToNestParkingLimit() {
        return this.closeToNestParkingLimit;
    }

    public final int getCloseToNestParkingRateMinutes() {
        return this.closeToNestParkingRateMinutes;
    }

    public final boolean getDisableParkingBottomShelfDisplay() {
        return this.disableParkingBottomShelfDisplay;
    }

    public final boolean getEnableAndroidBackgroundRidePhotoUpload() {
        return this.enableAndroidBackgroundRidePhotoUpload;
    }

    public final boolean getEnableCloseToNestParking() {
        return this.enableCloseToNestParking;
    }

    public final boolean getEnableHorizontalAccuracyLocation() {
        return this.enableHorizontalAccuracyLocation;
    }

    public final boolean getEnableNestDetailsScreen() {
        return this.enableNestDetailsScreen;
    }

    public final boolean getEnableNoParkZoneNoEndRideButton() {
        return this.enableNoParkZoneNoEndRideButton;
    }

    public final boolean getEnableOutsideServiceAreaRiderBarParkingFineMessage() {
        return this.enableOutsideServiceAreaRiderBarParkingFineMessage;
    }

    public final boolean getEnableRiderParkingNestAnnotation() {
        return this.enableRiderParkingNestAnnotation;
    }

    public final boolean getEnableRiderParkingNestRadius() {
        return this.enableRiderParkingNestRadius;
    }

    public final boolean getEnableRiderParkingReview() {
        return this.enableRiderParkingReview;
    }

    public final int getMaxMetersFromParkingNestToBeClose() {
        return this.maxMetersFromParkingNestToBeClose;
    }

    public final String getParkingAnnouncementCityName() {
        return this.parkingAnnouncementCityName;
    }

    public final long getParkingIncentiveValue() {
        return this.parkingIncentiveValue;
    }

    public final ParkingLocationVerificationConfig getParkingLocationVerification() {
        return this.parkingLocationVerification;
    }

    public final double getParkingMinimumZoomLevel() {
        return this.parkingMinimumZoomLevel;
    }

    public final Double getRiderNestAdditionalBufferMeters() {
        return this.riderNestAdditionalBufferMeters;
    }

    public final boolean getShowParkingAnnouncement() {
        return this.showParkingAnnouncement;
    }

    public final Boolean getUseAreaKeys() {
        return this.useAreaKeys;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean z = this.enableRiderParkingNestAnnotation;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((((r0 * 31) + Long.hashCode(this.parkingIncentiveValue)) * 31) + Double.hashCode(this.parkingMinimumZoomLevel)) * 31;
        ?? r2 = this.enableRiderParkingReview;
        int i = r2;
        if (r2 != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        ?? r22 = this.enableOutsideServiceAreaRiderBarParkingFineMessage;
        int i3 = r22;
        if (r22 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        ?? r23 = this.showParkingAnnouncement;
        int i5 = r23;
        if (r23 != 0) {
            i5 = 1;
        }
        int hashCode2 = (((i4 + i5) * 31) + this.parkingAnnouncementCityName.hashCode()) * 31;
        ?? r24 = this.enableNoParkZoneNoEndRideButton;
        int i6 = r24;
        if (r24 != 0) {
            i6 = 1;
        }
        int i7 = (hashCode2 + i6) * 31;
        ?? r25 = this.enableHorizontalAccuracyLocation;
        int i8 = r25;
        if (r25 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        ?? r26 = this.enableRiderParkingNestRadius;
        int i10 = r26;
        if (r26 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        ?? r27 = this.enableNestDetailsScreen;
        int i12 = r27;
        if (r27 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        ?? r28 = this.enableAndroidBackgroundRidePhotoUpload;
        int i14 = r28;
        if (r28 != 0) {
            i14 = 1;
        }
        int hashCode3 = (((((((i13 + i14) * 31) + Integer.hashCode(this.maxMetersFromParkingNestToBeClose)) * 31) + Integer.hashCode(this.closeToNestParkingRateMinutes)) * 31) + Integer.hashCode(this.closeToNestParkingLimit)) * 31;
        ?? r29 = this.enableCloseToNestParking;
        int i15 = r29;
        if (r29 != 0) {
            i15 = 1;
        }
        int i16 = (hashCode3 + i15) * 31;
        ?? r210 = this.allowLockInNoParking;
        int i17 = r210;
        if (r210 != 0) {
            i17 = 1;
        }
        int i18 = (i16 + i17) * 31;
        boolean z2 = this.disableParkingBottomShelfDisplay;
        int hashCode4 = (((i18 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.parkingLocationVerification.hashCode()) * 31;
        Double d = this.riderNestAdditionalBufferMeters;
        int hashCode5 = (hashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.useAreaKeys;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.enableRiderParkingNestAnnotation;
        long j = this.parkingIncentiveValue;
        double d = this.parkingMinimumZoomLevel;
        boolean z2 = this.enableRiderParkingReview;
        boolean z3 = this.enableOutsideServiceAreaRiderBarParkingFineMessage;
        boolean z4 = this.showParkingAnnouncement;
        String str = this.parkingAnnouncementCityName;
        boolean z5 = this.enableNoParkZoneNoEndRideButton;
        boolean z6 = this.enableHorizontalAccuracyLocation;
        boolean z7 = this.enableRiderParkingNestRadius;
        boolean z8 = this.enableNestDetailsScreen;
        boolean z9 = this.enableAndroidBackgroundRidePhotoUpload;
        int i = this.maxMetersFromParkingNestToBeClose;
        int i2 = this.closeToNestParkingRateMinutes;
        int i3 = this.closeToNestParkingLimit;
        boolean z10 = this.enableCloseToNestParking;
        boolean z11 = this.allowLockInNoParking;
        boolean z12 = this.disableParkingBottomShelfDisplay;
        ParkingLocationVerificationConfig parkingLocationVerificationConfig = this.parkingLocationVerification;
        Double d2 = this.riderNestAdditionalBufferMeters;
        Boolean bool = this.useAreaKeys;
        return "ParkingConfig(enableRiderParkingNestAnnotation=" + z + ", parkingIncentiveValue=" + j + ", parkingMinimumZoomLevel=" + d + ", enableRiderParkingReview=" + z2 + ", enableOutsideServiceAreaRiderBarParkingFineMessage=" + z3 + ", showParkingAnnouncement=" + z4 + ", parkingAnnouncementCityName=" + str + ", enableNoParkZoneNoEndRideButton=" + z5 + ", enableHorizontalAccuracyLocation=" + z6 + ", enableRiderParkingNestRadius=" + z7 + ", enableNestDetailsScreen=" + z8 + ", enableAndroidBackgroundRidePhotoUpload=" + z9 + ", maxMetersFromParkingNestToBeClose=" + i + ", closeToNestParkingRateMinutes=" + i2 + ", closeToNestParkingLimit=" + i3 + ", enableCloseToNestParking=" + z10 + ", allowLockInNoParking=" + z11 + ", disableParkingBottomShelfDisplay=" + z12 + ", parkingLocationVerification=" + parkingLocationVerificationConfig + ", riderNestAdditionalBufferMeters=" + d2 + ", useAreaKeys=" + bool + ")";
    }

    public ParkingConfig(boolean z, long j, double d, boolean z2, boolean z3, boolean z4, String parkingAnnouncementCityName, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, int i2, int i3, boolean z10, boolean z11, boolean z12, ParkingLocationVerificationConfig parkingLocationVerification, Double d2, Boolean bool) {
        Intrinsics.checkNotNullParameter(parkingAnnouncementCityName, "parkingAnnouncementCityName");
        Intrinsics.checkNotNullParameter(parkingLocationVerification, "parkingLocationVerification");
        this.enableRiderParkingNestAnnotation = z;
        this.parkingIncentiveValue = j;
        this.parkingMinimumZoomLevel = d;
        this.enableRiderParkingReview = z2;
        this.enableOutsideServiceAreaRiderBarParkingFineMessage = z3;
        this.showParkingAnnouncement = z4;
        this.parkingAnnouncementCityName = parkingAnnouncementCityName;
        this.enableNoParkZoneNoEndRideButton = z5;
        this.enableHorizontalAccuracyLocation = z6;
        this.enableRiderParkingNestRadius = z7;
        this.enableNestDetailsScreen = z8;
        this.enableAndroidBackgroundRidePhotoUpload = z9;
        this.maxMetersFromParkingNestToBeClose = i;
        this.closeToNestParkingRateMinutes = i2;
        this.closeToNestParkingLimit = i3;
        this.enableCloseToNestParking = z10;
        this.allowLockInNoParking = z11;
        this.disableParkingBottomShelfDisplay = z12;
        this.parkingLocationVerification = parkingLocationVerification;
        this.riderNestAdditionalBufferMeters = d2;
        this.useAreaKeys = bool;
    }

    public /* synthetic */ ParkingConfig(boolean z, long j, double d, boolean z2, boolean z3, boolean z4, String str, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, int i2, int i3, boolean z10, boolean z11, boolean z12, ParkingLocationVerificationConfig parkingLocationVerificationConfig, Double d2, Boolean bool, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? 0L : j, (i4 & 4) != 0 ? 15.0d : d, (i4 & 8) != 0 ? false : z2, (i4 & 16) != 0 ? false : z3, (i4 & 32) != 0 ? false : z4, (i4 & 64) != 0 ? "" : str, (i4 & 128) != 0 ? false : z5, (i4 & 256) != 0 ? false : z6, (i4 & 512) != 0 ? false : z7, (i4 & 1024) != 0 ? false : z8, (i4 & 2048) != 0 ? false : z9, (i4 & 4096) != 0 ? 100 : i, (i4 & 8192) != 0 ? 120 : i2, (i4 & 16384) != 0 ? 2 : i3, (i4 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? false : z10, (i4 & 65536) != 0 ? false : z11, (i4 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? false : z12, (i4 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? new ParkingLocationVerificationConfig(null, null, null, null, null, null, null, null, 0.0d, null, null, null, null, false, 16383, null) : parkingLocationVerificationConfig, (i4 & 524288) != 0 ? null : d2, (i4 & 1048576) == 0 ? bool : null);
    }
}
