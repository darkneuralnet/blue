package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;", "", "enabled", "", "maxNestDistanceFromUserMeters", "", "maxNestCapacity", "", "photoRequired", "(ZDIZ)V", "getEnabled", "()Z", "getMaxNestCapacity", "()I", "getMaxNestDistanceFromUserMeters", "()D", "getPhotoRequired", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorNestSuggestionConfig {
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("max_nest_capacity")
    @InterfaceC41208ft5("max_nest_capacity")
    private final int maxNestCapacity;
    @JsonProperty("max_nest_distance_from_user_meters")
    @InterfaceC41208ft5("max_nest_distance_from_user_meters")
    private final double maxNestDistanceFromUserMeters;
    @JsonProperty("photo_required")
    @InterfaceC41208ft5("photo_required")
    private final boolean photoRequired;

    public OperatorNestSuggestionConfig() {
        this(false, 0.0d, 0, false, 15, null);
    }

    public static /* synthetic */ OperatorNestSuggestionConfig copy$default(OperatorNestSuggestionConfig operatorNestSuggestionConfig, boolean z, double d, int i, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = operatorNestSuggestionConfig.enabled;
        }
        if ((i2 & 2) != 0) {
            d = operatorNestSuggestionConfig.maxNestDistanceFromUserMeters;
        }
        double d2 = d;
        if ((i2 & 4) != 0) {
            i = operatorNestSuggestionConfig.maxNestCapacity;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z2 = operatorNestSuggestionConfig.photoRequired;
        }
        return operatorNestSuggestionConfig.copy(z, d2, i3, z2);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final double component2() {
        return this.maxNestDistanceFromUserMeters;
    }

    public final int component3() {
        return this.maxNestCapacity;
    }

    public final boolean component4() {
        return this.photoRequired;
    }

    public final OperatorNestSuggestionConfig copy(boolean z, double d, int i, boolean z2) {
        return new OperatorNestSuggestionConfig(z, d, i, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorNestSuggestionConfig) {
            OperatorNestSuggestionConfig operatorNestSuggestionConfig = (OperatorNestSuggestionConfig) obj;
            return this.enabled == operatorNestSuggestionConfig.enabled && Double.compare(this.maxNestDistanceFromUserMeters, operatorNestSuggestionConfig.maxNestDistanceFromUserMeters) == 0 && this.maxNestCapacity == operatorNestSuggestionConfig.maxNestCapacity && this.photoRequired == operatorNestSuggestionConfig.photoRequired;
        }
        return false;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getMaxNestCapacity() {
        return this.maxNestCapacity;
    }

    public final double getMaxNestDistanceFromUserMeters() {
        return this.maxNestDistanceFromUserMeters;
    }

    public final boolean getPhotoRequired() {
        return this.photoRequired;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((((r0 * 31) + Double.hashCode(this.maxNestDistanceFromUserMeters)) * 31) + Integer.hashCode(this.maxNestCapacity)) * 31;
        boolean z2 = this.photoRequired;
        return hashCode + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        double d = this.maxNestDistanceFromUserMeters;
        int i = this.maxNestCapacity;
        boolean z2 = this.photoRequired;
        return "OperatorNestSuggestionConfig(enabled=" + z + ", maxNestDistanceFromUserMeters=" + d + ", maxNestCapacity=" + i + ", photoRequired=" + z2 + ")";
    }

    public OperatorNestSuggestionConfig(boolean z, double d, int i, boolean z2) {
        this.enabled = z;
        this.maxNestDistanceFromUserMeters = d;
        this.maxNestCapacity = i;
        this.photoRequired = z2;
    }

    public /* synthetic */ OperatorNestSuggestionConfig(boolean z, double d, int i, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 100.0d : d, (i2 & 4) != 0 ? 99 : i, (i2 & 8) != 0 ? false : z2);
    }
}
