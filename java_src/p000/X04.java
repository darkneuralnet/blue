package p000;

import androidx.recyclerview.widget.C11905h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LX04;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPreloadV2OptionsAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreloadV2OptionsAdapterDiff.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,29:1\n18#2:30\n18#2:35\n9#3,4:31\n9#3,4:36\n*S KotlinDebug\n*F\n+ 1 PreloadV2OptionsAdapterDiff.kt\nco/bird/android/feature/payment/preload/v2/options/PreloadV2OptionsAdapterDiff\n*L\n10#1:30\n19#1:35\n10#1:31,4\n19#1:36,4\n*E\n"})
/* renamed from: X04 */
/* loaded from: classes3.dex */
public final class X04 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String m86128f;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        if (m105817b == C31932Bj4.item_preload_v2_option) {
            Object m105816c = adapterItem.m105816c();
            if (!(m105816c instanceof S04)) {
                m105816c = null;
            }
            S04 s04 = (S04) m105816c;
            if (s04 == null || (m86128f = s04.m86128f()) == null) {
                return "";
            }
            return m86128f;
        } else if (m105817b != C31932Bj4.item_preload_v2_autoreload_section) {
            return "";
        } else {
            return "auto_reload_section";
        }
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        boolean z;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        if (!(m105816c instanceof S04)) {
            return false;
        }
        Object m105816c2 = newItem.m105816c();
        if (!(m105816c2 instanceof S04)) {
            m105816c2 = null;
        }
        S04 s04 = (S04) m105816c2;
        if (s04 != null && ((S04) m105816c).m86126h() == s04.m86126h()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            S04 s042 = (S04) m105816c;
            if (Intrinsics.areEqual(s042.m86128f(), s04.m86128f()) && Intrinsics.areEqual(s042.m86131c(), s04.m86131c()) && Intrinsics.areEqual(s042.m86127g(), s04.m86127g())) {
                return false;
            }
        }
        return true;
    }
}
