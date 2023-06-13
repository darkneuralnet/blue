package co.bird.android.model;

import co.bird.android.model.constant.RideType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JN\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, m28432d2 = {"Lco/bird/android/model/TestRideDetail;", "", "id", "", "birdId", "startedAt", "Lorg/joda/time/DateTime;", "completedAt", "success", "", "type", "Lco/bird/android/model/constant/RideType;", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Lco/bird/android/model/constant/RideType;)V", "getBirdId", "()Ljava/lang/String;", "getCompletedAt", "()Lorg/joda/time/DateTime;", "getId", "getStartedAt", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getType", "()Lco/bird/android/model/constant/RideType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Lco/bird/android/model/constant/RideType;)Lco/bird/android/model/TestRideDetail;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TestRideDetail {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("completed_at")
    @InterfaceC41208ft5("completed_at")
    private final DateTime completedAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66627id;
    @JsonProperty("started_at")
    @InterfaceC41208ft5("started_at")
    private final DateTime startedAt;
    @JsonProperty("success")
    @InterfaceC41208ft5("success")
    private final Boolean success;
    @JsonProperty("type")
    @InterfaceC41208ft5("type")
    private final RideType type;

    public TestRideDetail(String id, String birdId, DateTime startedAt, DateTime dateTime, Boolean bool, RideType type) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(startedAt, "startedAt");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f66627id = id;
        this.birdId = birdId;
        this.startedAt = startedAt;
        this.completedAt = dateTime;
        this.success = bool;
        this.type = type;
    }

    public static /* synthetic */ TestRideDetail copy$default(TestRideDetail testRideDetail, String str, String str2, DateTime dateTime, DateTime dateTime2, Boolean bool, RideType rideType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = testRideDetail.f66627id;
        }
        if ((i & 2) != 0) {
            str2 = testRideDetail.birdId;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            dateTime = testRideDetail.startedAt;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 8) != 0) {
            dateTime2 = testRideDetail.completedAt;
        }
        DateTime dateTime4 = dateTime2;
        if ((i & 16) != 0) {
            bool = testRideDetail.success;
        }
        Boolean bool2 = bool;
        if ((i & 32) != 0) {
            rideType = testRideDetail.type;
        }
        return testRideDetail.copy(str, str3, dateTime3, dateTime4, bool2, rideType);
    }

    public final String component1() {
        return this.f66627id;
    }

    public final String component2() {
        return this.birdId;
    }

    public final DateTime component3() {
        return this.startedAt;
    }

    public final DateTime component4() {
        return this.completedAt;
    }

    public final Boolean component5() {
        return this.success;
    }

    public final RideType component6() {
        return this.type;
    }

    public final TestRideDetail copy(String id, String birdId, DateTime startedAt, DateTime dateTime, Boolean bool, RideType type) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(startedAt, "startedAt");
        Intrinsics.checkNotNullParameter(type, "type");
        return new TestRideDetail(id, birdId, startedAt, dateTime, bool, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TestRideDetail) {
            TestRideDetail testRideDetail = (TestRideDetail) obj;
            return Intrinsics.areEqual(this.f66627id, testRideDetail.f66627id) && Intrinsics.areEqual(this.birdId, testRideDetail.birdId) && Intrinsics.areEqual(this.startedAt, testRideDetail.startedAt) && Intrinsics.areEqual(this.completedAt, testRideDetail.completedAt) && Intrinsics.areEqual(this.success, testRideDetail.success) && this.type == testRideDetail.type;
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final DateTime getCompletedAt() {
        return this.completedAt;
    }

    public final String getId() {
        return this.f66627id;
    }

    public final DateTime getStartedAt() {
        return this.startedAt;
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public final RideType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((this.f66627id.hashCode() * 31) + this.birdId.hashCode()) * 31) + this.startedAt.hashCode()) * 31;
        DateTime dateTime = this.completedAt;
        int hashCode2 = (hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Boolean bool = this.success;
        return ((hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31) + this.type.hashCode();
    }

    public String toString() {
        String str = this.f66627id;
        String str2 = this.birdId;
        DateTime dateTime = this.startedAt;
        DateTime dateTime2 = this.completedAt;
        Boolean bool = this.success;
        RideType rideType = this.type;
        return "TestRideDetail(id=" + str + ", birdId=" + str2 + ", startedAt=" + dateTime + ", completedAt=" + dateTime2 + ", success=" + bool + ", type=" + rideType + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TestRideDetail(String str, String str2, DateTime dateTime, DateTime dateTime2, Boolean bool, RideType rideType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, (i & 8) != 0 ? null : dateTime2, (i & 16) != 0 ? null : bool, rideType);
        DateTime dateTime3;
        String str3 = (i & 1) != 0 ? "" : str;
        String str4 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime3 = now;
        } else {
            dateTime3 = dateTime;
        }
    }
}
