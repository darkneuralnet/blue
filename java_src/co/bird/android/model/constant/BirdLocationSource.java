package co.bird.android.model.constant;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m28432d2 = {"Lco/bird/android/model/constant/BirdLocationSource;", "", "(Ljava/lang/String;I)V", "toString", "", "GPS_TRACK", "BLE_TRACE", "BEACON_TRACE", "BEAK_TRACE", "EU_TAG", "USER_SCAN", "PREDICTION", "UNKNOWN", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum BirdLocationSource {
    GPS_TRACK,
    BLE_TRACE,
    BEACON_TRACE,
    BEAK_TRACE,
    EU_TAG,
    USER_SCAN,
    PREDICTION,
    UNKNOWN;

    @Override // java.lang.Enum
    public String toString() {
        String lowerCase = name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }
}
