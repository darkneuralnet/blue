package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/wire/configs/InacccesibleBirdRoleConfig;", "", "cannotAccessThresholdRadiusMeters", "", "markMissingBirdFinderRequiredIntervalSeconds", "", "(FI)V", "getCannotAccessThresholdRadiusMeters", "()F", "getMarkMissingBirdFinderRequiredIntervalSeconds", "()I", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class InacccesibleBirdRoleConfig {
    @JsonProperty("cannot_access_threshold_radius_meters")
    @InterfaceC41208ft5("cannot_access_threshold_radius_meters")
    private final float cannotAccessThresholdRadiusMeters;
    @JsonProperty("mark_missing_bird_finder_required_interval_seconds")
    @InterfaceC41208ft5("mark_missing_bird_finder_required_interval_seconds")
    private final int markMissingBirdFinderRequiredIntervalSeconds;

    public InacccesibleBirdRoleConfig() {
        this(0.0f, 0, 3, null);
    }

    public static /* synthetic */ InacccesibleBirdRoleConfig copy$default(InacccesibleBirdRoleConfig inacccesibleBirdRoleConfig, float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = inacccesibleBirdRoleConfig.cannotAccessThresholdRadiusMeters;
        }
        if ((i2 & 2) != 0) {
            i = inacccesibleBirdRoleConfig.markMissingBirdFinderRequiredIntervalSeconds;
        }
        return inacccesibleBirdRoleConfig.copy(f, i);
    }

    public final float component1() {
        return this.cannotAccessThresholdRadiusMeters;
    }

    public final int component2() {
        return this.markMissingBirdFinderRequiredIntervalSeconds;
    }

    public final InacccesibleBirdRoleConfig copy(float f, int i) {
        return new InacccesibleBirdRoleConfig(f, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InacccesibleBirdRoleConfig) {
            InacccesibleBirdRoleConfig inacccesibleBirdRoleConfig = (InacccesibleBirdRoleConfig) obj;
            return Float.compare(this.cannotAccessThresholdRadiusMeters, inacccesibleBirdRoleConfig.cannotAccessThresholdRadiusMeters) == 0 && this.markMissingBirdFinderRequiredIntervalSeconds == inacccesibleBirdRoleConfig.markMissingBirdFinderRequiredIntervalSeconds;
        }
        return false;
    }

    public final float getCannotAccessThresholdRadiusMeters() {
        return this.cannotAccessThresholdRadiusMeters;
    }

    public final int getMarkMissingBirdFinderRequiredIntervalSeconds() {
        return this.markMissingBirdFinderRequiredIntervalSeconds;
    }

    public int hashCode() {
        return (Float.hashCode(this.cannotAccessThresholdRadiusMeters) * 31) + Integer.hashCode(this.markMissingBirdFinderRequiredIntervalSeconds);
    }

    public String toString() {
        float f = this.cannotAccessThresholdRadiusMeters;
        int i = this.markMissingBirdFinderRequiredIntervalSeconds;
        return "InacccesibleBirdRoleConfig(cannotAccessThresholdRadiusMeters=" + f + ", markMissingBirdFinderRequiredIntervalSeconds=" + i + ")";
    }

    public InacccesibleBirdRoleConfig(float f, int i) {
        this.cannotAccessThresholdRadiusMeters = f;
        this.markMissingBirdFinderRequiredIntervalSeconds = i;
    }

    public /* synthetic */ InacccesibleBirdRoleConfig(float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 5.0E7f : f, (i2 & 2) != 0 ? 10 : i);
    }
}
