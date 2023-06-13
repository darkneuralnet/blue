package p000;

import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.base.BaseCoreActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.AlarmOption;
import co.bird.android.model.CommandCenterButton;
import co.bird.android.model.VehicleCommand;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC47059pl6;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"Lql6;", "LxE;", "Lpl6;", "Lio/reactivex/Observable;", "Lco/bird/android/model/CommandCenterButton;", "B1", "", "K", "LDy1;", "b", "LDy1;", "binding", "LRk6;", "c", "LRk6;", "Pl", "()LRk6;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LDy1;)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ql6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47652ql6 extends AbstractC30071xE implements InterfaceC47059pl6 {

    /* renamed from: b */
    public final C32532Dy1 f105739b;

    /* renamed from: c */
    public final C35687Rk6 f105740c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47652ql6(BaseActivity activity, C32532Dy1 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f105739b = binding;
        this.f105740c = new C35687Rk6();
        binding.f6659b.setAdapter(getAdapter());
        binding.f6659b.setLayoutManager(new LinearLayoutManager(activity));
        binding.f6659b.setItemAnimator(new C11894g());
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: B */
    public Observable<VehicleCommand> mo17130B() {
        return InterfaceC47059pl6.C27384a.m18793b(this);
    }

    @Override // p000.InterfaceC47059pl6
    /* renamed from: B1 */
    public Observable<CommandCenterButton> mo17129B1() {
        return getAdapter().m18039C();
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: Jd */
    public void mo17128Jd(VehicleCommand vehicleCommand) {
        InterfaceC47059pl6.C27384a.m18792c(this, vehicleCommand);
    }

    @Override // p000.InterfaceC47059pl6
    /* renamed from: K */
    public Observable<Unit> mo17127K() {
        C42334hn5 c42334hn5 = new C42334hn5();
        c42334hn5.show(getActivity().getSupportFragmentManager(), "ScrapCompleteBottomSheetDialog");
        return c42334hn5.m35867a5();
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: M3 */
    public void mo17126M3(VehicleCommand vehicleCommand) {
        InterfaceC47059pl6.C27384a.m18789f(this, vehicleCommand);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: Pl */
    public C35687Rk6 getAdapter() {
        return this.f105740c;
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: Sa */
    public AbstractC24507p<Integer> mo17124Sa(List<AlarmOption> list) {
        return InterfaceC47059pl6.C27384a.m18790e(this, list);
    }

    @Override // p000.AbstractC30071xE, p000.AbstractC9344XC, p000.InterfaceC44721lp0
    public /* bridge */ /* synthetic */ BaseCoreActivity getActivity() {
        return getActivity();
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: o */
    public void mo17123o(Collection<C3023H6> collection) {
        InterfaceC47059pl6.C27384a.m18791d(this, collection);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: t1 */
    public void mo17122t1() {
        InterfaceC47059pl6.C27384a.m18794a(this);
    }

    @Override // p000.InterfaceC44721lp0
    /* renamed from: v9 */
    public void mo17121v9(VehicleCommand vehicleCommand) {
        InterfaceC47059pl6.C27384a.m18788g(this, vehicleCommand);
    }
}
