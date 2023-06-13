package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.wire.ReleaseValidationResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"Lau4;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "release_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nReleaseAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseAdapterDiff.kt\nco/bird/android/feature/release/adapters/ReleaseAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,32:1\n18#2:33\n18#2:38\n18#2:43\n9#3,4:34\n9#3,4:39\n9#3,4:44\n*S KotlinDebug\n*F\n+ 1 ReleaseAdapterDiff.kt\nco/bird/android/feature/release/adapters/ReleaseAdapterDiff\n*L\n15#1:33\n23#1:38\n26#1:43\n15#1:34,4\n23#1:39,4\n26#1:44,4\n*E\n"})
/* renamed from: au4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38235au4 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String birdId;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        if (m105817b == C36144Tj4.item_scan_header) {
            return "header";
        }
        if (m105817b == C45268mk4.item_fleet_status_vehicle) {
            Object m105816c = adapterItem.m105816c();
            if (!(m105816c instanceof ReleaseValidationResult)) {
                m105816c = null;
            }
            ReleaseValidationResult releaseValidationResult = (ReleaseValidationResult) m105816c;
            if (releaseValidationResult != null && (birdId = releaseValidationResult.getBirdId()) != null) {
                return birdId;
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
        if (m105816c instanceof ReleaseValidationResult) {
            Object m105816c2 = newItem.m105816c();
            if (m105816c2 instanceof ReleaseValidationResult) {
                obj = m105816c2;
            }
            if (!Intrinsics.areEqual(m105816c, obj)) {
                return true;
            }
        } else if (m105816c instanceof C33435Hu4) {
            Object m105816c3 = newItem.m105816c();
            if (m105816c3 instanceof C33435Hu4) {
                obj = m105816c3;
            }
            if (!Intrinsics.areEqual(m105816c, obj)) {
                return true;
            }
        }
        return false;
    }
}
