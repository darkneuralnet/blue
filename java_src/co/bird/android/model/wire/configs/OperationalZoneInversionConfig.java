package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;", "", "enabled", "", "zoomLevelThreshold", "", "(Ljava/lang/Boolean;Ljava/lang/Float;)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getZoomLevelThreshold", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Float;)Lco/bird/android/model/wire/configs/OperationalZoneInversionConfig;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperationalZoneInversionConfig {
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final Boolean enabled;
    @JsonProperty("zoom_level_threshold")
    @InterfaceC41208ft5("zoom_level_threshold")
    private final Float zoomLevelThreshold;

    public OperationalZoneInversionConfig() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ OperationalZoneInversionConfig copy$default(OperationalZoneInversionConfig operationalZoneInversionConfig, Boolean bool, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = operationalZoneInversionConfig.enabled;
        }
        if ((i & 2) != 0) {
            f = operationalZoneInversionConfig.zoomLevelThreshold;
        }
        return operationalZoneInversionConfig.copy(bool, f);
    }

    public final Boolean component1() {
        return this.enabled;
    }

    public final Float component2() {
        return this.zoomLevelThreshold;
    }

    public final OperationalZoneInversionConfig copy(Boolean bool, Float f) {
        return new OperationalZoneInversionConfig(bool, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperationalZoneInversionConfig) {
            OperationalZoneInversionConfig operationalZoneInversionConfig = (OperationalZoneInversionConfig) obj;
            return Intrinsics.areEqual(this.enabled, operationalZoneInversionConfig.enabled) && Intrinsics.areEqual((Object) this.zoomLevelThreshold, (Object) operationalZoneInversionConfig.zoomLevelThreshold);
        }
        return false;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Float getZoomLevelThreshold() {
        return this.zoomLevelThreshold;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Float f = this.zoomLevelThreshold;
        return hashCode + (f != null ? f.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.enabled;
        Float f = this.zoomLevelThreshold;
        return "OperationalZoneInversionConfig(enabled=" + bool + ", zoomLevelThreshold=" + f + ")";
    }

    public OperationalZoneInversionConfig(Boolean bool, Float f) {
        this.enabled = bool;
        this.zoomLevelThreshold = f;
    }

    public /* synthetic */ OperationalZoneInversionConfig(Boolean bool, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : f);
    }
}
