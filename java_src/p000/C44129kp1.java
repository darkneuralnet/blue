package p000;

import androidx.fragment.app.AbstractC11685m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.FleetReportPage;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C53042zr1;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0013"}, m28432d2 = {"Lkp1;", "LKA;", "", C17296a.f69688o, "", "fleetId", "fleetName", "", "e", "Lmp1;", "purpose", "f", DateTokenConverter.CONVERTER_KEY, "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "containerId", "<init>", "(Landroidx/fragment/app/FragmentManager;I)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetNavigator.kt\nco/bird/android/feature/fleetstatus/common/FleetNavigator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1747#2,3:70\n*S KotlinDebug\n*F\n+ 1 FleetNavigator.kt\nco/bird/android/feature/fleetstatus/common/FleetNavigator\n*L\n40#1:70,3\n*E\n"})
/* renamed from: kp1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44129kp1 extends AbstractC4367KA {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44129kp1(FragmentManager fragmentManager, int i) {
        super(fragmentManager, i);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
    }

    public static /* synthetic */ void goToFleetStatus$default(C44129kp1 c44129kp1, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        c44129kp1.m28390e(str, str2);
    }

    @Override // p000.AbstractC4367KA
    /* renamed from: a */
    public boolean mo28392a() {
        Object first;
        Object first2;
        List<Fragment> m67283z0 = m99112b().m67283z0();
        Intrinsics.checkNotNullExpressionValue(m67283z0, "fragmentManager.fragments");
        boolean z = false;
        if (m67283z0.size() > 1) {
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) m67283z0);
            if (!(first instanceof C53042zr1)) {
                List<Fragment> list = m67283z0;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((Fragment) it.next()) instanceof C53042zr1) {
                                z = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z) {
                    AbstractC11685m m67311q = m99112b().m67311q();
                    Intrinsics.checkNotNullExpressionValue(m67311q, "fragmentManager.beginTransaction()");
                    for (int size = m67283z0.size() - 1; size > 0; size--) {
                        m67311q = m67311q.mo67105s(m67283z0.get(size));
                        Intrinsics.checkNotNullExpressionValue(m67311q, "transaction.remove(fragments[i])");
                    }
                    first2 = CollectionsKt___CollectionsKt.first((List<? extends Object>) m67283z0);
                    m67311q.mo67123A((Fragment) first2).mo67114j();
                    return true;
                }
                return super.mo28392a();
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void m28391d(String fleetId) {
        List<? extends FleetReportPage> listOf;
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        C53042zr1.C31572a c31572a = C53042zr1.f122378i;
        FleetReportPage fleetReportPage = FleetReportPage.CORE;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FleetReportPage[]{fleetReportPage, FleetReportPage.INSIGHTS});
        m99111c(c31572a.m225a(fleetId, null, listOf, fleetReportPage));
    }

    /* renamed from: e */
    public final void m28390e(String fleetId, String str) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        m99111c(C53032zq1.f122302c.m393a(fleetId, str));
    }

    /* renamed from: f */
    public final void m28389f(EnumC45315mp1 purpose) {
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        m99111c(C34341Lr1.f22118c.m96297a(purpose));
    }
}
