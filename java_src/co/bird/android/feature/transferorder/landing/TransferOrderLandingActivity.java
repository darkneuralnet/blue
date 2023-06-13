package co.bird.android.feature.transferorder.landing;

import android.app.Application;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/transferorder/landing/TransferOrderLandingActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "LI86;", "B", "LI86;", "j0", "()LI86;", "setPresenter", "(LI86;)V", "presenter", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransferOrderLandingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferOrderLandingActivity.kt\nco/bird/android/feature/transferorder/landing/TransferOrderLandingActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,60:1\n44#2:61\n*S KotlinDebug\n*F\n+ 1 TransferOrderLandingActivity.kt\nco/bird/android/feature/transferorder/landing/TransferOrderLandingActivity\n*L\n31#1:61\n*E\n"})
/* loaded from: classes3.dex */
public final class TransferOrderLandingActivity extends BaseActivity {

    /* renamed from: B */
    public I86 f65689B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/transferorder/landing/TransferOrderLandingActivity$a;", "", "Lco/bird/android/feature/transferorder/landing/TransferOrderLandingActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.feature.transferorder.landing.TransferOrderLandingActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15795a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/transferorder/landing/TransferOrderLandingActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "LDQ3;", "permissionManager", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Ln6;", "binding", "Lco/bird/android/feature/transferorder/landing/TransferOrderLandingActivity$a;", C17296a.f69688o, "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.transferorder.landing.TransferOrderLandingActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15796a {
            /* renamed from: a */
            InterfaceC15795a mo56550a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance DQ3 dq3, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C26359n6 c26359n6);
        }

        /* renamed from: a */
        void mo56549a(TransferOrderLandingActivity transferOrderLandingActivity);
    }

    public TransferOrderLandingActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final I86 m56552j0() {
        I86 i86 = this.f65689B;
        if (i86 != null) {
            return i86;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C26359n6 m24475c = C26359n6.m24475c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m24475c, "inflate(layoutInflater)");
        setContentView(m24475c.getRoot());
        mo58977D();
        InterfaceC15795a.InterfaceC15796a m56551a = C15797a.m56551a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m56551a.mo56550a(m21419a, this, mo58956x(), m45197b, m24475c).mo56549a(this);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m56552j0().onResume();
    }
}
