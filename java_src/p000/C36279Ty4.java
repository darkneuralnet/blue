package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.Issue;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LTy4;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairIssueSubtypesAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSubtypesAdapterDiff.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,37:1\n18#2:38\n18#2:43\n18#2:48\n18#2:53\n18#2:58\n9#3,4:39\n9#3,4:44\n9#3,4:49\n9#3,4:54\n9#3,4:59\n*S KotlinDebug\n*F\n+ 1 RepairIssueSubtypesAdapterDiff.kt\nco/bird/android/feature/repair/v2/subtypes/adapters/RepairIssueSubtypesAdapterDiff\n*L\n15#1:38\n16#1:43\n17#1:48\n26#1:53\n30#1:58\n15#1:39,4\n16#1:44,4\n17#1:49,4\n26#1:54,4\n30#1:59,4\n*E\n"})
/* renamed from: Ty4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36279Ty4 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String mo3247d;
        Issue issue;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        Pair pair = null;
        if (m105817b == C32634Ej4.item_repair_v2_subtype) {
            Object m105816c = adapterItem.m105816c();
            if (m105816c instanceof Pair) {
                pair = m105816c;
            }
            Pair pair2 = pair;
            if (pair2 == null || (issue = (Issue) pair2.getFirst()) == null || (mo3247d = issue.getDisplay()) == null) {
                return "";
            }
        } else if (m105817b == C32634Ej4.item_repair_v2_subtype_repair_type) {
            Object m105816c2 = adapterItem.m105816c();
            if (m105816c2 instanceof TD4) {
                pair = m105816c2;
            }
            TD4 td4 = pair;
            if (td4 == null || (mo3247d = td4.mo3247d()) == null) {
                return "";
            }
        } else if (m105817b != C32634Ej4.item_repair_v2_subtype_status) {
            return "";
        } else {
            Object m105816c3 = adapterItem.m105816c();
            if (m105816c3 instanceof C52280ya2) {
                pair = m105816c3;
            }
            C52280ya2 c52280ya2 = pair;
            if (c52280ya2 == null || (mo3247d = c52280ya2.mo3247d()) == null) {
                return "";
            }
        }
        return mo3247d;
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        boolean z;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        Object obj = null;
        if (m105816c instanceof Pair) {
            Object m105816c2 = newItem.m105816c();
            if (!(m105816c2 instanceof Pair)) {
                m105816c2 = null;
            }
            Pair pair = (Pair) m105816c2;
            Object second = ((Pair) m105816c).getSecond();
            if (pair != null) {
                obj = (Boolean) pair.getSecond();
            }
            if (!Intrinsics.areEqual(second, obj)) {
                return true;
            }
        } else if (m105816c instanceof AbstractC47616qi0) {
            Object m105816c3 = newItem.m105816c();
            if (m105816c3 instanceof AbstractC47616qi0) {
                obj = m105816c3;
            }
            AbstractC47616qi0 abstractC47616qi0 = (AbstractC47616qi0) obj;
            if (abstractC47616qi0 != null && ((AbstractC47616qi0) m105816c).mo3250a() == abstractC47616qi0.mo3250a()) {
                z = true;
            } else {
                z = false;
            }
            if (!z || ((AbstractC47616qi0) m105816c).mo3248c() != abstractC47616qi0.mo3248c()) {
                return true;
            }
        }
        return false;
    }
}
