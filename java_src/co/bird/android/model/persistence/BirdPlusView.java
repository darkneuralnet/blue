package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdPlusSubscriptionViewIneligibleReason;
import co.bird.android.model.constant.BirdPlusSubscriptionViewStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0011J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jo\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00103\u001a\u00020\u00192\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001aR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0013R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0013¨\u00068"}, m28432d2 = {"Lco/bird/android/model/persistence/BirdPlusView;", "", "status", "Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;", "subscriptionPlanId", "", "userSubscriptionId", "codename", "subscriptionPlan", "Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;", "userSubscription", "Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;", "ineligibleReason", "Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;", "display", "Lco/bird/android/model/persistence/BirdPlusDisplayView;", "zendeskArticleId", "(Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;Lco/bird/android/model/persistence/BirdPlusDisplayView;Ljava/lang/String;)V", "getCodename", "()Ljava/lang/String;", "getDisplay", "()Lco/bird/android/model/persistence/BirdPlusDisplayView;", "getIneligibleReason", "()Lco/bird/android/model/constant/BirdPlusSubscriptionViewIneligibleReason;", "isActive", "", "()Z", "isAvailable", "isIneligible", "isPurchased", "needsDeviceTransfer", "getNeedsDeviceTransfer", "getStatus", "()Lco/bird/android/model/constant/BirdPlusSubscriptionViewStatus;", "getSubscriptionPlan", "()Lco/bird/android/model/persistence/BirdPlusSubscriptionPlanView;", "getSubscriptionPlanId", "getUserSubscription", "()Lco/bird/android/model/persistence/BirdPlusUserSubscriptionView;", "getUserSubscriptionId", "getZendeskArticleId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdPlusView {
    private final String codename;
    private final BirdPlusDisplayView display;
    private final BirdPlusSubscriptionViewIneligibleReason ineligibleReason;
    private final BirdPlusSubscriptionViewStatus status;
    private final BirdPlusSubscriptionPlanView subscriptionPlan;
    private final String subscriptionPlanId;
    private final BirdPlusUserSubscriptionView userSubscription;
    private final String userSubscriptionId;
    private final String zendeskArticleId;

    public BirdPlusView(BirdPlusSubscriptionViewStatus birdPlusSubscriptionViewStatus, String subscriptionPlanId, String userSubscriptionId, String codename, BirdPlusSubscriptionPlanView birdPlusSubscriptionPlanView, BirdPlusUserSubscriptionView birdPlusUserSubscriptionView, BirdPlusSubscriptionViewIneligibleReason birdPlusSubscriptionViewIneligibleReason, BirdPlusDisplayView birdPlusDisplayView, String str) {
        Intrinsics.checkNotNullParameter(subscriptionPlanId, "subscriptionPlanId");
        Intrinsics.checkNotNullParameter(userSubscriptionId, "userSubscriptionId");
        Intrinsics.checkNotNullParameter(codename, "codename");
        this.status = birdPlusSubscriptionViewStatus;
        this.subscriptionPlanId = subscriptionPlanId;
        this.userSubscriptionId = userSubscriptionId;
        this.codename = codename;
        this.subscriptionPlan = birdPlusSubscriptionPlanView;
        this.userSubscription = birdPlusUserSubscriptionView;
        this.ineligibleReason = birdPlusSubscriptionViewIneligibleReason;
        this.display = birdPlusDisplayView;
        this.zendeskArticleId = str;
    }

    public final BirdPlusSubscriptionViewStatus component1() {
        return this.status;
    }

    public final String component2() {
        return this.subscriptionPlanId;
    }

    public final String component3() {
        return this.userSubscriptionId;
    }

    public final String component4() {
        return this.codename;
    }

    public final BirdPlusSubscriptionPlanView component5() {
        return this.subscriptionPlan;
    }

    public final BirdPlusUserSubscriptionView component6() {
        return this.userSubscription;
    }

    public final BirdPlusSubscriptionViewIneligibleReason component7() {
        return this.ineligibleReason;
    }

    public final BirdPlusDisplayView component8() {
        return this.display;
    }

    public final String component9() {
        return this.zendeskArticleId;
    }

    public final BirdPlusView copy(BirdPlusSubscriptionViewStatus birdPlusSubscriptionViewStatus, String subscriptionPlanId, String userSubscriptionId, String codename, BirdPlusSubscriptionPlanView birdPlusSubscriptionPlanView, BirdPlusUserSubscriptionView birdPlusUserSubscriptionView, BirdPlusSubscriptionViewIneligibleReason birdPlusSubscriptionViewIneligibleReason, BirdPlusDisplayView birdPlusDisplayView, String str) {
        Intrinsics.checkNotNullParameter(subscriptionPlanId, "subscriptionPlanId");
        Intrinsics.checkNotNullParameter(userSubscriptionId, "userSubscriptionId");
        Intrinsics.checkNotNullParameter(codename, "codename");
        return new BirdPlusView(birdPlusSubscriptionViewStatus, subscriptionPlanId, userSubscriptionId, codename, birdPlusSubscriptionPlanView, birdPlusUserSubscriptionView, birdPlusSubscriptionViewIneligibleReason, birdPlusDisplayView, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdPlusView) {
            BirdPlusView birdPlusView = (BirdPlusView) obj;
            return this.status == birdPlusView.status && Intrinsics.areEqual(this.subscriptionPlanId, birdPlusView.subscriptionPlanId) && Intrinsics.areEqual(this.userSubscriptionId, birdPlusView.userSubscriptionId) && Intrinsics.areEqual(this.codename, birdPlusView.codename) && Intrinsics.areEqual(this.subscriptionPlan, birdPlusView.subscriptionPlan) && Intrinsics.areEqual(this.userSubscription, birdPlusView.userSubscription) && this.ineligibleReason == birdPlusView.ineligibleReason && Intrinsics.areEqual(this.display, birdPlusView.display) && Intrinsics.areEqual(this.zendeskArticleId, birdPlusView.zendeskArticleId);
        }
        return false;
    }

    public final String getCodename() {
        return this.codename;
    }

    public final BirdPlusDisplayView getDisplay() {
        return this.display;
    }

    public final BirdPlusSubscriptionViewIneligibleReason getIneligibleReason() {
        return this.ineligibleReason;
    }

    public final boolean getNeedsDeviceTransfer() {
        return isIneligible() && this.ineligibleReason == BirdPlusSubscriptionViewIneligibleReason.INELIGIBLE_DEVICE;
    }

    public final BirdPlusSubscriptionViewStatus getStatus() {
        return this.status;
    }

    public final BirdPlusSubscriptionPlanView getSubscriptionPlan() {
        return this.subscriptionPlan;
    }

    public final String getSubscriptionPlanId() {
        return this.subscriptionPlanId;
    }

    public final BirdPlusUserSubscriptionView getUserSubscription() {
        return this.userSubscription;
    }

    public final String getUserSubscriptionId() {
        return this.userSubscriptionId;
    }

    public final String getZendeskArticleId() {
        return this.zendeskArticleId;
    }

    public int hashCode() {
        BirdPlusSubscriptionViewStatus birdPlusSubscriptionViewStatus = this.status;
        int hashCode = (((((((birdPlusSubscriptionViewStatus == null ? 0 : birdPlusSubscriptionViewStatus.hashCode()) * 31) + this.subscriptionPlanId.hashCode()) * 31) + this.userSubscriptionId.hashCode()) * 31) + this.codename.hashCode()) * 31;
        BirdPlusSubscriptionPlanView birdPlusSubscriptionPlanView = this.subscriptionPlan;
        int hashCode2 = (hashCode + (birdPlusSubscriptionPlanView == null ? 0 : birdPlusSubscriptionPlanView.hashCode())) * 31;
        BirdPlusUserSubscriptionView birdPlusUserSubscriptionView = this.userSubscription;
        int hashCode3 = (hashCode2 + (birdPlusUserSubscriptionView == null ? 0 : birdPlusUserSubscriptionView.hashCode())) * 31;
        BirdPlusSubscriptionViewIneligibleReason birdPlusSubscriptionViewIneligibleReason = this.ineligibleReason;
        int hashCode4 = (hashCode3 + (birdPlusSubscriptionViewIneligibleReason == null ? 0 : birdPlusSubscriptionViewIneligibleReason.hashCode())) * 31;
        BirdPlusDisplayView birdPlusDisplayView = this.display;
        int hashCode5 = (hashCode4 + (birdPlusDisplayView == null ? 0 : birdPlusDisplayView.hashCode())) * 31;
        String str = this.zendeskArticleId;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public final boolean isActive() {
        return this.status == BirdPlusSubscriptionViewStatus.ACTIVE;
    }

    public final boolean isAvailable() {
        return this.status == BirdPlusSubscriptionViewStatus.AVAILABLE;
    }

    public final boolean isIneligible() {
        return this.status == BirdPlusSubscriptionViewStatus.INELIGIBLE;
    }

    public final boolean isPurchased() {
        return isActive() || isIneligible();
    }

    public String toString() {
        BirdPlusSubscriptionViewStatus birdPlusSubscriptionViewStatus = this.status;
        String str = this.subscriptionPlanId;
        String str2 = this.userSubscriptionId;
        String str3 = this.codename;
        BirdPlusSubscriptionPlanView birdPlusSubscriptionPlanView = this.subscriptionPlan;
        BirdPlusUserSubscriptionView birdPlusUserSubscriptionView = this.userSubscription;
        BirdPlusSubscriptionViewIneligibleReason birdPlusSubscriptionViewIneligibleReason = this.ineligibleReason;
        BirdPlusDisplayView birdPlusDisplayView = this.display;
        String str4 = this.zendeskArticleId;
        return "BirdPlusView(status=" + birdPlusSubscriptionViewStatus + ", subscriptionPlanId=" + str + ", userSubscriptionId=" + str2 + ", codename=" + str3 + ", subscriptionPlan=" + birdPlusSubscriptionPlanView + ", userSubscription=" + birdPlusUserSubscriptionView + ", ineligibleReason=" + birdPlusSubscriptionViewIneligibleReason + ", display=" + birdPlusDisplayView + ", zendeskArticleId=" + str4 + ")";
    }

    public /* synthetic */ BirdPlusView(BirdPlusSubscriptionViewStatus birdPlusSubscriptionViewStatus, String str, String str2, String str3, BirdPlusSubscriptionPlanView birdPlusSubscriptionPlanView, BirdPlusUserSubscriptionView birdPlusUserSubscriptionView, BirdPlusSubscriptionViewIneligibleReason birdPlusSubscriptionViewIneligibleReason, BirdPlusDisplayView birdPlusDisplayView, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : birdPlusSubscriptionViewStatus, str, str2, str3, (i & 16) != 0 ? null : birdPlusSubscriptionPlanView, (i & 32) != 0 ? null : birdPlusUserSubscriptionView, (i & 64) != 0 ? null : birdPlusSubscriptionViewIneligibleReason, (i & 128) != 0 ? null : birdPlusDisplayView, (i & 256) != 0 ? null : str4);
    }
}
