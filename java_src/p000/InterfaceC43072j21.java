package p000;

import co.bird.api.request.DeviceCheckConfirmRequest;
import co.bird.api.request.DeviceCheckSendRequest;
import co.bird.api.response.DeviceCheckConfirmResponse;
import co.bird.api.response.DeviceCheckSendResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'¨\u0006\n"}, m28432d2 = {"Lj21;", "", "Lco/bird/api/request/DeviceCheckConfirmRequest;", "request", "Lio/reactivex/F;", "Lco/bird/api/response/DeviceCheckConfirmResponse;", "b", "Lco/bird/api/request/DeviceCheckSendRequest;", "Lco/bird/api/response/DeviceCheckSendResponse;", C17296a.f69688o, "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: j21  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC43072j21 {
    @AD3("/v1/device-check/send")
    /* renamed from: a */
    AbstractC23442F<DeviceCheckSendResponse> m31235a(@InterfaceC6404PY DeviceCheckSendRequest deviceCheckSendRequest);

    @AD3("/v1/device-check/confirm")
    /* renamed from: b */
    AbstractC23442F<DeviceCheckConfirmResponse> m31234b(@InterfaceC6404PY DeviceCheckConfirmRequest deviceCheckConfirmRequest);
}
