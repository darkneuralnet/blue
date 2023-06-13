package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
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
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LOz4;", "LMz4;", "", "Lco/bird/android/model/Issue;", "issues", "", "Lco/bird/android/model/LegacyRepair;", "repairs", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, "supertype", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairIssueSupertypesConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSupertypesConverter.kt\nco/bird/android/feature/repair/v2/supertypes/adapters/RepairIssueSupertypesConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n766#2:79\n857#2,2:80\n1549#2:82\n1620#2,3:83\n766#2:87\n857#2:88\n1747#2,3:89\n858#2:92\n1549#2:93\n1620#2,2:94\n1774#2,3:96\n1747#2,3:99\n1777#2:102\n1774#2,4:103\n1622#2:107\n1#3:86\n*S KotlinDebug\n*F\n+ 1 RepairIssueSupertypesConverter.kt\nco/bird/android/feature/repair/v2/supertypes/adapters/RepairIssueSupertypesConverterImpl\n*L\n65#1:79\n65#1:80,2\n66#1:82\n66#1:83,3\n27#1:87\n27#1:88\n30#1:89,3\n27#1:92\n33#1:93\n33#1:94,2\n34#1:96,3\n36#1:99,3\n34#1:102\n39#1:103,4\n33#1:107\n*E\n"})
/* renamed from: Oz4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35118Oz4 implements InterfaceC34650Mz4 {

    /* renamed from: a */
    public final Context f27655a;

    public C35118Oz4(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27655a = context;
    }

    /* renamed from: c */
    public static final List m91117c(List issues, C35118Oz4 this$0, Collection repairs) {
        int collectionSizeOrDefault;
        int i;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        String string;
        List mutableListOf;
        boolean isBlank;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(issues, "$issues");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(repairs, "$repairs");
        ArrayList<Issue> arrayList = new ArrayList();
        Iterator it = issues.iterator();
        while (true) {
            boolean z6 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Issue issue = (Issue) next;
            isBlank = StringsKt__StringsJVMKt.isBlank(issue.getId());
            if (!(!isBlank)) {
                List<Issue> subtypes = issue.getSubtypes();
                if (!(subtypes instanceof Collection) || !subtypes.isEmpty()) {
                    for (Issue issue2 : subtypes) {
                        if (issue2.getStatus() != null) {
                            z4 = true;
                            continue;
                        } else {
                            z4 = false;
                            continue;
                        }
                        if (z4) {
                            z5 = true;
                            break;
                        }
                    }
                }
                z5 = false;
                if (!z5) {
                    z6 = false;
                }
            }
            if (z6) {
                arrayList.add(next);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (Issue issue3 : arrayList) {
            List<Issue> subtypes2 = issue3.getSubtypes();
            if ((subtypes2 instanceof Collection) && subtypes2.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (Issue issue4 : subtypes2) {
                    if (issue4.getStatus() != IssueStatus.ABANDONED) {
                        Collection<LegacyRepair> collection = repairs;
                        if (!collection.isEmpty()) {
                            for (LegacyRepair legacyRepair : collection) {
                                if (Intrinsics.areEqual(legacyRepair.getIssueTypeId(), issue4.getIssueTypeId())) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        z2 = false;
                        if (z2) {
                            z = true;
                            if (z && (i = i + 1) < 0) {
                                CollectionsKt__CollectionsKt.throwCountOverflow();
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            List<Issue> subtypes3 = issue3.getSubtypes();
            if ((subtypes3 instanceof Collection) && subtypes3.isEmpty()) {
                i2 = 0;
            } else {
                i2 = 0;
                for (Issue issue5 : subtypes3) {
                    IssueStatus status = issue5.getStatus();
                    if (status != null && !IssueStatus_Kt.isPassedStatus(status)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3 && (i2 = i2 + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            if (i > 0) {
                string = this$0.f27655a.getString(C45871nl4.repair_repaired_format, Integer.valueOf(i));
            } else if (i2 > 0) {
                string = this$0.f27655a.getString(C45871nl4.repair_repairs_needed_format, Integer.valueOf(i2));
            } else {
                string = this$0.f27655a.getString(C45871nl4.repair_repairs_needed);
            }
            Intrinsics.checkNotNullExpressionValue(string, "when {\n          repaire…repairs_needed)\n        }");
            mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new C32551Ea2(issue3, string, this$0.m91116d(issue3)), C32634Ej4.item_repair_v2_supertype_card, false, 4, null));
            arrayList2.add(new C3023H6(mutableListOf, null, null, 6, null));
        }
        return arrayList2;
    }

    @Override // p000.InterfaceC34650Mz4
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo91119a(final List<Issue> issues, final Collection<LegacyRepair> repairs) {
        Intrinsics.checkNotNullParameter(issues, "issues");
        Intrinsics.checkNotNullParameter(repairs, "repairs");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: Nz4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m91117c;
                m91117c = C35118Oz4.m91117c(issues, this, repairs);
                return m91117c;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      val…Schedulers.computation())");
        return m33142Y;
    }

    /* renamed from: d */
    public final C3023H6 m91116d(Issue issue) {
        int collectionSizeOrDefault;
        List mutableList;
        String display;
        boolean z;
        ArrayList<Issue> arrayList = new ArrayList();
        for (Object obj : issue.getSubtypes()) {
            if (((Issue) obj).getStatus() != null) {
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
        for (Issue issue2 : arrayList) {
            if (issue2.getStatus() == IssueStatus.CANT_REPAIR) {
                display = issue2.getDisplay() + " (" + this.f27655a.getString(C45871nl4.repair_cant_repair) + ")";
            } else {
                display = issue2.getDisplay();
            }
            arrayList2.add(new C2637G6(TuplesKt.m28425to(issue2, display), C32634Ej4.item_repair_v2_supertype_subtype, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
        return new C3023H6(mutableList, null, null, 6, null);
    }
}
