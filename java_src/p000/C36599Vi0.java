package p000;

import android.content.Intent;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.C11915i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WirePhysicalLockReplacementType;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m28432d2 = {"LVi0;", "LxE;", "LUi0;", "", "Lco/bird/android/model/wire/WirePhysicalLockReplacementType;", "lockTypes", "", "Ba", "Lio/reactivex/Observable;", "", "L", "position", "G4", "Lix2;", "b", "Lix2;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroidx/recyclerview/widget/RecyclerView;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Vi0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36599Vi0 extends AbstractC30071xE implements InterfaceC36365Ui0 {

    /* renamed from: b */
    public final C43024ix2 f39501b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36599Vi0(BaseActivity activity, RecyclerView recyclerView) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        C43024ix2 c43024ix2 = new C43024ix2(activity);
        this.f39501b = c43024ix2;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.addItemDecoration(new C11915i(activity, 1));
        recyclerView.setAdapter(c43024ix2);
    }

    @Override // p000.InterfaceC36365Ui0
    /* renamed from: Ba */
    public void mo79551Ba(List<WirePhysicalLockReplacementType> lockTypes) {
        List mutableList;
        Intrinsics.checkNotNullParameter(lockTypes, "lockTypes");
        List<WirePhysicalLockReplacementType> list = lockTypes;
        if (!list.isEmpty()) {
            if (this.f39501b.getItemCount() == 0) {
                C43024ix2 c43024ix2 = this.f39501b;
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
                c43024ix2.m44899C(mutableList);
                return;
            }
            this.f39501b.m44896p(lockTypes);
        }
    }

    @Override // p000.InterfaceC36365Ui0
    /* renamed from: G4 */
    public void mo79550G4(int i) {
        Intent intent = new Intent();
        WirePhysicalLockReplacementType m44895q = this.f39501b.m44895q(i);
        Intrinsics.checkNotNull(m44895q, "null cannot be cast to non-null type android.os.Parcelable");
        intent.putExtra("physical_lock_type", m44895q);
        getActivity().setResult(-1, intent);
    }

    @Override // p000.InterfaceC36365Ui0
    /* renamed from: L */
    public Observable<Integer> mo79549L() {
        return this.f39501b.m31564E();
    }
}
