package co.bird.android.feature.servicecenter.repairlogger.repairlist;

import android.app.Application;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.servicecenter.repairlogger.addrepair.RepairLoggerAddActivity;
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
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006 "}, m28432d2 = {"Lco/bird/android/feature/servicecenter/repairlogger/repairlist/RepairLoggerListActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "onBackPressed", "LjB4;", "B", "LjB4;", "j0", "()LjB4;", "setPresenter", "(LjB4;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairLoggerListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairLoggerListActivity.kt\nco/bird/android/feature/servicecenter/repairlogger/repairlist/RepairLoggerListActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n44#2:132\n1#3:133\n*S KotlinDebug\n*F\n+ 1 RepairLoggerListActivity.kt\nco/bird/android/feature/servicecenter/repairlogger/repairlist/RepairLoggerListActivity\n*L\n46#1:132\n*E\n"})
/* loaded from: classes3.dex */
public final class RepairLoggerListActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC43164jB4 f65455B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/repairlogger/repairlist/RepairLoggerListActivity$a;", "", "Lco/bird/android/feature/servicecenter/repairlogger/repairlist/RepairLoggerListActivity;", "activity", "", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15672b.class})
    /* renamed from: co.bird.android.feature.servicecenter.repairlogger.repairlist.RepairLoggerListActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15670a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH&¨\u0006\f"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/repairlogger/repairlist/RepairLoggerListActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Lf5;", "binding", "Lco/bird/android/feature/servicecenter/repairlogger/repairlist/RepairLoggerListActivity$a;", C17296a.f69688o, "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.servicecenter.repairlogger.repairlist.RepairLoggerListActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15671a {
            /* renamed from: a */
            InterfaceC15670a mo56761a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C20206f5 c20206f5);
        }

        /* renamed from: a */
        void mo56760a(RepairLoggerListActivity repairLoggerListActivity);
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH'¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/feature/servicecenter/repairlogger/repairlist/RepairLoggerListActivity$b;", "", "LAB4;", "impl", "LzB4;", DateTokenConverter.CONVERTER_KEY, "LwB4;", "LjB4;", C17296a.f69688o, "LHA4;", "LFA4;", "c", "LuD4;", "LrD4;", "b", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.servicecenter.repairlogger.repairlist.RepairLoggerListActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15672b {
        @Binds
        /* renamed from: a */
        InterfaceC43164jB4 m56766a(C50871wB4 c50871wB4);

        @Binds
        /* renamed from: b */
        InterfaceC47926rD4 m56765b(C49704uD4 c49704uD4);

        @Binds
        /* renamed from: c */
        FA4 m56764c(HA4 ha4);

        @Binds
        /* renamed from: d */
        InterfaceC52650zB4 m56763d(AB4 ab4);
    }

    public RepairLoggerListActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC43164jB4 m56767j0() {
        InterfaceC43164jB4 interfaceC43164jB4 = this.f65455B;
        if (interfaceC43164jB4 != null) {
            return interfaceC43164jB4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList arrayList;
        super.onActivityResult(i, i2, intent);
        if (i == C30906z6.m1823a(Reflection.getOrCreateKotlinClass(RepairLoggerAddActivity.class)) && i2 == -1) {
            if (intent != null) {
                arrayList = intent.getParcelableArrayListExtra("repair_options");
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                m56767j0().mo7303c(arrayList);
            }
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m56767j0().onBackPressed();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C20206f5 m42121c = C20206f5.m42121c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m42121c, "inflate(layoutInflater)");
        setContentView(m42121c.getRoot());
        InterfaceC15670a.InterfaceC15671a m56762a = C15673a.m56762a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m56762a.mo56761a(m21419a, this, m45197b, m42121c).mo56760a(this);
        mo58977D();
        InterfaceC43164jB4 m56767j0 = m56767j0();
        Parcelable parcelableExtra = getIntent().getParcelableExtra("bird");
        Intrinsics.checkNotNull(parcelableExtra);
        m56767j0.mo7305a((WireBird) parcelableExtra);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C35919Sk4.menu_repair_logger, menu);
        MenuItem findItem = menu.findItem(C38115ai4.submit);
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            drawable = P61.m90834r(icon);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            P61.m90838n(drawable, NA0.m94301c(this, C32364Df4.white));
        }
        findItem.setIcon(drawable);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == 16908332) {
            m56767j0().onBackPressed();
            return true;
        } else if (itemId == C38115ai4.submit) {
            m56767j0().mo7304b();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
