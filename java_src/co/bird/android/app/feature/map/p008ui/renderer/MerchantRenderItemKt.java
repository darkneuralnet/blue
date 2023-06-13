package co.bird.android.app.feature.map.p008ui.renderer;

import co.bird.android.model.wire.WireMerchantSite;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0007*\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\b\u001a\u0011\u0010\t\u001a\u00020\n*\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28432d2 = {"markerId", "", "Lco/bird/android/model/wire/WireMerchantSite;", "mapZoomLevel", "", "(Lco/bird/android/model/wire/WireMerchantSite;Ljava/lang/Float;)Ljava/lang/String;", "pinVisibility", "Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;", "(Ljava/lang/Float;)Lco/bird/android/app/feature/map/ui/renderer/PinVisibility;", "shouldShowMerchantName", "", "(Ljava/lang/Float;)Z", "co.bird.android.feature.map"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.renderer.MerchantRenderItemKt */
/* loaded from: classes2.dex */
public final class MerchantRenderItemKt {
    public static final String markerId(WireMerchantSite wireMerchantSite, Float f) {
        Intrinsics.checkNotNullParameter(wireMerchantSite, "<this>");
        if (shouldShowMerchantName(f)) {
            String id = wireMerchantSite.getId();
            String name = wireMerchantSite.getMerchant().getName();
            return id + name;
        }
        return wireMerchantSite.getId();
    }

    public static final PinVisibility pinVisibility(Float f) {
        boolean shouldShowMerchantName = shouldShowMerchantName(f);
        if (shouldShowMerchantName) {
            return PinVisibility.PIN_WITH_NAMES;
        }
        if (!shouldShowMerchantName) {
            return PinVisibility.PIN_ONLY;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean shouldShowMerchantName(Float f) {
        return (f != null ? f.floatValue() : -1.0f) > 17.0f;
    }
}
