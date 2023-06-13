package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\bN\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B¹\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0014¢\u0006\u0002\u0010#J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010R\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010*J\u0010\u0010S\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010*J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010*J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u001eHÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0014HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003JÂ\u0002\u0010g\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u0014HÆ\u0001¢\u0006\u0002\u0010hJ\u0013\u0010i\u001a\u00020\u00032\b\u0010j\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010k\u001a\u00020\u0014HÖ\u0001J\t\u0010l\u001a\u00020mHÖ\u0001R\u0016\u0010\"\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b,\u0010*R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b-\u0010*R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010+\u001a\u0004\b.\u0010*R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010'R\u001c\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u00101\u001a\u0004\b2\u0010'R\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'R\u0016\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010'R\u0016\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010'R\u0016\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010'R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010'R\u0016\u0010\u001f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010'R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010'R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010'R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010'R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010'R\u0016\u0010 \u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010'R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010'R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010'R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010'R\u0016\u0010!\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010'R\u0016\u0010\u001d\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010'R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010'R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010'R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010'R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010'¨\u0006n"}, m28432d2 = {"Lco/bird/android/model/wire/configs/ChargerConfig;", "", "markDamagedCopyUpdates", "", "chargerEnableMarkDamaged", "enableCommunityMode", "blockBountyMapOnTaskLimitReached", "enableReportMultipleBirdsCharger", "enableReportMultipleBirdsRider", "requireReleasePhoto", "enableActiveBluetoothSweep", "requireBluetoothOnCapture", "enableTabbedTaskList", "enableDisplayNestRadius", "requireBluetoothOnRelease", "enableDamagedBirdsPin", "enableFrequentLocationUpdates", "showChargerMarketing", "enableCancelTaskRequest", "defaultMinLastRiddenFilter", "", "defaultMaxLastRiddenFilter", "defaultMinLastLocatedFilter", "defaultMaxLastLocatedFilter", "enableBirdTypeFilter", "enableBirdNestMultiClaim", "enableBrandedChargerExperience", "enableBrandedChargerBountyBanner", "enableBrandedDropMapBanner", "mapPinsStaleThreshold", "", "enableChargerFlightView", "enableLastRideFilter", "hideLastRiddenFromFlightBar", "birdFinderToolTipMapSeenMinCount", "(ZZZZZZZZZZZZZZZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZZZZZJZZZI)V", "getBirdFinderToolTipMapSeenMinCount", "()I", "getBlockBountyMapOnTaskLimitReached", "()Z", "getChargerEnableMarkDamaged", "getDefaultMaxLastLocatedFilter", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDefaultMaxLastRiddenFilter", "getDefaultMinLastLocatedFilter", "getDefaultMinLastRiddenFilter", "getEnableActiveBluetoothSweep", "getEnableBirdNestMultiClaim$annotations", "()V", "getEnableBirdNestMultiClaim", "getEnableBirdTypeFilter", "getEnableBrandedChargerBountyBanner", "getEnableBrandedChargerExperience", "getEnableBrandedDropMapBanner", "getEnableCancelTaskRequest", "getEnableChargerFlightView", "getEnableCommunityMode", "getEnableDamagedBirdsPin", "getEnableDisplayNestRadius", "getEnableFrequentLocationUpdates", "getEnableLastRideFilter", "getEnableReportMultipleBirdsCharger", "getEnableReportMultipleBirdsRider", "getEnableTabbedTaskList", "getHideLastRiddenFromFlightBar", "getMapPinsStaleThreshold", "()J", "getMarkDamagedCopyUpdates", "getRequireBluetoothOnCapture", "getRequireBluetoothOnRelease", "getRequireReleasePhoto", "getShowChargerMarketing", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZZZZZZZZZZZZZZZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZZZZZJZZZI)Lco/bird/android/model/wire/configs/ChargerConfig;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ChargerConfig {
    @JsonProperty("bird_finder_tool_tip_map_seen_min_count")
    @InterfaceC41208ft5("bird_finder_tool_tip_map_seen_min_count")
    private final int birdFinderToolTipMapSeenMinCount;
    @JsonProperty("block_bounty_map_on_task_limit_reached")
    @InterfaceC41208ft5("block_bounty_map_on_task_limit_reached")
    private final boolean blockBountyMapOnTaskLimitReached;
    @JsonProperty("enable_mark_damage")
    @InterfaceC41208ft5("enable_mark_damage")
    private final boolean chargerEnableMarkDamaged;
    @JsonProperty("default_max_last_located_filter")
    @InterfaceC41208ft5("default_max_last_located_filter")
    private final Integer defaultMaxLastLocatedFilter;
    @JsonProperty("default_max_last_ridden_filter")
    @InterfaceC41208ft5("default_max_last_ridden_filter")
    private final Integer defaultMaxLastRiddenFilter;
    @JsonProperty("default_min_last_located_filter")
    @InterfaceC41208ft5("default_min_last_located_filter")
    private final Integer defaultMinLastLocatedFilter;
    @JsonProperty("default_min_last_ridden_filter")
    @InterfaceC41208ft5("default_min_last_ridden_filter")
    private final Integer defaultMinLastRiddenFilter;
    @JsonProperty("enable_active_nearby_birds_sweep")
    @InterfaceC41208ft5("enable_active_nearby_birds_sweep")
    private final boolean enableActiveBluetoothSweep;
    @JsonProperty("enable_nest_multi_claim")
    @InterfaceC41208ft5("enable_nest_multi_claim")
    private final boolean enableBirdNestMultiClaim;
    @JsonProperty("enable_bird_type_filter")
    @InterfaceC41208ft5("enable_bird_type_filter")
    private final boolean enableBirdTypeFilter;
    @JsonProperty("enable_branded_charger_bounty_banner")
    @InterfaceC41208ft5("enable_branded_charger_bounty_banner")
    private final boolean enableBrandedChargerBountyBanner;
    @JsonProperty("enable_branded_charger_experience")
    @InterfaceC41208ft5("enable_branded_charger_experience")
    private final boolean enableBrandedChargerExperience;
    @JsonProperty("enable_branded_drop_map_banner")
    @InterfaceC41208ft5("enable_branded_drop_map_banner")
    private final boolean enableBrandedDropMapBanner;
    @JsonProperty("enable_cancel_task_request")
    @InterfaceC41208ft5("enable_cancel_task_request")
    private final boolean enableCancelTaskRequest;
    @JsonProperty("enable_charger_flight_view")
    @InterfaceC41208ft5("enable_charger_flight_view")
    private final boolean enableChargerFlightView;
    @JsonProperty("enable_community_mode")
    @InterfaceC41208ft5("enable_community_mode")
    private final boolean enableCommunityMode;
    @JsonProperty("enable_damaged_birds_pin")
    @InterfaceC41208ft5("enable_damaged_birds_pin")
    private final boolean enableDamagedBirdsPin;
    @JsonProperty("enable_display_nest_radius")
    @InterfaceC41208ft5("enable_display_nest_radius")
    private final boolean enableDisplayNestRadius;
    @JsonProperty("enable_frequent_location_updates")
    @InterfaceC41208ft5("enable_frequent_location_updates")
    private final boolean enableFrequentLocationUpdates;
    @JsonProperty("enable_last_ride_filter")
    @InterfaceC41208ft5("enable_last_ride_filter")
    private final boolean enableLastRideFilter;
    @JsonProperty("enable_report_multiple_birds_charger")
    @InterfaceC41208ft5("enable_report_multiple_birds_charger")
    private final boolean enableReportMultipleBirdsCharger;
    @JsonProperty("enable_report_multiple_birds_rider")
    @InterfaceC41208ft5("enable_report_multiple_birds_rider")
    private final boolean enableReportMultipleBirdsRider;
    @JsonProperty("enable_tabbed_task_list")
    @InterfaceC41208ft5("enable_tabbed_task_list")
    private final boolean enableTabbedTaskList;
    @JsonProperty("hide_last_ridden_from_flight_bar")
    @InterfaceC41208ft5("hide_last_ridden_from_flight_bar")
    private final boolean hideLastRiddenFromFlightBar;
    @JsonProperty("map_pins_stale_threshold")
    @InterfaceC41208ft5("map_pins_stale_threshold")
    private final long mapPinsStaleThreshold;
    @JsonProperty("mark_damaged_copy_updates")
    @InterfaceC41208ft5("mark_damaged_copy_updates")
    private final boolean markDamagedCopyUpdates;
    @JsonProperty("require_bluetooth_on_capture")
    @InterfaceC41208ft5("require_bluetooth_on_capture")
    private final boolean requireBluetoothOnCapture;
    @JsonProperty("require_bluetooth_on_release")
    @InterfaceC41208ft5("require_bluetooth_on_release")
    private final boolean requireBluetoothOnRelease;
    @JsonProperty("require_release_photo")
    @InterfaceC41208ft5("require_release_photo")
    private final boolean requireReleasePhoto;
    @JsonProperty("show_charger_marketing")
    @InterfaceC41208ft5("show_charger_marketing")
    private final boolean showChargerMarketing;

    public ChargerConfig() {
        this(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, null, null, null, false, false, false, false, false, 0L, false, false, false, 0, 1073741823, null);
    }

    @Deprecated(message = "Use enableMultiNestClaim from OperatorNestMapConfig instead")
    public static /* synthetic */ void getEnableBirdNestMultiClaim$annotations() {
    }

    public final boolean component1() {
        return this.markDamagedCopyUpdates;
    }

    public final boolean component10() {
        return this.enableTabbedTaskList;
    }

    public final boolean component11() {
        return this.enableDisplayNestRadius;
    }

    public final boolean component12() {
        return this.requireBluetoothOnRelease;
    }

    public final boolean component13() {
        return this.enableDamagedBirdsPin;
    }

    public final boolean component14() {
        return this.enableFrequentLocationUpdates;
    }

    public final boolean component15() {
        return this.showChargerMarketing;
    }

    public final boolean component16() {
        return this.enableCancelTaskRequest;
    }

    public final Integer component17() {
        return this.defaultMinLastRiddenFilter;
    }

    public final Integer component18() {
        return this.defaultMaxLastRiddenFilter;
    }

    public final Integer component19() {
        return this.defaultMinLastLocatedFilter;
    }

    public final boolean component2() {
        return this.chargerEnableMarkDamaged;
    }

    public final Integer component20() {
        return this.defaultMaxLastLocatedFilter;
    }

    public final boolean component21() {
        return this.enableBirdTypeFilter;
    }

    public final boolean component22() {
        return this.enableBirdNestMultiClaim;
    }

    public final boolean component23() {
        return this.enableBrandedChargerExperience;
    }

    public final boolean component24() {
        return this.enableBrandedChargerBountyBanner;
    }

    public final boolean component25() {
        return this.enableBrandedDropMapBanner;
    }

    public final long component26() {
        return this.mapPinsStaleThreshold;
    }

    public final boolean component27() {
        return this.enableChargerFlightView;
    }

    public final boolean component28() {
        return this.enableLastRideFilter;
    }

    public final boolean component29() {
        return this.hideLastRiddenFromFlightBar;
    }

    public final boolean component3() {
        return this.enableCommunityMode;
    }

    public final int component30() {
        return this.birdFinderToolTipMapSeenMinCount;
    }

    public final boolean component4() {
        return this.blockBountyMapOnTaskLimitReached;
    }

    public final boolean component5() {
        return this.enableReportMultipleBirdsCharger;
    }

    public final boolean component6() {
        return this.enableReportMultipleBirdsRider;
    }

    public final boolean component7() {
        return this.requireReleasePhoto;
    }

    public final boolean component8() {
        return this.enableActiveBluetoothSweep;
    }

    public final boolean component9() {
        return this.requireBluetoothOnCapture;
    }

    public final ChargerConfig copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Integer num, Integer num2, Integer num3, Integer num4, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, long j, boolean z22, boolean z23, boolean z24, int i) {
        return new ChargerConfig(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, num, num2, num3, num4, z17, z18, z19, z20, z21, j, z22, z23, z24, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChargerConfig) {
            ChargerConfig chargerConfig = (ChargerConfig) obj;
            return this.markDamagedCopyUpdates == chargerConfig.markDamagedCopyUpdates && this.chargerEnableMarkDamaged == chargerConfig.chargerEnableMarkDamaged && this.enableCommunityMode == chargerConfig.enableCommunityMode && this.blockBountyMapOnTaskLimitReached == chargerConfig.blockBountyMapOnTaskLimitReached && this.enableReportMultipleBirdsCharger == chargerConfig.enableReportMultipleBirdsCharger && this.enableReportMultipleBirdsRider == chargerConfig.enableReportMultipleBirdsRider && this.requireReleasePhoto == chargerConfig.requireReleasePhoto && this.enableActiveBluetoothSweep == chargerConfig.enableActiveBluetoothSweep && this.requireBluetoothOnCapture == chargerConfig.requireBluetoothOnCapture && this.enableTabbedTaskList == chargerConfig.enableTabbedTaskList && this.enableDisplayNestRadius == chargerConfig.enableDisplayNestRadius && this.requireBluetoothOnRelease == chargerConfig.requireBluetoothOnRelease && this.enableDamagedBirdsPin == chargerConfig.enableDamagedBirdsPin && this.enableFrequentLocationUpdates == chargerConfig.enableFrequentLocationUpdates && this.showChargerMarketing == chargerConfig.showChargerMarketing && this.enableCancelTaskRequest == chargerConfig.enableCancelTaskRequest && Intrinsics.areEqual(this.defaultMinLastRiddenFilter, chargerConfig.defaultMinLastRiddenFilter) && Intrinsics.areEqual(this.defaultMaxLastRiddenFilter, chargerConfig.defaultMaxLastRiddenFilter) && Intrinsics.areEqual(this.defaultMinLastLocatedFilter, chargerConfig.defaultMinLastLocatedFilter) && Intrinsics.areEqual(this.defaultMaxLastLocatedFilter, chargerConfig.defaultMaxLastLocatedFilter) && this.enableBirdTypeFilter == chargerConfig.enableBirdTypeFilter && this.enableBirdNestMultiClaim == chargerConfig.enableBirdNestMultiClaim && this.enableBrandedChargerExperience == chargerConfig.enableBrandedChargerExperience && this.enableBrandedChargerBountyBanner == chargerConfig.enableBrandedChargerBountyBanner && this.enableBrandedDropMapBanner == chargerConfig.enableBrandedDropMapBanner && this.mapPinsStaleThreshold == chargerConfig.mapPinsStaleThreshold && this.enableChargerFlightView == chargerConfig.enableChargerFlightView && this.enableLastRideFilter == chargerConfig.enableLastRideFilter && this.hideLastRiddenFromFlightBar == chargerConfig.hideLastRiddenFromFlightBar && this.birdFinderToolTipMapSeenMinCount == chargerConfig.birdFinderToolTipMapSeenMinCount;
        }
        return false;
    }

    public final int getBirdFinderToolTipMapSeenMinCount() {
        return this.birdFinderToolTipMapSeenMinCount;
    }

    public final boolean getBlockBountyMapOnTaskLimitReached() {
        return this.blockBountyMapOnTaskLimitReached;
    }

    public final boolean getChargerEnableMarkDamaged() {
        return this.chargerEnableMarkDamaged;
    }

    public final Integer getDefaultMaxLastLocatedFilter() {
        return this.defaultMaxLastLocatedFilter;
    }

    public final Integer getDefaultMaxLastRiddenFilter() {
        return this.defaultMaxLastRiddenFilter;
    }

    public final Integer getDefaultMinLastLocatedFilter() {
        return this.defaultMinLastLocatedFilter;
    }

    public final Integer getDefaultMinLastRiddenFilter() {
        return this.defaultMinLastRiddenFilter;
    }

    public final boolean getEnableActiveBluetoothSweep() {
        return this.enableActiveBluetoothSweep;
    }

    public final boolean getEnableBirdNestMultiClaim() {
        return this.enableBirdNestMultiClaim;
    }

    public final boolean getEnableBirdTypeFilter() {
        return this.enableBirdTypeFilter;
    }

    public final boolean getEnableBrandedChargerBountyBanner() {
        return this.enableBrandedChargerBountyBanner;
    }

    public final boolean getEnableBrandedChargerExperience() {
        return this.enableBrandedChargerExperience;
    }

    public final boolean getEnableBrandedDropMapBanner() {
        return this.enableBrandedDropMapBanner;
    }

    public final boolean getEnableCancelTaskRequest() {
        return this.enableCancelTaskRequest;
    }

    public final boolean getEnableChargerFlightView() {
        return this.enableChargerFlightView;
    }

    public final boolean getEnableCommunityMode() {
        return this.enableCommunityMode;
    }

    public final boolean getEnableDamagedBirdsPin() {
        return this.enableDamagedBirdsPin;
    }

    public final boolean getEnableDisplayNestRadius() {
        return this.enableDisplayNestRadius;
    }

    public final boolean getEnableFrequentLocationUpdates() {
        return this.enableFrequentLocationUpdates;
    }

    public final boolean getEnableLastRideFilter() {
        return this.enableLastRideFilter;
    }

    public final boolean getEnableReportMultipleBirdsCharger() {
        return this.enableReportMultipleBirdsCharger;
    }

    public final boolean getEnableReportMultipleBirdsRider() {
        return this.enableReportMultipleBirdsRider;
    }

    public final boolean getEnableTabbedTaskList() {
        return this.enableTabbedTaskList;
    }

    public final boolean getHideLastRiddenFromFlightBar() {
        return this.hideLastRiddenFromFlightBar;
    }

    public final long getMapPinsStaleThreshold() {
        return this.mapPinsStaleThreshold;
    }

    public final boolean getMarkDamagedCopyUpdates() {
        return this.markDamagedCopyUpdates;
    }

    public final boolean getRequireBluetoothOnCapture() {
        return this.requireBluetoothOnCapture;
    }

    public final boolean getRequireBluetoothOnRelease() {
        return this.requireBluetoothOnRelease;
    }

    public final boolean getRequireReleasePhoto() {
        return this.requireReleasePhoto;
    }

    public final boolean getShowChargerMarketing() {
        return this.showChargerMarketing;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean z = this.markDamagedCopyUpdates;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.chargerEnableMarkDamaged;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.enableCommunityMode;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r23 = this.blockBountyMapOnTaskLimitReached;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        ?? r24 = this.enableReportMultipleBirdsCharger;
        int i8 = r24;
        if (r24 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        ?? r25 = this.enableReportMultipleBirdsRider;
        int i10 = r25;
        if (r25 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        ?? r26 = this.requireReleasePhoto;
        int i12 = r26;
        if (r26 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        ?? r27 = this.enableActiveBluetoothSweep;
        int i14 = r27;
        if (r27 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        ?? r28 = this.requireBluetoothOnCapture;
        int i16 = r28;
        if (r28 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        ?? r29 = this.enableTabbedTaskList;
        int i18 = r29;
        if (r29 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        ?? r210 = this.enableDisplayNestRadius;
        int i20 = r210;
        if (r210 != 0) {
            i20 = 1;
        }
        int i21 = (i19 + i20) * 31;
        ?? r211 = this.requireBluetoothOnRelease;
        int i22 = r211;
        if (r211 != 0) {
            i22 = 1;
        }
        int i23 = (i21 + i22) * 31;
        ?? r212 = this.enableDamagedBirdsPin;
        int i24 = r212;
        if (r212 != 0) {
            i24 = 1;
        }
        int i25 = (i23 + i24) * 31;
        ?? r213 = this.enableFrequentLocationUpdates;
        int i26 = r213;
        if (r213 != 0) {
            i26 = 1;
        }
        int i27 = (i25 + i26) * 31;
        ?? r214 = this.showChargerMarketing;
        int i28 = r214;
        if (r214 != 0) {
            i28 = 1;
        }
        int i29 = (i27 + i28) * 31;
        ?? r215 = this.enableCancelTaskRequest;
        int i30 = r215;
        if (r215 != 0) {
            i30 = 1;
        }
        int i31 = (i29 + i30) * 31;
        Integer num = this.defaultMinLastRiddenFilter;
        int hashCode = (i31 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.defaultMaxLastRiddenFilter;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.defaultMinLastLocatedFilter;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.defaultMaxLastLocatedFilter;
        int hashCode4 = (hashCode3 + (num4 != null ? num4.hashCode() : 0)) * 31;
        ?? r216 = this.enableBirdTypeFilter;
        int i32 = r216;
        if (r216 != 0) {
            i32 = 1;
        }
        int i33 = (hashCode4 + i32) * 31;
        ?? r217 = this.enableBirdNestMultiClaim;
        int i34 = r217;
        if (r217 != 0) {
            i34 = 1;
        }
        int i35 = (i33 + i34) * 31;
        ?? r218 = this.enableBrandedChargerExperience;
        int i36 = r218;
        if (r218 != 0) {
            i36 = 1;
        }
        int i37 = (i35 + i36) * 31;
        ?? r219 = this.enableBrandedChargerBountyBanner;
        int i38 = r219;
        if (r219 != 0) {
            i38 = 1;
        }
        int i39 = (i37 + i38) * 31;
        ?? r220 = this.enableBrandedDropMapBanner;
        int i40 = r220;
        if (r220 != 0) {
            i40 = 1;
        }
        int hashCode5 = (((i39 + i40) * 31) + Long.hashCode(this.mapPinsStaleThreshold)) * 31;
        ?? r221 = this.enableChargerFlightView;
        int i41 = r221;
        if (r221 != 0) {
            i41 = 1;
        }
        int i42 = (hashCode5 + i41) * 31;
        ?? r222 = this.enableLastRideFilter;
        int i43 = r222;
        if (r222 != 0) {
            i43 = 1;
        }
        int i44 = (i42 + i43) * 31;
        boolean z2 = this.hideLastRiddenFromFlightBar;
        return ((i44 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Integer.hashCode(this.birdFinderToolTipMapSeenMinCount);
    }

    public String toString() {
        boolean z = this.markDamagedCopyUpdates;
        boolean z2 = this.chargerEnableMarkDamaged;
        boolean z3 = this.enableCommunityMode;
        boolean z4 = this.blockBountyMapOnTaskLimitReached;
        boolean z5 = this.enableReportMultipleBirdsCharger;
        boolean z6 = this.enableReportMultipleBirdsRider;
        boolean z7 = this.requireReleasePhoto;
        boolean z8 = this.enableActiveBluetoothSweep;
        boolean z9 = this.requireBluetoothOnCapture;
        boolean z10 = this.enableTabbedTaskList;
        boolean z11 = this.enableDisplayNestRadius;
        boolean z12 = this.requireBluetoothOnRelease;
        boolean z13 = this.enableDamagedBirdsPin;
        boolean z14 = this.enableFrequentLocationUpdates;
        boolean z15 = this.showChargerMarketing;
        boolean z16 = this.enableCancelTaskRequest;
        Integer num = this.defaultMinLastRiddenFilter;
        Integer num2 = this.defaultMaxLastRiddenFilter;
        Integer num3 = this.defaultMinLastLocatedFilter;
        Integer num4 = this.defaultMaxLastLocatedFilter;
        boolean z17 = this.enableBirdTypeFilter;
        boolean z18 = this.enableBirdNestMultiClaim;
        boolean z19 = this.enableBrandedChargerExperience;
        boolean z20 = this.enableBrandedChargerBountyBanner;
        boolean z21 = this.enableBrandedDropMapBanner;
        long j = this.mapPinsStaleThreshold;
        boolean z22 = this.enableChargerFlightView;
        boolean z23 = this.enableLastRideFilter;
        boolean z24 = this.hideLastRiddenFromFlightBar;
        int i = this.birdFinderToolTipMapSeenMinCount;
        return "ChargerConfig(markDamagedCopyUpdates=" + z + ", chargerEnableMarkDamaged=" + z2 + ", enableCommunityMode=" + z3 + ", blockBountyMapOnTaskLimitReached=" + z4 + ", enableReportMultipleBirdsCharger=" + z5 + ", enableReportMultipleBirdsRider=" + z6 + ", requireReleasePhoto=" + z7 + ", enableActiveBluetoothSweep=" + z8 + ", requireBluetoothOnCapture=" + z9 + ", enableTabbedTaskList=" + z10 + ", enableDisplayNestRadius=" + z11 + ", requireBluetoothOnRelease=" + z12 + ", enableDamagedBirdsPin=" + z13 + ", enableFrequentLocationUpdates=" + z14 + ", showChargerMarketing=" + z15 + ", enableCancelTaskRequest=" + z16 + ", defaultMinLastRiddenFilter=" + num + ", defaultMaxLastRiddenFilter=" + num2 + ", defaultMinLastLocatedFilter=" + num3 + ", defaultMaxLastLocatedFilter=" + num4 + ", enableBirdTypeFilter=" + z17 + ", enableBirdNestMultiClaim=" + z18 + ", enableBrandedChargerExperience=" + z19 + ", enableBrandedChargerBountyBanner=" + z20 + ", enableBrandedDropMapBanner=" + z21 + ", mapPinsStaleThreshold=" + j + ", enableChargerFlightView=" + z22 + ", enableLastRideFilter=" + z23 + ", hideLastRiddenFromFlightBar=" + z24 + ", birdFinderToolTipMapSeenMinCount=" + i + ")";
    }

    public ChargerConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Integer num, Integer num2, Integer num3, Integer num4, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, long j, boolean z22, boolean z23, boolean z24, int i) {
        this.markDamagedCopyUpdates = z;
        this.chargerEnableMarkDamaged = z2;
        this.enableCommunityMode = z3;
        this.blockBountyMapOnTaskLimitReached = z4;
        this.enableReportMultipleBirdsCharger = z5;
        this.enableReportMultipleBirdsRider = z6;
        this.requireReleasePhoto = z7;
        this.enableActiveBluetoothSweep = z8;
        this.requireBluetoothOnCapture = z9;
        this.enableTabbedTaskList = z10;
        this.enableDisplayNestRadius = z11;
        this.requireBluetoothOnRelease = z12;
        this.enableDamagedBirdsPin = z13;
        this.enableFrequentLocationUpdates = z14;
        this.showChargerMarketing = z15;
        this.enableCancelTaskRequest = z16;
        this.defaultMinLastRiddenFilter = num;
        this.defaultMaxLastRiddenFilter = num2;
        this.defaultMinLastLocatedFilter = num3;
        this.defaultMaxLastLocatedFilter = num4;
        this.enableBirdTypeFilter = z17;
        this.enableBirdNestMultiClaim = z18;
        this.enableBrandedChargerExperience = z19;
        this.enableBrandedChargerBountyBanner = z20;
        this.enableBrandedDropMapBanner = z21;
        this.mapPinsStaleThreshold = j;
        this.enableChargerFlightView = z22;
        this.enableLastRideFilter = z23;
        this.hideLastRiddenFromFlightBar = z24;
        this.birdFinderToolTipMapSeenMinCount = i;
    }

    public /* synthetic */ ChargerConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Integer num, Integer num2, Integer num3, Integer num4, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, long j, boolean z22, boolean z23, boolean z24, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? false : z4, (i2 & 16) != 0 ? false : z5, (i2 & 32) != 0 ? false : z6, (i2 & 64) != 0 ? false : z7, (i2 & 128) != 0 ? false : z8, (i2 & 256) != 0 ? false : z9, (i2 & 512) != 0 ? false : z10, (i2 & 1024) != 0 ? false : z11, (i2 & 2048) != 0 ? false : z12, (i2 & 4096) != 0 ? false : z13, (i2 & 8192) != 0 ? false : z14, (i2 & 16384) != 0 ? false : z15, (i2 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? false : z16, (i2 & 65536) != 0 ? null : num, (i2 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? null : num2, (i2 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? null : num3, (i2 & 524288) == 0 ? num4 : null, (i2 & 1048576) != 0 ? false : z17, (i2 & 2097152) != 0 ? false : z18, (i2 & 4194304) != 0 ? false : z19, (i2 & 8388608) != 0 ? false : z20, (i2 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : z21, (i2 & 33554432) != 0 ? 30000L : j, (i2 & 67108864) != 0 ? false : z22, (i2 & 134217728) != 0 ? false : z23, (i2 & 268435456) != 0 ? false : z24, (i2 & 536870912) != 0 ? 5 : i);
    }
}
