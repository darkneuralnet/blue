package co.bird.android.app.feature.main;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC46037o21;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/app/feature/main/MainActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LtG2;", "B", "LtG2;", "k0", "()LtG2;", "setPresenter", "(LtG2;)V", "presenter", "LNV0;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LNV0;", "j0", "()LNV0;", "setDeepLinkNavigatorResolver", "(LNV0;)V", "deepLinkNavigatorResolver", "<init>", "()V", C17296a.f69688o, "b", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\nco/bird/android/app/feature/main/MainActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,80:1\n44#2:81\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\nco/bird/android/app/feature/main/MainActivity\n*L\n40#1:81\n*E\n"})
/* loaded from: classes2.dex */
public final class MainActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC49136tG2 f61565B;

    /* renamed from: C */
    public NV0 f61566C;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/app/feature/main/MainActivity$a;", "", "Lco/bird/android/app/feature/main/MainActivity;", "activity", "", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC13775b.class})
    /* renamed from: co.bird.android.app.feature.main.MainActivity$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC13773a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/app/feature/main/MainActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LDQ3;", "permissionManager", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/app/feature/main/MainActivity$a;", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.main.MainActivity$a$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC13774a {
            /* renamed from: a */
            InterfaceC13773a mo60559a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance DQ3 dq3, @BindsInstance ScopeProvider scopeProvider);
        }

        /* renamed from: a */
        void mo60558a(MainActivity mainActivity);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/app/feature/main/MainActivity$b;", "", "LLG2;", "impl", "LtG2;", C17296a.f69688o, "LdH2;", "LbH2;", "b", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.app.feature.main.MainActivity$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC13775b {
        @Binds
        /* renamed from: a */
        public abstract InterfaceC49136tG2 m60562a(LG2 lg2);

        @Binds
        /* renamed from: b */
        public abstract InterfaceC38455bH2 m60561b(C39659dH2 c39659dH2);
    }

    public MainActivity() {
        super(true, null, null, 6, null);
    }

    /* renamed from: j0 */
    public final NV0 m60564j0() {
        NV0 nv0 = this.f61566C;
        if (nv0 != null) {
            return nv0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deepLinkNavigatorResolver");
        return null;
    }

    /* renamed from: k0 */
    public final InterfaceC49136tG2 m60563k0() {
        InterfaceC49136tG2 interfaceC49136tG2 = this.f61565B;
        if (interfaceC49136tG2 != null) {
            return interfaceC49136tG2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-8193));
        getWindow().setStatusBarColor(C49785uM4.m10399d(getResources(), C32364Df4.lightSplashBG, null));
        setContentView(C39311cj4.activity_main);
        InterfaceC13773a.InterfaceC13774a m60560a = C13776a.m60560a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        DQ3 mo58956x = mo58956x();
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m60560a.mo60559a(m21419a, this, mo58956x, m45197b).mo60558a(this);
        NV0 m60564j0 = m60564j0();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        m60564j0.mo78297e(intent);
        m60563k0().mo12548a(getIntent().hasExtra(EnumC34191La4.DISPATCH.m96623b()));
        InterfaceC46037o21.C26801a.initRecaptchaClient$default(m58972K(), false, 1, null);
    }
}
