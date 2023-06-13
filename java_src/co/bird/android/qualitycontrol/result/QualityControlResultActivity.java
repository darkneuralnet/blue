package co.bird.android.qualitycontrol.result;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/qualitycontrol/result/QualityControlResultActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "onBackPressed", "Lic4;", "B", "Lic4;", "j0", "()Lic4;", "setPresenter", "(Lic4;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nQualityControlResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QualityControlResultActivity.kt\nco/bird/android/qualitycontrol/result/QualityControlResultActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,105:1\n44#2:106\n*S KotlinDebug\n*F\n+ 1 QualityControlResultActivity.kt\nco/bird/android/qualitycontrol/result/QualityControlResultActivity\n*L\n40#1:106\n*E\n"})
/* loaded from: classes4.dex */
public final class QualityControlResultActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC42816ic4 f66922B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/qualitycontrol/result/QualityControlResultActivity$a;", "", "Lco/bird/android/qualitycontrol/result/QualityControlResultActivity;", "activity", "", C17296a.f69688o, "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC16340b.class})
    /* renamed from: co.bird.android.qualitycontrol.result.QualityControlResultActivity$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC16338a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/qualitycontrol/result/QualityControlResultActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "LY4;", "binding", "Lco/bird/android/qualitycontrol/result/QualityControlResultActivity$a;", C17296a.f69688o, "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.qualitycontrol.result.QualityControlResultActivity$a$a */
        /* loaded from: classes4.dex */
        public interface InterfaceC16339a {
            /* renamed from: a */
            InterfaceC16338a mo55001a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C9607Y4 c9607y4);
        }

        /* renamed from: a */
        void mo55000a(QualityControlResultActivity qualityControlResultActivity);
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH'¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/qualitycontrol/result/QualityControlResultActivity$b;", "", "LMc4;", "impl", "LLc4;", C17296a.f69688o, "LCc4;", "Lic4;", "b", "Lec4;", "Lcc4;", "c", "LJc4;", "LGc4;", DateTokenConverter.CONVERTER_KEY, "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.qualitycontrol.result.QualityControlResultActivity$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC16340b {
        @Binds
        /* renamed from: a */
        InterfaceC34209Lc4 m55006a(C34443Mc4 c34443Mc4);

        @Binds
        /* renamed from: b */
        InterfaceC42816ic4 m55005b(C32103Cc4 c32103Cc4);

        @Binds
        /* renamed from: c */
        InterfaceC39241cc4 m55004c(C40444ec4 c40444ec4);

        @Binds
        /* renamed from: d */
        InterfaceC33039Gc4 m55003d(C33741Jc4 c33741Jc4);
    }

    public QualityControlResultActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC42816ic4 m55007j0() {
        InterfaceC42816ic4 interfaceC42816ic4 = this.f66922B;
        if (interfaceC42816ic4 != null) {
            return interfaceC42816ic4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m55007j0().onActivityResult(i, i2, intent);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m55007j0().onBackPressed();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9607Y4 m75784c = C9607Y4.m75784c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m75784c, "inflate(layoutInflater)");
        setContentView(m75784c.getRoot());
        InterfaceC16338a.InterfaceC16339a m55002a = C16341a.m55002a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m55002a.mo55001a(m21419a, this, m45197b, m75784c).mo55000a(this);
        WireBird wireBird = (WireBird) getIntent().getParcelableExtra("bird");
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("quality_control_inspections");
        ArrayList parcelableArrayListExtra2 = getIntent().getParcelableArrayListExtra("quality_control_auto_checks");
        if (wireBird != null && parcelableArrayListExtra != null && parcelableArrayListExtra2 != null) {
            m55007j0().mo33751a(wireBird, parcelableArrayListExtra, parcelableArrayListExtra2);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            m55007j0().onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
