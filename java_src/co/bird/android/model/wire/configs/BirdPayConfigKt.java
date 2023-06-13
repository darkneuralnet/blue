package co.bird.android.model.wire.configs;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m28432d2 = {"checkConfigForTutorial", "Lco/bird/android/model/wire/configs/TutorialAvailable;", "Lco/bird/android/model/wire/configs/BirdPayConfig;", "model-wire_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdPayConfigKt {
    public static final TutorialAvailable checkConfigForTutorial(BirdPayConfig birdPayConfig) {
        Intrinsics.checkNotNullParameter(birdPayConfig, "<this>");
        BirdPayTutorialConfig tutorialConfig = birdPayConfig.getTutorialConfig();
        boolean z = false;
        if (tutorialConfig != null && tutorialConfig.getEnabled()) {
            z = true;
        }
        if (z) {
            return TutorialAvailable.TUTORIAL_CONFIG;
        }
        if (birdPayConfig.getBannerHelpArticleId() != null) {
            return TutorialAvailable.ZENDESK_ARTICLE;
        }
        return TutorialAvailable.NONE;
    }
}
