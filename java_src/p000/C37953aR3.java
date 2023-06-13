package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.PermissionStatus;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.wire.configs.OperatorPermissionsConfig;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.location.places.Place;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC49820uQ3;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B_\b\u0007\u0012\u0006\u0010>\u001a\u00020\u0002\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u000e\b\u0001\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050#\u0012\u000e\b\u0001\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050#¢\u0006\u0004\b?\u0010@J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0011\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0096\u0001J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010*\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010)R\u0014\u0010,\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0014\u0010.\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010)R\u0016\u00102\u001a\u0004\u0018\u00010/8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u0010)R\u0014\u00106\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u0010)R\u0014\u00108\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u0010)R\u0014\u00109\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010)R\u001a\u0010=\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010)¨\u0006A"}, m28432d2 = {"LaR3;", "LGQ3;", "LuQ3;", "Lco/bird/android/model/PermissionStatus;", "status", "", "enabled", "", "V", "Lco/bird/android/model/constant/Permission;", "permission", "j", "X", "onStart", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", C17296a.f69688o, "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LeR3;", "b", "LeR3;", "ui", "LTq4;", "c", "LTq4;", "config", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "LDQ3;", "e", "LDQ3;", "permissionManager", "Lio/reactivex/Observable;", "f", "Lio/reactivex/Observable;", "bluetoothEnableChangeObservable", "g", "locationEnableChangeObservable", "()Z", "accessWifiStatePermissionGranted", "l", "bluetoothEnabled", "m", "cameraPermissionGranted", "LuQ3$a;", "o", "()LuQ3$a;", "dataSaverState", "n", "fineLocationPermissionGranted", "k", "hasCamera", "h", "locationEnabled", "notificationsEnabled", "U", "getHasRequiredPermissions$annotations", "()V", "hasRequiredPermissions", "permissionDelegate", "<init>", "(LuQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LeR3;LTq4;Le13;LDQ3;Lio/reactivex/Observable;Lio/reactivex/Observable;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPermissionRequiredPresenterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionRequiredPresenterImpl.kt\nco/bird/android/app/feature/operator/permission/presenter/PermissionRequiredPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,128:1\n180#2:129\n180#2:130\n180#2:131\n180#2:132\n180#2:133\n180#2:134\n180#2:135\n180#2:136\n180#2:137\n180#2:138\n199#2:139\n*S KotlinDebug\n*F\n+ 1 PermissionRequiredPresenterImpl.kt\nco/bird/android/app/feature/operator/permission/presenter/PermissionRequiredPresenterImpl\n*L\n37#1:129\n43#1:130\n47#1:131\n52#1:132\n56#1:133\n61#1:134\n65#1:135\n71#1:136\n75#1:137\n81#1:138\n89#1:139\n*E\n"})
/* renamed from: aR3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37953aR3 implements GQ3, InterfaceC49820uQ3 {

    /* renamed from: a */
    public final LifecycleScopeProvider<EnumC7097RE> f50457a;

    /* renamed from: b */
    public final InterfaceC40342eR3 f50458b;

    /* renamed from: c */
    public final C36207Tq4 f50459c;

    /* renamed from: d */
    public final InterfaceC40099e13 f50460d;

    /* renamed from: e */
    public final DQ3 f50461e;

    /* renamed from: f */
    public final Observable<Boolean> f50462f;

    /* renamed from: g */
    public final Observable<Boolean> f50463g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC49820uQ3 f50464h;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aR3$a */
    /* loaded from: classes2.dex */
    public static final class C10693a extends Lambda implements Function1<Unit, Unit> {
        public C10693a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C37953aR3.this.f50460d.mo36945s4();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aR3$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C10694b extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C10694b(Object obj) {
            super(1, obj, InterfaceC40342eR3.class, "showCameraPermissionStatus", "showCameraPermissionStatus(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((InterfaceC40342eR3) this.receiver).mo41374l(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aR3$c */
    /* loaded from: classes2.dex */
    public static final class C10695c extends Lambda implements Function1<Unit, Boolean> {
        public C10695c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!C37953aR3.this.mo10333m());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LFQ3;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aR3$d */
    /* loaded from: classes2.dex */
    public static final class C10696d extends Lambda implements Function1<Unit, InterfaceC23447K<? extends FQ3>> {
        public C10696d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C37953aR3.this.f50461e.m110485l(Permission.CAMERA);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aR3$e */
    /* loaded from: classes2.dex */
    public static final class C10697e extends Lambda implements Function1<FQ3, Unit> {
        public C10697e() {
            super(1);
        }

        /* renamed from: a */
        public final void m71365a(FQ3 fq3) {
            if (fq3.m107154a()) {
                C37953aR3.this.m71384X();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m71365a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aR3$f */
    /* loaded from: classes2.dex */
    public static final class C10698f extends Lambda implements Function1<Boolean, Unit> {
        public C10698f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C37953aR3.this.m71384X();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aR3$g */
    /* loaded from: classes2.dex */
    public static final class C10699g extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends Boolean>> {
        public C10699g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Boolean> invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C37953aR3.this.f50459c.m82625f6();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aR3$h */
    /* loaded from: classes2.dex */
    public static final class C10700h extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C10700h f50471g = new C10700h();

        public C10700h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aR3$i */
    /* loaded from: classes2.dex */
    public static final class C10701i extends Lambda implements Function1<Boolean, Unit> {
        public C10701i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C37953aR3.this.m71384X();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aR3$j */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C10702j extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C10702j(Object obj) {
            super(1, obj, InterfaceC40342eR3.class, "showLocationPermissionStatus", "showLocationPermissionStatus(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((InterfaceC40342eR3) this.receiver).mo41373m(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aR3$k */
    /* loaded from: classes2.dex */
    public static final class C10703k extends Lambda implements Function1<Unit, InterfaceC23434B<? extends Boolean>> {
        public C10703k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Boolean> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C37953aR3.this.f50463g;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "enabled", "Lkotlin/Pair;", "Lco/bird/android/model/PermissionStatus;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aR3$l */
    /* loaded from: classes2.dex */
    public static final class C10704l extends Lambda implements Function1<Boolean, Pair<? extends PermissionStatus, ? extends Boolean>> {
        public C10704l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<PermissionStatus, Boolean> invoke(Boolean enabled) {
            Intrinsics.checkNotNullParameter(enabled, "enabled");
            return TuplesKt.m28425to(C37953aR3.this.f50461e.m110496a(Permission.ACCESS_FINE_LOCATION), enabled);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/PermissionStatus;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aR3$m */
    /* loaded from: classes2.dex */
    public static final class C10705m extends Lambda implements Function1<Pair<? extends PermissionStatus, ? extends Boolean>, Unit> {
        public C10705m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends PermissionStatus, ? extends Boolean> pair) {
            invoke2((Pair<? extends PermissionStatus, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends PermissionStatus, Boolean> pair) {
            Boolean enabled = pair.component2();
            C37953aR3 c37953aR3 = C37953aR3.this;
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            c37953aR3.m71386V(pair.component1(), enabled.booleanValue());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aR3$n */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C10706n extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C10706n(Object obj) {
            super(1, obj, InterfaceC40342eR3.class, "showBluetoothPermissionStatus", "showBluetoothPermissionStatus(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((InterfaceC40342eR3) this.receiver).mo41377i(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aR3$o */
    /* loaded from: classes2.dex */
    public static final class C10707o extends Lambda implements Function1<Unit, InterfaceC23434B<? extends Boolean>> {
        public C10707o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Boolean> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C37953aR3.this.f50462f;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aR3$p */
    /* loaded from: classes2.dex */
    public static final class C10708p extends Lambda implements Function1<Boolean, Unit> {
        public C10708p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            if (bool.booleanValue()) {
                return;
            }
            C37953aR3.this.f50460d.mo37193B4(Place.TYPE_ROOM);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: aR3$q */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C10709q extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C10709q(Object obj) {
            super(1, obj, InterfaceC40342eR3.class, "showNotificationsPermissionStatus", "showNotificationsPermissionStatus(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((InterfaceC40342eR3) this.receiver).mo41380f(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aR3$r */
    /* loaded from: classes2.dex */
    public static final class C10710r extends Lambda implements Function1<Unit, Boolean> {
        public C10710r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!C37953aR3.this.mo10339d());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aR3$s */
    /* loaded from: classes2.dex */
    public static final class C10711s extends Lambda implements Function1<FQ3, Unit> {

        /* renamed from: g */
        public final /* synthetic */ boolean f50479g;

        /* renamed from: h */
        public final /* synthetic */ C37953aR3 f50480h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10711s(boolean z, C37953aR3 c37953aR3) {
            super(1);
            this.f50479g = z;
            this.f50480h = c37953aR3;
        }

        /* renamed from: a */
        public final void m71362a(FQ3 fq3) {
            if (fq3.m107154a() && !this.f50479g) {
                this.f50480h.f50460d.mo37192C();
            } else if (fq3.m107154a() && this.f50479g) {
                this.f50480h.m71384X();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m71362a(fq3);
            return Unit.INSTANCE;
        }
    }

    public C37953aR3(InterfaceC49820uQ3 permissionDelegate, LifecycleScopeProvider<EnumC7097RE> scopeProvider, InterfaceC40342eR3 ui, C36207Tq4 config, InterfaceC40099e13 navigator, DQ3 permissionManager, Observable<Boolean> bluetoothEnableChangeObservable, Observable<Boolean> locationEnableChangeObservable) {
        Intrinsics.checkNotNullParameter(permissionDelegate, "permissionDelegate");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(bluetoothEnableChangeObservable, "bluetoothEnableChangeObservable");
        Intrinsics.checkNotNullParameter(locationEnableChangeObservable, "locationEnableChangeObservable");
        this.f50457a = scopeProvider;
        this.f50458b = ui;
        this.f50459c = config;
        this.f50460d = navigator;
        this.f50461e = permissionManager;
        this.f50462f = bluetoothEnableChangeObservable;
        this.f50463g = locationEnableChangeObservable;
        this.f50464h = permissionDelegate;
        Object m33094as = config.m82625f6().m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10702j c10702j = new C10702j(ui);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: HQ3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37953aR3.m71405C(Function1.this, obj);
            }
        });
        Observable<Unit> mo41381e = ui.mo41381e();
        final C10703k c10703k = new C10703k();
        Observable<R> flatMap = mo41381e.flatMap(new InterfaceC23492o() { // from class: ZQ3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m71404D;
                m71404D = C37953aR3.m71404D(Function1.this, obj);
                return m71404D;
            }
        });
        final C10704l c10704l = new C10704l();
        Observable map = flatMap.map(new InterfaceC23492o() { // from class: IQ3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Pair m71395M;
                m71395M = C37953aR3.m71395M(Function1.this, obj);
                return m71395M;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "ui.enableLocationClicks\n…NE_LOCATION) to enabled }");
        Object m33094as2 = map.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10705m c10705m = new C10705m();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: JQ3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37953aR3.m71394N(Function1.this, obj);
            }
        });
        Object m33094as3 = config.m82669b6().m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10706n c10706n = new C10706n(ui);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: KQ3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37953aR3.m71393O(Function1.this, obj);
            }
        });
        Observable<Unit> mo41384b = ui.mo41384b();
        final C10707o c10707o = new C10707o();
        Observable<R> flatMap2 = mo41384b.flatMap(new InterfaceC23492o() { // from class: LQ3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m71392P;
                m71392P = C37953aR3.m71392P(Function1.this, obj);
                return m71392P;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap2, "ui.enableBluetoothClicks…hEnableChangeObservable }");
        Object m33094as4 = flatMap2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10708p c10708p = new C10708p();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: MQ3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37953aR3.m71391Q(Function1.this, obj);
            }
        });
        Object m33094as5 = config.m82603h6().m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10709q c10709q = new C10709q(ui);
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: NQ3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37953aR3.m71390R(Function1.this, obj);
            }
        });
        Observable<Unit> mo41379g = ui.mo41379g();
        final C10710r c10710r = new C10710r();
        Observable<Unit> filter = mo41379g.filter(new InterfaceC23494q() { // from class: OQ3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m71389S;
                m71389S = C37953aR3.m71389S(Function1.this, obj);
                return m71389S;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "ui.enableNotificationsCl…{ !notificationsEnabled }");
        Object m33094as6 = filter.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10693a c10693a = new C10693a();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: PQ3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37953aR3.m71388T(Function1.this, obj);
            }
        });
        Object m33094as7 = config.m82647d6().m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10694b c10694b = new C10694b(ui);
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: RQ3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37953aR3.m71403E(Function1.this, obj);
            }
        });
        Observable<Unit> mo41383c = ui.mo41383c();
        final C10695c c10695c = new C10695c();
        Observable<Unit> filter2 = mo41383c.filter(new InterfaceC23494q() { // from class: SQ3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m71402F;
                m71402F = C37953aR3.m71402F(Function1.this, obj);
                return m71402F;
            }
        });
        final C10696d c10696d = new C10696d();
        Observable<R> switchMapSingle = filter2.switchMapSingle(new InterfaceC23492o() { // from class: TQ3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m71401G;
                m71401G = C37953aR3.m71401G(Function1.this, obj);
                return m71401G;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapSingle, "ui.enableCameraClicks\n  …sion(Permission.CAMERA) }");
        Object m33094as8 = switchMapSingle.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10697e c10697e = new C10697e();
        ((ObservableSubscribeProxy) m33094as8).subscribe(new InterfaceC23484g() { // from class: UQ3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37953aR3.m71400H(Function1.this, obj);
            }
        });
        Observable<Boolean> distinctUntilChanged = bluetoothEnableChangeObservable.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "bluetoothEnableChangeObs…le.distinctUntilChanged()");
        Object m33094as9 = distinctUntilChanged.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as9, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10698f c10698f = new C10698f();
        ((ObservableSubscribeProxy) m33094as9).subscribe(new InterfaceC23484g() { // from class: VQ3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37953aR3.m71399I(Function1.this, obj);
            }
        });
        Observable<Boolean> distinctUntilChanged2 = locationEnableChangeObservable.distinctUntilChanged();
        final C10699g c10699g = new C10699g();
        Observable<R> flatMap3 = distinctUntilChanged2.flatMap(new InterfaceC23492o() { // from class: WQ3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m71398J;
                m71398J = C37953aR3.m71398J(Function1.this, obj);
                return m71398J;
            }
        });
        final C10700h c10700h = C10700h.f50471g;
        Observable filter3 = flatMap3.filter(new InterfaceC23494q() { // from class: XQ3
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m71397K;
                m71397K = C37953aR3.m71397K(Function1.this, obj);
                return m71397K;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter3, "locationEnableChangeObse…() }\n      .filter { it }");
        Object m33094as10 = filter3.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as10, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10701i c10701i = new C10701i();
        ((ObservableSubscribeProxy) m33094as10).subscribe(new InterfaceC23484g() { // from class: YQ3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37953aR3.m71396L(Function1.this, obj);
            }
        });
    }

    /* renamed from: C */
    public static final void m71405C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final InterfaceC23434B m71404D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m71403E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final boolean m71402F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: G */
    public static final InterfaceC23447K m71401G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m71400H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m71399I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final InterfaceC23434B m71398J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final boolean m71397K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: L */
    public static final void m71396L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final Pair m71395M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m71394N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m71393O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final InterfaceC23434B m71392P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m71391Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m71390R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final boolean m71389S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: T */
    public static final void m71388T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m71385W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ void getHasRequiredPermissions$annotations() {
    }

    /* renamed from: U */
    public final boolean m71387U() {
        OperatorPermissionsConfig permissions = this.f50459c.m82623f8().getValue().getOperatorConfig().getPermissions();
        if ((permissions.getRequireLocationServices() && (!permissions.getRequireLocationServices() || !mo10332n() || !mo10337h())) || ((permissions.getRequireCamera() && (!permissions.getRequireCamera() || !mo10333m())) || ((permissions.getRequireBluetooth() && (!permissions.getRequireBluetooth() || !mo10334l())) || (permissions.getRequireNotifications() && (!permissions.getRequireNotifications() || !mo10339d()))))) {
            return false;
        }
        return true;
    }

    /* renamed from: V */
    public final void m71386V(PermissionStatus permissionStatus, boolean z) {
        if (permissionStatus != PermissionStatus.NEVER_ASK_AGAIN && permissionStatus != PermissionStatus.DENIED) {
            if (permissionStatus == PermissionStatus.GRANTED && !z) {
                this.f50460d.mo37192C();
                return;
            }
            return;
        }
        Object m33135e = this.f50461e.m110485l(Permission.ACCESS_FINE_LOCATION).m33135e(AutoDispose.m45239a(this.f50457a));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10711s c10711s = new C10711s(z, this);
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: QQ3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37953aR3.m71385W(Function1.this, obj);
            }
        });
    }

    /* renamed from: X */
    public void m71384X() {
        boolean z = true;
        if (!mo10335k()) {
            this.f50458b.mo41375k(true);
        } else if (m71387U()) {
            this.f50458b.close();
        } else {
            this.f50458b.mo41376j((mo10332n() && mo10337h()) ? false : false);
            this.f50458b.mo41385a(mo10333m());
            this.f50458b.mo41378h(mo10334l());
            this.f50458b.mo41382d(mo10339d());
        }
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: d */
    public boolean mo10339d() {
        return this.f50464h.mo10339d();
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: f */
    public boolean mo10338f() {
        return this.f50464h.mo10338f();
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: h */
    public boolean mo10337h() {
        return this.f50464h.mo10337h();
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: j */
    public PermissionStatus mo10336j(Permission permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return this.f50464h.mo10336j(permission);
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: k */
    public boolean mo10335k() {
        return this.f50464h.mo10335k();
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: l */
    public boolean mo10334l() {
        return this.f50464h.mo10334l();
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: m */
    public boolean mo10333m() {
        return this.f50464h.mo10333m();
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: n */
    public boolean mo10332n() {
        return this.f50464h.mo10332n();
    }

    @Override // p000.InterfaceC49820uQ3
    /* renamed from: o */
    public InterfaceC49820uQ3.EnumC29192a mo10331o() {
        return this.f50464h.mo10331o();
    }

    @Override // p000.GQ3
    public void onStart() {
        m71384X();
    }
}
