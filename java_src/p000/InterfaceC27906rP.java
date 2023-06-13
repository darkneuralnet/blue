package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.api.request.BirdPlusCancelSubscriptionRequestBody;
import co.bird.api.request.BirdPlusPurchaseSubscriptionRequestBody;
import co.bird.api.request.BirdPlusReactivateSubscriptionRequestBody;
import co.bird.api.response.BirdPlusViewResponse;
import co.bird.api.response.WireBirdPlusView;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\b\b\u0001\u0010\u0006\u001a\u00020\tH'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u000bH'¨\u0006\r"}, m28432d2 = {"LrP;", "", "Lio/reactivex/F;", "Lco/bird/api/response/BirdPlusViewResponse;", C17296a.f69688o, "Lco/bird/api/request/BirdPlusPurchaseSubscriptionRequestBody;", "body", "Lco/bird/api/response/WireBirdPlusView;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/api/request/BirdPlusCancelSubscriptionRequestBody;", "c", "Lco/bird/api/request/BirdPlusReactivateSubscriptionRequestBody;", "b", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rP */
/* loaded from: classes4.dex */
public interface InterfaceC27906rP {
    @NA1("api/v1/bird-plus")
    /* renamed from: a */
    AbstractC23442F<BirdPlusViewResponse> m16000a();

    @AD3("api/v1/bird-plus/reactivate")
    /* renamed from: b */
    AbstractC23442F<WireBirdPlusView> m15999b(@InterfaceC6404PY BirdPlusReactivateSubscriptionRequestBody birdPlusReactivateSubscriptionRequestBody);

    @AD3("api/v1/bird-plus/cancel")
    /* renamed from: c */
    AbstractC23442F<WireBirdPlusView> m15998c(@InterfaceC6404PY BirdPlusCancelSubscriptionRequestBody birdPlusCancelSubscriptionRequestBody);

    @AD3("api/v1/bird-plus/buy")
    /* renamed from: d */
    AbstractC23442F<WireBirdPlusView> m15997d(@InterfaceC6404PY BirdPlusPurchaseSubscriptionRequestBody birdPlusPurchaseSubscriptionRequestBody);
}
