package p000;

import co.bird.android.model.wire.WireMerchantDescription;
import co.bird.android.model.wire.WireMerchantTransaction;
import co.bird.api.response.CollectionResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J8\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\bH'J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¨\u0006\u0013"}, m28432d2 = {"LBQ2;", "", "", "id", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireMerchantDescription;", "b", "merchantId", "", "offset", "limit", "LHM4;", "Lco/bird/api/response/CollectionResponse;", "Lco/bird/android/model/wire/WireMerchantTransaction;", C17296a.f69688o, "LLD0;", "body", "LMD0;", "c", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: BQ2 */
/* loaded from: classes4.dex */
public interface BQ2 {
    @NA1("/v1/merchant/merchant-transaction/history")
    /* renamed from: a */
    AbstractC23442F<HM4<CollectionResponse<WireMerchantTransaction>>> m114050a(@InterfaceC37017Xc4("merchant_id") String str, @InterfaceC37017Xc4("offset") int i, @InterfaceC37017Xc4("limit") int i2);

    @NA1("/v1/merchant/byUserId")
    /* renamed from: b */
    AbstractC23442F<WireMerchantDescription> m114049b(@InterfaceC37017Xc4("id") String str);

    @AD3("/v1/merchant/coupon-extension/by-coupon-ids")
    /* renamed from: c */
    AbstractC23442F<MD0> m114048c(@InterfaceC6404PY LD0 ld0);
}
