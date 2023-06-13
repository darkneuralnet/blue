package p000;

import co.bird.android.model.ridertutorial.TutorialKind;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/ridertutorial/TutorialKind;", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: F65 */
/* loaded from: classes2.dex */
public final class F65 {
    /* renamed from: a */
    public static final TutorialKind m107740a(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        String model = wireBird.getModel();
        if (model != null) {
            int hashCode = model.hashCode();
            if (hashCode != 3088) {
                if (hashCode != 3089) {
                    if (hashCode != 3137) {
                        if (hashCode != 3246) {
                            if (hashCode == 3297957 && model.equals("m365")) {
                                return TutorialKind.CONTEXTUAL_M365;
                            }
                        } else if (model.equals("es")) {
                            return TutorialKind.CONTEXTUAL_ES;
                        }
                    } else if (model.equals("bc")) {
                        return TutorialKind.CONTEXTUAL_BC;
                    }
                } else if (model.equals("b3")) {
                    return TutorialKind.CONTEXTUAL_B3;
                }
            } else if (model.equals("b2")) {
                return TutorialKind.CONTEXTUAL_B2;
            }
        }
        if (WireBirdKt.isCruiserModel(wireBird)) {
            return TutorialKind.CLASS_MOPED;
        }
        return TutorialKind.CLASS_SCOOTER;
    }
}
