package p000;

import co.bird.android.model.constant.TutorialType;
import com.facebook.share.internal.C17296a;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, m28432d2 = {"LHa6;", "", "Le13;", "navigator", "LTq4;", "reactiveConfig", "LNa6;", C17296a.f69688o, "Lco/bird/android/model/constant/TutorialType;", "Lco/bird/android/model/constant/TutorialType;", "tutorialType", "<init>", "(Lco/bird/android/model/constant/TutorialType;)V", "co.bird.android.feature.tutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module
/* renamed from: Ha6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33257Ha6 {

    /* renamed from: a */
    public final TutorialType f13581a;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ha6$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3168a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TutorialType.values().length];
            try {
                iArr[TutorialType.RELEASE_LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TutorialType.CHARGER_DAMAGED_BIRD_FIRST_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TutorialType.GROUP_RIDES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public C33257Ha6(TutorialType tutorialType) {
        Intrinsics.checkNotNullParameter(tutorialType, "tutorialType");
        this.f13581a = tutorialType;
    }

    @Provides
    /* renamed from: a */
    public final AbstractC34661Na6 m103696a(InterfaceC40099e13 navigator, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        int i = C3168a.$EnumSwitchMapping$0[this.f13581a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new C43781kE1(navigator, reactiveConfig);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new C41686gi0(navigator);
        }
        return new C33669Iu4(navigator);
    }
}
