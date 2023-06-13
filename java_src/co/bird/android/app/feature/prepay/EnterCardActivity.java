package co.bird.android.app.feature.prepay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AbstractC10999c;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.PaymentAddSource;
import com.braintreepayments.api.models.PaymentMethodNonce;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 42\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u00015B\u0007¢\u0006\u0004\b2\u00103J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\"\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0014\u001a\u00020\bH\u0014J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0012\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0016R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u00101\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00066"}, m28432d2 = {"Lco/bird/android/app/feature/prepay/EnterCardActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "LMN3;", "LCx0;", "LE10;", "LF10;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "onResume", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "Lcom/braintreepayments/api/models/PaymentMethodNonce;", "paymentMethodNonce", "i", "Lex0;", "configuration", "k", "l", "Ljava/lang/Exception;", "error", "onError", "Lme1;", "B", "Lme1;", "j0", "()Lme1;", "setPresenterFactory", "(Lme1;)V", "presenterFactory", "LQd1;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LQd1;", "getPresenter", "()LQd1;", "setPresenter", "(LQd1;)V", "presenter", "<init>", "()V", "D", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class EnterCardActivity extends BaseActivity implements MN3, InterfaceC32288Cx0, E10, F10 {

    /* renamed from: D */
    public static final C14180a f62287D = new C14180a(null);

    /* renamed from: E */
    public static final int f62288E = 8;

    /* renamed from: B */
    public InterfaceC45205me1 f62289B;

    /* renamed from: C */
    public InterfaceC35385Qd1 f62290C;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\f"}, m28432d2 = {"Lco/bird/android/app/feature/prepay/EnterCardActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "saveCardWithoutCharge", "Lco/bird/android/model/PaymentAddSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "Landroid/content/Intent;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.prepay.EnterCardActivity$a */
    /* loaded from: classes2.dex */
    public static final class C14180a {
        public /* synthetic */ C14180a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m59670a(Context context, boolean z, PaymentAddSource paymentAddSource) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, EnterCardActivity.class);
            intent.putExtra("save_card_without_charge", z);
            intent.putExtra("card_entry_source", paymentAddSource);
            return intent;
        }

        private C14180a() {
        }
    }

    public EnterCardActivity() {
        super(false, null, null, 7, null);
    }

    @Override // p000.MN3
    /* renamed from: i */
    public void mo57725i(PaymentMethodNonce paymentMethodNonce) {
        Intrinsics.checkNotNullParameter(paymentMethodNonce, "paymentMethodNonce");
        InterfaceC35385Qd1 interfaceC35385Qd1 = this.f62290C;
        if (interfaceC35385Qd1 != null) {
            interfaceC35385Qd1.mo33691a(paymentMethodNonce);
        }
    }

    /* renamed from: j0 */
    public final InterfaceC45205me1 m59672j0() {
        InterfaceC45205me1 interfaceC45205me1 = this.f62289B;
        if (interfaceC45205me1 != null) {
            return interfaceC45205me1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenterFactory");
        return null;
    }

    @Override // p000.InterfaceC32288Cx0
    /* renamed from: k */
    public void mo10872k(C40650ex0 c40650ex0) {
    }

    @Override // p000.E10
    /* renamed from: l */
    public void mo59671l(int i) {
        InterfaceC35385Qd1 interfaceC35385Qd1 = this.f62290C;
        if (interfaceC35385Qd1 != null) {
            interfaceC35385Qd1.mo33689c(i);
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC35385Qd1 interfaceC35385Qd1 = this.f62290C;
        if (interfaceC35385Qd1 != null) {
            interfaceC35385Qd1.onActivityResult(i, i2, intent);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        H22.f12748a.mo24037p0(this);
        AbstractC10999c.m70280O(1);
        super.onCreate(bundle);
        C5816O2 m92988c = C5816O2.m92988c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m92988c, "inflate(layoutInflater)");
        setContentView(m92988c.getRoot());
        C42833ie1 mo23375a = m59672j0().mo23375a(this, m58963Z(), new C47577qe1(this, m92988c), mo58957w(), mo58956x());
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        mo23375a.m33705M(intent);
        this.f62290C = mo23375a;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(C36387Uk4.menu_add_card, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // p000.F10
    public void onError(Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC35385Qd1 interfaceC35385Qd1 = this.f62290C;
        if (interfaceC35385Qd1 != null) {
            interfaceC35385Qd1.mo33688d(error);
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        InterfaceC35385Qd1 interfaceC35385Qd1;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C36585Vg4.done && (interfaceC35385Qd1 = this.f62290C) != null) {
            interfaceC35385Qd1.mo33687e();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        InterfaceC35385Qd1 interfaceC35385Qd1 = this.f62290C;
        if (interfaceC35385Qd1 != null) {
            interfaceC35385Qd1.onResume();
        }
    }
}
