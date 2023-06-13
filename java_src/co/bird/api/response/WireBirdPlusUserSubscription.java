package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m28432d2 = {"Lco/bird/api/response/WireBirdPlusUserSubscription;", "", "id", "", "recurringCanceledAt", "Lorg/joda/time/DateTime;", "activity", "Lco/bird/api/response/WireBirdPlusActivity;", "trial", "Lco/bird/api/response/WireSubscriptionPlanTrial;", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/api/response/WireBirdPlusActivity;Lco/bird/api/response/WireSubscriptionPlanTrial;)V", "getActivity", "()Lco/bird/api/response/WireBirdPlusActivity;", "getId", "()Ljava/lang/String;", "getRecurringCanceledAt", "()Lorg/joda/time/DateTime;", "getTrial", "()Lco/bird/api/response/WireSubscriptionPlanTrial;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBirdPlusUserSubscription {
    @JsonProperty("activity")
    @InterfaceC41208ft5("activity")
    private final WireBirdPlusActivity activity;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68234id;
    @JsonProperty("recurring_canceled_at")
    @InterfaceC41208ft5("recurring_canceled_at")
    private final DateTime recurringCanceledAt;
    @JsonProperty("trial")
    @InterfaceC41208ft5("trial")
    private final WireSubscriptionPlanTrial trial;

    public WireBirdPlusUserSubscription() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ WireBirdPlusUserSubscription copy$default(WireBirdPlusUserSubscription wireBirdPlusUserSubscription, String str, DateTime dateTime, WireBirdPlusActivity wireBirdPlusActivity, WireSubscriptionPlanTrial wireSubscriptionPlanTrial, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireBirdPlusUserSubscription.f68234id;
        }
        if ((i & 2) != 0) {
            dateTime = wireBirdPlusUserSubscription.recurringCanceledAt;
        }
        if ((i & 4) != 0) {
            wireBirdPlusActivity = wireBirdPlusUserSubscription.activity;
        }
        if ((i & 8) != 0) {
            wireSubscriptionPlanTrial = wireBirdPlusUserSubscription.trial;
        }
        return wireBirdPlusUserSubscription.copy(str, dateTime, wireBirdPlusActivity, wireSubscriptionPlanTrial);
    }

    public final String component1() {
        return this.f68234id;
    }

    public final DateTime component2() {
        return this.recurringCanceledAt;
    }

    public final WireBirdPlusActivity component3() {
        return this.activity;
    }

    public final WireSubscriptionPlanTrial component4() {
        return this.trial;
    }

    public final WireBirdPlusUserSubscription copy(String str, DateTime dateTime, WireBirdPlusActivity wireBirdPlusActivity, WireSubscriptionPlanTrial wireSubscriptionPlanTrial) {
        return new WireBirdPlusUserSubscription(str, dateTime, wireBirdPlusActivity, wireSubscriptionPlanTrial);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireBirdPlusUserSubscription) {
            WireBirdPlusUserSubscription wireBirdPlusUserSubscription = (WireBirdPlusUserSubscription) obj;
            return Intrinsics.areEqual(this.f68234id, wireBirdPlusUserSubscription.f68234id) && Intrinsics.areEqual(this.recurringCanceledAt, wireBirdPlusUserSubscription.recurringCanceledAt) && Intrinsics.areEqual(this.activity, wireBirdPlusUserSubscription.activity) && Intrinsics.areEqual(this.trial, wireBirdPlusUserSubscription.trial);
        }
        return false;
    }

    public final WireBirdPlusActivity getActivity() {
        return this.activity;
    }

    public final String getId() {
        return this.f68234id;
    }

    public final DateTime getRecurringCanceledAt() {
        return this.recurringCanceledAt;
    }

    public final WireSubscriptionPlanTrial getTrial() {
        return this.trial;
    }

    public int hashCode() {
        String str = this.f68234id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        DateTime dateTime = this.recurringCanceledAt;
        int hashCode2 = (hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        WireBirdPlusActivity wireBirdPlusActivity = this.activity;
        int hashCode3 = (hashCode2 + (wireBirdPlusActivity == null ? 0 : wireBirdPlusActivity.hashCode())) * 31;
        WireSubscriptionPlanTrial wireSubscriptionPlanTrial = this.trial;
        return hashCode3 + (wireSubscriptionPlanTrial != null ? wireSubscriptionPlanTrial.hashCode() : 0);
    }

    public String toString() {
        String str = this.f68234id;
        DateTime dateTime = this.recurringCanceledAt;
        WireBirdPlusActivity wireBirdPlusActivity = this.activity;
        WireSubscriptionPlanTrial wireSubscriptionPlanTrial = this.trial;
        return "WireBirdPlusUserSubscription(id=" + str + ", recurringCanceledAt=" + dateTime + ", activity=" + wireBirdPlusActivity + ", trial=" + wireSubscriptionPlanTrial + ")";
    }

    public WireBirdPlusUserSubscription(String str, DateTime dateTime, WireBirdPlusActivity wireBirdPlusActivity, WireSubscriptionPlanTrial wireSubscriptionPlanTrial) {
        this.f68234id = str;
        this.recurringCanceledAt = dateTime;
        this.activity = wireBirdPlusActivity;
        this.trial = wireSubscriptionPlanTrial;
    }

    public /* synthetic */ WireBirdPlusUserSubscription(String str, DateTime dateTime, WireBirdPlusActivity wireBirdPlusActivity, WireSubscriptionPlanTrial wireSubscriptionPlanTrial, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : dateTime, (i & 4) != 0 ? null : wireBirdPlusActivity, (i & 8) != 0 ? null : wireSubscriptionPlanTrial);
    }
}
