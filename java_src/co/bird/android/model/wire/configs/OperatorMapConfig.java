package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003¢\u0006\u0002\u0010\u0018J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0014HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\tHÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\fHÆ\u0003J\t\u0010<\u001a\u00020\u000eHÆ\u0003J\t\u0010=\u001a\u00020\u0010HÆ\u0003J\u009f\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0003HÆ\u0001J\u0013\u0010?\u001a\u00020\u00032\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\fHÖ\u0001J\t\u0010B\u001a\u00020CHÖ\u0001R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006D"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OperatorMapConfig;", "", "enableParkingNests", "", "enableNests", "mapPinsStaleThreshold", "", "enableServerDrivenFilters", "flightSheet", "Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;", "allowAreaTapToSelectMarkerAreas", "mapAreasLastUpdateRefreshThreshold", "", "filters", "Lco/bird/android/model/wire/configs/OperatorMapFiltersConfig;", "zoomIncludeUserLocationThreshold", "", "demandCellsTappable", "showRecommendedBirdsAfterTap", "operatorArea", "Lco/bird/android/model/wire/configs/OperatorAreaConfig;", "enableManualRefresh", "enableOptimizedMapRenderer", "enableWarehouses", "(ZZJZLco/bird/android/model/wire/configs/OperatorFlightSheetConfig;ZILco/bird/android/model/wire/configs/OperatorMapFiltersConfig;DZZLco/bird/android/model/wire/configs/OperatorAreaConfig;ZZZ)V", "getAllowAreaTapToSelectMarkerAreas", "()Z", "getDemandCellsTappable", "getEnableManualRefresh", "getEnableNests", "getEnableOptimizedMapRenderer", "getEnableParkingNests", "getEnableServerDrivenFilters", "getEnableWarehouses", "getFilters", "()Lco/bird/android/model/wire/configs/OperatorMapFiltersConfig;", "getFlightSheet", "()Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;", "getMapAreasLastUpdateRefreshThreshold", "()I", "getMapPinsStaleThreshold", "()J", "getOperatorArea", "()Lco/bird/android/model/wire/configs/OperatorAreaConfig;", "getShowRecommendedBirdsAfterTap", "getZoomIncludeUserLocationThreshold", "()D", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorMapConfig {
    @JsonProperty("allow_area_tap_to_select_marker_areas")
    @InterfaceC41208ft5("allow_area_tap_to_select_marker_areas")
    private final boolean allowAreaTapToSelectMarkerAreas;
    @JsonProperty("demand_cells_tappable")
    @InterfaceC41208ft5("demand_cells_tappable")
    private final boolean demandCellsTappable;
    @JsonProperty("enable_manual_refresh")
    @InterfaceC41208ft5("enable_manual_refresh")
    private final boolean enableManualRefresh;
    @JsonProperty("enable_nests")
    @InterfaceC41208ft5("enable_nests")
    private final boolean enableNests;
    @JsonProperty("enable_optimized_map_renderer")
    @InterfaceC41208ft5("enable_optimized_map_renderer")
    private final boolean enableOptimizedMapRenderer;
    @JsonProperty("enable_parking_nests")
    @InterfaceC41208ft5("enable_parking_nests")
    private final boolean enableParkingNests;
    @JsonProperty("enable_server_driven_filters")
    @InterfaceC41208ft5("enable_server_driven_filters")
    private final boolean enableServerDrivenFilters;
    @JsonProperty("enable_warehouses")
    @InterfaceC41208ft5("enable_warehouses")
    private final boolean enableWarehouses;
    @JsonProperty("filters")
    @InterfaceC41208ft5("filters")
    private final OperatorMapFiltersConfig filters;
    @JsonProperty("flight_sheet")
    @InterfaceC41208ft5("flight_sheet")
    private final OperatorFlightSheetConfig flightSheet;
    @JsonProperty("map_areas_last_update_refresh_threshold")
    @InterfaceC41208ft5("map_areas_last_update_refresh_threshold")
    private final int mapAreasLastUpdateRefreshThreshold;
    @JsonProperty("map_pins_stale_threshold")
    @InterfaceC41208ft5("map_pins_stale_threshold")
    private final long mapPinsStaleThreshold;
    @JsonProperty("operator_area")
    @InterfaceC41208ft5("operator_area")
    private final OperatorAreaConfig operatorArea;
    @JsonProperty("show_recommended_birds_after_tap")
    @InterfaceC41208ft5("show_recommended_birds_after_tap")
    private final boolean showRecommendedBirdsAfterTap;
    @JsonProperty("zoom_include_user_location_threshold")
    @InterfaceC41208ft5("zoom_include_user_location_threshold")
    private final double zoomIncludeUserLocationThreshold;

    public OperatorMapConfig() {
        this(false, false, 0L, false, null, false, 0, null, 0.0d, false, false, null, false, false, false, 32767, null);
    }

    public final boolean component1() {
        return this.enableParkingNests;
    }

    public final boolean component10() {
        return this.demandCellsTappable;
    }

    public final boolean component11() {
        return this.showRecommendedBirdsAfterTap;
    }

    public final OperatorAreaConfig component12() {
        return this.operatorArea;
    }

    public final boolean component13() {
        return this.enableManualRefresh;
    }

    public final boolean component14() {
        return this.enableOptimizedMapRenderer;
    }

    public final boolean component15() {
        return this.enableWarehouses;
    }

    public final boolean component2() {
        return this.enableNests;
    }

    public final long component3() {
        return this.mapPinsStaleThreshold;
    }

    public final boolean component4() {
        return this.enableServerDrivenFilters;
    }

    public final OperatorFlightSheetConfig component5() {
        return this.flightSheet;
    }

    public final boolean component6() {
        return this.allowAreaTapToSelectMarkerAreas;
    }

    public final int component7() {
        return this.mapAreasLastUpdateRefreshThreshold;
    }

    public final OperatorMapFiltersConfig component8() {
        return this.filters;
    }

    public final double component9() {
        return this.zoomIncludeUserLocationThreshold;
    }

    public final OperatorMapConfig copy(boolean z, boolean z2, long j, boolean z3, OperatorFlightSheetConfig flightSheet, boolean z4, int i, OperatorMapFiltersConfig filters, double d, boolean z5, boolean z6, OperatorAreaConfig operatorArea, boolean z7, boolean z8, boolean z9) {
        Intrinsics.checkNotNullParameter(flightSheet, "flightSheet");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(operatorArea, "operatorArea");
        return new OperatorMapConfig(z, z2, j, z3, flightSheet, z4, i, filters, d, z5, z6, operatorArea, z7, z8, z9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorMapConfig) {
            OperatorMapConfig operatorMapConfig = (OperatorMapConfig) obj;
            return this.enableParkingNests == operatorMapConfig.enableParkingNests && this.enableNests == operatorMapConfig.enableNests && this.mapPinsStaleThreshold == operatorMapConfig.mapPinsStaleThreshold && this.enableServerDrivenFilters == operatorMapConfig.enableServerDrivenFilters && Intrinsics.areEqual(this.flightSheet, operatorMapConfig.flightSheet) && this.allowAreaTapToSelectMarkerAreas == operatorMapConfig.allowAreaTapToSelectMarkerAreas && this.mapAreasLastUpdateRefreshThreshold == operatorMapConfig.mapAreasLastUpdateRefreshThreshold && Intrinsics.areEqual(this.filters, operatorMapConfig.filters) && Double.compare(this.zoomIncludeUserLocationThreshold, operatorMapConfig.zoomIncludeUserLocationThreshold) == 0 && this.demandCellsTappable == operatorMapConfig.demandCellsTappable && this.showRecommendedBirdsAfterTap == operatorMapConfig.showRecommendedBirdsAfterTap && Intrinsics.areEqual(this.operatorArea, operatorMapConfig.operatorArea) && this.enableManualRefresh == operatorMapConfig.enableManualRefresh && this.enableOptimizedMapRenderer == operatorMapConfig.enableOptimizedMapRenderer && this.enableWarehouses == operatorMapConfig.enableWarehouses;
        }
        return false;
    }

    public final boolean getAllowAreaTapToSelectMarkerAreas() {
        return this.allowAreaTapToSelectMarkerAreas;
    }

    public final boolean getDemandCellsTappable() {
        return this.demandCellsTappable;
    }

    public final boolean getEnableManualRefresh() {
        return this.enableManualRefresh;
    }

    public final boolean getEnableNests() {
        return this.enableNests;
    }

    public final boolean getEnableOptimizedMapRenderer() {
        return this.enableOptimizedMapRenderer;
    }

    public final boolean getEnableParkingNests() {
        return this.enableParkingNests;
    }

    public final boolean getEnableServerDrivenFilters() {
        return this.enableServerDrivenFilters;
    }

    public final boolean getEnableWarehouses() {
        return this.enableWarehouses;
    }

    public final OperatorMapFiltersConfig getFilters() {
        return this.filters;
    }

    public final OperatorFlightSheetConfig getFlightSheet() {
        return this.flightSheet;
    }

    public final int getMapAreasLastUpdateRefreshThreshold() {
        return this.mapAreasLastUpdateRefreshThreshold;
    }

    public final long getMapPinsStaleThreshold() {
        return this.mapPinsStaleThreshold;
    }

    public final OperatorAreaConfig getOperatorArea() {
        return this.operatorArea;
    }

    public final boolean getShowRecommendedBirdsAfterTap() {
        return this.showRecommendedBirdsAfterTap;
    }

    public final double getZoomIncludeUserLocationThreshold() {
        return this.zoomIncludeUserLocationThreshold;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    public int hashCode() {
        boolean z = this.enableParkingNests;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.enableNests;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int hashCode = (((i + i2) * 31) + Long.hashCode(this.mapPinsStaleThreshold)) * 31;
        ?? r22 = this.enableServerDrivenFilters;
        int i3 = r22;
        if (r22 != 0) {
            i3 = 1;
        }
        int hashCode2 = (((hashCode + i3) * 31) + this.flightSheet.hashCode()) * 31;
        ?? r23 = this.allowAreaTapToSelectMarkerAreas;
        int i4 = r23;
        if (r23 != 0) {
            i4 = 1;
        }
        int hashCode3 = (((((((hashCode2 + i4) * 31) + Integer.hashCode(this.mapAreasLastUpdateRefreshThreshold)) * 31) + this.filters.hashCode()) * 31) + Double.hashCode(this.zoomIncludeUserLocationThreshold)) * 31;
        ?? r24 = this.demandCellsTappable;
        int i5 = r24;
        if (r24 != 0) {
            i5 = 1;
        }
        int i6 = (hashCode3 + i5) * 31;
        ?? r25 = this.showRecommendedBirdsAfterTap;
        int i7 = r25;
        if (r25 != 0) {
            i7 = 1;
        }
        int hashCode4 = (((i6 + i7) * 31) + this.operatorArea.hashCode()) * 31;
        ?? r26 = this.enableManualRefresh;
        int i8 = r26;
        if (r26 != 0) {
            i8 = 1;
        }
        int i9 = (hashCode4 + i8) * 31;
        ?? r27 = this.enableOptimizedMapRenderer;
        int i10 = r27;
        if (r27 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        boolean z2 = this.enableWarehouses;
        return i11 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.enableParkingNests;
        boolean z2 = this.enableNests;
        long j = this.mapPinsStaleThreshold;
        boolean z3 = this.enableServerDrivenFilters;
        OperatorFlightSheetConfig operatorFlightSheetConfig = this.flightSheet;
        boolean z4 = this.allowAreaTapToSelectMarkerAreas;
        int i = this.mapAreasLastUpdateRefreshThreshold;
        OperatorMapFiltersConfig operatorMapFiltersConfig = this.filters;
        double d = this.zoomIncludeUserLocationThreshold;
        boolean z5 = this.demandCellsTappable;
        boolean z6 = this.showRecommendedBirdsAfterTap;
        OperatorAreaConfig operatorAreaConfig = this.operatorArea;
        boolean z7 = this.enableManualRefresh;
        boolean z8 = this.enableOptimizedMapRenderer;
        boolean z9 = this.enableWarehouses;
        return "OperatorMapConfig(enableParkingNests=" + z + ", enableNests=" + z2 + ", mapPinsStaleThreshold=" + j + ", enableServerDrivenFilters=" + z3 + ", flightSheet=" + operatorFlightSheetConfig + ", allowAreaTapToSelectMarkerAreas=" + z4 + ", mapAreasLastUpdateRefreshThreshold=" + i + ", filters=" + operatorMapFiltersConfig + ", zoomIncludeUserLocationThreshold=" + d + ", demandCellsTappable=" + z5 + ", showRecommendedBirdsAfterTap=" + z6 + ", operatorArea=" + operatorAreaConfig + ", enableManualRefresh=" + z7 + ", enableOptimizedMapRenderer=" + z8 + ", enableWarehouses=" + z9 + ")";
    }

    public OperatorMapConfig(boolean z, boolean z2, long j, boolean z3, OperatorFlightSheetConfig flightSheet, boolean z4, int i, OperatorMapFiltersConfig filters, double d, boolean z5, boolean z6, OperatorAreaConfig operatorArea, boolean z7, boolean z8, boolean z9) {
        Intrinsics.checkNotNullParameter(flightSheet, "flightSheet");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(operatorArea, "operatorArea");
        this.enableParkingNests = z;
        this.enableNests = z2;
        this.mapPinsStaleThreshold = j;
        this.enableServerDrivenFilters = z3;
        this.flightSheet = flightSheet;
        this.allowAreaTapToSelectMarkerAreas = z4;
        this.mapAreasLastUpdateRefreshThreshold = i;
        this.filters = filters;
        this.zoomIncludeUserLocationThreshold = d;
        this.demandCellsTappable = z5;
        this.showRecommendedBirdsAfterTap = z6;
        this.operatorArea = operatorArea;
        this.enableManualRefresh = z7;
        this.enableOptimizedMapRenderer = z8;
        this.enableWarehouses = z9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ OperatorMapConfig(boolean z, boolean z2, long j, boolean z3, OperatorFlightSheetConfig operatorFlightSheetConfig, boolean z4, int i, OperatorMapFiltersConfig operatorMapFiltersConfig, double d, boolean z5, boolean z6, OperatorAreaConfig operatorAreaConfig, boolean z7, boolean z8, boolean z9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r4, r6, r7, r9, r10, r11, r12, r14, r16, r2, (i2 & 4096) != 0 ? false : z7, (i2 & 8192) != 0 ? false : z8, (i2 & 16384) != 0 ? false : z9);
        boolean z10;
        OperatorAreaConfig operatorAreaConfig2;
        boolean z11 = (i2 & 1) != 0 ? false : z;
        boolean z12 = (i2 & 2) != 0 ? false : z2;
        long j2 = (i2 & 4) != 0 ? 30000L : j;
        boolean z13 = (i2 & 8) != 0 ? false : z3;
        OperatorFlightSheetConfig operatorFlightSheetConfig2 = (i2 & 16) != 0 ? new OperatorFlightSheetConfig(false, null, 3, null) : operatorFlightSheetConfig;
        boolean z14 = (i2 & 32) != 0 ? false : z4;
        int i3 = (i2 & 64) != 0 ? 60 : i;
        OperatorMapFiltersConfig operatorMapFiltersConfig2 = (i2 & 128) != 0 ? new OperatorMapFiltersConfig(false, false, false, 7, null) : operatorMapFiltersConfig;
        double d2 = (i2 & 256) != 0 ? 10000.0d : d;
        boolean z15 = (i2 & 512) != 0 ? false : z5;
        boolean z16 = (i2 & 1024) != 0 ? false : z6;
        if ((i2 & 2048) != 0) {
            z10 = z16;
            operatorAreaConfig2 = new OperatorAreaConfig(null, 1, null);
        } else {
            z10 = z16;
            operatorAreaConfig2 = operatorAreaConfig;
        }
    }
}
