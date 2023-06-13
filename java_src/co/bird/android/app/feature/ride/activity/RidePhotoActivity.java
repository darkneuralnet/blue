package co.bird.android.app.feature.ride.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.ride.activity.RidePhotoActivity;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.ParkingNest;
import co.bird.android.model.ParkingNestData;
import co.bird.android.model.ParkingPhotoType;
import co.bird.android.model.RideState;
import co.bird.android.model.constant.PhysicalLockPurpose;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRideDetail;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23447K;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001AB\u0007¢\u0006\u0004\b>\u0010?J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0014J\b\u0010\u0015\u001a\u00020\u0004H\u0014J\b\u0010\u0016\u001a\u00020\u0004H\u0014R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00104¨\u0006B"}, m28432d2 = {"Lco/bird/android/app/feature/ride/activity/RidePhotoActivity;", "Lco/bird/android/core/mvp/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "unit", "Lio/reactivex/F;", "", "q0", "(Lkotlin/Unit;)Lio/reactivex/F;", "jpeg", "Lco/bird/android/model/wire/WireRide;", "E0", "([B)Lio/reactivex/F;", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "onBackPressed", "onResume", "onPause", "onDestroy", "LZ95;", "B", "LZ95;", "A0", "()LZ95;", "setRiderModalPresenterFactory", "(LZ95;)V", "riderModalPresenterFactory", "Lbn;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Lbn;", "w0", "()Lbn;", "setAreaManager", "(Lbn;)V", "areaManager", "LXc1;", "D", "LXc1;", "x0", "()LXc1;", "setEndRideManager", "(LXc1;)V", "endRideManager", "LN95;", "E", "LN95;", "riderModalPresenter", "Lco/bird/android/model/wire/WireRideDetail;", "F", "Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", "LO5;", "G", "LO5;", "binding", "", "H", "rating", "<init>", "()V", "I", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRidePhotoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePhotoActivity.kt\nco/bird/android/app/feature/ride/activity/RidePhotoActivity\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,151:1\n161#2:152\n*S KotlinDebug\n*F\n+ 1 RidePhotoActivity.kt\nco/bird/android/app/feature/ride/activity/RidePhotoActivity\n*L\n84#1:152\n*E\n"})
/* loaded from: classes2.dex */
public final class RidePhotoActivity extends BaseActivity {

    /* renamed from: I */
    public static final C14222a f62423I = new C14222a(null);

    /* renamed from: J */
    public static final int f62424J = 8;

    /* renamed from: B */
    public Z95 f62425B;

    /* renamed from: C */
    public InterfaceC12495bn f62426C;

    /* renamed from: D */
    public InterfaceC37014Xc1 f62427D;

    /* renamed from: E */
    public N95 f62428E;

    /* renamed from: F */
    public WireRideDetail f62429F;

    /* renamed from: G */
    public C5821O5 f62430G;

    /* renamed from: H */
    public float f62431H;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, m28432d2 = {"Lco/bird/android/app/feature/ride/activity/RidePhotoActivity$a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", "Landroid/content/Intent;", C17296a.f69688o, "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.ride.activity.RidePhotoActivity$a */
    /* loaded from: classes2.dex */
    public static final class C14222a {
        public /* synthetic */ C14222a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent m59544a(Context context, WireRideDetail rideDetail) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(rideDetail, "rideDetail");
            Intent intent = new Intent(context, RidePhotoActivity.class);
            intent.putExtra("ride_detail", rideDetail);
            return intent;
        }

        private C14222a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Landroid/graphics/Bitmap;", "bitmap", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Landroid/graphics/Bitmap;)[B"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.ride.activity.RidePhotoActivity$b */
    /* loaded from: classes2.dex */
    public static final class C14223b extends Lambda implements Function1<Bitmap, byte[]> {

        /* renamed from: g */
        public static final C14223b f62432g = new C14223b();

        public C14223b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final byte[] invoke(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            return C27606qU.toByteArray$default(bitmap, 0, 1, null);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.ride.activity.RidePhotoActivity$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C14224c extends FunctionReferenceImpl implements Function1<Unit, AbstractC23442F<byte[]>> {
        public C14224c(Object obj) {
            super(1, obj, RidePhotoActivity.class, "capturePhoto", "capturePhoto$app_birdRelease(Lkotlin/Unit;)Lio/reactivex/Single;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<byte[]> invoke(Unit p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((RidePhotoActivity) this.receiver).m59548q0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "([B)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.ride.activity.RidePhotoActivity$d */
    /* loaded from: classes2.dex */
    public static final class C14225d extends Lambda implements Function1<byte[], Unit> {
        public C14225d() {
            super(1);
        }

        /* renamed from: a */
        public final void m59541a(byte[] bArr) {
            String str;
            WirePhysicalLock physicalLock;
            PhysicalLockPurpose purpose;
            ParkingNest parkingNest;
            InterfaceC1880Ea m58975F = RidePhotoActivity.this.m58975F();
            WireRideDetail wireRideDetail = RidePhotoActivity.this.f62429F;
            String str2 = null;
            if (wireRideDetail == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rideDetail");
                wireRideDetail = null;
            }
            String birdId = wireRideDetail.getRide().getBirdId();
            if (birdId == null) {
                birdId = "";
            }
            String str3 = birdId;
            WireRideDetail wireRideDetail2 = RidePhotoActivity.this.f62429F;
            if (wireRideDetail2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rideDetail");
                wireRideDetail2 = null;
            }
            String id = wireRideDetail2.getRide().getId();
            String parkingPhotoType = ParkingPhotoType.DEFAULT.toString();
            ParkingNestData m59035e = RidePhotoActivity.this.m59546w0().mo64003c0().getValue().m59035e();
            if (m59035e != null && (parkingNest = m59035e.getParkingNest()) != null) {
                str = parkingNest.getId();
            } else {
                str = null;
            }
            WireRideDetail wireRideDetail3 = RidePhotoActivity.this.f62429F;
            if (wireRideDetail3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rideDetail");
                wireRideDetail3 = null;
            }
            WireBird bird = wireRideDetail3.getRide().getBird();
            if (bird != null && (physicalLock = bird.getPhysicalLock()) != null && (purpose = physicalLock.getPurpose()) != null) {
                str2 = purpose.toString();
            }
            m58975F.mo55905y(new FG3(null, null, null, str3, id, str, parkingPhotoType, str2, RidePhotoActivity.this.m59545x0().mo55540n(), 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            m59541a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", MessageExtension.FIELD_DATA, "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", "invoke", "([B)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.ride.activity.RidePhotoActivity$e */
    /* loaded from: classes2.dex */
    public static final class C14226e extends Lambda implements Function1<byte[], InterfaceC23447K<? extends WireRide>> {
        public C14226e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends WireRide> invoke(byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return RidePhotoActivity.this.m59555E0(data).m33142Y(C24542a.m31932c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.ride.activity.RidePhotoActivity$f */
    /* loaded from: classes2.dex */
    public static final class C14227f extends Lambda implements Function1<Throwable, Unit> {
        public C14227f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            RidePhotoActivity.this.m58976E(th.getMessage());
            C41318g46.m40159e(th);
            InterfaceC1880Ea m58975F = RidePhotoActivity.this.m58975F();
            String localizedMessage = th.getLocalizedMessage();
            m58975F.mo55905y(new C44502lS3(null, null, null, "ride_parking_photo_take_photo", localizedMessage == null ? th.toString() : localizedMessage, 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireRide;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireRide;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.ride.activity.RidePhotoActivity$g */
    /* loaded from: classes2.dex */
    public static final class C14228g extends Lambda implements Function1<WireRide, Unit> {
        public C14228g() {
            super(1);
        }

        /* renamed from: a */
        public final void m59540a(WireRide wireRide) {
            InterfaceC40099e13 mo58957w = RidePhotoActivity.this.mo58957w();
            WireRideDetail wireRideDetail = RidePhotoActivity.this.f62429F;
            if (wireRideDetail == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rideDetail");
                wireRideDetail = null;
            }
            InterfaceC40099e13.C19924a.goToRideSummary$default(mo58957w, wireRideDetail, false, false, null, 8, null);
            RidePhotoActivity.this.mo58957w().close();
            C41318g46.m40151m("ride photo: " + wireRide, new Object[0]);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireRide wireRide) {
            m59540a(wireRide);
            return Unit.INSTANCE;
        }
    }

    public RidePhotoActivity() {
        super(false, null, null, 7, null);
        this.f62431H = 5.0f;
    }

    /* renamed from: B0 */
    public static final InterfaceC23447K m59557B0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: C0 */
    public static final InterfaceC23447K m59556C0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    public static final void onCreate$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void onCreate$lambda$3(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void onCreate$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final byte[] m59547t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (byte[]) tmp0.invoke(obj);
    }

    /* renamed from: A0 */
    public final Z95 m59558A0() {
        Z95 z95 = this.f62425B;
        if (z95 != null) {
            return z95;
        }
        Intrinsics.throwUninitializedPropertyAccessException("riderModalPresenterFactory");
        return null;
    }

    /* renamed from: E0 */
    public final AbstractC23442F<WireRide> m59555E0(byte[] jpeg) {
        Intrinsics.checkNotNullParameter(jpeg, "jpeg");
        YR4 m58964Y = m58964Y();
        WireRideDetail wireRideDetail = this.f62429F;
        if (wireRideDetail == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rideDetail");
            wireRideDetail = null;
        }
        return m58964Y.mo75027u0(wireRideDetail.getRide(), jpeg);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Set<? extends RideState.Status> of;
        super.onCreate(bundle);
        C5821O5 m92948c = C5821O5.m92948c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m92948c, "inflate(layoutInflater)");
        this.f62430G = m92948c;
        WireRideDetail wireRideDetail = null;
        if (m92948c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m92948c = null;
        }
        setContentView(m92948c.getRoot());
        H22.f12748a.mo24041n1(this);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("ride_detail");
        Intrinsics.checkNotNull(parcelableExtra);
        this.f62429F = (WireRideDetail) parcelableExtra;
        this.f62431H = getIntent().getFloatExtra("rating", 5.0f);
        C5821O5 c5821o5 = this.f62430G;
        if (c5821o5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5821o5 = null;
        }
        Button button = c5821o5.f25616e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.takePhotoButton");
        boolean z = true;
        AbstractC24490k flowable = C44626lf5.clicksThrottle$default(button, 0L, 1, null).toFlowable(EnumC23460b.DROP);
        final C14224c c14224c = new C14224c(this);
        AbstractC24490k m32149f0 = flowable.m32149f0(new InterfaceC23492o() { // from class: aY4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m59557B0;
                m59557B0 = RidePhotoActivity.m59557B0(Function1.this, obj);
                return m59557B0;
            }
        });
        final C14225d c14225d = new C14225d();
        AbstractC24490k m32191K = m32149f0.m32191K(new InterfaceC23484g() { // from class: bY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RidePhotoActivity.onCreate$lambda$1(Function1.this, obj);
            }
        });
        final C14226e c14226e = new C14226e();
        AbstractC24490k m32108t0 = m32191K.m32149f0(new InterfaceC23492o() { // from class: cY4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m59556C0;
                m59556C0 = RidePhotoActivity.m59556C0(Function1.this, obj);
                return m59556C0;
            }
        }).m32108t0(C23454a.m33087a(), false, 1);
        final C14227f c14227f = new C14227f();
        AbstractC24490k m32192J0 = m32108t0.m32195I(new InterfaceC23484g() { // from class: dY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RidePhotoActivity.onCreate$lambda$3(Function1.this, obj);
            }
        }).m32192J0();
        Intrinsics.checkNotNullExpressionValue(m32192J0, "override fun onCreate(sa…oParkingRules()\n    }\n  }");
        Object m32150f = m32192J0.m32150f(AutoDispose.m45239a(m58963Z()));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14228g c14228g = new C14228g();
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: eY4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                RidePhotoActivity.onCreate$lambda$4(Function1.this, obj);
            }
        });
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo70212v(false);
            supportActionBar.mo70245B(false);
        }
        Z95 m59558A0 = m59558A0();
        LifecycleScopeProvider<EnumC7097RE> m58963Z = m58963Z();
        of = SetsKt__SetsJVMKt.setOf(RideState.Status.ENDED);
        Y95 mo71182a = m59558A0.mo71182a(m58963Z, this, of);
        this.f62428E = mo71182a;
        if (mo71182a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("riderModalPresenter");
            mo71182a = null;
        }
        mo71182a.mo75509a();
        if (mo58955y().m82623f8().m73665a().getRideConfig().getShowEndRideParkingRules()) {
            WireRideDetail wireRideDetail2 = this.f62429F;
            if (wireRideDetail2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rideDetail");
            } else {
                wireRideDetail = wireRideDetail2;
            }
            WireBird bird = wireRideDetail.getRide().getBird();
            if (bird == null || !WireBirdKt.isCruiserModel(bird)) {
                z = false;
            }
            if (z) {
                mo58957w().mo37089T3();
            }
        }
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        N95 n95 = this.f62428E;
        if (n95 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("riderModalPresenter");
            n95 = null;
        }
        n95.onDestroy();
        super.onDestroy();
    }

    @Override // co.bird.android.core.mvp.BaseActivity, co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            setResult(0);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // co.bird.android.core.mvp.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        C5821O5 c5821o5 = this.f62430G;
        if (c5821o5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5821o5 = null;
        }
        c5821o5.f25613b.m54655z();
        super.onPause();
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C5821O5 c5821o5 = this.f62430G;
        if (c5821o5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5821o5 = null;
        }
        c5821o5.f25613b.m54656y();
    }

    /* renamed from: q0 */
    public final AbstractC23442F<byte[]> m59548q0(Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        C5821O5 c5821o5 = this.f62430G;
        C5821O5 c5821o52 = null;
        if (c5821o5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c5821o5 = null;
        }
        c5821o5.f25615d.m49246u();
        C5821O5 c5821o53 = this.f62430G;
        if (c5821o53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c5821o52 = c5821o53;
        }
        AbstractC23442F<Bitmap> m54682A = c5821o52.f25613b.m54682A();
        final C14223b c14223b = C14223b.f62432g;
        AbstractC23442F m33157I = m54682A.m33157I(new InterfaceC23492o() { // from class: fY4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                byte[] m59547t0;
                m59547t0 = RidePhotoActivity.m59547t0(Function1.this, obj);
                return m59547t0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "binding.camera.takePictu…-> bitmap.toByteArray() }");
        return m33157I;
    }

    /* renamed from: w0 */
    public final InterfaceC12495bn m59546w0() {
        InterfaceC12495bn interfaceC12495bn = this.f62426C;
        if (interfaceC12495bn != null) {
            return interfaceC12495bn;
        }
        Intrinsics.throwUninitializedPropertyAccessException("areaManager");
        return null;
    }

    /* renamed from: x0 */
    public final InterfaceC37014Xc1 m59545x0() {
        InterfaceC37014Xc1 interfaceC37014Xc1 = this.f62427D;
        if (interfaceC37014Xc1 != null) {
            return interfaceC37014Xc1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("endRideManager");
        return null;
    }
}
