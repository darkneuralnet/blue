package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28432d2 = {"Lco/bird/api/response/Step;", "", "startLocation", "Lco/bird/android/model/wire/WireLocation;", "endLocation", "polyline", "Lco/bird/api/response/OverviewPolyLine;", "(Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/wire/WireLocation;Lco/bird/api/response/OverviewPolyLine;)V", "getEndLocation", "()Lco/bird/android/model/wire/WireLocation;", "getPolyline", "()Lco/bird/api/response/OverviewPolyLine;", "getStartLocation", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Step {
    @JsonProperty("end_location")
    @InterfaceC41208ft5("end_location")
    private final WireLocation endLocation;
    @JsonProperty("polyline")
    @InterfaceC41208ft5("polyline")
    private final OverviewPolyLine polyline;
    @JsonProperty("start_location")
    @InterfaceC41208ft5("start_location")
    private final WireLocation startLocation;

    public Step() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Step copy$default(Step step, WireLocation wireLocation, WireLocation wireLocation2, OverviewPolyLine overviewPolyLine, int i, Object obj) {
        if ((i & 1) != 0) {
            wireLocation = step.startLocation;
        }
        if ((i & 2) != 0) {
            wireLocation2 = step.endLocation;
        }
        if ((i & 4) != 0) {
            overviewPolyLine = step.polyline;
        }
        return step.copy(wireLocation, wireLocation2, overviewPolyLine);
    }

    public final WireLocation component1() {
        return this.startLocation;
    }

    public final WireLocation component2() {
        return this.endLocation;
    }

    public final OverviewPolyLine component3() {
        return this.polyline;
    }

    public final Step copy(WireLocation wireLocation, WireLocation wireLocation2, OverviewPolyLine overviewPolyLine) {
        return new Step(wireLocation, wireLocation2, overviewPolyLine);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Step) {
            Step step = (Step) obj;
            return Intrinsics.areEqual(this.startLocation, step.startLocation) && Intrinsics.areEqual(this.endLocation, step.endLocation) && Intrinsics.areEqual(this.polyline, step.polyline);
        }
        return false;
    }

    public final WireLocation getEndLocation() {
        return this.endLocation;
    }

    public final OverviewPolyLine getPolyline() {
        return this.polyline;
    }

    public final WireLocation getStartLocation() {
        return this.startLocation;
    }

    public int hashCode() {
        WireLocation wireLocation = this.startLocation;
        int hashCode = (wireLocation == null ? 0 : wireLocation.hashCode()) * 31;
        WireLocation wireLocation2 = this.endLocation;
        int hashCode2 = (hashCode + (wireLocation2 == null ? 0 : wireLocation2.hashCode())) * 31;
        OverviewPolyLine overviewPolyLine = this.polyline;
        return hashCode2 + (overviewPolyLine != null ? overviewPolyLine.hashCode() : 0);
    }

    public String toString() {
        WireLocation wireLocation = this.startLocation;
        WireLocation wireLocation2 = this.endLocation;
        OverviewPolyLine overviewPolyLine = this.polyline;
        return "Step(startLocation=" + wireLocation + ", endLocation=" + wireLocation2 + ", polyline=" + overviewPolyLine + ")";
    }

    public Step(WireLocation wireLocation, WireLocation wireLocation2, OverviewPolyLine overviewPolyLine) {
        this.startLocation = wireLocation;
        this.endLocation = wireLocation2;
        this.polyline = overviewPolyLine;
    }

    public /* synthetic */ Step(WireLocation wireLocation, WireLocation wireLocation2, OverviewPolyLine overviewPolyLine, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wireLocation, (i & 2) != 0 ? null : wireLocation2, (i & 4) != 0 ? null : overviewPolyLine);
    }
}
