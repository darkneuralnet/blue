package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireMerchantSite;
import co.bird.api.response.MerchantSiteResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J2\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u0007H'J\u001e\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\u00042\b\b\u0001\u0010\r\u001a\u00020\u0002H'J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u0002H'J\u001e\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0012H'J\u001e\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000b0\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0016H'J\u001e\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u000b0\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u0018H'J\u001e\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b0\u00042\b\b\u0001\u0010\u001d\u001a\u00020\u001cH'J\u0012\u0010\"\u001a\u00020!2\b\b\u0001\u0010 \u001a\u00020\u001fH'J\u001e\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b0\u00042\b\b\u0001\u0010\u001d\u001a\u00020#H'¨\u0006%"}, m28432d2 = {"LeT2;", "", "", "merchantId", "Lio/reactivex/F;", "Lco/bird/api/response/MerchantSiteResponse;", "e", "", "latitude", "longitude", "radius", "LHM4;", "j", "merchantSiteId", "Lco/bird/android/model/wire/WireMerchantSite;", DateTokenConverter.CONVERTER_KEY, "id", "i", "LdL3;", "payMerchantBody", "LuL3;", "g", "LeL3;", "h", "LaT2;", "merchantScanBody", "LbT2;", "b", "LJe6;", "updateMerchantSiteBody", "c", "LHe6;", "body", "Lio/reactivex/c;", C17296a.f69688o, "LIe6;", "f", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: eT2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC40359eT2 {
    @AD3("v1/merchant/site/update/auto-location")
    /* renamed from: a */
    AbstractC23461c m42867a(@InterfaceC6404PY C33293He6 c33293He6);

    @AD3("v1/merchant/site/scan")
    /* renamed from: b */
    AbstractC23442F<HM4<C38563bT2>> m42866b(@InterfaceC6404PY C37970aT2 c37970aT2);

    @CD3("v1/merchant/site")
    /* renamed from: c */
    AbstractC23442F<HM4<Object>> m42865c(@InterfaceC6404PY C33761Je6 c33761Je6);

    @NA1("/v1/merchant/site")
    /* renamed from: d */
    AbstractC23442F<HM4<WireMerchantSite>> m42864d(@InterfaceC37017Xc4("id") String str);

    @NA1("/v1/merchant/site/byMerchantId")
    /* renamed from: e */
    AbstractC23442F<MerchantSiteResponse> m42863e(@InterfaceC37017Xc4("id") String str);

    @CD3("v1/merchant/site")
    /* renamed from: f */
    AbstractC23442F<HM4<Object>> m42862f(@InterfaceC6404PY C33527Ie6 c33527Ie6);

    @AD3("v1/merchant/site/pay")
    /* renamed from: g */
    AbstractC23442F<HM4<C49775uL3>> m42861g(@InterfaceC6404PY C39696dL3 c39696dL3);

    @AD3("v1/merchant/site/pay")
    /* renamed from: h */
    AbstractC23442F<HM4<C49775uL3>> m42860h(@InterfaceC6404PY C40288eL3 c40288eL3);

    @NA1("/v1/merchant/site")
    /* renamed from: i */
    AbstractC23442F<WireMerchantSite> m42859i(@InterfaceC37017Xc4("id") String str);

    @NA1("v1/merchant/site/nearby")
    /* renamed from: j */
    AbstractC23442F<HM4<MerchantSiteResponse>> m42858j(@InterfaceC37017Xc4("latitude") double d, @InterfaceC37017Xc4("longitude") double d2, @InterfaceC37017Xc4("radius") double d3);
}
