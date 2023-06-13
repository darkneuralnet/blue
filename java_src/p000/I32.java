package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdInspection;
import co.bird.api.request.CloseInspectionBody;
import co.bird.api.request.InspectBody;
import co.bird.api.request.SubmitInspectionJobsBody;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007H'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\nH'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\fH'¨\u0006\u000e"}, m28432d2 = {"LI32;", "", "", "birdId", "Lio/reactivex/Observable;", "Lco/bird/android/model/BirdInspection;", C17296a.f69688o, "Lco/bird/api/request/InspectBody;", "body", "c", "Lco/bird/api/request/SubmitInspectionJobsBody;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/api/request/CloseInspectionBody;", "b", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: I32 */
/* loaded from: classes4.dex */
public interface I32 {
    @NA1("inspection/last")
    /* renamed from: a */
    Observable<BirdInspection> m103034a(@InterfaceC37017Xc4("bird_id") String str);

    @CD3("inspection/close")
    /* renamed from: b */
    Observable<BirdInspection> m103033b(@InterfaceC6404PY CloseInspectionBody closeInspectionBody);

    @AD3("inspection")
    /* renamed from: c */
    Observable<BirdInspection> m103032c(@InterfaceC6404PY InspectBody inspectBody);

    @AD3("inspection/job")
    /* renamed from: d */
    Observable<BirdInspection> m103031d(@InterfaceC6404PY SubmitInspectionJobsBody submitInspectionJobsBody);
}
