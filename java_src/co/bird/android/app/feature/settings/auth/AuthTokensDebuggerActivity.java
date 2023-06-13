package co.bird.android.app.feature.settings.auth;

import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/app/feature/settings/auth/AuthTokensDebuggerActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lzq;", "B", "Lzq;", "j0", "()Lzq;", "setPresenterFactory", "(Lzq;)V", "presenterFactory", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAuthTokensDebuggerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthTokensDebuggerActivity.kt\nco/bird/android/app/feature/settings/auth/AuthTokensDebuggerActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,24:1\n44#2:25\n*S KotlinDebug\n*F\n+ 1 AuthTokensDebuggerActivity.kt\nco/bird/android/app/feature/settings/auth/AuthTokensDebuggerActivity\n*L\n21#1:25\n*E\n"})
/* loaded from: classes2.dex */
public final class AuthTokensDebuggerActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC31515zq f62748B;

    public AuthTokensDebuggerActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC31515zq m59394j0() {
        InterfaceC31515zq interfaceC31515zq = this.f62748B;
        if (interfaceC31515zq != null) {
            return interfaceC31515zq;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C7315S2 m86084c = C7315S2.m86084c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m86084c, "inflate(layoutInflater)");
        setContentView(m86084c.getRoot());
        H22.f12748a.mo24048i3(this);
        InterfaceC31515zq m59394j0 = m59394j0();
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m59394j0.mo396a(m45197b, new C1628Dq(m86084c)).m2498f();
    }
}
