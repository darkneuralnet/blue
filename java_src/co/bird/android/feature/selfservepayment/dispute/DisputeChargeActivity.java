package co.bird.android.feature.selfservepayment.dispute;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireRide;
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
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/feature/selfservepayment/dispute/DisputeChargeActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LA51;", "B", "LA51;", "j0", "()LA51;", "setPresenter", "(LA51;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDisputeChargeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisputeChargeActivity.kt\nco/bird/android/feature/selfservepayment/dispute/DisputeChargeActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,79:1\n44#2:80\n*S KotlinDebug\n*F\n+ 1 DisputeChargeActivity.kt\nco/bird/android/feature/selfservepayment/dispute/DisputeChargeActivity\n*L\n32#1:80\n*E\n"})
/* loaded from: classes3.dex */
public final class DisputeChargeActivity extends BaseActivity {

    /* renamed from: B */
    public A51 f65214B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/selfservepayment/dispute/DisputeChargeActivity$a;", "", "Lco/bird/android/feature/selfservepayment/dispute/DisputeChargeActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC15535b.class})
    /* renamed from: co.bird.android.feature.selfservepayment.dispute.DisputeChargeActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15533a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JL\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\fH&¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/feature/selfservepayment/dispute/DisputeChargeActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lx3;", "binding", "Lco/bird/android/model/wire/WireRide;", "ride", "", "title", "description", "Lco/bird/android/feature/selfservepayment/dispute/DisputeChargeActivity$a;", C17296a.f69688o, "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.selfservepayment.dispute.DisputeChargeActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15534a {
            /* renamed from: a */
            InterfaceC15533a mo56957a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C30028x3 c30028x3, @BindsInstance WireRide wireRide, @BindsInstance String str, @BindsInstance String str2);
        }

        /* renamed from: a */
        void mo56961a(DisputeChargeActivity disputeChargeActivity);
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/feature/selfservepayment/dispute/DisputeChargeActivity$b;", "", "<init>", "()V", "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.selfservepayment.dispute.DisputeChargeActivity$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC15535b {
    }

    public DisputeChargeActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final A51 m56963j0() {
        A51 a51 = this.f65214B;
        if (a51 != null) {
            return a51;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m56963j0().m116141g(i, i2, intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C30028x3 m5899c = C30028x3.m5899c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m5899c, "inflate(layoutInflater)");
        setContentView(m5899c.getRoot());
        InterfaceC15533a.InterfaceC15534a m56962a = C15536a.m56962a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Parcelable parcelableExtra = getIntent().getParcelableExtra("ride");
        Intrinsics.checkNotNull(parcelableExtra);
        String stringExtra = getIntent().getStringExtra("title");
        Intrinsics.checkNotNull(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("description");
        Intrinsics.checkNotNull(stringExtra2);
        m56962a.mo56957a(m21419a, this, m45197b, m5899c, (WireRide) parcelableExtra, stringExtra, stringExtra2).mo56961a(this);
        m56963j0().m116140h();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m56963j0().m116139i();
    }
}
