package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\rJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015Jn\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\bHÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015¨\u0006)"}, m28432d2 = {"Lco/bird/android/model/wire/configs/ClusteringParametersConfig;", "", "enabled", "", "algorithm", "", "animation", "maxCellSizeScreenPoints", "", "minItemCountForClusterCell", "minZoomLevelForOnlyClustering", "maxZoomLevel", "pinPosition", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAlgorithm", "()Ljava/lang/String;", "getAnimation", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxCellSizeScreenPoints", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxZoomLevel", "getMinItemCountForClusterCell", "getMinZoomLevelForOnlyClustering", "getPinPosition", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/wire/configs/ClusteringParametersConfig;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ClusteringParametersConfig {
    @JsonProperty("algorithm")
    @InterfaceC41208ft5("algorithm")
    private final String algorithm;
    @JsonProperty("animation")
    @InterfaceC41208ft5("animation")
    private final String animation;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final Boolean enabled;
    @JsonProperty("max_cell_size_screen_points")
    @InterfaceC41208ft5("max_cell_size_screen_points")
    private final Integer maxCellSizeScreenPoints;
    @JsonProperty("max_zoom_level")
    @InterfaceC41208ft5("max_zoom_level")
    private final Integer maxZoomLevel;
    @JsonProperty("min_item_count_for_cluster_cell")
    @InterfaceC41208ft5("min_item_count_for_cluster_cell")
    private final Integer minItemCountForClusterCell;
    @JsonProperty("min_zoom_level_for_only_clustering")
    @InterfaceC41208ft5("min_zoom_level_for_only_clustering")
    private final Integer minZoomLevelForOnlyClustering;
    @JsonProperty("pin_position")
    @InterfaceC41208ft5("pin_position")
    private final Integer pinPosition;

    public ClusteringParametersConfig() {
        this(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final Boolean component1() {
        return this.enabled;
    }

    public final String component2() {
        return this.algorithm;
    }

    public final String component3() {
        return this.animation;
    }

    public final Integer component4() {
        return this.maxCellSizeScreenPoints;
    }

    public final Integer component5() {
        return this.minItemCountForClusterCell;
    }

    public final Integer component6() {
        return this.minZoomLevelForOnlyClustering;
    }

    public final Integer component7() {
        return this.maxZoomLevel;
    }

    public final Integer component8() {
        return this.pinPosition;
    }

    public final ClusteringParametersConfig copy(Boolean bool, String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        return new ClusteringParametersConfig(bool, str, str2, num, num2, num3, num4, num5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClusteringParametersConfig) {
            ClusteringParametersConfig clusteringParametersConfig = (ClusteringParametersConfig) obj;
            return Intrinsics.areEqual(this.enabled, clusteringParametersConfig.enabled) && Intrinsics.areEqual(this.algorithm, clusteringParametersConfig.algorithm) && Intrinsics.areEqual(this.animation, clusteringParametersConfig.animation) && Intrinsics.areEqual(this.maxCellSizeScreenPoints, clusteringParametersConfig.maxCellSizeScreenPoints) && Intrinsics.areEqual(this.minItemCountForClusterCell, clusteringParametersConfig.minItemCountForClusterCell) && Intrinsics.areEqual(this.minZoomLevelForOnlyClustering, clusteringParametersConfig.minZoomLevelForOnlyClustering) && Intrinsics.areEqual(this.maxZoomLevel, clusteringParametersConfig.maxZoomLevel) && Intrinsics.areEqual(this.pinPosition, clusteringParametersConfig.pinPosition);
        }
        return false;
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final String getAnimation() {
        return this.animation;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Integer getMaxCellSizeScreenPoints() {
        return this.maxCellSizeScreenPoints;
    }

    public final Integer getMaxZoomLevel() {
        return this.maxZoomLevel;
    }

    public final Integer getMinItemCountForClusterCell() {
        return this.minItemCountForClusterCell;
    }

    public final Integer getMinZoomLevelForOnlyClustering() {
        return this.minZoomLevelForOnlyClustering;
    }

    public final Integer getPinPosition() {
        return this.pinPosition;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.algorithm;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.animation;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.maxCellSizeScreenPoints;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minItemCountForClusterCell;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.minZoomLevelForOnlyClustering;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.maxZoomLevel;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.pinPosition;
        return hashCode7 + (num5 != null ? num5.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.enabled;
        String str = this.algorithm;
        String str2 = this.animation;
        Integer num = this.maxCellSizeScreenPoints;
        Integer num2 = this.minItemCountForClusterCell;
        Integer num3 = this.minZoomLevelForOnlyClustering;
        Integer num4 = this.maxZoomLevel;
        Integer num5 = this.pinPosition;
        return "ClusteringParametersConfig(enabled=" + bool + ", algorithm=" + str + ", animation=" + str2 + ", maxCellSizeScreenPoints=" + num + ", minItemCountForClusterCell=" + num2 + ", minZoomLevelForOnlyClustering=" + num3 + ", maxZoomLevel=" + num4 + ", pinPosition=" + num5 + ")";
    }

    public ClusteringParametersConfig(Boolean bool, String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this.enabled = bool;
        this.algorithm = str;
        this.animation = str2;
        this.maxCellSizeScreenPoints = num;
        this.minItemCountForClusterCell = num2;
        this.minZoomLevelForOnlyClustering = num3;
        this.maxZoomLevel = num4;
        this.pinPosition = num5;
    }

    public /* synthetic */ ClusteringParametersConfig(Boolean bool, String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : num4, (i & 128) == 0 ? num5 : null);
    }
}
