package p000;

import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import co.bird.android.core.base.BaseCoreActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.AlarmOption;
import co.bird.android.model.VehicleCommand;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC33824Jl6;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"LKl6;", "LxE;", "LJl6;", "Landroidx/recyclerview/widget/RecyclerView;", "b", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "LoA;", "c", "LoA;", "getAdapter", "()LoA;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroidx/recyclerview/widget/RecyclerView;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Kl6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34058Kl6 extends AbstractC30071xE implements InterfaceC33824Jl6 {

    /* renamed from: b */
    public final RecyclerView f20194b;

    /* renamed from: c */
    public final AbstractC26846oA f20195c;

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"Kl6$a", "LqA;", "LF6;", "r", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Kl6$a */
    /* loaded from: classes3.dex */
    public static final class C4589a extends AbstractC27514qA {

        @Metadata(m28433d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m28432d2 = {"Kl6$a$a", "LrA;", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Kl6$a$a */
        /* loaded from: classes3.dex */
        public static final class C4590a extends AbstractC27859rA {
        }

        @Override // p000.AbstractC5440My
        /* renamed from: r */
        public InterfaceC2152F6 mo2178r() {
            return new C4590a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34058Kl6(BaseActivity activity, RecyclerView recyclerView) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f20194b = recyclerView;
        this.f20195c = new C4589a();
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(getAdapter());
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: B */
    public Observable<VehicleCommand> mo17130B() {
        return InterfaceC33824Jl6.C4222a.m99866b(this);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: Jd */
    public void mo17128Jd(VehicleCommand vehicleCommand) {
        InterfaceC33824Jl6.C4222a.m99865c(this, vehicleCommand);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: M3 */
    public void mo17126M3(VehicleCommand vehicleCommand) {
        InterfaceC33824Jl6.C4222a.m99862f(this, vehicleCommand);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: Sa */
    public AbstractC24507p<Integer> mo17124Sa(List<AlarmOption> list) {
        return InterfaceC33824Jl6.C4222a.m99863e(this, list);
    }

    @Override // p000.AbstractC30071xE, p000.AbstractC9344XC, p000.InterfaceC44721lp0
    public /* bridge */ /* synthetic */ BaseCoreActivity getActivity() {
        return getActivity();
    }

    @Override // p000.InterfaceC44721lp0
    public AbstractC26846oA getAdapter() {
        return this.f20195c;
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: o */
    public void mo17123o(Collection<C3023H6> collection) {
        InterfaceC33824Jl6.C4222a.m99864d(this, collection);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: t1 */
    public void mo17122t1() {
        InterfaceC33824Jl6.C4222a.m99867a(this);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: v9 */
    public void mo17121v9(VehicleCommand vehicleCommand) {
        InterfaceC33824Jl6.C4222a.m99861g(this, vehicleCommand);
    }
}
