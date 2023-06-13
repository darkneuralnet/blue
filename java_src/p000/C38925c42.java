package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.InspectionCategory;
import co.bird.android.model.InspectionCategoryStatus;
import co.bird.android.model.InspectionFlow;
import co.bird.android.model.InspectionIssue;
import co.bird.android.model.constant.BirdModel;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"Lc42;", "", "Lco/bird/android/model/InspectionFlow;", "inspection", "", "LH6;", C17296a.f69688o, "", "passedInspection", "Lco/bird/android/model/constant/BirdModel;", RequestHeadersFactory.MODEL, "c", "b", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInspectionV3CompleteConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3CompleteConverter.kt\nco/bird/android/feature/workorders/v3/dialog/InspectionV3CompleteConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n766#2:70\n857#2,2:71\n1549#2:73\n1620#2,3:74\n1360#2:77\n1446#2,5:78\n766#2:83\n857#2,2:84\n1549#2:86\n1620#2,3:87\n1549#2:90\n1620#2,3:91\n*S KotlinDebug\n*F\n+ 1 InspectionV3CompleteConverter.kt\nco/bird/android/feature/workorders/v3/dialog/InspectionV3CompleteConverter\n*L\n53#1:70\n53#1:71,2\n54#1:73\n54#1:74,3\n56#1:77\n56#1:78,5\n57#1:83\n57#1:84,2\n58#1:86\n58#1:87,3\n62#1:90\n62#1:91,3\n*E\n"})
/* renamed from: c42  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38925c42 {

    /* renamed from: a */
    public final Context f60031a;

    public C38925c42(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f60031a = context;
    }

    /* renamed from: a */
    public final List<C3023H6> m61971a(InspectionFlow inspection) {
        C3023H6 c3023h6;
        List<C3023H6> listOfNotNull;
        Intrinsics.checkNotNullParameter(inspection, "inspection");
        boolean passed = inspection.getPassed();
        C3023H6[] c3023h6Arr = new C3023H6[2];
        c3023h6Arr[0] = m61969c(passed, inspection.getModel());
        if (!passed) {
            c3023h6 = m61970b(inspection);
        } else {
            c3023h6 = null;
        }
        c3023h6Arr[1] = c3023h6;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) c3023h6Arr);
        return listOfNotNull;
    }

    /* renamed from: b */
    public final C3023H6 m61970b(InspectionFlow inspectionFlow) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        List plus;
        int collectionSizeOrDefault3;
        List mutableList;
        boolean z;
        ArrayList<InspectionCategory> arrayList = new ArrayList();
        for (Object obj : inspectionFlow.getCategories()) {
            if (((InspectionCategory) obj).getStatus() == InspectionCategoryStatus.FAILED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (InspectionCategory inspectionCategory : arrayList) {
            arrayList2.add(inspectionCategory.getDisplay());
        }
        ArrayList arrayList3 = new ArrayList();
        for (InspectionCategory inspectionCategory2 : inspectionFlow.getCategories()) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList3, inspectionCategory2.getIssues());
        }
        ArrayList<InspectionIssue> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (((InspectionIssue) obj2).getSelected()) {
                arrayList4.add(obj2);
            }
        }
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10);
        ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault2);
        for (InspectionIssue inspectionIssue : arrayList4) {
            arrayList5.add(inspectionIssue.getDisplay());
        }
        plus = CollectionsKt___CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList5);
        List<String> list = plus;
        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList6 = new ArrayList(collectionSizeOrDefault3);
        for (String str : list) {
            arrayList6.add(new C2637G6(str, C37080Xj4.item_inspection_complete_issue, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList6);
        return new C3023H6(mutableList, null, null, 6, null);
    }

    /* renamed from: c */
    public final C3023H6 m61969c(boolean z, BirdModel birdModel) {
        Drawable m94299e;
        String string;
        Drawable drawable;
        List mutableListOf;
        if (z) {
            m94299e = NA0.m94299e(this.f60031a, C48193rg4.ic_check);
            string = this.f60031a.getString(C45871nl4.inspection_complete_passed_instructions);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…lete_passed_instructions)");
        } else {
            m94299e = NA0.m94299e(this.f60031a, C48193rg4.ic_shield);
            string = this.f60031a.getString(C45871nl4.inspection_complete_failed_instructions);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…lete_failed_instructions)");
        }
        if (birdModel != null) {
            drawable = C6327PM.m90445a(birdModel, this.f60031a);
        } else {
            drawable = null;
        }
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new R32(m94299e, string, drawable), C37080Xj4.item_inspection_complete_header, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }
}
