package co.bird.android.app.feature.ridehistory;

import android.os.Bundle;
import co.bird.android.app.feature.ridehistory.RideHistoryActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.rxkotlin.C24523e;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/app/feature/ridehistory/RideHistoryActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "LHR4;", "B", "LHR4;", "m0", "()LHR4;", "setRideHistoryPresenterFactory", "(LHR4;)V", "rideHistoryPresenterFactory", "LzR4;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "LzR4;", "k0", "()LzR4;", "n0", "(LzR4;)V", "presenter", "<init>", "()V", "D", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideHistoryActivity.kt\nco/bird/android/app/feature/ridehistory/RideHistoryActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,45:1\n180#2:46\n*S KotlinDebug\n*F\n+ 1 RideHistoryActivity.kt\nco/bird/android/app/feature/ridehistory/RideHistoryActivity\n*L\n31#1:46\n*E\n"})
/* loaded from: classes2.dex */
public final class RideHistoryActivity extends BaseActivity {

    /* renamed from: D */
    public static final C14302a f62706D = new C14302a(null);

    /* renamed from: E */
    public static final int f62707E = 8;

    /* renamed from: B */
    public HR4 f62708B;

    /* renamed from: C */
    public InterfaceC52794zR4 f62709C;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"Lco/bird/android/app/feature/ridehistory/RideHistoryActivity$a;", "", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.ridehistory.RideHistoryActivity$a */
    /* loaded from: classes2.dex */
    public static final class C14302a {
        public /* synthetic */ C14302a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14302a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.ridehistory.RideHistoryActivity$b */
    /* loaded from: classes2.dex */
    public static final class C14303b extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ C3320I5 f62711h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14303b(C3320I5 c3320i5) {
            super(1);
            this.f62711h = c3320i5;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            invoke2((Pair<Boolean, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Boolean> pair) {
            SR4 sr4 = new SR4(RideHistoryActivity.this, this.f62711h, pair.component1().booleanValue(), pair.component2().booleanValue());
            RideHistoryActivity rideHistoryActivity = RideHistoryActivity.this;
            rideHistoryActivity.m59420n0(rideHistoryActivity.m59421m0().mo102406a((WireBird) RideHistoryActivity.this.getIntent().getParcelableExtra("bird"), RideHistoryActivity.this.m58963Z(), sr4, RideHistoryActivity.this.mo58957w()));
            RideHistoryActivity.this.m59422k0().mo1345a();
        }
    }

    public RideHistoryActivity() {
        super(false, null, null, 7, null);
    }

    public static final void onCreate$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public final InterfaceC52794zR4 m59422k0() {
        InterfaceC52794zR4 interfaceC52794zR4 = this.f62709C;
        if (interfaceC52794zR4 != null) {
            return interfaceC52794zR4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: m0 */
    public final HR4 m59421m0() {
        HR4 hr4 = this.f62708B;
        if (hr4 != null) {
            return hr4;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rideHistoryPresenterFactory");
        return null;
    }

    /* renamed from: n0 */
    public final void m59420n0(InterfaceC52794zR4 interfaceC52794zR4) {
        Intrinsics.checkNotNullParameter(interfaceC52794zR4, "<set-?>");
        this.f62709C = interfaceC52794zR4;
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C3320I5 m102998c = C3320I5.m102998c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m102998c, "inflate(layoutInflater)");
        setContentView(m102998c.getRoot());
        H22.f12748a.mo24030u(this);
        Object m33094as = C24523e.f91168a.m31956a(mo58955y().m82523o9(), mo58955y().m82546m8()).m33094as(AutoDispose.m45239a(m58963Z()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14303b c14303b = new C14303b(m102998c);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: vR4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RideHistoryActivity.onCreate$lambda$0(Function1.this, obj);
            }
        });
    }
}
