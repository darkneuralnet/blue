package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LastLockComplianceModel;
import co.bird.android.model.PhysicalLockEvent;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRideDetail;
import co.bird.android.model.wire.WireSafeStartValues;
import co.bird.api.request.DetectHelmetSelfieRequest;
import co.bird.api.request.DisputeRideCreateRequest;
import co.bird.api.request.DisputeRideFinalizeRequest;
import co.bird.api.request.ParkingEvaluationFeedbackBody;
import co.bird.api.request.RideIdBody;
import co.bird.api.request.RideStatusBody;
import co.bird.api.request.UpdateRidePhotoBody;
import co.bird.api.response.CollectionResponse;
import co.bird.api.response.DetectHelmetSelfieResponse;
import co.bird.api.response.DisputeRideCreateResponse;
import co.bird.api.response.DisputeRideFinalizeResponse;
import co.bird.api.response.DownloadRideReceiptResponse;
import co.bird.api.response.RideSummary;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\b\b\u0001\u0010\b\u001a\u00020\u000bH'J(\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00042\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u000eH'J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\b\u001a\u00020\u000bH'J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00172\b\b\u0001\u0010\b\u001a\u00020\u0016H'J\u001e\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u001a0\u00172\b\b\u0001\u0010\b\u001a\u00020\u0019H'J\u0014\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001a0\u0017H'J \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001a0\u00172\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0002H'J\u001e\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001a0\u00172\b\b\u0001\u0010\b\u001a\u00020!H'J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u0017H'J\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00172\b\b\u0001\u0010\b\u001a\u00020%H'J\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00172\b\b\u0001\u0010\b\u001a\u00020(H'J\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00172\b\b\u0001\u0010\b\u001a\u00020+H'J\u0018\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00172\b\b\u0001\u0010.\u001a\u00020\u0002H'¨\u00061"}, m28432d2 = {"LNP4;", "", "", "id", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireRideDetail;", "g", "Lco/bird/api/request/RideStatusBody;", "body", "Lco/bird/android/model/wire/WireBird;", "l", "Lco/bird/api/request/RideIdBody;", "Lio/reactivex/p;", "k", "", "offset", "limit", "Lco/bird/api/response/CollectionResponse;", "Lco/bird/api/response/RideSummary;", "o", "Lco/bird/android/model/wire/WireRide;", "j", "Lco/bird/api/request/UpdateRidePhotoBody;", "Lio/reactivex/F;", "r", "Lco/bird/android/model/PhysicalLockEvent;", "LHM4;", "m", "Lco/bird/android/model/LastLockComplianceModel;", "h", "birdId", "LDG3;", "f", "Lco/bird/api/request/ParkingEvaluationFeedbackBody;", "i", "Lco/bird/android/model/wire/WireSafeStartValues;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/api/request/DetectHelmetSelfieRequest;", "Lco/bird/api/response/DetectHelmetSelfieResponse;", "p", "Lco/bird/api/request/DisputeRideCreateRequest;", "Lco/bird/api/response/DisputeRideCreateResponse;", "n", "Lco/bird/api/request/DisputeRideFinalizeRequest;", "Lco/bird/api/response/DisputeRideFinalizeResponse;", "q", "rideId", "Lco/bird/api/response/DownloadRideReceiptResponse;", "e", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: NP4 */
/* loaded from: classes4.dex */
public interface NP4 {
    @NA1("ride/safe-start-values")
    /* renamed from: d */
    AbstractC23442F<WireSafeStartValues> m93937d();

    @NA1("ride/download-receipt-invoice")
    /* renamed from: e */
    AbstractC23442F<DownloadRideReceiptResponse> m93936e(@InterfaceC37017Xc4("ride_id") String str);

    @NA1("ride/parking/photo-instructions")
    /* renamed from: f */
    AbstractC23442F<HM4<DG3>> m93935f(@InterfaceC37017Xc4("bird_id") String str);

    @NA1("ride/detail")
    /* renamed from: g */
    Observable<WireRideDetail> m93934g(@InterfaceC37017Xc4("ride_id") String str);

    @NA1("ride/last-lock-compliance")
    /* renamed from: h */
    AbstractC23442F<HM4<LastLockComplianceModel>> m93933h();

    @AD3("ride/parking/photo-evaluation-feedback")
    /* renamed from: i */
    AbstractC23442F<HM4<Object>> m93932i(@InterfaceC6404PY ParkingEvaluationFeedbackBody parkingEvaluationFeedbackBody);

    @CD3("ride/continue")
    /* renamed from: j */
    Observable<WireRide> m93931j(@InterfaceC6404PY RideIdBody rideIdBody);

    @CD3("ride/complete")
    /* renamed from: k */
    AbstractC24507p<WireRideDetail> m93930k(@InterfaceC6404PY RideIdBody rideIdBody);

    @CD3("ride/status")
    /* renamed from: l */
    Observable<WireBird> m93929l(@InterfaceC6404PY RideStatusBody rideStatusBody);

    @CD3("ride/physical-lock-event")
    /* renamed from: m */
    AbstractC23442F<HM4<PhysicalLockEvent>> m93928m(@InterfaceC6404PY PhysicalLockEvent physicalLockEvent);

    @AD3("ride-dispute/create")
    /* renamed from: n */
    AbstractC23442F<DisputeRideCreateResponse> m93927n(@InterfaceC6404PY DisputeRideCreateRequest disputeRideCreateRequest);

    @NA1("ride/history")
    /* renamed from: o */
    Observable<CollectionResponse<RideSummary>> m93926o(@InterfaceC37017Xc4("offset") int i, @InterfaceC37017Xc4("limit") int i2);

    @AD3("ride/helmet-selfie-detection")
    /* renamed from: p */
    AbstractC23442F<DetectHelmetSelfieResponse> m93925p(@InterfaceC6404PY DetectHelmetSelfieRequest detectHelmetSelfieRequest);

    @AD3("ride-dispute/finalize")
    /* renamed from: q */
    AbstractC23442F<DisputeRideFinalizeResponse> m93924q(@InterfaceC6404PY DisputeRideFinalizeRequest disputeRideFinalizeRequest);

    @CD3("ride/photo")
    /* renamed from: r */
    AbstractC23442F<WireRide> m93923r(@InterfaceC6404PY UpdateRidePhotoBody updateRidePhotoBody);
}
