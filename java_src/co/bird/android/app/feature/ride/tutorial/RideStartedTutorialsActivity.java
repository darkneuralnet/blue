package co.bird.android.app.feature.ride.tutorial;

import android.os.Bundle;
import co.bird.android.library.flow.FlowActivity;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\u0013\u001a\u00020\u000e8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/app/feature/ride/tutorial/RideStartedTutorialsActivity;", "Lco/bird/android/library/flow/FlowActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LC65;", "G", "LC65;", "w0", "()LC65;", "setCoordinatorFactory", "(LC65;)V", "coordinatorFactory", "LB65;", "H", "Lkotlin/Lazy;", "t0", "()LB65;", "coordinator", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RideStartedTutorialsActivity extends FlowActivity {

    /* renamed from: G */
    public C65 f62688G;

    /* renamed from: H */
    public final Lazy f62689H;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LB65;", "b", "()LB65;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.ride.tutorial.RideStartedTutorialsActivity$a */
    /* loaded from: classes2.dex */
    public static final class C14299a extends Lambda implements Function0<B65> {
        public C14299a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final B65 invoke() {
            return RideStartedTutorialsActivity.this.m59462w0().create();
        }
    }

    public RideStartedTutorialsActivity() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new C14299a());
        this.f62689H = lazy;
    }

    @Override // co.bird.android.library.flow.FlowActivity, co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        H22.f12748a.mo24089I2(this);
        super.onCreate(bundle);
    }

    @Override // co.bird.android.library.flow.FlowActivity
    /* renamed from: t0 */
    public B65 getCoordinator() {
        return (B65) this.f62689H.getValue();
    }

    /* renamed from: w0 */
    public final C65 m59462w0() {
        C65 c65 = this.f62688G;
        if (c65 != null) {
            return c65;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coordinatorFactory");
        return null;
    }
}
