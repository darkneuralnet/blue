package p000;

import co.bird.api.request.RidePassBuyRequest;
import co.bird.api.request.WireRidePassTransferRequest;
import co.bird.api.response.WireRidePassTransferResponse;
import co.bird.api.response.WireRidePassUiV2Response;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0012\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'¨\u0006\r"}, m28432d2 = {"LPU4;", "", "Lio/reactivex/F;", "Lco/bird/api/response/WireRidePassUiV2Response;", "c", "Lco/bird/api/request/RidePassBuyRequest;", "body", "Lio/reactivex/c;", C17296a.f69688o, "Lco/bird/api/request/WireRidePassTransferRequest;", "request", "Lco/bird/api/response/WireRidePassTransferResponse;", "b", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: PU4 */
/* loaded from: classes4.dex */
public interface PU4 {
    @AD3("ride-pass/buy")
    /* renamed from: a */
    AbstractC23461c m90191a(@InterfaceC6404PY RidePassBuyRequest ridePassBuyRequest);

    @AD3("ride-pass/device-transfer")
    /* renamed from: b */
    AbstractC23442F<WireRidePassTransferResponse> m90190b(@InterfaceC6404PY WireRidePassTransferRequest wireRidePassTransferRequest);

    @NA1("ride-pass/ui/v2")
    /* renamed from: c */
    AbstractC23442F<WireRidePassUiV2Response> m90189c();
}
