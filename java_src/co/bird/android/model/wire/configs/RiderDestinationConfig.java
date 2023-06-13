package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003JJ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, m28432d2 = {"Lco/bird/android/model/wire/configs/RiderDestinationConfig;", "", "enabled", "", "title", "", "tooltip", "Lco/bird/android/model/wire/configs/DestinationTooltipConfig;", "originPinFilter", "Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;", "destinationPinFilter", "(Ljava/lang/Boolean;Ljava/lang/String;Lco/bird/android/model/wire/configs/DestinationTooltipConfig;Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;)V", "getDestinationPinFilter", "()Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOriginPinFilter", "getTitle", "()Ljava/lang/String;", "getTooltip", "()Lco/bird/android/model/wire/configs/DestinationTooltipConfig;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Lco/bird/android/model/wire/configs/DestinationTooltipConfig;Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;Lco/bird/android/model/wire/configs/RiderDestinationPinFilterConfig;)Lco/bird/android/model/wire/configs/RiderDestinationConfig;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RiderDestinationConfig {
    @JsonProperty("destination_pin_filter")
    @InterfaceC41208ft5("destination_pin_filter")
    private final RiderDestinationPinFilterConfig destinationPinFilter;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final Boolean enabled;
    @JsonProperty("origin_pin_filter")
    @InterfaceC41208ft5("origin_pin_filter")
    private final RiderDestinationPinFilterConfig originPinFilter;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("tooltip")
    @InterfaceC41208ft5("tooltip")
    private final DestinationTooltipConfig tooltip;

    public RiderDestinationConfig() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ RiderDestinationConfig copy$default(RiderDestinationConfig riderDestinationConfig, Boolean bool, String str, DestinationTooltipConfig destinationTooltipConfig, RiderDestinationPinFilterConfig riderDestinationPinFilterConfig, RiderDestinationPinFilterConfig riderDestinationPinFilterConfig2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = riderDestinationConfig.enabled;
        }
        if ((i & 2) != 0) {
            str = riderDestinationConfig.title;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            destinationTooltipConfig = riderDestinationConfig.tooltip;
        }
        DestinationTooltipConfig destinationTooltipConfig2 = destinationTooltipConfig;
        if ((i & 8) != 0) {
            riderDestinationPinFilterConfig = riderDestinationConfig.originPinFilter;
        }
        RiderDestinationPinFilterConfig riderDestinationPinFilterConfig3 = riderDestinationPinFilterConfig;
        if ((i & 16) != 0) {
            riderDestinationPinFilterConfig2 = riderDestinationConfig.destinationPinFilter;
        }
        return riderDestinationConfig.copy(bool, str2, destinationTooltipConfig2, riderDestinationPinFilterConfig3, riderDestinationPinFilterConfig2);
    }

    public final Boolean component1() {
        return this.enabled;
    }

    public final String component2() {
        return this.title;
    }

    public final DestinationTooltipConfig component3() {
        return this.tooltip;
    }

    public final RiderDestinationPinFilterConfig component4() {
        return this.originPinFilter;
    }

    public final RiderDestinationPinFilterConfig component5() {
        return this.destinationPinFilter;
    }

    public final RiderDestinationConfig copy(Boolean bool, String str, DestinationTooltipConfig destinationTooltipConfig, RiderDestinationPinFilterConfig riderDestinationPinFilterConfig, RiderDestinationPinFilterConfig riderDestinationPinFilterConfig2) {
        return new RiderDestinationConfig(bool, str, destinationTooltipConfig, riderDestinationPinFilterConfig, riderDestinationPinFilterConfig2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RiderDestinationConfig) {
            RiderDestinationConfig riderDestinationConfig = (RiderDestinationConfig) obj;
            return Intrinsics.areEqual(this.enabled, riderDestinationConfig.enabled) && Intrinsics.areEqual(this.title, riderDestinationConfig.title) && Intrinsics.areEqual(this.tooltip, riderDestinationConfig.tooltip) && Intrinsics.areEqual(this.originPinFilter, riderDestinationConfig.originPinFilter) && Intrinsics.areEqual(this.destinationPinFilter, riderDestinationConfig.destinationPinFilter);
        }
        return false;
    }

    public final RiderDestinationPinFilterConfig getDestinationPinFilter() {
        return this.destinationPinFilter;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final RiderDestinationPinFilterConfig getOriginPinFilter() {
        return this.originPinFilter;
    }

    public final String getTitle() {
        return this.title;
    }

    public final DestinationTooltipConfig getTooltip() {
        return this.tooltip;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        DestinationTooltipConfig destinationTooltipConfig = this.tooltip;
        int hashCode3 = (hashCode2 + (destinationTooltipConfig == null ? 0 : destinationTooltipConfig.hashCode())) * 31;
        RiderDestinationPinFilterConfig riderDestinationPinFilterConfig = this.originPinFilter;
        int hashCode4 = (hashCode3 + (riderDestinationPinFilterConfig == null ? 0 : riderDestinationPinFilterConfig.hashCode())) * 31;
        RiderDestinationPinFilterConfig riderDestinationPinFilterConfig2 = this.destinationPinFilter;
        return hashCode4 + (riderDestinationPinFilterConfig2 != null ? riderDestinationPinFilterConfig2.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.enabled;
        String str = this.title;
        DestinationTooltipConfig destinationTooltipConfig = this.tooltip;
        RiderDestinationPinFilterConfig riderDestinationPinFilterConfig = this.originPinFilter;
        RiderDestinationPinFilterConfig riderDestinationPinFilterConfig2 = this.destinationPinFilter;
        return "RiderDestinationConfig(enabled=" + bool + ", title=" + str + ", tooltip=" + destinationTooltipConfig + ", originPinFilter=" + riderDestinationPinFilterConfig + ", destinationPinFilter=" + riderDestinationPinFilterConfig2 + ")";
    }

    public RiderDestinationConfig(Boolean bool, String str, DestinationTooltipConfig destinationTooltipConfig, RiderDestinationPinFilterConfig riderDestinationPinFilterConfig, RiderDestinationPinFilterConfig riderDestinationPinFilterConfig2) {
        this.enabled = bool;
        this.title = str;
        this.tooltip = destinationTooltipConfig;
        this.originPinFilter = riderDestinationPinFilterConfig;
        this.destinationPinFilter = riderDestinationPinFilterConfig2;
    }

    public /* synthetic */ RiderDestinationConfig(Boolean bool, String str, DestinationTooltipConfig destinationTooltipConfig, RiderDestinationPinFilterConfig riderDestinationPinFilterConfig, RiderDestinationPinFilterConfig riderDestinationPinFilterConfig2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : destinationTooltipConfig, (i & 8) != 0 ? null : riderDestinationPinFilterConfig, (i & 16) == 0 ? riderDestinationPinFilterConfig2 : null);
    }
}
