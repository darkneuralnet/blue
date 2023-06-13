package p000;

import co.bird.android.model.wire.WireCaptureValidation;
import co.bird.api.request.BirdIdBody;
import co.bird.api.request.BulkCaptureRequest;
import co.bird.api.request.CaptureValidationRequest;
import co.bird.api.response.BulkCaptureResponse;
import co.bird.api.response.QuickCaptureCancelResponse;
import co.bird.api.response.QuickCaptureResponse;
import co.bird.api.response.QuickCaptureStateResponse;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\nH'J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\nH'J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u000fH'¨\u0006\u0013"}, m28432d2 = {"Lef0;", "", "Lco/bird/api/request/CaptureValidationRequest;", "body", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireCaptureValidation;", "i", "Lco/bird/api/request/BulkCaptureRequest;", "Lco/bird/api/response/BulkCaptureResponse;", "k", "Lco/bird/api/request/BirdIdBody;", "Lco/bird/api/response/QuickCaptureResponse;", "j", "Lco/bird/api/response/QuickCaptureCancelResponse;", "l", "", "birdId", "Lco/bird/api/response/QuickCaptureStateResponse;", "h", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ef0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC40470ef0 {
    @NA1("capture/quick-capture-state")
    /* renamed from: h */
    AbstractC23442F<QuickCaptureStateResponse> m42660h(@InterfaceC37017Xc4("bird_id") String str);

    @AD3("capture/validate")
    /* renamed from: i */
    AbstractC23442F<WireCaptureValidation> m42659i(@InterfaceC6404PY CaptureValidationRequest captureValidationRequest);

    @AD3("capture/quick-capture")
    /* renamed from: j */
    AbstractC23442F<QuickCaptureResponse> m42658j(@InterfaceC6404PY BirdIdBody birdIdBody);

    @AD3("capture/capture")
    /* renamed from: k */
    AbstractC23442F<BulkCaptureResponse> m42657k(@InterfaceC6404PY BulkCaptureRequest bulkCaptureRequest);

    @AD3("capture/cancel-quick-capture")
    /* renamed from: l */
    AbstractC23442F<QuickCaptureCancelResponse> m42656l(@InterfaceC6404PY BirdIdBody birdIdBody);
}
