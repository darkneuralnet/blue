package p000;

import co.bird.android.model.wire.ReleaseValidationResult;
import co.bird.api.request.NestItemScanRequest;
import co.bird.api.request.NestReleaseRequest;
import co.bird.api.response.ReleaseResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'¨\u0006\n"}, m28432d2 = {"Lw43;", "", "Lco/bird/api/request/NestItemScanRequest;", "body", "Lio/reactivex/F;", "Lco/bird/android/model/wire/ReleaseValidationResult;", "b", "Lco/bird/api/request/NestReleaseRequest;", "Lco/bird/api/response/ReleaseResponse;", C17296a.f69688o, "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: w43  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC50801w43 {
    @AD3("release/release")
    /* renamed from: a */
    AbstractC23442F<ReleaseResponse> m7469a(@InterfaceC6404PY NestReleaseRequest nestReleaseRequest);

    @AD3("release/validate")
    /* renamed from: b */
    AbstractC23442F<ReleaseValidationResult> m7468b(@InterfaceC6404PY NestItemScanRequest nestItemScanRequest);
}
