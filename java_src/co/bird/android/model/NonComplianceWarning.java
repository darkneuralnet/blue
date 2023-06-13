package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jt\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0007HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, m28432d2 = {"Lco/bird/android/model/NonComplianceWarning;", "", "id", "", "userId", "rideId", "amount", "", "currency", "location", "Lco/bird/android/model/Point;", "warningKind", "Lco/bird/android/model/NonComplianceWarningKind;", "createdAt", "Lorg/joda/time/DateTime;", "updatedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/Point;Lco/bird/android/model/NonComplianceWarningKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getCurrency", "()Ljava/lang/String;", "getId", "getLocation", "()Lco/bird/android/model/Point;", "getRideId", "getUpdatedAt", "getUserId", "getWarningKind", "()Lco/bird/android/model/NonComplianceWarningKind;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lco/bird/android/model/Point;Lco/bird/android/model/NonComplianceWarningKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lco/bird/android/model/NonComplianceWarning;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NonComplianceWarning {
    @JsonProperty("amount")
    @InterfaceC41208ft5("amount")
    private final Integer amount;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66606id;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final Point location;
    @JsonProperty("ride_id")
    @InterfaceC41208ft5("ride_id")
    private final String rideId;
    @JsonProperty("updated_at")
    @InterfaceC41208ft5("updated_at")
    private final DateTime updatedAt;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;
    @JsonProperty("warning_kind")
    @InterfaceC41208ft5("warning_kind")
    private final NonComplianceWarningKind warningKind;

    public NonComplianceWarning(String id, String userId, String str, Integer num, String str2, Point point, NonComplianceWarningKind warningKind, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(warningKind, "warningKind");
        this.f66606id = id;
        this.userId = userId;
        this.rideId = str;
        this.amount = num;
        this.currency = str2;
        this.location = point;
        this.warningKind = warningKind;
        this.createdAt = dateTime;
        this.updatedAt = dateTime2;
    }

    public final String component1() {
        return this.f66606id;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.rideId;
    }

    public final Integer component4() {
        return this.amount;
    }

    public final String component5() {
        return this.currency;
    }

    public final Point component6() {
        return this.location;
    }

    public final NonComplianceWarningKind component7() {
        return this.warningKind;
    }

    public final DateTime component8() {
        return this.createdAt;
    }

    public final DateTime component9() {
        return this.updatedAt;
    }

    public final NonComplianceWarning copy(String id, String userId, String str, Integer num, String str2, Point point, NonComplianceWarningKind warningKind, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(warningKind, "warningKind");
        return new NonComplianceWarning(id, userId, str, num, str2, point, warningKind, dateTime, dateTime2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NonComplianceWarning) {
            NonComplianceWarning nonComplianceWarning = (NonComplianceWarning) obj;
            return Intrinsics.areEqual(this.f66606id, nonComplianceWarning.f66606id) && Intrinsics.areEqual(this.userId, nonComplianceWarning.userId) && Intrinsics.areEqual(this.rideId, nonComplianceWarning.rideId) && Intrinsics.areEqual(this.amount, nonComplianceWarning.amount) && Intrinsics.areEqual(this.currency, nonComplianceWarning.currency) && Intrinsics.areEqual(this.location, nonComplianceWarning.location) && this.warningKind == nonComplianceWarning.warningKind && Intrinsics.areEqual(this.createdAt, nonComplianceWarning.createdAt) && Intrinsics.areEqual(this.updatedAt, nonComplianceWarning.updatedAt);
        }
        return false;
    }

    public final Integer getAmount() {
        return this.amount;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getId() {
        return this.f66606id;
    }

    public final Point getLocation() {
        return this.location;
    }

    public final String getRideId() {
        return this.rideId;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final NonComplianceWarningKind getWarningKind() {
        return this.warningKind;
    }

    public int hashCode() {
        int hashCode = ((this.f66606id.hashCode() * 31) + this.userId.hashCode()) * 31;
        String str = this.rideId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.amount;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.currency;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Point point = this.location;
        int hashCode5 = (((hashCode4 + (point == null ? 0 : point.hashCode())) * 31) + this.warningKind.hashCode()) * 31;
        DateTime dateTime = this.createdAt;
        int hashCode6 = (hashCode5 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.updatedAt;
        return hashCode6 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66606id;
        String str2 = this.userId;
        String str3 = this.rideId;
        Integer num = this.amount;
        String str4 = this.currency;
        Point point = this.location;
        NonComplianceWarningKind nonComplianceWarningKind = this.warningKind;
        DateTime dateTime = this.createdAt;
        DateTime dateTime2 = this.updatedAt;
        return "NonComplianceWarning(id=" + str + ", userId=" + str2 + ", rideId=" + str3 + ", amount=" + num + ", currency=" + str4 + ", location=" + point + ", warningKind=" + nonComplianceWarningKind + ", createdAt=" + dateTime + ", updatedAt=" + dateTime2 + ")";
    }

    public /* synthetic */ NonComplianceWarning(String str, String str2, String str3, Integer num, String str4, Point point, NonComplianceWarningKind nonComplianceWarningKind, DateTime dateTime, DateTime dateTime2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : point, nonComplianceWarningKind, (i & 128) != 0 ? null : dateTime, (i & 256) != 0 ? null : dateTime2);
    }
}
