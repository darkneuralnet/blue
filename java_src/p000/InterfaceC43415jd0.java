package p000;

import co.bird.api.request.CannotAccessReportRequest;
import co.bird.api.request.PropertyReportBody;
import co.bird.api.response.CannotAccessBirdReport;
import co.bird.api.response.CannotAccessReportResponse;
import co.bird.api.response.PropertyReport;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000eH'¨\u0006\u0011"}, m28432d2 = {"Ljd0;", "", "Lco/bird/api/request/CannotAccessReportRequest;", "request", "Lio/reactivex/F;", "LHM4;", "Lco/bird/api/response/CannotAccessBirdReport;", "b", "", "birdId", "Lco/bird/api/response/CannotAccessReportResponse;", "l", "", "k", "Lco/bird/api/request/PropertyReportBody;", "Lco/bird/api/response/PropertyReport;", C17296a.f69688o, "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jd0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC43415jd0 {
    @AD3("private-property/submit")
    /* renamed from: a */
    AbstractC23442F<HM4<PropertyReport>> m30195a(@InterfaceC6404PY PropertyReportBody propertyReportBody);

    @AD3("cannot-access/submit")
    /* renamed from: b */
    AbstractC23442F<HM4<CannotAccessBirdReport>> m30194b(@InterfaceC6404PY CannotAccessReportRequest cannotAccessReportRequest);

    @NA1("/cannot-access/open-by-bird-id")
    /* renamed from: k */
    AbstractC23442F<List<CannotAccessReportResponse>> m30193k(@InterfaceC37017Xc4("bird_id") String str);

    @NA1("cannot-access/latest")
    /* renamed from: l */
    AbstractC23442F<HM4<CannotAccessReportResponse>> m30192l(@InterfaceC37017Xc4("bird_id") String str);
}
