package p000;

import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"Lqm6;", "LxE;", "Lpm6;", "", "Lco/bird/android/model/wire/WireBird;", "vehicles", "", "m1", "Lio/reactivex/Observable;", "a9", "Lp4;", "b", "Lp4;", "binding", "Lx43;", "c", "Lx43;", "nestVehicleListAdapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lp4;Lx43;)V", "nest-details_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qm6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47662qm6 extends AbstractC30071xE implements InterfaceC47069pm6 {

    /* renamed from: b */
    public final C27137p4 f105782b;

    /* renamed from: c */
    public final C51394x43 f105783c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47662qm6(BaseActivity activity, C27137p4 binding, C51394x43 nestVehicleListAdapter) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(nestVehicleListAdapter, "nestVehicleListAdapter");
        this.f105782b = binding;
        this.f105783c = nestVehicleListAdapter;
        binding.f103086c.f36770b.setLayoutManager(new LinearLayoutManager(activity));
        binding.f103086c.f36770b.setItemAnimator(new C11894g());
        binding.f103086c.f36770b.setAdapter(nestVehicleListAdapter);
    }

    @Override // p000.InterfaceC47069pm6
    /* renamed from: a9 */
    public Observable<WireBird> mo17096a9() {
        return this.f105783c.m5877o();
    }

    @Override // p000.InterfaceC47069pm6
    /* renamed from: m1 */
    public void mo17095m1(List<WireBird> vehicles) {
        Intrinsics.checkNotNullParameter(vehicles, "vehicles");
        this.f105783c.m5876p(vehicles);
    }
}
