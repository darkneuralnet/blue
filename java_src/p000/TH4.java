package p000;

import android.widget.Button;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.BirdProblem;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m28432d2 = {"LTH4;", "LxE;", "LSH4;", "", "Mi", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "m", "", "Lco/bird/android/model/BirdProblem;", "damages", "j4", "Lio/reactivex/Observable;", "N5", "Lq5;", "b", "Lq5;", "binding", "LfS0;", "c", "LfS0;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lq5;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: TH4 */
/* loaded from: classes2.dex */
public final class TH4 extends AbstractC30071xE implements SH4 {

    /* renamed from: b */
    public final C27484q5 f35172b;

    /* renamed from: c */
    public final C40941fS0 f35173c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TH4(BaseActivity activity, C27484q5 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f35172b = binding;
        this.f35173c = new C40941fS0(activity);
    }

    @Override // p000.SH4
    /* renamed from: Mi */
    public void mo83971Mi() {
        this.f35172b.f104638f.setVisibility(0);
        this.f35172b.f104636d.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f35172b.f104636d.setItemAnimator(new C11894g());
        this.f35172b.f104636d.addItemDecoration(new FN5(getActivity(), C37044Xf4.activity_vertical_margin));
        this.f35172b.f104636d.setAdapter(this.f35173c);
    }

    @Override // p000.SH4
    /* renamed from: N5 */
    public Observable<Unit> mo83970N5() {
        Button button = this.f35172b.f104639g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.startInspection");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.SH4
    /* renamed from: j4 */
    public void mo83969j4(List<BirdProblem> damages) {
        List mutableList;
        Intrinsics.checkNotNullParameter(damages, "damages");
        List<BirdProblem> list = damages;
        if (!list.isEmpty()) {
            if (this.f35173c.getItemCount() == 0) {
                C40941fS0 c40941fS0 = this.f35173c;
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
                c40941fS0.m44899C(mutableList);
                return;
            }
            this.f35173c.m44896p(damages);
        }
    }

    @Override // p000.SH4
    /* renamed from: m */
    public void mo83968m(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f35172b.f104634b.setText(code);
    }
}
