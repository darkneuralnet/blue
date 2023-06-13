package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/api/request/ParkingEvaluationFeedbackBody;", "", "rideId", "", "notes", "(Ljava/lang/String;Ljava/lang/String;)V", "getNotes", "()Ljava/lang/String;", "getRideId", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ParkingEvaluationFeedbackBody {
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    @JsonProperty("ride_id")
    @InterfaceC41208ft5("ride_id")
    private final String rideId;

    public ParkingEvaluationFeedbackBody(String rideId, String notes) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(notes, "notes");
        this.rideId = rideId;
        this.notes = notes;
    }

    public static /* synthetic */ ParkingEvaluationFeedbackBody copy$default(ParkingEvaluationFeedbackBody parkingEvaluationFeedbackBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = parkingEvaluationFeedbackBody.rideId;
        }
        if ((i & 2) != 0) {
            str2 = parkingEvaluationFeedbackBody.notes;
        }
        return parkingEvaluationFeedbackBody.copy(str, str2);
    }

    public final String component1() {
        return this.rideId;
    }

    public final String component2() {
        return this.notes;
    }

    public final ParkingEvaluationFeedbackBody copy(String rideId, String notes) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(notes, "notes");
        return new ParkingEvaluationFeedbackBody(rideId, notes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParkingEvaluationFeedbackBody) {
            ParkingEvaluationFeedbackBody parkingEvaluationFeedbackBody = (ParkingEvaluationFeedbackBody) obj;
            return Intrinsics.areEqual(this.rideId, parkingEvaluationFeedbackBody.rideId) && Intrinsics.areEqual(this.notes, parkingEvaluationFeedbackBody.notes);
        }
        return false;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final String getRideId() {
        return this.rideId;
    }

    public int hashCode() {
        return (this.rideId.hashCode() * 31) + this.notes.hashCode();
    }

    public String toString() {
        String str = this.rideId;
        String str2 = this.notes;
        return "ParkingEvaluationFeedbackBody(rideId=" + str + ", notes=" + str2 + ")";
    }
}
