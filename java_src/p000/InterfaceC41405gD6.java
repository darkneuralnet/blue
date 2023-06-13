package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueType;
import co.bird.android.model.LegacyRepair;
import co.bird.android.model.QCInspection;
import co.bird.android.model.RepairScope;
import co.bird.android.model.RepairType;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.constant.QCKind;
import co.bird.api.request.InspectionEventRequestBody;
import co.bird.api.request.IssueCreateMultipleBody;
import co.bird.api.request.IssueUpdateStatusMultipleBody;
import co.bird.api.request.QCAutoCheckRequestBody;
import co.bird.api.request.QCInspectionProcessRequestBody;
import co.bird.api.request.RepairCompletedEventBody;
import co.bird.api.request.RepairStartedEventBody;
import co.bird.api.request.WorkOrderCreateBody;
import co.bird.api.request.WorkOrderRepairsBody;
import co.bird.api.request.WorkOrderUpdateNotesBody;
import co.bird.api.request.WorkOrderUpdateStatusBody;
import co.bird.api.response.QCAutoCheckResponseBody;
import co.bird.api.response.WorkOrderAssetManifest;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J:\u0010\r\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u000b0\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'J.\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u00050\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'J$\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\f0\u00050\u00042\b\b\u0001\u0010\u0011\u001a\u00020\u0010H'J$\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\f0\u00050\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'J\u001e\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00050\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u0016H'J\u001e\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00050\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u001aH'J\u001e\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00050\u00042\b\b\u0001\u0010\u001e\u001a\u00020\u001dH'J$\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\f0\u00050\u00042\b\b\u0001\u0010 \u001a\u00020\u0002H'J\u001e\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00050\u00042\b\b\u0001\u0010 \u001a\u00020\u0002H'J$\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\f0\u00050\u00042\b\b\u0001\u0010$\u001a\u00020#H'J8\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\f0\u00050\u00042\b\b\u0001\u0010 \u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'J$\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\f0\u00050\u00042\b\b\u0001\u0010)\u001a\u00020(H'J$\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\f0\u00050\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u0002H'J:\u0010/\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020-\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\f0\u000b0\u00050\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H'J\u001e\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00050\u00042\b\b\u0001\u0010$\u001a\u000200H'J\u001e\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040\u00050\u00042\b\b\u0001\u0010$\u001a\u000203H'J\u0012\u00108\u001a\u0002072\b\b\u0001\u0010$\u001a\u000206H'J\u001e\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\b\b\u0001\u0010$\u001a\u000209H'J\u0012\u0010<\u001a\u0002072\b\b\u0001\u0010$\u001a\u00020;H'J'\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00050\u00042\n\b\u0001\u0010>\u001a\u0004\u0018\u00010=H'¢\u0006\u0004\b@\u0010A¨\u0006B"}, m28432d2 = {"LgD6;", "", "", "id", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/IssueType;", C17296a.f69688o, RequestHeadersFactory.MODEL, "Lco/bird/android/model/RepairScope;", Action.SCOPE_ATTRIBUTE, "", "", "h", "mode", DateTokenConverter.CONVERTER_KEY, "Lco/bird/api/request/IssueCreateMultipleBody;", "issueCreateMultipleBody", "Lco/bird/android/model/Issue;", "m", "workOrderId", "e", "Lco/bird/api/request/WorkOrderCreateBody;", "workOrderCreateBody", "Lco/bird/android/model/WorkOrder;", "g", "Lco/bird/api/request/WorkOrderUpdateStatusBody;", "workOrderUpdateStatusBody", "t", "Lco/bird/api/request/WorkOrderUpdateNotesBody;", "workOrderUpdateNotesBody", "o", "birdId", "k", "r", "Lco/bird/api/request/IssueUpdateStatusMultipleBody;", "body", "s", "Lco/bird/android/model/RepairType;", "b", "Lco/bird/api/request/WorkOrderRepairsBody;", "repairsBody", "Lco/bird/android/model/LegacyRepair;", "i", "c", "Lco/bird/android/model/constant/QCKind;", "Lco/bird/android/model/QCInspection;", "f", "Lco/bird/api/request/QCInspectionProcessRequestBody;", "", "n", "Lco/bird/api/request/QCAutoCheckRequestBody;", "Lco/bird/api/response/QCAutoCheckResponseBody;", "u", "Lco/bird/api/request/InspectionEventRequestBody;", "Lio/reactivex/c;", "p", "Lco/bird/api/request/RepairStartedEventBody;", "l", "Lco/bird/api/request/RepairCompletedEventBody;", "q", "", "updatedAt", "Lco/bird/api/response/WorkOrderAssetManifest;", "j", "(Ljava/lang/Long;)Lio/reactivex/F;", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: gD6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC41405gD6 {
    @NA1("work-orders/issue-types/v2/by-id")
    /* renamed from: a */
    AbstractC23442F<HM4<IssueType>> m39867a(@InterfaceC37017Xc4("id") String str);

    @NA1("work-orders/repair-types/for-bird")
    /* renamed from: b */
    AbstractC23442F<HM4<List<RepairType>>> m39866b(@InterfaceC37017Xc4("bird_id") String str, @InterfaceC37017Xc4("model") String str2, @InterfaceC37017Xc4("scope") RepairScope repairScope);

    @NA1("work-orders/repairs/by-work-order-id")
    /* renamed from: c */
    AbstractC23442F<HM4<List<LegacyRepair>>> m39865c(@InterfaceC37017Xc4("work_order_id") String str);

    @NA1("work-orders/issue-types/by-model")
    /* renamed from: d */
    AbstractC23442F<HM4<List<IssueType>>> m39864d(@InterfaceC37017Xc4("model") String str, @InterfaceC37017Xc4("scope") RepairScope repairScope);

    @NA1("work-orders/issues/by-work-order-id")
    /* renamed from: e */
    AbstractC23442F<HM4<List<Issue>>> m39863e(@InterfaceC37017Xc4("work_order_id") String str);

    @NA1("work-orders/qc-inspections")
    /* renamed from: f */
    AbstractC23442F<HM4<Map<QCKind, List<QCInspection>>>> m39862f(@InterfaceC37017Xc4("work_order_id") String str, @InterfaceC37017Xc4("model") String str2);

    @AD3("work-orders/create")
    /* renamed from: g */
    AbstractC23442F<HM4<WorkOrder>> m39861g(@InterfaceC6404PY WorkOrderCreateBody workOrderCreateBody);

    @NA1("work-orders/issue-types/map-by-category")
    /* renamed from: h */
    AbstractC23442F<HM4<Map<String, List<IssueType>>>> m39860h(@InterfaceC37017Xc4("model") String str, @InterfaceC37017Xc4("scope") RepairScope repairScope);

    @AD3("work-orders/repairs/create-multiple")
    /* renamed from: i */
    AbstractC23442F<HM4<List<LegacyRepair>>> m39859i(@InterfaceC6404PY WorkOrderRepairsBody workOrderRepairsBody);

    @NA1("work-orders/assets/manifest")
    /* renamed from: j */
    AbstractC23442F<HM4<WorkOrderAssetManifest>> m39858j(@InterfaceC37017Xc4("updated_at") Long l);

    @NA1("work-orders/closed-by-bird-id")
    /* renamed from: k */
    AbstractC23442F<HM4<List<WorkOrder>>> m39857k(@InterfaceC37017Xc4("bird_id") String str);

    @AD3("work-orders/events/repair-started")
    /* renamed from: l */
    AbstractC23442F<HM4<String>> m39856l(@InterfaceC6404PY RepairStartedEventBody repairStartedEventBody);

    @AD3("work-orders/issues/create-multiple")
    /* renamed from: m */
    AbstractC23442F<HM4<List<Issue>>> m39855m(@InterfaceC6404PY IssueCreateMultipleBody issueCreateMultipleBody);

    @CD3("work-orders/qc-inspections/v2/process")
    /* renamed from: n */
    AbstractC23442F<HM4<Boolean>> m39854n(@InterfaceC6404PY QCInspectionProcessRequestBody qCInspectionProcessRequestBody);

    @CD3("work-orders/update-notes")
    /* renamed from: o */
    AbstractC23442F<HM4<WorkOrder>> m39853o(@InterfaceC6404PY WorkOrderUpdateNotesBody workOrderUpdateNotesBody);

    @AD3("work-orders/events/inspection")
    /* renamed from: p */
    AbstractC23461c m39852p(@InterfaceC6404PY InspectionEventRequestBody inspectionEventRequestBody);

    @AD3("work-orders/events/repair-session-completed")
    /* renamed from: q */
    AbstractC23461c m39851q(@InterfaceC6404PY RepairCompletedEventBody repairCompletedEventBody);

    @NA1("work-orders/open-by-bird-id")
    /* renamed from: r */
    AbstractC23442F<HM4<WorkOrder>> m39850r(@InterfaceC37017Xc4("bird_id") String str);

    @AD3("work-orders/issues/v2/update-multiple")
    /* renamed from: s */
    AbstractC23442F<HM4<List<Issue>>> m39849s(@InterfaceC6404PY IssueUpdateStatusMultipleBody issueUpdateStatusMultipleBody);

    @CD3("work-orders/update-status")
    /* renamed from: t */
    AbstractC23442F<HM4<WorkOrder>> m39848t(@InterfaceC6404PY WorkOrderUpdateStatusBody workOrderUpdateStatusBody);

    @AD3("work-orders/qc-inspections/automated-checks/start")
    /* renamed from: u */
    AbstractC23442F<HM4<QCAutoCheckResponseBody>> m39847u(@InterfaceC6404PY QCAutoCheckRequestBody qCAutoCheckRequestBody);
}
