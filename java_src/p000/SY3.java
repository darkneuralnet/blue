package p000;

import android.widget.Button;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.BirdProblem;
import co.bird.android.model.constant.PotentialIssuesScreenType;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m28432d2 = {"LSY3;", "LxE;", "LRY3;", "", "h6", "Wa", "", "Lco/bird/android/model/BirdProblem;", "issues", "Mf", "Lio/reactivex/Observable;", "xj", "LO4;", "b", "LO4;", "binding", "LfS0;", "c", "LfS0;", "adapter", "Lco/bird/android/model/constant/PotentialIssuesScreenType;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/constant/PotentialIssuesScreenType;", "uiType", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LO4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: SY3 */
/* loaded from: classes2.dex */
public final class SY3 extends AbstractC30071xE implements RY3 {

    /* renamed from: b */
    public final C5820O4 f33872b;

    /* renamed from: c */
    public final C40941fS0 f33873c;

    /* renamed from: d */
    public PotentialIssuesScreenType f33874d;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SY3$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C7474a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PotentialIssuesScreenType.values().length];
            try {
                iArr[PotentialIssuesScreenType.CONNECTION_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SY3(BaseActivity activity, C5820O4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f33872b = binding;
        C40941fS0 c40941fS0 = new C40941fS0(activity);
        this.f33873c = c40941fS0;
        binding.f25603g.setLayoutManager(new LinearLayoutManager(activity));
        binding.f25603g.setItemAnimator(new C11894g());
        binding.f25603g.addItemDecoration(new FN5(activity, C37044Xf4.activity_vertical_margin));
        binding.f25603g.setAdapter(c40941fS0);
    }

    @Override // p000.RY3
    /* renamed from: Mf */
    public void mo85297Mf(List<BirdProblem> issues) {
        List mutableList;
        Intrinsics.checkNotNullParameter(issues, "issues");
        List<BirdProblem> list = issues;
        if (!list.isEmpty()) {
            if (this.f33873c.getItemCount() == 0) {
                C40941fS0 c40941fS0 = this.f33873c;
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) list);
                c40941fS0.m44899C(mutableList);
            } else {
                this.f33873c.m44896p(issues);
            }
        }
        PotentialIssuesScreenType potentialIssuesScreenType = this.f33874d;
        if (potentialIssuesScreenType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("uiType");
            potentialIssuesScreenType = null;
        }
        if (C7474a.$EnumSwitchMapping$0[potentialIssuesScreenType.ordinal()] == 1) {
            this.f33872b.f25600d.setText(getActivity().getResources().getString(C45871nl4.potential_issues_with_count, Integer.valueOf(this.f33873c.getItemCount())));
        }
        if (this.f33873c.getItemCount() == 0) {
            RecyclerView.AbstractC11855p layoutManager = this.f33872b.f25603g.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).m66706s2();
            this.f33872b.f25603g.setOverScrollMode(2);
            return;
        }
        this.f33872b.f25603g.setOverScrollMode(0);
    }

    @Override // p000.RY3
    /* renamed from: Wa */
    public void mo85296Wa() {
        this.f33874d = PotentialIssuesScreenType.CONNECTION_ERROR;
        this.f33872b.f25599c.setText(getActivity().getString(C45871nl4.potential_issues_connection_error_title));
        this.f33872b.f25604h.setText(getActivity().getString(C45871nl4.potential_issues_listed_below));
        this.f33872b.f25600d.setText(getActivity().getString(C45871nl4.potential_issues_with_count));
        this.f33872b.f25602f.setVisibility(8);
    }

    @Override // p000.RY3
    /* renamed from: h6 */
    public void mo85295h6() {
        this.f33874d = PotentialIssuesScreenType.POTENTIAL_ISSUES;
        this.f33872b.f25599c.setText(getActivity().getString(C45871nl4.potential_issues_title));
        this.f33872b.f25604h.setText(getActivity().getString(C45871nl4.potential_issues_please_review_subheader));
        this.f33872b.f25600d.setText(getActivity().getString(C45871nl4.possible_issues));
        this.f33872b.f25602f.setText(getActivity().getString(C45871nl4.potential_issues_please_review_description));
    }

    @Override // p000.RY3
    /* renamed from: xj */
    public Observable<Unit> mo85294xj() {
        Button button = this.f33872b.f25598b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.cantFixButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }
}
