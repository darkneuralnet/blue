package co.bird.android.feature.p010ar.resolution;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import co.bird.android.buava.Optional;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.p010ar.resolution.InterfaceC14502b;
import co.bird.android.feature.p010ar.resolution.VpsResolveActivity;
import co.bird.android.feature.p010ar.view.VpsView;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.GravityVector;
import co.bird.android.model.wire.WireBird;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.p034ar.core.ArCoreApk;
import com.google.p034ar.core.Config;
import com.google.p034ar.core.Earth;
import com.google.p034ar.core.GeospatialPose;
import com.google.p034ar.core.Session;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C38500bM2;
@Metadata(m28433d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u000f\u001a\u00020\u0006H\u0014J\b\u0010\u0010\u001a\u00020\u0006H\u0014J\b\u0010\u0011\u001a\u00020\u0006H\u0014J\b\u0010\u0012\u001a\u00020\u0006H\u0014J\b\u0010\u0013\u001a\u00020\u0006H\u0014J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0004H\u0014J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\u0012\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u001d\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0016\u0010I\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010U\u001a\u00020R8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010TR\"\u0010[\u001a\u0010\u0012\f\u0012\n X*\u0004\u0018\u00010W0W0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\"\u0010^\u001a\u0010\u0012\f\u0012\n X*\u0004\u0018\u00010\\0\\0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010ZR\u001d\u0010c\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR.\u0010i\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020f X*\n\u0012\u0004\u0012\u00020f\u0018\u00010e0e0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001b\u0010m\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010`\u001a\u0004\bk\u0010lR\u0018\u0010q\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010u\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010w\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010tR'\u0010}\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020y0e0x8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bz\u0010`\u001a\u0004\b{\u0010|R0\u0010\u0082\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u007f0~0e0x8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010`\u001a\u0005\b\u0081\u0001\u0010|R+\u0010\u0086\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0083\u00010e0x8VX\u0096\u0084\u0002¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010`\u001a\u0005\b\u0085\u0001\u0010|R&\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00020W0\u0087\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\b\u0088\u0001\u0010`\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R&\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00020\\0\u0087\u00018VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\b\u008c\u0001\u0010`\u001a\u0006\b\u008d\u0001\u0010\u008a\u0001R9\u0010\u0092\u0001\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020f X*\n\u0012\u0004\u0012\u00020f\u0018\u00010e0e0d8VX\u0096\u0084\u0002¢\u0006\u000f\n\u0005\b\u008f\u0001\u0010`\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0097\u0001²\u0006\u0010\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u00018\nX\u008a\u0084\u0002"}, m28432d2 = {"Lco/bird/android/feature/ar/resolution/VpsResolveActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "LYv6;", "Landroid/hardware/SensorEventListener;", "Landroid/os/Bundle;", "savedInstanceState", "", "b0", "", "resultRequired", "j0", "LZv6;", TransferTable.COLUMN_STATE, "h0", "onCreate", "onStart", "onResume", "onPause", "onStop", "onDestroy", "outState", "onSaveInstanceState", "onLowMemory", "Landroid/hardware/SensorEvent;", "p0", "onSensorChanged", "Landroid/hardware/Sensor;", "", "p1", "onAccuracyChanged", "LWv6;", "j", "LWv6;", "Y", "()LWv6;", "setPresenter", "(LWv6;)V", "presenter", "Landroid/hardware/SensorManager;", "k", "Landroid/hardware/SensorManager;", "Z", "()Landroid/hardware/SensorManager;", "setSensorManager", "(Landroid/hardware/SensorManager;)V", "sensorManager", "LRh6;", "l", "LRh6;", "getUserStream", "()LRh6;", "setUserStream", "(LRh6;)V", "userStream", "LOh;", "m", "LOh;", "getAppBuildConfig", "()LOh;", "setAppBuildConfig", "(LOh;)V", "appBuildConfig", "Lgl;", "n", "Lgl;", "getAppPreference", "()Lgl;", "setAppPreference", "(Lgl;)V", "appPreference", "Lt6;", "o", "Lt6;", "binding", "Lco/bird/android/feature/ar/view/VpsView;", "p", "Lco/bird/android/feature/ar/view/VpsView;", "vpsView", "Lco/bird/android/model/wire/WireBird;", "q", "Lco/bird/android/model/wire/WireBird;", "bird", "", "r", "Ljava/lang/String;", "rideId", "Lio/reactivex/subjects/d;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "s", "Lio/reactivex/subjects/d;", "response", "Lco/bird/android/model/GravityVector;", "t", "gravityVectorSubject", "u", "Lkotlin/Lazy;", "X", "()Landroid/hardware/Sensor;", "gravitySensor", "Lio/reactivex/subjects/a;", "Lco/bird/android/buava/Optional;", "Lcom/google/ar/core/ArCoreApk$InstallStatus;", "v", "Lio/reactivex/subjects/a;", "installStatus", "w", "U", "()Z", "debugging", "LcD1;", "x", "LcD1;", "googleMap", "LfM2;", "y", "LfM2;", "arCoreLocationMarker", "z", "deviceLocationMarker", "LZ84;", "Lcom/google/ar/core/Earth;", "A", "r9", "()LZ84;", "earth", "", "LBx;", "B", "A6", "barcodeUpdates", "Lcom/google/ar/core/Session;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "C4", "session", "Lio/reactivex/Observable;", "D", "L8", "()Lio/reactivex/Observable;", "errorDialogResponse", "E", "E8", "sensorChanged", "F", "S", "()Lio/reactivex/subjects/a;", "arCoreInstallStatus", "<init>", "()V", "Lcom/google/android/gms/maps/model/LatLng;", "deviceLocation", "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVpsResolveActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VpsResolveActivity.kt\nco/bird/android/feature/ar/resolution/VpsResolveActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,306:1\n1#2:307\n199#3:308\n*S KotlinDebug\n*F\n+ 1 VpsResolveActivity.kt\nco/bird/android/feature/ar/resolution/VpsResolveActivity\n*L\n301#1:308\n*E\n"})
/* renamed from: co.bird.android.feature.ar.resolution.VpsResolveActivity */
/* loaded from: classes3.dex */
public final class VpsResolveActivity extends BaseActivityLite implements InterfaceC37424Yv6, SensorEventListener {

    /* renamed from: A */
    public final Lazy f63190A;

    /* renamed from: B */
    public final Lazy f63191B;

    /* renamed from: C */
    public final Lazy f63192C;

    /* renamed from: D */
    public final Lazy f63193D;

    /* renamed from: E */
    public final Lazy f63194E;

    /* renamed from: F */
    public final Lazy f63195F;

    /* renamed from: j */
    public C36956Wv6 f63196j;

    /* renamed from: k */
    public SensorManager f63197k;

    /* renamed from: l */
    public InterfaceC35660Rh6 f63198l;

    /* renamed from: m */
    public InterfaceC6097Oh f63199m;

    /* renamed from: n */
    public C22454gl f63200n;

    /* renamed from: o */
    public C28523t6 f63201o;

    /* renamed from: p */
    public VpsView f63202p;

    /* renamed from: q */
    public WireBird f63203q;

    /* renamed from: r */
    public String f63204r;

    /* renamed from: s */
    public final C24558d<DialogResponse> f63205s;

    /* renamed from: t */
    public final C24558d<GravityVector> f63206t;

    /* renamed from: u */
    public final Lazy f63207u;

    /* renamed from: v */
    public final C24552a<Optional<ArCoreApk.InstallStatus>> f63208v;

    /* renamed from: w */
    public final Lazy f63209w;

    /* renamed from: x */
    public C39011cD1 f63210x;

    /* renamed from: y */
    public C40889fM2 f63211y;

    /* renamed from: z */
    public C40889fM2 f63212z;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/subjects/a;", "Lco/bird/android/buava/Optional;", "Lcom/google/ar/core/ArCoreApk$InstallStatus;", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/subjects/a;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.resolution.VpsResolveActivity$a */
    /* loaded from: classes3.dex */
    public static final class C14487a extends Lambda implements Function0<C24552a<Optional<ArCoreApk.InstallStatus>>> {
        public C14487a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C24552a<Optional<ArCoreApk.InstallStatus>> invoke() {
            return VpsResolveActivity.this.f63208v;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "", "LBx;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.resolution.VpsResolveActivity$b */
    /* loaded from: classes3.dex */
    public static final class C14488b extends Lambda implements Function0<Z84<Optional<List<? extends C0774Bx>>>> {
        public C14488b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<Optional<List<? extends C0774Bx>>> invoke2() {
            VpsView vpsView = VpsResolveActivity.this.f63202p;
            if (vpsView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vpsView");
                vpsView = null;
            }
            return vpsView.m58852R0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.ar.resolution.VpsResolveActivity$c */
    /* loaded from: classes3.dex */
    public static final class C14489c extends Lambda implements Function0<Boolean> {
        public C14489c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            C36207Tq4 mo58955y = VpsResolveActivity.this.mo58955y();
            WireBird wireBird = VpsResolveActivity.this.f63203q;
            if (wireBird == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bird");
                wireBird = null;
            }
            return Boolean.valueOf(C36441Uq4.m80769c(mo58955y, wireBird).getEnableLocationDebugInfoOnMapScreen());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lcom/google/ar/core/Earth;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.resolution.VpsResolveActivity$d */
    /* loaded from: classes3.dex */
    public static final class C14490d extends Lambda implements Function0<Z84<Optional<Earth>>> {
        public C14490d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<Earth>> invoke() {
            VpsView vpsView = VpsResolveActivity.this.f63202p;
            if (vpsView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vpsView");
                vpsView = null;
            }
            return vpsView.m58850T0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.resolution.VpsResolveActivity$e */
    /* loaded from: classes3.dex */
    public static final class C14491e extends Lambda implements Function0<Observable<DialogResponse>> {
        public C14491e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<DialogResponse> invoke() {
            return VpsResolveActivity.this.f63205s.hide();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Landroid/hardware/Sensor;", "kotlin.jvm.PlatformType", "b", "()Landroid/hardware/Sensor;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.resolution.VpsResolveActivity$f */
    /* loaded from: classes3.dex */
    public static final class C14492f extends Lambda implements Function0<Sensor> {
        public C14492f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Sensor invoke() {
            return VpsResolveActivity.this.m58910Z().getDefaultSensor(9);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lcom/google/ar/core/Config;", "config", C17296a.f69688o, "(Lcom/google/ar/core/Config;)Lcom/google/ar/core/Config;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.resolution.VpsResolveActivity$g */
    /* loaded from: classes3.dex */
    public static final class C14493g extends Lambda implements Function1<Config, Config> {

        /* renamed from: g */
        public static final C14493g f63219g = new C14493g();

        public C14493g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Config invoke(Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            C41318g46.m40163a("Setting VPS AR Core session to geospatialMode enabled", new Object[0]);
            config.setGeospatialMode(Config.GeospatialMode.ENABLED);
            config.setFocusMode(Config.FocusMode.AUTO);
            config.setPlaneFindingMode(Config.PlaneFindingMode.HORIZONTAL_AND_VERTICAL);
            C41318g46.m40163a("Set VPS AR Core session to geospatialMode enabled", new Object[0]);
            return config;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lcom/google/ar/core/Config;", "config", C17296a.f69688o, "(Lcom/google/ar/core/Config;)Lcom/google/ar/core/Config;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.resolution.VpsResolveActivity$h */
    /* loaded from: classes3.dex */
    public static final class C14494h extends Lambda implements Function1<Config, Config> {

        /* renamed from: g */
        public static final C14494h f63220g = new C14494h();

        public C14494h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Config invoke(Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            C41318g46.m40163a("Setting VPS AR Core session to geospatialMode disabled", new Object[0]);
            config.setGeospatialMode(Config.GeospatialMode.DISABLED);
            config.setFocusMode(Config.FocusMode.AUTO);
            config.setPlaneFindingMode(Config.PlaneFindingMode.DISABLED);
            C41318g46.m40163a("Set VPS AR Core session to geospatialMode disabled", new Object[0]);
            return config;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lcom/google/android/gms/maps/model/LatLng;", "b", "()Lcom/google/android/gms/maps/model/LatLng;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.resolution.VpsResolveActivity$i */
    /* loaded from: classes3.dex */
    public static final class C14495i extends Lambda implements Function0<LatLng> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC37658Zv6 f63221g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14495i(InterfaceC37658Zv6 interfaceC37658Zv6) {
            super(0);
            this.f63221g = interfaceC37658Zv6;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final LatLng invoke() {
            Location m108932b = ((EU0) this.f63221g).m108932b();
            if (m108932b != null) {
                return C39339cm2.m60885d(m108932b);
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "Lco/bird/android/model/GravityVector;", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.resolution.VpsResolveActivity$j */
    /* loaded from: classes3.dex */
    public static final class C14496j extends Lambda implements Function0<Observable<GravityVector>> {
        public C14496j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<GravityVector> invoke() {
            return VpsResolveActivity.this.f63206t.hide();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lcom/google/ar/core/Session;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.resolution.VpsResolveActivity$k */
    /* loaded from: classes3.dex */
    public static final class C14497k extends Lambda implements Function0<Z84<Optional<Session>>> {
        public C14497k() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<Session>> invoke() {
            VpsView vpsView = VpsResolveActivity.this.f63202p;
            if (vpsView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vpsView");
                vpsView = null;
            }
            return vpsView.m58846X0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.resolution.VpsResolveActivity$l */
    /* loaded from: classes3.dex */
    public static final class C14498l extends Lambda implements Function1<DialogResponse, Unit> {
        public C14498l() {
            super(1);
        }

        /* renamed from: a */
        public final void m58894a(DialogResponse dialogResponse) {
            VpsResolveActivity.this.f63205s.onNext(dialogResponse);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m58894a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    public VpsResolveActivity() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        Lazy lazy4;
        Lazy lazy5;
        Lazy lazy6;
        Lazy lazy7;
        Lazy lazy8;
        C24558d<DialogResponse> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<DialogResponse>()");
        this.f63205s = m31902e;
        C24558d<GravityVector> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<GravityVector>()");
        this.f63206t = m31902e2;
        lazy = LazyKt__LazyJVMKt.lazy(new C14492f());
        this.f63207u = lazy;
        C24552a<Optional<ArCoreApk.InstallStatus>> m31921g = C24552a.m31921g(Optional.f63040c.m59034a());
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(Optional.a…CoreApk.InstallStatus>())");
        this.f63208v = m31921g;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C14489c());
        this.f63209w = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C14490d());
        this.f63190A = lazy3;
        lazy4 = LazyKt__LazyJVMKt.lazy(new C14488b());
        this.f63191B = lazy4;
        lazy5 = LazyKt__LazyJVMKt.lazy(new C14497k());
        this.f63192C = lazy5;
        lazy6 = LazyKt__LazyJVMKt.lazy(new C14491e());
        this.f63193D = lazy6;
        lazy7 = LazyKt__LazyJVMKt.lazy(new C14496j());
        this.f63194E = lazy7;
        lazy8 = LazyKt__LazyJVMKt.lazy(new C14487a());
        this.f63195F = lazy8;
    }

    /* renamed from: d0 */
    public static final void m58908d0(C38500bM2.EnumC12375a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String name = it.name();
        C41318g46.m40163a("initialized maps with renderer: " + name, new Object[0]);
    }

    /* renamed from: f0 */
    public static final void m58907f0(VpsResolveActivity this$0, C39011cD1 it) {
        C40889fM2 c40889fM2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f63210x = it;
        C40889fM2 c40889fM22 = null;
        if (it != null) {
            c40889fM2 = it.m61685c(new MarkerOptions().m50658L1("ARCore Location").m50643u1(new LatLng(0.0d, 0.0d)));
        } else {
            c40889fM2 = null;
        }
        this$0.f63211y = c40889fM2;
        C39011cD1 c39011cD1 = this$0.f63210x;
        if (c39011cD1 != null) {
            c40889fM22 = c39011cD1.m61685c(new MarkerOptions().m50658L1("Device Location").m50643u1(new LatLng(0.0d, 0.0d)).m50645s(0.5f));
        }
        this$0.f63212z = c40889fM22;
    }

    /* renamed from: i0 */
    public static final LatLng m58905i0(Lazy<LatLng> lazy) {
        return lazy.getValue();
    }

    /* renamed from: k0 */
    public static final void m58903k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC37424Yv6
    /* renamed from: A6 */
    public Z84<Optional<List<C0774Bx>>> mo58921A6() {
        return (Z84) this.f63191B.getValue();
    }

    @Override // p000.InterfaceC37424Yv6
    /* renamed from: C4 */
    public Z84<Optional<Session>> mo58920C4() {
        return (Z84) this.f63192C.getValue();
    }

    @Override // p000.InterfaceC37424Yv6
    /* renamed from: E8 */
    public Observable<GravityVector> mo58919E8() {
        Object value = this.f63194E.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-sensorChanged>(...)");
        return (Observable) value;
    }

    @Override // p000.InterfaceC37424Yv6
    /* renamed from: L8 */
    public Observable<DialogResponse> mo58918L8() {
        Object value = this.f63193D.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-errorDialogResponse>(...)");
        return (Observable) value;
    }

    @Override // p000.InterfaceC37424Yv6
    /* renamed from: S */
    public C24552a<Optional<ArCoreApk.InstallStatus>> getArCoreInstallStatus() {
        return (C24552a) this.f63195F.getValue();
    }

    /* renamed from: U */
    public final boolean m58913U() {
        return ((Boolean) this.f63209w.getValue()).booleanValue();
    }

    /* renamed from: X */
    public final Sensor m58912X() {
        return (Sensor) this.f63207u.getValue();
    }

    /* renamed from: Y */
    public final C36956Wv6 m58911Y() {
        C36956Wv6 c36956Wv6 = this.f63196j;
        if (c36956Wv6 != null) {
            return c36956Wv6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: Z */
    public final SensorManager m58910Z() {
        SensorManager sensorManager = this.f63197k;
        if (sensorManager != null) {
            return sensorManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sensorManager");
        return null;
    }

    /* renamed from: b0 */
    public final void m58909b0(Bundle bundle) {
        C28523t6 c28523t6 = this.f63201o;
        C28523t6 c28523t62 = null;
        if (c28523t6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c28523t6 = null;
        }
        MapView mapView = c28523t6.f109853f;
        Intrinsics.checkNotNullExpressionValue(mapView, "binding.mapView");
        C49520tu6.show$default(mapView, true, 0, 2, null);
        C38500bM2.m64631b(this, C38500bM2.EnumC12375a.LATEST, new InterfaceC36584Vg3() { // from class: tv6
            @Override // p000.InterfaceC36584Vg3
            /* renamed from: a */
            public final void mo11201a(C38500bM2.EnumC12375a enumC12375a) {
                VpsResolveActivity.m58908d0(enumC12375a);
            }
        });
        C28523t6 c28523t63 = this.f63201o;
        if (c28523t63 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c28523t63 = null;
        }
        c28523t63.f109853f.m50725b(bundle);
        C28523t6 c28523t64 = this.f63201o;
        if (c28523t64 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c28523t62 = c28523t64;
        }
        c28523t62.f109853f.m50726a(new InterfaceC36350Ug3() { // from class: uv6
            @Override // p000.InterfaceC36350Ug3
            public final void onMapReady(C39011cD1 c39011cD1) {
                VpsResolveActivity.m58907f0(VpsResolveActivity.this, c39011cD1);
            }
        });
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: h0 */
    public void render(InterfaceC37658Zv6 state) {
        Lazy lazy;
        C39011cD1 c39011cD1;
        U74 m61677k;
        VisibleRegion m81934b;
        LatLngBounds latLngBounds;
        boolean z;
        C40889fM2 c40889fM2;
        GeospatialPose cameraGeospatialPose;
        Intrinsics.checkNotNullParameter(state, "state");
        boolean z2 = true;
        C28523t6 c28523t6 = null;
        r4 = null;
        LatLng latLng = null;
        C28523t6 c28523t62 = null;
        C28523t6 c28523t63 = null;
        C28523t6 c28523t64 = null;
        C28523t6 c28523t65 = null;
        C28523t6 c28523t66 = null;
        if (state instanceof EU0) {
            C28523t6 c28523t67 = this.f63201o;
            if (c28523t67 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c28523t67 = null;
            }
            TextView textView = c28523t67.f109850c;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.debug");
            C49520tu6.m11233r(textView);
            C28523t6 c28523t68 = this.f63201o;
            if (c28523t68 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c28523t68 = null;
            }
            EU0 eu0 = (EU0) state;
            c28523t68.f109850c.setText(eu0.m108930d());
            Earth m108931c = eu0.m108931c();
            if (m108931c != null && (cameraGeospatialPose = m108931c.getCameraGeospatialPose()) != null) {
                latLng = new LatLng(cameraGeospatialPose.getLatitude(), cameraGeospatialPose.getLongitude());
            }
            lazy = LazyKt__LazyJVMKt.lazy(new C14495i(state));
            if (latLng != null) {
                C40889fM2 c40889fM22 = this.f63211y;
                if (c40889fM22 != null) {
                    c40889fM22.m41521m(latLng);
                }
                LatLng m58905i0 = m58905i0(lazy);
                if (m58905i0 != null && (c40889fM2 = this.f63212z) != null) {
                    c40889fM2.m41521m(m58905i0);
                }
                C40889fM2 c40889fM23 = this.f63211y;
                if (c40889fM23 != null) {
                    c40889fM23.m41516r(true);
                }
                C40889fM2 c40889fM24 = this.f63212z;
                if (c40889fM24 != null) {
                    if (m58905i0(lazy) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c40889fM24.m41516r(z);
                }
                C39011cD1 c39011cD12 = this.f63210x;
                if (c39011cD12 == null || (m61677k = c39011cD12.m61677k()) == null || (m81934b = m61677k.m81934b()) == null || (latLngBounds = m81934b.f71509f) == null || !latLngBounds.m50669u(latLng)) {
                    z2 = false;
                }
                if (!z2 && (c39011cD1 = this.f63210x) != null) {
                    c39011cD1.m61675m(C48149rc0.m15705e(latLng, 17.0f));
                    return;
                }
                return;
            }
            C40889fM2 c40889fM25 = this.f63211y;
            if (c40889fM25 != null) {
                c40889fM25.m41516r(false);
            }
            C40889fM2 c40889fM26 = this.f63212z;
            if (c40889fM26 != null) {
                c40889fM26.m41516r(false);
                return;
            }
            return;
        }
        if (!(state instanceof C38850bw6)) {
            z2 = state instanceof C30013x;
        }
        if (z2) {
            C41318g46.m40163a("Attempting to set VPS AR Core session to geospatialMode enabled", new Object[0]);
            VpsView vpsView = this.f63202p;
            if (vpsView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vpsView");
                vpsView = null;
            }
            vpsView.m58840d1(C14493g.f63219g);
            C28523t6 c28523t69 = this.f63201o;
            if (c28523t69 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c28523t69 = null;
            }
            ScanResolutionView scanResolutionView = c28523t69.f109852e;
            String string = getString(C45871nl4.vps_scan_directions);
            Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.vps_scan_directions)");
            scanResolutionView.m58922e(null, string, NA0.m94299e(this, C48193rg4.ic_scan_surround));
            C28523t6 c28523t610 = this.f63201o;
            if (c28523t610 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c28523t610 = null;
            }
            ImageView imageView = c28523t610.f109849b;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.buildingsOverlay");
            C49520tu6.m11233r(imageView);
            C28523t6 c28523t611 = this.f63201o;
            if (c28523t611 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c28523t62 = c28523t611;
            }
            ImageView imageView2 = c28523t62.f109856i;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.qrCodeOverlay");
            C49520tu6.m11239l(imageView2);
        } else if (state instanceof C46714pA5) {
            C41318g46.m40163a("Attempting to set VPS AR Core session to geospatialMode disabled", new Object[0]);
            VpsView vpsView2 = this.f63202p;
            if (vpsView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vpsView");
                vpsView2 = null;
            }
            vpsView2.m58840d1(C14494h.f63220g);
            C28523t6 c28523t612 = this.f63201o;
            if (c28523t612 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c28523t612 = null;
            }
            ScanResolutionView scanResolutionView2 = c28523t612.f109852e;
            String string2 = getString(C45871nl4.scan_qr_code_arcore_parking_title);
            String string3 = getString(C45871nl4.scan_qr_code_arcore_parking_description);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(L.string.scan_…core_parking_description)");
            scanResolutionView2.m58922e(string2, string3, NA0.m94299e(this, C48193rg4.ic_qr_code_alt));
            C28523t6 c28523t613 = this.f63201o;
            if (c28523t613 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c28523t613 = null;
            }
            ImageView imageView3 = c28523t613.f109856i;
            Intrinsics.checkNotNullExpressionValue(imageView3, "binding.qrCodeOverlay");
            C49520tu6.m11233r(imageView3);
            C28523t6 c28523t614 = this.f63201o;
            if (c28523t614 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c28523t63 = c28523t614;
            }
            ImageView imageView4 = c28523t63.f109849b;
            Intrinsics.checkNotNullExpressionValue(imageView4, "binding.buildingsOverlay");
            C49520tu6.m11239l(imageView4);
        } else if (state instanceof H32) {
            C28523t6 c28523t615 = this.f63201o;
            if (c28523t615 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c28523t64 = c28523t615;
            }
            ImageView imageView5 = c28523t64.f109851d;
            Intrinsics.checkNotNullExpressionValue(imageView5, "binding.inside");
            C49520tu6.m11233r(imageView5);
        } else if (state instanceof C43747kA3) {
            C28523t6 c28523t616 = this.f63201o;
            if (c28523t616 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c28523t65 = c28523t616;
            }
            ImageView imageView6 = c28523t65.f109854g;
            Intrinsics.checkNotNullExpressionValue(imageView6, "binding.outside");
            C49520tu6.m11233r(imageView6);
        } else if (state instanceof C46778pH6) {
            m58990F().topToast(C45871nl4.wrong_bird_dialog_title, EnumC40735f56.SHORT);
        } else if (state instanceof C38257aw6) {
            m58904j0(((C38257aw6) state).m65215b());
        } else if (state instanceof QC2) {
            C28523t6 c28523t617 = this.f63201o;
            if (c28523t617 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c28523t66 = c28523t617;
            }
            c28523t66.f109849b.setImageDrawable(NA0.m94299e(this, C48193rg4.ic_turn_up));
        } else if (state instanceof PC2) {
            C28523t6 c28523t618 = this.f63201o;
            if (c28523t618 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                c28523t6 = c28523t618;
            }
            c28523t6.f109849b.setImageDrawable(NA0.m94299e(this, C48193rg4.ic_turn_left_and_right));
        } else if (state instanceof C31880Bd6) {
            m58990F().warn(C45871nl4.scan_surroundings_unavailable_description);
        } else if (state instanceof C34128Kt4) {
            if (((C34128Kt4) state).m98201b()) {
                m58910Z().registerListener(this, m58912X(), 2, 0);
            } else {
                m58910Z().unregisterListener(this);
            }
        } else if (state instanceof RI4) {
            C24552a<Optional<ArCoreApk.InstallStatus>> arCoreInstallStatus = getArCoreInstallStatus();
            Optional.C14443a c14443a = Optional.f63040c;
            ArCoreApk.InstallStatus requestInstall = ArCoreApk.getInstance().requestInstall(this, ((RI4) state).m86971b());
            Intrinsics.checkNotNullExpressionValue(requestInstall, "getInstance().requestIns…(this, state.userRequest)");
            arCoreInstallStatus.onNext(c14443a.m59032c(requestInstall));
        }
    }

    /* renamed from: j0 */
    public final void m58904j0(boolean z) {
        if (!m58990F().dialogShown()) {
            AbstractC23442F<DialogResponse> birdDialog = m58990F().birdDialog(new UH3(z, null, 2, null), false, false);
            final C14498l c14498l = new C14498l();
            AbstractC23442F<DialogResponse> m33101w = birdDialog.m33101w(new InterfaceC23484g() { // from class: vv6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    VpsResolveActivity.m58903k0(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33101w, "private fun showCannotDe…   .subscribe()\n    }\n  }");
            Object m33135e = m33101w.m33135e(AutoDispose.m45239a(this));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            ((SingleSubscribeProxy) m33135e).subscribe();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        WireBird wireBird;
        String str;
        super.onCreate(bundle);
        WireBird wireBird2 = (WireBird) getIntent().getParcelableExtra("bird");
        if (wireBird2 == null) {
            return;
        }
        this.f63203q = wireBird2;
        String stringExtra = getIntent().getStringExtra("ride_id");
        if (stringExtra == null) {
            return;
        }
        this.f63204r = stringExtra;
        WireBird wireBird3 = this.f63203q;
        C28523t6 c28523t6 = null;
        if (wireBird3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird3 = null;
        }
        if (wireBird3.getStickerId() == null) {
            return;
        }
        InterfaceC14502b.InterfaceC14503a m58893a = C14499a.m58893a();
        InterfaceC44393lG2 m58989H = m58989H();
        DQ3 mo58956x = mo58956x();
        WireBird wireBird4 = this.f63203q;
        if (wireBird4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bird");
            wireBird = null;
        } else {
            wireBird = wireBird4;
        }
        String str2 = this.f63204r;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rideId");
            str = null;
        } else {
            str = str2;
        }
        m58893a.mo58889a(m58989H, this, mo58956x, wireBird, str).mo58890a(this);
        C28523t6 m13080c = C28523t6.m13080c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m13080c, "inflate(layoutInflater)");
        this.f63201o = m13080c;
        if (m13080c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m13080c = null;
        }
        setContentView(m13080c.getRoot());
        C28523t6 c28523t62 = this.f63201o;
        if (c28523t62 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c28523t6 = c28523t62;
        }
        VpsView vpsView = c28523t6.f109857j;
        Intrinsics.checkNotNullExpressionValue(vpsView, "binding.vpsView");
        this.f63202p = vpsView;
        if (m58913U()) {
            m58909b0(bundle);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (m58913U()) {
            C28523t6 c28523t6 = this.f63201o;
            if (c28523t6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c28523t6 = null;
            }
            c28523t6.f109853f.m50724c();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        if (m58913U()) {
            C28523t6 c28523t6 = this.f63201o;
            if (c28523t6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c28523t6 = null;
            }
            c28523t6.f109853f.m50723d();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (m58913U()) {
            C28523t6 c28523t6 = this.f63201o;
            if (c28523t6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c28523t6 = null;
            }
            c28523t6.f109853f.m50722e();
        }
        m58911Y().m77653s0();
        m58910Z().unregisterListener(this);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (m58913U()) {
            C28523t6 c28523t6 = this.f63201o;
            if (c28523t6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c28523t6 = null;
            }
            c28523t6.f109853f.m50721f();
        }
        m58911Y().consume(this);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (m58913U()) {
            C28523t6 c28523t6 = this.f63201o;
            if (c28523t6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c28523t6 = null;
            }
            c28523t6.f109853f.m50720g(outState);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
        r4 = kotlin.collections.ArraysKt___ArraysKt.getOrNull(r4, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
        r7 = kotlin.collections.ArraysKt___ArraysKt.getOrNull(r7, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
        r3 = kotlin.collections.ArraysKt___ArraysKt.getOrNull(r3, 0);
     */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f;
        float f2;
        Float orNull;
        Float orNull2;
        Float orNull3;
        C24558d<GravityVector> c24558d = this.f63206t;
        float f3 = 0.0f;
        if (sensorEvent != null && (r3 = sensorEvent.values) != null && orNull3 != null) {
            f = orNull3.floatValue();
        } else {
            f = 0.0f;
        }
        if (sensorEvent != null && (r4 = sensorEvent.values) != null && orNull2 != null) {
            f2 = orNull2.floatValue();
        } else {
            f2 = 0.0f;
        }
        if (sensorEvent != null && (r7 = sensorEvent.values) != null && orNull != null) {
            f3 = orNull.floatValue();
        }
        c24558d.onNext(new GravityVector(f, f2, f3));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (m58913U()) {
            C28523t6 c28523t6 = this.f63201o;
            if (c28523t6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c28523t6 = null;
            }
            c28523t6.f109853f.m50719h();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        if (m58913U()) {
            C28523t6 c28523t6 = this.f63201o;
            if (c28523t6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c28523t6 = null;
            }
            c28523t6.f109853f.m50718i();
        }
        super.onStop();
    }

    @Override // p000.InterfaceC37424Yv6
    /* renamed from: r9 */
    public Z84<Optional<Earth>> mo58902r9() {
        return (Z84) this.f63190A.getValue();
    }
}
