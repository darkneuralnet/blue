package co.bird.android.app.feature.settings.settings;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.SelectServiceCenterActivity;
import co.bird.android.model.Warehouse;
import co.bird.android.widget.cropper.CropImage;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 42\u00020\u0001:\u0003567B\u0007¢\u0006\u0004\b2\u00103J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\"\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100¨\u00068"}, m28432d2 = {"Lco/bird/android/app/feature/settings/settings/SettingsActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "Landroid/content/Intent;", "intent", "onNewIntent", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "", "requestCode", "resultCode", MessageExtension.FIELD_DATA, "onActivityResult", "LZU0;", "B", "LZU0;", "j0", "()LZU0;", "setDebugPresenterFactory", "(LZU0;)V", "debugPresenterFactory", "LWJ4;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LWJ4;", "k0", "()LWJ4;", "setRequirementPresenterImplFactory", "(LWJ4;)V", "requirementPresenterImplFactory", "Lhw5;", "D", "Lhw5;", "m0", "()Lhw5;", "setSettingsPresenter", "(Lhw5;)V", "settingsPresenter", "LSU0;", "E", "LSU0;", "debugPresenter", "<init>", "()V", "F", C17296a.f69688o, "b", "c", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSettingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsActivity.kt\nco/bird/android/app/feature/settings/settings/SettingsActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,162:1\n44#2:163\n*S KotlinDebug\n*F\n+ 1 SettingsActivity.kt\nco/bird/android/app/feature/settings/settings/SettingsActivity\n*L\n52#1:163\n*E\n"})
/* loaded from: classes2.dex */
public final class SettingsActivity extends BaseActivity {

    /* renamed from: F */
    public static final C14311a f62756F = new C14311a(null);

    /* renamed from: G */
    public static final int f62757G = 8;

    /* renamed from: B */
    public ZU0 f62758B;

    /* renamed from: C */
    public WJ4 f62759C;

    /* renamed from: D */
    public InterfaceC42424hw5 f62760D;

    /* renamed from: E */
    public SU0 f62761E;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, m28432d2 = {"Lco/bird/android/app/feature/settings/settings/SettingsActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.settings.settings.SettingsActivity$a */
    /* loaded from: classes2.dex */
    public static final class C14311a {
        public /* synthetic */ C14311a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m59380a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, SettingsActivity.class);
        }

        private C14311a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/app/feature/settings/settings/SettingsActivity$b;", "", "Lco/bird/android/app/feature/settings/settings/SettingsActivity;", "activity", "", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC14314c.class})
    /* renamed from: co.bird.android.app.feature.settings.settings.SettingsActivity$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC14312b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JB\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\fH&¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/app/feature/settings/settings/SettingsActivity$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lc6;", "binding", "LDQ3;", "permissionManager", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lex5;", "ui", "Lco/bird/android/app/feature/settings/settings/SettingsActivity$b;", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.app.feature.settings.settings.SettingsActivity$b$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC14313a {
            /* renamed from: a */
            InterfaceC14312b mo59377a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance C13392c6 c13392c6, @BindsInstance DQ3 dq3, @BindsInstance ScopeProvider scopeProvider, @BindsInstance InterfaceC40655ex5 interfaceC40655ex5);
        }

        /* renamed from: a */
        void mo59376a(SettingsActivity settingsActivity);
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\b"}, m28432d2 = {"Lco/bird/android/app/feature/settings/settings/SettingsActivity$c;", "", "LVw5;", "impl", "Lhw5;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.app.feature.settings.settings.SettingsActivity$c */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC14314c {
        @Binds
        /* renamed from: a */
        public abstract InterfaceC42424hw5 m59379a(C36730Vw5 c36730Vw5);
    }

    public SettingsActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final ZU0 m59383j0() {
        ZU0 zu0 = this.f62758B;
        if (zu0 != null) {
            return zu0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("debugPresenterFactory");
        return null;
    }

    /* renamed from: k0 */
    public final WJ4 m59382k0() {
        WJ4 wj4 = this.f62759C;
        if (wj4 != null) {
            return wj4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("requirementPresenterImplFactory");
        return null;
    }

    /* renamed from: m0 */
    public final InterfaceC42424hw5 m59381m0() {
        InterfaceC42424hw5 interfaceC42424hw5 = this.f62760D;
        if (interfaceC42424hw5 != null) {
            return interfaceC42424hw5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("settingsPresenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Warehouse warehouse;
        super.onActivityResult(i, i2, intent);
        if (i == 203) {
            CropImage.ActivityResult m54219b = CropImage.m54219b(intent);
            if (i2 != -1) {
                if (i2 == 204) {
                    C43107j56.m31138b(getApplicationContext(), String.valueOf(m54219b.m54163c().getMessage()), 1).show();
                    return;
                }
                return;
            }
            Uri uri = m54219b.m54159h();
            InterfaceC42424hw5 m59381m0 = m59381m0();
            Intrinsics.checkNotNullExpressionValue(uri, "uri");
            m59381m0.mo35455b(uri);
        } else if (i == C30906z6.m1823a(Reflection.getOrCreateKotlinClass(SelectServiceCenterActivity.class)) && i2 == -1) {
            if (intent != null) {
                warehouse = (Warehouse) intent.getParcelableExtra("warehouse");
            } else {
                warehouse = null;
            }
            m59381m0().mo35452e(warehouse);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13392c6 m61937c = C13392c6.m61937c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m61937c, "inflate(layoutInflater)");
        setContentView(m61937c.getRoot());
        C43620jx5 c43620jx5 = new C43620jx5(this, m61937c);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        InterfaceC14312b.InterfaceC14313a m59378a = C14315a.m59378a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m59378a.mo59377a(c46172oG2.m21419a(application), this, m61937c, mo58956x(), m45197b, c43620jx5).mo59376a(this);
        TJ4 mo77135a = m59382k0().mo77135a(mo58956x(), this, m45197b, c43620jx5, mo58957w());
        InterfaceC42424hw5 m59381m0 = m59381m0();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        m59381m0.mo35454c(intent, mo77135a);
        C40968fV0 c40968fV0 = new C40968fV0(this, m61937c);
        WU0 mo71315a = m59383j0().mo71315a(m58963Z(), c40968fV0);
        this.f62761E = mo71315a;
        SU0 su0 = null;
        if (mo71315a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("debugPresenter");
            mo71315a = null;
        }
        mo71315a.mo78339a();
        SU0 su02 = this.f62761E;
        if (su02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("debugPresenter");
        } else {
            su0 = su02;
        }
        c40968fV0.m41287Pl(su0);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C36387Uk4.menu_settings, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        m59381m0().mo35456a(intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C36585Vg4.save) {
            m59381m0().mo35453d();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m59381m0().onResume();
    }
}
