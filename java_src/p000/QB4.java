package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.Issue;
import co.bird.android.model.RepairType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LQB4;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairOverviewAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairOverviewAdapterDiff.kt\nco/bird/android/feature/repair/v1/base/adapters/RepairOverviewAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n18#2:47\n18#2:52\n18#2:57\n18#2:62\n18#2:68\n18#2:73\n18#2:78\n18#2:83\n9#3,4:48\n9#3,4:53\n9#3,4:58\n9#3,4:63\n9#3,4:69\n9#3,4:74\n9#3,4:79\n9#3,4:84\n1#4:67\n*S KotlinDebug\n*F\n+ 1 RepairOverviewAdapterDiff.kt\nco/bird/android/feature/repair/v1/base/adapters/RepairOverviewAdapterDiff\n*L\n19#1:47\n20#1:52\n21#1:57\n23#1:62\n32#1:68\n33#1:73\n37#1:78\n38#1:83\n19#1:48,4\n20#1:53,4\n21#1:58,4\n23#1:63,4\n32#1:69,4\n33#1:74,4\n37#1:79,4\n38#1:84,4\n*E\n"})
/* renamed from: QB4 */
/* loaded from: classes3.dex */
public class QB4 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String id;
        String issueTypeId;
        String mo13042a;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        boolean z = true;
        if (m105817b != C45851nj4.item_field_summary && m105817b != C45851nj4.item_vehicle_summary) {
            z = false;
        }
        if (z) {
            return "summary";
        }
        if (m105817b == C32634Ej4.item_repair_work_order_header) {
            return "work_order_header";
        }
        if (m105817b == C32634Ej4.item_repair_notes) {
            return "notes";
        }
        RB4 rb4 = null;
        if (m105817b == C45268mk4.item_button_secondary) {
            Object m105816c = adapterItem.m105816c();
            if (m105816c instanceof RB4) {
                rb4 = m105816c;
            }
            RB4 rb42 = rb4;
            if (rb42 != null && (mo13042a = rb42.mo13042a()) != null) {
                return mo13042a;
            }
        } else if (m105817b == C32634Ej4.item_repair_status) {
            Object m105816c2 = adapterItem.m105816c();
            if (m105816c2 instanceof Issue) {
                rb4 = m105816c2;
            }
            Issue issue = rb4;
            if (issue != null && (issueTypeId = issue.getIssueTypeId()) != null) {
                return issueTypeId;
            }
        } else if (m105817b == C32634Ej4.item_issue_repair) {
            Object m105816c3 = adapterItem.m105816c();
            if (m105816c3 instanceof RepairType) {
                rb4 = m105816c3;
            }
            RepairType repairType = rb4;
            if (repairType != null && (id = repairType.getId()) != null) {
                return id;
            }
        } else if (m105817b == C32634Ej4.item_dropdown_repair_button) {
            Object m105816c4 = adapterItem.m105816c();
            if (m105816c4 instanceof Pair) {
                rb4 = m105816c4;
            }
            Pair pair = rb4;
            if (pair != null) {
                String str = ((Issue) pair.component1()).getIssueTypeId() + "-repair";
                if (str != null) {
                    return str;
                }
            }
        }
        return "";
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        int m105817b = oldItem.m105817b();
        String str3 = null;
        if (m105817b == C32634Ej4.item_repair_status) {
            Object m105816c = oldItem.m105816c();
            if (!(m105816c instanceof Issue)) {
                m105816c = null;
            }
            Issue issue = (Issue) m105816c;
            Object m105816c2 = newItem.m105816c();
            if (!(m105816c2 instanceof Issue)) {
                m105816c2 = null;
            }
            Issue issue2 = (Issue) m105816c2;
            if (issue != null) {
                str2 = issue.getStatusDisplay();
            } else {
                str2 = null;
            }
            if (issue2 != null) {
                str3 = issue2.getStatusDisplay();
            }
            if (!Intrinsics.areEqual(str2, str3)) {
                return true;
            }
        } else if (m105817b == C32634Ej4.item_dropdown_repair_button) {
            Object m105816c3 = oldItem.m105816c();
            if (!(m105816c3 instanceof Pair)) {
                m105816c3 = null;
            }
            Pair pair = (Pair) m105816c3;
            Object m105816c4 = newItem.m105816c();
            if (!(m105816c4 instanceof Pair)) {
                m105816c4 = null;
            }
            Pair pair2 = (Pair) m105816c4;
            if (pair != null) {
                str = (String) pair.getSecond();
            } else {
                str = null;
            }
            if (pair2 != null) {
                str3 = (String) pair2.getSecond();
            }
            if (!Intrinsics.areEqual(str, str3)) {
                return true;
            }
        }
        return false;
    }
}
