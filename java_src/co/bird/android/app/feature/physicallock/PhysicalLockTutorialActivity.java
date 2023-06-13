package co.bird.android.app.feature.physicallock;

import android.os.Bundle;
import co.bird.android.app.feature.physicallock.PhysicalLockTutorialActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WirePhysicalLock;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/app/feature/physicallock/PhysicalLockTutorialActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "LaT3;", "B", "LaT3;", "k0", "()LaT3;", "setPresenterFactory", "(LaT3;)V", "presenterFactory", "LWS3;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LWS3;", "presenter", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPhysicalLockTutorialActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhysicalLockTutorialActivity.kt\nco/bird/android/app/feature/physicallock/PhysicalLockTutorialActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,43:1\n180#2:44\n*S KotlinDebug\n*F\n+ 1 PhysicalLockTutorialActivity.kt\nco/bird/android/app/feature/physicallock/PhysicalLockTutorialActivity\n*L\n32#1:44\n*E\n"})
/* loaded from: classes2.dex */
public final class PhysicalLockTutorialActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC37971aT3 f61973B;

    /* renamed from: C */
    public WS3 f61974C;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.physicallock.PhysicalLockTutorialActivity$a */
    /* loaded from: classes2.dex */
    public static final class C14007a extends Lambda implements Function1<Unit, Unit> {
        public C14007a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            PhysicalLockTutorialActivity.this.mo58957w().mo37050b1(-1);
        }
    }

    public PhysicalLockTutorialActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: m0 */
    public static final void m60181m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public final InterfaceC37971aT3 m60182k0() {
        InterfaceC37971aT3 interfaceC37971aT3 = this.f61973B;
        if (interfaceC37971aT3 != null) {
            return interfaceC37971aT3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        mo58957w().mo37050b1(-1);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24075T(this);
        US3 m81487c = US3.m81487c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m81487c, "inflate(layoutInflater)");
        setContentView(m81487c.getRoot());
        mo58977D();
        ZS3 mo64516a = m60182k0().mo64516a(m58963Z(), new C40360eT3(this, m81487c));
        mo64516a.mo73093a((WirePhysicalLock) getIntent().getParcelableExtra("physical_lock"), getIntent().getBooleanExtra("force_end_tutorial", false));
        Object m33094as = mo64516a.observeDone().m33094as(AutoDispose.m45239a(m58963Z()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14007a c14007a = new C14007a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: SS3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                PhysicalLockTutorialActivity.m60181m0(Function1.this, obj);
            }
        });
        this.f61974C = mo64516a;
    }
}
