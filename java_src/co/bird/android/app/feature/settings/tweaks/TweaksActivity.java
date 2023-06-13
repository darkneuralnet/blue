package co.bird.android.app.feature.settings.tweaks;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.settings.tweaks.InterfaceC14348b;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/app/feature/settings/tweaks/TweaksActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lnb6;", "B", "Lnb6;", "j0", "()Lnb6;", "setPresenter", "(Lnb6;)V", "presenter", "<init>", "()V", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTweaksActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TweaksActivity.kt\nco/bird/android/app/feature/settings/tweaks/TweaksActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,78:1\n44#2:79\n*S KotlinDebug\n*F\n+ 1 TweaksActivity.kt\nco/bird/android/app/feature/settings/tweaks/TweaksActivity\n*L\n35#1:79\n*E\n"})
/* loaded from: classes2.dex */
public final class TweaksActivity extends BaseActivity {

    /* renamed from: C */
    public static final C14344a f62824C = new C14344a(null);

    /* renamed from: D */
    public static final int f62825D = 8;

    /* renamed from: B */
    public C45773nb6 f62826B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m28432d2 = {"Lco/bird/android/app/feature/settings/tweaks/TweaksActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.settings.tweaks.TweaksActivity$a */
    /* loaded from: classes2.dex */
    public static final class C14344a {
        public /* synthetic */ C14344a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m59346a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, TweaksActivity.class);
        }

        private C14344a() {
        }
    }

    public TweaksActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final C45773nb6 m59347j0() {
        C45773nb6 c45773nb6 = this.f62826B;
        if (c45773nb6 != null) {
            return c45773nb6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C27140p6 m19962c = C27140p6.m19962c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m19962c, "inflate(layoutInflater)");
        setContentView(m19962c.getRoot());
        InterfaceC14348b.InterfaceC14349a m59345a = C14345a.m59345a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m59345a.mo59340a(m21419a, this, m45197b, m19962c).mo59341a(this);
        m59347j0().m23466e();
    }
}
