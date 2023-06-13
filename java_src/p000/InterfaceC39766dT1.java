package p000;

import co.bird.api.request.WireIdentificationIntentPermissionRequest;
import co.bird.api.request.WireIdentificationSubmitRequest;
import co.bird.api.response.WireIdentificationIntentPermissionResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'¨\u0006\t"}, m28432d2 = {"LdT1;", "", "Lco/bird/api/request/WireIdentificationIntentPermissionRequest;", "request", "Lio/reactivex/F;", "Lco/bird/api/response/WireIdentificationIntentPermissionResponse;", C17296a.f69688o, "Lco/bird/api/request/WireIdentificationSubmitRequest;", "b", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dT1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC39766dT1 {
    @AD3("api/identification/v1/query-intent-permission")
    /* renamed from: a */
    AbstractC23442F<WireIdentificationIntentPermissionResponse> m44235a(@InterfaceC6404PY WireIdentificationIntentPermissionRequest wireIdentificationIntentPermissionRequest);

    @AD3("api/identification/v1/submit")
    /* renamed from: b */
    AbstractC23442F<WireIdentificationIntentPermissionResponse> m44234b(@InterfaceC6404PY WireIdentificationSubmitRequest wireIdentificationSubmitRequest);
}
