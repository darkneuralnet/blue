package p000;

import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.BirdAction;
import co.bird.android.model.wire.WireBird;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b%\u0010&J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u000b0\u000b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, m28432d2 = {"LIv3;", "LxE;", "LHv3;", "", "LH6;", "adapterSections", "", "b", "Lio/reactivex/Observable;", "", "H", "Lco/bird/android/model/wire/WireBird;", "Q0", "Lco/bird/android/model/constant/BirdAction;", "U0", "bird", "Hj", "", "visible", "Ob", "", "count", "td", "LC4;", "LC4;", "binding", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "c", "Lio/reactivex/subjects/d;", "taskPublisher", "LQu3;", DateTokenConverter.CONVERTER_KEY, "LQu3;", "taskAdapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LC4;)V", "task-list_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Iv3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33677Iv3 extends AbstractC30071xE implements InterfaceC33443Hv3 {

    /* renamed from: b */
    public final C0848C4 f16463b;

    /* renamed from: c */
    public final C24558d<WireBird> f16464c;

    /* renamed from: d */
    public final C35540Qu3 f16465d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33677Iv3(BaseActivity activity, C0848C4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f16463b = binding;
        C24558d<WireBird> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<WireBird>()");
        this.f16464c = m31902e;
        C35540Qu3 c35540Qu3 = new C35540Qu3(m31902e);
        this.f16465d = c35540Qu3;
        binding.f3347d.setAdapter(c35540Qu3);
        binding.f3347d.setLayoutManager(new LinearLayoutManager(activity));
    }

    @Override // p000.InterfaceC33443Hv3
    /* renamed from: H */
    public Observable<String> mo101479H() {
        return this.f16465d.m87641p();
    }

    @Override // p000.InterfaceC33443Hv3
    /* renamed from: Hj */
    public void mo101478Hj(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f16463b.f3345b.m54306q(bird);
    }

    @Override // p000.InterfaceC33443Hv3
    /* renamed from: Ob */
    public void mo101477Ob(boolean z) {
        this.f16463b.f3345b.m54301v(z);
    }

    @Override // p000.InterfaceC33443Hv3
    /* renamed from: Q0 */
    public Observable<WireBird> mo101476Q0() {
        return this.f16464c;
    }

    @Override // p000.InterfaceC33443Hv3
    /* renamed from: U0 */
    public Observable<BirdAction> mo101475U0() {
        return this.f16463b.f3345b.m54312k();
    }

    @Override // p000.InterfaceC33443Hv3
    /* renamed from: b */
    public void mo101474b(List<C3023H6> adapterSections) {
        Intrinsics.checkNotNullParameter(adapterSections, "adapterSections");
        this.f16465d.m87642o(adapterSections);
    }

    @Override // p000.InterfaceC33443Hv3
    /* renamed from: td */
    public void mo101473td(int i) {
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        supportActionBar.mo70242E(getActivity().getString(C45871nl4.operator_task_list_title_count, Integer.valueOf(i)));
    }
}
