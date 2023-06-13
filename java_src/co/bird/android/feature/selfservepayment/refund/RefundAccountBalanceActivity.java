package co.bird.android.feature.selfservepayment.refund;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/feature/selfservepayment/refund/RefundAccountBalanceActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LFt4;", "B", "LFt4;", "j0", "()LFt4;", "setPresenter", "(LFt4;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRefundAccountBalanceActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RefundAccountBalanceActivity.kt\nco/bird/android/feature/selfservepayment/refund/RefundAccountBalanceActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,72:1\n44#2:73\n*S KotlinDebug\n*F\n+ 1 RefundAccountBalanceActivity.kt\nco/bird/android/feature/selfservepayment/refund/RefundAccountBalanceActivity\n*L\n30#1:73\n*E\n"})
/* loaded from: classes3.dex */
public final class RefundAccountBalanceActivity extends BaseActivity {

    /* renamed from: B */
    public C32958Ft4 f65231B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/selfservepayment/refund/RefundAccountBalanceActivity$a;", "", "Lco/bird/android/feature/selfservepayment/refund/RefundAccountBalanceActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC15547b.class})
    /* renamed from: co.bird.android.feature.selfservepayment.refund.RefundAccountBalanceActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15545a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/selfservepayment/refund/RefundAccountBalanceActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lc5;", "binding", "LDQ3;", "permissionManager", "Lco/bird/android/feature/selfservepayment/refund/RefundAccountBalanceActivity$a;", C17296a.f69688o, "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.selfservepayment.refund.RefundAccountBalanceActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15546a {
            /* renamed from: a */
            InterfaceC15545a mo56947a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C13387c5 c13387c5, @BindsInstance DQ3 dq3);
        }

        /* renamed from: a */
        void mo56946a(RefundAccountBalanceActivity refundAccountBalanceActivity);
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/feature/selfservepayment/refund/RefundAccountBalanceActivity$b;", "", "<init>", "()V", "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.selfservepayment.refund.RefundAccountBalanceActivity$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC15547b {
    }

    public RefundAccountBalanceActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final C32958Ft4 m56949j0() {
        C32958Ft4 c32958Ft4 = this.f65231B;
        if (c32958Ft4 != null) {
            return c32958Ft4;
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
        C13387c5 m61951c = C13387c5.m61951c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m61951c, "inflate(layoutInflater)");
        setContentView(m61951c.getRoot());
        InterfaceC15545a.InterfaceC15546a m56948a = C15548a.m56948a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        m56948a.mo56947a(m21419a, this, m45197b, m61951c, mo58956x()).mo56946a(this);
        m56949j0().m106306m();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m56949j0().m106305n();
    }
}
