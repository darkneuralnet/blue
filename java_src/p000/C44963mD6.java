package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.Issue;
import co.bird.android.model.LegacyRepair;
import co.bird.android.model.User;
import co.bird.android.model.WorkOrder;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0012\u001a\u00020\bH\u0002R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, m28432d2 = {"LmD6;", "LkD6;", "Lco/bird/android/model/BirdSummaryBody;", "birdSummary", "Lco/bird/android/model/WorkOrder;", "workOrder", "Lio/reactivex/F;", "", "LH6;", C17296a.f69688o, "e", "h", "Lco/bird/android/model/Issue;", "issue", "Lco/bird/android/model/LegacyRepair;", "repairs", "g", "f", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LTq4;", "b", "LTq4;", "reactiveConfig", "Ljava/text/SimpleDateFormat;", "c", "Ljava/text/SimpleDateFormat;", "dateFormatter", "<init>", "(Landroid/content/Context;LTq4;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkOrderDetailsConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderDetailsConverter.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,103:1\n1549#2:104\n1620#2,3:105\n1549#2:109\n1620#2,2:110\n766#2:112\n857#2,2:113\n1622#2:115\n1#3:108\n37#4,2:116\n*S KotlinDebug\n*F\n+ 1 WorkOrderDetailsConverter.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsConverterImpl\n*L\n68#1:104\n68#1:105,3\n34#1:109\n34#1:110,2\n35#1:112\n35#1:113,2\n34#1:115\n46#1:116,2\n*E\n"})
/* renamed from: mD6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44963mD6 implements InterfaceC43777kD6 {

    /* renamed from: a */
    public final Context f97672a;

    /* renamed from: b */
    public final C36207Tq4 f97673b;

    /* renamed from: c */
    public final SimpleDateFormat f97674c;

    public C44963mD6(Context context, C36207Tq4 reactiveConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f97672a = context;
        this.f97673b = reactiveConfig;
        this.f97674c = new SimpleDateFormat("MMMM dd, yyyy", Locale.getDefault());
    }

    /* renamed from: c */
    public static final List m25939c(C44963mD6 this$0, BirdSummaryBody birdSummary, WorkOrder workOrder) {
        int collectionSizeOrDefault;
        C3023H6 c3023h6;
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(birdSummary, "$birdSummary");
        Intrinsics.checkNotNullParameter(workOrder, "$workOrder");
        C3023H6 m25937e = this$0.m25937e(birdSummary);
        C3023H6 m25934h = this$0.m25934h(workOrder);
        List<Issue> issues = workOrder.getIssues();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(issues, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (Issue issue : issues) {
            List<LegacyRepair> arrayList2 = new ArrayList<>();
            for (Object obj : workOrder.getRepairs()) {
                if (Intrinsics.areEqual(((LegacyRepair) obj).getIssueTypeId(), issue.getIssueTypeId())) {
                    arrayList2.add(obj);
                }
            }
            arrayList.add(this$0.m25935g(issue, arrayList2));
        }
        C3023H6 m25936f = this$0.m25936f(workOrder);
        boolean enabled = this$0.f97673b.m82623f8().getValue().getServiceCenterConfig().getRoutingOnRails().getEnabled();
        if (!workOrder.getStatus().isClosed() && !enabled) {
            c3023h6 = this$0.m25938d();
        } else {
            c3023h6 = null;
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
        spreadBuilder.add(m25937e);
        spreadBuilder.add(m25934h);
        spreadBuilder.addSpread(arrayList.toArray(new C3023H6[0]));
        spreadBuilder.add(m25936f);
        spreadBuilder.add(c3023h6);
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(spreadBuilder.toArray(new C3023H6[spreadBuilder.size()]));
        return listOfNotNull;
    }

    @Override // p000.InterfaceC43777kD6
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo25941a(final BirdSummaryBody birdSummary, final WorkOrder workOrder) {
        Intrinsics.checkNotNullParameter(birdSummary, "birdSummary");
        Intrinsics.checkNotNullParameter(workOrder, "workOrder");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: lD6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m25939c;
                m25939c = C44963mD6.m25939c(C44963mD6.this, birdSummary, workOrder);
                return m25939c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      val… addSection\n      )\n    }");
        return m33161E;
    }

    /* renamed from: d */
    public final C3023H6 m25938d() {
        return new C3023H6(new ArrayList(), new C2637G6(this.f97672a.getString(C45871nl4.work_order_details_add_header), C37080Xj4.item_work_order_details_header, false, 4, null), new C2637G6(null, C37080Xj4.item_work_order_details_add, false, 4, null));
    }

    /* renamed from: e */
    public final C3023H6 m25937e(BirdSummaryBody birdSummaryBody) {
        return new C3023H6(new ArrayList(), new C2637G6(C29888wT.m6789b(birdSummaryBody, this.f97672a), C37080Xj4.item_bird_code_and_model, false, 4, null), null, 4, null);
    }

    /* renamed from: f */
    public final C3023H6 m25936f(WorkOrder workOrder) {
        String str;
        List mutableListOf;
        Date date;
        C2637G6 c2637g6 = new C2637G6(this.f97672a.getString(C45871nl4.work_order_details), C37080Xj4.item_work_order_details_header, false, 4, null);
        String string = this.f97672a.getString(C45871nl4.work_order_details_created_by);
        User user = workOrder.getUser();
        String str2 = null;
        if (user != null) {
            str = user.getEmail();
        } else {
            str = null;
        }
        Pair m28425to = TuplesKt.m28425to(string, str);
        int i = C37080Xj4.item_work_order_details;
        C2637G6 c2637g62 = new C2637G6(m28425to, i, false, 4, null);
        C2637G6 c2637g63 = new C2637G6(TuplesKt.m28425to(this.f97672a.getString(C45871nl4.work_order_details_source), workOrder.getSourceDisplay()), i, false, 4, null);
        String string2 = this.f97672a.getString(C45871nl4.work_order_details_date);
        DateTime createdAt = workOrder.getCreatedAt();
        if (createdAt != null && (date = createdAt.toDate()) != null) {
            str2 = this.f97674c.format(date);
        }
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(c2637g62, c2637g63, new C2637G6(TuplesKt.m28425to(string2, str2), i, false, 4, null), new C2637G6(TuplesKt.m28425to(this.f97672a.getString(C45871nl4.work_order_details_note), workOrder.getNotes()), i, false, 4, null));
        return new C3023H6(mutableListOf, c2637g6, null, 4, null);
    }

    /* renamed from: g */
    public final C3023H6 m25935g(Issue issue, List<LegacyRepair> list) {
        int collectionSizeOrDefault;
        List mutableList;
        C2637G6 c2637g6 = new C2637G6(issue, C37080Xj4.item_issue_header, false, 4, null);
        List<LegacyRepair> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (LegacyRepair legacyRepair : list2) {
            arrayList.add(new C2637G6(legacyRepair, C37080Xj4.item_work_order_repair, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, c2637g6, null, 4, null);
    }

    /* renamed from: h */
    public final C3023H6 m25934h(WorkOrder workOrder) {
        return new C3023H6(new ArrayList(), new C2637G6(TuplesKt.m28425to(workOrder, this.f97672a.getString(C45871nl4.work_order_issues_format, Integer.valueOf(workOrder.getIssues().size()))), C37080Xj4.item_work_order_header, false, 4, null), null, 4, null);
    }
}
