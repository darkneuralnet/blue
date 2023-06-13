package p000;

import ch.qos.logback.core.joran.action.Action;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.RideStartInBadAreaView;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.ViewScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, m28432d2 = {"Lc65;", "Lb65;", "LxE;", "", "remainingSeconds", "", "Z6", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Lco/bird/android/widget/RideStartInBadAreaView;", "b", "Lco/bird/android/widget/RideStartInBadAreaView;", "rideStartInBadAreaView", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/widget/RideStartInBadAreaView;Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideStartInBadAreaBannerUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideStartInBadAreaBannerUi.kt\nco/bird/android/app/feature/banners/presenter/RideStartInBadAreaBannerUiImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/KotlinExtensionsKt\n*L\n1#1,26:1\n41#2:27\n*S KotlinDebug\n*F\n+ 1 RideStartInBadAreaBannerUi.kt\nco/bird/android/app/feature/banners/presenter/RideStartInBadAreaBannerUiImpl\n*L\n23#1:27\n*E\n"})
/* renamed from: c65  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38948c65 extends AbstractC30071xE implements InterfaceC38355b65 {

    /* renamed from: b */
    public final RideStartInBadAreaView f60128b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38948c65(RideStartInBadAreaView rideStartInBadAreaView, BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(rideStartInBadAreaView, "rideStartInBadAreaView");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f60128b = rideStartInBadAreaView;
    }

    @Override // p000.InterfaceC38355b65
    /* renamed from: Z6 */
    public void mo61929Z6(int i) {
        this.f60128b.m54398r(i);
    }

    @Override // p000.InterfaceC38355b65
    public ScopeProvider scope() {
        ScopeProvider m45202a = ViewScopeProvider.m45202a(this.f60128b);
        Intrinsics.checkExpressionValueIsNotNull(m45202a, "ViewScopeProvider.from(this)");
        return m45202a;
    }
}
