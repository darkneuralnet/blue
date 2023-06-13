package co.bird.android.model.wire;

import android.content.Context;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.BirdTaskKind;
import co.bird.android.model.constant.BountyKind;
import co.bird.android.model.constant.BrainState;
import co.bird.android.model.constant.Condition;
import co.bird.android.model.constant.MapPinBadge;
import co.bird.android.model.constant.Placement;
import co.bird.android.model.constant.SpecialCondition;
import co.bird.android.model.persistence.extensions.Bird_Kt;
import co.bird.android.model.wire.configs.Config;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u001a\u0018\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\u0018\u0010\n\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\u0018\u0010\u000b\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\u0018\u0010\f\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\u0018\u0010\r\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\u0018\u0010\u000e\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\u0018\u0010\u000f\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\u0010\u0010\u0010\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u001a\u0018\u0010\u0011\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\u0018\u0010\u0012\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\u0018\u0010\u0013\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\n\u0010\u0014\u001a\u00020\u0015*\u00020\u0016\u001a\u0012\u0010\u0017\u001a\u00020\u0007*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019\u001a\n\u0010\u001a\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010\u001b\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010\u001c\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010\u001d\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010\u001e\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010\u001f\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010 \u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010!\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010\"\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010#\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010$\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010%\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010&\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010'\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010(\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010)\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010*\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010+\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010,\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010-\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010.\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010/\u001a\u00020\u0007*\u00020\u0016\u001a\n\u00100\u001a\u00020\u0007*\u00020\u0016\u001a\n\u00101\u001a\u00020\u0007*\u00020\u0016\u001a\n\u00102\u001a\u00020\u0007*\u00020\u0016\u001a\n\u00103\u001a\u00020\u0007*\u00020\u0016\u001a\n\u00104\u001a\u00020\u0007*\u00020\u0016\u001a\n\u00105\u001a\u00020\u0007*\u00020\u0016\u001a\n\u00106\u001a\u00020\u0007*\u00020\u0016\u001a\n\u00107\u001a\u00020\u0007*\u00020\u0016\u001a\n\u00108\u001a\u00020\u0007*\u00020\u0016\u001a\n\u00109\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010:\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010;\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010<\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010=\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010>\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010?\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010@\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010A\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010B\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010C\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010D\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010E\u001a\u00020\u0007*\u00020\u0016\u001a\u0012\u0010F\u001a\u00020\u0007*\u00020\u00162\u0006\u0010G\u001a\u00020\u0016\u001a\n\u0010H\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010I\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010J\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010K\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010L\u001a\u00020\u0007*\u00020\u0016\u001a\n\u0010M\u001a\u00020\u0007*\u00020\u0016\u001a\u0012\u0010N\u001a\u00020\u0007*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u0012\u0010O\u001a\u00020\u0007*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u0012\u0010P\u001a\u00020\u0007*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u0012\u0010Q\u001a\u00020\u0007*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u0012\u0010R\u001a\u00020\u0007*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019\u001a\f\u0010S\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a\n\u0010T\u001a\u00020U*\u00020\u0016¨\u0006V"}, m28432d2 = {"getDisplayName", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "partnerName", "vehicleModel", "vehicleIsB2Model", "", RequestHeadersFactory.MODEL, "serialNumber", "vehicleIsB2_1Model", "vehicleIsB3Model", "vehicleIsBikeShare", "vehicleIsCruiserModel", "vehicleIsEsModel", "vehicleIsFlex", "vehicleIsM365Model", "vehicleIsOKBModel", "vehicleIsRfModel", "vehicleIsSModel", "birdModel", "Lco/bird/android/model/constant/BirdModel;", "Lco/bird/android/model/wire/WireBird;", "canTreatAsBluetooth", "config", "Lco/bird/android/model/wire/configs/Config;", "hasAvailableBrainState", "hasAvailableSpecialCondition", "hasCannotAccessReport", "isAsleep", "isAvailable", "isB2Model", "isB2_1Model", "isB3Model", "isB4Model", "isBdCompatible", "isBikeShare", "isBikeType", "isBirdAir", "isBirdBike", "isBirdBikePairable", "isBirdBikeUnpaired", "isBirdFlex", "isChargeTask", "isCollect", "isCruiserModel", "isDamaged", "isDebug", "isEsModel", "isImpounded", "isInFacility", "isInTransit", "isLost", "isM365Model", "isMotoType", "isMoveTask", "isNotAsleep", "isNotAvailable", "isNotCollect", "isNotDamaged", "isNotDebug", "isNotImpounded", "isNotInFacility", "isNotInTransit", "isNotLost", "isNotTotaled", "isOKBModel", "isOffline", "isPlacedInMarket", "isPrivateBird", "isProbablySameBird", "bird", "isRecalled", "isRfModel", "isSModel", "isSpecialTaskDispatch", "isSwappable", "isTotaled", "shouldConnectViaBTInRide", "shouldSubmitTrackEventsWhenConnected", "shouldTrackInRideBluetooth", "shouldTrackOutOfRideBluetooth", "shouldUpdateMaxSpeedOverBT", "stripObfuscatedCharacters", "taskBirdStatus", "Lco/bird/android/model/wire/TaskBirdStatus;", "model-wire_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nWireBird.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WireBird.kt\nco/bird/android/model/wire/WireBirdKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,672:1\n151#2,6:673\n1#3:679\n*S KotlinDebug\n*F\n+ 1 WireBird.kt\nco/bird/android/model/wire/WireBirdKt\n*L\n669#1:673,6\n*E\n"})
/* loaded from: classes4.dex */
public final class WireBirdKt {
    public static final BirdModel birdModel(WireBird wireBird) {
        BirdModel birdModel;
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        BirdModel fromString = BirdModel.Companion.fromString(wireBird.getModel());
        if (fromString == null) {
            if (isM365Model(wireBird)) {
                birdModel = BirdModel.M365;
            } else if (isEsModel(wireBird)) {
                birdModel = BirdModel.ES;
            } else if (isOKBModel(wireBird)) {
                birdModel = BirdModel.BD;
            } else if (isRfModel(wireBird)) {
                birdModel = BirdModel.RF;
            } else if (isB2Model(wireBird)) {
                birdModel = BirdModel.B2;
            } else if (isB3Model(wireBird)) {
                birdModel = BirdModel.B3;
            } else if (isB4Model(wireBird)) {
                birdModel = BirdModel.B4;
            } else if (isCruiserModel(wireBird)) {
                birdModel = BirdModel.BC;
            } else if (isBirdAir(wireBird)) {
                birdModel = BirdModel.BIRDAIR;
            } else if (isBirdBikeUnpaired(wireBird)) {
                birdModel = BirdModel.BIRDBIKE_UNPAIRED;
            } else if (isBirdBikePairable(wireBird)) {
                birdModel = BirdModel.BIRDBIKE_PAIRABLE;
            } else if (isBikeShare(wireBird)) {
                birdModel = BirdModel.EB100;
            } else if (isSModel(wireBird)) {
                birdModel = BirdModel.ES400;
            } else if (isBirdFlex(wireBird)) {
                birdModel = BirdModel.ES500;
            } else {
                birdModel = BirdModel.UNKNOWN;
            }
            return birdModel;
        }
        return fromString;
    }

    public static final boolean canTreatAsBluetooth(WireBird wireBird, Config config) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!wireBird.getBluetooth() && (!isOKBModel(wireBird) || !config.getEnableBdBluetoothOverride())) {
            return false;
        }
        return true;
    }

    public static final String getDisplayName(Context context, String str, String str2) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(context, "context");
        if (str != null) {
            Resources resources = context.getResources();
            if (Intrinsics.areEqual(str2, "bc")) {
                i2 = C37089Xk4.partner_moped_name;
            } else {
                i2 = C37089Xk4.partner_scooter_name;
            }
            String quantityString = resources.getQuantityString(i2, 1, str);
            Intrinsics.checkNotNullExpressionValue(quantityString, "{\n    context.resources.…name, 1, partnerName)\n  }");
            return quantityString;
        }
        Resources resources2 = context.getResources();
        if (Intrinsics.areEqual(str2, "bc")) {
            i = C37089Xk4.bird_moped_name;
        } else {
            i = C37089Xk4.bird_scooter_name;
        }
        String quantityString2 = resources2.getQuantityString(i, 1);
        Intrinsics.checkNotNullExpressionValue(quantityString2, "{\n    context.resources.…bird_scooter_name, 1)\n  }");
        return quantityString2;
    }

    public static final boolean hasAvailableBrainState(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getBrainState() == BrainState.AVAILABLE) {
            return true;
        }
        return false;
    }

    public static final boolean hasAvailableSpecialCondition(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getSpecialCondition() == SpecialCondition.AVAILABLE) {
            return true;
        }
        return false;
    }

    public static final boolean hasCannotAccessReport(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getBadgeType() == MapPinBadge.CANNOT_ACCESS_REPORT) {
            return true;
        }
        return false;
    }

    public static final boolean isAsleep(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getBrainState() == BrainState.ASLEEP) {
            return true;
        }
        return false;
    }

    public static final boolean isAvailable(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getCondition() == Condition.AVAILABLE) {
            return true;
        }
        return false;
    }

    public static final boolean isB2Model(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (!vehicleIsB2Model(wireBird.getModel(), wireBird.getSerialNumber()) && !isB2_1Model(wireBird)) {
            return false;
        }
        return true;
    }

    public static final boolean isB2_1Model(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        return vehicleIsB2_1Model(wireBird.getModel(), wireBird.getSerialNumber());
    }

    public static final boolean isB3Model(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        return vehicleIsB3Model(wireBird.getModel(), wireBird.getSerialNumber());
    }

    public static final boolean isB4Model(WireBird wireBird) {
        boolean startsWith;
        boolean startsWith2;
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        String model = wireBird.getModel();
        if (model != null) {
            startsWith2 = StringsKt__StringsJVMKt.startsWith(model, Bird_Kt.MODEL_BIRD_B4, true);
            return startsWith2;
        }
        startsWith = StringsKt__StringsJVMKt.startsWith(wireBird.getSerialNumber(), "B7", true);
        return startsWith;
    }

    public static final boolean isBdCompatible(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (!isOKBModel(wireBird) && !isBikeShare(wireBird) && !isSModel(wireBird)) {
            return false;
        }
        return true;
    }

    public static final boolean isBikeShare(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        return vehicleIsBikeShare(wireBird.getModel(), wireBird.getSerialNumber());
    }

    public static final boolean isBikeType(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (!isMotoType(wireBird) && !isBirdBike(wireBird) && !isBikeShare(wireBird) && !isCruiserModel(wireBird)) {
            return false;
        }
        return true;
    }

    public static final boolean isBirdAir(WireBird wireBird) {
        boolean contains;
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        String model = wireBird.getModel();
        if (model == null) {
            return false;
        }
        contains = StringsKt__StringsKt.contains((CharSequence) model, (CharSequence) Bird_Kt.MODEL_BIRD_AIR, true);
        if (!contains) {
            return false;
        }
        return true;
    }

    public static final boolean isBirdBike(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (!isBirdBikeUnpaired(wireBird) && !isBirdBikePairable(wireBird)) {
            return false;
        }
        return true;
    }

    public static final boolean isBirdBikePairable(WireBird wireBird) {
        boolean contains;
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        String model = wireBird.getModel();
        if (model == null) {
            return false;
        }
        contains = StringsKt__StringsKt.contains((CharSequence) model, (CharSequence) Bird_Kt.MODEL_BIRD_BIKE_PAIRABLE, true);
        if (!contains) {
            return false;
        }
        return true;
    }

    public static final boolean isBirdBikeUnpaired(WireBird wireBird) {
        boolean contains;
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        String model = wireBird.getModel();
        if (model == null) {
            return false;
        }
        contains = StringsKt__StringsKt.contains((CharSequence) model, (CharSequence) Bird_Kt.MODEL_BIRD_BIKE_UNPAIRED, true);
        if (!contains) {
            return false;
        }
        return true;
    }

    public static final boolean isBirdFlex(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        return vehicleIsFlex(wireBird.getModel(), wireBird.getSerialNumber());
    }

    public static final boolean isChargeTask(WireBird wireBird) {
        List listOf;
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new BirdTaskKind[]{BirdTaskKind.CHARGE, BirdTaskKind.DAMAGED_CHARGE});
        return listOf.contains(wireBird.getTaskKind());
    }

    public static final boolean isCollect(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getSpecialCondition() == SpecialCondition.ACCIDENT) {
            return true;
        }
        return false;
    }

    public static final boolean isCruiserModel(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        return vehicleIsCruiserModel(wireBird.getModel(), wireBird.getSerialNumber());
    }

    public static final boolean isDamaged(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getCondition() == Condition.NEEDS_SERVICE) {
            return true;
        }
        return false;
    }

    public static final boolean isDebug(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getBrainState() == BrainState.DEBUG) {
            return true;
        }
        return false;
    }

    public static final boolean isEsModel(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        return vehicleIsEsModel(wireBird.getModel(), wireBird.getSerialNumber());
    }

    public static final boolean isImpounded(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getPlacement() == Placement.IMPOUND) {
            return true;
        }
        return false;
    }

    public static final boolean isInFacility(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getPlacement() == Placement.FACILITY) {
            return true;
        }
        return false;
    }

    public static final boolean isInTransit(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getPlacement() == Placement.TRANSIT) {
            return true;
        }
        return false;
    }

    public static final boolean isLost(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getPlacement() == Placement.LOST) {
            return true;
        }
        return false;
    }

    public static final boolean isM365Model(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        return vehicleIsM365Model(wireBird.getModel());
    }

    public static final boolean isMotoType(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        return isCruiserModel(wireBird);
    }

    public static final boolean isMoveTask(WireBird wireBird) {
        List listOf;
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new BirdTaskKind[]{BirdTaskKind.REBALANCE, BirdTaskKind.DAMAGED_TRANSPORT});
        return listOf.contains(wireBird.getTaskKind());
    }

    public static final boolean isNotAsleep(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getBrainState() != BrainState.ASLEEP) {
            return true;
        }
        return false;
    }

    public static final boolean isNotAvailable(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getCondition() == Condition.AVAILABLE && wireBird.getLifecycle().getSpecialCondition() == SpecialCondition.AVAILABLE && wireBird.getLifecycle().getBrainState() == BrainState.AVAILABLE && wireBird.getLifecycle().getPlacement() == Placement.IN_MARKET) {
            return false;
        }
        return true;
    }

    public static final boolean isNotCollect(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getSpecialCondition() != SpecialCondition.ACCIDENT) {
            return true;
        }
        return false;
    }

    public static final boolean isNotDamaged(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getCondition() != Condition.NEEDS_SERVICE) {
            return true;
        }
        return false;
    }

    public static final boolean isNotDebug(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getBrainState() != BrainState.DEBUG) {
            return true;
        }
        return false;
    }

    public static final boolean isNotImpounded(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getPlacement() != Placement.IMPOUND) {
            return true;
        }
        return false;
    }

    public static final boolean isNotInFacility(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getPlacement() != Placement.FACILITY) {
            return true;
        }
        return false;
    }

    public static final boolean isNotInTransit(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getPlacement() != Placement.TRANSIT) {
            return true;
        }
        return false;
    }

    public static final boolean isNotLost(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getPlacement() != Placement.LOST) {
            return true;
        }
        return false;
    }

    public static final boolean isNotTotaled(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getCondition() != Condition.TOTALED) {
            return true;
        }
        return false;
    }

    public static final boolean isOKBModel(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        return vehicleIsOKBModel(wireBird.getModel(), wireBird.getSerialNumber());
    }

    public static final boolean isOffline(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (!wireBird.getOffline() && wireBird.getLifecycle().getBrainState() != BrainState.OFFLINE) {
            return false;
        }
        return true;
    }

    public static final boolean isPlacedInMarket(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getPlacement() == Placement.IN_MARKET) {
            return true;
        }
        return false;
    }

    public static final boolean isPrivateBird(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getPrivateBird() != null) {
            return true;
        }
        return false;
    }

    public static final boolean isProbablySameBird(WireBird wireBird, WireBird bird) {
        boolean startsWith$default;
        boolean startsWith$default2;
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        Intrinsics.checkNotNullParameter(bird, "bird");
        String stripObfuscatedCharacters = stripObfuscatedCharacters(wireBird.getCode());
        String stripObfuscatedCharacters2 = stripObfuscatedCharacters(bird.getCode());
        if (stripObfuscatedCharacters.length() == stripObfuscatedCharacters2.length()) {
            return Intrinsics.areEqual(stripObfuscatedCharacters, stripObfuscatedCharacters2);
        }
        if (stripObfuscatedCharacters.length() < stripObfuscatedCharacters2.length()) {
            startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(stripObfuscatedCharacters2, stripObfuscatedCharacters, false, 2, null);
            return startsWith$default2;
        }
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(stripObfuscatedCharacters, stripObfuscatedCharacters2, false, 2, null);
        return startsWith$default;
    }

    public static final boolean isRecalled(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getSpecialCondition() == SpecialCondition.RECALL) {
            return true;
        }
        return false;
    }

    public static final boolean isRfModel(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        return vehicleIsRfModel(wireBird.getModel(), wireBird.getSerialNumber());
    }

    public static final boolean isSModel(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        return vehicleIsSModel(wireBird.getModel(), wireBird.getSerialNumber());
    }

    public static final boolean isSpecialTaskDispatch(WireBird wireBird) {
        List listOf;
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new BountyKind[]{BountyKind.SPECIAL_TASK_DISPATCH_CHARGE, BountyKind.SPECIAL_TASK_DISPATCH_REBALANCE});
        return listOf.contains(wireBird.getBountyKind());
    }

    public static final boolean isSwappable(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (!isBikeShare(wireBird) && !isSModel(wireBird) && !isB4Model(wireBird)) {
            return false;
        }
        return true;
    }

    public static final boolean isTotaled(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (wireBird.getLifecycle().getCondition() == Condition.TOTALED) {
            return true;
        }
        return false;
    }

    public static final boolean shouldConnectViaBTInRide(WireBird wireBird, Config config) {
        boolean contains;
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!isOKBModel(wireBird) || !config.getEnableInRideBdTracks()) {
            contains = CollectionsKt___CollectionsKt.contains(config.getRideConfig().getForceClientTracksByModel(), wireBird.getModel());
            if (!contains && !config.getRideConfig().getForceClientTracks() && !birdModel(wireBird).isScanOnly()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean shouldSubmitTrackEventsWhenConnected(WireBird wireBird, Config config) {
        boolean contains;
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        if (wireBird.getCellular() || !wireBird.getBluetooth()) {
            contains = CollectionsKt___CollectionsKt.contains(config.getRideConfig().getForceClientTracksByModel(), wireBird.getModel());
            if (!contains && !config.getRideConfig().getForceClientTracks()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean shouldTrackInRideBluetooth(WireBird wireBird, Config config) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        if (canTreatAsBluetooth(wireBird, config) && shouldConnectViaBTInRide(wireBird, config)) {
            return true;
        }
        return false;
    }

    public static final boolean shouldTrackOutOfRideBluetooth(WireBird wireBird, Config config) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        return canTreatAsBluetooth(wireBird, config);
    }

    public static final boolean shouldUpdateMaxSpeedOverBT(WireBird wireBird, Config config) {
        boolean contains;
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!wireBird.getBluetooth()) {
            contains = CollectionsKt___CollectionsKt.contains(config.getUpdateBtMaxSpeedByModel(), wireBird.getModel());
            if (!contains) {
                return false;
            }
        }
        return true;
    }

    private static final String stripObfuscatedCharacters(String str) {
        boolean z;
        IntRange until;
        String substring;
        boolean z2;
        int length = str.length();
        int i = 0;
        while (true) {
            z = true;
            if (i < length) {
                if (str.charAt(i) == 8226) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() < 0) {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            until = RangesKt___RangesKt.until(0, valueOf.intValue());
            substring = StringsKt__StringsKt.substring(str, until);
            if (substring != null) {
                return substring;
            }
            return str;
        }
        return str;
    }

    public static final TaskBirdStatus taskBirdStatus(WireBird wireBird) {
        DateTime m19257e;
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        DateTime dueAt = wireBird.getDueAt();
        if (dueAt != null && (m19257e = C46880pT0.m19257e(dueAt)) != null) {
            if (m19257e.isBefore(DateTime.now())) {
                return TaskBirdStatus.OVERDUE;
            }
            return TaskBirdStatus.DUE_FUTURE;
        }
        return TaskBirdStatus.DUE_FUTURE;
    }

    public static final boolean vehicleIsB2Model(String str, String serialNumber) {
        boolean startsWith$default;
        boolean startsWith;
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        if (str != null) {
            startsWith = StringsKt__StringsJVMKt.startsWith(str, "b2", true);
            return startsWith;
        }
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(serialNumber, "B2", false, 2, null);
        return startsWith$default;
    }

    public static final boolean vehicleIsB2_1Model(String str, String serialNumber) {
        boolean startsWith$default;
        boolean startsWith;
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        if (str != null) {
            startsWith = StringsKt__StringsJVMKt.startsWith(str, "b2", true);
            return startsWith;
        }
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(serialNumber, "B3", false, 2, null);
        return startsWith$default;
    }

    public static final boolean vehicleIsB3Model(String str, String serialNumber) {
        boolean startsWith;
        boolean startsWith2;
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        if (str != null) {
            startsWith2 = StringsKt__StringsJVMKt.startsWith(str, "b3", true);
            return startsWith2;
        }
        startsWith = StringsKt__StringsJVMKt.startsWith(serialNumber, "B4", true);
        return startsWith;
    }

    public static final boolean vehicleIsBikeShare(String str, String serialNumber) {
        boolean equals;
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        if (str == null) {
            return false;
        }
        equals = StringsKt__StringsJVMKt.equals(str, "eb100", true);
        if (!equals) {
            return false;
        }
        return true;
    }

    public static final boolean vehicleIsCruiserModel(String str, String serialNumber) {
        boolean startsWith$default;
        boolean startsWith;
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        if (str != null) {
            startsWith = StringsKt__StringsJVMKt.startsWith(str, "bc", true);
            return startsWith;
        }
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(serialNumber, "BC", false, 2, null);
        return startsWith$default;
    }

    public static final boolean vehicleIsEsModel(String str, String serialNumber) {
        boolean startsWith$default;
        boolean equals;
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        if (str == null) {
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(serialNumber, "N", false, 2, null);
            return startsWith$default;
        }
        equals = StringsKt__StringsJVMKt.equals(str, "es", true);
        return equals;
    }

    public static final boolean vehicleIsFlex(String str, String serialNumber) {
        boolean equals;
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        if (str == null) {
            return false;
        }
        equals = StringsKt__StringsJVMKt.equals(str, Bird_Kt.MODEL_BIRD_FLEX, true);
        if (!equals) {
            return false;
        }
        return true;
    }

    public static final boolean vehicleIsM365Model(String str) {
        boolean startsWith;
        if (str == null) {
            return true;
        }
        startsWith = StringsKt__StringsJVMKt.startsWith(str, "m365", true);
        return startsWith;
    }

    public static final boolean vehicleIsOKBModel(String str, String serialNumber) {
        boolean startsWith$default;
        boolean startsWith;
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        if (str != null) {
            startsWith = StringsKt__StringsJVMKt.startsWith(str, "bd", true);
            return startsWith;
        }
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(serialNumber, "BD", false, 2, null);
        return startsWith$default;
    }

    public static final boolean vehicleIsRfModel(String str, String serialNumber) {
        boolean startsWith$default;
        boolean startsWith;
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        if (str != null) {
            startsWith = StringsKt__StringsJVMKt.startsWith(str, "rf", true);
            return startsWith;
        }
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(serialNumber, "RF", false, 2, null);
        return startsWith$default;
    }

    public static final boolean vehicleIsSModel(String str, String serialNumber) {
        boolean equals;
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        if (str == null) {
            return false;
        }
        equals = StringsKt__StringsJVMKt.equals(str, "es400", true);
        if (!equals) {
            return false;
        }
        return true;
    }
}
