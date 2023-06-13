package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.Issue;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.RepairType;
import co.bird.android.model.RepairTypeLock;
import co.bird.android.model.WorkOrder;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJX\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0\u00102\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m28432d2 = {"LUB4;", "LuD;", "LSB4;", "Lco/bird/android/model/BirdSummaryBody;", "birdSummaryBody", "Lco/bird/android/model/MobilePartner;", "partner", "Lco/bird/android/model/WorkOrder;", "workOrder", "", "Lco/bird/android/model/Issue;", "", "Lco/bird/android/model/RepairType;", "issueRepairs", "Lco/bird/android/model/RepairTypeLock;", "repairs", "Lio/reactivex/F;", "LH6;", "f", "y", "z", "LTq4;", "b", "LTq4;", "reactiveConfig", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;LTq4;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairOverviewConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairOverviewConverter.kt\nco/bird/android/feature/repair/v1/overview/adapters/RepairOverviewConverterImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,70:1\n1#2:71\n37#3,2:72\n*S KotlinDebug\n*F\n+ 1 RepairOverviewConverter.kt\nco/bird/android/feature/repair/v1/overview/adapters/RepairOverviewConverterImpl\n*L\n40#1:72,2\n*E\n"})
/* renamed from: UB4 */
/* loaded from: classes3.dex */
public final class UB4 extends AbstractC29118uD implements SB4 {

    /* renamed from: b */
    public final C36207Tq4 f36938b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UB4(Context context, C36207Tq4 reactiveConfig) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f36938b = reactiveConfig;
    }

    /* renamed from: x */
    public static final List m81885x(UB4 this$0, BirdSummaryBody birdSummaryBody, MobilePartner mobilePartner, WorkOrder workOrder, Map issueRepairs, List repairs) {
        C3023H6 c3023h6;
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(birdSummaryBody, "$birdSummaryBody");
        Intrinsics.checkNotNullParameter(issueRepairs, "$issueRepairs");
        Intrinsics.checkNotNullParameter(repairs, "$repairs");
        C3023H6 generateVehicleSummarySection$default = AbstractC28540tA.generateVehicleSummarySection$default(this$0, birdSummaryBody, null, mobilePartner, 2, null);
        C3023H6 m10606s = this$0.m10606s(this$0.m12962m().getString(C45871nl4.bird_status_view_command_center));
        C3023H6 m10607r = this$0.m10607r();
        C3023H6 m81884y = this$0.m81884y();
        if (workOrder != null) {
            c3023h6 = this$0.m81883z(workOrder);
        } else {
            c3023h6 = null;
        }
        List<C3023H6> m10605t = this$0.m10605t(issueRepairs, repairs);
        SpreadBuilder spreadBuilder = new SpreadBuilder(6);
        spreadBuilder.add(generateVehicleSummarySection$default);
        spreadBuilder.add(m10606s);
        spreadBuilder.add(m10607r);
        spreadBuilder.add(m81884y);
        spreadBuilder.add(c3023h6);
        spreadBuilder.addSpread(m10605t.toArray(new C3023H6[0]));
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(spreadBuilder.toArray(new C3023H6[spreadBuilder.size()]));
        return listOfNotNull;
    }

    @Override // p000.SB4
    /* renamed from: f */
    public AbstractC23442F<List<C3023H6>> mo81887f(final BirdSummaryBody birdSummaryBody, final MobilePartner mobilePartner, final WorkOrder workOrder, final Map<Issue, ? extends List<RepairType>> issueRepairs, final List<RepairTypeLock> repairs) {
        Intrinsics.checkNotNullParameter(birdSummaryBody, "birdSummaryBody");
        Intrinsics.checkNotNullParameter(issueRepairs, "issueRepairs");
        Intrinsics.checkNotNullParameter(repairs, "repairs");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: TB4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m81885x;
                m81885x = UB4.m81885x(UB4.this, birdSummaryBody, mobilePartner, workOrder, issueRepairs, repairs);
                return m81885x;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      val…Schedulers.computation())");
        return m33142Y;
    }

    /* renamed from: y */
    public final C3023H6 m81884y() {
        if (this.f36938b.m82623f8().getValue().getOperatorConfig().getFeatures().getIdTool().getEnabled()) {
            return new C3023H6(new ArrayList(), new C2637G6(new C48040rQ1(m12962m().getString(C45871nl4.id_tools_title)), C45268mk4.item_button_secondary, false, 4, null), null, 4, null);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0050, code lost:
        if (r0 != false) goto L8;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3023H6 m81883z(WorkOrder workOrder) {
        boolean isBlank;
        boolean z = false;
        C3023H6 c3023h6 = new C3023H6(new ArrayList(), new C2637G6(TuplesKt.m28425to(workOrder, m12962m().getString(C45871nl4.work_order_issues_format, Integer.valueOf(workOrder.getIssues().size()))), C32634Ej4.item_repair_work_order_header, false, 4, null), new C2637G6(workOrder.getNotes(), C32634Ej4.item_repair_notes, false, 4, null));
        String notes = workOrder.getNotes();
        if (notes != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(notes);
        }
        z = true;
        c3023h6.m104406g(!z);
        return c3023h6;
    }
}
