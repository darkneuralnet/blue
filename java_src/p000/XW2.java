package p000;

import co.bird.android.model.wire.WireRide;
import co.bird.api.request.StartRideBodyWithIntent;
import co.bird.api.response.StartRideWithIntentResponse;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¨\u0006\f"}, m28432d2 = {"LXW2;", "", "Lio/reactivex/p;", "", "Lco/bird/android/model/wire/WireRide;", "i", "Lco/bird/api/request/StartRideBodyWithIntent;", "body", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/response/StartRideWithIntentResponse;", "j", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: XW2 */
/* loaded from: classes4.dex */
public interface XW2 {
    @NA1("multi-ride/active")
    /* renamed from: i */
    AbstractC24507p<List<WireRide>> m76915i();

    @AD3("multi-ride/start")
    /* renamed from: j */
    AbstractC23442F<HM4<StartRideWithIntentResponse>> m76914j(@InterfaceC6404PY StartRideBodyWithIntent startRideBodyWithIntent);
}
