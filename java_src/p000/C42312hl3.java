package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.constant.FilterLogicToggleOption;
import co.bird.android.model.persistence.OperatorOptionFilter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Lhl3;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "filters_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorFilterV2AdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2AdapterDiff.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2AdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,32:1\n18#2:33\n18#2:38\n18#2:43\n18#2:48\n9#3,4:34\n9#3,4:39\n9#3,4:44\n9#3,4:49\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2AdapterDiff.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2AdapterDiff\n*L\n13#1:33\n15#1:38\n21#1:43\n22#1:48\n13#1:34,4\n15#1:39,4\n21#1:44,4\n22#1:49,4\n*E\n"})
/* renamed from: hl3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42312hl3 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String id;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        OperatorOptionFilter operatorOptionFilter = null;
        if (m105817b == C37539Zi4.item_operator_filter_title) {
            Object m105816c = adapterItem.m105816c();
            if (m105816c instanceof OperatorOptionFilter) {
                operatorOptionFilter = m105816c;
            }
            OperatorOptionFilter operatorOptionFilter2 = (OperatorOptionFilter) operatorOptionFilter;
            if (operatorOptionFilter2 == null || (id = operatorOptionFilter2.getLabel()) == null) {
                return "";
            }
        } else {
            boolean z = true;
            if (m105817b != C37539Zi4.item_operator_multi_select_filter && m105817b != C37539Zi4.item_operator_range_select_filter) {
                z = false;
            }
            if (!z) {
                return "";
            }
            Object m105816c2 = adapterItem.m105816c();
            if (m105816c2 instanceof OperatorOptionFilter) {
                operatorOptionFilter = m105816c2;
            }
            OperatorOptionFilter operatorOptionFilter3 = operatorOptionFilter;
            if (operatorOptionFilter3 == null || (id = operatorOptionFilter3.getId()) == null) {
                return "";
            }
        }
        return id;
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        String str;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        FilterLogicToggleOption filterLogicToggleOption = null;
        if (!(m105816c instanceof OperatorOptionFilter)) {
            m105816c = null;
        }
        OperatorOptionFilter operatorOptionFilter = (OperatorOptionFilter) m105816c;
        Object m105816c2 = newItem.m105816c();
        if (!(m105816c2 instanceof OperatorOptionFilter)) {
            m105816c2 = null;
        }
        OperatorOptionFilter operatorOptionFilter2 = (OperatorOptionFilter) m105816c2;
        if (operatorOptionFilter != null) {
            str = operatorOptionFilter.getId();
        } else {
            str = null;
        }
        if (!Intrinsics.areEqual(str, "BIRD_BATTERY")) {
            return false;
        }
        FilterLogicToggleOption logicOperator = operatorOptionFilter.getLogicOperator();
        if (operatorOptionFilter2 != null) {
            filterLogicToggleOption = operatorOptionFilter2.getLogicOperator();
        }
        if (logicOperator == filterLogicToggleOption) {
            return false;
        }
        return true;
    }
}
