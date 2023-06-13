package p000;

import androidx.recyclerview.widget.C11905h;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\f\u0010\u000b\u001a\u00020\u0004*\u00020\nH\u0002¨\u0006\u000e"}, m28432d2 = {"LOm;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "Lze0;", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "co.bird.android.feature.operator.bottomsheets"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAreaBottomSheetAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AreaBottomSheetAdapterDiff.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,26:1\n18#2:27\n18#2:32\n9#3,4:28\n9#3,4:33\n*S KotlinDebug\n*F\n+ 1 AreaBottomSheetAdapterDiff.kt\nco/bird/android/feature/bottomsheets/area/adapters/AreaBottomSheetAdapterDiff\n*L\n12#1:27\n19#1:32\n12#1:28,4\n19#1:33,4\n*E\n"})
/* renamed from: Om */
/* loaded from: classes3.dex */
public final class C6108Om implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String m91547d;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        if (adapterItem.m105817b() != C32409Dk4.item_cap_restriction) {
            return "";
        }
        Object m105816c = adapterItem.m105816c();
        if (!(m105816c instanceof C52911ze0)) {
            m105816c = null;
        }
        C52911ze0 c52911ze0 = (C52911ze0) m105816c;
        if (c52911ze0 == null || (m91547d = m91547d(c52911ze0)) == null) {
            return "";
        }
        return m91547d;
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        if (m105816c instanceof C52911ze0) {
            Object m105816c2 = newItem.m105816c();
            if (!(m105816c2 instanceof C52911ze0)) {
                m105816c2 = null;
            }
            if (!Intrinsics.areEqual(m105816c, m105816c2)) {
                return true;
            }
        } else if (!Intrinsics.areEqual(m105816c, newItem.m105816c())) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final String m91547d(C52911ze0 c52911ze0) {
        EnumC52318ye0 m945d = c52911ze0.m945d();
        String m942g = c52911ze0.m942g();
        String m946c = c52911ze0.m946c();
        return m945d + m942g + m946c;
    }
}
