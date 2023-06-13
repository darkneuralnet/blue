package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.RideStatusField;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006!"}, m28432d2 = {"Lco/bird/api/request/RideStatusBody;", "", "rideId", "", "field", "Lco/bird/android/model/constant/RideStatusField;", "value", "", "distance", "", "correction", "(Ljava/lang/String;Lco/bird/android/model/constant/RideStatusField;ZLjava/lang/Integer;Z)V", "getCorrection", "()Z", "getDistance", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getField", "()Lco/bird/android/model/constant/RideStatusField;", "getRideId", "()Ljava/lang/String;", "getValue", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lco/bird/android/model/constant/RideStatusField;ZLjava/lang/Integer;Z)Lco/bird/api/request/RideStatusBody;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RideStatusBody {
    @JsonProperty("correction")
    @InterfaceC41208ft5("correction")
    private final boolean correction;
    @JsonProperty("distance")
    @InterfaceC41208ft5("distance")
    private final Integer distance;
    @JsonProperty("field")
    @InterfaceC41208ft5("field")
    private final RideStatusField field;
    @JsonProperty("ride_id")
    @InterfaceC41208ft5("ride_id")
    private final String rideId;
    @JsonProperty("value")
    @InterfaceC41208ft5("value")
    private final boolean value;

    public RideStatusBody() {
        this(null, null, false, null, false, 31, null);
    }

    public static /* synthetic */ RideStatusBody copy$default(RideStatusBody rideStatusBody, String str, RideStatusField rideStatusField, boolean z, Integer num, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rideStatusBody.rideId;
        }
        if ((i & 2) != 0) {
            rideStatusField = rideStatusBody.field;
        }
        RideStatusField rideStatusField2 = rideStatusField;
        if ((i & 4) != 0) {
            z = rideStatusBody.value;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            num = rideStatusBody.distance;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            z2 = rideStatusBody.correction;
        }
        return rideStatusBody.copy(str, rideStatusField2, z3, num2, z2);
    }

    public final String component1() {
        return this.rideId;
    }

    public final RideStatusField component2() {
        return this.field;
    }

    public final boolean component3() {
        return this.value;
    }

    public final Integer component4() {
        return this.distance;
    }

    public final boolean component5() {
        return this.correction;
    }

    public final RideStatusBody copy(String rideId, RideStatusField field, boolean z, Integer num, boolean z2) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(field, "field");
        return new RideStatusBody(rideId, field, z, num, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RideStatusBody) {
            RideStatusBody rideStatusBody = (RideStatusBody) obj;
            return Intrinsics.areEqual(this.rideId, rideStatusBody.rideId) && this.field == rideStatusBody.field && this.value == rideStatusBody.value && Intrinsics.areEqual(this.distance, rideStatusBody.distance) && this.correction == rideStatusBody.correction;
        }
        return false;
    }

    public final boolean getCorrection() {
        return this.correction;
    }

    public final Integer getDistance() {
        return this.distance;
    }

    public final RideStatusField getField() {
        return this.field;
    }

    public final String getRideId() {
        return this.rideId;
    }

    public final boolean getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.rideId.hashCode() * 31) + this.field.hashCode()) * 31;
        boolean z = this.value;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Integer num = this.distance;
        int hashCode2 = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z2 = this.correction;
        return hashCode2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        String str = this.rideId;
        RideStatusField rideStatusField = this.field;
        boolean z = this.value;
        Integer num = this.distance;
        boolean z2 = this.correction;
        return "RideStatusBody(rideId=" + str + ", field=" + rideStatusField + ", value=" + z + ", distance=" + num + ", correction=" + z2 + ")";
    }

    public RideStatusBody(String rideId, RideStatusField field, boolean z, Integer num, boolean z2) {
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(field, "field");
        this.rideId = rideId;
        this.field = field;
        this.value = z;
        this.distance = num;
        this.correction = z2;
    }

    public /* synthetic */ RideStatusBody(String str, RideStatusField rideStatusField, boolean z, Integer num, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? RideStatusField.LOCKED : rideStatusField, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : num, (i & 16) != 0 ? false : z2);
    }
}
