package p000;

import co.bird.android.model.offer.WireCouponDeal;
import co.bird.android.model.offer.WireCouponOffer;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Lco/bird/android/model/offer/WireCouponOffer;", "Lne3;", "b", "(Lco/bird/android/model/offer/WireCouponOffer;)Lne3;", "asOffer", "Lco/bird/android/model/offer/WireCouponDeal;", C17296a.f69688o, "(Lco/bird/android/model/offer/WireCouponDeal;)Lne3;", "bird-pay_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: te3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49357te3 {
    /* renamed from: a */
    public static final C45800ne3 m11983a(WireCouponDeal wireCouponDeal) {
        Intrinsics.checkNotNullParameter(wireCouponDeal, "<this>");
        String id = wireCouponDeal.getId();
        String bannerTitle = wireCouponDeal.getUi().getBannerTitle();
        if (bannerTitle == null) {
            bannerTitle = "";
        }
        return new C45800ne3(id, bannerTitle, wireCouponDeal.getUi().getBannerBody(), false);
    }

    /* renamed from: b */
    public static final C45800ne3 m11982b(WireCouponOffer wireCouponOffer) {
        Intrinsics.checkNotNullParameter(wireCouponOffer, "<this>");
        String id = wireCouponOffer.getId();
        String bannerTitle = wireCouponOffer.getUi().getBannerTitle();
        if (bannerTitle == null) {
            bannerTitle = "";
        }
        return new C45800ne3(id, bannerTitle, wireCouponOffer.getUi().getBannerBody(), wireCouponOffer.getExplicitAccept());
    }
}
