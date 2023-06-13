package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LIz4;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairIssueSupertypeSubtypesAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSupertypeSubtypesAdapterDiff.kt\nco/bird/android/feature/repair/v2/supertypes/adapters/RepairIssueSupertypeSubtypesAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,29:1\n18#2:30\n18#2:35\n9#3,4:31\n9#3,4:36\n9#3,4:40\n*S KotlinDebug\n*F\n+ 1 RepairIssueSupertypeSubtypesAdapterDiff.kt\nco/bird/android/feature/repair/v2/supertypes/adapters/RepairIssueSupertypeSubtypesAdapterDiff\n*L\n13#1:30\n22#1:35\n13#1:31,4\n22#1:36,4\n23#1:40,4\n*E\n"})
/* renamed from: Iz4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33714Iz4 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String issueTypeId;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        if (adapterItem.m105817b() != C32634Ej4.item_repair_v2_supertype_subtype) {
            return "";
        }
        Object m105816c = adapterItem.m105816c();
        if (!(m105816c instanceof Issue)) {
            m105816c = null;
        }
        Issue issue = (Issue) m105816c;
        if (issue == null || (issueTypeId = issue.getIssueTypeId()) == null) {
            return "";
        }
        return issueTypeId;
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        IssueStatus issueStatus;
        Issue issue;
        Issue issue2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        boolean z = m105816c instanceof Pair;
        if (!z) {
            return false;
        }
        Object m105816c2 = newItem.m105816c();
        IssueStatus issueStatus2 = null;
        if (!(m105816c2 instanceof Pair)) {
            m105816c2 = null;
        }
        Pair pair = (Pair) m105816c2;
        if (!z) {
            m105816c = null;
        }
        Pair pair2 = (Pair) m105816c;
        if (pair2 != null && (issue2 = (Issue) pair2.getFirst()) != null) {
            issueStatus = issue2.getStatus();
        } else {
            issueStatus = null;
        }
        if (pair != null && (issue = (Issue) pair.getFirst()) != null) {
            issueStatus2 = issue.getStatus();
        }
        if (issueStatus == issueStatus2) {
            return false;
        }
        return true;
    }
}
