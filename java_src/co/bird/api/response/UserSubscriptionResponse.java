package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, m28432d2 = {"Lco/bird/api/response/UserSubscriptionResponse;", "", "id", "", "subscriptionPlanId", "billingLocation", "Lco/bird/android/model/wire/WireLocation;", "recurringCanceledAt", "Lorg/joda/time/DateTime;", "createdAt", "updatedAt", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getBillingLocation", "()Lco/bird/android/model/wire/WireLocation;", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/lang/String;", "getRecurringCanceledAt", "getSubscriptionPlanId", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class UserSubscriptionResponse {
    @JsonProperty("billing_location")
    @InterfaceC41208ft5("billing_location")
    private final WireLocation billingLocation;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68231id;
    @JsonProperty("recurring_canceled_at")
    @InterfaceC41208ft5("recurring_canceled_at")
    private final DateTime recurringCanceledAt;
    @JsonProperty("subscription_plan_id")
    @InterfaceC41208ft5("subscription_plan_id")
    private final String subscriptionPlanId;
    @JsonProperty("updated_at")
    @InterfaceC41208ft5("updated_at")
    private final DateTime updatedAt;

    public UserSubscriptionResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ UserSubscriptionResponse copy$default(UserSubscriptionResponse userSubscriptionResponse, String str, String str2, WireLocation wireLocation, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userSubscriptionResponse.f68231id;
        }
        if ((i & 2) != 0) {
            str2 = userSubscriptionResponse.subscriptionPlanId;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            wireLocation = userSubscriptionResponse.billingLocation;
        }
        WireLocation wireLocation2 = wireLocation;
        if ((i & 8) != 0) {
            dateTime = userSubscriptionResponse.recurringCanceledAt;
        }
        DateTime dateTime4 = dateTime;
        if ((i & 16) != 0) {
            dateTime2 = userSubscriptionResponse.createdAt;
        }
        DateTime dateTime5 = dateTime2;
        if ((i & 32) != 0) {
            dateTime3 = userSubscriptionResponse.updatedAt;
        }
        return userSubscriptionResponse.copy(str, str3, wireLocation2, dateTime4, dateTime5, dateTime3);
    }

    public final String component1() {
        return this.f68231id;
    }

    public final String component2() {
        return this.subscriptionPlanId;
    }

    public final WireLocation component3() {
        return this.billingLocation;
    }

    public final DateTime component4() {
        return this.recurringCanceledAt;
    }

    public final DateTime component5() {
        return this.createdAt;
    }

    public final DateTime component6() {
        return this.updatedAt;
    }

    public final UserSubscriptionResponse copy(String id, String subscriptionPlanId, WireLocation billingLocation, DateTime dateTime, DateTime dateTime2, DateTime dateTime3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(subscriptionPlanId, "subscriptionPlanId");
        Intrinsics.checkNotNullParameter(billingLocation, "billingLocation");
        return new UserSubscriptionResponse(id, subscriptionPlanId, billingLocation, dateTime, dateTime2, dateTime3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserSubscriptionResponse) {
            UserSubscriptionResponse userSubscriptionResponse = (UserSubscriptionResponse) obj;
            return Intrinsics.areEqual(this.f68231id, userSubscriptionResponse.f68231id) && Intrinsics.areEqual(this.subscriptionPlanId, userSubscriptionResponse.subscriptionPlanId) && Intrinsics.areEqual(this.billingLocation, userSubscriptionResponse.billingLocation) && Intrinsics.areEqual(this.recurringCanceledAt, userSubscriptionResponse.recurringCanceledAt) && Intrinsics.areEqual(this.createdAt, userSubscriptionResponse.createdAt) && Intrinsics.areEqual(this.updatedAt, userSubscriptionResponse.updatedAt);
        }
        return false;
    }

    public final WireLocation getBillingLocation() {
        return this.billingLocation;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f68231id;
    }

    public final DateTime getRecurringCanceledAt() {
        return this.recurringCanceledAt;
    }

    public final String getSubscriptionPlanId() {
        return this.subscriptionPlanId;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode = ((((this.f68231id.hashCode() * 31) + this.subscriptionPlanId.hashCode()) * 31) + this.billingLocation.hashCode()) * 31;
        DateTime dateTime = this.recurringCanceledAt;
        int hashCode2 = (hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.createdAt;
        int hashCode3 = (hashCode2 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.updatedAt;
        return hashCode3 + (dateTime3 != null ? dateTime3.hashCode() : 0);
    }

    public String toString() {
        String str = this.f68231id;
        String str2 = this.subscriptionPlanId;
        WireLocation wireLocation = this.billingLocation;
        DateTime dateTime = this.recurringCanceledAt;
        DateTime dateTime2 = this.createdAt;
        DateTime dateTime3 = this.updatedAt;
        return "UserSubscriptionResponse(id=" + str + ", subscriptionPlanId=" + str2 + ", billingLocation=" + wireLocation + ", recurringCanceledAt=" + dateTime + ", createdAt=" + dateTime2 + ", updatedAt=" + dateTime3 + ")";
    }

    public UserSubscriptionResponse(String id, String subscriptionPlanId, WireLocation billingLocation, DateTime dateTime, DateTime dateTime2, DateTime dateTime3) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(subscriptionPlanId, "subscriptionPlanId");
        Intrinsics.checkNotNullParameter(billingLocation, "billingLocation");
        this.f68231id = id;
        this.subscriptionPlanId = subscriptionPlanId;
        this.billingLocation = billingLocation;
        this.recurringCanceledAt = dateTime;
        this.createdAt = dateTime2;
        this.updatedAt = dateTime3;
    }

    public /* synthetic */ UserSubscriptionResponse(String str, String str2, WireLocation wireLocation, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? new WireLocation(0.0d, 0.0d, null, null, null, null, false, null, null, 511, null) : wireLocation, (i & 8) != 0 ? null : dateTime, (i & 16) != 0 ? null : dateTime2, (i & 32) == 0 ? dateTime3 : null);
    }
}
