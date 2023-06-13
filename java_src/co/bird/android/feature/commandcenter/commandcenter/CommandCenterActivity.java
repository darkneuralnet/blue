package co.bird.android.feature.commandcenter.commandcenter;

import android.app.Application;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import androidx.viewpager2.widget.ViewPager2;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.commandcenter.routing.C14717b;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.google.android.material.tabs.TabLayout;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002%&B\u0007¢\u0006\u0004\b#\u0010$J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\"\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, m28432d2 = {"Lco/bird/android/feature/commandcenter/commandcenter/CommandCenterActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Lut4;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "onBackPressed", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "refresh", "LVn0;", "B", "LVn0;", "j0", "()LVn0;", "setPresenter", "(LVn0;)V", "presenter", "Lkn0;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lkn0;", "commandCenterComponent", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCommandCenterActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandCenterActivity.kt\nco/bird/android/feature/commandcenter/commandcenter/CommandCenterActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,169:1\n44#2:170\n1#3:171\n1855#4,2:172\n288#4,2:174\n1855#4,2:180\n9#5,4:176\n*S KotlinDebug\n*F\n+ 1 CommandCenterActivity.kt\nco/bird/android/feature/commandcenter/commandcenter/CommandCenterActivity\n*L\n55#1:170\n80#1:172,2\n99#1:174,2\n122#1:180,2\n100#1:176,4\n*E\n"})
/* loaded from: classes3.dex */
public final class CommandCenterActivity extends BaseActivity implements InterfaceC50101ut4 {

    /* renamed from: B */
    public InterfaceC36644Vn0 f63600B;

    /* renamed from: C */
    public InterfaceC44108kn0 f63601C;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/commandcenter/commandcenter/CommandCenterActivity$a;", "", "Lco/bird/android/feature/commandcenter/commandcenter/CommandCenterActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class, InterfaceC44108kn0.class}, modules = {AbstractC14682b.class})
    /* renamed from: co.bird.android.feature.commandcenter.commandcenter.CommandCenterActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14680a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0086\u0001\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000e2\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u001a\u001a\u00020\u0019H&¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/feature/commandcenter/commandcenter/CommandCenterActivity$a$a;", "", "LlG2;", "mainComponent", "Lkn0;", "commandCenterComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lcom/google/android/material/tabs/TabLayout;", "tabs", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Landroid/widget/Button;", "nextStep", "reroute", "Landroid/widget/LinearLayout;", "chargeContainer", "Landroid/widget/TextView;", "charge", "Landroid/widget/ImageView;", "chargeIcon", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/lifecycle/f;", "lifecycle", "Lco/bird/android/feature/commandcenter/commandcenter/CommandCenterActivity$a;", C17296a.f69688o, "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.commandcenter.commandcenter.CommandCenterActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14681a {
            /* renamed from: a */
            InterfaceC14680a mo58500a(InterfaceC44393lG2 interfaceC44393lG2, InterfaceC44108kn0 interfaceC44108kn0, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance TabLayout tabLayout, @BindsInstance ViewPager2 viewPager2, @BindsInstance Button button, @BindsInstance Button button2, @BindsInstance LinearLayout linearLayout, @BindsInstance TextView textView, @BindsInstance ImageView imageView, @BindsInstance FragmentManager fragmentManager, @BindsInstance AbstractC11719f abstractC11719f);
        }

        /* renamed from: a */
        void mo58505a(CommandCenterActivity commandCenterActivity);
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/feature/commandcenter/commandcenter/CommandCenterActivity$b;", "", "Lso0;", "impl", "Lpo0;", "b", "Lmo0;", "LVn0;", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.commandcenter.commandcenter.CommandCenterActivity$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC14682b {

        /* renamed from: a */
        public static final C14683a f63602a = new C14683a(null);

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lco/bird/android/feature/commandcenter/commandcenter/CommandCenterActivity$b$a;", "", "", "NEXT_STEP", "Ljava/lang/String;", "REROUTE", "<init>", "()V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.commandcenter.commandcenter.CommandCenterActivity$b$a */
        /* loaded from: classes3.dex */
        public static final class C14683a {
            public /* synthetic */ C14683a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C14683a() {
            }
        }

        @Binds
        /* renamed from: a */
        public abstract InterfaceC36644Vn0 m58515a(C45304mo0 c45304mo0);

        @Binds
        /* renamed from: b */
        public abstract InterfaceC47083po0 m58514b(C48861so0 c48861so0);
    }

    public CommandCenterActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC36644Vn0 m58516j0() {
        InterfaceC36644Vn0 interfaceC36644Vn0 = this.f63600B;
        if (interfaceC36644Vn0 != null) {
            return interfaceC36644Vn0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        List<Fragment> m67283z0 = getSupportFragmentManager().m67283z0();
        Intrinsics.checkNotNullExpressionValue(m67283z0, "supportFragmentManager.fragments");
        for (Fragment fragment : m67283z0) {
            fragment.onActivityResult(i, i2, intent);
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Unit unit;
        Object obj;
        m58516j0().mo24976b();
        List<Fragment> m67283z0 = getSupportFragmentManager().m67283z0();
        Intrinsics.checkNotNullExpressionValue(m67283z0, "supportFragmentManager.fragments");
        Iterator<T> it = m67283z0.iterator();
        while (true) {
            unit = null;
            if (it.hasNext()) {
                obj = it.next();
                if (((Fragment) obj) instanceof C14717b) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Fragment fragment = (Fragment) obj;
        if (fragment != null) {
            if (!(fragment instanceof C14717b)) {
                fragment = null;
            }
            C14717b c14717b = (C14717b) fragment;
            if (c14717b != null) {
                c14717b.m58465N6();
                unit = Unit.INSTANCE;
            }
        }
        if (unit == null) {
            super.onBackPressed();
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C36369Ui4.activity_command_center);
        C50037un0 c50037un0 = C50037un0.f112910a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        this.f63601C = c50037un0.m9778a(application);
        InterfaceC14680a.InterfaceC14681a m58506a = C14687a.m58506a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application2 = getApplication();
        Intrinsics.checkNotNullExpressionValue(application2, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application2);
        InterfaceC44108kn0 interfaceC44108kn0 = this.f63601C;
        WireBird wireBird = null;
        if (interfaceC44108kn0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commandCenterComponent");
            interfaceC44108kn0 = null;
        }
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        View findViewById = findViewById(C42273hh4.tabs);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.tabs)");
        TabLayout tabLayout = (TabLayout) findViewById;
        View findViewById2 = findViewById(C42273hh4.viewPager);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.viewPager)");
        ViewPager2 viewPager2 = (ViewPager2) findViewById2;
        View findViewById3 = findViewById(C42273hh4.nextStep);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.nextStep)");
        Button button = (Button) findViewById3;
        View findViewById4 = findViewById(C42273hh4.reroute);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(R.id.reroute)");
        Button button2 = (Button) findViewById4;
        View findViewById5 = findViewById(C42273hh4.chargeContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(R.id.chargeContainer)");
        LinearLayout linearLayout = (LinearLayout) findViewById5;
        View findViewById6 = findViewById(C42273hh4.charge);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(R.id.charge)");
        TextView textView = (TextView) findViewById6;
        View findViewById7 = findViewById(C42273hh4.chargeIcon);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(R.id.chargeIcon)");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        AbstractC11719f lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "lifecycle");
        m58506a.mo58500a(m21419a, interfaceC44108kn0, this, m45197b, tabLayout, viewPager2, button, button2, linearLayout, textView, (ImageView) findViewById7, supportFragmentManager, lifecycle).mo58505a(this);
        WireBird wireBird2 = (WireBird) getIntent().getParcelableExtra("bird");
        if (wireBird2 != null) {
            m58516j0().mo24977a(wireBird2);
            wireBird = wireBird2;
        }
        if (wireBird != null) {
            return;
        }
        throw new IllegalArgumentException("Cannot start CommandCenter without a Bird reference".toString());
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C34515Mk4.menu_command_center, menu);
        MenuItem findItem = menu.findItem(C42273hh4.refresh);
        Drawable icon = findItem.getIcon();
        if (icon != null && (drawable = P61.m90834r(icon)) != null) {
            drawable.setTint(-1);
        } else {
            drawable = null;
        }
        findItem.setIcon(drawable);
        return true;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int itemId = item.getItemId();
        if (itemId == 16908332) {
            onBackPressed();
            return true;
        } else if (itemId == C42273hh4.refresh) {
            refresh();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        refresh();
    }

    @Override // p000.InterfaceC50101ut4
    public void refresh() {
        List<InterfaceC50101ut4> filterIsInstance;
        m58516j0().refresh();
        List<Fragment> m67283z0 = getSupportFragmentManager().m67283z0();
        Intrinsics.checkNotNullExpressionValue(m67283z0, "supportFragmentManager.fragments");
        filterIsInstance = CollectionsKt___CollectionsJvmKt.filterIsInstance(m67283z0, InterfaceC50101ut4.class);
        for (InterfaceC50101ut4 interfaceC50101ut4 : filterIsInstance) {
            interfaceC50101ut4.refresh();
        }
    }
}
