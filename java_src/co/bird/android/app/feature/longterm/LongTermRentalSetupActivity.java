package co.bird.android.app.feature.longterm;

import android.os.Bundle;
import co.bird.android.library.flow.FlowActivity;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\u0013\u001a\u00020\u000e8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/app/feature/longterm/LongTermRentalSetupActivity;", "Lco/bird/android/library/flow/FlowActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lsz2;", "G", "Lsz2;", "w0", "()Lsz2;", "setCoordinatorFactory", "(Lsz2;)V", "coordinatorFactory", "Lrz2;", "H", "Lkotlin/Lazy;", "t0", "()Lrz2;", "coordinator", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class LongTermRentalSetupActivity extends FlowActivity {

    /* renamed from: G */
    public InterfaceC48973sz2 f61538G;

    /* renamed from: H */
    public final Lazy f61539H;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lrz2;", "b", "()Lrz2;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLongTermRentalSetupActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupActivity.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupActivity$coordinator$2\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,22:1\n44#2:23\n*S KotlinDebug\n*F\n+ 1 LongTermRentalSetupActivity.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupActivity$coordinator$2\n*L\n15#1:23\n*E\n"})
    /* renamed from: co.bird.android.app.feature.longterm.LongTermRentalSetupActivity$a */
    /* loaded from: classes2.dex */
    public static final class C13769a extends Lambda implements Function0<C48380rz2> {
        public C13769a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C48380rz2 invoke() {
            InterfaceC48973sz2 m60590w0 = LongTermRentalSetupActivity.this.m60590w0();
            AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(LongTermRentalSetupActivity.this);
            Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
            return m60590w0.mo11127a(m45197b);
        }
    }

    public LongTermRentalSetupActivity() {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(new C13769a());
        this.f61539H = lazy;
    }

    @Override // co.bird.android.library.flow.FlowActivity, co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        H22.f12748a.mo24096E0(this);
        super.onCreate(bundle);
    }

    @Override // co.bird.android.library.flow.FlowActivity
    /* renamed from: t0 */
    public C48380rz2 getCoordinator() {
        return (C48380rz2) this.f61539H.getValue();
    }

    /* renamed from: w0 */
    public final InterfaceC48973sz2 m60590w0() {
        InterfaceC48973sz2 interfaceC48973sz2 = this.f61538G;
        if (interfaceC48973sz2 != null) {
            return interfaceC48973sz2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coordinatorFactory");
        return null;
    }
}
