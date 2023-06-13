package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.QCInspection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Lgs2;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nListQualityAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListQualityAdapterDiff.kt\nco/bird/android/qualitycontrol/list/adapters/ListQualityAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,32:1\n18#2:33\n18#2:38\n18#2:43\n18#2:48\n9#3,4:34\n9#3,4:39\n9#3,4:44\n9#3,4:49\n*S KotlinDebug\n*F\n+ 1 ListQualityAdapterDiff.kt\nco/bird/android/qualitycontrol/list/adapters/ListQualityAdapterDiff\n*L\n13#1:33\n14#1:38\n15#1:43\n25#1:48\n13#1:34,4\n14#1:39,4\n15#1:44,4\n25#1:49,4\n*E\n"})
/* renamed from: gs2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41788gs2 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String str;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        QCInspection qCInspection = null;
        if (m105817b == C43489jk4.item_inspection_list_card) {
            Object m105816c = adapterItem.m105816c();
            if (m105816c instanceof QCInspection) {
                qCInspection = m105816c;
            }
            QCInspection qCInspection2 = qCInspection;
            if (qCInspection2 == null || (str = qCInspection2.getTitle()) == null) {
                return "";
            }
        } else if (m105817b == C45268mk4.item_button_secondary) {
            Object m105816c2 = adapterItem.m105816c();
            if (m105816c2 instanceof String) {
                qCInspection = m105816c2;
            }
            String str2 = qCInspection;
            if (str2 == null) {
                return "";
            }
            return str2;
        } else if (m105817b != C45268mk4.item_button_matte_black) {
            return "";
        } else {
            Object m105816c3 = adapterItem.m105816c();
            if (m105816c3 instanceof Pair) {
                qCInspection = m105816c3;
            }
            Pair pair = qCInspection;
            if (pair == null || (str = (String) pair.getFirst()) == null) {
                return "";
            }
        }
        return str;
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        if (!(m105816c instanceof Pair)) {
            return false;
        }
        Object m105816c2 = newItem.m105816c();
        Boolean bool = null;
        if (!(m105816c2 instanceof Pair)) {
            m105816c2 = null;
        }
        Pair pair = (Pair) m105816c2;
        Object second = ((Pair) m105816c).getSecond();
        if (pair != null) {
            bool = (Boolean) pair.getSecond();
        }
        if (Intrinsics.areEqual(second, bool)) {
            return false;
        }
        return true;
    }
}
