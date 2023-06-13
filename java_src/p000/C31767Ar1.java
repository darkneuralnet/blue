package p000;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import co.bird.android.model.constant.FleetReportPage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p000.C32451Dp1;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u001c\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, m28432d2 = {"LAr1;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "", "getItemCount", "position", "Landroidx/fragment/app/Fragment;", "q", "", "fleetId", "", "Lco/bird/android/model/constant/FleetReportPage;", "fleetTabs", "", "P", "k", "Ljava/lang/String;", "l", "Ljava/util/List;", "pages", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/lifecycle/f;", "lifecycle", "<init>", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ar1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31767Ar1 extends FragmentStateAdapter {

    /* renamed from: k */
    public String f1202k;

    /* renamed from: l */
    public List<? extends FleetReportPage> f1203l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31767Ar1(FragmentManager fragmentManager, AbstractC11719f lifecycle) {
        super(fragmentManager, lifecycle);
        List<? extends FleetReportPage> emptyList;
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f1203l = emptyList;
    }

    /* renamed from: P */
    public final void m115111P(String fleetId, List<? extends FleetReportPage> fleetTabs) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(fleetTabs, "fleetTabs");
        this.f1202k = fleetId;
        this.f1203l = fleetTabs;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f1203l.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    /* renamed from: q */
    public Fragment mo8036q(int i) {
        C32451Dp1.C1621a c1621a = C32451Dp1.f6383i;
        String str = this.f1202k;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fleetId");
            str = null;
        }
        return c1621a.m109885a(str, this.f1203l.get(i));
    }
}
