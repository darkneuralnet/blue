package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/wire/WireBountyFlightSheetHeader;", "", "marker", "Lco/bird/android/model/wire/WireFleetMarker;", "title", "", "subtitle", "(Lco/bird/android/model/wire/WireFleetMarker;Ljava/lang/String;Ljava/lang/String;)V", "getMarker", "()Lco/bird/android/model/wire/WireFleetMarker;", "getSubtitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBountyFlightSheetHeader {
    @JsonProperty("marker")
    @InterfaceC41208ft5("marker")
    private final WireFleetMarker marker;
    @JsonProperty("subtitle")
    @InterfaceC41208ft5("subtitle")
    private final String subtitle;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public WireBountyFlightSheetHeader(WireFleetMarker marker, String title, String str) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        Intrinsics.checkNotNullParameter(title, "title");
        this.marker = marker;
        this.title = title;
        this.subtitle = str;
    }

    public static /* synthetic */ WireBountyFlightSheetHeader copy$default(WireBountyFlightSheetHeader wireBountyFlightSheetHeader, WireFleetMarker wireFleetMarker, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            wireFleetMarker = wireBountyFlightSheetHeader.marker;
        }
        if ((i & 2) != 0) {
            str = wireBountyFlightSheetHeader.title;
        }
        if ((i & 4) != 0) {
            str2 = wireBountyFlightSheetHeader.subtitle;
        }
        return wireBountyFlightSheetHeader.copy(wireFleetMarker, str, str2);
    }

    public final WireFleetMarker component1() {
        return this.marker;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final WireBountyFlightSheetHeader copy(WireFleetMarker marker, String title, String str) {
        Intrinsics.checkNotNullParameter(marker, "marker");
        Intrinsics.checkNotNullParameter(title, "title");
        return new WireBountyFlightSheetHeader(marker, title, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireBountyFlightSheetHeader) {
            WireBountyFlightSheetHeader wireBountyFlightSheetHeader = (WireBountyFlightSheetHeader) obj;
            return Intrinsics.areEqual(this.marker, wireBountyFlightSheetHeader.marker) && Intrinsics.areEqual(this.title, wireBountyFlightSheetHeader.title) && Intrinsics.areEqual(this.subtitle, wireBountyFlightSheetHeader.subtitle);
        }
        return false;
    }

    public final WireFleetMarker getMarker() {
        return this.marker;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((this.marker.hashCode() * 31) + this.title.hashCode()) * 31;
        String str = this.subtitle;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        WireFleetMarker wireFleetMarker = this.marker;
        String str = this.title;
        String str2 = this.subtitle;
        return "WireBountyFlightSheetHeader(marker=" + wireFleetMarker + ", title=" + str + ", subtitle=" + str2 + ")";
    }

    public /* synthetic */ WireBountyFlightSheetHeader(WireFleetMarker wireFleetMarker, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wireFleetMarker, str, (i & 4) != 0 ? null : str2);
    }
}
