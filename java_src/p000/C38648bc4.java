package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.QCAutoCheck;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Lbc4;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nQualityControlResultAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QualityControlResultAdapterDiff.kt\nco/bird/android/qualitycontrol/result/adapters/QualityControlResultAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,27:1\n18#2:28\n18#2:33\n18#2:38\n18#2:43\n9#3,4:29\n9#3,4:34\n9#3,4:39\n9#3,4:44\n*S KotlinDebug\n*F\n+ 1 QualityControlResultAdapterDiff.kt\nco/bird/android/qualitycontrol/result/adapters/QualityControlResultAdapterDiff\n*L\n13#1:28\n14#1:33\n16#1:38\n17#1:43\n13#1:29,4\n14#1:34,4\n16#1:39,4\n17#1:44,4\n*E\n"})
/* renamed from: bc4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38648bc4 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String display;
        String m30216b;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        Object obj = null;
        if (m105817b == C43489jk4.item_vehicle_pass_fail) {
            Object m105816c = adapterItem.m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null) {
                obj = (Boolean) pair.getFirst();
            }
            return String.valueOf(obj);
        } else if (m105817b == C43489jk4.item_qc_pass_fail_text) {
            Object m105816c2 = adapterItem.m105816c();
            if (m105816c2 instanceof Boolean) {
                obj = m105816c2;
            }
            return String.valueOf(obj);
        } else if (m105817b == C45268mk4.item_button_secondary) {
            return "Add Issues";
        } else {
            if (m105817b == C43489jk4.item_inspection_failed_issue) {
                Object m105816c3 = adapterItem.m105816c();
                if (m105816c3 instanceof C43399jb4) {
                    obj = m105816c3;
                }
                C43399jb4 c43399jb4 = (C43399jb4) obj;
                if (c43399jb4 != null && (m30216b = c43399jb4.m30216b()) != null) {
                    return m30216b;
                }
            } else if (m105817b == C43489jk4.item_auto_check) {
                Object m105816c4 = adapterItem.m105816c();
                if (m105816c4 instanceof QCAutoCheck) {
                    obj = m105816c4;
                }
                QCAutoCheck qCAutoCheck = (QCAutoCheck) obj;
                if (qCAutoCheck != null && (display = qCAutoCheck.getDisplay()) != null) {
                    return display;
                }
            } else if (m105817b == C43489jk4.item_passed_qc_buttons) {
                return "Success Action Buttons";
            } else {
                if (m105817b == C43489jk4.item_add_notes) {
                    return "Add Notes";
                }
                if (m105817b == C45268mk4.item_button) {
                    return "Failed Submit";
                }
            }
            return "";
        }
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return false;
    }
}
