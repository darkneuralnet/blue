package co.bird.android.app.feature.rentalagreement;

import android.os.Bundle;
import co.bird.android.app.feature.rentalagreement.RentalAgreementActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.AgreementRole;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import io.reactivex.AbstractC23461c;
import io.reactivex.functions.InterfaceC23478a;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "LOg6;", "B", "LOg6;", "j0", "()LOg6;", "setAgreementPresenterFactory", "(LOg6;)V", "agreementPresenterFactory", "LCg6;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LCg6;", "getUserPresenter", "()LCg6;", "setUserPresenter", "(LCg6;)V", "userPresenter", "<init>", "()V", "D", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRentalAgreementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RentalAgreementActivity.kt\nco/bird/android/app/feature/rentalagreement/RentalAgreementActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,70:1\n37#2,2:71\n*S KotlinDebug\n*F\n+ 1 RentalAgreementActivity.kt\nco/bird/android/app/feature/rentalagreement/RentalAgreementActivity\n*L\n36#1:71,2\n*E\n"})
/* loaded from: classes2.dex */
public final class RentalAgreementActivity extends BaseActivity {

    /* renamed from: D */
    public static final C14208a f62335D = new C14208a(null);

    /* renamed from: E */
    public static final int f62336E = 8;

    /* renamed from: B */
    public InterfaceC34949Og6 f62337B;

    /* renamed from: C */
    public InterfaceC32141Cg6 f62338C;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/app/feature/rentalagreement/RentalAgreementActivity$a;", "", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.rentalagreement.RentalAgreementActivity$a */
    /* loaded from: classes2.dex */
    public static final class C14208a {
        public /* synthetic */ C14208a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14208a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"co/bird/android/app/feature/rentalagreement/RentalAgreementActivity$b", "Lg9;", "Lio/reactivex/c;", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.rentalagreement.RentalAgreementActivity$b */
    /* loaded from: classes2.dex */
    public static final class C14209b extends AbstractC20762g9 {

        /* renamed from: f */
        public final /* synthetic */ String f62339f;

        /* renamed from: g */
        public final /* synthetic */ boolean f62340g;

        /* renamed from: h */
        public final /* synthetic */ RentalAgreementActivity f62341h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14209b(String str, String str2, boolean z, RentalAgreementActivity rentalAgreementActivity, Object[] objArr) {
            super((AgreementRole[]) objArr, false, str, str2, z, 2, null);
            this.f62339f = str2;
            this.f62340g = z;
            this.f62341h = rentalAgreementActivity;
        }

        /* renamed from: h */
        public static final void m59619h(boolean z, RentalAgreementActivity this$0, String str) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (!z) {
                this$0.mo58957w().mo37077W0(InterfaceC40099e13.EnumC19925b.RESULT_OK, TuplesKt.m28425to("co.bird.android.user_guest_id", str));
            }
            this$0.mo58957w().close();
        }

        @Override // p000.AbstractC20762g9
        /* renamed from: a */
        public AbstractC23461c mo39976a() {
            AbstractC23461c ignoreElements = this.f62341h.m58962b0().mo26978H().ignoreElements();
            final boolean z = this.f62340g;
            final RentalAgreementActivity rentalAgreementActivity = this.f62341h;
            final String str = this.f62339f;
            AbstractC23461c m33029z = ignoreElements.m33029z(new InterfaceC23478a() { // from class: ux4
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    RentalAgreementActivity.C14209b.m59619h(z, rentalAgreementActivity, str);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33029z, "userManager\n          .a…gator.close()\n          }");
            return m33029z;
        }
    }

    public RentalAgreementActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC34949Og6 m59621j0() {
        InterfaceC34949Og6 interfaceC34949Og6 = this.f62337B;
        if (interfaceC34949Og6 != null) {
            return interfaceC34949Og6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("agreementPresenterFactory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        InterfaceC32141Cg6 interfaceC32141Cg6 = this.f62338C;
        boolean z = false;
        if (interfaceC32141Cg6 != null && interfaceC32141Cg6.onBackPressed()) {
            z = true;
        }
        if (!z) {
            super.onBackPressed();
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24079R(this);
        setContentView(C39311cj4.activity_webview);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("agreement_roles");
        Intrinsics.checkNotNull(parcelableArrayListExtra);
        String stringExtra = getIntent().getStringExtra("partner_id");
        if (stringExtra == null) {
            stringExtra = null;
        }
        String str = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("co.bird.android.user_guest_id");
        boolean booleanExtra = getIntent().getBooleanExtra("aggressively_triggered", false);
        AgreementRole[] agreementRoleArr = (AgreementRole[]) parcelableArrayListExtra.toArray(new AgreementRole[0]);
        C34013Kg6 mo89934a = m59621j0().mo89934a(m58963Z(), new C35885Sg6(C40788fB0.m41779c(this, 16908290), this), new C14209b(str, stringExtra2, booleanExtra, this, Arrays.copyOf(agreementRoleArr, agreementRoleArr.length)), mo58957w(), null);
        mo89934a.m98547q();
        this.f62338C = mo89934a;
    }
}
