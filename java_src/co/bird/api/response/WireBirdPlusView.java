package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdPlusSubscriptionViewIneligibleReason;
import co.bird.android.model.constant.BirdPlusSubscriptionViewStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m28432d2 = {"Lco/bird/api/response/WireBirdPlusView;", "", "subscriptionPlan", "Lco/bird/api/response/WireBirdPlusSubscriptionPlan;", "userSubscription", "Lco/bird/api/response/WireBirdPlusUserSubscription;", "ineligibleReason", "Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;", "(Lco/bird/api/response/WireBirdPlusSubscriptionPlan;Lco/bird/api/response/WireBirdPlusUserSubscription;Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;)V", "getIneligibleReason", "()Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;", "status", "Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;", "getStatus", "()Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;", "getSubscriptionPlan", "()Lco/bird/api/response/WireBirdPlusSubscriptionPlan;", "getUserSubscription", "()Lco/bird/api/response/WireBirdPlusUserSubscription;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBirdPlusView {
    @JsonProperty("ineligible_reason")
    @InterfaceC41208ft5("ineligible_reason")
    private final BirdPlusSubscriptionViewIneligibleReason ineligibleReason;
    @JsonProperty("subscription_plan")
    @InterfaceC41208ft5("subscription_plan")
    private final WireBirdPlusSubscriptionPlan subscriptionPlan;
    @JsonProperty("user_subscription")
    @InterfaceC41208ft5("user_subscription")
    private final WireBirdPlusUserSubscription userSubscription;

    public WireBirdPlusView() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WireBirdPlusView copy$default(WireBirdPlusView wireBirdPlusView, WireBirdPlusSubscriptionPlan wireBirdPlusSubscriptionPlan, WireBirdPlusUserSubscription wireBirdPlusUserSubscription, BirdPlusSubscriptionViewIneligibleReason birdPlusSubscriptionViewIneligibleReason, int i, Object obj) {
        if ((i & 1) != 0) {
            wireBirdPlusSubscriptionPlan = wireBirdPlusView.subscriptionPlan;
        }
        if ((i & 2) != 0) {
            wireBirdPlusUserSubscription = wireBirdPlusView.userSubscription;
        }
        if ((i & 4) != 0) {
            birdPlusSubscriptionViewIneligibleReason = wireBirdPlusView.ineligibleReason;
        }
        return wireBirdPlusView.copy(wireBirdPlusSubscriptionPlan, wireBirdPlusUserSubscription, birdPlusSubscriptionViewIneligibleReason);
    }

    public final WireBirdPlusSubscriptionPlan component1() {
        return this.subscriptionPlan;
    }

    public final WireBirdPlusUserSubscription component2() {
        return this.userSubscription;
    }

    public final BirdPlusSubscriptionViewIneligibleReason component3() {
        return this.ineligibleReason;
    }

    public final WireBirdPlusView copy(WireBirdPlusSubscriptionPlan wireBirdPlusSubscriptionPlan, WireBirdPlusUserSubscription wireBirdPlusUserSubscription, BirdPlusSubscriptionViewIneligibleReason birdPlusSubscriptionViewIneligibleReason) {
        return new WireBirdPlusView(wireBirdPlusSubscriptionPlan, wireBirdPlusUserSubscription, birdPlusSubscriptionViewIneligibleReason);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireBirdPlusView) {
            WireBirdPlusView wireBirdPlusView = (WireBirdPlusView) obj;
            return Intrinsics.areEqual(this.subscriptionPlan, wireBirdPlusView.subscriptionPlan) && Intrinsics.areEqual(this.userSubscription, wireBirdPlusView.userSubscription) && this.ineligibleReason == wireBirdPlusView.ineligibleReason;
        }
        return false;
    }

    public final BirdPlusSubscriptionViewIneligibleReason getIneligibleReason() {
        return this.ineligibleReason;
    }

    public final BirdPlusSubscriptionViewStatus getStatus() {
        if (this.ineligibleReason != null) {
            return BirdPlusSubscriptionViewStatus.INELIGIBLE;
        }
        if (this.userSubscription != null) {
            return BirdPlusSubscriptionViewStatus.ACTIVE;
        }
        if (this.subscriptionPlan != null) {
            return BirdPlusSubscriptionViewStatus.AVAILABLE;
        }
        return BirdPlusSubscriptionViewStatus.UNKNOWN;
    }

    public final WireBirdPlusSubscriptionPlan getSubscriptionPlan() {
        return this.subscriptionPlan;
    }

    public final WireBirdPlusUserSubscription getUserSubscription() {
        return this.userSubscription;
    }

    public int hashCode() {
        WireBirdPlusSubscriptionPlan wireBirdPlusSubscriptionPlan = this.subscriptionPlan;
        int hashCode = (wireBirdPlusSubscriptionPlan == null ? 0 : wireBirdPlusSubscriptionPlan.hashCode()) * 31;
        WireBirdPlusUserSubscription wireBirdPlusUserSubscription = this.userSubscription;
        int hashCode2 = (hashCode + (wireBirdPlusUserSubscription == null ? 0 : wireBirdPlusUserSubscription.hashCode())) * 31;
        BirdPlusSubscriptionViewIneligibleReason birdPlusSubscriptionViewIneligibleReason = this.ineligibleReason;
        return hashCode2 + (birdPlusSubscriptionViewIneligibleReason != null ? birdPlusSubscriptionViewIneligibleReason.hashCode() : 0);
    }

    public String toString() {
        WireBirdPlusSubscriptionPlan wireBirdPlusSubscriptionPlan = this.subscriptionPlan;
        WireBirdPlusUserSubscription wireBirdPlusUserSubscription = this.userSubscription;
        BirdPlusSubscriptionViewIneligibleReason birdPlusSubscriptionViewIneligibleReason = this.ineligibleReason;
        return "WireBirdPlusView(subscriptionPlan=" + wireBirdPlusSubscriptionPlan + ", userSubscription=" + wireBirdPlusUserSubscription + ", ineligibleReason=" + birdPlusSubscriptionViewIneligibleReason + ")";
    }

    public WireBirdPlusView(WireBirdPlusSubscriptionPlan wireBirdPlusSubscriptionPlan, WireBirdPlusUserSubscription wireBirdPlusUserSubscription, BirdPlusSubscriptionViewIneligibleReason birdPlusSubscriptionViewIneligibleReason) {
        this.subscriptionPlan = wireBirdPlusSubscriptionPlan;
        this.userSubscription = wireBirdPlusUserSubscription;
        this.ineligibleReason = birdPlusSubscriptionViewIneligibleReason;
    }

    public /* synthetic */ WireBirdPlusView(WireBirdPlusSubscriptionPlan wireBirdPlusSubscriptionPlan, WireBirdPlusUserSubscription wireBirdPlusUserSubscription, BirdPlusSubscriptionViewIneligibleReason birdPlusSubscriptionViewIneligibleReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wireBirdPlusSubscriptionPlan, (i & 2) != 0 ? null : wireBirdPlusUserSubscription, (i & 4) != 0 ? null : birdPlusSubscriptionViewIneligibleReason);
    }
}
