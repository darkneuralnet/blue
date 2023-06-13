package p000;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireNestPhoto;
import com.stripe.android.model.PaymentMethod;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0016J\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0016R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"LQ23;", "LxE;", "LP23;", "", "Lco/bird/android/model/wire/WireNestPhoto;", "photos", "", "Xc", "", "name", "setName", PaymentMethod.BillingDetails.PARAM_ADDRESS, "setAddress", "", "availableParking", "yh", "(Ljava/lang/Integer;)V", "notes", "f5", "Lp4;", "b", "Lp4;", "binding", "LH23;", "c", "LH23;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lp4;)V", "nest-details_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Q23 */
/* loaded from: classes3.dex */
public final class Q23 extends AbstractC30071xE implements P23 {

    /* renamed from: b */
    public final C27137p4 f29722b;

    /* renamed from: c */
    public H23 f29723c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q23(BaseActivity activity, C27137p4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f29722b = binding;
    }

    @Override // p000.P23
    /* renamed from: Xc */
    public void mo89087Xc(List<WireNestPhoto> photos) {
        Intrinsics.checkNotNullParameter(photos, "photos");
        H23 h23 = new H23(getActivity(), photos);
        this.f29723c = h23;
        this.f29722b.f103085b.f34713j.setAdapter(h23);
        this.f29722b.f103085b.f34713j.setOffscreenPageLimit(3);
        T33 t33 = this.f29722b.f103085b;
        t33.f34712i.setViewPager(t33.f34713j);
        this.f29722b.f103085b.f34712i.setPageColor(getColor(C32364Df4.birdNewRoad));
        this.f29722b.f103085b.f34712i.setRadius(C40788fB0.m41780b(getActivity(), 4.0f));
        this.f29722b.f103085b.f34712i.setFillColor(getColor(C32364Df4.white));
    }

    @Override // p000.P23
    /* renamed from: f5 */
    public void mo89086f5(String str) {
        this.f29722b.f103085b.f34710g.setText(str);
    }

    @Override // p000.P23
    public void setAddress(String str) {
        this.f29722b.f103085b.f34706c.setText(str);
    }

    @Override // p000.P23
    public void setName(String str) {
        this.f29722b.f103085b.f34709f.setText(str);
    }

    @Override // p000.P23
    /* renamed from: yh */
    public void mo89085yh(Integer num) {
        this.f29722b.f103085b.f34707d.setText(getActivity().getResources().getString(C45871nl4.nest_details_capacity, num));
    }
}
