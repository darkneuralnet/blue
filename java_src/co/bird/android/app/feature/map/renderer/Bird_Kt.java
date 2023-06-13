package co.bird.android.app.feature.map.renderer;

import co.bird.android.model.ridertutorial.TutorialKind;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m28432d2 = {"classTutorialKind", "Lco/bird/android/model/ridertutorial/TutorialKind;", "Lco/bird/android/model/wire/WireBird;", "co.bird.android.feature.map"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class Bird_Kt {
    public static final TutorialKind classTutorialKind(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        if (WireBirdKt.isCruiserModel(wireBird)) {
            return TutorialKind.CLASS_MOPED;
        }
        return TutorialKind.CLASS_SCOOTER;
    }
}
