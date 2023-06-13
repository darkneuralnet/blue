package co.bird.android.feature.selfservepayment.receipt;

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
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/feature/selfservepayment/receipt/TransactionReceiptActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LX76;", "B", "LX76;", "j0", "()LX76;", "setPresenter", "(LX76;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionReceiptActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionReceiptActivity.kt\nco/bird/android/feature/selfservepayment/receipt/TransactionReceiptActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,76:1\n44#2:77\n*S KotlinDebug\n*F\n+ 1 TransactionReceiptActivity.kt\nco/bird/android/feature/selfservepayment/receipt/TransactionReceiptActivity\n*L\n31#1:77\n*E\n"})
/* loaded from: classes3.dex */
public final class TransactionReceiptActivity extends BaseActivity {

    /* renamed from: B */
    public X76 f65223B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/selfservepayment/receipt/TransactionReceiptActivity$a;", "", "Lco/bird/android/feature/selfservepayment/receipt/TransactionReceiptActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {AbstractC15541b.class})
    /* renamed from: co.bird.android.feature.selfservepayment.receipt.TransactionReceiptActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15539a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JD\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\nH&¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/feature/selfservepayment/receipt/TransactionReceiptActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lm6;", "binding", "", "receiptId", "title", "Lco/bird/android/feature/selfservepayment/receipt/TransactionReceiptActivity$a;", C17296a.f69688o, "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.selfservepayment.receipt.TransactionReceiptActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15540a {
            /* renamed from: a */
            InterfaceC15539a mo56954a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C25914m6 c25914m6, @BindsInstance String str, @BindsInstance String str2);
        }

        /* renamed from: a */
        void mo56953a(TransactionReceiptActivity transactionReceiptActivity);
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/feature/selfservepayment/receipt/TransactionReceiptActivity$b;", "", "<init>", "()V", "co.bird.android.feature.self-serve-payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.selfservepayment.receipt.TransactionReceiptActivity$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC15541b {
    }

    public TransactionReceiptActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final X76 m56956j0() {
        X76 x76 = this.f65223B;
        if (x76 != null) {
            return x76;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m56956j0().m77344r(i, i2, intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C25914m6 m26348c = C25914m6.m26348c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m26348c, "inflate(layoutInflater)");
        setContentView(m26348c.getRoot());
        InterfaceC15539a.InterfaceC15540a m56955a = C15542a.m56955a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        String stringExtra = getIntent().getStringExtra("co.bird.android.id");
        Intrinsics.checkNotNull(stringExtra);
        m56955a.mo56954a(m21419a, this, m45197b, m26348c, stringExtra, getIntent().getStringExtra("title")).mo56953a(this);
        m56956j0().m77343s();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m56956j0().m77342t();
    }
}
