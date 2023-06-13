package co.bird.android.app.feature.map;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/app/feature/map/ZIndexZoneType;", "", "(Ljava/lang/String;I)V", "zIndex", "", "INVERTED_OPERATIONAL_ZONE", "OPERATIONAL_ZONE", "BASE_ZONE", "LIMITED_CAPS_REMAINING_ZONE", "NO_CAPS_REMAINING_ZONE", "NO_DROP_ZONE", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public enum ZIndexZoneType {
    INVERTED_OPERATIONAL_ZONE,
    OPERATIONAL_ZONE,
    BASE_ZONE,
    LIMITED_CAPS_REMAINING_ZONE,
    NO_CAPS_REMAINING_ZONE,
    NO_DROP_ZONE;

    public final int zIndex() {
        return ordinal();
    }
}
