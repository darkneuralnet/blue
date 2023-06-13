package co.bird.android.app.feature.map.cluster.bird;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/app/feature/map/cluster/bird/BirdClusterItemState;", "", "(Ljava/lang/String;I)V", "inRide", "", "getInRide", "()Z", "AVAILABLE", "SELECTED", "ACTIVE_RIDE", "ACTIVE_RIDE_IN_NO_PARK_NO_RIDE_AREA", "ACTIVE_RIDE_IN_NO_PARK_SLOW_AREA", "ACTIVE_RIDE_IN_NO_PARK_AREA", "ACTIVE_RIDE_IN_NO_RIDE_AREA", "ACTIVE_RIDE_IN_SLOW_AREA", "ACTIVE_RIDE_IN_WARNING_RED_AREA", "ACTIVE_RIDE_IN_WARNING_YELLOW_AREA", "ACTIVE_RIDE_IN_PREFERRED_PARKING_NEST", "ACTIVE_RIDE_NEAR_PARKING_NEST", "ACTIVE_RIDE_IN_FULL_NEST", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public enum BirdClusterItemState {
    AVAILABLE,
    SELECTED,
    ACTIVE_RIDE,
    ACTIVE_RIDE_IN_NO_PARK_NO_RIDE_AREA,
    ACTIVE_RIDE_IN_NO_PARK_SLOW_AREA,
    ACTIVE_RIDE_IN_NO_PARK_AREA,
    ACTIVE_RIDE_IN_NO_RIDE_AREA,
    ACTIVE_RIDE_IN_SLOW_AREA,
    ACTIVE_RIDE_IN_WARNING_RED_AREA,
    ACTIVE_RIDE_IN_WARNING_YELLOW_AREA,
    ACTIVE_RIDE_IN_PREFERRED_PARKING_NEST,
    ACTIVE_RIDE_NEAR_PARKING_NEST,
    ACTIVE_RIDE_IN_FULL_NEST;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BirdClusterItemState.values().length];
            try {
                iArr[BirdClusterItemState.AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BirdClusterItemState.SELECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final boolean getInRide() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        return (i == 1 || i == 2) ? false : true;
    }
}
