package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.WorkOrderStatus;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.ServiceCenterRoute;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\f\u001a\u00020\nH\u0002J$\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\u0016\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0002R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LVD6;", "LTD6;", "Lco/bird/android/model/constant/BirdModel;", RequestHeadersFactory.MODEL, "Lco/bird/android/model/WorkOrder;", "workOrder", "Lco/bird/android/model/constant/ServiceCenterRoute;", "route", "Lio/reactivex/F;", "", "LH6;", C17296a.f69688o, "e", "f", "Lco/bird/android/model/Issue;", "failedIssues", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkOrderInspectionCompleteConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderInspectionCompleteConverter.kt\nco/bird/android/feature/workorders/inspection/dialog/inspectioncomplete/adapters/WorkOrderInspectionCompleteConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,105:1\n1549#2:106\n1620#2,3:107\n766#2:110\n857#2,2:111\n*S KotlinDebug\n*F\n+ 1 WorkOrderInspectionCompleteConverter.kt\nco/bird/android/feature/workorders/inspection/dialog/inspectioncomplete/adapters/WorkOrderInspectionCompleteConverterImpl\n*L\n94#1:106\n94#1:107,3\n32#1:110\n32#1:111,2\n*E\n"})
/* renamed from: VD6 */
/* loaded from: classes3.dex */
public final class VD6 implements TD6 {

    /* renamed from: a */
    public final Context f38760a;

    public VD6(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38760a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final List m80191c(WorkOrder workOrder, VD6 this$0, BirdModel model, ServiceCenterRoute serviceCenterRoute) {
        List list;
        List listOf;
        List<Issue> issues;
        boolean z;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(model, "$model");
        if (workOrder != null && (issues = workOrder.getIssues()) != null) {
            list = new ArrayList();
            for (Object obj : issues) {
                if (((Issue) obj).getStatus() == IssueStatus.OPEN) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    list.add(obj);
                }
            }
        } else {
            list = null;
        }
        C3023H6[] c3023h6Arr = new C3023H6[3];
        c3023h6Arr[0] = this$0.m80189e();
        c3023h6Arr[1] = this$0.m80188f(model, workOrder, serviceCenterRoute);
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        c3023h6Arr[2] = this$0.m80190d(list);
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) c3023h6Arr);
        return listOf;
    }

    @Override // p000.TD6
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo80193a(final BirdModel model, final WorkOrder workOrder, final ServiceCenterRoute serviceCenterRoute) {
        Intrinsics.checkNotNullParameter(model, "model");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: UD6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m80191c;
                m80191c = VD6.m80191c(WorkOrder.this, this, model, serviceCenterRoute);
                return m80191c;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      val…Schedulers.computation())");
        return m33142Y;
    }

    /* renamed from: d */
    public final C3023H6 m80190d(List<Issue> list) {
        int collectionSizeOrDefault;
        List mutableList;
        List<Issue> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Issue issue : list2) {
            arrayList.add(new C2637G6(issue, C37080Xj4.item_issue_header, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, null, null, 6, null);
    }

    /* renamed from: e */
    public final C3023H6 m80189e() {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(null, C37080Xj4.item_inspection_complete, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: f */
    public final C3023H6 m80188f(BirdModel birdModel, WorkOrder workOrder, ServiceCenterRoute serviceCenterRoute) {
        WorkOrderStatus workOrderStatus;
        String string;
        String string2;
        int m94301c;
        List mutableListOf;
        if (serviceCenterRoute == ServiceCenterRoute.CHARGE) {
            string = this.f38760a.getString(C45871nl4.work_order_inspection_dialog_charge_only);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…ction_dialog_charge_only)");
            string2 = this.f38760a.getString(C45871nl4.work_order_inspection_dialog_instruction_charge_only);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…_instruction_charge_only)");
            m94301c = NA0.m94301c(this.f38760a, C32364Df4.green);
        } else if (serviceCenterRoute == ServiceCenterRoute.SERVICE_COMPLETE) {
            string = this.f38760a.getString(C45871nl4.work_order_inspection_dialog_service_complete);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…_dialog_service_complete)");
            string2 = this.f38760a.getString(C45871nl4.work_order_inspection_dialog_instruction_service_complete);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…ruction_service_complete)");
            m94301c = NA0.m94301c(this.f38760a, C32364Df4.green);
        } else {
            if (workOrder != null) {
                workOrderStatus = workOrder.getStatus();
            } else {
                workOrderStatus = null;
            }
            if (workOrderStatus == WorkOrderStatus.QUALITY_CONTROL) {
                string = this.f38760a.getString(C45871nl4.work_order_inspection_dialog_quality_control);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…n_dialog_quality_control)");
                string2 = this.f38760a.getString(C45871nl4.work_order_inspection_dialog_instruction_quality_control);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…truction_quality_control)");
                m94301c = NA0.m94301c(this.f38760a, C32364Df4.green);
            } else {
                string = this.f38760a.getString(C45871nl4.work_order_inspection_dialog_awaiting_repair);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…n_dialog_awaiting_repair)");
                string2 = this.f38760a.getString(C45871nl4.work_order_inspection_dialog_instruction_awaiting_repair);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…truction_awaiting_repair)");
                m94301c = NA0.m94301c(this.f38760a, C32364Df4.yellow);
            }
        }
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new S32(string, string2, birdModel, m94301c), C37080Xj4.item_inspection_complete_instructions, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }
}
