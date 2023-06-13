package co.bird.android.feature.merchant.activity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.guness.widget.NavigationView;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001e2\u00020\u0001:\u0003\u001f !B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\""}, m28432d2 = {"Lco/bird/android/feature/merchant/activity/MerchantHistoryActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onBackPressed", "LaZ2;", "B", "LaZ2;", "j0", "()LaZ2;", "setNavigationDrawerPresenter", "(LaZ2;)V", "navigationDrawerPresenter", "LX66;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LX66;", "k0", "()LX66;", "setTransactionHistoryPresenter", "(LX66;)V", "transactionHistoryPresenter", "Ll4;", "D", "Ll4;", "binding", "<init>", "()V", "E", C17296a.f69688o, "b", "c", "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMerchantHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantHistoryActivity.kt\nco/bird/android/feature/merchant/activity/MerchantHistoryActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,119:1\n44#2:120\n*S KotlinDebug\n*F\n+ 1 MerchantHistoryActivity.kt\nco/bird/android/feature/merchant/activity/MerchantHistoryActivity\n*L\n58#1:120\n*E\n"})
/* loaded from: classes3.dex */
public final class MerchantHistoryActivity extends BaseActivity {

    /* renamed from: E */
    public static final C14949a f64152E = new C14949a(null);

    /* renamed from: B */
    public InterfaceC38024aZ2 f64153B;

    /* renamed from: C */
    public X66 f64154C;

    /* renamed from: D */
    public C25594l4 f64155D;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"Lco/bird/android/feature/merchant/activity/MerchantHistoryActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.merchant.activity.MerchantHistoryActivity$a */
    /* loaded from: classes3.dex */
    public static final class C14949a {
        public /* synthetic */ C14949a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void m57986a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, MerchantHistoryActivity.class);
            intent.setFlags(268468224);
            context.startActivity(intent);
        }

        private C14949a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/merchant/activity/MerchantHistoryActivity$b;", "", "Lco/bird/android/feature/merchant/activity/MerchantHistoryActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC14952c.class})
    /* renamed from: co.bird.android.feature.merchant.activity.MerchantHistoryActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC14950b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\\\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u0011H&¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/feature/merchant/activity/MerchantHistoryActivity$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "lifecycleScope", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Ll4;", "binding", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawer", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lcom/guness/widget/NavigationView;", "navigationView", "Lco/bird/android/feature/merchant/activity/MerchantHistoryActivity$b;", C17296a.f69688o, "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.merchant.activity.MerchantHistoryActivity$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14951a {
            /* renamed from: a */
            InterfaceC14950b mo57968a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C25594l4 c25594l4, @BindsInstance DrawerLayout drawerLayout, @BindsInstance Toolbar toolbar, @BindsInstance NavigationView navigationView);
        }

        /* renamed from: a */
        void mo57967a(MerchantHistoryActivity merchantHistoryActivity);
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH'¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/feature/merchant/activity/MerchantHistoryActivity$c;", "", "LJS2;", "impl", "LGS2;", "b", "LES2;", "LaZ2;", C17296a.f69688o, "Lv76;", "Lt76;", "c", "Ln76;", "LX66;", DateTokenConverter.CONVERTER_KEY, "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.merchant.activity.MerchantHistoryActivity$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC14952c {
        @Binds
        /* renamed from: a */
        InterfaceC38024aZ2 m57985a(ES2 es2);

        @Binds
        /* renamed from: b */
        GS2 m57984b(JS2 js2);

        @Binds
        /* renamed from: c */
        InterfaceC49056t76 m57983c(C50241v76 c50241v76);

        @Binds
        /* renamed from: d */
        X66 m57982d(C45499n76 c45499n76);
    }

    public MerchantHistoryActivity() {
        super(true, null, null, 6, null);
    }

    /* renamed from: j0 */
    public final InterfaceC38024aZ2 m57988j0() {
        InterfaceC38024aZ2 interfaceC38024aZ2 = this.f64153B;
        if (interfaceC38024aZ2 != null) {
            return interfaceC38024aZ2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigationDrawerPresenter");
        return null;
    }

    /* renamed from: k0 */
    public final X66 m57987k0() {
        X66 x66 = this.f64154C;
        if (x66 != null) {
            return x66;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transactionHistoryPresenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C25594l4 c25594l4 = this.f64155D;
        C25594l4 c25594l42 = null;
        if (c25594l4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25594l4 = null;
        }
        if (c25594l4.f95415f.m67611C(8388611)) {
            C25594l4 c25594l43 = this.f64155D;
            if (c25594l43 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c25594l42 = c25594l43;
            }
            c25594l42.f95415f.m67588d(8388611);
            return;
        }
        super.onBackPressed();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        C25594l4 c25594l4;
        setTheme(C32184Cl4.LightAppTheme_NoActionBar);
        super.onCreate(bundle);
        C25594l4 m27976c = C25594l4.m27976c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m27976c, "inflate(layoutInflater)");
        this.f64155D = m27976c;
        C25594l4 c25594l42 = null;
        if (m27976c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m27976c = null;
        }
        setContentView(m27976c.getRoot());
        C25594l4 c25594l43 = this.f64155D;
        if (c25594l43 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25594l43 = null;
        }
        setSupportActionBar(c25594l43.f95420k);
        InterfaceC14950b.InterfaceC14951a m57969a = C14961a.m57969a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        C25594l4 c25594l44 = this.f64155D;
        if (c25594l44 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25594l4 = null;
        } else {
            c25594l4 = c25594l44;
        }
        C25594l4 c25594l45 = this.f64155D;
        if (c25594l45 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25594l45 = null;
        }
        DrawerLayout drawerLayout = c25594l45.f95415f;
        Intrinsics.checkNotNullExpressionValue(drawerLayout, "binding.drawer");
        C25594l4 c25594l46 = this.f64155D;
        if (c25594l46 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25594l46 = null;
        }
        Toolbar toolbar = c25594l46.f95420k;
        Intrinsics.checkNotNullExpressionValue(toolbar, "binding.toolbar");
        C25594l4 c25594l47 = this.f64155D;
        if (c25594l47 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c25594l42 = c25594l47;
        }
        NavigationView navigationView = c25594l42.f95418i;
        Intrinsics.checkNotNullExpressionValue(navigationView, "binding.navigationView");
        m57969a.mo57968a(m21419a, this, m58963Z, m45197b, c25594l4, drawerLayout, toolbar, navigationView).mo57967a(this);
        m57988j0().mo71220a();
        m57987k0().mo24309a();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m57987k0().onResume();
    }
}
