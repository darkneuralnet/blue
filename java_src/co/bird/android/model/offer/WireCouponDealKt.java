package co.bird.android.model.offer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m28432d2 = {"justCompleted", "", "Lco/bird/android/model/offer/WireCouponDeal;", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireCouponDealKt {
    public static final boolean justCompleted(WireCouponDeal wireCouponDeal) {
        Intrinsics.checkNotNullParameter(wireCouponDeal, "<this>");
        DateTime completedAt = wireCouponDeal.getCompletedAt();
        if (completedAt == null || !completedAt.isAfter(DateTime.now().minusSeconds(30)) || !completedAt.isBefore(DateTime.now().plus(30L))) {
            return false;
        }
        return true;
    }
}
