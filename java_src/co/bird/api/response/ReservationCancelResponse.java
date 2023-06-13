package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Reservation;
import co.bird.android.model.ReservationIssueOption;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/api/response/ReservationCancelResponse;", "", "reservation", "Lco/bird/android/model/Reservation;", "reservationIssues", "", "Lco/bird/android/model/ReservationIssueOption;", "(Lco/bird/android/model/Reservation;Ljava/util/List;)V", "getReservation", "()Lco/bird/android/model/Reservation;", "getReservationIssues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ReservationCancelResponse {
    @JsonProperty("wire_reservation")
    @InterfaceC41208ft5("wire_reservation")
    private final Reservation reservation;
    @JsonProperty("reservation_issues")
    @InterfaceC41208ft5("reservation_issues")
    private final List<ReservationIssueOption> reservationIssues;

    public ReservationCancelResponse(Reservation reservation, List<ReservationIssueOption> reservationIssues) {
        Intrinsics.checkNotNullParameter(reservation, "reservation");
        Intrinsics.checkNotNullParameter(reservationIssues, "reservationIssues");
        this.reservation = reservation;
        this.reservationIssues = reservationIssues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReservationCancelResponse copy$default(ReservationCancelResponse reservationCancelResponse, Reservation reservation, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            reservation = reservationCancelResponse.reservation;
        }
        if ((i & 2) != 0) {
            list = reservationCancelResponse.reservationIssues;
        }
        return reservationCancelResponse.copy(reservation, list);
    }

    public final Reservation component1() {
        return this.reservation;
    }

    public final List<ReservationIssueOption> component2() {
        return this.reservationIssues;
    }

    public final ReservationCancelResponse copy(Reservation reservation, List<ReservationIssueOption> reservationIssues) {
        Intrinsics.checkNotNullParameter(reservation, "reservation");
        Intrinsics.checkNotNullParameter(reservationIssues, "reservationIssues");
        return new ReservationCancelResponse(reservation, reservationIssues);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReservationCancelResponse) {
            ReservationCancelResponse reservationCancelResponse = (ReservationCancelResponse) obj;
            return Intrinsics.areEqual(this.reservation, reservationCancelResponse.reservation) && Intrinsics.areEqual(this.reservationIssues, reservationCancelResponse.reservationIssues);
        }
        return false;
    }

    public final Reservation getReservation() {
        return this.reservation;
    }

    public final List<ReservationIssueOption> getReservationIssues() {
        return this.reservationIssues;
    }

    public int hashCode() {
        return (this.reservation.hashCode() * 31) + this.reservationIssues.hashCode();
    }

    public String toString() {
        Reservation reservation = this.reservation;
        List<ReservationIssueOption> list = this.reservationIssues;
        return "ReservationCancelResponse(reservation=" + reservation + ", reservationIssues=" + list + ")";
    }

    public /* synthetic */ ReservationCancelResponse(Reservation reservation, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reservation, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
