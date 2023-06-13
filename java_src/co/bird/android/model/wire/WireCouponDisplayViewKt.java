package co.bird.android.model.wire;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m28432d2 = {"expired", "", "Lco/bird/android/model/wire/WireCouponDisplayView;", "model-wire_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireCouponDisplayViewKt {
    public static final boolean expired(WireCouponDisplayView wireCouponDisplayView) {
        Intrinsics.checkNotNullParameter(wireCouponDisplayView, "<this>");
        DateTime expiresAt = wireCouponDisplayView.getExpiresAt();
        if (expiresAt == null || DateTime.now().compareTo((ReadableInstant) expiresAt) < 0) {
            return false;
        }
        return true;
    }
}
