package co.bird.android.model.persistence.extensions;

import co.bird.android.model.constant.BrainState;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.nestedstructures.PrivateBird;
import com.stripe.android.core.networking.RequestHeadersFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\u001a\u0018\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u0001\u001a\u0018\u0010\u000e\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u0001\u001a\u0018\u0010\u000f\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\u0001\u001a\n\u0010\u0010\u001a\u00020\u000b*\u00020\u0007\u001a\n\u0010\u0011\u001a\u00020\u000b*\u00020\u0007\u001a\n\u0010\u0012\u001a\u00020\u000b*\u00020\u0007\u001a\n\u0010\u0013\u001a\u00020\u000b*\u00020\u0007\u001a\n\u0010\u0014\u001a\u00020\u000b*\u00020\u0007\u001a\n\u0010\u0015\u001a\u00020\u000b*\u00020\u0007\u001a\n\u0010\u0016\u001a\u00020\u000b*\u00020\u0007\u001a\n\u0010\u0017\u001a\u00020\u000b*\u00020\u0007\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0007\u001a\n\u0010\u0019\u001a\u00020\u000b*\u00020\u0007\u001a\n\u0010\u001a\u001a\u00020\u0001*\u00020\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, m28432d2 = {"MODEL_BIRD_AIR", "", "MODEL_BIRD_B4", "MODEL_BIRD_BIKE_PAIRABLE", "MODEL_BIRD_BIKE_UNPAIRED", "MODEL_BIRD_FLEX", "privateIdentifier", "Lco/bird/android/model/persistence/Bird;", "getPrivateIdentifier", "(Lco/bird/android/model/persistence/Bird;)Ljava/lang/String;", "vehicleIsEb100", "", RequestHeadersFactory.MODEL, "serialNumber", "vehicleIsEs400", "vehicleIsEs500", "isAsleep", "isBirdAir", "isBirdBike", "isBirdBikePairable", "isBirdBikeUnpaired", "isEB100", "isES400", "isES500", "isRetailBird", "isSwappable", "localBrandName", "model-persistence_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Bird_Kt {
    public static final String MODEL_BIRD_AIR = "birdair";
    public static final String MODEL_BIRD_B4 = "b4";
    public static final String MODEL_BIRD_BIKE_PAIRABLE = "hje";
    public static final String MODEL_BIRD_BIKE_UNPAIRED = "rb1";
    public static final String MODEL_BIRD_FLEX = "es500";

    public static final String getPrivateIdentifier(Bird bird) {
        String nickname;
        Intrinsics.checkNotNullParameter(bird, "<this>");
        PrivateBird privateBird = bird.getPrivateBird();
        if (privateBird == null || (nickname = privateBird.getNickname()) == null) {
            return bird.getSerialNumber();
        }
        return nickname;
    }

    public static final boolean isAsleep(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "<this>");
        if (bird.getLifecycle().getBrainState() != BrainState.ASLEEP && !bird.getAsleep()) {
            return false;
        }
        return true;
    }

    public static final boolean isBirdAir(Bird bird) {
        boolean contains;
        Intrinsics.checkNotNullParameter(bird, "<this>");
        String model = bird.getModel();
        if (model == null) {
            return false;
        }
        contains = StringsKt__StringsKt.contains((CharSequence) model, (CharSequence) MODEL_BIRD_AIR, true);
        if (!contains) {
            return false;
        }
        return true;
    }

    public static final boolean isBirdBike(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "<this>");
        if (!isBirdBikeUnpaired(bird) && !isBirdBikePairable(bird)) {
            return false;
        }
        return true;
    }

    public static final boolean isBirdBikePairable(Bird bird) {
        boolean contains;
        Intrinsics.checkNotNullParameter(bird, "<this>");
        String model = bird.getModel();
        if (model == null) {
            return false;
        }
        contains = StringsKt__StringsKt.contains((CharSequence) model, (CharSequence) MODEL_BIRD_BIKE_PAIRABLE, true);
        if (!contains) {
            return false;
        }
        return true;
    }

    public static final boolean isBirdBikeUnpaired(Bird bird) {
        boolean contains;
        Intrinsics.checkNotNullParameter(bird, "<this>");
        String model = bird.getModel();
        if (model == null) {
            return false;
        }
        contains = StringsKt__StringsKt.contains((CharSequence) model, (CharSequence) MODEL_BIRD_BIKE_UNPAIRED, true);
        if (!contains) {
            return false;
        }
        return true;
    }

    public static final boolean isEB100(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "<this>");
        return vehicleIsEb100(bird.getModel(), bird.getSerialNumber());
    }

    public static final boolean isES400(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "<this>");
        return vehicleIsEs400(bird.getModel(), bird.getSerialNumber());
    }

    public static final boolean isES500(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "<this>");
        return vehicleIsEs500(bird.getModel(), bird.getSerialNumber());
    }

    public static final boolean isRetailBird(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "<this>");
        if (!isBirdAir(bird) && !isBirdBike(bird) && !isES500(bird)) {
            return false;
        }
        return true;
    }

    public static final boolean isSwappable(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "<this>");
        if (!isEB100(bird) && !isES400(bird)) {
            return false;
        }
        return true;
    }

    public static final String localBrandName(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "<this>");
        if (isES500(bird)) {
            return "Bird Flex";
        }
        if (isBirdBike(bird)) {
            return "Bird Bike";
        }
        if (isBirdAir(bird)) {
            return "Bird Air";
        }
        if (isEB100(bird)) {
            return "Bird Bikeshare EB100";
        }
        if (isES400(bird)) {
            return "Bird Swappable ES400";
        }
        return "Bird";
    }

    public static final boolean vehicleIsEb100(String str, String serialNumber) {
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

    public static final boolean vehicleIsEs400(String str, String serialNumber) {
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

    public static final boolean vehicleIsEs500(String str, String serialNumber) {
        boolean equals;
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        if (str == null) {
            return false;
        }
        equals = StringsKt__StringsJVMKt.equals(str, MODEL_BIRD_FLEX, true);
        if (!equals) {
            return false;
        }
        return true;
    }
}
