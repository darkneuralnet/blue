package p000;

import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import androidx.viewpager.widget.ViewPager;
import co.bird.android.app.feature.ridertutorial.widget.CircleIndicatorView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WirePhysicalLockTutorialStep;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0012\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\nH\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006 "}, m28432d2 = {"LeT3;", "LxE;", "LdT3;", "", "Lco/bird/android/model/wire/WirePhysicalLockTutorialStep;", "steps", "", "Je", "Lio/reactivex/Observable;", "u", "", "position", "N3", "l4", "", "show", "Q4", "r0", "titleRes", "setTitle", "LUS3;", "b", "LUS3;", "binding", "LVS3;", "c", "LVS3;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LUS3;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: eT3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40360eT3 extends AbstractC30071xE implements InterfaceC39768dT3 {

    /* renamed from: b */
    public final US3 f78414b;

    /* renamed from: c */
    public VS3 f78415c;

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"eT3$a", "Landroidx/viewpager/widget/ViewPager$l;", "", "position", "", "onPageSelected", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: eT3$a */
    /* loaded from: classes2.dex */
    public static final class C20043a extends ViewPager.C12079l {

        /* renamed from: c */
        public final /* synthetic */ List<WirePhysicalLockTutorialStep> f78417c;

        public C20043a(List<WirePhysicalLockTutorialStep> list) {
            this.f78417c = list;
        }

        @Override // androidx.viewpager.widget.ViewPager.C12079l, androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageSelected(int i) {
            int lastIndex;
            int i2;
            C40360eT3.this.f78414b.f37445e.setSelectedIndex(i);
            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(this.f78417c);
            if (i == lastIndex) {
                i2 = C45871nl4.physical_lock_tutorial_finish_button;
            } else {
                i2 = C45871nl4.physical_lock_tutorial_continue_button;
            }
            C40360eT3.this.f78414b.f37442b.setText(C40360eT3.this.getActivity().getString(i2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40360eT3(BaseActivity activity, US3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f78414b = binding;
    }

    @Override // p000.InterfaceC39768dT3
    /* renamed from: Je */
    public void mo13067Je(List<WirePhysicalLockTutorialStep> steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        if (!steps.isEmpty()) {
            VS3 vs3 = new VS3(getActivity(), steps);
            this.f78415c = vs3;
            this.f78414b.f37448h.setAdapter(vs3);
            this.f78414b.f37448h.setOffscreenPageLimit(3);
            CircleIndicatorView circleIndicatorView = this.f78414b.f37445e;
            VS3 vs32 = this.f78415c;
            if (vs32 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                vs32 = null;
            }
            circleIndicatorView.setNumCircles(vs32.getCount());
            this.f78414b.f37448h.addOnPageChangeListener(new C20043a(steps));
            return;
        }
        throw new IllegalArgumentException("steps must not be empty");
    }

    @Override // p000.InterfaceC39768dT3
    /* renamed from: N3 */
    public void mo13066N3(int i) {
        this.f78414b.f37448h.setCurrentItem(i);
    }

    @Override // p000.InterfaceC39768dT3
    /* renamed from: Q4 */
    public void mo13065Q4(boolean z) {
        Button button = this.f78414b.f37447g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.secondaryButton");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    @Override // p000.InterfaceC39768dT3
    /* renamed from: l4 */
    public int mo13060l4() {
        return this.f78414b.f37448h.getCurrentItem();
    }

    @Override // p000.InterfaceC39768dT3
    /* renamed from: r0 */
    public Observable<Unit> mo13059r0() {
        Button button = this.f78414b.f37447g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.secondaryButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC39768dT3
    public void setTitle(int i) {
        ActionBar supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        supportActionBar.mo70242E(getActivity().getResources().getString(i));
    }

    @Override // p000.InterfaceC39768dT3
    /* renamed from: u */
    public Observable<Unit> mo13058u() {
        Button button = this.f78414b.f37442b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.button");
        return C45219mf5.m25214a(button);
    }
}
