package co.bird.android.model;

import co.bird.android.model.persistence.common.ConstantsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m28432d2 = {"Lco/bird/android/model/RideUpdateState;", "", "(Ljava/lang/String;I)V", "toPhaseString", "", "RIDE_REQUIREMENTS", "STARTING", "LOCKING", "ENDING", ConstantsKt.NONE, "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum RideUpdateState {
    RIDE_REQUIREMENTS,
    STARTING,
    LOCKING,
    ENDING,
    NONE;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RideUpdateState.values().length];
            try {
                iArr[RideUpdateState.RIDE_REQUIREMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RideUpdateState.STARTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RideUpdateState.LOCKING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RideUpdateState.ENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RideUpdateState.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final String toPhaseString() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return "unknown";
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return "ride_end";
                }
                return "mid_ride";
            }
            return "ride_start";
        }
        return "ride_requirements";
    }
}
