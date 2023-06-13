package p000;

import androidx.recyclerview.widget.LinearLayoutManager;
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
import p000.InterfaceC44721lp0;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m28432d2 = {"Lmp0;", "LxE;", "Llp0;", "LKZ;", "b", "LKZ;", "binding", "LYm0;", "c", "LYm0;", "Pl", "()LYm0;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LKZ;)V", "co.bird.android.feature.lib.command"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mp0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45314mp0 extends AbstractC30071xE implements InterfaceC44721lp0 {

    /* renamed from: b */
    public final C4490KZ f98853b;

    /* renamed from: c */
    public final C37337Ym0 f98854c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45314mp0(BaseActivity activity, C4490KZ binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f98853b = binding;
        this.f98854c = new C37337Ym0();
        binding.f19859b.setLayoutManager(new LinearLayoutManager(activity));
        binding.f19859b.setAdapter(getAdapter());
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: B */
    public Observable<VehicleCommand> mo17130B() {
        return InterfaceC44721lp0.C25796a.m26777c(this);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: Jd */
    public void mo17128Jd(VehicleCommand vehicleCommand) {
        InterfaceC44721lp0.C25796a.m26776d(this, vehicleCommand);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: M3 */
    public void mo17126M3(VehicleCommand vehicleCommand) {
        InterfaceC44721lp0.C25796a.m26772h(this, vehicleCommand);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: Pl */
    public C37337Ym0 getAdapter() {
        return this.f98854c;
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: Sa */
    public AbstractC24507p<Integer> mo17124Sa(List<AlarmOption> list) {
        return InterfaceC44721lp0.C25796a.m26774f(this, list);
    }

    @Override // p000.AbstractC30071xE, p000.AbstractC9344XC, p000.InterfaceC44721lp0
    public /* bridge */ /* synthetic */ BaseCoreActivity getActivity() {
        return getActivity();
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: o */
    public void mo17123o(Collection<C3023H6> collection) {
        InterfaceC44721lp0.C25796a.m26775e(this, collection);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: t1 */
    public void mo17122t1() {
        InterfaceC44721lp0.C25796a.m26778b(this);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: v9 */
    public void mo17121v9(VehicleCommand vehicleCommand) {
        InterfaceC44721lp0.C25796a.m26771i(this, vehicleCommand);
    }
}
