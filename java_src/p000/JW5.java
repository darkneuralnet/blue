package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.QCInspection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LJW5;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwipeQualityControlAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeQualityControlAdapterDiff.kt\nco/bird/android/qualitycontrol/swipe/adapters/SwipeQualityControlAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,16:1\n18#2:17\n9#3,4:18\n*S KotlinDebug\n*F\n+ 1 SwipeQualityControlAdapterDiff.kt\nco/bird/android/qualitycontrol/swipe/adapters/SwipeQualityControlAdapterDiff\n*L\n9#1:17\n9#1:18,4\n*E\n"})
/* renamed from: JW5 */
/* loaded from: classes4.dex */
public final class JW5 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String title;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        Object m105816c = adapterItem.m105816c();
        if (!(m105816c instanceof QCInspection)) {
            m105816c = null;
        }
        QCInspection qCInspection = (QCInspection) m105816c;
        if (qCInspection == null || (title = qCInspection.getTitle()) == null) {
            return "";
        }
        return title;
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return false;
    }
}
