package co.bird.android.feature.p010ar.view;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.location.Location;
import android.media.Image;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.feature.p010ar.view.VpsView;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.p034ar.core.Config;
import com.google.p034ar.core.Earth;
import com.google.p034ar.core.HitResult;
import com.google.p034ar.core.Session;
import com.google.p034ar.core.VpsAvailability;
import com.google.p034ar.core.VpsAvailabilityFuture;
import com.google.p034ar.sceneform.ArCameraNode;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.github.sceneview.p052ar.ArSceneView;
import io.github.sceneview.p052ar.arcore.ArSession;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
import p000.Z84;
@Metadata(m28433d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 k2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001lBK\b\u0007\u0012\u0006\u0010_\u001a\u00020^\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010`\u0012\b\b\u0002\u0010b\u001a\u00020\u0004\u0012\b\b\u0002\u0010c\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010f\u001a\b\u0012\u0004\u0012\u00020e0d\u0012\b\b\u0002\u0010h\u001a\u00020g¢\u0006\u0004\bi\u0010jJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001a\u0010\u0013\u001a\u00020\b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010J$\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b0\u0010R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR&\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001eR \u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001eR\"\u0010/\u001a\u0010\u0012\f\u0012\n ,*\u0004\u0018\u00010+0+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R1\u00104\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001c ,*\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u001b008\u0006¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\b2\u00103R1\u00107\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020  ,*\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001b0\u001b008\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u00103R=\u00109\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0# ,*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#\u0018\u00010\u001b0\u001b008\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b8\u00103R1\u0010;\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020' ,*\n\u0012\u0004\u0012\u00020'\u0018\u00010\u001b0\u001b008\u0006¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b:\u00103R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010=R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b@\u0010BR\u0014\u0010F\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010ER$\u0010M\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010U\u001a\u0004\u0018\u00010N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR*\u0010[\u001a\u00020\r2\u0006\u0010V\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010W\u001a\u0004\bG\u0010X\"\u0004\bY\u0010ZR\"\u0010]\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010W\u001a\u0004\bO\u0010X\"\u0004\b\\\u0010Z¨\u0006m"}, m28432d2 = {"Lco/bird/android/feature/ar/view/VpsView;", "Lio/github/sceneview/ar/ArSceneView;", "Lym;", "Lxm;", "", "P0", "LLifecycleOwner;", "owner", "", "onCreate", "onResume", "onPause", "onDestroy", "", "hasWindowFocus", "onWindowFocusChanged", "Lkotlin/Function1;", "Lcom/google/ar/core/Config;", "modifier", "d1", "Landroid/location/Location;", "location", "Lcom/google/ar/core/VpsAvailability;", "callback", "Lcom/google/ar/core/VpsAvailabilityFuture;", "N0", "La94;", "Lco/bird/android/buava/Optional;", "Lcom/google/ar/core/Earth;", "I0", "La94;", "earthRelay", "Lcom/google/ar/core/Session;", "J0", "sessionRelay", "", "LBx;", "K0", "barcodeRelay", "Lp06;", "L0", "barcodeTextRelay", "Lma4;", "Lrm;", "kotlin.jvm.PlatformType", "M0", "Lma4;", "pendingAnalysisFrames", "LZ84;", "LZ84;", "T0", "()LZ84;", "earth", "O0", "X0", "session", "R0", "barcodeUpdates", "Q0", "barcodeTextUpdates", "Landroid/util/SparseIntArray;", "Landroid/util/SparseIntArray;", "orientations", "Landroid/hardware/camera2/CameraManager;", "S0", "Lkotlin/Lazy;", "()Landroid/hardware/camera2/CameraManager;", "cameraManager", "LPx;", "LPx;", "barcodeAnalyzer", "U0", "Lcom/google/ar/core/VpsAvailabilityFuture;", "getCheckVpsAvailableFuture", "()Lcom/google/ar/core/VpsAvailabilityFuture;", "setCheckVpsAvailableFuture", "(Lcom/google/ar/core/VpsAvailabilityFuture;)V", "checkVpsAvailableFuture", "Liw6;", "V0", "Liw6;", "W0", "()Liw6;", "setListener", "(Liw6;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "value", "Z", "()Z", "setEnableAnalysis", "(Z)V", "enableAnalysis", "setEnableOcrAnalysis", "enableOcrAnalysis", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "defStyleRes", "", "Lcom/google/ar/core/Session$Feature;", "sessionFeatures", "Lcom/google/ar/sceneform/ArCameraNode;", "cameraNode", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILjava/util/Set;Lcom/google/ar/sceneform/ArCameraNode;)V", "Y0", DateTokenConverter.CONVERTER_KEY, "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVpsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VpsView.kt\nco/bird/android/feature/ar/view/VpsView\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,288:1\n44#2:289\n180#3:290\n180#3:291\n180#3:292\n*S KotlinDebug\n*F\n+ 1 VpsView.kt\nco/bird/android/feature/ar/view/VpsView\n*L\n158#1:289\n160#1:290\n167#1:291\n175#1:292\n*E\n"})
/* renamed from: co.bird.android.feature.ar.view.VpsView */
/* loaded from: classes3.dex */
public final class VpsView extends ArSceneView {

    /* renamed from: Y0 */
    public static final C14507d f63244Y0 = new C14507d(null);

    /* renamed from: I0 */
    public final C37791a94<Optional<Earth>> f63245I0;

    /* renamed from: J0 */
    public final C37791a94<Optional<Session>> f63246J0;

    /* renamed from: K0 */
    public final C37791a94<Optional<List<C0774Bx>>> f63247K0;

    /* renamed from: L0 */
    public final C37791a94<Optional<C46615p06>> f63248L0;

    /* renamed from: M0 */
    public final C45168ma4<C27991rm> f63249M0;

    /* renamed from: N0 */
    public final Z84<Optional<Earth>> f63250N0;

    /* renamed from: O0 */
    public final Z84<Optional<Session>> f63251O0;

    /* renamed from: P0 */
    public final Z84<Optional<List<C0774Bx>>> f63252P0;

    /* renamed from: Q0 */
    public final Z84<Optional<C46615p06>> f63253Q0;

    /* renamed from: R0 */
    public final SparseIntArray f63254R0;

    /* renamed from: S0 */
    public final Lazy f63255S0;

    /* renamed from: T0 */
    public final C6587Px f63256T0;

    /* renamed from: U0 */
    public VpsAvailabilityFuture f63257U0;

    /* renamed from: V0 */
    public InterfaceC43018iw6 f63258V0;

    /* renamed from: W0 */
    public boolean f63259W0;

    /* renamed from: X0 */
    public boolean f63260X0;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/github/sceneview/ar/arcore/ArSession;", "session", "", C17296a.f69688o, "(Lio/github/sceneview/ar/arcore/ArSession;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.view.VpsView$a */
    /* loaded from: classes3.dex */
    public static final class C14504a extends Lambda implements Function1<ArSession, Unit> {
        public C14504a() {
            super(1);
        }

        /* renamed from: a */
        public final void m58839a(ArSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
            VpsView.this.f63246J0.accept(Optional.f63040c.m59032c(session));
            InterfaceC43018iw6 m58847W0 = VpsView.this.m58847W0();
            if (m58847W0 != null) {
                m58847W0.mo31586m(session);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ArSession arSession) {
            m58839a(arSession);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", C17296a.f69688o, "(Ljava/lang/Exception;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.view.VpsView$b */
    /* loaded from: classes3.dex */
    public static final class C14505b extends Lambda implements Function1<Exception, Unit> {
        public C14505b() {
            super(1);
        }

        /* renamed from: a */
        public final void m58838a(Exception exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            InterfaceC43018iw6 m58847W0 = VpsView.this.m58847W0();
            if (m58847W0 != null) {
                m58847W0.mo31591a(exception);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
            m58838a(exc);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/github/sceneview/ar/arcore/ArSession;", "session", "", C17296a.f69688o, "(Lio/github/sceneview/ar/arcore/ArSession;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.view.VpsView$c */
    /* loaded from: classes3.dex */
    public static final class C14506c extends Lambda implements Function1<ArSession, Unit> {
        public C14506c() {
            super(1);
        }

        /* renamed from: a */
        public final void m58837a(ArSession session) {
            Intrinsics.checkNotNullParameter(session, "session");
            InterfaceC43018iw6 m58847W0 = VpsView.this.m58847W0();
            if (m58847W0 != null) {
                m58847W0.mo31589c(session);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ArSession arSession) {
            m58837a(arSession);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/feature/ar/view/VpsView$d;", "", "", "ANALYSIS_INTERVAL_MS", "J", "<init>", "()V", "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.view.VpsView$d */
    /* loaded from: classes3.dex */
    public static final class C14507d {
        public /* synthetic */ C14507d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14507d() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroid/hardware/camera2/CameraManager;", "b", "()Landroid/hardware/camera2/CameraManager;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.view.VpsView$e */
    /* loaded from: classes3.dex */
    public static final class C14508e extends Lambda implements Function0<CameraManager> {

        /* renamed from: g */
        public final /* synthetic */ Context f63264g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14508e(Context context) {
            super(0);
            this.f63264g = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final CameraManager invoke() {
            Object systemService = this.f63264g.getSystemService("camera");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
            return (CameraManager) systemService;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/github/sceneview/ar/arcore/ArSession;", "session", "Lcom/google/ar/core/Config;", "config", "", C17296a.f69688o, "(Lio/github/sceneview/ar/arcore/ArSession;Lcom/google/ar/core/Config;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.view.VpsView$f */
    /* loaded from: classes3.dex */
    public static final class C14509f extends Lambda implements Function2<ArSession, Config, Unit> {
        public C14509f() {
            super(2);
        }

        /* renamed from: a */
        public final void m58835a(ArSession session, Config config) {
            Intrinsics.checkNotNullParameter(session, "session");
            Intrinsics.checkNotNullParameter(config, "config");
            VpsView.this.f63246J0.accept(Optional.f63040c.m59032c(session));
            InterfaceC43018iw6 m58847W0 = VpsView.this.m58847W0();
            if (m58847W0 != null) {
                m58847W0.mo31587i(session, config);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(ArSession arSession, Config config) {
            m58835a(arSession, config);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lrm;", "arFrame", "", C17296a.f69688o, "(Lrm;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.view.VpsView$g */
    /* loaded from: classes3.dex */
    public static final class C14510g extends Lambda implements Function1<C27991rm, Unit> {
        public C14510g() {
            super(1);
        }

        /* renamed from: a */
        public final void m58834a(C27991rm arFrame) {
            Intrinsics.checkNotNullParameter(arFrame, "arFrame");
            if (arFrame.m15446d().getConfig().getGeospatialMode() == Config.GeospatialMode.ENABLED) {
                VpsView.this.f63245I0.accept(Optional.f63040c.m59033b(arFrame.m15446d().getEarth()));
            } else {
                VpsView.this.f63245I0.accept(Optional.f63040c.m59034a());
            }
            if (VpsView.this.m58849U0()) {
                VpsView.this.f63249M0.accept(arFrame);
            }
            InterfaceC43018iw6 m58847W0 = VpsView.this.m58847W0();
            if (m58847W0 != null) {
                m58847W0.mo31585r(arFrame);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C27991rm c27991rm) {
            m58834a(c27991rm);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lcom/google/ar/core/HitResult;", "hitResult", "Landroid/view/MotionEvent;", "motionEvent", "", C17296a.f69688o, "(Lcom/google/ar/core/HitResult;Landroid/view/MotionEvent;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.view.VpsView$h */
    /* loaded from: classes3.dex */
    public static final class C14511h extends Lambda implements Function2<HitResult, MotionEvent, Unit> {
        public C14511h() {
            super(2);
        }

        /* renamed from: a */
        public final void m58833a(HitResult hitResult, MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(hitResult, "hitResult");
            Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
            InterfaceC43018iw6 m58847W0 = VpsView.this.m58847W0();
            if (m58847W0 != null) {
                m58847W0.mo31590b(hitResult, motionEvent);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(HitResult hitResult, MotionEvent motionEvent) {
            m58833a(hitResult, motionEvent);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LPy1;", "frameTime", "", C17296a.f69688o, "(LPy1;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.view.VpsView$i */
    /* loaded from: classes3.dex */
    public static final class C14512i extends Lambda implements Function1<C35340Py1, Unit> {
        public C14512i() {
            super(1);
        }

        /* renamed from: a */
        public final void m58832a(C35340Py1 frameTime) {
            Intrinsics.checkNotNullParameter(frameTime, "frameTime");
            InterfaceC43018iw6 m58847W0 = VpsView.this.m58847W0();
            if (m58847W0 != null) {
                m58847W0.mo31588g(frameTime);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C35340Py1 c35340Py1) {
            m58832a(c35340Py1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "LBx;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.view.VpsView$j */
    /* loaded from: classes3.dex */
    public static final class C14513j extends Lambda implements Function1<Optional<List<? extends C0774Bx>>, Unit> {
        public C14513j() {
            super(1);
        }

        /* renamed from: a */
        public final void m58831a(Optional<List<C0774Bx>> it) {
            C37791a94 c37791a94 = VpsView.this.f63247K0;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c37791a94.accept(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<List<? extends C0774Bx>> optional) {
            m58831a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.ar.view.VpsView$k */
    /* loaded from: classes3.dex */
    public static final class C14514k extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C14514k f63270g = new C14514k();

        public C14514k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error in barcode analyzer stream", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lp06;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.view.VpsView$l */
    /* loaded from: classes3.dex */
    public static final class C14515l extends Lambda implements Function1<Optional<C46615p06>, Unit> {
        public C14515l() {
            super(1);
        }

        /* renamed from: a */
        public final void m58830a(Optional<C46615p06> it) {
            C37791a94 c37791a94 = VpsView.this.f63248L0;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c37791a94.accept(it);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<C46615p06> optional) {
            m58830a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.ar.view.VpsView$m */
    /* loaded from: classes3.dex */
    public static final class C14516m extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C14516m f63272g = new C14516m();

        public C14516m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error in text analyzer stream", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lrm;", "kotlin.jvm.PlatformType", "arFrame", "", C17296a.f69688o, "(Lrm;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.view.VpsView$n */
    /* loaded from: classes3.dex */
    public static final class C14517n extends Lambda implements Function1<C27991rm, Unit> {
        public C14517n() {
            super(1);
        }

        /* renamed from: a */
        public final void m58829a(C27991rm c27991rm) {
            try {
                Image acquireCameraImage = c27991rm.m15447c().acquireCameraImage();
                Intrinsics.checkNotNullExpressionValue(acquireCameraImage, "arFrame.frame.acquireCameraImage()");
                VpsView.this.f63256T0.m89267r(acquireCameraImage, VpsView.this.m58854P0(), VpsView.this.m58848V0());
            } catch (Exception e) {
                C41318g46.m40161c(e, "Exception while updating frame in vpsview: ", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C27991rm c27991rm) {
            m58829a(c27991rm);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lio/github/sceneview/ar/arcore/ArSession;", "arSession", "Lcom/google/ar/core/Config;", "config", "", C17296a.f69688o, "(Lio/github/sceneview/ar/arcore/ArSession;Lcom/google/ar/core/Config;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.ar.view.VpsView$o */
    /* loaded from: classes3.dex */
    public static final class C14518o extends Lambda implements Function2<ArSession, Config, Unit> {

        /* renamed from: g */
        public final /* synthetic */ Function1<Config, Config> f63274g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C14518o(Function1<? super Config, ? extends Config> function1) {
            super(2);
            this.f63274g = function1;
        }

        /* renamed from: a */
        public final void m58828a(ArSession arSession, Config config) {
            Intrinsics.checkNotNullParameter(arSession, "arSession");
            Intrinsics.checkNotNullParameter(config, "config");
            this.f63274g.invoke(config);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(ArSession arSession, Config config) {
            m58828a(arSession, config);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VpsView(Context context) {
        this(context, null, 0, 0, null, null, 62, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: O0 */
    public static final void m58855O0(Function1 tmp0, VpsAvailability vpsAvailability) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(vpsAvailability);
    }

    /* renamed from: Y0 */
    public static final void m58845Y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z0 */
    public static final void m58844Z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a1 */
    public static final void m58843a1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b1 */
    public static final void m58842b1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c1 */
    public static final void m58841c1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N0 */
    public final VpsAvailabilityFuture m58856N0(Location location, final Function1<? super VpsAvailability, Unit> callback) {
        VpsAvailabilityFuture vpsAvailabilityFuture;
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(callback, "callback");
        VpsAvailabilityFuture vpsAvailabilityFuture2 = this.f63257U0;
        if (vpsAvailabilityFuture2 != null) {
            vpsAvailabilityFuture2.cancel();
        }
        ArSession m33394s0 = m33394s0();
        if (m33394s0 != null) {
            vpsAvailabilityFuture = m33394s0.checkVpsAvailabilityAsync(location.getLatitude(), location.getLongitude(), new Consumer() { // from class: hw6
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    VpsView.m58855O0(Function1.this, (VpsAvailability) obj);
                }
            });
        } else {
            vpsAvailabilityFuture = null;
        }
        this.f63257U0 = vpsAvailabilityFuture;
        return vpsAvailabilityFuture;
    }

    /* renamed from: P0 */
    public final int m58854P0() {
        int i;
        Display defaultDisplay;
        WindowManager windowManager = m33472N().getWindowManager();
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            i = defaultDisplay.getRotation();
        } else {
            i = 0;
        }
        int i2 = this.f63254R0.get(i);
        Object obj = m58851S0().getCameraCharacteristics(m58851S0().getCameraIdList()[0]).get(CameraCharacteristics.SENSOR_ORIENTATION);
        Intrinsics.checkNotNull(obj);
        return ((((Number) obj).intValue() - i2) + 360) % 360;
    }

    /* renamed from: Q0 */
    public final Z84<Optional<C46615p06>> m58853Q0() {
        return this.f63253Q0;
    }

    /* renamed from: R0 */
    public final Z84<Optional<List<C0774Bx>>> m58852R0() {
        return this.f63252P0;
    }

    /* renamed from: S0 */
    public final CameraManager m58851S0() {
        return (CameraManager) this.f63255S0.getValue();
    }

    /* renamed from: T0 */
    public final Z84<Optional<Earth>> m58850T0() {
        return this.f63250N0;
    }

    /* renamed from: U0 */
    public final boolean m58849U0() {
        return this.f63259W0;
    }

    /* renamed from: V0 */
    public final boolean m58848V0() {
        return this.f63260X0;
    }

    /* renamed from: W0 */
    public final InterfaceC43018iw6 m58847W0() {
        return this.f63258V0;
    }

    /* renamed from: X0 */
    public final Z84<Optional<Session>> m58846X0() {
        return this.f63251O0;
    }

    /* renamed from: d1 */
    public final void m58840d1(Function1<? super Config, ? extends Config> modifier) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        try {
            m33397p0(new C14518o(modifier));
        } catch (Throwable th) {
            C41318g46.m40161c(th, "Exception ignored while updating session configuration in vps view. Config updated ignored. ", new Object[0]);
        }
    }

    @Override // io.github.sceneview.SceneView, p000.VX0
    public void onCreate(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        m33387z0().m23599f(false);
        setFocusMode(Config.FocusMode.AUTO);
        setGeospatialEnabled(true);
        setOnArSessionConfigChanged(new C14509f());
        setOnArFrame(new C14510g());
        setOnTapAr(new C14511h());
        setOnFrame(new C14512i());
    }

    @Override // p000.VX0
    public void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
    }

    @Override // io.github.sceneview.SceneView, p000.VX0
    public void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onPause(owner);
    }

    @Override // io.github.sceneview.SceneView, p000.VX0
    public void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onResume(owner);
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(this);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as = this.f63256T0.m89285G().m33094as(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14513j c14513j = new C14513j();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: cw6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                VpsView.m58845Y0(Function1.this, obj);
            }
        };
        final C14514k c14514k = C14514k.f63270g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: dw6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                VpsView.m58844Z0(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f63256T0.m89283I().m33094as(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14515l c14515l = new C14515l();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: ew6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                VpsView.m58843a1(Function1.this, obj);
            }
        };
        final C14516m c14516m = C14516m.f63272g;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: fw6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                VpsView.m58842b1(Function1.this, obj);
            }
        });
        Observable<C27991rm> throttleFirst = this.f63249M0.throttleFirst(200L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(throttleFirst, "pendingAnalysisFrames\n  …S, TimeUnit.MILLISECONDS)");
        Object m33094as3 = throttleFirst.m33094as(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14517n c14517n = new C14517n();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: gw6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                VpsView.m58841c1(Function1.this, obj);
            }
        });
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public final void setCheckVpsAvailableFuture(VpsAvailabilityFuture vpsAvailabilityFuture) {
        this.f63257U0 = vpsAvailabilityFuture;
    }

    public final void setEnableAnalysis(boolean z) {
        if (this.f63259W0 && !z) {
            this.f63247K0.m71836j();
            this.f63248L0.m71836j();
        }
        this.f63259W0 = z;
    }

    public final void setEnableOcrAnalysis(boolean z) {
        this.f63260X0 = z;
    }

    public final void setListener(InterfaceC43018iw6 interfaceC43018iw6) {
        this.f63258V0 = interfaceC43018iw6;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VpsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, null, 60, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VpsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, null, null, 56, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ VpsView(Context context, AttributeSet attributeSet, int i, int i2, Set set, ArCameraNode arCameraNode, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? SetsKt__SetsKt.emptySet() : set, (i3 & 32) != 0 ? new ArCameraNode() : arCameraNode);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VpsView(Context context, AttributeSet attributeSet, int i, int i2, Set<? extends Session.Feature> sessionFeatures, ArCameraNode cameraNode) {
        super(context, attributeSet, i, i2, sessionFeatures, cameraNode);
        Lazy lazy;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionFeatures, "sessionFeatures");
        Intrinsics.checkNotNullParameter(cameraNode, "cameraNode");
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        Optional.C14443a c14443a = Optional.f63040c;
        C37791a94<Optional<Earth>> create$default = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f63245I0 = create$default;
        C37791a94<Optional<Session>> create$default2 = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f63246J0 = create$default2;
        C37791a94<Optional<List<C0774Bx>>> create$default3 = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f63247K0 = create$default3;
        C37791a94<Optional<C46615p06>> create$default4 = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f63248L0 = create$default4;
        C45168ma4<C27991rm> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<ArFrame>()");
        this.f63249M0 = m25409g;
        Z84.C10119a c10119a = Z84.f47888d;
        this.f63250N0 = c10119a.m73663b(create$default);
        this.f63251O0 = c10119a.m73663b(create$default2);
        this.f63252P0 = c10119a.m73663b(create$default3);
        this.f63253Q0 = c10119a.m73663b(create$default4);
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.append(0, 0);
        sparseIntArray.append(1, 90);
        sparseIntArray.append(2, 180);
        sparseIntArray.append(3, 270);
        this.f63254R0 = sparseIntArray;
        lazy = LazyKt__LazyJVMKt.lazy(new C14508e(context));
        this.f63255S0 = lazy;
        this.f63256T0 = new C6587Px(256);
        this.f63259W0 = true;
        setOnArSessionCreated(new C14504a());
        setOnArSessionFailed(new C14505b());
        setOnArSessionResumed(new C14506c());
    }
}
