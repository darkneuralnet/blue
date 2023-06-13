package p000;

import androidx.recyclerview.widget.C11905h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LWl2;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLandingAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingAdapterDiff.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,33:1\n18#2:34\n18#2:39\n18#2:44\n18#2:49\n18#2:54\n9#3,4:35\n9#3,4:40\n9#3,4:45\n9#3,4:50\n9#3,4:55\n*S KotlinDebug\n*F\n+ 1 LandingAdapterDiff.kt\nco/bird/android/feature/transferorder/landing/adapters/LandingAdapterDiff\n*L\n14#1:34\n15#1:39\n16#1:44\n17#1:49\n27#1:54\n14#1:35,4\n15#1:40,4\n16#1:45,4\n17#1:50,4\n27#1:55,4\n*E\n"})
/* renamed from: Wl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36862Wl2 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String m76373b;
        String m79460d;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        if (m105817b == C35442Qj4.item_order_item_date_range) {
            return "calendar_picker";
        }
        C36626Vl0 c36626Vl0 = null;
        if (m105817b == C35442Qj4.item_order_item_header) {
            Object m105816c = adapterItem.m105816c();
            if (m105816c instanceof C36626Vl0) {
                c36626Vl0 = m105816c;
            }
            C36626Vl0 c36626Vl02 = c36626Vl0;
            if (c36626Vl02 != null && (m79460d = c36626Vl02.m79460d()) != null) {
                return m79460d;
            }
        } else if (m105817b == C35442Qj4.item_order_item_date_subheader) {
            Object m105816c2 = adapterItem.m105816c();
            if (m105816c2 instanceof String) {
                c36626Vl0 = m105816c2;
            }
            String str = (String) c36626Vl0;
            if (str != null) {
                return str;
            }
        } else if (m105817b == C35442Qj4.item_order_item_empty) {
            Object m105816c3 = adapterItem.m105816c();
            if (m105816c3 instanceof String) {
                c36626Vl0 = m105816c3;
            }
            String str2 = c36626Vl0;
            if (str2 != null) {
                return str2;
            }
        } else if (m105817b == C35442Qj4.item_order_item) {
            Object m105816c4 = adapterItem.m105816c();
            if (m105816c4 instanceof C37096Xl2) {
                c36626Vl0 = m105816c4;
            }
            C37096Xl2 c37096Xl2 = c36626Vl0;
            if (c37096Xl2 != null && (m76373b = c37096Xl2.m76373b()) != null) {
                return m76373b;
            }
        }
        return "";
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        if (m105816c instanceof C36626Vl0) {
            return true;
        }
        if (m105816c instanceof String) {
            if (!Intrinsics.areEqual(m105816c, newItem.m105816c())) {
                return true;
            }
        } else if (!(m105816c instanceof C37096Xl2)) {
            return true;
        } else {
            Object m105816c2 = newItem.m105816c();
            if (!(m105816c2 instanceof C37096Xl2)) {
                m105816c2 = null;
            }
            if (!Intrinsics.areEqual(m105816c, m105816c2)) {
                return true;
            }
        }
        return false;
    }
}
