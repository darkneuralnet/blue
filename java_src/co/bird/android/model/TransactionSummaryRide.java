package co.bird.android.model;

import co.bird.android.model.wire.WireEndRidePhotoParkingEvaluation;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003Jc\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006)"}, m28432d2 = {"Lco/bird/android/model/TransactionSummaryRide;", "", "id", "", "delivery", "", "deliveryUnlockedAt", "Lorg/joda/time/DateTime;", "payAsYouGo", "canceledAt", "completedAt", "startedAt", "rideEndRidePhotoParkingEvaluation", "Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;", "(Ljava/lang/String;ZLorg/joda/time/DateTime;ZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;)V", "getCanceledAt", "()Lorg/joda/time/DateTime;", "getCompletedAt", "getDelivery", "()Z", "getDeliveryUnlockedAt", "getId", "()Ljava/lang/String;", "getPayAsYouGo", "getRideEndRidePhotoParkingEvaluation", "()Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;", "getStartedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TransactionSummaryRide {
    @JsonProperty("canceled_at")
    @InterfaceC41208ft5("canceled_at")
    private final DateTime canceledAt;
    @JsonProperty("completed_at")
    @InterfaceC41208ft5("completed_at")
    private final DateTime completedAt;
    @JsonProperty("delivery")
    @InterfaceC41208ft5("delivery")
    private final boolean delivery;
    @JsonProperty("delivery_unlocked_at")
    @InterfaceC41208ft5("delivery_unlocked_at")
    private final DateTime deliveryUnlockedAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66629id;
    @JsonProperty("pay_as_you_go")
    @InterfaceC41208ft5("pay_as_you_go")
    private final boolean payAsYouGo;
    @JsonProperty("ride_end_photo_parking_evaluation")
    @InterfaceC41208ft5("ride_end_photo_parking_evaluation")
    private final WireEndRidePhotoParkingEvaluation rideEndRidePhotoParkingEvaluation;
    @JsonProperty("started_at")
    @InterfaceC41208ft5("started_at")
    private final DateTime startedAt;

    public TransactionSummaryRide() {
        this(null, false, null, false, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final String component1() {
        return this.f66629id;
    }

    public final boolean component2() {
        return this.delivery;
    }

    public final DateTime component3() {
        return this.deliveryUnlockedAt;
    }

    public final boolean component4() {
        return this.payAsYouGo;
    }

    public final DateTime component5() {
        return this.canceledAt;
    }

    public final DateTime component6() {
        return this.completedAt;
    }

    public final DateTime component7() {
        return this.startedAt;
    }

    public final WireEndRidePhotoParkingEvaluation component8() {
        return this.rideEndRidePhotoParkingEvaluation;
    }

    public final TransactionSummaryRide copy(String id, boolean z, DateTime dateTime, boolean z2, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new TransactionSummaryRide(id, z, dateTime, z2, dateTime2, dateTime3, dateTime4, wireEndRidePhotoParkingEvaluation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransactionSummaryRide) {
            TransactionSummaryRide transactionSummaryRide = (TransactionSummaryRide) obj;
            return Intrinsics.areEqual(this.f66629id, transactionSummaryRide.f66629id) && this.delivery == transactionSummaryRide.delivery && Intrinsics.areEqual(this.deliveryUnlockedAt, transactionSummaryRide.deliveryUnlockedAt) && this.payAsYouGo == transactionSummaryRide.payAsYouGo && Intrinsics.areEqual(this.canceledAt, transactionSummaryRide.canceledAt) && Intrinsics.areEqual(this.completedAt, transactionSummaryRide.completedAt) && Intrinsics.areEqual(this.startedAt, transactionSummaryRide.startedAt) && Intrinsics.areEqual(this.rideEndRidePhotoParkingEvaluation, transactionSummaryRide.rideEndRidePhotoParkingEvaluation);
        }
        return false;
    }

    public final DateTime getCanceledAt() {
        return this.canceledAt;
    }

    public final DateTime getCompletedAt() {
        return this.completedAt;
    }

    public final boolean getDelivery() {
        return this.delivery;
    }

    public final DateTime getDeliveryUnlockedAt() {
        return this.deliveryUnlockedAt;
    }

    public final String getId() {
        return this.f66629id;
    }

    public final boolean getPayAsYouGo() {
        return this.payAsYouGo;
    }

    public final WireEndRidePhotoParkingEvaluation getRideEndRidePhotoParkingEvaluation() {
        return this.rideEndRidePhotoParkingEvaluation;
    }

    public final DateTime getStartedAt() {
        return this.startedAt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66629id.hashCode() * 31;
        boolean z = this.delivery;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        DateTime dateTime = this.deliveryUnlockedAt;
        int hashCode2 = (i2 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        boolean z2 = this.payAsYouGo;
        int i3 = (hashCode2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        DateTime dateTime2 = this.canceledAt;
        int hashCode3 = (i3 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.completedAt;
        int hashCode4 = (hashCode3 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        DateTime dateTime4 = this.startedAt;
        int hashCode5 = (hashCode4 + (dateTime4 == null ? 0 : dateTime4.hashCode())) * 31;
        WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation = this.rideEndRidePhotoParkingEvaluation;
        return hashCode5 + (wireEndRidePhotoParkingEvaluation != null ? wireEndRidePhotoParkingEvaluation.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66629id;
        boolean z = this.delivery;
        DateTime dateTime = this.deliveryUnlockedAt;
        boolean z2 = this.payAsYouGo;
        DateTime dateTime2 = this.canceledAt;
        DateTime dateTime3 = this.completedAt;
        DateTime dateTime4 = this.startedAt;
        WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation = this.rideEndRidePhotoParkingEvaluation;
        return "TransactionSummaryRide(id=" + str + ", delivery=" + z + ", deliveryUnlockedAt=" + dateTime + ", payAsYouGo=" + z2 + ", canceledAt=" + dateTime2 + ", completedAt=" + dateTime3 + ", startedAt=" + dateTime4 + ", rideEndRidePhotoParkingEvaluation=" + wireEndRidePhotoParkingEvaluation + ")";
    }

    public TransactionSummaryRide(String id, boolean z, DateTime dateTime, boolean z2, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f66629id = id;
        this.delivery = z;
        this.deliveryUnlockedAt = dateTime;
        this.payAsYouGo = z2;
        this.canceledAt = dateTime2;
        this.completedAt = dateTime3;
        this.startedAt = dateTime4;
        this.rideEndRidePhotoParkingEvaluation = wireEndRidePhotoParkingEvaluation;
    }

    public /* synthetic */ TransactionSummaryRide(String str, boolean z, DateTime dateTime, boolean z2, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : dateTime, (i & 8) == 0 ? z2 : false, (i & 16) != 0 ? null : dateTime2, (i & 32) != 0 ? null : dateTime3, (i & 64) != 0 ? null : dateTime4, (i & 128) == 0 ? wireEndRidePhotoParkingEvaluation : null);
    }
}
