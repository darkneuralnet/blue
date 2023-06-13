package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.LegacyRepair;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LjD6;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkOrderDetailsAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderDetailsAdapterDiff.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,44:1\n18#2:45\n18#2:50\n18#2:55\n18#2:60\n18#2:65\n9#3,4:46\n9#3,4:51\n9#3,4:56\n9#3,4:61\n9#3,4:66\n*S KotlinDebug\n*F\n+ 1 WorkOrderDetailsAdapterDiff.kt\nco/bird/android/feature/workorders/details/adapters/WorkOrderDetailsAdapterDiff\n*L\n16#1:45\n17#1:50\n19#1:55\n29#1:60\n35#1:65\n16#1:46,4\n17#1:51,4\n19#1:56,4\n29#1:61,4\n35#1:66,4\n*E\n"})
/* renamed from: jD6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43184jD6 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String str;
        String id;
        String id2;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        if (m105817b == C37080Xj4.item_bird_code_and_model) {
            return RequestHeadersFactory.MODEL;
        }
        if (m105817b == C37080Xj4.item_work_order_header) {
            return "header";
        }
        Issue issue = null;
        if (m105817b == C37080Xj4.item_issue_header) {
            Object m105816c = adapterItem.m105816c();
            if (m105816c instanceof Issue) {
                issue = m105816c;
            }
            Issue issue2 = issue;
            if (issue2 != null && (id2 = issue2.getId()) != null) {
                return id2;
            }
        } else if (m105817b == C37080Xj4.item_work_order_repair) {
            Object m105816c2 = adapterItem.m105816c();
            if (m105816c2 instanceof LegacyRepair) {
                issue = m105816c2;
            }
            LegacyRepair legacyRepair = issue;
            if (legacyRepair != null && (id = legacyRepair.getId()) != null) {
                return id;
            }
        } else if (m105817b == C37080Xj4.item_work_order_details_header) {
            return "details";
        } else {
            if (m105817b == C37080Xj4.item_work_order_details) {
                Object m105816c3 = adapterItem.m105816c();
                if (m105816c3 instanceof Pair) {
                    issue = m105816c3;
                }
                Pair pair = issue;
                if (pair != null && (str = (String) pair.getFirst()) != null) {
                    return str;
                }
            } else if (m105817b == C37080Xj4.item_work_order_details_add) {
                return "add";
            }
        }
        return "";
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        IssueStatus issueStatus;
        Object obj;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        Object obj2 = null;
        if (m105816c instanceof Pair) {
            Object m105816c2 = newItem.m105816c();
            if (!(m105816c2 instanceof Pair)) {
                m105816c2 = null;
            }
            Pair pair = (Pair) m105816c2;
            Pair pair2 = (Pair) m105816c;
            Object first = pair2.getFirst();
            if (pair != null) {
                obj = pair.getFirst();
            } else {
                obj = null;
            }
            if (!Intrinsics.areEqual(first, obj)) {
                return true;
            }
            Object second = pair2.getSecond();
            if (pair != null) {
                obj2 = pair.getSecond();
            }
            if (!Intrinsics.areEqual(second, obj2)) {
                return true;
            }
        } else if (m105816c instanceof Issue) {
            Object m105816c3 = newItem.m105816c();
            if (!(m105816c3 instanceof Issue)) {
                m105816c3 = null;
            }
            Issue issue = (Issue) m105816c3;
            Issue issue2 = (Issue) m105816c;
            IssueStatus status = issue2.getStatus();
            if (issue != null) {
                issueStatus = issue.getStatus();
            } else {
                issueStatus = null;
            }
            if (status != issueStatus) {
                return true;
            }
            Integer statusColor = issue2.getStatusColor();
            if (issue != null) {
                obj2 = issue.getStatusColor();
            }
            if (!Intrinsics.areEqual(statusColor, obj2)) {
                return true;
            }
        }
        return false;
    }
}
