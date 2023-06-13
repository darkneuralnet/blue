package co.bird.android.app.feature.driver.license.p007v2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.IdCardTerminology;
import co.bird.android.model.contractor.ContractorOnboardStep;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014J\"\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onPause", "onDestroy", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "LI71;", "B", "LI71;", "j0", "()LI71;", "setDriverLicenseScanV2PresenterImplFactory", "(LI71;)V", "driverLicenseScanV2PresenterImplFactory", "Lt71;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lt71;", "presenter", "<init>", "()V", "D", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDriverLicenseScanV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriverLicenseScanV2Activity.kt\nco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,78:1\n44#2:79\n*S KotlinDebug\n*F\n+ 1 DriverLicenseScanV2Activity.kt\nco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity\n*L\n46#1:79\n*E\n"})
/* renamed from: co.bird.android.app.feature.driver.license.v2.DriverLicenseScanV2Activity */
/* loaded from: classes2.dex */
public final class DriverLicenseScanV2Activity extends BaseActivity {

    /* renamed from: D */
    public static final C13733a f61437D = new C13733a(null);

    /* renamed from: E */
    public static final int f61438E = 8;

    /* renamed from: B */
    public I71 f61439B;

    /* renamed from: C */
    public InterfaceC49051t71 f61440C;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\n"}, m28432d2 = {"Lco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/contractor/ContractorOnboardStep;", "step", "Landroid/content/Intent;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nDriverLicenseScanV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DriverLicenseScanV2Activity.kt\nco/bird/android/app/feature/driver/license/v2/DriverLicenseScanV2Activity$Factory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
    /* renamed from: co.bird.android.app.feature.driver.license.v2.DriverLicenseScanV2Activity$a */
    /* loaded from: classes2.dex */
    public static final class C13733a {
        public /* synthetic */ C13733a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m60666a(Context context, ContractorOnboardStep contractorOnboardStep) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, DriverLicenseScanV2Activity.class);
            if (contractorOnboardStep != null) {
                intent.putExtra("contractor_onboard_step", contractorOnboardStep);
            }
            return intent;
        }

        private C13733a() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.driver.license.v2.DriverLicenseScanV2Activity$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C13734b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdCardTerminology.values().length];
            try {
                iArr[IdCardTerminology.ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IdCardTerminology.DRIVER_LICENSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IdCardTerminology.DRIVER_LICENSE_OR_PROVISIONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DriverLicenseScanV2Activity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final I71 m60667j0() {
        I71 i71 = this.f61439B;
        if (i71 != null) {
            return i71;
        }
        Intrinsics.throwUninitializedPropertyAccessException("driverLicenseScanV2PresenterImplFactory");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        InterfaceC49051t71 interfaceC49051t71 = this.f61440C;
        if (interfaceC49051t71 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            interfaceC49051t71 = null;
        }
        interfaceC49051t71.onActivityResult(i, i2, intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        H22.f12748a.mo24029u1(this);
        setContentView(C39311cj4.activity_driver_license_scan_v2);
        int i2 = C13734b.$EnumSwitchMapping$0[mo58955y().m82623f8().getValue().getIdCardTerminology().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (mo58955y().m82623f8().getValue().getEnableIdCardStringSwap()) {
                        i = C45871nl4.id_card_activity_title;
                    } else {
                        i = C45871nl4.driver_license_activity_title;
                    }
                } else {
                    i = C45871nl4.driver_license_or_provisional_activity_title;
                }
            } else {
                i = C45871nl4.driver_license_activity_title;
            }
        } else {
            i = C45871nl4.id_card_activity_title;
        }
        setTitle(getString(i));
        O71 o71 = new O71(this, mo58955y().m82623f8().getValue().getEnableIdCardStringSwap(), mo58955y().m82623f8().getValue().getIdCardTerminology());
        I71 m60667j0 = m60667j0();
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        InterfaceC40099e13 mo58957w = mo58957w();
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        G71 mo101120a = m60667j0.mo101120a(this, m45197b, o71, mo58957w, new C52759zN5(applicationContext));
        this.f61440C = mo101120a;
        if (mo101120a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            mo101120a = null;
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        mo101120a.mo13040b(intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        InterfaceC49051t71 interfaceC49051t71 = this.f61440C;
        if (interfaceC49051t71 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            interfaceC49051t71 = null;
        }
        interfaceC49051t71.onDestroy();
        super.onDestroy();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        InterfaceC49051t71 interfaceC49051t71 = this.f61440C;
        if (interfaceC49051t71 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            interfaceC49051t71 = null;
        }
        interfaceC49051t71.onPause();
        super.onPause();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        InterfaceC49051t71 interfaceC49051t71 = this.f61440C;
        if (interfaceC49051t71 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
            interfaceC49051t71 = null;
        }
        interfaceC49051t71.onResume();
        super.onResume();
    }
}
