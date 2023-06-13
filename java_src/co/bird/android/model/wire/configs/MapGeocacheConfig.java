package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000f\u0010\nR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0010\u0010\n¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/model/wire/configs/MapGeocacheConfig;", "", "enabled", "", "cellLevel", "", "expirySeconds", "queryLimit", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCellLevel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getExpirySeconds", "getQueryLimit", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/wire/configs/MapGeocacheConfig;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class MapGeocacheConfig {
    @JsonProperty("cell_level")
    @InterfaceC41208ft5("cell_level")
    private final Integer cellLevel;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final Boolean enabled;
    @JsonProperty("expiry_seconds")
    @InterfaceC41208ft5("expiry_seconds")
    private final Integer expirySeconds;
    @JsonProperty("query_limit")
    @InterfaceC41208ft5("query_limit")
    private final Integer queryLimit;

    public MapGeocacheConfig() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ MapGeocacheConfig copy$default(MapGeocacheConfig mapGeocacheConfig, Boolean bool, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = mapGeocacheConfig.enabled;
        }
        if ((i & 2) != 0) {
            num = mapGeocacheConfig.cellLevel;
        }
        if ((i & 4) != 0) {
            num2 = mapGeocacheConfig.expirySeconds;
        }
        if ((i & 8) != 0) {
            num3 = mapGeocacheConfig.queryLimit;
        }
        return mapGeocacheConfig.copy(bool, num, num2, num3);
    }

    public final Boolean component1() {
        return this.enabled;
    }

    public final Integer component2() {
        return this.cellLevel;
    }

    public final Integer component3() {
        return this.expirySeconds;
    }

    public final Integer component4() {
        return this.queryLimit;
    }

    public final MapGeocacheConfig copy(Boolean bool, Integer num, Integer num2, Integer num3) {
        return new MapGeocacheConfig(bool, num, num2, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MapGeocacheConfig) {
            MapGeocacheConfig mapGeocacheConfig = (MapGeocacheConfig) obj;
            return Intrinsics.areEqual(this.enabled, mapGeocacheConfig.enabled) && Intrinsics.areEqual(this.cellLevel, mapGeocacheConfig.cellLevel) && Intrinsics.areEqual(this.expirySeconds, mapGeocacheConfig.expirySeconds) && Intrinsics.areEqual(this.queryLimit, mapGeocacheConfig.queryLimit);
        }
        return false;
    }

    public final Integer getCellLevel() {
        return this.cellLevel;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Integer getExpirySeconds() {
        return this.expirySeconds;
    }

    public final Integer getQueryLimit() {
        return this.queryLimit;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.cellLevel;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.expirySeconds;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.queryLimit;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.enabled;
        Integer num = this.cellLevel;
        Integer num2 = this.expirySeconds;
        Integer num3 = this.queryLimit;
        return "MapGeocacheConfig(enabled=" + bool + ", cellLevel=" + num + ", expirySeconds=" + num2 + ", queryLimit=" + num3 + ")";
    }

    public MapGeocacheConfig(Boolean bool, Integer num, Integer num2, Integer num3) {
        this.enabled = bool;
        this.cellLevel = num;
        this.expirySeconds = num2;
        this.queryLimit = num3;
    }

    public /* synthetic */ MapGeocacheConfig(Boolean bool, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3);
    }
}
