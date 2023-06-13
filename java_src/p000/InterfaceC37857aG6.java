package p000;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueCreateSource;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.IssueType;
import co.bird.android.model.LegacyRepair;
import co.bird.android.model.QCAutoCheck;
import co.bird.android.model.QCInspection;
import co.bird.android.model.RepairScope;
import co.bird.android.model.RepairSource;
import co.bird.android.model.RepairType;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.WorkOrderCreateSource;
import co.bird.android.model.WorkOrderStatus;
import co.bird.android.model.WorkOrderStatusReason;
import co.bird.android.model.constant.QCKind;
import co.bird.api.response.QCAutoCheckResponseBody;
import co.bird.api.response.WorkOrderAssetManifest;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.Stripe3ds2AuthParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ8\u0010\u000b\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&J,\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\r\u001a\u00020\u0002H&J\"\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u0002H&J0\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\u00062\u0006\u0010\u0018\u001a\u00020\u0002H&J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00070\u00062\u0006\u0010\u0018\u001a\u00020\u0002H&J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001b0\u00062\u0006\u0010\u0018\u001a\u00020\u0002H&J\u001c\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001b0\u00062\u0006\u0010\u0018\u001a\u00020\u0002H&J0\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00022\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\tH&J@\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002H&J^\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\u0006\u0010\u0018\u001a\u00020\u00022\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\t2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*H&J2\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\t0\u00070\u00062\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\"\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\t0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u0002H&J6\u00102\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000200\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\t0\b0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J8\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u0002010\t2\f\u00105\u001a\b\u0012\u0004\u0012\u0002040\tH&J\u001c\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u0002H&J\u0018\u0010=\u001a\u00020<2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u000f\u001a\u00020\u0002H&J.\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u00062\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010>\u001a\u00020(H&J \u0010A\u001a\u00020<2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010>\u001a\u00020(H&J\u001e\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0\u00070\u00062\b\u0010B\u001a\u0004\u0018\u00010:H&¨\u0006E"}, m28432d2 = {"LaG6;", "", "", RequestHeadersFactory.MODEL, "Lco/bird/android/model/RepairScope;", Action.SCOPE_ATTRIBUTE, "Lio/reactivex/F;", "LHM4;", "", "", "Lco/bird/android/model/IssueType;", "j", DateTokenConverter.CONVERTER_KEY, "id", C17296a.f69688o, "workOrderId", "Lco/bird/android/model/Issue;", "e", "Lco/bird/android/model/WorkOrderStatus;", "status", "Lco/bird/android/model/WorkOrderStatusReason;", "reason", "Lco/bird/android/model/WorkOrder;", "t", "birdId", "r", "p", "Lco/bird/android/buava/Optional;", "h", "l", "issuesToUpdate", "k", "issueTypeIds", "notes", "u", "Lco/bird/android/model/RepairType;", "repairs", "issues", "Lco/bird/android/model/WorkOrderCreateSource;", "workOrderSource", "Lco/bird/android/model/RepairSource;", "repairSource", "Lco/bird/android/model/IssueCreateSource;", "issueSource", "s", "b", "Lco/bird/android/model/LegacyRepair;", "c", "Lco/bird/android/model/constant/QCKind;", "Lco/bird/android/model/QCInspection;", "f", "inspections", "Lco/bird/android/model/QCAutoCheck;", "qcAutoChecks", "", "g", "Lco/bird/api/response/QCAutoCheckResponseBody;", "o", "Lorg/joda/time/DateTime;", "time", "Lio/reactivex/c;", "i", Stripe3ds2AuthParams.FIELD_SOURCE, "n", "sessionId", "m", "updatedAt", "Lco/bird/api/response/WorkOrderAssetManifest;", "q", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: aG6 */
/* loaded from: classes2.dex */
public interface InterfaceC37857aG6 {

    /* renamed from: a */
    public static final C10608a f50208a = C10608a.f50209a;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m28432d2 = {"LaG6$a;", "", "", "Lco/bird/android/model/IssueStatus;", "b", "Ljava/util/Set;", C17296a.f69688o, "()Ljava/util/Set;", "UPDATABLE_STATUSES", "<init>", "()V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: aG6$a */
    /* loaded from: classes2.dex */
    public static final class C10608a {

        /* renamed from: a */
        public static final /* synthetic */ C10608a f50209a = new C10608a();

        /* renamed from: b */
        public static final Set<IssueStatus> f50210b;

        static {
            Set<IssueStatus> of;
            of = SetsKt__SetsKt.setOf((Object[]) new IssueStatus[]{IssueStatus.OPEN, IssueStatus.RESOLVED, IssueStatus.DISPUTED, IssueStatus.CANT_REPAIR});
            f50210b = of;
        }

        private C10608a() {
        }

        /* renamed from: a */
        public final Set<IssueStatus> m71717a() {
            return f50210b;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aG6$b */
    /* loaded from: classes2.dex */
    public static final class C10609b {
        public static /* synthetic */ AbstractC23442F getIssueTypesByModel$default(InterfaceC37857aG6 interfaceC37857aG6, String str, RepairScope repairScope, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    repairScope = RepairScope.SERVICE_CENTER;
                }
                return interfaceC37857aG6.mo19649d(str, repairScope);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIssueTypesByModel");
        }

        public static /* synthetic */ AbstractC23442F getIssuesMappedByCategory$default(InterfaceC37857aG6 interfaceC37857aG6, String str, RepairScope repairScope, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    repairScope = RepairScope.SERVICE_CENTER;
                }
                return interfaceC37857aG6.mo19643j(str, repairScope);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIssuesMappedByCategory");
        }

        public static /* synthetic */ AbstractC23442F logRepairs$default(InterfaceC37857aG6 interfaceC37857aG6, String str, List list, List list2, WorkOrderCreateSource workOrderCreateSource, RepairSource repairSource, IssueCreateSource issueCreateSource, int i, Object obj) {
            if (obj == null) {
                return interfaceC37857aG6.mo19634s(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : workOrderCreateSource, (i & 16) != 0 ? null : repairSource, (i & 32) == 0 ? issueCreateSource : null);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logRepairs");
        }

        public static /* synthetic */ AbstractC23442F submitWorkOrder$default(InterfaceC37857aG6 interfaceC37857aG6, String str, String str2, List list, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                if ((i & 2) != 0) {
                    str2 = null;
                }
                if ((i & 8) != 0) {
                    str3 = null;
                }
                return interfaceC37857aG6.mo19632u(str, str2, list, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitWorkOrder");
        }

        public static /* synthetic */ AbstractC23442F updateWorkOrderStatus$default(InterfaceC37857aG6 interfaceC37857aG6, String str, WorkOrderStatus workOrderStatus, WorkOrderStatusReason workOrderStatusReason, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    workOrderStatusReason = null;
                }
                return interfaceC37857aG6.mo19633t(str, workOrderStatus, workOrderStatusReason);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateWorkOrderStatus");
        }
    }

    /* renamed from: a */
    AbstractC23442F<HM4<IssueType>> mo19654a(String str);

    /* renamed from: b */
    AbstractC23442F<HM4<List<RepairType>>> mo19652b(String str, String str2, RepairScope repairScope);

    /* renamed from: c */
    AbstractC23442F<HM4<List<LegacyRepair>>> mo19650c(String str);

    /* renamed from: d */
    AbstractC23442F<HM4<List<IssueType>>> mo19649d(String str, RepairScope repairScope);

    /* renamed from: e */
    AbstractC23442F<HM4<List<Issue>>> mo19648e(String str);

    /* renamed from: f */
    AbstractC23442F<HM4<Map<QCKind, List<QCInspection>>>> mo19647f(String str, String str2);

    /* renamed from: g */
    AbstractC23442F<HM4<Boolean>> mo19646g(String str, List<QCInspection> list, List<QCAutoCheck> list2);

    /* renamed from: h */
    AbstractC23442F<Optional<WorkOrder>> mo19645h(String str);

    /* renamed from: i */
    AbstractC23461c mo19644i(DateTime dateTime, String str);

    /* renamed from: j */
    AbstractC23442F<HM4<Map<String, List<IssueType>>>> mo19643j(String str, RepairScope repairScope);

    /* renamed from: k */
    AbstractC23442F<HM4<List<Issue>>> mo19642k(String str, List<Issue> list);

    /* renamed from: l */
    AbstractC23442F<Optional<WorkOrder>> mo19641l(String str);

    /* renamed from: m */
    AbstractC23461c mo19640m(String str, String str2, RepairSource repairSource);

    /* renamed from: n */
    AbstractC23442F<HM4<String>> mo19639n(DateTime dateTime, String str, RepairSource repairSource);

    /* renamed from: o */
    AbstractC23442F<HM4<QCAutoCheckResponseBody>> mo19638o(String str);

    /* renamed from: p */
    AbstractC23442F<HM4<WorkOrder>> mo19637p(String str);

    /* renamed from: q */
    AbstractC23442F<HM4<WorkOrderAssetManifest>> mo19636q(DateTime dateTime);

    /* renamed from: r */
    AbstractC23442F<List<WorkOrder>> mo19635r(String str);

    /* renamed from: s */
    AbstractC23442F<WorkOrder> mo19634s(String str, List<RepairType> list, List<Issue> list2, WorkOrderCreateSource workOrderCreateSource, RepairSource repairSource, IssueCreateSource issueCreateSource);

    /* renamed from: t */
    AbstractC23442F<HM4<WorkOrder>> mo19633t(String str, WorkOrderStatus workOrderStatus, WorkOrderStatusReason workOrderStatusReason);

    /* renamed from: u */
    AbstractC23442F<WorkOrder> mo19632u(String str, String str2, List<String> list, String str3);
}
