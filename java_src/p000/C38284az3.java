package p000;

import androidx.recyclerview.widget.C11905h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Laz3;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOutboundScanAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutboundScanAdapterDiff.kt\nco/bird/android/feature/transferorder/scanner/outbound/adapters/OutboundScanAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,33:1\n18#2:34\n18#2:39\n18#2:44\n9#3,4:35\n9#3,4:40\n9#3,4:45\n*S KotlinDebug\n*F\n+ 1 OutboundScanAdapterDiff.kt\nco/bird/android/feature/transferorder/scanner/outbound/adapters/OutboundScanAdapterDiff\n*L\n16#1:34\n24#1:39\n27#1:44\n16#1:35,4\n24#1:40,4\n27#1:45,4\n*E\n"})
/* renamed from: az3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38284az3 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        PC5 pc5;
        String m90585e;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        if (m105817b == C35442Qj4.item_outbound_scan_header) {
            return "header";
        }
        if (m105817b == C45268mk4.item_scan_vehicle) {
            Object m105816c = adapterItem.m105816c();
            if (!(m105816c instanceof Pair)) {
                m105816c = null;
            }
            Pair pair = (Pair) m105816c;
            if (pair != null && (pc5 = (PC5) pair.getFirst()) != null && (m90585e = pc5.m90585e()) != null) {
                return m90585e;
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
        Object obj = null;
        if (m105816c instanceof C39488cz3) {
            Object m105816c2 = newItem.m105816c();
            if (m105816c2 instanceof C39488cz3) {
                obj = m105816c2;
            }
            if (Intrinsics.areEqual(m105816c, obj)) {
                return false;
            }
        } else if (m105816c instanceof Pair) {
            Object second = ((Pair) m105816c).getSecond();
            Object m105816c3 = newItem.m105816c();
            if (!(m105816c3 instanceof Pair)) {
                m105816c3 = null;
            }
            Pair pair = (Pair) m105816c3;
            if (pair != null) {
                obj = (Boolean) pair.getSecond();
            }
            if (Intrinsics.areEqual(second, obj)) {
                return false;
            }
        }
        return true;
    }
}
