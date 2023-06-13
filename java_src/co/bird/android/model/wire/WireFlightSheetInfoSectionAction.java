package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.FlightSheetAction;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/model/wire/WireFlightSheetInfoSectionAction;", "", "kind", "Lco/bird/android/model/constant/FlightSheetAction;", "(Lco/bird/android/model/constant/FlightSheetAction;)V", "getKind", "()Lco/bird/android/model/constant/FlightSheetAction;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireFlightSheetInfoSectionAction {
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final FlightSheetAction kind;

    public WireFlightSheetInfoSectionAction(FlightSheetAction kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.kind = kind;
    }

    public static /* synthetic */ WireFlightSheetInfoSectionAction copy$default(WireFlightSheetInfoSectionAction wireFlightSheetInfoSectionAction, FlightSheetAction flightSheetAction, int i, Object obj) {
        if ((i & 1) != 0) {
            flightSheetAction = wireFlightSheetInfoSectionAction.kind;
        }
        return wireFlightSheetInfoSectionAction.copy(flightSheetAction);
    }

    public final FlightSheetAction component1() {
        return this.kind;
    }

    public final WireFlightSheetInfoSectionAction copy(FlightSheetAction kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new WireFlightSheetInfoSectionAction(kind);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WireFlightSheetInfoSectionAction) && this.kind == ((WireFlightSheetInfoSectionAction) obj).kind;
    }

    public final FlightSheetAction getKind() {
        return this.kind;
    }

    public int hashCode() {
        return this.kind.hashCode();
    }

    public String toString() {
        FlightSheetAction flightSheetAction = this.kind;
        return "WireFlightSheetInfoSectionAction(kind=" + flightSheetAction + ")";
    }
}
