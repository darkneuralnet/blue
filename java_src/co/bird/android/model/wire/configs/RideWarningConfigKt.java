package co.bird.android.model.wire.configs;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, m28432d2 = {"isLegacyPresentationKind", "", "Lco/bird/android/model/wire/configs/WarningPresentationKind;", "model-wire_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RideWarningConfigKt {
    public static final boolean isLegacyPresentationKind(WarningPresentationKind warningPresentationKind) {
        if (warningPresentationKind == null) {
            warningPresentationKind = WarningPresentationKind.LEGACY;
        }
        return warningPresentationKind == WarningPresentationKind.LEGACY;
    }
}
