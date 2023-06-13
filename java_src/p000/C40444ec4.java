package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.IssueType;
import co.bird.android.model.QCAutoCheck;
import co.bird.android.model.QCInspection;
import co.bird.android.model.RepairType;
import co.bird.android.model.constant.QCStatus;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0019\u0010\u001aJT\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0002J4\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0002J\n\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¨\u0006\u001b"}, m28432d2 = {"Lec4;", "Lcc4;", "", "birdModel", "", "Lco/bird/android/model/QCInspection;", "inspections", "Lco/bird/android/model/IssueType;", "issueTypes", "Lco/bird/android/model/RepairType;", "repairTypes", "Lco/bird/android/model/QCAutoCheck;", "qcAutoChecks", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, "", "passedQC", "i", "j", DateTokenConverter.CONVERTER_KEY, "h", "g", "e", "f", "<init>", "()V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nQualityControlResultConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QualityControlResultConverter.kt\nco/bird/android/qualitycontrol/result/adapters/QualityControlResultConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n766#2:93\n857#2,2:94\n1549#2:96\n1620#2,2:97\n288#2,2:99\n288#2,2:101\n1622#2:103\n766#2:105\n857#2,2:106\n1549#2:108\n1620#2,3:109\n1726#2,3:112\n1726#2,3:115\n1#3:104\n*S KotlinDebug\n*F\n+ 1 QualityControlResultConverter.kt\nco/bird/android/qualitycontrol/result/adapters/QualityControlResultConverterImpl\n*L\n55#1:93\n55#1:94,2\n58#1:96\n58#1:97,2\n60#1:99,2\n61#1:101,2\n58#1:103\n72#1:105\n72#1:106,2\n74#1:108\n74#1:109,3\n25#1:112,3\n26#1:115,3\n*E\n"})
/* renamed from: ec4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40444ec4 implements InterfaceC39241cc4 {
    /* renamed from: c */
    public static final List m42719c(List inspections, List qcAutoChecks, C40444ec4 this$0, String birdModel, List issueTypes, List repairTypes) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C3023H6 c3023h6;
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(inspections, "$inspections");
        Intrinsics.checkNotNullParameter(qcAutoChecks, "$qcAutoChecks");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(birdModel, "$birdModel");
        Intrinsics.checkNotNullParameter(issueTypes, "$issueTypes");
        Intrinsics.checkNotNullParameter(repairTypes, "$repairTypes");
        List<QCInspection> list = inspections;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (QCInspection qCInspection : list) {
                if (qCInspection.getStatus() == QCStatus.PASSED) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    z2 = false;
                    break;
                }
            }
        }
        z2 = true;
        List<QCAutoCheck> list2 = qcAutoChecks;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (QCAutoCheck qCAutoCheck : list2) {
                if (!qCAutoCheck.getPassed()) {
                    z3 = false;
                    break;
                }
            }
        }
        z3 = true;
        if (z2 && z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        C3023H6 m42713i = this$0.m42713i(z4, birdModel);
        C3023H6 m42712j = this$0.m42712j(z4);
        C3023H6 c3023h62 = null;
        if (!z4) {
            c3023h6 = this$0.m42718d();
        } else {
            c3023h6 = null;
        }
        C3023H6 m42714h = this$0.m42714h(inspections, issueTypes, repairTypes);
        C3023H6 m42715g = this$0.m42715g(qcAutoChecks);
        if (!z4) {
            c3023h62 = this$0.m42717e();
        }
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new C3023H6[]{m42713i, m42712j, c3023h6, m42714h, m42715g, c3023h62, this$0.m42716f(z4)});
        return listOfNotNull;
    }

    @Override // p000.InterfaceC39241cc4
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo42721a(final String birdModel, final List<QCInspection> inspections, final List<IssueType> issueTypes, final List<RepairType> repairTypes, final List<QCAutoCheck> qcAutoChecks) {
        Intrinsics.checkNotNullParameter(birdModel, "birdModel");
        Intrinsics.checkNotNullParameter(inspections, "inspections");
        Intrinsics.checkNotNullParameter(issueTypes, "issueTypes");
        Intrinsics.checkNotNullParameter(repairTypes, "repairTypes");
        Intrinsics.checkNotNullParameter(qcAutoChecks, "qcAutoChecks");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: dc4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m42719c;
                m42719c = C40444ec4.m42719c(inspections, qcAutoChecks, this, birdModel, issueTypes, repairTypes);
                return m42719c;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      val…Schedulers.computation())");
        return m33142Y;
    }

    /* renamed from: d */
    public final C3023H6 m42718d() {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(Unit.INSTANCE, C45268mk4.item_button_secondary, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: e */
    public final C3023H6 m42717e() {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(null, C43489jk4.item_add_notes, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: f */
    public final C3023H6 m42716f(boolean z) {
        List mutableListOf;
        List mutableListOf2;
        if (z) {
            mutableListOf2 = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(null, C43489jk4.item_passed_qc_buttons, false, 4, null));
            return new C3023H6(mutableListOf2, null, null, 6, null);
        }
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(null, C45268mk4.item_button, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: g */
    public final C3023H6 m42715g(List<QCAutoCheck> list) {
        int collectionSizeOrDefault;
        List mutableList;
        ArrayList<QCAutoCheck> arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((QCAutoCheck) obj).getPassed()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (QCAutoCheck qCAutoCheck : arrayList) {
            arrayList2.add(new C2637G6(qCAutoCheck, C43489jk4.item_auto_check, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
        return new C3023H6(mutableList, null, null, 6, null);
    }

    /* renamed from: h */
    public final C3023H6 m42714h(List<QCInspection> list, List<IssueType> list2, List<RepairType> list3) {
        int collectionSizeOrDefault;
        List mutableList;
        Object obj;
        Object obj2;
        String display;
        boolean z;
        ArrayList<QCInspection> arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (((QCInspection) obj3).getStatus() == QCStatus.FAILED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj3);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (QCInspection qCInspection : arrayList) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((IssueType) obj).getId(), qCInspection.getIssueTypeId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            IssueType issueType = (IssueType) obj;
            String str = "";
            String str2 = (issueType == null || (str2 = issueType.getDisplay()) == null) ? "" : "";
            Iterator<T> it2 = list3.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (Intrinsics.areEqual(((RepairType) obj2).getId(), qCInspection.getRepairTypeId())) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            RepairType repairType = (RepairType) obj2;
            if (repairType != null && (display = repairType.getDisplay()) != null) {
                str = display;
            }
            arrayList2.add(new C2637G6(new C43399jb4(str2, str, qCInspection.getStatus()), C43489jk4.item_inspection_failed_issue, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
        return new C3023H6(mutableList, null, null, 6, null);
    }

    /* renamed from: i */
    public final C3023H6 m42713i(boolean z, String str) {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(TuplesKt.m28425to(Boolean.valueOf(z), str), C43489jk4.item_vehicle_pass_fail, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: j */
    public final C3023H6 m42712j(boolean z) {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(Boolean.valueOf(z), C43489jk4.item_qc_pass_fail_text, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }
}
