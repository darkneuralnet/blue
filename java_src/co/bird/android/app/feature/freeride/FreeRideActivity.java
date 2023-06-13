package co.bird.android.app.feature.freeride;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.freeride.InterfaceC13751b;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/app/feature/freeride/FreeRideActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Ljz1;", "B", "Ljz1;", "j0", "()Ljz1;", "setPresenter", "(Ljz1;)V", "presenter", "<init>", "()V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFreeRideActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FreeRideActivity.kt\nco/bird/android/app/feature/freeride/FreeRideActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,110:1\n44#2:111\n*S KotlinDebug\n*F\n+ 1 FreeRideActivity.kt\nco/bird/android/app/feature/freeride/FreeRideActivity\n*L\n43#1:111\n*E\n"})
/* loaded from: classes2.dex */
public final class FreeRideActivity extends BaseActivity {

    /* renamed from: C */
    public static final C13743a f61449C = new C13743a(null);

    /* renamed from: D */
    public static final int f61450D = 8;

    /* renamed from: B */
    public InterfaceC43636jz1 f61451B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m28432d2 = {"Lco/bird/android/app/feature/freeride/FreeRideActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.freeride.FreeRideActivity$a */
    /* loaded from: classes2.dex */
    public static final class C13743a {
        public /* synthetic */ C13743a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m60649a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, FreeRideActivity.class);
        }

        private C13743a() {
        }
    }

    public FreeRideActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC43636jz1 m60650j0() {
        InterfaceC43636jz1 interfaceC43636jz1 = this.f61451B;
        if (interfaceC43636jz1 != null) {
            return interfaceC43636jz1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C2621G3 m105893c = C2621G3.m105893c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m105893c, "inflate(layoutInflater)");
        setContentView(m105893c.getRoot());
        InterfaceC13751b.InterfaceC13752a m60648a = C13744a.m60648a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        C42450hz1 c42450hz1 = new C42450hz1();
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        ConstraintLayout root = m105893c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        m60648a.mo60640a(m21419a, c42450hz1, this, m45197b, m58963Z, root).mo60641a(this);
        m60650j0().mo2173a();
    }
}
