package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireCoupon;
import co.bird.api.request.CreateCouponBody;
import co.bird.api.response.CollectionResponse;
import co.bird.api.response.PromotionsResponse;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0003\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH'¨\u0006\u0010"}, m28432d2 = {"LAD0;", "", "", "redeemed", "Lio/reactivex/F;", "Lco/bird/api/response/CollectionResponse;", "Lco/bird/android/model/wire/WireCoupon;", "e", "Lco/bird/api/request/CreateCouponBody;", "body", "f", "Lco/bird/api/response/PromotionsResponse;", DateTokenConverter.CONVERTER_KEY, "", "id", "c", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: AD0 */
/* loaded from: classes4.dex */
public interface AD0 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: AD0$a */
    /* loaded from: classes4.dex */
    public static final class C0054a {
        public static /* synthetic */ AbstractC23442F getUnRedeemedCoupon$default(AD0 ad0, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return ad0.m115999e(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUnRedeemedCoupon");
        }
    }

    @AD3("coupon/activate")
    /* renamed from: c */
    AbstractC23442F<Object> m116001c(@InterfaceC37017Xc4("coupon_id") String str);

    @NA1("coupon/promotions")
    /* renamed from: d */
    AbstractC23442F<PromotionsResponse> m116000d();

    @NA1("coupon")
    /* renamed from: e */
    AbstractC23442F<CollectionResponse<WireCoupon>> m115999e(@InterfaceC37017Xc4("redeemed") boolean z);

    @AD3("coupon")
    /* renamed from: f */
    AbstractC23442F<WireCoupon> m115998f(@InterfaceC6404PY CreateCouponBody createCouponBody);
}
