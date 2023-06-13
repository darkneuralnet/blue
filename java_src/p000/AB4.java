package p000;

import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import co.bird.android.widget.adapter.ViewHolderSupplier;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.C45672nQ5;
import p000.InterfaceC52650zB4;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0016\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%"}, m28432d2 = {"LAB4;", "LxE;", "LzB4;", "Lio/reactivex/k;", "", "F1", "Lio/reactivex/Observable;", "Lco/bird/android/model/wire/WireBird;", "j0", "", "LH6;", "Yj", "sections", "Qb", "", "b5", "G5", "Lf5;", "b", "Lf5;", "binding", "LnQ5;", "c", "LnQ5;", "oc", "()LnQ5;", "x7", "(LnQ5;)V", "dialog", "LEA4;", DateTokenConverter.CONVERTER_KEY, "LEA4;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lf5;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: AB4 */
/* loaded from: classes3.dex */
public final class AB4 extends AbstractC30071xE implements InterfaceC52650zB4 {

    /* renamed from: b */
    public final C20206f5 f237b;

    /* renamed from: c */
    public C45672nQ5 f238c;

    /* renamed from: d */
    public final EA4 f239d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AB4(BaseActivity activity, C20206f5 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f237b = binding;
        EA4 ea4 = new EA4();
        this.f239d = ea4;
        binding.f79414d.setLayoutManager(new LinearLayoutManager(activity));
        binding.f79414d.setAdapter(ea4);
        binding.f79414d.addItemDecoration(new CH1());
    }

    @Override // p000.InterfaceC52650zB4
    /* renamed from: F1 */
    public AbstractC24490k<Unit> mo1701F1() {
        FloatingActionButton floatingActionButton = this.f237b.f79412b;
        Intrinsics.checkNotNullExpressionValue(floatingActionButton, "binding.addRepair");
        AbstractC24490k<Unit> m32108t0 = C44626lf5.clicksThrottle$default(floatingActionButton, 0L, 1, null).toFlowable(EnumC23460b.DROP).m32108t0(C23454a.m33087a(), false, 1);
        Intrinsics.checkNotNullExpressionValue(m32108t0, "binding.addRepair.clicks…s.mainThread(), false, 1)");
        return m32108t0;
    }

    @Override // p000.InterfaceC52650zB4
    /* renamed from: G5 */
    public void mo1700G5() {
        this.f239d.m109330o();
    }

    @Override // p000.InterfaceC52650zB4
    /* renamed from: Qb */
    public void mo1699Qb(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f239d.m109327r(sections);
    }

    @Override // p000.InterfaceC52650zB4
    /* renamed from: Yj */
    public List<C3023H6> mo1698Yj() {
        return this.f239d.m109329p();
    }

    @Override // p000.FQ5
    /* renamed from: b1 */
    public void mo12610b1(List<C3023H6> list) {
        InterfaceC52650zB4.C30926a.m1693c(this, list);
    }

    @Override // p000.InterfaceC52650zB4
    /* renamed from: b5 */
    public String mo1697b5() {
        return this.f239d.m109328q();
    }

    @Override // p000.FQ5
    /* renamed from: g1 */
    public void mo12607g1(List<C3023H6> list) {
        InterfaceC52650zB4.C30926a.m1694b(this, list);
    }

    @Override // p000.FQ5
    /* renamed from: ig */
    public Observable<C45672nQ5.EnumC26504b> mo12606ig(ViewHolderSupplier<AbstractC40357eT0> viewHolderSupplier) {
        return InterfaceC52650zB4.C30926a.m1692d(this, viewHolderSupplier);
    }

    @Override // p000.InterfaceC52650zB4
    /* renamed from: j0 */
    public Observable<WireBird> mo1696j0() {
        Observable<WireBird> m109326t = this.f239d.m109326t();
        Intrinsics.checkNotNullExpressionValue(m109326t, "adapter.viewDetailClicks()");
        return m109326t;
    }

    @Override // p000.FQ5
    /* renamed from: oc */
    public C45672nQ5 mo12605oc() {
        return this.f238c;
    }

    @Override // p000.FQ5
    /* renamed from: sh */
    public S74 mo107152sh() {
        return InterfaceC52650zB4.C30926a.m1695a(this);
    }

    @Override // p000.FQ5
    /* renamed from: x7 */
    public void mo12602x7(C45672nQ5 c45672nQ5) {
        this.f238c = c45672nQ5;
    }
}
