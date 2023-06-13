package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.IssueType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Lyp2;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLegacyWorkOrderInspectionAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyWorkOrderInspectionAdapterDiff.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,49:1\n18#2:50\n18#2:55\n18#2:60\n18#2:65\n18#2:70\n18#2:75\n18#2:80\n18#2:85\n9#3,4:51\n9#3,4:56\n9#3,4:61\n9#3,4:66\n9#3,4:71\n9#3,4:76\n9#3,4:81\n9#3,4:86\n*S KotlinDebug\n*F\n+ 1 LegacyWorkOrderInspectionAdapterDiff.kt\nco/bird/android/feature/workorders/legacyinspection/adapters/LegacyWorkOrderInspectionAdapterDiff\n*L\n18#1:50\n19#1:55\n20#1:60\n21#1:65\n33#1:70\n37#1:75\n38#1:80\n43#1:85\n18#1:51,4\n19#1:56,4\n20#1:61,4\n21#1:66,4\n33#1:71,4\n37#1:76,4\n38#1:81,4\n43#1:86,4\n*E\n"})
/* renamed from: yp2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52430yp2 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String id;
        String m95071b;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        if (m105817b == C37080Xj4.item_vehicle_summary) {
            return "summary";
        }
        if (m105817b == C37080Xj4.item_inspect_instructions) {
            return "instructions";
        }
        if (m105817b == C45268mk4.item_button_secondary) {
            return "commands";
        }
        String str = null;
        C34475Mg0 c34475Mg0 = null;
        Object obj = null;
        IssueType issueType = null;
        if (m105817b == C37080Xj4.item_category_header) {
            Object m105816c = adapterItem.m105816c();
            if (m105816c instanceof C34475Mg0) {
                c34475Mg0 = m105816c;
            }
            C34475Mg0 c34475Mg02 = c34475Mg0;
            if (c34475Mg02 != null && (m95071b = c34475Mg02.m95071b()) != null) {
                return m95071b;
            }
        } else if (m105817b == C37080Xj4.item_issue_empty) {
            Object m105816c2 = adapterItem.m105816c();
            if (m105816c2 instanceof String) {
                obj = m105816c2;
            }
            return obj + "-empty";
        } else if (m105817b == C37080Xj4.item_issue_header) {
            Object m105816c3 = adapterItem.m105816c();
            if (m105816c3 instanceof IssueType) {
                issueType = m105816c3;
            }
            IssueType issueType2 = issueType;
            if (issueType2 != null && (id = issueType2.getId()) != null) {
                return id;
            }
        } else if (m105817b == C37080Xj4.item_dropdown_button) {
            Object m105816c4 = adapterItem.m105816c();
            if (!(m105816c4 instanceof Pair)) {
                m105816c4 = null;
            }
            Pair pair = (Pair) m105816c4;
            if (pair != null) {
                str = (String) pair.getFirst();
            }
            return str + "-button";
        } else if (m105817b == C37080Xj4.item_work_order_notes) {
            return "notes";
        } else {
            if (m105817b == C45268mk4.item_button) {
                return "submit";
            }
        }
        return "";
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        String str;
        Boolean bool;
        Boolean bool2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        int m105817b = oldItem.m105817b();
        if (m105817b == C37080Xj4.item_vehicle_summary || m105817b == C45268mk4.item_button_secondary) {
            return false;
        }
        Object obj = null;
        if (m105817b == C37080Xj4.item_category_header) {
            Object m105816c = oldItem.m105816c();
            if (!(m105816c instanceof C34475Mg0)) {
                m105816c = null;
            }
            C34475Mg0 c34475Mg0 = (C34475Mg0) m105816c;
            if (c34475Mg0 != null) {
                bool2 = Boolean.valueOf(c34475Mg0.m95070c());
            } else {
                bool2 = null;
            }
            Object m105816c2 = newItem.m105816c();
            if (!(m105816c2 instanceof C34475Mg0)) {
                m105816c2 = null;
            }
            C34475Mg0 c34475Mg02 = (C34475Mg0) m105816c2;
            if (c34475Mg02 != null) {
                obj = Boolean.valueOf(c34475Mg02.m95070c());
            }
            if (Intrinsics.areEqual(bool2, obj)) {
                return false;
            }
        } else if (m105817b == C37080Xj4.item_work_order_notes) {
            return false;
        } else {
            if (m105817b == C45268mk4.item_button) {
                Object m105816c3 = oldItem.m105816c();
                if (!(m105816c3 instanceof C40362eT5)) {
                    m105816c3 = null;
                }
                C40362eT5 c40362eT5 = (C40362eT5) m105816c3;
                Object m105816c4 = newItem.m105816c();
                if (!(m105816c4 instanceof C40362eT5)) {
                    m105816c4 = null;
                }
                C40362eT5 c40362eT52 = (C40362eT5) m105816c4;
                if (c40362eT5 != null) {
                    bool = Boolean.valueOf(c40362eT5.m42856b());
                } else {
                    bool = null;
                }
                if (c40362eT52 != null) {
                    obj = Boolean.valueOf(c40362eT52.m42856b());
                }
                if (Intrinsics.areEqual(bool, obj)) {
                    return false;
                }
            } else if (m105817b != C37080Xj4.item_dropdown_button) {
                return false;
            } else {
                Object m105816c5 = oldItem.m105816c();
                if (!(m105816c5 instanceof Pair)) {
                    m105816c5 = null;
                }
                Pair pair = (Pair) m105816c5;
                if (pair != null) {
                    str = (String) pair.getSecond();
                } else {
                    str = null;
                }
                Object m105816c6 = newItem.m105816c();
                if (!(m105816c6 instanceof Pair)) {
                    m105816c6 = null;
                }
                Pair pair2 = (Pair) m105816c6;
                if (pair2 != null) {
                    obj = (String) pair2.getSecond();
                }
                if (Intrinsics.areEqual(str, obj)) {
                    return false;
                }
            }
        }
        return true;
    }
}
