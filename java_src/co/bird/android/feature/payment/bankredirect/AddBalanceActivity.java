package co.bird.android.feature.payment.bankredirect;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.PaymentMethod;
import co.bird.android.model.exception.PaymentMethodNotSet;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Module;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/feature/payment/bankredirect/AddBalanceActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LT6;", "B", "LT6;", "j0", "()LT6;", "setPresenter", "(LT6;)V", "presenter", "<init>", "()V", C17296a.f69688o, "b", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddBalanceActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddBalanceActivity.kt\nco/bird/android/feature/payment/bankredirect/AddBalanceActivity\n+ 2 Intent+.kt\nco/bird/android/library/extension/Intent_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,103:1\n6#2:104\n1#3:105\n13#4,2:106\n15#4,2:110\n1109#5,2:108\n44#6:112\n*S KotlinDebug\n*F\n+ 1 AddBalanceActivity.kt\nco/bird/android/feature/payment/bankredirect/AddBalanceActivity\n*L\n38#1:104\n38#1:105\n38#1:106,2\n38#1:110,2\n38#1:108,2\n58#1:112\n*E\n"})
/* loaded from: classes3.dex */
public final class AddBalanceActivity extends BaseActivity {

    /* renamed from: B */
    public C7647T6 f64400B;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/payment/bankredirect/AddBalanceActivity$a;", "", "Lco/bird/android/feature/payment/bankredirect/AddBalanceActivity;", "activity", "", C17296a.f69688o, "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class}, modules = {InterfaceC15087b.class})
    /* renamed from: co.bird.android.feature.payment.bankredirect.AddBalanceActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC15085a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001JH\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\n2\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/feature/payment/bankredirect/AddBalanceActivity$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LN2;", "binding", "Lco/bird/android/model/constant/PaymentMethod;", "paymentMethod", "Lco/bird/android/buava/Optional;", "Lc04;", "preselectedPreloadAmount", "Lco/bird/android/feature/payment/bankredirect/AddBalanceActivity$a;", C17296a.f69688o, "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.payment.bankredirect.AddBalanceActivity$a$a */
        /* loaded from: classes3.dex */
        public interface InterfaceC15086a {
            /* renamed from: a */
            InterfaceC15085a mo57780a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C5462N2 c5462n2, @BindsInstance PaymentMethod paymentMethod, @BindsInstance Optional<C38887c04> optional);
        }

        /* renamed from: a */
        void mo57784a(AddBalanceActivity addBalanceActivity);
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/feature/payment/bankredirect/AddBalanceActivity$b;", "", "LY6;", "impl", "LX6;", C17296a.f69688o, "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module
    /* renamed from: co.bird.android.feature.payment.bankredirect.AddBalanceActivity$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC15087b {
        @Binds
        /* renamed from: a */
        InterfaceC9297X6 m57787a(C9609Y6 c9609y6);
    }

    public AddBalanceActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final C7647T6 m57788j0() {
        C7647T6 c7647t6 = this.f64400B;
        if (c7647t6 != null) {
            return c7647t6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m57788j0().m84341k(i, i2, intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Enum r9;
        boolean equals;
        super.onCreate(bundle);
        C5462N2 m94444c = C5462N2.m94444c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m94444c, "inflate(layoutInflater)");
        setContentView(m94444c.getRoot());
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        String stringExtra = intent.getStringExtra("payment_method");
        C38887c04 c38887c04 = null;
        boolean z = false;
        if (stringExtra != null) {
            try {
                Object[] enumConstants = PaymentMethod.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants);
                for (Object obj : enumConstants) {
                    equals = StringsKt__StringsJVMKt.equals(((Enum) obj).name(), stringExtra, true);
                    if (equals) {
                        Intrinsics.checkNotNullExpressionValue(obj, "{\n    E::class.java.enum….equals(name, true) }\n  }");
                        r9 = (Enum) obj;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (Exception unused) {
                Object[] enumConstants2 = PaymentMethod.class.getEnumConstants();
                Intrinsics.checkNotNull(enumConstants2);
                for (Object obj2 : enumConstants2) {
                    r9 = (Enum) obj2;
                    if (Intrinsics.areEqual(r9.name(), "UNKNOWN")) {
                        Intrinsics.checkNotNullExpressionValue(obj2, "{\n    E::class.java.enum…m.name == \"UNKNOWN\" }\n  }");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        r9 = null;
        PaymentMethod paymentMethod = (PaymentMethod) r9;
        if (paymentMethod != null) {
            long longExtra = getIntent().getLongExtra("transaction_amount", -1L);
            String stringExtra2 = getIntent().getStringExtra("transaction_currency");
            if (longExtra > 0) {
                z = true;
            }
            if (z) {
                if (stringExtra2 != null) {
                    c38887c04 = new C38887c04(longExtra, stringExtra2, C51916xx1.f118396a.m4408d(longExtra, C45097mS5.m25591o(stringExtra2), EnumC36501Ux1.SHOW_IF_NON_ZERO));
                    InterfaceC15085a.InterfaceC15086a m57785a = C15090a.m57785a();
                    C46172oG2 c46172oG2 = C46172oG2.f101711a;
                    Application application = getApplication();
                    Intrinsics.checkNotNullExpressionValue(application, "application");
                    InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
                    AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
                    Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
                    m57785a.mo57780a(m21419a, this, m45197b, m94444c, paymentMethod, Optional.f63040c.m59033b(c38887c04)).mo57784a(this);
                    return;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new PaymentMethodNotSet("Payment method not set.");
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m57788j0().m84340l();
    }
}
