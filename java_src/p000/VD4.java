package p000;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import co.bird.android.model.wire.WireBird;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, m28432d2 = {"LVD4;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "", "getItemCount", "position", "Landroidx/fragment/app/Fragment;", "q", "Lco/bird/android/model/wire/WireBird;", "bird", "", "P", "k", "I", "itemCount", "l", "Lco/bird/android/model/wire/WireBird;", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/lifecycle/f;", "lifecycle", "<init>", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairV2FragmentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV2FragmentAdapter.kt\nco/bird/android/feature/repair/v2/overview/adapters/RepairV2FragmentAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
/* renamed from: VD4 */
/* loaded from: classes3.dex */
public final class VD4 extends FragmentStateAdapter {

    /* renamed from: k */
    public int f38752k;

    /* renamed from: l */
    public WireBird f38753l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VD4(FragmentManager fragmentManager, AbstractC11719f lifecycle) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.f38752k = 2;
    }

    /* renamed from: P */
    public final void m80208P(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f38752k = 2;
        this.f38753l = bird;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f38752k;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    /* renamed from: q */
    public Fragment mo8036q(int i) {
        C35352Pz4 m89179a;
        C52394yl6 m2641a;
        if (i != 0) {
            if (i != 1) {
                return new Fragment();
            }
            WireBird wireBird = this.f38753l;
            if (wireBird == null || (m2641a = C52394yl6.f120141c.m2641a(wireBird)) == null) {
                return new Fragment();
            }
            return m2641a;
        }
        WireBird wireBird2 = this.f38753l;
        if (wireBird2 == null || (m89179a = C35352Pz4.f29604d.m89179a(wireBird2)) == null) {
            return new Fragment();
        }
        return m89179a;
    }
}
