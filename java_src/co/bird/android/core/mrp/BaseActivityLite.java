package co.bird.android.core.mrp;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.base.BaseCoreActivity;
import co.bird.android.model.constant.MapMode;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import io.reactivex.InterfaceC23496h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001DB\u0007¢\u0006\u0004\bC\u0010*J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0013\u001a\u00020\f8\u0016@\u0016X\u0097.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0016@\u0016X\u0097.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001d\u0010+\u001a\u00020$8\u0006¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\"\u00103\u001a\u00020,8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010B\u001a\u00020<2\u0006\u0010=\u001a\u00020<8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006E"}, m28432d2 = {"Lco/bird/android/core/mrp/BaseActivityLite;", "Lco/bird/android/core/base/BaseCoreActivity;", "Lcom/uber/autodispose/ScopeProvider;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lio/reactivex/h;", "T0", "c", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "w", "()Le13;", "setNavigator", "(Le13;)V", "navigator", "Lgl;", "e", "Lgl;", "J", "()Lgl;", "setPreference", "(Lgl;)V", "preference", "LTq4;", "f", "LTq4;", "y", "()LTq4;", "setReactiveConfig", "(LTq4;)V", "reactiveConfig", "Lsx4;", "g", "Lsx4;", "F", "()Lsx4;", "getDelegate$annotations", "()V", "delegate", "LlG2;", "h", "LlG2;", "H", "()LlG2;", "M", "(LlG2;)V", "mainComponent", "Lco/bird/android/core/mrp/BaseActivityLite$a;", "i", "Lco/bird/android/core/mrp/BaseActivityLite$a;", "E", "()Lco/bird/android/core/mrp/BaseActivityLite$a;", "K", "(Lco/bird/android/core/mrp/BaseActivityLite$a;)V", "baseComponent", "LDQ3;", "<anonymous parameter 0>", "x", "()LDQ3;", "setPermissionManager", "(LDQ3;)V", "permissionManager", "<init>", C17296a.f69688o, "core-basemrp_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBaseActivityLite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseActivityLite.kt\nco/bird/android/core/mrp/BaseActivityLite\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n44#2:82\n1#3:83\n*S KotlinDebug\n*F\n+ 1 BaseActivityLite.kt\nco/bird/android/core/mrp/BaseActivityLite\n*L\n23#1:82\n*E\n"})
/* loaded from: classes2.dex */
public abstract class BaseActivityLite extends BaseCoreActivity implements ScopeProvider {

    /* renamed from: c */
    public final ScopeProvider f63087c;

    /* renamed from: d */
    public InterfaceC40099e13 f63088d;

    /* renamed from: e */
    public C22454gl f63089e;

    /* renamed from: f */
    public C36207Tq4 f63090f;

    /* renamed from: g */
    public final C48955sx4 f63091g;

    /* renamed from: h */
    public InterfaceC44393lG2 f63092h;

    /* renamed from: i */
    public InterfaceC14454a f63093i;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m28432d2 = {"Lco/bird/android/core/mrp/BaseActivityLite$a;", "", "Lco/bird/android/core/mrp/BaseActivityLite;", "activity", "", "b", "LDQ3;", C17296a.f69688o, "()LDQ3;", "permissionManager", "core-basemrp_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.core.mrp.BaseActivityLite$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC14454a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, m28432d2 = {"Lco/bird/android/core/mrp/BaseActivityLite$a$a;", "", "LlG2;", "mainComponent", "Landroid/app/Activity;", "activity", "Lco/bird/android/core/mrp/BaseActivityLite$a;", C17296a.f69688o, "core-basemrp_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.core.mrp.BaseActivityLite$a$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC14455a {
            /* renamed from: a */
            InterfaceC14454a mo58978a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance Activity activity);
        }

        /* renamed from: a */
        DQ3 mo58984a();

        /* renamed from: b */
        void mo58983b(BaseActivityLite baseActivityLite);
    }

    public BaseActivityLite() {
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        this.f63087c = m45197b;
        this.f63091g = new C48955sx4(this);
    }

    public static /* synthetic */ void getDelegate$annotations() {
    }

    /* renamed from: E */
    public final InterfaceC14454a m58991E() {
        InterfaceC14454a interfaceC14454a = this.f63093i;
        if (interfaceC14454a != null) {
            return interfaceC14454a;
        }
        Intrinsics.throwUninitializedPropertyAccessException("baseComponent");
        return null;
    }

    /* renamed from: F */
    public final C48955sx4 m58990F() {
        return this.f63091g;
    }

    /* renamed from: H */
    public final InterfaceC44393lG2 m58989H() {
        InterfaceC44393lG2 interfaceC44393lG2 = this.f63092h;
        if (interfaceC44393lG2 != null) {
            return interfaceC44393lG2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainComponent");
        return null;
    }

    /* renamed from: J */
    public final C22454gl m58988J() {
        C22454gl c22454gl = this.f63089e;
        if (c22454gl != null) {
            return c22454gl;
        }
        Intrinsics.throwUninitializedPropertyAccessException("preference");
        return null;
    }

    /* renamed from: K */
    public final void m58987K(InterfaceC14454a interfaceC14454a) {
        Intrinsics.checkNotNullParameter(interfaceC14454a, "<set-?>");
        this.f63093i = interfaceC14454a;
    }

    /* renamed from: M */
    public final void m58986M(InterfaceC44393lG2 interfaceC44393lG2) {
        Intrinsics.checkNotNullParameter(interfaceC44393lG2, "<set-?>");
        this.f63092h = interfaceC44393lG2;
    }

    @Override // com.uber.autodispose.ScopeProvider
    /* renamed from: T0 */
    public InterfaceC23496h mo231T0() {
        InterfaceC23496h mo231T0 = this.f63087c.mo231T0();
        Intrinsics.checkNotNullExpressionValue(mo231T0, "scope.requestScope()");
        return mo231T0;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        m58986M(c46172oG2.m21419a(application));
        InterfaceC14454a mo58978a = C14456a.m58985a().mo58978a(m58989H(), this);
        mo58978a.mo58983b(this);
        m58987K(mo58978a);
        if (m58988J().m37571t0() == MapMode.RIDER) {
            m59029C(false);
        } else {
            m59030B(false);
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70212v(true);
            supportActionBar.mo70245B(true);
        }
        super.onCreate(bundle);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity
    /* renamed from: w */
    public InterfaceC40099e13 mo58957w() {
        InterfaceC40099e13 interfaceC40099e13 = this.f63088d;
        if (interfaceC40099e13 != null) {
            return interfaceC40099e13;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity
    /* renamed from: x */
    public DQ3 mo58956x() {
        return m58991E().mo58984a();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity
    /* renamed from: y */
    public C36207Tq4 mo58955y() {
        C36207Tq4 c36207Tq4 = this.f63090f;
        if (c36207Tq4 != null) {
            return c36207Tq4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reactiveConfig");
        return null;
    }
}
