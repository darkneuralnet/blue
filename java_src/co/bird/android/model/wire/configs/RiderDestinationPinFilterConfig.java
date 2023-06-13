package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;", "", "innerRadiusMeters", "", "outerRadiusMeters", "maxPinsDisplayed", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getInnerRadiusMeters", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxPinsDisplayed", "getOuterRadiusMeters", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RiderDestinationPinFilterConfig {
    @JsonProperty("inner_radius_meters")
    @InterfaceC41208ft5("inner_radius_meters")
    private final Integer innerRadiusMeters;
    @JsonProperty("max_pins_displayed")
    @InterfaceC41208ft5("max_pins_displayed")
    private final Integer maxPinsDisplayed;
    @JsonProperty("outer_radius_meters")
    @InterfaceC41208ft5("outer_radius_meters")
    private final Integer outerRadiusMeters;

    public RiderDestinationPinFilterConfig() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ RiderDestinationPinFilterConfig copy$default(RiderDestinationPinFilterConfig riderDestinationPinFilterConfig, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = riderDestinationPinFilterConfig.innerRadiusMeters;
        }
        if ((i & 2) != 0) {
            num2 = riderDestinationPinFilterConfig.outerRadiusMeters;
        }
        if ((i & 4) != 0) {
            num3 = riderDestinationPinFilterConfig.maxPinsDisplayed;
        }
        return riderDestinationPinFilterConfig.copy(num, num2, num3);
    }

    public final Integer component1() {
        return this.innerRadiusMeters;
    }

    public final Integer component2() {
        return this.outerRadiusMeters;
    }

    public final Integer component3() {
        return this.maxPinsDisplayed;
    }

    public final RiderDestinationPinFilterConfig copy(Integer num, Integer num2, Integer num3) {
        return new RiderDestinationPinFilterConfig(num, num2, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RiderDestinationPinFilterConfig) {
            RiderDestinationPinFilterConfig riderDestinationPinFilterConfig = (RiderDestinationPinFilterConfig) obj;
            return Intrinsics.areEqual(this.innerRadiusMeters, riderDestinationPinFilterConfig.innerRadiusMeters) && Intrinsics.areEqual(this.outerRadiusMeters, riderDestinationPinFilterConfig.outerRadiusMeters) && Intrinsics.areEqual(this.maxPinsDisplayed, riderDestinationPinFilterConfig.maxPinsDisplayed);
        }
        return false;
    }

    public final Integer getInnerRadiusMeters() {
        return this.innerRadiusMeters;
    }

    public final Integer getMaxPinsDisplayed() {
        return this.maxPinsDisplayed;
    }

    public final Integer getOuterRadiusMeters() {
        return this.outerRadiusMeters;
    }

    public int hashCode() {
        Integer num = this.innerRadiusMeters;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.outerRadiusMeters;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxPinsDisplayed;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.innerRadiusMeters;
        Integer num2 = this.outerRadiusMeters;
        Integer num3 = this.maxPinsDisplayed;
        return "RiderDestinationPinFilterConfig(innerRadiusMeters=" + num + ", outerRadiusMeters=" + num2 + ", maxPinsDisplayed=" + num3 + ")";
    }

    public RiderDestinationPinFilterConfig(Integer num, Integer num2, Integer num3) {
        this.innerRadiusMeters = num;
        this.outerRadiusMeters = num2;
        this.maxPinsDisplayed = num3;
    }

    public /* synthetic */ RiderDestinationPinFilterConfig(Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3);
    }
}
