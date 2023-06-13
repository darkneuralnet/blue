package p000;

import androidx.recyclerview.widget.C11905h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Lpp3;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorOrderLandingAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderLandingAdapterDiff.kt\nco/bird/android/feature/transferorder/operator/landing/adapters/OperatorOrderLandingAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,32:1\n18#2:33\n18#2:38\n18#2:43\n18#2:48\n9#3,4:34\n9#3,4:39\n9#3,4:44\n9#3,4:49\n*S KotlinDebug\n*F\n+ 1 OperatorOrderLandingAdapterDiff.kt\nco/bird/android/feature/transferorder/operator/landing/adapters/OperatorOrderLandingAdapterDiff\n*L\n12#1:33\n13#1:38\n23#1:43\n26#1:48\n12#1:34,4\n13#1:39,4\n23#1:44,4\n26#1:49,4\n*E\n"})
/* renamed from: pp3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47096pp3 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        String str = null;
        if (m105817b == C35442Qj4.item_operator_landing_header) {
            Object m105816c = adapterItem.m105816c();
            if (m105816c instanceof String) {
                str = m105816c;
            }
            String str2 = str;
            if (str2 == null) {
                return "";
            }
            return str2;
        } else if (m105817b != C35442Qj4.item_operator_landing_order) {
            return "";
        } else {
            Object m105816c2 = adapterItem.m105816c();
            if (m105816c2 instanceof C36431Up3) {
                str = m105816c2;
            }
            C36431Up3 c36431Up3 = str;
            if (c36431Up3 == null) {
                return "";
            }
            String str3 = c36431Up3.m80795b() + " " + c36431Up3.m80792e();
            if (str3 == null) {
                return "";
            }
            return str3;
        }
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        Object obj = null;
        if (m105816c instanceof String) {
            Object m105816c2 = newItem.m105816c();
            if (m105816c2 instanceof String) {
                obj = m105816c2;
            }
            if (Intrinsics.areEqual(m105816c, obj)) {
                return false;
            }
        } else if (m105816c instanceof C36431Up3) {
            Object m105816c3 = newItem.m105816c();
            if (m105816c3 instanceof C36431Up3) {
                obj = m105816c3;
            }
            if (Intrinsics.areEqual(m105816c, obj)) {
                return false;
            }
        }
        return true;
    }
}
