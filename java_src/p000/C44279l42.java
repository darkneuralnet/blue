package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.InspectionCategory;
import co.bird.android.model.InspectionFlow;
import co.bird.android.model.InspectionIssue;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0010\u0010\u0011J>\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\tH\u0002J:\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¨\u0006\u0012"}, m28432d2 = {"Ll42;", "", "Lco/bird/android/model/InspectionFlow;", "inspection", "", "", "passedInspectionIds", "failedInspectionIds", "expandedCategories", "LH6;", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "c", "Lco/bird/android/model/InspectionCategory;", "category", "b", "<init>", "()V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInspectionV3Converter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3Converter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3Converter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1549#2:66\n1620#2,3:67\n1549#2:72\n1620#2,3:73\n37#3,2:70\n1#4:76\n*S KotlinDebug\n*F\n+ 1 InspectionV3Converter.kt\nco/bird/android/feature/workorders/v3/adapters/InspectionV3Converter\n*L\n20#1:66\n20#1:67,3\n46#1:72\n46#1:73,3\n27#1:70,2\n*E\n"})
/* renamed from: l42  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44279l42 {
    /* renamed from: a */
    public final List<C3023H6> m27966a(InspectionFlow inspection, List<String> passedInspectionIds, List<String> failedInspectionIds, List<String> expandedCategories) {
        int collectionSizeOrDefault;
        List<C3023H6> listOf;
        Intrinsics.checkNotNullParameter(inspection, "inspection");
        Intrinsics.checkNotNullParameter(passedInspectionIds, "passedInspectionIds");
        Intrinsics.checkNotNullParameter(failedInspectionIds, "failedInspectionIds");
        Intrinsics.checkNotNullParameter(expandedCategories, "expandedCategories");
        List<InspectionCategory> categories = inspection.getCategories();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(categories, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (InspectionCategory inspectionCategory : categories) {
            arrayList.add(m27965b(inspectionCategory, passedInspectionIds, failedInspectionIds, expandedCategories));
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
        spreadBuilder.add(m27963d(inspection));
        spreadBuilder.add(m27964c());
        spreadBuilder.addSpread(arrayList.toArray(new C3023H6[0]));
        listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new C3023H6[spreadBuilder.size()]));
        return listOf;
    }

    /* renamed from: b */
    public final C3023H6 m27965b(InspectionCategory inspectionCategory, List<String> list, List<String> list2, List<String> list3) {
        int collectionSizeOrDefault;
        List mutableList;
        Boolean bool;
        List<InspectionIssue> issues = inspectionCategory.getIssues();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(issues, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (InspectionIssue inspectionIssue : issues) {
            arrayList.add(new C2637G6(InspectionIssue.copy$default(inspectionIssue, null, null, list2.contains(inspectionIssue.getId()), false, null, null, 59, null), C37080Xj4.item_inspection_issue, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        C3023H6 c3023h6 = new C3023H6(mutableList, null, null, 6, null);
        String id = inspectionCategory.getId();
        if (list2.contains(id)) {
            bool = Boolean.FALSE;
        } else if (list.contains(id)) {
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        return new C3023H6(new ArrayList(), new C2637G6(new Q32(inspectionCategory, c3023h6, bool, list3.contains(inspectionCategory.getId())), C37080Xj4.item_inspection_category, false, 4, null), null, 4, null);
    }

    /* renamed from: c */
    public final C3023H6 m27964c() {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(null, C37080Xj4.item_inspection_instructions, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: d */
    public final C3023H6 m27963d(InspectionFlow inspectionFlow) {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(inspectionFlow, C45268mk4.item_vehicle_servicing_vehicle_info, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }
}
