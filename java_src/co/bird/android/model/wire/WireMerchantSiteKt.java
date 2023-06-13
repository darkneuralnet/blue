package co.bird.android.model.wire;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"isFooter", "", "Lco/bird/android/model/wire/WireMerchantAction;", "isList", "photoUrl", "", "Lco/bird/android/model/wire/WireMerchantSite;", "model-wire_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireMerchantSiteKt {
    public static final boolean isFooter(WireMerchantAction wireMerchantAction) {
        Intrinsics.checkNotNullParameter(wireMerchantAction, "<this>");
        return Intrinsics.areEqual(wireMerchantAction.getLayoutKind(), "footer");
    }

    public static final boolean isList(WireMerchantAction wireMerchantAction) {
        Intrinsics.checkNotNullParameter(wireMerchantAction, "<this>");
        return Intrinsics.areEqual(wireMerchantAction.getLayoutKind(), "body");
    }

    public static final String photoUrl(WireMerchantSite wireMerchantSite) {
        WireAssetMedia media;
        WireAssetMedia media2;
        String mediaUrl;
        Intrinsics.checkNotNullParameter(wireMerchantSite, "<this>");
        WireLegacyAsset logo = wireMerchantSite.getMerchant().getLogo();
        if (logo == null || (media2 = logo.getMedia()) == null || (mediaUrl = media2.getMediaUrl()) == null) {
            WireLegacyAsset photo = wireMerchantSite.getMerchant().getPhoto();
            if (photo != null && (media = photo.getMedia()) != null) {
                return media.getMediaUrl();
            }
            return null;
        }
        return mediaUrl;
    }
}
