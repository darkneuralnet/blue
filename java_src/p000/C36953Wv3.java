package p000;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import co.bird.android.model.persistence.OperatorTaskGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0014"}, m28432d2 = {"LWv3;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "", "getItemCount", "position", "Landroidx/fragment/app/Fragment;", "q", "", "Lco/bird/android/model/persistence/OperatorTaskGroup;", "taskGroups", "", "P", "k", "Ljava/util/List;", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/lifecycle/f;", "lifecycle", "<init>", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/f;)V", "task-list-v2_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Wv3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36953Wv3 extends FragmentStateAdapter {

    /* renamed from: k */
    public List<OperatorTaskGroup> f42298k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36953Wv3(FragmentManager fragmentManager, AbstractC11719f lifecycle) {
        super(fragmentManager, lifecycle);
        List<OperatorTaskGroup> emptyList;
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f42298k = emptyList;
    }

    /* renamed from: P */
    public final void m77707P(List<OperatorTaskGroup> taskGroups) {
        Intrinsics.checkNotNullParameter(taskGroups, "taskGroups");
        this.f42298k = taskGroups;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f42298k.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    /* renamed from: q */
    public Fragment mo8036q(int i) {
        return C36017Sv3.f34472n.m84611a(this.f42298k.get(i).getTitle());
    }
}
