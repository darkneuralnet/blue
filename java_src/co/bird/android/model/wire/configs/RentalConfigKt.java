package co.bird.android.model.wire.configs;

import co.bird.android.model.constant.RentalKind;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002¨\u0006\u0005"}, m28432d2 = {"getConfig", "Lco/bird/android/model/wire/configs/RentalConfig;", "Lco/bird/android/model/wire/configs/BaseRentalConfig;", "rentalKind", "Lco/bird/android/model/constant/RentalKind;", "model-wire_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RentalConfigKt {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RentalKind.values().length];
            try {
                iArr[RentalKind.ON_DEMAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RentalKind.PICK_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final RentalConfig getConfig(BaseRentalConfig baseRentalConfig) {
        Intrinsics.checkNotNullParameter(baseRentalConfig, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[rentalKind(baseRentalConfig).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return baseRentalConfig.getDropOffConfig();
            }
            return baseRentalConfig.getPickUpConfig();
        }
        return baseRentalConfig.getOnDemandConfig();
    }

    public static final RentalKind rentalKind(BaseRentalConfig baseRentalConfig) {
        Intrinsics.checkNotNullParameter(baseRentalConfig, "<this>");
        if (baseRentalConfig.getOnDemandConfig().getEnabled()) {
            return RentalKind.ON_DEMAND;
        }
        if (baseRentalConfig.getPickUpConfig().getEnabled()) {
            return RentalKind.PICK_UP;
        }
        return RentalKind.DROP_OFF;
    }
}
