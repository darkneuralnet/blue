package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Issue;
import co.bird.android.model.LegacyRepair;
import co.bird.android.model.extension.IssueStatus_Kt;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016J\b\u0010\n\u001a\u00020\bH\u0002J$\u0010\u000b\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0002J&\u0010\f\u001a\u0004\u0018\u00010\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LGD4;", "LED4;", "", "Lco/bird/android/model/Issue;", "issues", "Lco/bird/android/model/LegacyRepair;", "repairs", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, "e", DateTokenConverter.CONVERTER_KEY, "f", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairSummaryConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSummaryConverter.kt\nco/bird/android/feature/repair/v2/supertypes/repairsummary/adapters/RepairSummaryConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n1360#2:100\n1446#2,5:101\n766#2:106\n857#2,2:107\n1549#2:109\n1620#2,2:110\n766#2:112\n857#2,2:113\n1549#2:115\n1620#2,3:116\n1622#2:119\n766#2:120\n857#2:121\n1747#2,3:122\n858#2:125\n1549#2:126\n1620#2,2:127\n766#2:129\n857#2,2:130\n1549#2:132\n1620#2,3:133\n1622#2:136\n*S KotlinDebug\n*F\n+ 1 RepairSummaryConverter.kt\nco/bird/android/feature/repair/v2/supertypes/repairsummary/adapters/RepairSummaryConverterImpl\n*L\n42#1:100\n42#1:101,5\n43#1:106\n43#1:107,2\n45#1:109\n45#1:110,2\n47#1:112\n47#1:113,2\n48#1:115\n48#1:116,3\n45#1:119\n69#1:120\n69#1:121\n70#1:122,3\n69#1:125\n75#1:126\n75#1:127,2\n77#1:129\n77#1:130,2\n78#1:132\n78#1:133,3\n75#1:136\n*E\n"})
/* renamed from: GD4 */
/* loaded from: classes3.dex */
public final class GD4 implements ED4 {

    /* renamed from: a */
    public final Context f11147a;

    public GD4(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f11147a = context;
    }

    /* renamed from: c */
    public static final List m105638c(GD4 this$0, List issues, List repairs) {
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(issues, "$issues");
        Intrinsics.checkNotNullParameter(repairs, "$repairs");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new C3023H6[]{this$0.m105636e(), this$0.m105637d(issues, repairs), this$0.m105635f(issues, repairs)});
        return listOfNotNull;
    }

    @Override // p000.ED4
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo105640a(final List<Issue> issues, final List<LegacyRepair> repairs) {
        Intrinsics.checkNotNullParameter(issues, "issues");
        Intrinsics.checkNotNullParameter(repairs, "repairs");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: FD4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m105638c;
                m105638c = GD4.m105638c(GD4.this, issues, repairs);
                return m105638c;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      lis…Schedulers.computation())");
        return m33142Y;
    }

    /* renamed from: d */
    public final C3023H6 m105637d(List<Issue> list, List<LegacyRepair> list2) {
        int collectionSizeOrDefault;
        List mutableListOf;
        int collectionSizeOrDefault2;
        List mutableList;
        ArrayList arrayList = new ArrayList();
        for (Issue issue : list) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, issue.getSubtypes());
        }
        ArrayList<Issue> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (IssueStatus_Kt.isPassedStatus(((Issue) obj).getStatus())) {
                arrayList2.add(obj);
            }
        }
        int i = 10;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
        for (Issue issue2 : arrayList2) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list2) {
                if (Intrinsics.areEqual(((LegacyRepair) obj2).getIssueTypeId(), issue2.getIssueTypeId())) {
                    arrayList4.add(obj2);
                }
            }
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, i);
            ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault2);
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                arrayList5.add(new C2637G6(this.f11147a.getString(C45871nl4.general_dot_item, ((LegacyRepair) it.next()).getDisplay()), C32634Ej4.item_repair_summary_item, false, 4, null));
            }
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList5);
            arrayList3.add(new C3023H6(mutableList, new C2637G6(issue2.getDisplay(), C32634Ej4.item_repair_summary_subitem, false, 4, null), null, 4, null));
            i = 10;
        }
        String string = this.f11147a.getString(C45871nl4.repair_summary_complete_format, Integer.valueOf(arrayList2.size()));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…t, repairedSubtypes.size)");
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new RD4(string, true, arrayList3), C32634Ej4.item_repair_summary_section, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: e */
    public final C3023H6 m105636e() {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(null, C32634Ej4.item_repair_summary_title, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: f */
    public final C3023H6 m105635f(List<Issue> list, List<LegacyRepair> list2) {
        int collectionSizeOrDefault;
        List mutableListOf;
        int collectionSizeOrDefault2;
        List mutableList;
        ArrayList<Issue> arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            List<Issue> subtypes = ((Issue) next).getSubtypes();
            if (!(subtypes instanceof Collection) || !subtypes.isEmpty()) {
                for (Issue issue : subtypes) {
                    if (IssueStatus_Kt.isFailedStatus(issue.getStatus())) {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int i = 10;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (Issue issue2 : arrayList) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : issue2.getSubtypes()) {
                if (IssueStatus_Kt.isFailedStatus(((Issue) obj).getStatus())) {
                    arrayList3.add(obj);
                }
            }
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, i);
            ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault2);
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new C2637G6(this.f11147a.getString(C45871nl4.general_dot_item, ((Issue) it2.next()).getDisplay()), C32634Ej4.item_repair_summary_item, false, 4, null));
            }
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList4);
            arrayList2.add(new C3023H6(mutableList, new C2637G6(issue2.getDisplay(), C32634Ej4.item_repair_summary_subitem, false, 4, null), null, 4, null));
            i = 10;
        }
        String string = this.f11147a.getString(C45871nl4.repair_summary_incomplete_format, Integer.valueOf(arrayList.size()));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…ncompleteSupertypes.size)");
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new RD4(string, false, arrayList2), C32634Ej4.item_repair_summary_section, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }
}
