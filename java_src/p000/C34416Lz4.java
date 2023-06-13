package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.extension.IssueStatus_Kt;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LLz4;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairIssueSupertypesAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSupertypesAdapterDiff.kt\nco/bird/android/feature/repair/v2/supertypes/adapters/RepairIssueSupertypesAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n18#2:35\n18#2:40\n9#3,4:36\n9#3,4:41\n1774#4,4:45\n1774#4,4:49\n*S KotlinDebug\n*F\n+ 1 RepairIssueSupertypesAdapterDiff.kt\nco/bird/android/feature/repair/v2/supertypes/adapters/RepairIssueSupertypesAdapterDiff\n*L\n13#1:35\n22#1:40\n13#1:36,4\n22#1:41,4\n24#1:45,4\n25#1:49,4\n*E\n"})
/* renamed from: Lz4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34416Lz4 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        Issue m108782f;
        String issueTypeId;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        if (adapterItem.m105817b() != C32634Ej4.item_repair_v2_supertype_card) {
            return "";
        }
        Object m105816c = adapterItem.m105816c();
        if (!(m105816c instanceof C32551Ea2)) {
            m105816c = null;
        }
        C32551Ea2 c32551Ea2 = (C32551Ea2) m105816c;
        if (c32551Ea2 == null || (m108782f = c32551Ea2.m108782f()) == null || (issueTypeId = m108782f.getIssueTypeId()) == null) {
            return "";
        }
        return issueTypeId;
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        int i;
        boolean z;
        Issue m108782f;
        List<Issue> subtypes;
        int i2;
        boolean z2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        if (!(m105816c instanceof C32551Ea2)) {
            return false;
        }
        Object m105816c2 = newItem.m105816c();
        Integer num = null;
        if (!(m105816c2 instanceof C32551Ea2)) {
            m105816c2 = null;
        }
        C32551Ea2 c32551Ea2 = (C32551Ea2) m105816c2;
        C32551Ea2 c32551Ea22 = (C32551Ea2) m105816c;
        List<Issue> subtypes2 = c32551Ea22.m108782f().getSubtypes();
        if ((subtypes2 instanceof Collection) && subtypes2.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (Issue issue : subtypes2) {
                IssueStatus status = issue.getStatus();
                if (status != null && !IssueStatus_Kt.isPassedStatus(status)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (c32551Ea2 != null && (m108782f = c32551Ea2.m108782f()) != null && (subtypes = m108782f.getSubtypes()) != null) {
            List<Issue> list = subtypes;
            if ((list instanceof Collection) && list.isEmpty()) {
                i2 = 0;
            } else {
                i2 = 0;
                for (Issue issue2 : list) {
                    IssueStatus status2 = issue2.getStatus();
                    if (status2 != null && !IssueStatus_Kt.isPassedStatus(status2)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 && (i2 = i2 + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            num = Integer.valueOf(i2);
        }
        if (num != null && i == num.intValue() && Intrinsics.areEqual(c32551Ea22.m108783e().m104408e(), c32551Ea2.m108783e().m104408e())) {
            return false;
        }
        return true;
    }
}
