package p000;

import android.os.Bundle;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import co.bird.android.widget.BottomModalSheetLayout;
import co.bird.android.widget.BottomModalSheetModel;
import co.bird.android.widget.C16634c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, m28432d2 = {"Lqo6;", "LxE;", "Lpo6;", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBird;", "Ig", "Lio/reactivex/k;", "", "wc", "", "LH6;", "sections", "o", "", "birdCode", "Lio/reactivex/p;", "Lco/bird/android/widget/c$b;", "Xj", "Lq6;", "b", "Lq6;", "binding", "LQn6;", "c", "LQn6;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lq6;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qo6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47682qo6 extends AbstractC30071xE implements InterfaceC47089po6 {

    /* renamed from: b */
    public final C27489q6 f105852b;

    /* renamed from: c */
    public final C35480Qn6 f105853c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47682qo6(BaseActivity activity, C27489q6 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f105852b = binding;
        C35480Qn6 c35480Qn6 = new C35480Qn6();
        this.f105853c = c35480Qn6;
        binding.f104652c.setAdapter(c35480Qn6);
        binding.f104652c.setLayoutManager(new LinearLayoutManager(activity));
        binding.f104652c.setItemAnimator(new C11894g());
    }

    @Override // p000.InterfaceC47089po6
    /* renamed from: Ig */
    public Observable<WireBird> mo16964Ig() {
        return this.f105853c.m87920w();
    }

    @Override // p000.InterfaceC47089po6
    /* renamed from: Xj */
    public AbstractC24507p<C16634c.EnumC16636b> mo16963Xj(String birdCode) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        C16634c c16634c = new C16634c();
        Bundle bundle = new Bundle();
        bundle.putParcelable("bottom_modal_sheet_model", new BottomModalSheetModel(null, Integer.valueOf(C45871nl4.batches_remove_vehicle_from_batch_title), getActivity().getString(C45871nl4.batches_remove_vehicle_from_batch_subtitle, birdCode), BottomModalSheetLayout.EnumC16464a.DOUBLE, Integer.valueOf(C45871nl4.batches_remove_vehicle_from_batch_primary_button), Integer.valueOf(C45871nl4.batches_remove_vehicle_from_batch_secondary_button), null, null, null, null, null, null, null, 8129, null));
        c16634c.setArguments(bundle);
        c16634c.show(getActivity().getSupportFragmentManager(), "BottomModalSheetFragment");
        return c16634c.m54230B9();
    }

    @Override // p000.InterfaceC47089po6
    /* renamed from: o */
    public void mo16962o(Collection<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f105853c.mo24871u(sections);
    }

    @Override // p000.InterfaceC47089po6
    /* renamed from: wc */
    public AbstractC24490k<Unit> mo16961wc() {
        AbstractC24490k<Unit> m32108t0 = this.f105853c.m87921v().toFlowable(EnumC23460b.DROP).m32108t0(C23454a.m33087a(), false, 1);
        Intrinsics.checkNotNullExpressionValue(m32108t0, "adapter.addVehicleClicks…s.mainThread(), false, 1)");
        return m32108t0;
    }
}
