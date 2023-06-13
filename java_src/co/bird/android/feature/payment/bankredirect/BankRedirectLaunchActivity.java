package co.bird.android.feature.payment.bankredirect;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.PaymentMethod;
import co.bird.android.model.exception.MissingKeyException;
import co.bird.android.model.exception.PaymentMethodNotSet;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsFields;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/feature/payment/bankredirect/BankRedirectLaunchActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lmx;", "B", "Lmx;", "j0", "()Lmx;", "setPresenter", "(Lmx;)V", "presenter", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBankRedirectLaunchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BankRedirectLaunchActivity.kt\nco/bird/android/feature/payment/bankredirect/BankRedirectLaunchActivity\n+ 2 Intent+.kt\nco/bird/android/library/extension/Intent_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,79:1\n6#2:80\n1#3:81\n13#4,2:82\n15#4,2:86\n1109#5,2:84\n44#6:88\n*S KotlinDebug\n*F\n+ 1 BankRedirectLaunchActivity.kt\nco/bird/android/feature/payment/bankredirect/BankRedirectLaunchActivity\n*L\n31#1:80\n31#1:81\n31#1:82,2\n31#1:86,2\n31#1:84,2\n41#1:88\n*E\n"})
/* loaded from: classes3.dex */
public final class BankRedirectLaunchActivity extends BaseActivity {

    /* renamed from: B */
    public C26297mx f64401B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/payment/bankredirect/BankRedirectLaunchActivity$a;", "", "Lco/bird/android/feature/payment/bankredirect/BankRedirectLaunchActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: co.bird.android.feature.payment.bankredirect.BankRedirectLaunchActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15088a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JX\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/payment/bankredirect/BankRedirectLaunchActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lh4;", "binding", "", "clientKey", "publishableKey", "bankName", "Lco/bird/android/model/constant/PaymentMethod;", "paymentMethod", "Lco/bird/android/feature/payment/bankredirect/BankRedirectLaunchActivity$a;", C17296a.f69688o, "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.payment.bankredirect.BankRedirectLaunchActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15089a {
            /* renamed from: a */
            InterfaceC15088a mo57774a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C22546h4 c22546h4, @BindsInstance String str, @BindsInstance String str2, @BindsInstance String str3, @BindsInstance PaymentMethod paymentMethod);
        }

        /* renamed from: a */
        void mo57778a(BankRedirectLaunchActivity bankRedirectLaunchActivity);
    }

    public BankRedirectLaunchActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final C26297mx m57786j0() {
        C26297mx c26297mx = this.f64401B;
        if (c26297mx != null) {
            return c26297mx;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Enum r7;
        boolean equals;
        super.onCreate(bundle);
        C22546h4 m36870c = C22546h4.m36870c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m36870c, "inflate(layoutInflater)");
        setContentView(m36870c.getRoot());
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        String stringExtra = intent.getStringExtra("payment_method");
        if (stringExtra != null) {
            try {
                Object[] enumConstants = PaymentMethod.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants);
                for (Object obj : enumConstants) {
                    equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), stringExtra, true);
                    if (equals) {
                        Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                        r7 = (Enum) obj;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (Exception unused) {
                Object[] enumConstants2 = PaymentMethod.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants2);
                for (Object obj2 : enumConstants2) {
                    r7 = (Enum) obj2;
                    if (Intrinsics.areEqual(r7.name(), "UNKNOWN")) {
                        Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        r7 = null;
        PaymentMethod paymentMethod = (PaymentMethod) r7;
        if (paymentMethod != null) {
            String stringExtra2 = getIntent().getStringExtra("client_key");
            if (stringExtra2 != null) {
                String stringExtra3 = getIntent().getStringExtra(AnalyticsFields.PUBLISHABLE_KEY);
                if (stringExtra3 != null) {
                    String stringExtra4 = getIntent().getStringExtra("payment_info_bank_name");
                    InterfaceC15088a.InterfaceC15089a m57779a = C15093b.m57779a();
                    C46172oG2 c46172oG2 = C46172oG2.f101711a;
                    Application application = getApplication();
                    Intrinsics.checkNotNullExpressionValue(application, "application");
                    InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
                    AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
                    Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
                    m57779a.mo57774a(m21419a, this, m45197b, m36870c, stringExtra2, stringExtra3, stringExtra4, paymentMethod).mo57778a(this);
                    m57786j0().m24683c();
                    return;
                }
                throw new MissingKeyException("Missing publishable key.");
            }
            throw new MissingKeyException("Missing client key.");
        }
        throw new PaymentMethodNotSet("Payment method not set.");
    }
}
