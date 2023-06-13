package co.bird.android.app.feature.ridedetail;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.core.mvp.BaseActivity;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b#\u0010$J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\u0004H\u0014J\b\u0010\n\u001a\u00020\u0004H\u0014J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H\u0014J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, m28432d2 = {"Lco/bird/android/app/feature/ridedetail/RideDetailActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onResume", "onStart", "onStop", "onPause", "onDestroy", "onLowMemory", "outState", "onSaveInstanceState", "j0", "LpQ4;", "B", "LpQ4;", "k0", "()LpQ4;", "setRideDetailPresenterFactory", "(LpQ4;)V", "rideDetailPresenterFactory", "LRP4;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LRP4;", "getPresenter", "()LRP4;", "setPresenter", "(LRP4;)V", "presenter", "LG5;", "D", "LG5;", "binding", "<init>", "()V", "E", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideDetailActivity.kt\nco/bird/android/app/feature/ridedetail/RideDetailActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n*L\n1#1,101:1\n44#2:102\n44#2:103\n*S KotlinDebug\n*F\n+ 1 RideDetailActivity.kt\nco/bird/android/app/feature/ridedetail/RideDetailActivity\n*L\n39#1:102\n40#1:103\n*E\n"})
/* loaded from: classes2.dex */
public final class RideDetailActivity extends BaseActivity {

    /* renamed from: E */
    public static final C14300a f62694E = new C14300a(null);

    /* renamed from: F */
    public static final int f62695F = 8;

    /* renamed from: B */
    public InterfaceC46857pQ4 f62696B;

    /* renamed from: C */
    public RP4 f62697C;

    /* renamed from: D */
    public C2633G5 f62698D;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f"}, m28432d2 = {"Lco/bird/android/app/feature/ridedetail/RideDetailActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "rideId", "", "showRating", "Landroid/content/Intent;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.ridedetail.RideDetailActivity$a */
    /* loaded from: classes2.dex */
    public static final class C14300a {
        public /* synthetic */ C14300a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m59456a(Context context, String rideId, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(rideId, "rideId");
            Intent intent = new Intent(context, RideDetailActivity.class);
            intent.putExtra("ride_id", rideId);
            intent.putExtra("show_rating", z);
            return intent;
        }

        private C14300a() {
        }
    }

    public RideDetailActivity() {
        super(false, null, null, 7, null);
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: j0 */
    public final void m59458j0(Bundle bundle) {
        Bundle bundle2;
        C38500bM2.m64632a(this);
        C2633G5 c2633g5 = null;
        if (bundle != null) {
            bundle2 = bundle.getBundle("map");
        } else {
            bundle2 = null;
        }
        C2633G5 c2633g52 = this.f62698D;
        if (c2633g52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2633g52 = null;
        }
        c2633g52.f10886d.m50725b(bundle2);
        C2633G5 c2633g53 = this.f62698D;
        if (c2633g53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c2633g5 = c2633g53;
        }
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        C50413vQ4 c50413vQ4 = new C50413vQ4(this, c2633g5, m45197b);
        InterfaceC46857pQ4 m59457k0 = m59457k0();
        AndroidLifecycleScopeProvider m45197b2 = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b2, "AndroidLifecycleScopeProvider.from(this)");
        C42706iQ4 mo17517a = m59457k0.mo17517a(m45197b2, mo58957w(), c50413vQ4);
        String stringExtra = getIntent().getStringExtra("ride_id");
        Intrinsics.checkNotNull(stringExtra);
        mo17517a.m33969t(stringExtra, getIntent().getBooleanExtra("show_rating", false));
        this.f62697C = mo17517a;
    }

    /* renamed from: k0 */
    public final InterfaceC46857pQ4 m59457k0() {
        InterfaceC46857pQ4 interfaceC46857pQ4 = this.f62696B;
        if (interfaceC46857pQ4 != null) {
            return interfaceC46857pQ4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rideDetailPresenterFactory");
        return null;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H22.f12748a.mo24035q0(this);
        C2633G5 m105838c = C2633G5.m105838c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m105838c, "inflate(layoutInflater)");
        this.f62698D = m105838c;
        if (m105838c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m105838c = null;
        }
        setContentView(m105838c.getRoot());
        m59458j0(bundle);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        C2633G5 c2633g5 = this.f62698D;
        if (c2633g5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2633g5 = null;
        }
        c2633g5.f10886d.m50724c();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        C2633G5 c2633g5 = this.f62698D;
        if (c2633g5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2633g5 = null;
        }
        c2633g5.f10886d.m50723d();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        C2633G5 c2633g5 = this.f62698D;
        if (c2633g5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2633g5 = null;
        }
        c2633g5.f10886d.m50722e();
        super.onPause();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        RP4 rp4 = this.f62697C;
        if (rp4 != null) {
            rp4.onResume();
        }
        C2633G5 c2633g5 = this.f62698D;
        if (c2633g5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2633g5 = null;
        }
        c2633g5.f10886d.m50721f();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (outState.getBundle("map") == null) {
            outState.putBundle("map", new Bundle());
        }
        C2633G5 c2633g5 = this.f62698D;
        if (c2633g5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2633g5 = null;
        }
        c2633g5.f10886d.m50720g(outState);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        C2633G5 c2633g5 = this.f62698D;
        if (c2633g5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2633g5 = null;
        }
        c2633g5.f10886d.m50719h();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        C2633G5 c2633g5 = this.f62698D;
        if (c2633g5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c2633g5 = null;
        }
        c2633g5.f10886d.m50718i();
    }
}
