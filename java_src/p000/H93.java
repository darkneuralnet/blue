package p000;

import co.bird.android.model.NonRepair;
import co.bird.android.model.NonRepairReason;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/NonRepair;", "", C17296a.f69688o, "(Lco/bird/android/model/NonRepair;)Z", "anySelected", "repair_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNonRepair+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonRepair+.kt\nco/bird/android/feature/repair/extensions/NonRepair_Kt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,10:1\n1747#2,2:11\n1747#2,3:13\n1749#2:16\n*S KotlinDebug\n*F\n+ 1 NonRepair+.kt\nco/bird/android/feature/repair/extensions/NonRepair_Kt\n*L\n6#1:11,2\n7#1:13,3\n6#1:16\n*E\n"})
/* renamed from: H93 */
/* loaded from: classes3.dex */
public final class H93 {
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m104262a(NonRepair nonRepair) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(nonRepair, "<this>");
        List<NonRepairReason> reasons = nonRepair.getReasons();
        if ((reasons instanceof Collection) && reasons.isEmpty()) {
            return false;
        }
        for (NonRepairReason nonRepairReason : reasons) {
            if (!nonRepairReason.getSelected()) {
                List<NonRepairReason> subreasons = nonRepairReason.getSubreasons();
                if (subreasons != null) {
                    List<NonRepairReason> list = subreasons;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        for (NonRepairReason nonRepairReason2 : list) {
                            if (nonRepairReason2.getSelected()) {
                                z3 = true;
                                break;
                            }
                        }
                    }
                    z3 = false;
                    if (z3) {
                        z2 = true;
                        if (!z2) {
                            z = false;
                            continue;
                            if (z) {
                                return true;
                            }
                        }
                    }
                }
                z2 = false;
                if (!z2) {
                }
            }
            z = true;
            continue;
            if (z) {
            }
        }
        return false;
    }
}
