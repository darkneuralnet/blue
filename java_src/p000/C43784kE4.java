package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.RepairIssue;
import co.bird.android.model.wire.WireQuickLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LkE4;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairV3IssueAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssueAdapterDiff.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,41:1\n18#2:42\n18#2:47\n18#2:52\n9#3,4:43\n9#3,4:48\n9#3,4:53\n*S KotlinDebug\n*F\n+ 1 RepairV3IssueAdapterDiff.kt\nco/bird/android/feature/repair/v3/issues/adapters/RepairV3IssueAdapterDiff\n*L\n15#1:42\n24#1:47\n32#1:52\n15#1:43,4\n24#1:48,4\n32#1:53,4\n*E\n"})
/* renamed from: kE4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43784kE4 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        RepairIssue m110811e;
        String id;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        if (m105817b == C32634Ej4.item_repair_v3_issue) {
            Object m105816c = adapterItem.m105816c();
            if (!(m105816c instanceof DA4)) {
                m105816c = null;
            }
            DA4 da4 = (DA4) m105816c;
            if (da4 == null || (m110811e = da4.m110811e()) == null || (id = m110811e.getId()) == null) {
                return "";
            }
            return id;
        } else if (m105817b != C32634Ej4.item_repair_training_guide) {
            return "";
        } else {
            return "training_guide";
        }
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        boolean z;
        RepairIssue m110811e;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        WireQuickLink wireQuickLink = null;
        if (m105816c instanceof DA4) {
            Object m105816c2 = newItem.m105816c();
            if (m105816c2 instanceof DA4) {
                wireQuickLink = m105816c2;
            }
            DA4 da4 = (DA4) wireQuickLink;
            if (da4 != null && (m110811e = da4.m110811e()) != null && ((DA4) m105816c).m110811e().getSelected() == m110811e.getSelected()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
            DA4 da42 = (DA4) m105816c;
            if (!Intrinsics.areEqual(da42.m110810f(), da4.m110810f()) || !Intrinsics.areEqual(da42.m110812d(), da4.m110812d()) || !Intrinsics.areEqual(da42.m110813c(), da4.m110813c()) || da42.m110809g() != da4.m110809g()) {
                return true;
            }
        } else if (m105816c instanceof C46082o66) {
            Object m105816c3 = newItem.m105816c();
            if (!(m105816c3 instanceof C46082o66)) {
                m105816c3 = null;
            }
            C46082o66 c46082o66 = (C46082o66) m105816c3;
            C46082o66 c46082o662 = (C46082o66) m105816c;
            WireQuickLink m21765g = c46082o662.m21765g();
            if (c46082o66 != null) {
                wireQuickLink = c46082o66.m21765g();
            }
            if (!Intrinsics.areEqual(m21765g, wireQuickLink) || !Intrinsics.areEqual(c46082o662.m21766f(), c46082o66.m21766f()) || !Intrinsics.areEqual(c46082o662.m21767e(), c46082o66.m21767e())) {
                return true;
            }
        }
        return false;
    }
}
