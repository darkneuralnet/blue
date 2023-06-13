package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireFleetStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/response/FleetStatusResponse;", "", "status", "Lco/bird/android/model/wire/WireFleetStatus;", "expiresAt", "Lorg/joda/time/DateTime;", "(Lco/bird/android/model/wire/WireFleetStatus;Lorg/joda/time/DateTime;)V", "getExpiresAt", "()Lorg/joda/time/DateTime;", "getStatus", "()Lco/bird/android/model/wire/WireFleetStatus;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FleetStatusResponse {
    @JsonProperty("expires_at")
    @InterfaceC41208ft5("expires_at")
    private final DateTime expiresAt;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final WireFleetStatus status;

    public FleetStatusResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ FleetStatusResponse copy$default(FleetStatusResponse fleetStatusResponse, WireFleetStatus wireFleetStatus, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            wireFleetStatus = fleetStatusResponse.status;
        }
        if ((i & 2) != 0) {
            dateTime = fleetStatusResponse.expiresAt;
        }
        return fleetStatusResponse.copy(wireFleetStatus, dateTime);
    }

    public final WireFleetStatus component1() {
        return this.status;
    }

    public final DateTime component2() {
        return this.expiresAt;
    }

    public final FleetStatusResponse copy(WireFleetStatus status, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new FleetStatusResponse(status, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FleetStatusResponse) {
            FleetStatusResponse fleetStatusResponse = (FleetStatusResponse) obj;
            return Intrinsics.areEqual(this.status, fleetStatusResponse.status) && Intrinsics.areEqual(this.expiresAt, fleetStatusResponse.expiresAt);
        }
        return false;
    }

    public final DateTime getExpiresAt() {
        return this.expiresAt;
    }

    public final WireFleetStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        DateTime dateTime = this.expiresAt;
        return hashCode + (dateTime == null ? 0 : dateTime.hashCode());
    }

    public String toString() {
        WireFleetStatus wireFleetStatus = this.status;
        DateTime dateTime = this.expiresAt;
        return "FleetStatusResponse(status=" + wireFleetStatus + ", expiresAt=" + dateTime + ")";
    }

    public FleetStatusResponse(WireFleetStatus status, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.expiresAt = dateTime;
    }

    public /* synthetic */ FleetStatusResponse(WireFleetStatus wireFleetStatus, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new WireFleetStatus(null, null, null, false, null, null, 63, null) : wireFleetStatus, (i & 2) != 0 ? null : dateTime);
    }
}
