package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m28432d2 = {"Lco/bird/api/request/ScheduleLongTermRentalBody;", "", "deliveryWindowId", "", "planId", "location", "Lco/bird/api/request/DeliveryLocationBody;", "birdCare", "", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/DeliveryLocationBody;Z)V", "getBirdCare", "()Z", "getDeliveryWindowId", "()Ljava/lang/String;", "getLocation", "()Lco/bird/api/request/DeliveryLocationBody;", "getPlanId", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ScheduleLongTermRentalBody {
    @JsonProperty("bird_care")
    @InterfaceC41208ft5("bird_care")
    private final boolean birdCare;
    @JsonProperty("delivery_window_id")
    @InterfaceC41208ft5("delivery_window_id")
    private final String deliveryWindowId;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final DeliveryLocationBody location;
    @JsonProperty("plan_id")
    @InterfaceC41208ft5("plan_id")
    private final String planId;

    public ScheduleLongTermRentalBody(String deliveryWindowId, String planId, DeliveryLocationBody deliveryLocationBody, boolean z) {
        Intrinsics.checkNotNullParameter(deliveryWindowId, "deliveryWindowId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.deliveryWindowId = deliveryWindowId;
        this.planId = planId;
        this.location = deliveryLocationBody;
        this.birdCare = z;
    }

    public static /* synthetic */ ScheduleLongTermRentalBody copy$default(ScheduleLongTermRentalBody scheduleLongTermRentalBody, String str, String str2, DeliveryLocationBody deliveryLocationBody, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scheduleLongTermRentalBody.deliveryWindowId;
        }
        if ((i & 2) != 0) {
            str2 = scheduleLongTermRentalBody.planId;
        }
        if ((i & 4) != 0) {
            deliveryLocationBody = scheduleLongTermRentalBody.location;
        }
        if ((i & 8) != 0) {
            z = scheduleLongTermRentalBody.birdCare;
        }
        return scheduleLongTermRentalBody.copy(str, str2, deliveryLocationBody, z);
    }

    public final String component1() {
        return this.deliveryWindowId;
    }

    public final String component2() {
        return this.planId;
    }

    public final DeliveryLocationBody component3() {
        return this.location;
    }

    public final boolean component4() {
        return this.birdCare;
    }

    public final ScheduleLongTermRentalBody copy(String deliveryWindowId, String planId, DeliveryLocationBody deliveryLocationBody, boolean z) {
        Intrinsics.checkNotNullParameter(deliveryWindowId, "deliveryWindowId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        return new ScheduleLongTermRentalBody(deliveryWindowId, planId, deliveryLocationBody, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScheduleLongTermRentalBody) {
            ScheduleLongTermRentalBody scheduleLongTermRentalBody = (ScheduleLongTermRentalBody) obj;
            return Intrinsics.areEqual(this.deliveryWindowId, scheduleLongTermRentalBody.deliveryWindowId) && Intrinsics.areEqual(this.planId, scheduleLongTermRentalBody.planId) && Intrinsics.areEqual(this.location, scheduleLongTermRentalBody.location) && this.birdCare == scheduleLongTermRentalBody.birdCare;
        }
        return false;
    }

    public final boolean getBirdCare() {
        return this.birdCare;
    }

    public final String getDeliveryWindowId() {
        return this.deliveryWindowId;
    }

    public final DeliveryLocationBody getLocation() {
        return this.location;
    }

    public final String getPlanId() {
        return this.planId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.deliveryWindowId.hashCode() * 31) + this.planId.hashCode()) * 31;
        DeliveryLocationBody deliveryLocationBody = this.location;
        int hashCode2 = (hashCode + (deliveryLocationBody == null ? 0 : deliveryLocationBody.hashCode())) * 31;
        boolean z = this.birdCare;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.deliveryWindowId;
        String str2 = this.planId;
        DeliveryLocationBody deliveryLocationBody = this.location;
        boolean z = this.birdCare;
        return "ScheduleLongTermRentalBody(deliveryWindowId=" + str + ", planId=" + str2 + ", location=" + deliveryLocationBody + ", birdCare=" + z + ")";
    }

    public /* synthetic */ ScheduleLongTermRentalBody(String str, String str2, DeliveryLocationBody deliveryLocationBody, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : deliveryLocationBody, z);
    }
}
