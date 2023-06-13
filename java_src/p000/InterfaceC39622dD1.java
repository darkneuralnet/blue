package p000;

import co.bird.api.response.MapDirectionResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.Observable;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JJ\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H'¨\u0006\r"}, m28432d2 = {"LdD1;", "", "", AnalyticsRequestV2.HEADER_ORIGIN, "destination", "", "sensor", "mode", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "signature", "Lio/reactivex/Observable;", "Lco/bird/api/response/MapDirectionResponse;", C17296a.f69688o, "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dD1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC39622dD1 {
    @NA1("maps/api/directions/json")
    /* renamed from: a */
    Observable<MapDirectionResponse> m44535a(@InterfaceC37017Xc4(encoded = true, value = "origin") String str, @InterfaceC37017Xc4(encoded = true, value = "destination") String str2, @InterfaceC37017Xc4("sensor") boolean z, @InterfaceC37017Xc4("mode") String str3, @InterfaceC37017Xc4("client") String str4, @InterfaceC37017Xc4(encoded = true, value = "signature") String str5);
}
