package co.bird.android.model;

import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.RentalKind;
import co.bird.android.model.constant.RentalStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B·\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0002\u0010\u001cJ\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0010HÆ\u0003J\t\u00109\u001a\u00020\u0012HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010>\u001a\u00020\u001bHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010C\u001a\u00020\u0007HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u000eHÆ\u0003J¿\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001bHÆ\u0001J\u0013\u0010H\u001a\u00020\u00102\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020KHÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0016\u0010\u001a\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010+R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\"¨\u0006M"}, m28432d2 = {"Lco/bird/android/model/CurrentRental;", "", "id", "", "deliveryWindow", "Lco/bird/android/model/DeliveryWindow;", "pickupAt", "Lorg/joda/time/DateTime;", "canceledAt", "endedAt", "createdAt", "updatedAt", "privateBirdId", "location", "Lco/bird/android/model/DeliveryLocation;", "cancelable", "", "status", "Lco/bird/android/model/constant/RentalStatus;", "plan", "Lco/bird/android/model/RentalPlan;", "kind", "Lco/bird/android/model/constant/RentalKind;", "birdModel", "Lco/bird/android/model/constant/BirdModel;", "completedAt", "currentRentalPeriod", "Lco/bird/android/model/RentalPeriod;", "(Ljava/lang/String;Lco/bird/android/model/DeliveryWindow;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Lco/bird/android/model/DeliveryLocation;ZLco/bird/android/model/constant/RentalStatus;Lco/bird/android/model/RentalPlan;Lco/bird/android/model/constant/RentalKind;Lco/bird/android/model/constant/BirdModel;Lorg/joda/time/DateTime;Lco/bird/android/model/RentalPeriod;)V", "getBirdModel", "()Lco/bird/android/model/constant/BirdModel;", "getCancelable", "()Z", "getCanceledAt", "()Lorg/joda/time/DateTime;", "getCompletedAt", "getCreatedAt", "getCurrentRentalPeriod", "()Lco/bird/android/model/RentalPeriod;", "getDeliveryWindow", "()Lco/bird/android/model/DeliveryWindow;", "getEndedAt", "getId", "()Ljava/lang/String;", "getKind", "()Lco/bird/android/model/constant/RentalKind;", "getLocation", "()Lco/bird/android/model/DeliveryLocation;", "getPickupAt", "getPlan", "()Lco/bird/android/model/RentalPlan;", "getPrivateBirdId", "getStatus", "()Lco/bird/android/model/constant/RentalStatus;", "getUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CurrentRental {
    @JsonProperty("bird_model")
    @InterfaceC41208ft5("bird_model")
    private final BirdModel birdModel;
    @JsonProperty("cancelable")
    @InterfaceC41208ft5("cancelable")
    private final boolean cancelable;
    @JsonProperty("canceled_at")
    @InterfaceC41208ft5("canceled_at")
    private final DateTime canceledAt;
    @JsonProperty("completed_at")
    @InterfaceC41208ft5("completed_at")
    private final DateTime completedAt;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("current_rental_period")
    @InterfaceC41208ft5("current_rental_period")
    private final RentalPeriod currentRentalPeriod;
    @JsonProperty("delivery_window")
    @InterfaceC41208ft5("delivery_window")
    private final DeliveryWindow deliveryWindow;
    @JsonProperty("ended_at")
    @InterfaceC41208ft5("ended_at")
    private final DateTime endedAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66583id;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final RentalKind kind;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final DeliveryLocation location;
    @JsonProperty("pickup_at")
    @InterfaceC41208ft5("pickup_at")
    private final DateTime pickupAt;
    @JsonProperty("plan")
    @InterfaceC41208ft5("plan")
    private final RentalPlan plan;
    @JsonProperty("private_bird_id")
    @InterfaceC41208ft5("private_bird_id")
    private final String privateBirdId;
    @JsonProperty("status")
    @InterfaceC41208ft5("status")
    private final RentalStatus status;
    @JsonProperty("updated_at")
    @InterfaceC41208ft5("updated_at")
    private final DateTime updatedAt;

    public CurrentRental(String id, DeliveryWindow deliveryWindow, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime createdAt, DateTime dateTime4, String str, DeliveryLocation deliveryLocation, boolean z, RentalStatus status, RentalPlan rentalPlan, RentalKind rentalKind, BirdModel birdModel, DateTime dateTime5, RentalPeriod currentRentalPeriod) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(currentRentalPeriod, "currentRentalPeriod");
        this.f66583id = id;
        this.deliveryWindow = deliveryWindow;
        this.pickupAt = dateTime;
        this.canceledAt = dateTime2;
        this.endedAt = dateTime3;
        this.createdAt = createdAt;
        this.updatedAt = dateTime4;
        this.privateBirdId = str;
        this.location = deliveryLocation;
        this.cancelable = z;
        this.status = status;
        this.plan = rentalPlan;
        this.kind = rentalKind;
        this.birdModel = birdModel;
        this.completedAt = dateTime5;
        this.currentRentalPeriod = currentRentalPeriod;
    }

    public final String component1() {
        return this.f66583id;
    }

    public final boolean component10() {
        return this.cancelable;
    }

    public final RentalStatus component11() {
        return this.status;
    }

    public final RentalPlan component12() {
        return this.plan;
    }

    public final RentalKind component13() {
        return this.kind;
    }

    public final BirdModel component14() {
        return this.birdModel;
    }

    public final DateTime component15() {
        return this.completedAt;
    }

    public final RentalPeriod component16() {
        return this.currentRentalPeriod;
    }

    public final DeliveryWindow component2() {
        return this.deliveryWindow;
    }

    public final DateTime component3() {
        return this.pickupAt;
    }

    public final DateTime component4() {
        return this.canceledAt;
    }

    public final DateTime component5() {
        return this.endedAt;
    }

    public final DateTime component6() {
        return this.createdAt;
    }

    public final DateTime component7() {
        return this.updatedAt;
    }

    public final String component8() {
        return this.privateBirdId;
    }

    public final DeliveryLocation component9() {
        return this.location;
    }

    public final CurrentRental copy(String id, DeliveryWindow deliveryWindow, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime createdAt, DateTime dateTime4, String str, DeliveryLocation deliveryLocation, boolean z, RentalStatus status, RentalPlan rentalPlan, RentalKind rentalKind, BirdModel birdModel, DateTime dateTime5, RentalPeriod currentRentalPeriod) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(currentRentalPeriod, "currentRentalPeriod");
        return new CurrentRental(id, deliveryWindow, dateTime, dateTime2, dateTime3, createdAt, dateTime4, str, deliveryLocation, z, status, rentalPlan, rentalKind, birdModel, dateTime5, currentRentalPeriod);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CurrentRental) {
            CurrentRental currentRental = (CurrentRental) obj;
            return Intrinsics.areEqual(this.f66583id, currentRental.f66583id) && Intrinsics.areEqual(this.deliveryWindow, currentRental.deliveryWindow) && Intrinsics.areEqual(this.pickupAt, currentRental.pickupAt) && Intrinsics.areEqual(this.canceledAt, currentRental.canceledAt) && Intrinsics.areEqual(this.endedAt, currentRental.endedAt) && Intrinsics.areEqual(this.createdAt, currentRental.createdAt) && Intrinsics.areEqual(this.updatedAt, currentRental.updatedAt) && Intrinsics.areEqual(this.privateBirdId, currentRental.privateBirdId) && Intrinsics.areEqual(this.location, currentRental.location) && this.cancelable == currentRental.cancelable && this.status == currentRental.status && Intrinsics.areEqual(this.plan, currentRental.plan) && this.kind == currentRental.kind && this.birdModel == currentRental.birdModel && Intrinsics.areEqual(this.completedAt, currentRental.completedAt) && Intrinsics.areEqual(this.currentRentalPeriod, currentRental.currentRentalPeriod);
        }
        return false;
    }

    public final BirdModel getBirdModel() {
        return this.birdModel;
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    public final DateTime getCanceledAt() {
        return this.canceledAt;
    }

    public final DateTime getCompletedAt() {
        return this.completedAt;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final RentalPeriod getCurrentRentalPeriod() {
        return this.currentRentalPeriod;
    }

    public final DeliveryWindow getDeliveryWindow() {
        return this.deliveryWindow;
    }

    public final DateTime getEndedAt() {
        return this.endedAt;
    }

    public final String getId() {
        return this.f66583id;
    }

    public final RentalKind getKind() {
        return this.kind;
    }

    public final DeliveryLocation getLocation() {
        return this.location;
    }

    public final DateTime getPickupAt() {
        return this.pickupAt;
    }

    public final RentalPlan getPlan() {
        return this.plan;
    }

    public final String getPrivateBirdId() {
        return this.privateBirdId;
    }

    public final RentalStatus getStatus() {
        return this.status;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66583id.hashCode() * 31;
        DeliveryWindow deliveryWindow = this.deliveryWindow;
        int hashCode2 = (hashCode + (deliveryWindow == null ? 0 : deliveryWindow.hashCode())) * 31;
        DateTime dateTime = this.pickupAt;
        int hashCode3 = (hashCode2 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.canceledAt;
        int hashCode4 = (hashCode3 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.endedAt;
        int hashCode5 = (((hashCode4 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31) + this.createdAt.hashCode()) * 31;
        DateTime dateTime4 = this.updatedAt;
        int hashCode6 = (hashCode5 + (dateTime4 == null ? 0 : dateTime4.hashCode())) * 31;
        String str = this.privateBirdId;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        DeliveryLocation deliveryLocation = this.location;
        int hashCode8 = (hashCode7 + (deliveryLocation == null ? 0 : deliveryLocation.hashCode())) * 31;
        boolean z = this.cancelable;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode9 = (((hashCode8 + i) * 31) + this.status.hashCode()) * 31;
        RentalPlan rentalPlan = this.plan;
        int hashCode10 = (hashCode9 + (rentalPlan == null ? 0 : rentalPlan.hashCode())) * 31;
        RentalKind rentalKind = this.kind;
        int hashCode11 = (hashCode10 + (rentalKind == null ? 0 : rentalKind.hashCode())) * 31;
        BirdModel birdModel = this.birdModel;
        int hashCode12 = (hashCode11 + (birdModel == null ? 0 : birdModel.hashCode())) * 31;
        DateTime dateTime5 = this.completedAt;
        return ((hashCode12 + (dateTime5 != null ? dateTime5.hashCode() : 0)) * 31) + this.currentRentalPeriod.hashCode();
    }

    public String toString() {
        String str = this.f66583id;
        DeliveryWindow deliveryWindow = this.deliveryWindow;
        DateTime dateTime = this.pickupAt;
        DateTime dateTime2 = this.canceledAt;
        DateTime dateTime3 = this.endedAt;
        DateTime dateTime4 = this.createdAt;
        DateTime dateTime5 = this.updatedAt;
        String str2 = this.privateBirdId;
        DeliveryLocation deliveryLocation = this.location;
        boolean z = this.cancelable;
        RentalStatus rentalStatus = this.status;
        RentalPlan rentalPlan = this.plan;
        RentalKind rentalKind = this.kind;
        BirdModel birdModel = this.birdModel;
        DateTime dateTime6 = this.completedAt;
        RentalPeriod rentalPeriod = this.currentRentalPeriod;
        return "CurrentRental(id=" + str + ", deliveryWindow=" + deliveryWindow + ", pickupAt=" + dateTime + ", canceledAt=" + dateTime2 + ", endedAt=" + dateTime3 + ", createdAt=" + dateTime4 + ", updatedAt=" + dateTime5 + ", privateBirdId=" + str2 + ", location=" + deliveryLocation + ", cancelable=" + z + ", status=" + rentalStatus + ", plan=" + rentalPlan + ", kind=" + rentalKind + ", birdModel=" + birdModel + ", completedAt=" + dateTime6 + ", currentRentalPeriod=" + rentalPeriod + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CurrentRental(String str, DeliveryWindow deliveryWindow, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, DateTime dateTime5, String str2, DeliveryLocation deliveryLocation, boolean z, RentalStatus rentalStatus, RentalPlan rentalPlan, RentalKind rentalKind, BirdModel birdModel, DateTime dateTime6, RentalPeriod rentalPeriod, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, r6, r7, r8, (i & 64) != 0 ? null : dateTime5, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : deliveryLocation, (i & 512) != 0 ? false : z, rentalStatus, (i & 2048) != 0 ? null : rentalPlan, (i & 4096) != 0 ? null : rentalKind, (i & 8192) != 0 ? null : birdModel, (i & 16384) != 0 ? null : dateTime6, rentalPeriod);
        DateTime dateTime7;
        String str3 = (i & 1) != 0 ? "" : str;
        DeliveryWindow deliveryWindow2 = (i & 2) != 0 ? null : deliveryWindow;
        DateTime dateTime8 = (i & 4) != 0 ? null : dateTime;
        DateTime dateTime9 = (i & 8) != 0 ? null : dateTime2;
        DateTime dateTime10 = (i & 16) != 0 ? null : dateTime3;
        if ((i & 32) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime7 = now;
        } else {
            dateTime7 = dateTime4;
        }
    }
}
