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
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001e\u001f B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006!"}, m28432d2 = {"Lco/bird/android/feature/merchant/activity/MerchantLocationActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "LaZ2;", "B", "LaZ2;", "k0", "()LaZ2;", "setNavigationDrawerPresenter", "(LaZ2;)V", "navigationDrawerPresenter", "LyR2;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LyR2;", "j0", "()LyR2;", "setLocationPresenter", "(LyR2;)V", "locationPresenter", "Lm4;", "D", "Lm4;", "binding", "<init>", "()V", "E", C17296a.f69688o, "b", "c", "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMerchantLocationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantLocationActivity.kt\nco/bird/android/feature/merchant/activity/MerchantLocationActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,112:1\n44#2:113\n*S KotlinDebug\n*F\n+ 1 MerchantLocationActivity.kt\nco/bird/android/feature/merchant/activity/MerchantLocationActivity\n*L\n57#1:113\n*E\n"})
/* loaded from: classes3.dex */
public final class MerchantLocationActivity extends BaseActivity {

    /* renamed from: E */
    public static final C14957a f64158E = new C14957a(null);

    /* renamed from: B */
    public InterfaceC38024aZ2 f64159B;

    /* renamed from: C */
    public InterfaceC52199yR2 f64160C;

    /* renamed from: D */
    public C25902m4 f64161D;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"Lco/bird/android/feature/merchant/activity/MerchantLocationActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.merchant.activity.MerchantLocationActivity$a */
    /* loaded from: classes3.dex */
    public static final class C14957a {
        public /* synthetic */ C14957a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void m57974a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, MerchantLocationActivity.class);
            intent.setFlags(268468224);
            context.startActivity(intent);
        }

        private C14957a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/merchant/activity/MerchantLocationActivity$b;", "", "Lco/bird/android/feature/merchant/activity/MerchantLocationActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC14960c.class})
    /* renamed from: co.bird.android.feature.merchant.activity.MerchantLocationActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC14958b {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\\\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0012\u001a\u00020\u0011H&¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/feature/merchant/activity/MerchantLocationActivity$b$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "lifecycleScope", "Lm4;", "binding", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawer", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lcom/guness/widget/NavigationView;", "navigationView", "Lco/bird/android/feature/merchant/activity/MerchantLocationActivity$b;", C17296a.f69688o, "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.merchant.activity.MerchantLocationActivity$b$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC14959a {
            /* renamed from: a */
            InterfaceC14958b mo57945a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, @BindsInstance C25902m4 c25902m4, @BindsInstance DrawerLayout drawerLayout, @BindsInstance Toolbar toolbar, @BindsInstance NavigationView navigationView);
        }

        /* renamed from: a */
        void mo57944a(MerchantLocationActivity merchantLocationActivity);
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H'J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH'J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH'¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/feature/merchant/activity/MerchantLocationActivity$c;", "", "LJS2;", "impl", "LGS2;", "b", "LES2;", "LaZ2;", C17296a.f69688o, "LYR2;", "LXR2;", DateTokenConverter.CONVERTER_KEY, "LTR2;", "LyR2;", "c", "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.merchant.activity.MerchantLocationActivity$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC14960c {
        @Binds
        /* renamed from: a */
        InterfaceC38024aZ2 m57973a(ES2 es2);

        @Binds
        /* renamed from: b */
        GS2 m57972b(JS2 js2);

        @Binds
        /* renamed from: c */
        InterfaceC52199yR2 m57971c(TR2 tr2);

        @Binds
        /* renamed from: d */
        XR2 m57970d(YR2 yr2);
    }

    public MerchantLocationActivity() {
        super(true, null, null, 6, null);
    }

    /* renamed from: j0 */
    public final InterfaceC52199yR2 m57976j0() {
        InterfaceC52199yR2 interfaceC52199yR2 = this.f64160C;
        if (interfaceC52199yR2 != null) {
            return interfaceC52199yR2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("locationPresenter");
        return null;
    }

    /* renamed from: k0 */
    public final InterfaceC38024aZ2 m57975k0() {
        InterfaceC38024aZ2 interfaceC38024aZ2 = this.f64159B;
        if (interfaceC38024aZ2 != null) {
            return interfaceC38024aZ2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigationDrawerPresenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        C25902m4 c25902m4 = this.f64161D;
        C25902m4 c25902m42 = null;
        if (c25902m4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25902m4 = null;
        }
        if (c25902m4.f97261d.m67611C(8388611)) {
            C25902m4 c25902m43 = this.f64161D;
            if (c25902m43 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c25902m42 = c25902m43;
            }
            c25902m42.f97261d.m67588d(8388611);
            return;
        }
        super.onBackPressed();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        C25902m4 c25902m4;
        super.onCreate(bundle);
        C25902m4 m26398c = C25902m4.m26398c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m26398c, "inflate(layoutInflater)");
        this.f64161D = m26398c;
        C25902m4 c25902m42 = null;
        if (m26398c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m26398c = null;
        }
        setContentView(m26398c.getRoot());
        C25902m4 c25902m43 = this.f64161D;
        if (c25902m43 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25902m43 = null;
        }
        setSupportActionBar(c25902m43.f97266i);
        InterfaceC14958b.InterfaceC14959a m57946a = C14976c.m57946a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        C25902m4 c25902m44 = this.f64161D;
        if (c25902m44 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25902m4 = null;
        } else {
            c25902m4 = c25902m44;
        }
        C25902m4 c25902m45 = this.f64161D;
        if (c25902m45 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25902m45 = null;
        }
        DrawerLayout drawer = c25902m45.f97261d;
        C25902m4 c25902m46 = this.f64161D;
        if (c25902m46 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c25902m46 = null;
        }
        Toolbar toolbar = c25902m46.f97266i;
        C25902m4 c25902m47 = this.f64161D;
        if (c25902m47 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c25902m42 = c25902m47;
        }
        NavigationView navigationView = c25902m42.f97265h;
        Intrinsics.checkNotNullExpressionValue(drawer, "drawer");
        Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
        Intrinsics.checkNotNullExpressionValue(navigationView, "navigationView");
        m57946a.mo57945a(m21419a, this, m45197b, m58963Z, c25902m4, drawer, toolbar, navigationView).mo57944a(this);
        m57975k0().mo71220a();
        m57976j0().mo3500a();
    }
}
