package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.persistence.OperatorOrderView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LFo3;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorOrderDetailsAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderDetailsAdapterDiff.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,43:1\n18#2:44\n18#2:49\n18#2:54\n18#2:59\n18#2:64\n18#2:69\n18#2:74\n18#2:79\n18#2:84\n9#3,4:45\n9#3,4:50\n9#3,4:55\n9#3,4:60\n9#3,4:65\n9#3,4:70\n9#3,4:75\n9#3,4:80\n9#3,4:85\n*S KotlinDebug\n*F\n+ 1 OperatorOrderDetailsAdapterDiff.kt\nco/bird/android/feature/transferorder/operator/details/adapters/OperatorOrderDetailsAdapterDiff\n*L\n15#1:44\n17#1:49\n18#1:54\n19#1:59\n20#1:64\n28#1:69\n31#1:74\n34#1:79\n37#1:84\n15#1:45,4\n17#1:50,4\n18#1:55,4\n19#1:60,4\n20#1:65,4\n28#1:70,4\n31#1:75,4\n34#1:80,4\n37#1:85,4\n*E\n"})
/* renamed from: Fo3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32912Fo3 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String m111520c;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        C45910np3 c45910np3 = null;
        if (m105817b == C35442Qj4.item_operator_order_header) {
            Object m105816c = adapterItem.m105816c();
            if (m105816c instanceof C45910np3) {
                c45910np3 = m105816c;
            }
            C45910np3 c45910np32 = c45910np3;
            if (c45910np32 == null || (m111520c = c45910np32.m22334c()) == null) {
                return "";
            }
        } else {
            boolean z = true;
            if (m105817b != C35442Qj4.item_operator_order_location && m105817b != C35442Qj4.item_operator_order_delivery_point) {
                z = false;
            }
            if (z) {
                Object m105816c2 = adapterItem.m105816c();
                if (m105816c2 instanceof OperatorOrderView) {
                    c45910np3 = m105816c2;
                }
                OperatorOrderView operatorOrderView = c45910np3;
                if (operatorOrderView == null || (m111520c = operatorOrderView.getLocationName()) == null) {
                    return "";
                }
            } else if (m105817b == C35442Qj4.item_operator_order_date) {
                Object m105816c3 = adapterItem.m105816c();
                if (m105816c3 instanceof C31976Bo3) {
                    c45910np3 = m105816c3;
                }
                C31976Bo3 c31976Bo3 = c45910np3;
                if (c31976Bo3 == null || (m111520c = c31976Bo3.m113470b()) == null) {
                    return "";
                }
            } else if (m105817b == C35442Qj4.item_operator_order_bill_of_lading) {
                Object m105816c4 = adapterItem.m105816c();
                if (m105816c4 instanceof OperatorOrderView) {
                    c45910np3 = m105816c4;
                }
                OperatorOrderView operatorOrderView2 = c45910np3;
                if (operatorOrderView2 == null || (m111520c = operatorOrderView2.getBolStatusText()) == null) {
                    return "";
                }
            } else if (m105817b != C35442Qj4.item_operator_order_detail) {
                return "";
            } else {
                Object m105816c5 = adapterItem.m105816c();
                if (m105816c5 instanceof C32210Co3) {
                    c45910np3 = m105816c5;
                }
                C32210Co3 c32210Co3 = c45910np3;
                if (c32210Co3 == null || (m111520c = c32210Co3.m111520c()) == null) {
                    return "";
                }
            }
        }
        return m111520c;
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        Object obj = null;
        if (m105816c instanceof C45910np3) {
            Object m105816c2 = newItem.m105816c();
            if (m105816c2 instanceof C45910np3) {
                obj = m105816c2;
            }
            if (Intrinsics.areEqual(m105816c, obj)) {
                return false;
            }
        } else if (m105816c instanceof OperatorOrderView) {
            Object m105816c3 = newItem.m105816c();
            if (m105816c3 instanceof OperatorOrderView) {
                obj = m105816c3;
            }
            if (Intrinsics.areEqual(m105816c, obj)) {
                return false;
            }
        } else if (m105816c instanceof C31976Bo3) {
            Object m105816c4 = newItem.m105816c();
            if (m105816c4 instanceof C31976Bo3) {
                obj = m105816c4;
            }
            if (Intrinsics.areEqual(m105816c, obj)) {
                return false;
            }
        } else if (m105816c instanceof C32210Co3) {
            Object m105816c5 = newItem.m105816c();
            if (m105816c5 instanceof C32210Co3) {
                obj = m105816c5;
            }
            if (Intrinsics.areEqual(m105816c, obj)) {
                return false;
            }
        }
        return true;
    }
}
