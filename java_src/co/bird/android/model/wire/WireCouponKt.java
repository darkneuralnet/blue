package co.bird.android.model.wire;

import co.bird.android.model.constant.CouponKind;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0002¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"expired", "", "Lco/bird/android/model/wire/WireCoupon;", "isPromotional", "remainingSeconds", "", "(Lco/bird/android/model/wire/WireCoupon;)Ljava/lang/Integer;", "model-wire_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireCouponKt {
    public static final boolean expired(WireCoupon wireCoupon) {
        Intrinsics.checkNotNullParameter(wireCoupon, "<this>");
        DateTime expiresAt = wireCoupon.getExpiresAt();
        if (expiresAt == null || DateTime.now().compareTo((ReadableInstant) expiresAt) <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean isPromotional(WireCoupon wireCoupon) {
        Intrinsics.checkNotNullParameter(wireCoupon, "<this>");
        if (wireCoupon.getKind() != CouponKind.FREE_UNLOCK && wireCoupon.getKind() != CouponKind.FREE_RESERVE) {
            return false;
        }
        return true;
    }

    public static final Integer remainingSeconds(WireCoupon wireCoupon) {
        Intrinsics.checkNotNullParameter(wireCoupon, "<this>");
        if (isPromotional(wireCoupon) && wireCoupon.getExpiresAt() != null) {
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(wireCoupon.getExpiresAt().getMillis() - DateTime.now().getMillis());
            if (seconds < 0) {
                seconds = 0;
            }
            return Integer.valueOf(seconds);
        }
        return null;
    }
}
