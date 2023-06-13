package co.bird.android.feature.commandcenter.commandcenter;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.commandcenter.base.BaseCommandActivity;
import co.bird.android.model.wire.WireBird;
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
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002 !B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\"\u0010\u0019\u001a\u00020\u00028\u0016@\u0016X\u0097.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, m28432d2 = {"Lco/bird/android/feature/commandcenter/commandcenter/LegacyCommandCenterActivity;", "Lco/bird/android/feature/commandcenter/base/BaseCommandActivity;", "Lal6;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "onBackPressed", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "B", "Lal6;", "j0", "()Lal6;", "k0", "(Lal6;)V", "presenter", "Lkn0;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lkn0;", "commandCenterComponent", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLegacyCommandCenterActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyCommandCenterActivity.kt\nco/bird/android/feature/commandcenter/commandcenter/LegacyCommandCenterActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n44#2:127\n1#3:128\n*S KotlinDebug\n*F\n+ 1 LegacyCommandCenterActivity.kt\nco/bird/android/feature/commandcenter/commandcenter/LegacyCommandCenterActivity\n*L\n49#1:127\n*E\n"})
/* loaded from: classes3.dex */
public final class LegacyCommandCenterActivity extends BaseCommandActivity<InterfaceC38147al6> {

    /* renamed from: B */
    public InterfaceC38147al6 f63603B;

    /* renamed from: C */
    public InterfaceC44108kn0 f63604C;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/commandcenter/commandcenter/LegacyCommandCenterActivity$a;", "", "Lco/bird/android/feature/commandcenter/commandcenter/LegacyCommandCenterActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class, InterfaceC44108kn0.class}, modules = {InterfaceC14686b.class})
    /* renamed from: co.bird.android.feature.commandcenter.commandcenter.LegacyCommandCenterActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14684a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J6\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/commandcenter/commandcenter/LegacyCommandCenterActivity$a$a;", "", "LlG2;", "mainComponent", "Lkn0;", "commandCenterComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "LDy1;", "binding", "Lco/bird/android/feature/commandcenter/commandcenter/LegacyCommandCenterActivity$a;", C17296a.f69688o, "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.commandcenter.commandcenter.LegacyCommandCenterActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14685a {
            /* renamed from: a */
            InterfaceC14684a mo58498a(InterfaceC44393lG2 interfaceC44393lG2, InterfaceC44108kn0 interfaceC44108kn0, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C32532Dy1 c32532Dy1);
        }

        /* renamed from: a */
        void mo58497a(LegacyCommandCenterActivity legacyCommandCenterActivity);
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH'J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/feature/commandcenter/commandcenter/LegacyCommandCenterActivity$b;", "", "Lql6;", "impl", "Lpl6;", DateTokenConverter.CONVERTER_KEY, "Lml6;", "Lal6;", "c", "LVk6;", "LTk6;", "e", "LAo0;", "Luo0;", C17296a.f69688o, "Llp0;", "b", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.commandcenter.commandcenter.LegacyCommandCenterActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC14686b {
        @Binds
        /* renamed from: a */
        InterfaceC50047uo0 m58511a(C31739Ao0 c31739Ao0);

        @Binds
        /* renamed from: b */
        InterfaceC44721lp0 m58510b(C47652ql6 c47652ql6);

        @Binds
        /* renamed from: c */
        InterfaceC38147al6 m58509c(C45280ml6 c45280ml6);

        @Binds
        /* renamed from: d */
        InterfaceC47059pl6 m58508d(C47652ql6 c47652ql6);

        @Binds
        /* renamed from: e */
        InterfaceC36155Tk6 m58507e(C36623Vk6 c36623Vk6);
    }

    @Override // co.bird.android.feature.commandcenter.base.BaseCommandActivity
    /* renamed from: j0 */
    public InterfaceC38147al6 getPresenter() {
        InterfaceC38147al6 interfaceC38147al6 = this.f63603B;
        if (interfaceC38147al6 != null) {
            return interfaceC38147al6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: k0 */
    public void setPresenter(InterfaceC38147al6 interfaceC38147al6) {
        Intrinsics.checkNotNullParameter(interfaceC38147al6, "<set-?>");
        this.f63603B = interfaceC38147al6;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 10027) {
            getPresenter().mo25072c();
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        getPresenter().mo25073b();
        super.onBackPressed();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String id;
        super.onCreate(bundle);
        C32532Dy1 m109573c = C32532Dy1.m109573c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m109573c, "inflate(layoutInflater)");
        setContentView(m109573c.getRoot());
        C50037un0 c50037un0 = C50037un0.f112910a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        this.f63604C = c50037un0.m9778a(application);
        InterfaceC14684a.InterfaceC14685a m58499a = C14690b.m58499a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application2 = getApplication();
        Intrinsics.checkNotNullExpressionValue(application2, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application2);
        InterfaceC44108kn0 interfaceC44108kn0 = this.f63604C;
        if (interfaceC44108kn0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commandCenterComponent");
            interfaceC44108kn0 = null;
        }
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m58499a.mo58498a(m21419a, interfaceC44108kn0, this, m45197b, m109573c).mo58497a(this);
        WireBird wireBird = (WireBird) getIntent().getParcelableExtra("bird");
        if (wireBird != null && (id = wireBird.getId()) != null) {
            getPresenter().mo9731u1(id);
        }
    }

    @Override // co.bird.android.feature.commandcenter.base.BaseCommandActivity, co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // co.bird.android.feature.commandcenter.base.BaseCommandActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getPresenter().onResume();
    }
}
