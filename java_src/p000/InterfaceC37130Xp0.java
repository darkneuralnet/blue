package p000;

import co.bird.android.model.wire.WireComplaintResolutionFormResponse;
import co.bird.api.request.ComplaintResolutionSubmissionRequest;
import co.bird.api.request.ComplaintResolutionUpdateRequest;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\b\b\u0001\u0010\u0006\u001a\u00020\tH'¨\u0006\u000b"}, m28432d2 = {"LXp0;", "", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireComplaintResolutionFormResponse;", C17296a.f69688o, "Lco/bird/api/request/ComplaintResolutionSubmissionRequest;", "body", "", "c", "Lco/bird/api/request/ComplaintResolutionUpdateRequest;", "b", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Xp0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC37130Xp0 {
    @NA1("api/v1/complaint-resolution/resolution-form")
    /* renamed from: a */
    AbstractC23442F<WireComplaintResolutionFormResponse> m76314a();

    @AD3("api/v1/complaint-resolution/update-multiple-resolutions")
    /* renamed from: b */
    AbstractC23442F<Unit> m76313b(@InterfaceC6404PY ComplaintResolutionUpdateRequest complaintResolutionUpdateRequest);

    @AD3("api/v1/complaint-resolution/submit-multiple-resolutions")
    /* renamed from: c */
    AbstractC23442F<Unit> m76312c(@InterfaceC6404PY ComplaintResolutionSubmissionRequest complaintResolutionSubmissionRequest);
}
