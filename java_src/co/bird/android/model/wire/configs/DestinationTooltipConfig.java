package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/wire/configs/DestinationTooltipConfig;", "", "message", "", "displayUntilClicked", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getDisplayUntilClicked", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lco/bird/android/model/wire/configs/DestinationTooltipConfig;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DestinationTooltipConfig {
    @JsonProperty("display_until_clicked")
    @InterfaceC41208ft5("display_until_clicked")
    private final Boolean displayUntilClicked;
    @JsonProperty("message")
    @InterfaceC41208ft5("message")
    private final String message;

    public DestinationTooltipConfig() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ DestinationTooltipConfig copy$default(DestinationTooltipConfig destinationTooltipConfig, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = destinationTooltipConfig.message;
        }
        if ((i & 2) != 0) {
            bool = destinationTooltipConfig.displayUntilClicked;
        }
        return destinationTooltipConfig.copy(str, bool);
    }

    public final String component1() {
        return this.message;
    }

    public final Boolean component2() {
        return this.displayUntilClicked;
    }

    public final DestinationTooltipConfig copy(String str, Boolean bool) {
        return new DestinationTooltipConfig(str, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DestinationTooltipConfig) {
            DestinationTooltipConfig destinationTooltipConfig = (DestinationTooltipConfig) obj;
            return Intrinsics.areEqual(this.message, destinationTooltipConfig.message) && Intrinsics.areEqual(this.displayUntilClicked, destinationTooltipConfig.displayUntilClicked);
        }
        return false;
    }

    public final Boolean getDisplayUntilClicked() {
        return this.displayUntilClicked;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.displayUntilClicked;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.message;
        Boolean bool = this.displayUntilClicked;
        return "DestinationTooltipConfig(message=" + str + ", displayUntilClicked=" + bool + ")";
    }

    public DestinationTooltipConfig(String str, Boolean bool) {
        this.message = str;
        this.displayUntilClicked = bool;
    }

    public /* synthetic */ DestinationTooltipConfig(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? Boolean.FALSE : bool);
    }
}
