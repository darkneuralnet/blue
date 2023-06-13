package co.bird.android.model.constant;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/constant/TransferOrderDemandSource;", "", "(Ljava/lang/String;I)V", "toString", "", "BIRD_ALLOCATION", "FM_DROP_OFF", "FM_DROP_OFF_3PL", "FM_LONGTAIL_DELIVERY", "FM_LONGTAIL_DELIVERY_3PL", "FM_LONGTAIL_RETURN", "FM_LONGTAIL_RETURN_3PL", "FM_PICK_UP", "FM_PICK_UP_3PL", "FM_TO_FM", "FROM_3PL_DELIVERY", "MANUFACTURER_DELIVERY", "SCRAP_REMOVAL", "SC_TO_3PL", "UNKNOWN", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum TransferOrderDemandSource {
    BIRD_ALLOCATION,
    FM_DROP_OFF,
    FM_DROP_OFF_3PL,
    FM_LONGTAIL_DELIVERY,
    FM_LONGTAIL_DELIVERY_3PL,
    FM_LONGTAIL_RETURN,
    FM_LONGTAIL_RETURN_3PL,
    FM_PICK_UP,
    FM_PICK_UP_3PL,
    FM_TO_FM,
    FROM_3PL_DELIVERY,
    MANUFACTURER_DELIVERY,
    SCRAP_REMOVAL,
    SC_TO_3PL,
    UNKNOWN;

    @Override // java.lang.Enum
    public String toString() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }
}
