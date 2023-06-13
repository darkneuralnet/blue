package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireBird;
import co.bird.api.request.StartTaskBody;
import co.bird.api.request.TaskCancelRequestBody;
import co.bird.api.request.TaskIdBody;
import co.bird.api.request.TaskIssueBody;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H'J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f0\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\rH'¨\u0006\u0011"}, m28432d2 = {"LjZ5;", "", "Lco/bird/api/request/StartTaskBody;", "body", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBird;", "e", "Lco/bird/api/request/TaskIdBody;", "c", "Lco/bird/api/request/TaskIssueBody;", "f", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "Lco/bird/api/request/TaskCancelRequestBody;", "Lio/reactivex/F;", "LHM4;", "b", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jZ5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC43381jZ5 {
    @CD3("task/repaired")
    /* renamed from: a */
    Observable<WireBird> m30323a(@InterfaceC6404PY TaskIdBody taskIdBody);

    @AD3("task/cancel-request")
    /* renamed from: b */
    AbstractC23442F<HM4<WireBird>> m30322b(@InterfaceC6404PY TaskCancelRequestBody taskCancelRequestBody);

    @CD3("task/complete")
    /* renamed from: c */
    Observable<WireBird> m30321c(@InterfaceC6404PY TaskIdBody taskIdBody);

    @CD3("task/escalate")
    /* renamed from: d */
    Observable<WireBird> m30320d(@InterfaceC6404PY TaskIdBody taskIdBody);

    @AD3("task")
    /* renamed from: e */
    Observable<WireBird> m30319e(@InterfaceC6404PY StartTaskBody startTaskBody);

    @AD3("task/issues")
    /* renamed from: f */
    Observable<WireBird> m30318f(@InterfaceC6404PY TaskIssueBody taskIssueBody);
}
