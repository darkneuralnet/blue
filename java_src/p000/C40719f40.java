package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.persistence.Bird;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Lf40;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBulkBirdDetailAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulkBirdDetailAdapterDiff.kt\nco/bird/android/feature/bulkscanner/scan/adapters/BulkBirdDetailAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,27:1\n18#2:28\n18#2:33\n9#3,4:29\n9#3,4:34\n*S KotlinDebug\n*F\n+ 1 BulkBirdDetailAdapterDiff.kt\nco/bird/android/feature/bulkscanner/scan/adapters/BulkBirdDetailAdapterDiff\n*L\n12#1:28\n20#1:33\n12#1:29,4\n20#1:34,4\n*E\n"})
/* renamed from: f40  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40719f40 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        Bird m44395c;
        String id;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        if (adapterItem.m105817b() != C35901Si4.item_operator_bird_detail) {
            return "";
        }
        Object m105816c = adapterItem.m105816c();
        if (!(m105816c instanceof C19728dL)) {
            m105816c = null;
        }
        C19728dL c19728dL = (C19728dL) m105816c;
        if (c19728dL == null || (m44395c = c19728dL.m44395c()) == null || (id = m44395c.getId()) == null) {
            return "";
        }
        return id;
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        if (!(m105816c instanceof C19728dL)) {
            return false;
        }
        Object m105816c2 = newItem.m105816c();
        if (!(m105816c2 instanceof C19728dL)) {
            m105816c2 = null;
        }
        if (Intrinsics.areEqual(m105816c, (C19728dL) m105816c2)) {
            return false;
        }
        return true;
    }
}
