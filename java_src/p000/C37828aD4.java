package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.RepairType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LaD4;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairSelectionAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSelectionAdapterDiff.kt\nco/bird/android/feature/repair/v1/selection/adapters/RepairSelectionAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,21:1\n18#2:22\n18#2:27\n18#2:32\n9#3,4:23\n9#3,4:28\n9#3,4:33\n*S KotlinDebug\n*F\n+ 1 RepairSelectionAdapterDiff.kt\nco/bird/android/feature/repair/v1/selection/adapters/RepairSelectionAdapterDiff\n*L\n10#1:22\n14#1:27\n15#1:32\n10#1:23,4\n14#1:28,4\n15#1:33,4\n*E\n"})
/* renamed from: aD4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37828aD4 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        RepairType m9025e;
        String id;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        Object m105816c = adapterItem.m105816c();
        if (!(m105816c instanceof C50287vC4)) {
            m105816c = null;
        }
        C50287vC4 c50287vC4 = (C50287vC4) m105816c;
        if (c50287vC4 == null || (m9025e = c50287vC4.m9025e()) == null || (id = m9025e.getId()) == null) {
            return "";
        }
        return id;
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        Boolean bool4 = null;
        if (!(m105816c instanceof C50287vC4)) {
            m105816c = null;
        }
        C50287vC4 c50287vC4 = (C50287vC4) m105816c;
        Object m105816c2 = newItem.m105816c();
        if (!(m105816c2 instanceof C50287vC4)) {
            m105816c2 = null;
        }
        C50287vC4 c50287vC42 = (C50287vC4) m105816c2;
        if (c50287vC4 != null) {
            bool = Boolean.valueOf(c50287vC4.mo3250a());
        } else {
            bool = null;
        }
        if (c50287vC42 != null) {
            bool2 = Boolean.valueOf(c50287vC42.mo3250a());
        } else {
            bool2 = null;
        }
        if (Intrinsics.areEqual(bool, bool2)) {
            if (c50287vC4 != null) {
                bool3 = Boolean.valueOf(c50287vC4.mo3248c());
            } else {
                bool3 = null;
            }
            if (c50287vC42 != null) {
                bool4 = Boolean.valueOf(c50287vC42.mo3248c());
            }
            if (Intrinsics.areEqual(bool3, bool4)) {
                return false;
            }
        }
        return true;
    }
}