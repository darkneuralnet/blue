package co.bird.android.feature.commandcenter.landing;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import co.bird.android.vehiclescanner.views.CodeScanningView;
import co.bird.android.widget.BlockingEnterLocationView;
import co.bird.android.widget.OperatorInfoCard;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\"\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/feature/commandcenter/landing/CommandCenterLandingActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onPause", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Lxn0;", "B", "Lxn0;", "j0", "()Lxn0;", "setPresenter", "(Lxn0;)V", "presenter", "Lkn0;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lkn0;", "commandCenterComponent", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCommandCenterLandingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandCenterLandingActivity.kt\nco/bird/android/feature/commandcenter/landing/CommandCenterLandingActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,111:1\n44#2:112\n*S KotlinDebug\n*F\n+ 1 CommandCenterLandingActivity.kt\nco/bird/android/feature/commandcenter/landing/CommandCenterLandingActivity\n*L\n43#1:112\n*E\n"})
/* loaded from: classes3.dex */
public final class CommandCenterLandingActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC51815xn0 f63656B;

    /* renamed from: C */
    public InterfaceC44108kn0 f63657C;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/commandcenter/landing/CommandCenterLandingActivity$a;", "", "Lco/bird/android/feature/commandcenter/landing/CommandCenterLandingActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class, InterfaceC44108kn0.class}, modules = {AbstractC14709b.class})
    /* renamed from: co.bird.android.feature.commandcenter.landing.CommandCenterLandingActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14707a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J^\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0013\u001a\u00020\u0012H&¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/feature/commandcenter/landing/CommandCenterLandingActivity$a$a;", "", "LlG2;", "mainComponent", "Lkn0;", "commandCenterComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lco/bird/android/widget/OperatorInfoCard;", "operatorInfoCard", "Lco/bird/android/widget/BlockingEnterLocationView;", "blockingOverlay", "Landroid/widget/Button;", "settings", "Lco/bird/android/vehiclescanner/views/CodeScanningView;", "scanner", "Landroid/widget/EditText;", "peripheralEditText", "Lco/bird/android/feature/commandcenter/landing/CommandCenterLandingActivity$a;", C17296a.f69688o, "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.commandcenter.landing.CommandCenterLandingActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14708a {
            /* renamed from: a */
            InterfaceC14707a mo58471a(InterfaceC44393lG2 interfaceC44393lG2, InterfaceC44108kn0 interfaceC44108kn0, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance OperatorInfoCard operatorInfoCard, @BindsInstance BlockingEnterLocationView blockingEnterLocationView, @BindsInstance Button button, @BindsInstance CodeScanningView codeScanningView, @BindsInstance EditText editText);
        }

        /* renamed from: a */
        void mo58476a(CommandCenterLandingActivity commandCenterLandingActivity);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/feature/commandcenter/landing/CommandCenterLandingActivity$b;", "", "LSn0;", "impl", "LQn0;", "b", "LOn0;", "Lxn0;", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.commandcenter.landing.CommandCenterLandingActivity$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC14709b {
        @Binds
        /* renamed from: a */
        public abstract InterfaceC51815xn0 m58479a(C35006On0 c35006On0);

        @Binds
        /* renamed from: b */
        public abstract InterfaceC35474Qn0 m58478b(C35942Sn0 c35942Sn0);
    }

    public CommandCenterLandingActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC51815xn0 m58480j0() {
        InterfaceC51815xn0 interfaceC51815xn0 = this.f63656B;
        if (interfaceC51815xn0 != null) {
            return interfaceC51815xn0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        WireBird wireBird;
        super.onActivityResult(i, i2, intent);
        if ((i == 10000 || i == 10001 || i == 10003) && i2 == -1) {
            if (intent != null) {
                wireBird = (WireBird) intent.getParcelableExtra("bird");
            } else {
                wireBird = null;
            }
            if (wireBird != null) {
                m58480j0().mo4713c(wireBird);
            }
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C36369Ui4.activity_command_center_landing);
        BlockingEnterLocationView blockingOverlay = (BlockingEnterLocationView) findViewById(C42273hh4.blockEnterLocationOverlay);
        C50037un0 c50037un0 = C50037un0.f112910a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        this.f63657C = c50037un0.m9778a(application);
        InterfaceC14707a.InterfaceC14708a m58477a = C14710a.m58477a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application2 = getApplication();
        Intrinsics.checkNotNullExpressionValue(application2, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application2);
        InterfaceC44108kn0 interfaceC44108kn0 = this.f63657C;
        if (interfaceC44108kn0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commandCenterComponent");
            interfaceC44108kn0 = null;
        }
        InterfaceC44108kn0 interfaceC44108kn02 = interfaceC44108kn0;
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        View findViewById = findViewById(C42273hh4.operatorInfoCard);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.operatorInfoCard)");
        OperatorInfoCard operatorInfoCard = (OperatorInfoCard) findViewById;
        Intrinsics.checkNotNullExpressionValue(blockingOverlay, "blockingOverlay");
        Button m54752a = blockingOverlay.m54752a();
        View findViewById2 = findViewById(C42273hh4.scannerView);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.scannerView)");
        CodeScanningView codeScanningView = (CodeScanningView) findViewById2;
        View findViewById3 = findViewById(C42273hh4.peripheralEditText);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.peripheralEditText)");
        m58477a.mo58471a(m21419a, interfaceC44108kn02, this, m45197b, operatorInfoCard, blockingOverlay, m54752a, codeScanningView, (EditText) findViewById3).mo58476a(this);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        m58480j0().onPause();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m58480j0().onResume();
    }
}
