package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ScanButtonShape;
import co.bird.android.model.constant.ScanButtonStyle;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Settings;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B»\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001cJ\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u0011\u0010A\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010'J\t\u0010C\u001a\u00020\fHÆ\u0003J\t\u0010D\u001a\u00020\u000eHÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0011HÆ\u0003JÄ\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u00032\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020LHÖ\u0001J\t\u0010M\u001a\u00020\bHÖ\u0001R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106¨\u0006N"}, m28432d2 = {"Lco/bird/android/model/wire/configs/MobileMapConfigView;", "", "showBatteryPercent", "", "showRangeInsteadOfBatteryPercentage", "enableUserLocationV2", "poiAnnotations", "", "", "maxAutoselectMerchantDistance", "", "scanButtonStyle", "Lco/bird/android/model/constant/ScanButtonStyle;", "scanButtonShape", "Lco/bird/android/model/constant/ScanButtonShape;", "showGroupRideButton", "clustering", "Lco/bird/android/model/wire/configs/ClusteringConfig;", "operationalZoneInversion", "Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;", "zoneColorOverride", "Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;", "enableOptimizedMapRenderer", "riderShowAreasBeforeSelectingVehicle", "clientBirdGeocacheConfig", "Lco/bird/android/model/wire/configs/MapGeocacheConfig;", "clientZoneGeocacheConfig", "clientNestGeocacheConfig", "(ZZZLjava/util/List;Ljava/lang/Double;Lco/bird/android/model/constant/ScanButtonStyle;Lco/bird/android/model/constant/ScanButtonShape;ZLco/bird/android/model/wire/configs/ClusteringConfig;Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;ZZLco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;)V", "getClientBirdGeocacheConfig", "()Lco/bird/android/model/wire/configs/MapGeocacheConfig;", "getClientNestGeocacheConfig", "getClientZoneGeocacheConfig", "getClustering", "()Lco/bird/android/model/wire/configs/ClusteringConfig;", "getEnableOptimizedMapRenderer", "()Z", "getEnableUserLocationV2", "getMaxAutoselectMerchantDistance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getOperationalZoneInversion", "()Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;", "getPoiAnnotations", "()Ljava/util/List;", "getRiderShowAreasBeforeSelectingVehicle", "getScanButtonShape", "()Lco/bird/android/model/constant/ScanButtonShape;", "getScanButtonStyle", "()Lco/bird/android/model/constant/ScanButtonStyle;", "getShowBatteryPercent", "getShowGroupRideButton", "getShowRangeInsteadOfBatteryPercentage", "getZoneColorOverride", "()Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZZZLjava/util/List;Ljava/lang/Double;Lco/bird/android/model/constant/ScanButtonStyle;Lco/bird/android/model/constant/ScanButtonShape;ZLco/bird/android/model/wire/configs/ClusteringConfig;Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;Lco/bird/android/model/wire/configs/ZoneColorOverrideConfig;ZZLco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;Lco/bird/android/model/wire/configs/MapGeocacheConfig;)Lco/bird/android/model/wire/configs/MobileMapConfigView;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class MobileMapConfigView {
    @JsonProperty("client_bird_geocache_config")
    @InterfaceC41208ft5("client_bird_geocache_config")
    private final MapGeocacheConfig clientBirdGeocacheConfig;
    @JsonProperty("client_nest_geocache_config")
    @InterfaceC41208ft5("client_nest_geocache_config")
    private final MapGeocacheConfig clientNestGeocacheConfig;
    @JsonProperty("client_zone_geocache_config")
    @InterfaceC41208ft5("client_zone_geocache_config")
    private final MapGeocacheConfig clientZoneGeocacheConfig;
    @JsonProperty("clustering")
    @InterfaceC41208ft5("clustering")
    private final ClusteringConfig clustering;
    @JsonProperty("enable_optimized_map_renderer")
    @InterfaceC41208ft5("enable_optimized_map_renderer")
    private final boolean enableOptimizedMapRenderer;
    @JsonProperty("enable_user_location_v2")
    @InterfaceC41208ft5("enable_user_location_v2")
    private final boolean enableUserLocationV2;
    @JsonProperty("max_autoselect_merchant_distance")
    @InterfaceC41208ft5("max_autoselect_merchant_distance")
    private final Double maxAutoselectMerchantDistance;
    @JsonProperty("operational_zone_inversion")
    @InterfaceC41208ft5("operational_zone_inversion")
    private final OperationalZoneInversionConfig operationalZoneInversion;
    @JsonProperty("native_poi_annotations")
    @InterfaceC41208ft5("native_poi_annotations")
    private final List<String> poiAnnotations;
    @JsonProperty("rider_show_areas_before_selecting_vehicle")
    @InterfaceC41208ft5("rider_show_areas_before_selecting_vehicle")
    private final boolean riderShowAreasBeforeSelectingVehicle;
    @JsonProperty("scan_button_shape")
    @InterfaceC41208ft5("scan_button_shape")
    private final ScanButtonShape scanButtonShape;
    @JsonProperty("scan_button_style")
    @InterfaceC41208ft5("scan_button_style")
    private final ScanButtonStyle scanButtonStyle;
    @JsonProperty("show_battery_percentage")
    @InterfaceC41208ft5("show_battery_percentage")
    private final boolean showBatteryPercent;
    @JsonProperty("show_group_ride_button")
    @InterfaceC41208ft5("show_group_ride_button")
    private final boolean showGroupRideButton;
    @JsonProperty("show_range_instead_of_battery_percentage")
    @InterfaceC41208ft5("show_range_instead_of_battery_percentage")
    private final boolean showRangeInsteadOfBatteryPercentage;
    @JsonProperty("zone_color_override")
    @InterfaceC41208ft5("zone_color_override")
    private final ZoneColorOverrideConfig zoneColorOverride;

    public MobileMapConfigView() {
        this(false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
    }

    public final boolean component1() {
        return this.showBatteryPercent;
    }

    public final OperationalZoneInversionConfig component10() {
        return this.operationalZoneInversion;
    }

    public final ZoneColorOverrideConfig component11() {
        return this.zoneColorOverride;
    }

    public final boolean component12() {
        return this.enableOptimizedMapRenderer;
    }

    public final boolean component13() {
        return this.riderShowAreasBeforeSelectingVehicle;
    }

    public final MapGeocacheConfig component14() {
        return this.clientBirdGeocacheConfig;
    }

    public final MapGeocacheConfig component15() {
        return this.clientZoneGeocacheConfig;
    }

    public final MapGeocacheConfig component16() {
        return this.clientNestGeocacheConfig;
    }

    public final boolean component2() {
        return this.showRangeInsteadOfBatteryPercentage;
    }

    public final boolean component3() {
        return this.enableUserLocationV2;
    }

    public final List<String> component4() {
        return this.poiAnnotations;
    }

    public final Double component5() {
        return this.maxAutoselectMerchantDistance;
    }

    public final ScanButtonStyle component6() {
        return this.scanButtonStyle;
    }

    public final ScanButtonShape component7() {
        return this.scanButtonShape;
    }

    public final boolean component8() {
        return this.showGroupRideButton;
    }

    public final ClusteringConfig component9() {
        return this.clustering;
    }

    public final MobileMapConfigView copy(boolean z, boolean z2, boolean z3, List<String> list, Double d, ScanButtonStyle scanButtonStyle, ScanButtonShape scanButtonShape, boolean z4, ClusteringConfig clusteringConfig, OperationalZoneInversionConfig operationalZoneInversionConfig, ZoneColorOverrideConfig zoneColorOverrideConfig, boolean z5, boolean z6, MapGeocacheConfig mapGeocacheConfig, MapGeocacheConfig mapGeocacheConfig2, MapGeocacheConfig mapGeocacheConfig3) {
        Intrinsics.checkNotNullParameter(scanButtonStyle, "scanButtonStyle");
        Intrinsics.checkNotNullParameter(scanButtonShape, "scanButtonShape");
        return new MobileMapConfigView(z, z2, z3, list, d, scanButtonStyle, scanButtonShape, z4, clusteringConfig, operationalZoneInversionConfig, zoneColorOverrideConfig, z5, z6, mapGeocacheConfig, mapGeocacheConfig2, mapGeocacheConfig3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MobileMapConfigView) {
            MobileMapConfigView mobileMapConfigView = (MobileMapConfigView) obj;
            return this.showBatteryPercent == mobileMapConfigView.showBatteryPercent && this.showRangeInsteadOfBatteryPercentage == mobileMapConfigView.showRangeInsteadOfBatteryPercentage && this.enableUserLocationV2 == mobileMapConfigView.enableUserLocationV2 && Intrinsics.areEqual(this.poiAnnotations, mobileMapConfigView.poiAnnotations) && Intrinsics.areEqual((Object) this.maxAutoselectMerchantDistance, (Object) mobileMapConfigView.maxAutoselectMerchantDistance) && this.scanButtonStyle == mobileMapConfigView.scanButtonStyle && this.scanButtonShape == mobileMapConfigView.scanButtonShape && this.showGroupRideButton == mobileMapConfigView.showGroupRideButton && Intrinsics.areEqual(this.clustering, mobileMapConfigView.clustering) && Intrinsics.areEqual(this.operationalZoneInversion, mobileMapConfigView.operationalZoneInversion) && Intrinsics.areEqual(this.zoneColorOverride, mobileMapConfigView.zoneColorOverride) && this.enableOptimizedMapRenderer == mobileMapConfigView.enableOptimizedMapRenderer && this.riderShowAreasBeforeSelectingVehicle == mobileMapConfigView.riderShowAreasBeforeSelectingVehicle && Intrinsics.areEqual(this.clientBirdGeocacheConfig, mobileMapConfigView.clientBirdGeocacheConfig) && Intrinsics.areEqual(this.clientZoneGeocacheConfig, mobileMapConfigView.clientZoneGeocacheConfig) && Intrinsics.areEqual(this.clientNestGeocacheConfig, mobileMapConfigView.clientNestGeocacheConfig);
        }
        return false;
    }

    public final MapGeocacheConfig getClientBirdGeocacheConfig() {
        return this.clientBirdGeocacheConfig;
    }

    public final MapGeocacheConfig getClientNestGeocacheConfig() {
        return this.clientNestGeocacheConfig;
    }

    public final MapGeocacheConfig getClientZoneGeocacheConfig() {
        return this.clientZoneGeocacheConfig;
    }

    public final ClusteringConfig getClustering() {
        return this.clustering;
    }

    public final boolean getEnableOptimizedMapRenderer() {
        return this.enableOptimizedMapRenderer;
    }

    public final boolean getEnableUserLocationV2() {
        return this.enableUserLocationV2;
    }

    public final Double getMaxAutoselectMerchantDistance() {
        return this.maxAutoselectMerchantDistance;
    }

    public final OperationalZoneInversionConfig getOperationalZoneInversion() {
        return this.operationalZoneInversion;
    }

    public final List<String> getPoiAnnotations() {
        return this.poiAnnotations;
    }

    public final boolean getRiderShowAreasBeforeSelectingVehicle() {
        return this.riderShowAreasBeforeSelectingVehicle;
    }

    public final ScanButtonShape getScanButtonShape() {
        return this.scanButtonShape;
    }

    public final ScanButtonStyle getScanButtonStyle() {
        return this.scanButtonStyle;
    }

    public final boolean getShowBatteryPercent() {
        return this.showBatteryPercent;
    }

    public final boolean getShowGroupRideButton() {
        return this.showGroupRideButton;
    }

    public final boolean getShowRangeInsteadOfBatteryPercentage() {
        return this.showRangeInsteadOfBatteryPercentage;
    }

    public final ZoneColorOverrideConfig getZoneColorOverride() {
        return this.zoneColorOverride;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25, types: [boolean] */
    public int hashCode() {
        boolean z = this.showBatteryPercent;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.showRangeInsteadOfBatteryPercentage;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.enableUserLocationV2;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        List<String> list = this.poiAnnotations;
        int hashCode = (i5 + (list == null ? 0 : list.hashCode())) * 31;
        Double d = this.maxAutoselectMerchantDistance;
        int hashCode2 = (((((hashCode + (d == null ? 0 : d.hashCode())) * 31) + this.scanButtonStyle.hashCode()) * 31) + this.scanButtonShape.hashCode()) * 31;
        ?? r23 = this.showGroupRideButton;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (hashCode2 + i6) * 31;
        ClusteringConfig clusteringConfig = this.clustering;
        int hashCode3 = (i7 + (clusteringConfig == null ? 0 : clusteringConfig.hashCode())) * 31;
        OperationalZoneInversionConfig operationalZoneInversionConfig = this.operationalZoneInversion;
        int hashCode4 = (hashCode3 + (operationalZoneInversionConfig == null ? 0 : operationalZoneInversionConfig.hashCode())) * 31;
        ZoneColorOverrideConfig zoneColorOverrideConfig = this.zoneColorOverride;
        int hashCode5 = (hashCode4 + (zoneColorOverrideConfig == null ? 0 : zoneColorOverrideConfig.hashCode())) * 31;
        ?? r24 = this.enableOptimizedMapRenderer;
        int i8 = r24;
        if (r24 != 0) {
            i8 = 1;
        }
        int i9 = (hashCode5 + i8) * 31;
        boolean z2 = this.riderShowAreasBeforeSelectingVehicle;
        int i10 = (i9 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        MapGeocacheConfig mapGeocacheConfig = this.clientBirdGeocacheConfig;
        int hashCode6 = (i10 + (mapGeocacheConfig == null ? 0 : mapGeocacheConfig.hashCode())) * 31;
        MapGeocacheConfig mapGeocacheConfig2 = this.clientZoneGeocacheConfig;
        int hashCode7 = (hashCode6 + (mapGeocacheConfig2 == null ? 0 : mapGeocacheConfig2.hashCode())) * 31;
        MapGeocacheConfig mapGeocacheConfig3 = this.clientNestGeocacheConfig;
        return hashCode7 + (mapGeocacheConfig3 != null ? mapGeocacheConfig3.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.showBatteryPercent;
        boolean z2 = this.showRangeInsteadOfBatteryPercentage;
        boolean z3 = this.enableUserLocationV2;
        List<String> list = this.poiAnnotations;
        Double d = this.maxAutoselectMerchantDistance;
        ScanButtonStyle scanButtonStyle = this.scanButtonStyle;
        ScanButtonShape scanButtonShape = this.scanButtonShape;
        boolean z4 = this.showGroupRideButton;
        ClusteringConfig clusteringConfig = this.clustering;
        OperationalZoneInversionConfig operationalZoneInversionConfig = this.operationalZoneInversion;
        ZoneColorOverrideConfig zoneColorOverrideConfig = this.zoneColorOverride;
        boolean z5 = this.enableOptimizedMapRenderer;
        boolean z6 = this.riderShowAreasBeforeSelectingVehicle;
        MapGeocacheConfig mapGeocacheConfig = this.clientBirdGeocacheConfig;
        MapGeocacheConfig mapGeocacheConfig2 = this.clientZoneGeocacheConfig;
        MapGeocacheConfig mapGeocacheConfig3 = this.clientNestGeocacheConfig;
        return "MobileMapConfigView(showBatteryPercent=" + z + ", showRangeInsteadOfBatteryPercentage=" + z2 + ", enableUserLocationV2=" + z3 + ", poiAnnotations=" + list + ", maxAutoselectMerchantDistance=" + d + ", scanButtonStyle=" + scanButtonStyle + ", scanButtonShape=" + scanButtonShape + ", showGroupRideButton=" + z4 + ", clustering=" + clusteringConfig + ", operationalZoneInversion=" + operationalZoneInversionConfig + ", zoneColorOverride=" + zoneColorOverrideConfig + ", enableOptimizedMapRenderer=" + z5 + ", riderShowAreasBeforeSelectingVehicle=" + z6 + ", clientBirdGeocacheConfig=" + mapGeocacheConfig + ", clientZoneGeocacheConfig=" + mapGeocacheConfig2 + ", clientNestGeocacheConfig=" + mapGeocacheConfig3 + ")";
    }

    public MobileMapConfigView(boolean z, boolean z2, boolean z3, List<String> list, Double d, ScanButtonStyle scanButtonStyle, ScanButtonShape scanButtonShape, boolean z4, ClusteringConfig clusteringConfig, OperationalZoneInversionConfig operationalZoneInversionConfig, ZoneColorOverrideConfig zoneColorOverrideConfig, boolean z5, boolean z6, MapGeocacheConfig mapGeocacheConfig, MapGeocacheConfig mapGeocacheConfig2, MapGeocacheConfig mapGeocacheConfig3) {
        Intrinsics.checkNotNullParameter(scanButtonStyle, "scanButtonStyle");
        Intrinsics.checkNotNullParameter(scanButtonShape, "scanButtonShape");
        this.showBatteryPercent = z;
        this.showRangeInsteadOfBatteryPercentage = z2;
        this.enableUserLocationV2 = z3;
        this.poiAnnotations = list;
        this.maxAutoselectMerchantDistance = d;
        this.scanButtonStyle = scanButtonStyle;
        this.scanButtonShape = scanButtonShape;
        this.showGroupRideButton = z4;
        this.clustering = clusteringConfig;
        this.operationalZoneInversion = operationalZoneInversionConfig;
        this.zoneColorOverride = zoneColorOverrideConfig;
        this.enableOptimizedMapRenderer = z5;
        this.riderShowAreasBeforeSelectingVehicle = z6;
        this.clientBirdGeocacheConfig = mapGeocacheConfig;
        this.clientZoneGeocacheConfig = mapGeocacheConfig2;
        this.clientNestGeocacheConfig = mapGeocacheConfig3;
    }

    public /* synthetic */ MobileMapConfigView(boolean z, boolean z2, boolean z3, List list, Double d, ScanButtonStyle scanButtonStyle, ScanButtonShape scanButtonShape, boolean z4, ClusteringConfig clusteringConfig, OperationalZoneInversionConfig operationalZoneInversionConfig, ZoneColorOverrideConfig zoneColorOverrideConfig, boolean z5, boolean z6, MapGeocacheConfig mapGeocacheConfig, MapGeocacheConfig mapGeocacheConfig2, MapGeocacheConfig mapGeocacheConfig3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : d, (i & 32) != 0 ? ScanButtonStyle.RIDE : scanButtonStyle, (i & 64) != 0 ? ScanButtonShape.CIRCLE : scanButtonShape, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? new ClusteringConfig(null, null, 3, null) : clusteringConfig, (i & 512) != 0 ? new OperationalZoneInversionConfig(null, null, 3, null) : operationalZoneInversionConfig, (i & 1024) != 0 ? new ZoneColorOverrideConfig(null, null, null, null, null, null, 63, null) : zoneColorOverrideConfig, (i & 2048) == 0 ? z5 : false, (i & 4096) != 0 ? true : z6, (i & 8192) != 0 ? new MapGeocacheConfig(null, null, null, null, 15, null) : mapGeocacheConfig, (i & 16384) != 0 ? new MapGeocacheConfig(null, null, null, null, 15, null) : mapGeocacheConfig2, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? new MapGeocacheConfig(null, null, null, null, 15, null) : mapGeocacheConfig3);
    }
}
