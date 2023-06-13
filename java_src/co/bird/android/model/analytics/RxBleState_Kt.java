package co.bird.android.model.analytics;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p000.AbstractC39873de5;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003¨\u0006\u0006"}, m28432d2 = {"Lde5$a;", "", "toSimpleState", "", "ignoreLocationState", "bluetoothEnabled", "model-analytics_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class RxBleState_Kt {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractC39873de5.EnumC19828a.values().length];
            try {
                iArr[AbstractC39873de5.EnumC19828a.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC39873de5.EnumC19828a.LOCATION_PERMISSION_NOT_GRANTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC39873de5.EnumC19828a.BLUETOOTH_NOT_AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC39873de5.EnumC19828a.BLUETOOTH_NOT_ENABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC39873de5.EnumC19828a.LOCATION_SERVICES_NOT_ENABLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean bluetoothEnabled(AbstractC39873de5.EnumC19828a enumC19828a, boolean z) {
        Intrinsics.checkNotNullParameter(enumC19828a, "<this>");
        if (z) {
            if (enumC19828a != AbstractC39873de5.EnumC19828a.BLUETOOTH_NOT_AVAILABLE && enumC19828a != AbstractC39873de5.EnumC19828a.BLUETOOTH_NOT_ENABLED) {
                return true;
            }
        } else if (enumC19828a == AbstractC39873de5.EnumC19828a.READY) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean bluetoothEnabled$default(AbstractC39873de5.EnumC19828a enumC19828a, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return bluetoothEnabled(enumC19828a, z);
    }

    public static final String toSimpleState(AbstractC39873de5.EnumC19828a enumC19828a) {
        Intrinsics.checkNotNullParameter(enumC19828a, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[enumC19828a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return "disabled";
            }
            return "unauthorized";
        }
        return "enabled";
    }
}
