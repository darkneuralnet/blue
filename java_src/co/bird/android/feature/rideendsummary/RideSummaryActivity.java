package co.bird.android.feature.rideendsummary;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.feature.rideendsummary.InterfaceC15290f;
import co.bird.android.model.constant.AnnouncementContext;
import co.bird.android.model.wire.WireRideDetail;
import co.bird.android.widget.RetakeablePhotoView;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C41707gk1;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/feature/rideendsummary/RideSummaryActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Le75;", "B", "Le75;", "k0", "()Le75;", "setPresenter", "(Le75;)V", "presenter", "Luk1;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Luk1;", "j0", "()Luk1;", "setAnnouncementPresenterFactory", "(Luk1;)V", "announcementPresenterFactory", "<init>", "()V", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideSummaryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideSummaryActivity.kt\nco/bird/android/feature/rideendsummary/RideSummaryActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,114:1\n44#2:115\n*S KotlinDebug\n*F\n+ 1 RideSummaryActivity.kt\nco/bird/android/feature/rideendsummary/RideSummaryActivity\n*L\n43#1:115\n*E\n"})
/* loaded from: classes3.dex */
public final class RideSummaryActivity extends BaseActivity {

    /* renamed from: B */
    public InterfaceC40161e75 f64690B;

    /* renamed from: C */
    public InterfaceC50008uk1 f64691C;

    public RideSummaryActivity() {
        super(false, null, null, 7, null);
    }

    /* renamed from: j0 */
    public final InterfaceC50008uk1 m57486j0() {
        InterfaceC50008uk1 interfaceC50008uk1 = this.f64691C;
        if (interfaceC50008uk1 != null) {
            return interfaceC50008uk1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("announcementPresenterFactory");
        return null;
    }

    /* renamed from: k0 */
    public final InterfaceC40161e75 m57485k0() {
        InterfaceC40161e75 interfaceC40161e75 = this.f64690B;
        if (interfaceC40161e75 != null) {
            return interfaceC40161e75;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m57485k0().onActivityResult(i, i2, intent);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C7063R5 m87330c = C7063R5.m87330c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m87330c, "inflate(layoutInflater)");
        setContentView(m87330c.getRoot());
        mo58977D();
        InterfaceC15290f.InterfaceC15291a m57459a = C15273d.m57459a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(applicationContext);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        RetakeablePhotoView retakeablePhotoView = m87330c.f31500p;
        Intrinsics.checkNotNullExpressionValue(retakeablePhotoView, "binding.retakeablePhotoView");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        AbstractC11719f lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "lifecycle");
        EO4 m107260a = FO4.m107260a(this);
        Intrinsics.checkNotNullExpressionValue(m107260a, "create(this)");
        m57459a.mo57441a(m21419a, this, m45197b, retakeablePhotoView, supportFragmentManager, lifecycle, m87330c, m107260a).mo57442a(this);
        InterfaceC40161e75 m57485k0 = m57485k0();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        m57485k0.mo43245b(intent);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("ride_detail");
        Intrinsics.checkNotNull(parcelableExtra);
        m57486j0().mo8210a(null, AnnouncementContext.RATING_SCREEN, new C41707gk1.C22436h(null, Integer.valueOf(((WireRideDetail) parcelableExtra).getRide().durationSeconds()), null, null, 13, null));
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m57485k0().onResume();
    }
}
