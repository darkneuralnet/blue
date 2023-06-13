package p000;

import co.bird.android.model.ridertutorial.TutorialKind;
import co.bird.android.model.wire.WireRiderTutorial;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireRiderTutorial;", "Lco/bird/android/model/ridertutorial/TutorialKind;", "tutorialKind", "", "", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Ya5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37234Ya5 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ya5$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C9815a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TutorialKind.values().length];
            try {
                iArr[TutorialKind.CONTEXTUAL_M365.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TutorialKind.CONTEXTUAL_ES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TutorialKind.CONTEXTUAL_BC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TutorialKind.CONTEXTUAL_B2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TutorialKind.CONTEXTUAL_B3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TutorialKind.CLASS_SCOOTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TutorialKind.CLASS_MOPED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TutorialKind.CLASS_SCOOTER_PARKING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TutorialKind.CLASS_MOPED_PARKING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final List<String> m74889a(WireRiderTutorial wireRiderTutorial, TutorialKind tutorialKind) {
        boolean z;
        Intrinsics.checkNotNullParameter(wireRiderTutorial, "<this>");
        Intrinsics.checkNotNullParameter(tutorialKind, "tutorialKind");
        switch (C9815a.$EnumSwitchMapping$0[tutorialKind.ordinal()]) {
            case 1:
                return wireRiderTutorial.getContextualM365();
            case 2:
                return wireRiderTutorial.getContextualES();
            case 3:
                return wireRiderTutorial.getContextualBC();
            case 4:
                return wireRiderTutorial.getContextualB2();
            case 5:
                return wireRiderTutorial.getContextualB3();
            case 6:
                return wireRiderTutorial.getClassScooterSteps();
            case 7:
                return wireRiderTutorial.getClassMopedSteps();
            case 8:
                List<String> classScooterParking = wireRiderTutorial.getClassScooterParking();
                if (classScooterParking != null && !classScooterParking.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return wireRiderTutorial.getParking();
                }
                return wireRiderTutorial.getClassScooterParking();
            case 9:
                return wireRiderTutorial.getClassMopedParking();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
