package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.IssueType;
import co.bird.android.model.IssueTypeLock;
import co.bird.android.model.MobilePartner;
import io.reactivex.AbstractC23442F;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJX\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\t0\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0002J6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\tH\u0002J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0002¨\u0006\u001b"}, m28432d2 = {"LkE6;", "LtA;", "LfE6;", "Lco/bird/android/model/BirdSummaryBody;", "birdSummary", "Lco/bird/android/model/MobilePartner;", "partner", "", "", "", "Lco/bird/android/model/IssueType;", "categoriesIssuesMap", "Lco/bird/android/model/IssueTypeLock;", "issues", "notes", "Lio/reactivex/F;", "LH6;", "b", "t", "categoryIssues", "selectedIssues", "u", "v", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLegacyWorkOrderInspectionConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderInspectionConverter.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/WorkOrderInspectionConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,131:1\n1549#2:132\n1620#2,2:133\n766#2:135\n857#2,2:136\n1549#2:138\n1620#2,3:139\n1774#2,4:142\n1622#2:146\n1747#2,3:147\n766#2:150\n857#2,2:151\n1726#2,3:153\n766#2:156\n857#2,2:157\n819#2:159\n847#2:160\n1747#2,3:161\n848#2:164\n1549#2:165\n1620#2,2:166\n1747#2,3:168\n1622#2:171\n1726#2,3:172\n1549#2:175\n1620#2,2:176\n1747#2,3:178\n1622#2:181\n1726#2,3:182\n37#3,2:185\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderInspectionConverter.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/WorkOrderInspectionConverterImpl\n*L\n55#1:132\n55#1:133,2\n56#1:135\n56#1:136,2\n66#1:138\n66#1:139,3\n73#1:142,4\n55#1:146\n91#1:147,3\n92#1:150\n92#1:151,2\n100#1:153,3\n104#1:156\n104#1:157,2\n106#1:159\n106#1:160\n106#1:161,3\n106#1:164\n107#1:165\n107#1:166,2\n108#1:168,3\n107#1:171\n110#1:172,3\n115#1:175\n115#1:176,2\n116#1:178,3\n115#1:181\n118#1:182,3\n37#1:185,2\n*E\n"})
/* renamed from: kE6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43786kE6 extends AbstractC28540tA implements InterfaceC40821fE6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43786kE6(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: s */
    public static final List m29155s(C43786kE6 this$0, BirdSummaryBody birdSummary, MobilePartner mobilePartner, Map categoriesIssuesMap, List issues, String str) {
        List mutableListOf;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(birdSummary, "$birdSummary");
        Intrinsics.checkNotNullParameter(categoriesIssuesMap, "$categoriesIssuesMap");
        Intrinsics.checkNotNullParameter(issues, "$issues");
        C3023H6 generateVehicleSummarySection$default = AbstractC28540tA.generateVehicleSummarySection$default(this$0, birdSummary, null, mobilePartner, 2, null);
        C3023H6 m29154t = this$0.m29154t();
        List<C3023H6> m29153u = this$0.m29153u(categoriesIssuesMap, issues);
        C3023H6 m29152v = this$0.m29152v(str);
        SpreadBuilder spreadBuilder = new SpreadBuilder(4);
        spreadBuilder.add(generateVehicleSummarySection$default);
        spreadBuilder.add(m29154t);
        spreadBuilder.addSpread(m29153u.toArray(new C3023H6[0]));
        spreadBuilder.add(m29152v);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(spreadBuilder.toArray(new C3023H6[spreadBuilder.size()]));
        return mutableListOf;
    }

    @Override // p000.InterfaceC40821fE6
    /* renamed from: b */
    public AbstractC23442F<List<C3023H6>> mo29157b(final BirdSummaryBody birdSummary, final MobilePartner mobilePartner, final Map<String, ? extends List<IssueType>> categoriesIssuesMap, final List<IssueTypeLock> issues, final String str) {
        Intrinsics.checkNotNullParameter(birdSummary, "birdSummary");
        Intrinsics.checkNotNullParameter(categoriesIssuesMap, "categoriesIssuesMap");
        Intrinsics.checkNotNullParameter(issues, "issues");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: hE6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m29155s;
                m29155s = C43786kE6.m29155s(C43786kE6.this, birdSummary, mobilePartner, categoriesIssuesMap, issues, str);
                return m29155s;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      val…ay(), notesSection)\n    }");
        return m33161E;
    }

    /* renamed from: t */
    public final C3023H6 m29154t() {
        return new C3023H6(new ArrayList(), new C2637G6(m12962m().getString(C45871nl4.work_order_inspect_command), C45268mk4.item_button_secondary, false, 4, null), new C2637G6(null, C37080Xj4.item_inspect_instructions, false, 4, null));
    }

    /* renamed from: u */
    public final List<C3023H6> m29153u(Map<String, ? extends List<IssueType>> map, List<IssueTypeLock> list) {
        int collectionSizeOrDefault;
        int indexOf;
        C2637G6 c2637g6;
        int i;
        List mutableListOf;
        int i2;
        int collectionSizeOrDefault2;
        Set<String> keySet = map.keySet();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(keySet, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (String str : keySet) {
            ArrayList<IssueTypeLock> arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (Intrinsics.areEqual(((IssueTypeLock) obj).component1().getCategory(), str)) {
                    arrayList2.add(obj);
                }
            }
            indexOf = CollectionsKt___CollectionsKt.indexOf(map.keySet(), str);
            C2637G6 c2637g62 = new C2637G6(new C34475Mg0(str, !arrayList2.isEmpty(), indexOf + 1), C37080Xj4.item_category_header, false, 4, null);
            if (!arrayList2.isEmpty()) {
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
                for (IssueTypeLock issueTypeLock : arrayList2) {
                    arrayList3.add(new C2637G6(issueTypeLock.component1(), C37080Xj4.item_issue_header, false, 4, null));
                }
                mutableListOf = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList3);
                c2637g6 = c2637g62;
                i = 1;
            } else {
                c2637g6 = c2637g62;
                i = 1;
                mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(str, C37080Xj4.item_issue_empty, false, 4, null));
            }
            if (arrayList2.isEmpty()) {
                i2 = 0;
            } else {
                i2 = 0;
                for (IssueTypeLock issueTypeLock2 : arrayList2) {
                    if ((issueTypeLock2.component1().isNoIssue() ^ i) != 0 && (i2 = i2 + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            Context m12962m = m12962m();
            int i3 = C45871nl4.work_order_inspect_issue_count;
            Object[] objArr = new Object[i];
            objArr[0] = Integer.valueOf(i2);
            arrayList.add(new C3023H6(mutableListOf, c2637g6, new C2637G6(TuplesKt.m28425to(str, m12962m.getString(i3, objArr)), C37080Xj4.item_dropdown_button, false, 4, null)));
        }
        return arrayList;
    }

    /* renamed from: v */
    public final C3023H6 m29152v(String str) {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(str, C37080Xj4.item_work_order_notes, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }
}
