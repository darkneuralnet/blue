package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Reservation;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/response/CreateReservationWithIntentResponse;", "", "reservation", "Lco/bird/android/model/Reservation;", "payment", "Lco/bird/api/response/ReservationPaymentResponse;", "(Lco/bird/android/model/Reservation;Lco/bird/api/response/ReservationPaymentResponse;)V", "getPayment", "()Lco/bird/api/response/ReservationPaymentResponse;", "getReservation", "()Lco/bird/android/model/Reservation;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CreateReservationWithIntentResponse {
    @JsonProperty("payment")
    @InterfaceC41208ft5("payment")
    private final ReservationPaymentResponse payment;
    @JsonProperty("reservation")
    @InterfaceC41208ft5("reservation")
    private final Reservation reservation;

    public CreateReservationWithIntentResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ CreateReservationWithIntentResponse copy$default(CreateReservationWithIntentResponse createReservationWithIntentResponse, Reservation reservation, ReservationPaymentResponse reservationPaymentResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            reservation = createReservationWithIntentResponse.reservation;
        }
        if ((i & 2) != 0) {
            reservationPaymentResponse = createReservationWithIntentResponse.payment;
        }
        return createReservationWithIntentResponse.copy(reservation, reservationPaymentResponse);
    }

    public final Reservation component1() {
        return this.reservation;
    }

    public final ReservationPaymentResponse component2() {
        return this.payment;
    }

    public final CreateReservationWithIntentResponse copy(Reservation reservation, ReservationPaymentResponse reservationPaymentResponse) {
        return new CreateReservationWithIntentResponse(reservation, reservationPaymentResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateReservationWithIntentResponse) {
            CreateReservationWithIntentResponse createReservationWithIntentResponse = (CreateReservationWithIntentResponse) obj;
            return Intrinsics.areEqual(this.reservation, createReservationWithIntentResponse.reservation) && Intrinsics.areEqual(this.payment, createReservationWithIntentResponse.payment);
        }
        return false;
    }

    public final ReservationPaymentResponse getPayment() {
        return this.payment;
    }

    public final Reservation getReservation() {
        return this.reservation;
    }

    public int hashCode() {
        Reservation reservation = this.reservation;
        int hashCode = (reservation == null ? 0 : reservation.hashCode()) * 31;
        ReservationPaymentResponse reservationPaymentResponse = this.payment;
        return hashCode + (reservationPaymentResponse != null ? reservationPaymentResponse.hashCode() : 0);
    }

    public String toString() {
        Reservation reservation = this.reservation;
        ReservationPaymentResponse reservationPaymentResponse = this.payment;
        return "CreateReservationWithIntentResponse(reservation=" + reservation + ", payment=" + reservationPaymentResponse + ")";
    }

    public CreateReservationWithIntentResponse(Reservation reservation, ReservationPaymentResponse reservationPaymentResponse) {
        this.reservation = reservation;
        this.payment = reservationPaymentResponse;
    }

    public /* synthetic */ CreateReservationWithIntentResponse(Reservation reservation, ReservationPaymentResponse reservationPaymentResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : reservation, (i & 2) != 0 ? null : reservationPaymentResponse);
    }
}
