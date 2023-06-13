package p000;

import co.bird.api.request.BeaconConfigurationConfirmationRequestBody;
import co.bird.api.request.BeaconConfigurationRequestRequestBody;
import co.bird.api.response.BeaconConfigurationConfirmationResponseBody;
import co.bird.api.response.BeaconConfigurationRequestResponseBody;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¨\u0006\u000b"}, m28432d2 = {"LYF;", "", "Lco/bird/api/request/BeaconConfigurationRequestRequestBody;", "body", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/response/BeaconConfigurationRequestResponseBody;", C17296a.f69688o, "Lco/bird/api/request/BeaconConfigurationConfirmationRequestBody;", "Lco/bird/api/response/BeaconConfigurationConfirmationResponseBody;", "b", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: YF */
/* loaded from: classes4.dex */
public interface InterfaceC9749YF {
    @AD3("v2/beacon-configuration/request")
    /* renamed from: a */
    AbstractC23442F<HM4<BeaconConfigurationRequestResponseBody>> m75298a(@InterfaceC6404PY BeaconConfigurationRequestRequestBody beaconConfigurationRequestRequestBody);

    @AD3("v2/beacon-configuration/confirm")
    /* renamed from: b */
    AbstractC23442F<HM4<BeaconConfigurationConfirmationResponseBody>> m75297b(@InterfaceC6404PY BeaconConfigurationConfirmationRequestBody beaconConfigurationConfirmationRequestBody);
}
