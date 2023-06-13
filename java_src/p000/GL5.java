package p000;

import android.content.Intent;
import android.os.Parcelable;
import android.view.MenuItem;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.PhysicalLockEvent;
import co.bird.android.model.PhysicalLockEventKind;
import co.bird.android.model.RideState;
import co.bird.android.model.analytics.SmartlockUnlockClosed;
import co.bird.android.model.analytics.SmartlockUnlockViewed;
import co.bird.android.model.constant.ConfigurableTutorialContext;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.persistence.Tutorial;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePhysicalLock;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireSmartlock;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC39873de5;
import p000.C37791a94;
import p000.GL5;
import p000.H31;
import p000.InterfaceC40099e13;
import p000.InterfaceC46193oI5;
@Metadata(m28433d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u001bBw\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204\u0012\b\b\u0001\u0010;\u001a\u000208\u0012\u000e\b\u0001\u0010@\u001a\b\u0012\u0004\u0012\u00020=0<\u0012\b\b\u0001\u0010D\u001a\u00020A\u0012\b\b\u0001\u0010H\u001a\u00020E¢\u0006\u0004\by\u0010zJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0019\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001b\u0010Q\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0016\u0010T\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010W\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010VR\u0016\u0010[\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010VR\u0016\u0010]\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010VR\u0016\u0010a\u001a\u00020^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R\u0018\u0010e\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010fR\u0016\u0010j\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u001d\u0010o\u001a\u0004\u0018\u00010k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010N\u001a\u0004\bm\u0010nR\u001a\u0010s\u001a\b\u0012\u0004\u0012\u00020\t0p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020u0t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010w¨\u0006{"}, m28432d2 = {"LGL5;", "LmL5;", "Landroid/content/Intent;", "intent", "", "b", "onDestroy", "Landroid/view/MenuItem;", "item", "", "c", "onBackPressed", "v", "A", "P", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/PhysicalLockEvent;", "W", "Q", "", "L", "", "requestCode", "M", "(Ljava/lang/Integer;)V", "LhF5;", C17296a.f69688o, "LhF5;", "smartLockManager", "LoI5;", "LoI5;", "smartlockManager", "LYR4;", "LYR4;", "rideManager", "Lde5;", DateTokenConverter.CONVERTER_KEY, "Lde5;", "rxBleClient", "LEa;", "e", "LEa;", "analyticsManager", "Lgl;", "f", "Lgl;", "preference", "LTq4;", "g", "LTq4;", "reactiveConfig", "Llw0;", "h", "Llw0;", "configurableTutorialManager", "LDQ3;", "i", "LDQ3;", "permissionManager", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "j", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LWL5;", "k", "LWL5;", "ui", "Le13;", "l", "Le13;", "navigator", "m", "J", "createTimestamp", "Lco/bird/android/model/constant/MapMode;", "n", "Lkotlin/Lazy;", "N", "()Lco/bird/android/model/constant/MapMode;", "mapMode", "o", "I", "unlockCount", "p", "Z", "unlocking", "q", "confirmDialogShowing", "r", "privateBird", "s", "isHelmetLock", "Lco/bird/android/model/wire/WirePhysicalLock;", "t", "Lco/bird/android/model/wire/WirePhysicalLock;", "physicalLock", "", "u", "Ljava/lang/String;", "taskId", "Ljava/lang/Integer;", "Lgx2;", "w", "Lgx2;", "lockState", "Lco/bird/android/model/wire/WireBird;", "x", "O", "()Lco/bird/android/model/wire/WireBird;", "riddenBird", "La94;", "y", "La94;", "triggeredBluetoothToggle", "", "Lco/bird/android/model/wire/WireSmartlock;", "z", "Ljava/util/Set;", "lockErrorAlreadyShown", "<init>", "(LhF5;LoI5;LYR4;Lde5;LEa;Lgl;LTq4;Llw0;LDQ3;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LWL5;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSmartlockUnlockPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockUnlockPresenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockUnlockPresenterImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,504:1\n1#2:505\n180#3:506\n237#3:507\n180#3:508\n180#3:509\n180#3:510\n180#3:511\n180#3:512\n180#3:513\n*S KotlinDebug\n*F\n+ 1 SmartlockUnlockPresenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockUnlockPresenterImpl\n*L\n184#1:506\n211#1:507\n215#1:508\n247#1:509\n288#1:510\n320#1:511\n332#1:512\n450#1:513\n*E\n"})
/* renamed from: GL5 */
/* loaded from: classes2.dex */
public final class GL5 implements InterfaceC45034mL5 {

    /* renamed from: A */
    public static final C2762a f11654A = new C2762a(null);

    /* renamed from: B */
    public static final int f11655B = 8;

    /* renamed from: a */
    public final InterfaceC42015hF5 f11656a;

    /* renamed from: b */
    public final InterfaceC46193oI5 f11657b;

    /* renamed from: c */
    public final YR4 f11658c;

    /* renamed from: d */
    public final AbstractC39873de5 f11659d;

    /* renamed from: e */
    public final InterfaceC1880Ea f11660e;

    /* renamed from: f */
    public final C22454gl f11661f;

    /* renamed from: g */
    public final C36207Tq4 f11662g;

    /* renamed from: h */
    public final InterfaceC44791lw0 f11663h;

    /* renamed from: i */
    public final DQ3 f11664i;

    /* renamed from: j */
    public final LifecycleScopeProvider<EnumC7097RE> f11665j;

    /* renamed from: k */
    public final WL5 f11666k;

    /* renamed from: l */
    public final InterfaceC40099e13 f11667l;

    /* renamed from: m */
    public final long f11668m;

    /* renamed from: n */
    public final Lazy f11669n;

    /* renamed from: o */
    public int f11670o;

    /* renamed from: p */
    public boolean f11671p;

    /* renamed from: q */
    public boolean f11672q;

    /* renamed from: r */
    public boolean f11673r;

    /* renamed from: s */
    public boolean f11674s;

    /* renamed from: t */
    public WirePhysicalLock f11675t;

    /* renamed from: u */
    public String f11676u;

    /* renamed from: v */
    public Integer f11677v;

    /* renamed from: w */
    public EnumC41838gx2 f11678w;

    /* renamed from: x */
    public final Lazy f11679x;

    /* renamed from: y */
    public final C37791a94<Boolean> f11680y;

    /* renamed from: z */
    public final Set<WireSmartlock> f11681z;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\f"}, m28432d2 = {"LGL5$a;", "", "", "CRUISER_HELMET_ZENDESK_ARTICLE_ID", "J", "", "PHYSICAL_LOCK_ISSUE_ZENDESK_TAG", "Ljava/lang/String;", "PRIVATE_SMARTLOCK_ZENDESK_ARTICLE_ID", "SMARTLOCK_ZENDESK_ARTICLE_ID", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: GL5$a */
    /* loaded from: classes2.dex */
    public static final class C2762a {
        public /* synthetic */ C2762a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2762a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GL5$b */
    /* loaded from: classes2.dex */
    public static final class C2763b extends Lambda implements Function1<Unit, Unit> {
        public C2763b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC1880Ea interfaceC1880Ea = GL5.this.f11660e;
            boolean z = GL5.this.f11671p;
            WirePhysicalLock wirePhysicalLock = GL5.this.f11675t;
            if (wirePhysicalLock == null) {
                Intrinsics.throwUninitializedPropertyAccessException("physicalLock");
                wirePhysicalLock = null;
            }
            interfaceC1880Ea.mo55956N(new SmartlockUnlockClosed(z, wirePhysicalLock.getKind(), GL5.this.m105370L(), GL5.this.f11658c.mo75033n0(), GL5.this.f11670o));
            GL5 gl5 = GL5.this;
            gl5.m105369M(gl5.f11677v);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GL5$c */
    /* loaded from: classes2.dex */
    public static final class C2764c extends Lambda implements Function1<Unit, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: GL5$c$a */
        /* loaded from: classes2.dex */
        public static final class C2765a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ GL5 f11684g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2765a(GL5 gl5) {
                super(1);
                this.f11684g = gl5;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.f11684g.f11666k.errorGeneric();
            }
        }

        public C2764c() {
            super(1);
        }

        /* renamed from: e */
        public static final void m105330e(GL5 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            YR4 yr4 = this$0.f11658c;
            WireBird m105367O = this$0.m105367O();
            yr4.mo75041h0((m105367O == null || (r2 = m105367O.getId()) == null) ? "" : "", PhysicalLockEventKind.UNLOCKED);
        }

        /* renamed from: f */
        public static final void m105329f(GL5 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f11666k.mo77090b9();
        }

        /* renamed from: g */
        public static final void m105328g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23496h invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23461c mo75023x = GL5.this.f11658c.mo75023x(GL5.this.m105367O());
            final GL5 gl5 = GL5.this;
            AbstractC23461c m33070P = mo75023x.m33029z(new InterfaceC23478a() { // from class: HL5
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    GL5.C2764c.m105330e(GL5.this);
                }
            }).m33070P(C23454a.m33087a());
            final GL5 gl52 = GL5.this;
            AbstractC23461c m33029z = m33070P.m33029z(new InterfaceC23478a() { // from class: IL5
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    GL5.C2764c.m105329f(GL5.this);
                }
            });
            final C2765a c2765a = new C2765a(GL5.this);
            return m33029z.m33084B(new InterfaceC23484g() { // from class: JL5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    GL5.C2764c.m105328g(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GL5$d */
    /* loaded from: classes2.dex */
    public static final class C2766d extends Lambda implements Function1<Unit, Unit> {
        public C2766d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            long j;
            if (GL5.this.f11673r) {
                j = 360027921692L;
            } else {
                j = GL5.this.f11674s ? 4402940540948L : 360030668292L;
            }
            GL5.this.f11667l.mo36922w3(j);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GL5$e */
    /* loaded from: classes2.dex */
    public static final class C2767e extends Lambda implements Function1<Unit, Unit> {
        public C2767e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            List listOf;
            List listOf2;
            WirePhysicalLock wirePhysicalLock;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new EnumC41838gx2[]{EnumC41838gx2.f84511q, EnumC41838gx2.f84512r});
            listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new EnumC41838gx2[]{EnumC41838gx2.f84513s, EnumC41838gx2.f84514t});
            WirePhysicalLock wirePhysicalLock2 = null;
            if (listOf.contains(GL5.this.f11678w)) {
                WirePhysicalLock wirePhysicalLock3 = GL5.this.f11675t;
                if (wirePhysicalLock3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("physicalLock");
                    wirePhysicalLock3 = null;
                }
                if (wirePhysicalLock3.getBirdId() != null && GL5.this.f11676u != null) {
                    InterfaceC40099e13 interfaceC40099e13 = GL5.this.f11667l;
                    WirePhysicalLock wirePhysicalLock4 = GL5.this.f11675t;
                    if (wirePhysicalLock4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("physicalLock");
                    } else {
                        wirePhysicalLock2 = wirePhysicalLock4;
                    }
                    String birdId = wirePhysicalLock2.getBirdId();
                    Intrinsics.checkNotNull(birdId);
                    String str = GL5.this.f11676u;
                    Intrinsics.checkNotNull(str);
                    interfaceC40099e13.mo37194B3(birdId, str, GL5.this.f11671p, GL5.this.m105368N());
                    return;
                }
            }
            if (listOf2.contains(GL5.this.f11678w)) {
                GL5 gl5 = GL5.this;
                gl5.m105369M(gl5.f11677v);
            } else if (GL5.this.f11678w == EnumC41838gx2.f84510p) {
                InterfaceC40099e13 interfaceC40099e132 = GL5.this.f11667l;
                WirePhysicalLock wirePhysicalLock5 = GL5.this.f11675t;
                if (wirePhysicalLock5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("physicalLock");
                    wirePhysicalLock = null;
                } else {
                    wirePhysicalLock = wirePhysicalLock5;
                }
                InterfaceC40099e13.C19924a.goToPhysicalLockIfEnabled$default(interfaceC40099e132, wirePhysicalLock, true, null, null, false, null, 60, null);
            } else {
                GL5.this.f11667l.mo36922w3(360030668292L);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GL5$f */
    /* loaded from: classes2.dex */
    public static final class C2768f extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C2768f f11687g = new C2768f();

        public C2768f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.areEqual(it.getRideConfig().getSmartlockConfig().getEnableV2(), Boolean.TRUE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "smartLockV2Enabled", "Lio/reactivex/B;", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GL5$g */
    /* loaded from: classes2.dex */
    public static final class C2769g extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends Unit>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LvE5;", "it", "", C17296a.f69688o, "(LvE5;)Lkotlin/Unit;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: GL5$g$a */
        /* loaded from: classes2.dex */
        public static final class C2770a extends Lambda implements Function1<C50306vE5, Unit> {

            /* renamed from: g */
            public static final C2770a f11689g = new C2770a();

            public C2770a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Unit invoke(C50306vE5 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.m8985b() == EnumC50899wE5.UNLOCKED) {
                    return Unit.INSTANCE;
                }
                return null;
            }
        }

        public C2769g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Unit> invoke(Boolean smartLockV2Enabled) {
            Intrinsics.checkNotNullParameter(smartLockV2Enabled, "smartLockV2Enabled");
            if (smartLockV2Enabled.booleanValue()) {
                InterfaceC42015hF5 interfaceC42015hF5 = GL5.this.f11656a;
                WirePhysicalLock wirePhysicalLock = GL5.this.f11675t;
                if (wirePhysicalLock == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("physicalLock");
                    wirePhysicalLock = null;
                }
                WireSmartlock smartlock = wirePhysicalLock.getSmartlock();
                String macAddress = smartlock != null ? smartlock.getMacAddress() : null;
                Intrinsics.checkNotNull(macAddress);
                return C37279Yf5.m74578Q(interfaceC42015hF5.mo19728d(macAddress), C2770a.f11689g).m32113r1();
            }
            return GL5.this.f11657b.mo21401f();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GL5$h */
    /* loaded from: classes2.dex */
    public static final class C2771h extends Lambda implements Function1<Unit, Unit> {
        public C2771h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            GL5.this.f11670o++;
            GL5.this.f11666k.mo77090b9();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Loe6;", "error", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Loe6;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSmartlockUnlockPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockUnlockPresenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockUnlockPresenterImpl$configureSmartlockBasedLock$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,504:1\n1#2:505\n*E\n"})
    /* renamed from: GL5$i */
    /* loaded from: classes2.dex */
    public static final class C2772i extends Lambda implements Function1<Optional<C46396oe6>, C46396oe6> {

        /* renamed from: g */
        public static final C2772i f11691g = new C2772i();

        public C2772i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C46396oe6 invoke(Optional<C46396oe6> error) {
            boolean z;
            Intrinsics.checkNotNullParameter(error, "error");
            C46396oe6 m59035e = error.m59035e();
            if (m59035e != null) {
                if (!m59035e.m20705f() && !m59035e.m20704g() && !m59035e.m20703h()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return m59035e;
                }
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Loe6;", "error", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "b", "(Loe6;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GL5$j */
    /* loaded from: classes2.dex */
    public static final class C2773j extends Lambda implements Function1<C46396oe6, InterfaceC23447K<? extends DialogResponse>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "dialogResponse", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: GL5$j$a */
        /* loaded from: classes2.dex */
        public static final class C2774a extends Lambda implements Function1<DialogResponse, InterfaceC23447K<? extends DialogResponse>> {

            /* renamed from: g */
            public final /* synthetic */ GL5 f11693g;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: GL5$j$a$a */
            /* loaded from: classes2.dex */
            public static final class C2775a extends Lambda implements Function1<InterfaceC23465c, Unit> {

                /* renamed from: g */
                public final /* synthetic */ GL5 f11694g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2775a(GL5 gl5) {
                    super(1);
                    this.f11694g = gl5;
                }

                /* renamed from: a */
                public final void m105319a(InterfaceC23465c interfaceC23465c) {
                    this.f11694g.f11680y.accept(Boolean.TRUE);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                    m105319a(interfaceC23465c);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2774a(GL5 gl5) {
                super(1);
                this.f11693g = gl5;
            }

            /* renamed from: d */
            public static final void m105320d(GL5 this$0) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f11680y.accept(Boolean.FALSE);
            }

            public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: c */
            public final InterfaceC23447K<? extends DialogResponse> invoke(DialogResponse dialogResponse) {
                Intrinsics.checkNotNullParameter(dialogResponse, "dialogResponse");
                if (dialogResponse == DialogResponse.OK) {
                    AbstractC23461c resetBluetooth$default = InterfaceC46193oI5.C26897b.resetBluetooth$default(this.f11693g.f11657b, 0L, 1, null);
                    final C2775a c2775a = new C2775a(this.f11693g);
                    AbstractC23442F m33046j0 = resetBluetooth$default.m33081E(new InterfaceC23484g() { // from class: LL5
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            GL5.C2773j.C2774a.invoke$lambda$0(Function1.this, obj);
                        }
                    }).m33046j0(dialogResponse);
                    final GL5 gl5 = this.f11693g;
                    return m33046j0.m33110r(new InterfaceC23478a() { // from class: ML5
                        @Override // io.reactivex.functions.InterfaceC23478a
                        public final void run() {
                            GL5.C2773j.C2774a.m105320d(GL5.this);
                        }
                    });
                }
                return AbstractC23442F.m33158H(dialogResponse);
            }
        }

        public C2773j() {
            super(1);
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends DialogResponse> invoke(C46396oe6 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            if (GL5.this.f11681z.contains(error.m20708c())) {
                return AbstractC23442F.m33158H(DialogResponse.OTHER);
            }
            GL5.this.f11681z.add(error.m20708c());
            if (error.m20706e()) {
                AbstractC23442F m33152N = H31.C3014a.birdDialog$default(GL5.this.f11666k, C42662iL5.f87186d, false, false, 4, null).m33152N(C24542a.m31934a());
                final C2774a c2774a = new C2774a(GL5.this);
                AbstractC23442F m33165A = m33152N.m33165A(new InterfaceC23492o() { // from class: KL5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23447K invoke$lambda$0;
                        invoke$lambda$0 = GL5.C2773j.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(m33165A, "private fun configureSma…ID)\n        }\n      }\n  }");
                return m33165A;
            }
            return H31.C3014a.birdDialog$default(GL5.this.f11666k, VL5.f38887d, false, false, 4, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GL5$k */
    /* loaded from: classes2.dex */
    public static final class C2776k extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C2776k f11695g = new C2776k();

        public C2776k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while handling unlock errors", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GL5$l */
    /* loaded from: classes2.dex */
    public static final class C2777l extends Lambda implements Function1<Unit, InterfaceC23447K<? extends DialogResponse>> {
        public C2777l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends DialogResponse> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (GL5.this.f11670o <= 0 && ((MapMode.RIDER != GL5.this.m105368N() || !GL5.this.f11671p) && !GL5.this.f11673r)) {
                GL5.this.f11672q = true;
                if (GL5.this.f11671p) {
                    return GL5.this.f11666k.mo77096Dc(C39311cj4.dialog_cancel_smartlock_unlock, GL5.this.f11678w);
                }
                return GL5.this.f11666k.mo77087x9(C39311cj4.dialog_cancel_smartlock_lock, GL5.this.f11678w);
            }
            AbstractC23442F m33158H = AbstractC23442F.m33158H(DialogResponse.OK);
            Intrinsics.checkNotNullExpressionValue(m33158H, "{\n          // Simulate …logResponse.OK)\n        }");
            return m33158H;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GL5$m */
    /* loaded from: classes2.dex */
    public static final class C2778m extends Lambda implements Function1<DialogResponse, Unit> {
        public C2778m() {
            super(1);
        }

        /* renamed from: a */
        public final void m105318a(DialogResponse dialogResponse) {
            GL5.this.f11672q = false;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m105318a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GL5$n */
    /* loaded from: classes2.dex */
    public static final class C2779n extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends Object>> {
        public C2779n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Object> invoke(DialogResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it == DialogResponse.OK) {
                if (GL5.this.f11671p && !GL5.this.f11673r) {
                    return GL5.this.m105359W().m33125j0();
                }
                return AbstractC24507p.m32068G(Unit.INSTANCE);
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lco/bird/android/model/constant/MapMode;", "b", "()Lco/bird/android/model/constant/MapMode;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GL5$o */
    /* loaded from: classes2.dex */
    public static final class C2780o extends Lambda implements Function0<MapMode> {
        public C2780o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final MapMode invoke() {
            return GL5.this.f11661f.m37571t0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u000420\u0010\u0005\u001a,\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "Lde5$a;", "kotlin.jvm.PlatformType", "", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GL5$p */
    /* loaded from: classes2.dex */
    public static final class C2781p extends Lambda implements Function1<Triple<? extends AbstractC39873de5.EnumC19828a, ? extends Unit, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C2781p f11700g = new C2781p();

        public C2781p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Triple<? extends AbstractC39873de5.EnumC19828a, Unit, Boolean> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            return Boolean.valueOf(!triple.component3().booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032b\u0010\u0005\u001a^\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004 \u0002*.\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "Lde5$a;", "kotlin.jvm.PlatformType", "", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GL5$q */
    /* loaded from: classes2.dex */
    public static final class C2782q extends Lambda implements Function1<Triple<? extends AbstractC39873de5.EnumC19828a, ? extends Unit, ? extends Boolean>, Unit> {
        public C2782q() {
            super(1);
        }

        /* renamed from: a */
        public final void m105314a(Triple<? extends AbstractC39873de5.EnumC19828a, Unit, Boolean> triple) {
            if (triple.component1() == AbstractC39873de5.EnumC19828a.READY) {
                GL5.this.f11666k.dismissDialog();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends AbstractC39873de5.EnumC19828a, ? extends Unit, ? extends Boolean> triple) {
            m105314a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u000620\u0010\u0005\u001a,\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lde5$a;", "kotlin.jvm.PlatformType", "", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GL5$r */
    /* loaded from: classes2.dex */
    public static final class C2783r extends Lambda implements Function1<Triple<? extends AbstractC39873de5.EnumC19828a, ? extends Unit, ? extends Boolean>, InterfaceC23447K<? extends DialogResponse>> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "dialogResponse", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: GL5$r$a */
        /* loaded from: classes2.dex */
        public static final class C2784a extends Lambda implements Function1<DialogResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ GL5 f11703g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2784a(GL5 gl5) {
                super(1);
                this.f11703g = gl5;
            }

            /* renamed from: a */
            public final void m105307a(DialogResponse dialogResponse) {
                if (dialogResponse == DialogResponse.CANCEL) {
                    this.f11703g.f11667l.mo36949s0();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
                m105307a(dialogResponse);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "dialogResponse", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: GL5$r$b */
        /* loaded from: classes2.dex */
        public static final class C2785b extends Lambda implements Function1<DialogResponse, InterfaceC23447K<? extends DialogResponse>> {

            /* renamed from: g */
            public final /* synthetic */ GL5 f11704g;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "it", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LFQ3;)Lco/bird/android/model/DialogResponse;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: GL5$r$b$a */
            /* loaded from: classes2.dex */
            public static final class C2786a extends Lambda implements Function1<FQ3, DialogResponse> {

                /* renamed from: g */
                public final /* synthetic */ DialogResponse f11705g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2786a(DialogResponse dialogResponse) {
                    super(1);
                    this.f11705g = dialogResponse;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final DialogResponse invoke(FQ3 it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return this.f11705g;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2785b(GL5 gl5) {
                super(1);
                this.f11704g = gl5;
            }

            /* renamed from: c */
            public static final DialogResponse m105304c(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (DialogResponse) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC23447K<? extends DialogResponse> invoke(DialogResponse dialogResponse) {
                Intrinsics.checkNotNullParameter(dialogResponse, "dialogResponse");
                if (dialogResponse == DialogResponse.OK) {
                    AbstractC23442F<FQ3> m110485l = this.f11704g.f11664i.m110485l(Permission.ACCESS_FINE_LOCATION);
                    final C2786a c2786a = new C2786a(dialogResponse);
                    return m110485l.m33157I(new InterfaceC23492o() { // from class: QL5
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            DialogResponse m105304c;
                            m105304c = GL5.C2783r.C2785b.m105304c(Function1.this, obj);
                            return m105304c;
                        }
                    });
                }
                return AbstractC23442F.m33158H(dialogResponse);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "dialogResponse", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: GL5$r$c */
        /* loaded from: classes2.dex */
        public static final class C2787c extends Lambda implements Function1<DialogResponse, Unit> {

            /* renamed from: g */
            public final /* synthetic */ GL5 f11706g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2787c(GL5 gl5) {
                super(1);
                this.f11706g = gl5;
            }

            /* renamed from: a */
            public final void m105302a(DialogResponse dialogResponse) {
                if (dialogResponse == DialogResponse.CANCEL) {
                    this.f11706g.f11667l.mo36949s0();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
                m105302a(dialogResponse);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: GL5$r$d */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C2788d {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AbstractC39873de5.EnumC19828a.values().length];
                try {
                    iArr[AbstractC39873de5.EnumC19828a.READY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC39873de5.EnumC19828a.LOCATION_SERVICES_NOT_ENABLED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AbstractC39873de5.EnumC19828a.LOCATION_PERMISSION_NOT_GRANTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C2783r() {
            super(1);
        }

        /* renamed from: e */
        public static final InterfaceC23447K m105309e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final void m105308f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23447K<? extends DialogResponse> invoke(Triple<? extends AbstractC39873de5.EnumC19828a, Unit, Boolean> triple) {
            int i;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            AbstractC39873de5.EnumC19828a component1 = triple.component1();
            if (component1 == null) {
                i = -1;
            } else {
                i = C2788d.$EnumSwitchMapping$0[component1.ordinal()];
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        AbstractC23442F dialog$default = H31.C3014a.dialog$default(GL5.this.f11666k, C43255jL5.f92576d, false, false, 4, null);
                        final C2787c c2787c = new C2787c(GL5.this);
                        return dialog$default.m33101w(new InterfaceC23484g() { // from class: PL5
                            @Override // io.reactivex.functions.InterfaceC23484g
                            public final void accept(Object obj) {
                                GL5.C2783r.m105308f(Function1.this, obj);
                            }
                        });
                    }
                    AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(GL5.this.f11666k, C43848kL5.f94275d, false, false, 4, null);
                    final C2785b c2785b = new C2785b(GL5.this);
                    return birdDialog$default.m33165A(new InterfaceC23492o() { // from class: OL5
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC23447K m105309e;
                            m105309e = GL5.C2783r.m105309e(Function1.this, obj);
                            return m105309e;
                        }
                    });
                }
                AbstractC23442F dialog$default2 = H31.C3014a.dialog$default(GL5.this.f11666k, C44441lL5.f95897d, false, false, 4, null);
                final C2784a c2784a = new C2784a(GL5.this);
                return dialog$default2.m33101w(new InterfaceC23484g() { // from class: NL5
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        GL5.C2783r.invoke$lambda$0(Function1.this, obj);
                    }
                });
            }
            return AbstractC23442F.m33153M();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: GL5$s */
    /* loaded from: classes2.dex */
    public static final class C2789s extends Lambda implements Function1<DialogResponse, Unit> {

        /* renamed from: g */
        public final /* synthetic */ C45168ma4<Unit> f11707g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2789s(C45168ma4<Unit> c45168ma4) {
            super(1);
            this.f11707g = c45168ma4;
        }

        /* renamed from: a */
        public final void m105301a(DialogResponse dialogResponse) {
            this.f11707g.accept(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m105301a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: GL5$t */
    /* loaded from: classes2.dex */
    public static final class C2790t extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C2790t f11708g = new C2790t();

        public C2790t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while observing bluetooth state issues in smartlock unlock presenter", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "tutorials", "", "Lco/bird/android/model/persistence/Tutorial;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nSmartlockUnlockPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockUnlockPresenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockUnlockPresenterImpl$onCreate$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,504:1\n1549#2:505\n1620#2,3:506\n*S KotlinDebug\n*F\n+ 1 SmartlockUnlockPresenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockUnlockPresenterImpl$onCreate$2\n*L\n168#1:505\n168#1:506,3\n*E\n"})
    /* renamed from: GL5$u */
    /* loaded from: classes2.dex */
    public static final class C2791u extends Lambda implements Function1<List<? extends Tutorial>, Boolean> {
        public C2791u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends Tutorial> list) {
            return invoke2((List<Tutorial>) list);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(List<Tutorial> tutorials) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(tutorials, "tutorials");
            InterfaceC40099e13 interfaceC40099e13 = GL5.this.f11667l;
            List<Tutorial> list = tutorials;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Tutorial tutorial : list) {
                arrayList.add(tutorial.getId());
            }
            interfaceC40099e13.mo37168G(arrayList, null, false);
            return Boolean.TRUE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "b", "()Lco/bird/android/model/wire/WireBird;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSmartlockUnlockPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartlockUnlockPresenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockUnlockPresenterImpl$riddenBird$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,504:1\n288#2:505\n1747#2,3:506\n289#2:509\n*S KotlinDebug\n*F\n+ 1 SmartlockUnlockPresenter.kt\nco/bird/android/app/feature/physicallock/smartlock/SmartlockUnlockPresenterImpl$riddenBird$2\n*L\n109#1:505\n110#1:506,3\n109#1:509\n*E\n"})
    /* renamed from: GL5$v */
    /* loaded from: classes2.dex */
    public static final class C2792v extends Lambda implements Function0<WireBird> {
        public C2792v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final WireBird invoke() {
            Object obj;
            WireRide ride;
            List<WirePhysicalLock> physicalLocks;
            boolean z;
            GL5 gl5 = GL5.this;
            Iterator<T> it = GL5.this.f11658c.mo75032o0().m73665a().activeRides().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    WireBird bird = ((RideState) obj).getRide().getBird();
                    boolean z2 = false;
                    if (bird != null && (physicalLocks = bird.getPhysicalLocks()) != null) {
                        List<WirePhysicalLock> list = physicalLocks;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            for (WirePhysicalLock wirePhysicalLock : list) {
                                String id = wirePhysicalLock.getId();
                                WirePhysicalLock wirePhysicalLock2 = gl5.f11675t;
                                if (wirePhysicalLock2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("physicalLock");
                                    wirePhysicalLock2 = null;
                                }
                                if (Intrinsics.areEqual(id, wirePhysicalLock2.getId())) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                        if (z) {
                            z2 = true;
                            continue;
                        } else {
                            continue;
                        }
                    }
                    if (z2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            RideState rideState = (RideState) obj;
            if (rideState == null || (ride = rideState.getRide()) == null) {
                return null;
            }
            return ride.getBird();
        }
    }

    public GL5(InterfaceC42015hF5 smartLockManager, InterfaceC46193oI5 smartlockManager, YR4 rideManager, AbstractC39873de5 rxBleClient, InterfaceC1880Ea analyticsManager, C22454gl preference, C36207Tq4 reactiveConfig, InterfaceC44791lw0 configurableTutorialManager, DQ3 permissionManager, LifecycleScopeProvider<EnumC7097RE> scopeProvider, WL5 ui, InterfaceC40099e13 navigator) {
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(smartLockManager, "smartLockManager");
        Intrinsics.checkNotNullParameter(smartlockManager, "smartlockManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(rxBleClient, "rxBleClient");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(configurableTutorialManager, "configurableTutorialManager");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f11656a = smartLockManager;
        this.f11657b = smartlockManager;
        this.f11658c = rideManager;
        this.f11659d = rxBleClient;
        this.f11660e = analyticsManager;
        this.f11661f = preference;
        this.f11662g = reactiveConfig;
        this.f11663h = configurableTutorialManager;
        this.f11664i = permissionManager;
        this.f11665j = scopeProvider;
        this.f11666k = ui;
        this.f11667l = navigator;
        this.f11668m = System.currentTimeMillis();
        lazy = LazyKt__LazyJVMKt.lazy(new C2780o());
        this.f11669n = lazy;
        this.f11671p = true;
        this.f11678w = EnumC41838gx2.f84508n;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C2792v());
        this.f11679x = lazy2;
        this.f11680y = C37791a94.C10586a.create$default(C37791a94.f49908h, Boolean.FALSE, null, 2, null);
        this.f11681z = new LinkedHashSet();
    }

    /* renamed from: B */
    public static final InterfaceC23447K m105380B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m105379C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final InterfaceC23447K m105378D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m105377E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final InterfaceC24574u m105376F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m105375G(GL5 this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC1880Ea interfaceC1880Ea = this$0.f11660e;
        boolean z = this$0.f11671p;
        WirePhysicalLock wirePhysicalLock = this$0.f11675t;
        if (wirePhysicalLock == null) {
            Intrinsics.throwUninitializedPropertyAccessException("physicalLock");
            wirePhysicalLock = null;
        }
        interfaceC1880Ea.mo55956N(new SmartlockUnlockClosed(z, wirePhysicalLock.getKind(), this$0.m105370L(), this$0.f11658c.mo75033n0(), this$0.f11670o));
        this$0.m105369M(this$0.f11677v);
    }

    /* renamed from: H */
    public static final void m105374H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final Boolean m105373I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final InterfaceC23434B m105372J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m105371K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final boolean m105364R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: S */
    public static final void m105363S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final InterfaceC23447K m105362T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m105361U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m105360V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m105338w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final InterfaceC23496h m105337x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m105336y() {
    }

    /* renamed from: z */
    public static final void m105335z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final void m105381A() {
        InterfaceC46193oI5 interfaceC46193oI5 = this.f11657b;
        WirePhysicalLock wirePhysicalLock = this.f11675t;
        if (wirePhysicalLock == null) {
            Intrinsics.throwUninitializedPropertyAccessException("physicalLock");
            wirePhysicalLock = null;
        }
        interfaceC46193oI5.mo21400g(new C37099Xl5(wirePhysicalLock, null, null, 6, null));
        Z84<Config> m82623f8 = this.f11662g.m82623f8();
        final C2768f c2768f = C2768f.f11687g;
        Observable distinctUntilChanged = m82623f8.map(new InterfaceC23492o() { // from class: FL5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m105373I;
                m105373I = GL5.m105373I(Function1.this, obj);
                return m105373I;
            }
        }).distinctUntilChanged();
        final C2769g c2769g = new C2769g();
        Observable flatMap = distinctUntilChanged.flatMap(new InterfaceC23492o() { // from class: oL5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m105372J;
                m105372J = GL5.m105372J(Function1.this, obj);
                return m105372J;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "private fun configureSma…ID)\n        }\n      }\n  }");
        Object m33094as = flatMap.m33094as(AutoDispose.m45239a(this.f11665j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2771h c2771h = new C2771h();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: pL5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GL5.m105371K(Function1.this, obj);
            }
        });
        Observable observeOn = C37279Yf5.m74575T(this.f11657b.mo21398i(), C2772i.f11691g).observeOn(C23454a.m33087a());
        final C2773j c2773j = new C2773j();
        Observable switchMapSingle = observeOn.switchMapSingle(new InterfaceC23492o() { // from class: qL5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m105380B;
                m105380B = GL5.m105380B(Function1.this, obj);
                return m105380B;
            }
        });
        final C2776k c2776k = C2776k.f11695g;
        Observable retry = switchMapSingle.doOnError(new InterfaceC23484g() { // from class: rL5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GL5.m105379C(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "private fun configureSma…ID)\n        }\n      }\n  }");
        Object m33094as2 = retry.m33094as(AutoDispose.m45239a(this.f11665j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe();
        Observable<Unit> mo77091b0 = this.f11666k.mo77091b0();
        final C2777l c2777l = new C2777l();
        Observable<R> flatMapSingle = mo77091b0.flatMapSingle(new InterfaceC23492o() { // from class: sL5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m105378D;
                m105378D = GL5.m105378D(Function1.this, obj);
                return m105378D;
            }
        });
        final C2778m c2778m = new C2778m();
        Observable doOnNext = flatMapSingle.doOnNext(new InterfaceC23484g() { // from class: tL5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GL5.m105377E(Function1.this, obj);
            }
        });
        final C2779n c2779n = new C2779n();
        Observable flatMapMaybe = doOnNext.flatMapMaybe(new InterfaceC23492o() { // from class: uL5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m105376F;
                m105376F = GL5.m105376F(Function1.this, obj);
                return m105376F;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "private fun configureSma…ID)\n        }\n      }\n  }");
        Object m33094as3 = flatMapMaybe.m33094as(AutoDispose.m45239a(this.f11665j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: vL5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GL5.m105375G(GL5.this, obj);
            }
        });
        Object m33094as4 = this.f11666k.mo77086zk().m33094as(AutoDispose.m45239a(this.f11665j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2767e c2767e = new C2767e();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: wL5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GL5.m105374H(Function1.this, obj);
            }
        });
    }

    /* renamed from: L */
    public final long m105370L() {
        return System.currentTimeMillis() - this.f11668m;
    }

    /* renamed from: M */
    public final void m105369M(Integer num) {
        Unit unit;
        if (num != null) {
            num.intValue();
            this.f11667l.mo37029e4(-1, new Intent());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f11667l.close();
        }
    }

    /* renamed from: N */
    public final MapMode m105368N() {
        return (MapMode) this.f11669n.getValue();
    }

    /* renamed from: O */
    public final WireBird m105367O() {
        return (WireBird) this.f11679x.getValue();
    }

    /* renamed from: P */
    public final void m105366P() {
        int i;
        if (this.f11671p) {
            i = C45871nl4.locking_and_unlocking;
        } else {
            i = C45871nl4.eb100_cable_physical_lock_lock_instructions_title;
        }
        this.f11666k.mo77092Y(i);
    }

    /* renamed from: Q */
    public final void m105365Q() {
        C45168ma4 m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        Observable<AbstractC39873de5.EnumC19828a> bleState = this.f11659d.mo33640d().startWith((Observable<AbstractC39873de5.EnumC19828a>) this.f11659d.mo33641c()).distinctUntilChanged();
        C24523e c24523e = C24523e.f91168a;
        Intrinsics.checkNotNullExpressionValue(bleState, "bleState");
        Observable m31955b = c24523e.m31955b(bleState, m25409g, this.f11680y);
        final C2781p c2781p = C2781p.f11700g;
        Observable observeOn = m31955b.filter(new InterfaceC23494q() { // from class: AL5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m105364R;
                m105364R = GL5.m105364R(Function1.this, obj);
                return m105364R;
            }
        }).observeOn(C23454a.m33087a());
        final C2782q c2782q = new C2782q();
        Observable doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: BL5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GL5.m105363S(Function1.this, obj);
            }
        });
        final C2783r c2783r = new C2783r();
        Observable flatMapSingle = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: CL5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m105362T;
                m105362T = GL5.m105362T(Function1.this, obj);
                return m105362T;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "private fun observeBluet…hSubject.accept(Unit)\n  }");
        Object m33094as = flatMapSingle.m33094as(AutoDispose.m45239a(this.f11665j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2789s c2789s = new C2789s(m25409g);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: DL5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GL5.m105361U(Function1.this, obj);
            }
        };
        final C2790t c2790t = C2790t.f11708g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: EL5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GL5.m105360V(Function1.this, obj);
            }
        });
        m25409g.accept(Unit.INSTANCE);
    }

    /* renamed from: W */
    public final AbstractC23442F<HM4<PhysicalLockEvent>> m105359W() {
        WirePhysicalLock wirePhysicalLock = this.f11675t;
        if (wirePhysicalLock == null) {
            Intrinsics.throwUninitializedPropertyAccessException("physicalLock");
            wirePhysicalLock = null;
        }
        String birdId = wirePhysicalLock.getBirdId();
        Intrinsics.checkNotNull(birdId);
        if (this.f11670o > 0) {
            return this.f11658c.mo75041h0(birdId, PhysicalLockEventKind.UNLOCKED);
        }
        return this.f11658c.mo75041h0(birdId, PhysicalLockEventKind.NOT_UNLOCKED);
    }

    @Override // p000.InterfaceC45034mL5
    /* renamed from: b */
    public void mo25817b(Intent intent) {
        boolean z;
        String str;
        WirePhysicalLock wirePhysicalLock;
        boolean z2;
        String str2;
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f11671p = intent.getBooleanExtra("physical_lock_unlocking", true);
        Parcelable parcelableExtra = intent.getParcelableExtra("physical_lock");
        Intrinsics.checkNotNull(parcelableExtra);
        this.f11675t = (WirePhysicalLock) parcelableExtra;
        boolean z3 = false;
        this.f11673r = intent.getBooleanExtra("private_bird", false);
        this.f11674s = intent.getBooleanExtra("helmet_lock", false);
        Integer valueOf = Integer.valueOf(C36441Uq4.m80769c(this.f11662g, m105367O()).getComplianceConfig().getWarnFineLockCompliance());
        if (valueOf.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        WirePhysicalLock wirePhysicalLock2 = null;
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            str = C51916xx1.f118396a.m4408d(valueOf.intValue(), C45097mS5.m25591o(C36441Uq4.m80769c(this.f11662g, m105367O()).getRideConfig().getCurrency()), EnumC36501Ux1.SHOW_IF_NON_ZERO);
        } else {
            str = null;
        }
        MapMode m105368N = m105368N();
        boolean z4 = this.f11673r;
        boolean z5 = this.f11671p;
        boolean z6 = this.f11674s;
        WirePhysicalLock wirePhysicalLock3 = this.f11675t;
        if (wirePhysicalLock3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("physicalLock");
            wirePhysicalLock = null;
        } else {
            wirePhysicalLock = wirePhysicalLock3;
        }
        this.f11678w = UL5.m81617a(m105368N, z4, z5, z6, wirePhysicalLock, str);
        WirePhysicalLock wirePhysicalLock4 = this.f11675t;
        if (wirePhysicalLock4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("physicalLock");
            wirePhysicalLock4 = null;
        }
        if (wirePhysicalLock4.isBrainBasedBluetooth() && m105367O() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        WirePhysicalLock wirePhysicalLock5 = this.f11675t;
        if (wirePhysicalLock5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("physicalLock");
            wirePhysicalLock5 = null;
        }
        if (wirePhysicalLock5.getSmartlock() == null && !z2) {
            this.f11667l.mo37030e3();
            return;
        }
        this.f11676u = intent.getStringExtra("task_id");
        Integer valueOf2 = Integer.valueOf(intent.getIntExtra("request_code", -1));
        if (valueOf2.intValue() != -1) {
            z3 = true;
        }
        if (!z3) {
            valueOf2 = null;
        }
        this.f11677v = valueOf2;
        this.f11666k.mo77093X4(this.f11673r);
        m105366P();
        this.f11666k.mo77089kj(this.f11678w, str);
        if (z2) {
            m105339v();
        } else {
            m105381A();
        }
        m105365Q();
        InterfaceC44791lw0 interfaceC44791lw0 = this.f11663h;
        WirePhysicalLock wirePhysicalLock6 = this.f11675t;
        if (wirePhysicalLock6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("physicalLock");
            wirePhysicalLock6 = null;
        }
        ConfigurableTutorialContext tutorialContext = wirePhysicalLock6.toTutorialContext(this.f11671p);
        WireBird m105367O = m105367O();
        if (m105367O != null) {
            str2 = m105367O.getModel();
        } else {
            str2 = null;
        }
        interfaceC44791lw0.mo20265j0(tutorialContext, str2, true, new C2791u());
        InterfaceC1880Ea interfaceC1880Ea = this.f11660e;
        boolean z7 = this.f11671p;
        WirePhysicalLock wirePhysicalLock7 = this.f11675t;
        if (wirePhysicalLock7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("physicalLock");
        } else {
            wirePhysicalLock2 = wirePhysicalLock7;
        }
        interfaceC1880Ea.mo55956N(new SmartlockUnlockViewed(z7, wirePhysicalLock2.getKind(), this.f11658c.mo75033n0()));
    }

    @Override // p000.InterfaceC45034mL5
    /* renamed from: c */
    public boolean mo25816c(MenuItem item) {
        long j;
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C36585Vg4.infoButton) {
            if (this.f11673r) {
                j = 360027921692L;
            } else if (this.f11674s) {
                j = 4402940540948L;
            } else {
                j = 360030668292L;
            }
            this.f11667l.mo36922w3(j);
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC45034mL5
    public void onBackPressed() {
        if (this.f11673r) {
            m105369M(this.f11677v);
        }
    }

    @Override // p000.InterfaceC45034mL5
    public void onDestroy() {
        if (!C42149hU4.m36358a(this.f11658c.mo75057R().getValue())) {
            this.f11657b.mo21403d();
        }
    }

    /* renamed from: v */
    public final void m105339v() {
        Object m33094as = this.f11666k.mo77091b0().m33094as(AutoDispose.m45239a(this.f11665j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2763b c2763b = new C2763b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: nL5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GL5.m105338w(Function1.this, obj);
            }
        });
        Observable<Unit> mo77086zk = this.f11666k.mo77086zk();
        final C2764c c2764c = new C2764c();
        AbstractC23461c flatMapCompletable = mo77086zk.flatMapCompletable(new InterfaceC23492o() { // from class: xL5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m105337x;
                m105337x = GL5.m105337x(Function1.this, obj);
                return m105337x;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "private fun configureBra…le(articleId)\n      }\n  }");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(this.f11665j));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).mo45218b(new InterfaceC23478a() { // from class: yL5
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                GL5.m105336y();
            }
        });
        Object m33094as2 = this.f11666k.mo77088wi().m33094as(AutoDispose.m45239a(this.f11665j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2766d c2766d = new C2766d();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: zL5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                GL5.m105335z(Function1.this, obj);
            }
        });
    }
}
