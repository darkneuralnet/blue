package p000;

import co.bird.android.model.offer.WireCouponDeal;
import co.bird.android.model.offer.WireCouponOffer;
import co.bird.api.response.CollectionResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J2\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH'¨\u0006\u000f"}, m28432d2 = {"Lpe3;", "", "", "latitude", "longitude", "", "radius", "Lio/reactivex/F;", "Lco/bird/api/response/CollectionResponse;", "Lco/bird/android/model/offer/WireCouponOffer;", C17296a.f69688o, "LD1;", "body", "Lco/bird/android/model/offer/WireCouponDeal;", "b", "co.bird.android.manager.offer"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: pe3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC46986pe3 {
    @NA1("/v1/offer/nearby")
    /* renamed from: a */
    AbstractC23442F<CollectionResponse<WireCouponOffer>> m19018a(@InterfaceC37017Xc4("latitude") double d, @InterfaceC37017Xc4("longitude") double d2, @InterfaceC37017Xc4("radius") int i);

    @AD3("/v1/offer/accept")
    /* renamed from: b */
    AbstractC23442F<WireCouponDeal> m19017b(@InterfaceC6404PY C1327D1 c1327d1);
}
