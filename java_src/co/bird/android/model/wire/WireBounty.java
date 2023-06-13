package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/wire/WireBounty;", "", "id", "", "location", "Lco/bird/android/model/wire/WireLocation;", "marker", "Lco/bird/android/model/wire/WireFleetMarker;", "(Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/wire/WireFleetMarker;)V", "getId", "()Ljava/lang/String;", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getMarker", "()Lco/bird/android/model/wire/WireFleetMarker;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBounty {
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66720id;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("marker")
    @InterfaceC41208ft5("marker")
    private final WireFleetMarker marker;

    public WireBounty() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WireBounty copy$default(WireBounty wireBounty, String str, WireLocation wireLocation, WireFleetMarker wireFleetMarker, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireBounty.f66720id;
        }
        if ((i & 2) != 0) {
            wireLocation = wireBounty.location;
        }
        if ((i & 4) != 0) {
            wireFleetMarker = wireBounty.marker;
        }
        return wireBounty.copy(str, wireLocation, wireFleetMarker);
    }

    public final String component1() {
        return this.f66720id;
    }

    public final WireLocation component2() {
        return this.location;
    }

    public final WireFleetMarker component3() {
        return this.marker;
    }

    public final WireBounty copy(String id, WireLocation location, WireFleetMarker wireFleetMarker) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        return new WireBounty(id, location, wireFleetMarker);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireBounty) {
            WireBounty wireBounty = (WireBounty) obj;
            return Intrinsics.areEqual(this.f66720id, wireBounty.f66720id) && Intrinsics.areEqual(this.location, wireBounty.location) && Intrinsics.areEqual(this.marker, wireBounty.marker);
        }
        return false;
    }

    public final String getId() {
        return this.f66720id;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final WireFleetMarker getMarker() {
        return this.marker;
    }

    public int hashCode() {
        int hashCode = ((this.f66720id.hashCode() * 31) + this.location.hashCode()) * 31;
        WireFleetMarker wireFleetMarker = this.marker;
        return hashCode + (wireFleetMarker == null ? 0 : wireFleetMarker.hashCode());
    }

    public String toString() {
        String str = this.f66720id;
        WireLocation wireLocation = this.location;
        WireFleetMarker wireFleetMarker = this.marker;
        return "WireBounty(id=" + str + ", location=" + wireLocation + ", marker=" + wireFleetMarker + ")";
    }

    public WireBounty(String id, WireLocation location, WireFleetMarker wireFleetMarker) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f66720id = id;
        this.location = location;
        this.marker = wireFleetMarker;
    }

    public /* synthetic */ WireBounty(String str, WireLocation wireLocation, WireFleetMarker wireFleetMarker, int i, DefaultConstructorMarker defaultConstructorMarker) {
        WireBounty wireBounty;
        WireFleetMarker wireFleetMarker2;
        String str2 = (i & 1) != 0 ? "" : str;
        WireLocation wireLocation2 = (i & 2) != 0 ? new WireLocation(0.0d, 0.0d, null, null, null, null, false, null, null, 508, null) : wireLocation;
        if ((i & 4) != 0) {
            wireFleetMarker2 = null;
            wireBounty = this;
        } else {
            wireBounty = this;
            wireFleetMarker2 = wireFleetMarker;
        }
        new WireBounty(str2, wireLocation2, wireFleetMarker2);
    }
}
