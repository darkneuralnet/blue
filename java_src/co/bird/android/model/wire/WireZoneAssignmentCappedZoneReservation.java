package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/wire/WireZoneAssignmentCappedZoneReservation;", "", "id", "", "birdCode", "timeRemaining", "batteryLevel", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getBatteryLevel", "()I", "getBirdCode", "()Ljava/lang/String;", "getId", "getTimeRemaining", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireZoneAssignmentCappedZoneReservation {
    @JsonProperty("battery_level")
    @InterfaceC41208ft5("battery_level")
    private final int batteryLevel;
    @JsonProperty("bird_code")
    @InterfaceC41208ft5("bird_code")
    private final String birdCode;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66777id;
    @JsonProperty("time_remaining")
    @InterfaceC41208ft5("time_remaining")
    private final String timeRemaining;

    public WireZoneAssignmentCappedZoneReservation() {
        this(null, null, null, 0, 15, null);
    }

    public static /* synthetic */ WireZoneAssignmentCappedZoneReservation copy$default(WireZoneAssignmentCappedZoneReservation wireZoneAssignmentCappedZoneReservation, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = wireZoneAssignmentCappedZoneReservation.f66777id;
        }
        if ((i2 & 2) != 0) {
            str2 = wireZoneAssignmentCappedZoneReservation.birdCode;
        }
        if ((i2 & 4) != 0) {
            str3 = wireZoneAssignmentCappedZoneReservation.timeRemaining;
        }
        if ((i2 & 8) != 0) {
            i = wireZoneAssignmentCappedZoneReservation.batteryLevel;
        }
        return wireZoneAssignmentCappedZoneReservation.copy(str, str2, str3, i);
    }

    public final String component1() {
        return this.f66777id;
    }

    public final String component2() {
        return this.birdCode;
    }

    public final String component3() {
        return this.timeRemaining;
    }

    public final int component4() {
        return this.batteryLevel;
    }

    public final WireZoneAssignmentCappedZoneReservation copy(String id, String birdCode, String timeRemaining, int i) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(timeRemaining, "timeRemaining");
        return new WireZoneAssignmentCappedZoneReservation(id, birdCode, timeRemaining, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireZoneAssignmentCappedZoneReservation) {
            WireZoneAssignmentCappedZoneReservation wireZoneAssignmentCappedZoneReservation = (WireZoneAssignmentCappedZoneReservation) obj;
            return Intrinsics.areEqual(this.f66777id, wireZoneAssignmentCappedZoneReservation.f66777id) && Intrinsics.areEqual(this.birdCode, wireZoneAssignmentCappedZoneReservation.birdCode) && Intrinsics.areEqual(this.timeRemaining, wireZoneAssignmentCappedZoneReservation.timeRemaining) && this.batteryLevel == wireZoneAssignmentCappedZoneReservation.batteryLevel;
        }
        return false;
    }

    public final int getBatteryLevel() {
        return this.batteryLevel;
    }

    public final String getBirdCode() {
        return this.birdCode;
    }

    public final String getId() {
        return this.f66777id;
    }

    public final String getTimeRemaining() {
        return this.timeRemaining;
    }

    public int hashCode() {
        return (((((this.f66777id.hashCode() * 31) + this.birdCode.hashCode()) * 31) + this.timeRemaining.hashCode()) * 31) + Integer.hashCode(this.batteryLevel);
    }

    public String toString() {
        String str = this.f66777id;
        String str2 = this.birdCode;
        String str3 = this.timeRemaining;
        int i = this.batteryLevel;
        return "WireZoneAssignmentCappedZoneReservation(id=" + str + ", birdCode=" + str2 + ", timeRemaining=" + str3 + ", batteryLevel=" + i + ")";
    }

    public WireZoneAssignmentCappedZoneReservation(String id, String birdCode, String timeRemaining, int i) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(timeRemaining, "timeRemaining");
        this.f66777id = id;
        this.birdCode = birdCode;
        this.timeRemaining = timeRemaining;
        this.batteryLevel = i;
    }

    public /* synthetic */ WireZoneAssignmentCappedZoneReservation(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i);
    }
}
