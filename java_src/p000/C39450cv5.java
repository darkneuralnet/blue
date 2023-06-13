package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import co.bird.android.widget.adapter.ViewHolderSupplier;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.C45672nQ5;
import p000.InterfaceC38839bv5;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m28432d2 = {"Lcv5;", "LmE;", "Lbv5;", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBird;", "j0", "LnQ5;", DateTokenConverter.CONVERTER_KEY, "LnQ5;", "oc", "()LnQ5;", "x7", "(LnQ5;)V", "dialog", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lb6;", "binding", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lb6;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cv5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39450cv5 extends C26017mE implements InterfaceC38839bv5 {

    /* renamed from: d */
    public C45672nQ5 f75854d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39450cv5(BaseActivity activity, C12291b6 binding) {
        super(activity, binding);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
    }

    @Override // p000.FQ5
    /* renamed from: b1 */
    public void mo12610b1(List<C3023H6> list) {
        InterfaceC38839bv5.C13341a.m62132b(this, list);
    }

    @Override // p000.FQ5
    /* renamed from: g1 */
    public void mo12607g1(List<C3023H6> list) {
        InterfaceC38839bv5.C13341a.m62133a(this, list);
    }

    @Override // p000.FQ5
    /* renamed from: ig */
    public Observable<C45672nQ5.EnumC26504b> mo12606ig(ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier) {
        return InterfaceC38839bv5.C13341a.m62131c(this, viewHolderSupplier);
    }

    @Override // p000.InterfaceC38839bv5
    /* renamed from: j0 */
    public Observable<WireBird> mo44815j0() {
        return m25931Pl().m18442x();
    }

    @Override // p000.FQ5
    /* renamed from: oc */
    public C45672nQ5 mo12605oc() {
        return this.f75854d;
    }

    @Override // p000.FQ5
    /* renamed from: x7 */
    public void mo12602x7(C45672nQ5 c45672nQ5) {
        this.f75854d = c45672nQ5;
    }
}
