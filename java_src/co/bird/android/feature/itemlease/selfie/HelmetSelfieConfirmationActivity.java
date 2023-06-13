package co.bird.android.feature.itemlease.selfie;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\"\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/feature/itemlease/selfie/HelmetSelfieConfirmationActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onPause", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LsL1;", "B", "LsL1;", "j0", "()LsL1;", "setPresenter", "(LsL1;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHelmetSelfieConfirmationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetSelfieConfirmationActivity.kt\nco/bird/android/feature/itemlease/selfie/HelmetSelfieConfirmationActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,84:1\n44#2:85\n*S KotlinDebug\n*F\n+ 1 HelmetSelfieConfirmationActivity.kt\nco/bird/android/feature/itemlease/selfie/HelmetSelfieConfirmationActivity\n*L\n33#1:85\n*E\n"})
/* loaded from: classes3.dex */
public final class HelmetSelfieConfirmationActivity extends BaseActivity {

    /* renamed from: B */
    public C48587sL1 f64124B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/itemlease/selfie/HelmetSelfieConfirmationActivity$a;", "", "Lco/bird/android/feature/itemlease/selfie/HelmetSelfieConfirmationActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC14927b.class})
    /* renamed from: co.bird.android.feature.itemlease.selfie.HelmetSelfieConfirmationActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14925a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/itemlease/selfie/HelmetSelfieConfirmationActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LO3;", "binding", "LDQ3;", "permissionManager", "Lco/bird/android/feature/itemlease/selfie/HelmetSelfieConfirmationActivity$a;", C17296a.f69688o, "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.itemlease.selfie.HelmetSelfieConfirmationActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14926a {
            /* renamed from: a */
            InterfaceC14925a mo58016a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C5818O3 c5818o3, @BindsInstance DQ3 dq3);
        }

        /* renamed from: a */
        void mo58015a(HelmetSelfieConfirmationActivity helmetSelfieConfirmationActivity);
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/feature/itemlease/selfie/HelmetSelfieConfirmationActivity$b;", "", "<init>", "()V", "co.bird.android.feature.item-lease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.itemlease.selfie.HelmetSelfieConfirmationActivity$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC14927b {
    }

    public HelmetSelfieConfirmationActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final C48587sL1 m58018j0() {
        C48587sL1 c48587sL1 = this.f64124B;
        if (c48587sL1 != null) {
            return c48587sL1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5818O3 m92966c = C5818O3.m92966c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m92966c, "inflate(layoutInflater)");
        setContentView(m92966c.getRoot());
        InterfaceC14925a.InterfaceC14926a m58017a = C14928a.m58017a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m58017a.mo58016a(m21419a, this, m45197b, m92966c, mo58956x()).mo58015a(this);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("bird");
        Intrinsics.checkNotNull(parcelableExtra);
        String stringExtra = getIntent().getStringExtra(AnalyticsFields.SESSION_ID);
        Intrinsics.checkNotNull(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("ride_id");
        boolean booleanExtra = getIntent().getBooleanExtra("is_post_ride", false);
        m58018j0().m14369M((WireBird) parcelableExtra, stringExtra, stringExtra2, booleanExtra);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        m58018j0().m14368N();
        super.onPause();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m58018j0().m14367O();
    }
}
