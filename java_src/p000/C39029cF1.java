package p000;

import androidx.recyclerview.widget.C11905h;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LcF1;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHardCountAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountAdapterDiff.kt\nco/bird/android/feature/hardcount/adapters/HardCountAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,31:1\n18#2:32\n18#2:37\n18#2:42\n18#2:47\n18#2:52\n9#3,4:33\n9#3,4:38\n9#3,4:43\n9#3,4:48\n9#3,4:53\n*S KotlinDebug\n*F\n+ 1 HardCountAdapterDiff.kt\nco/bird/android/feature/hardcount/adapters/HardCountAdapterDiff\n*L\n12#1:32\n13#1:37\n14#1:42\n15#1:47\n24#1:52\n12#1:33,4\n13#1:38,4\n14#1:43,4\n15#1:48,4\n24#1:53,4\n*E\n"})
/* renamed from: cF1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39029cF1 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String m17697j;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        C47366qH1 c47366qH1 = null;
        if (m105817b == C40514ej4.item_hard_count) {
            Object m105816c = adapterItem.m105816c();
            if (m105816c instanceof C47366qH1) {
                c47366qH1 = m105816c;
            }
            C47366qH1 c47366qH12 = (C47366qH1) c47366qH1;
            if (c47366qH12 == null || (m17697j = c47366qH12.m17697j()) == null) {
                return "";
            }
        } else if (m105817b == C40514ej4.item_hard_count_pending_upload) {
            Object m105816c2 = adapterItem.m105816c();
            if (m105816c2 instanceof C47366qH1) {
                c47366qH1 = m105816c2;
            }
            C47366qH1 c47366qH13 = (C47366qH1) c47366qH1;
            if (c47366qH13 == null || (m17697j = c47366qH13.m17697j()) == null) {
                return "";
            }
        } else if (m105817b == C40514ej4.item_hard_count_unidentified) {
            Object m105816c3 = adapterItem.m105816c();
            if (m105816c3 instanceof C47366qH1) {
                c47366qH1 = m105816c3;
            }
            C47366qH1 c47366qH14 = (C47366qH1) c47366qH1;
            if (c47366qH14 == null || (m17697j = c47366qH14.m17697j()) == null) {
                return "";
            }
        } else if (m105817b != C40514ej4.item_last_successful_hard_count) {
            return "";
        } else {
            Object m105816c4 = adapterItem.m105816c();
            if (m105816c4 instanceof C47366qH1) {
                c47366qH1 = m105816c4;
            }
            C47366qH1 c47366qH15 = c47366qH1;
            if (c47366qH15 == null || (m17697j = c47366qH15.m17697j()) == null) {
                return "";
            }
        }
        return m17697j;
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Integer num;
        Collection m17704c;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        if (!(m105816c instanceof C47366qH1)) {
            return false;
        }
        Object m105816c2 = newItem.m105816c();
        Integer num2 = null;
        if (!(m105816c2 instanceof C47366qH1)) {
            m105816c2 = null;
        }
        C47366qH1 c47366qH1 = (C47366qH1) m105816c2;
        Collection m17704c2 = ((C47366qH1) m105816c).m17704c();
        if (m17704c2 != null) {
            num = Integer.valueOf(m17704c2.size());
        } else {
            num = null;
        }
        if (c47366qH1 != null && (m17704c = c47366qH1.m17704c()) != null) {
            num2 = Integer.valueOf(m17704c.size());
        }
        if (Intrinsics.areEqual(num, num2)) {
            return false;
        }
        return true;
    }
}
