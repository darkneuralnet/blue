package p000;

import co.bird.android.model.constant.RidePassViewIneligibleReason;
import co.bird.android.model.constant.RidePassViewStatus;
import co.bird.android.model.persistence.RidePassView;
import co.bird.android.model.persistence.nestedstructures.RidePassSubscriptionPlanView;
import co.bird.android.model.persistence.nestedstructures.RidePassUserSubscriptionView;
import co.bird.android.model.wire.WireRidePassSubscriptionPlanView;
import co.bird.android.model.wire.WireRidePassUserSubscriptionView;
import co.bird.android.model.wire.WireRidePassView;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0005\u001a\n\u0010\n\u001a\u00020\t*\u00020\b¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/model/wire/WireRidePassView;", "Lco/bird/android/model/constant/RidePassViewStatus;", "status", "Lco/bird/android/model/persistence/RidePassView;", C17296a.f69688o, "Lco/bird/android/model/wire/WireRidePassSubscriptionPlanView;", "Lco/bird/android/model/persistence/nestedstructures/RidePassSubscriptionPlanView;", "b", "Lco/bird/android/model/wire/WireRidePassUserSubscriptionView;", "Lco/bird/android/model/persistence/nestedstructures/RidePassUserSubscriptionView;", "c", "co.bird.android.repository.ride-pass-view"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: AX4 */
/* loaded from: classes4.dex */
public final class AX4 {
    /* renamed from: a */
    public static final RidePassView m115662a(WireRidePassView wireRidePassView, RidePassViewStatus status) {
        RidePassSubscriptionPlanView ridePassSubscriptionPlanView;
        RidePassUserSubscriptionView ridePassUserSubscriptionView;
        Intrinsics.checkNotNullParameter(wireRidePassView, "<this>");
        Intrinsics.checkNotNullParameter(status, "status");
        String userRidePassId = wireRidePassView.getUserRidePassId();
        String linkCode = wireRidePassView.getLinkCode();
        long price = wireRidePassView.getPrice();
        Long priceTax = wireRidePassView.getPriceTax();
        Long previousPrice = wireRidePassView.getPreviousPrice();
        String currency = wireRidePassView.getCurrency();
        String bannerImageUrl = wireRidePassView.getBannerImageUrl();
        String bannerAction = wireRidePassView.getBannerAction();
        String title = wireRidePassView.getTitle();
        String label = wireRidePassView.getLabel();
        String zendeskArticleId = wireRidePassView.getZendeskArticleId();
        String detailAction = wireRidePassView.getDetailAction();
        String confirmationToast = wireRidePassView.getConfirmationToast();
        DateTime createdAt = wireRidePassView.getCreatedAt();
        DateTime expiresAt = wireRidePassView.getExpiresAt();
        RidePassViewIneligibleReason ineligibleReason = wireRidePassView.getIneligibleReason();
        Integer remainingDeviceTransferCount = wireRidePassView.getRemainingDeviceTransferCount();
        String cancelArticleId = wireRidePassView.getCancelArticleId();
        String footer = wireRidePassView.getFooter();
        String detailBody = wireRidePassView.getDetailBody();
        String detailImageUrl = wireRidePassView.getDetailImageUrl();
        List<String> detailBodyList = wireRidePassView.getDetailBodyList();
        String detailFooter = wireRidePassView.getDetailFooter();
        WireRidePassSubscriptionPlanView subscriptionPlan = wireRidePassView.getSubscriptionPlan();
        if (subscriptionPlan != null) {
            ridePassSubscriptionPlanView = m115661b(subscriptionPlan);
        } else {
            ridePassSubscriptionPlanView = null;
        }
        WireRidePassUserSubscriptionView userSubscription = wireRidePassView.getUserSubscription();
        if (userSubscription != null) {
            ridePassUserSubscriptionView = m115660c(userSubscription);
        } else {
            ridePassUserSubscriptionView = null;
        }
        return new RidePassView(null, linkCode, userRidePassId, price, priceTax, previousPrice, currency, bannerImageUrl, bannerAction, title, zendeskArticleId, confirmationToast, label, status, ineligibleReason, remainingDeviceTransferCount, cancelArticleId, footer, detailBody, detailImageUrl, detailAction, detailBodyList, detailFooter, ridePassSubscriptionPlanView, ridePassUserSubscriptionView, createdAt, expiresAt, 1, null);
    }

    /* renamed from: b */
    public static final RidePassSubscriptionPlanView m115661b(WireRidePassSubscriptionPlanView wireRidePassSubscriptionPlanView) {
        Intrinsics.checkNotNullParameter(wireRidePassSubscriptionPlanView, "<this>");
        return new RidePassSubscriptionPlanView(wireRidePassSubscriptionPlanView.getId(), wireRidePassSubscriptionPlanView.getBillingIntervalDescription());
    }

    /* renamed from: c */
    public static final RidePassUserSubscriptionView m115660c(WireRidePassUserSubscriptionView wireRidePassUserSubscriptionView) {
        Intrinsics.checkNotNullParameter(wireRidePassUserSubscriptionView, "<this>");
        return new RidePassUserSubscriptionView(wireRidePassUserSubscriptionView.getId(), wireRidePassUserSubscriptionView.getNextRenewalAt());
    }
}
