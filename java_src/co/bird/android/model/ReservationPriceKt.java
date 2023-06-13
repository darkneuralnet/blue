package co.bird.android.model;

import co.bird.android.model.wire.configs.Config;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m28432d2 = {"reservationPrice", "Lco/bird/android/model/ReservationPrice;", "Lco/bird/android/model/wire/configs/Config;", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ReservationPriceKt {
    public static final ReservationPrice reservationPrice(Config config) {
        Intrinsics.checkNotNullParameter(config, "<this>");
        return new ReservationPrice(config.getReservationConfig().getCurrency(), config.getReservationConfig().getBasePrice(), config.getReservationConfig().getMinutePrice(), config.getRideConfig().getAdditionalFees().getApplyTax());
    }
}
