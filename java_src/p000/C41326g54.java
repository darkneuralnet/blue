package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.AlarmType;
import co.bird.android.model.BirdActionsAndSettings;
import co.bird.android.model.PrivateBirdAction;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireBirdKt;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Http2Connection;
import p000.C37791a94;
import p000.InterfaceC27246pJ;
import p000.L44;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\b\b\u0001\u0010$\u001a\u00020!\u0012\b\b\u0001\u0010(\u001a\u00020%¢\u0006\u0004\b6\u00107J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R'\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110*0.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0016\u00105\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00068"}, m28432d2 = {"Lg54;", "LL44;", "", "x", "A", "", "throwable", "z", "", "on", "K", "O", "N", "P", "locked", "T", "S", "Lco/bird/android/model/wire/WireBird;", "privateBird", "toggleLock", C17296a.f69688o, "B", "LEa;", "LEa;", "analyticsManager", "LgH;", "b", "LgH;", "birdActionsManager", "LpJ;", "c", "LpJ;", "bluetoothManager", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Ln54;", "e", "Ln54;", "ui", "La94;", "Lco/bird/android/buava/Optional;", "f", "La94;", "_privateBird", "LZ84;", "g", "Lkotlin/Lazy;", "w", "()LZ84;", "v", "()Lco/bird/android/model/wire/WireBird;", "currentBird", "<init>", "(LEa;LgH;LpJ;Lcom/uber/autodispose/ScopeProvider;Ln54;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPrivateBirdPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdPresenter.kt\nco/bird/android/app/feature/ride/presenter/PrivateBirdPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,271:1\n199#2:272\n237#2:273\n180#2:274\n180#2:275\n180#2:276\n180#2:277\n237#2:278\n237#2:279\n237#2:280\n*S KotlinDebug\n*F\n+ 1 PrivateBirdPresenter.kt\nco/bird/android/app/feature/ride/presenter/PrivateBirdPresenterImpl\n*L\n71#1:272\n106#1:273\n116#1:274\n123#1:275\n130#1:276\n140#1:277\n162#1:278\n192#1:279\n235#1:280\n*E\n"})
/* renamed from: g54  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C41326g54 implements L44 {

    /* renamed from: a */
    public final InterfaceC1880Ea f81550a;

    /* renamed from: b */
    public final InterfaceC20792gH f81551b;

    /* renamed from: c */
    public final InterfaceC27246pJ f81552c;

    /* renamed from: d */
    public final ScopeProvider f81553d;

    /* renamed from: e */
    public final InterfaceC45477n54 f81554e;

    /* renamed from: f */
    public final C37791a94<Optional<WireBird>> f81555f;

    /* renamed from: g */
    public final Lazy f81556g;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g54$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C20726a extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C20726a(Object obj) {
            super(1, obj, C41326g54.class, "onChirpError", "onChirpError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C41326g54) this.receiver).m40080z(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g54$b */
    /* loaded from: classes2.dex */
    public static final class C20727b extends Lambda implements Function1<Unit, Unit> {
        public C20727b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C41326g54.this.m40082x();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g54$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C20728c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C20728c f81558b = new C20728c();

        public C20728c() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g54$d */
    /* loaded from: classes2.dex */
    public static final class C20729d extends Lambda implements Function1<Unit, Unit> {
        public C20729d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C41326g54.this.m40121K(true);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g54$e */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C20730e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C20730e f81560b = new C20730e();

        public C20730e() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g54$f */
    /* loaded from: classes2.dex */
    public static final class C20731f extends Lambda implements Function1<Unit, Unit> {
        public C20731f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C41326g54.this.m40121K(false);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g54$g */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C20732g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C20732g f81562b = new C20732g();

        public C20732g() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g54$h */
    /* loaded from: classes2.dex */
    public static final class C20733h extends Lambda implements Function1<Unit, Unit> {
        public C20733h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C41326g54.this.m40116P();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g54$i */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C20734i extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C20734i f81564b = new C20734i();

        public C20734i() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g54$j */
    /* loaded from: classes2.dex */
    public static final class C20735j extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ boolean f81566h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20735j(boolean z) {
            super(1);
            this.f81566h = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            C41326g54 c41326g54 = C41326g54.this;
            boolean z = this.f81566h;
            Intrinsics.checkNotNullExpressionValue(throwable, "throwable");
            c41326g54.m40118N(z, throwable);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g54$k */
    /* loaded from: classes2.dex */
    public static final class C20736k extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ boolean f81568h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20736k(boolean z) {
            super(1);
            this.f81568h = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            C41326g54 c41326g54 = C41326g54.this;
            boolean z = this.f81568h;
            Intrinsics.checkNotNullExpressionValue(throwable, "throwable");
            c41326g54.m40113S(z, throwable);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: g54$l */
    /* loaded from: classes2.dex */
    public static final class C20737l extends Lambda implements Function0<Z84<Optional<WireBird>>> {
        public C20737l() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<WireBird>> invoke() {
            return Z84.f47888d.m73663b(C41326g54.this.f81555f);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/BirdActionsAndSettings;", "it", "", "Lco/bird/android/model/PrivateBirdAction;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/BirdActionsAndSettings;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: g54$m */
    /* loaded from: classes2.dex */
    public static final class C20738m extends Lambda implements Function1<BirdActionsAndSettings, List<? extends PrivateBirdAction>> {

        /* renamed from: g */
        public static final C20738m f81570g = new C20738m();

        public C20738m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<PrivateBirdAction> invoke(BirdActionsAndSettings it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getActions();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "actionsAvailable", "", "Lco/bird/android/model/PrivateBirdAction;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPrivateBirdPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdPresenter.kt\nco/bird/android/app/feature/ride/presenter/PrivateBirdPresenterImpl$setPrivateBird$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,271:1\n1747#2,3:272\n1747#2,3:275\n*S KotlinDebug\n*F\n+ 1 PrivateBirdPresenter.kt\nco/bird/android/app/feature/ride/presenter/PrivateBirdPresenterImpl$setPrivateBird$2\n*L\n73#1:272,3\n74#1:275,3\n*E\n"})
    /* renamed from: g54$n */
    /* loaded from: classes2.dex */
    public static final class C20739n extends Lambda implements Function1<List<? extends PrivateBirdAction>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f81572h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20739n(WireBird wireBird) {
            super(1);
            this.f81572h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends PrivateBirdAction> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends PrivateBirdAction> actionsAvailable) {
            boolean z;
            boolean z2;
            boolean z3;
            Intrinsics.checkNotNullExpressionValue(actionsAvailable, "actionsAvailable");
            List<? extends PrivateBirdAction> list = actionsAvailable;
            boolean z4 = list instanceof Collection;
            boolean z5 = true;
            if (!z4 || !list.isEmpty()) {
                for (PrivateBirdAction privateBirdAction : list) {
                    if (privateBirdAction == PrivateBirdAction.LIGHTS) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (!z4 || !list.isEmpty()) {
                for (PrivateBirdAction privateBirdAction2 : list) {
                    if (privateBirdAction2 == PrivateBirdAction.LOCK) {
                        z3 = true;
                        continue;
                    } else {
                        z3 = false;
                        continue;
                    }
                    if (z3) {
                        break;
                    }
                }
            }
            z5 = false;
            C41326g54.this.f81554e.mo21803i(this.f81572h, z2, z5);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g54$o */
    /* loaded from: classes2.dex */
    public static final class C20740o extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C20740o f81573g = new C20740o();

        public C20740o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: g54$p */
    /* loaded from: classes2.dex */
    public static final class C20741p extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: h */
        public final /* synthetic */ boolean f81575h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20741p(boolean z) {
            super(1);
            this.f81575h = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            C41326g54 c41326g54 = C41326g54.this;
            boolean z = this.f81575h;
            Intrinsics.checkNotNullExpressionValue(throwable, "throwable");
            c41326g54.m40113S(z, throwable);
        }
    }

    public C41326g54(InterfaceC1880Ea analyticsManager, InterfaceC20792gH birdActionsManager, InterfaceC27246pJ bluetoothManager, ScopeProvider scopeProvider, InterfaceC45477n54 ui) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(birdActionsManager, "birdActionsManager");
        Intrinsics.checkNotNullParameter(bluetoothManager, "bluetoothManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f81550a = analyticsManager;
        this.f81551b = birdActionsManager;
        this.f81552c = bluetoothManager;
        this.f81553d = scopeProvider;
        this.f81554e = ui;
        this.f81555f = C37791a94.C10586a.create$default(C37791a94.f49908h, Optional.f63040c.m59034a(), null, 2, null);
        lazy = LazyKt__LazyJVMKt.lazy(new C20737l());
        this.f81556g = lazy;
    }

    /* renamed from: C */
    public static final void m40129C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m40128D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m40127E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m40126F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m40125G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m40124H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m40123I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m40122J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m40120L(C41326g54 this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m40117O(z);
    }

    /* renamed from: M */
    public static final void m40119M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m40115Q(C41326g54 this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m40112T(z);
    }

    /* renamed from: R */
    public static final void m40114R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final List m40111U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m40110V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m40109W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final InterfaceC23496h m40108X(C41326g54 this$0, WireBird wireBird, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.f81551b.mo39767e(wireBird.getId(), z);
    }

    /* renamed from: Y */
    public static final void m40107Y(C41326g54 this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m40112T(z);
    }

    /* renamed from: Z */
    public static final void m40106Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final void m40081y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: A */
    public final void m40131A() {
        C41318g46.m40157g("Successfully chirped bird.", new Object[0]);
    }

    /* renamed from: B */
    public void m40130B() {
        Object m33094as = this.f81554e.mo21807e().m33094as(AutoDispose.m45239a(this.f81553d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20727b c20727b = new C20727b();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: P44
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41326g54.m40125G(Function1.this, obj);
            }
        };
        final C20728c c20728c = C20728c.f81558b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Q44
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41326g54.m40124H(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f81554e.mo21808d().m33094as(AutoDispose.m45239a(this.f81553d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20729d c20729d = new C20729d();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: R44
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41326g54.m40123I(Function1.this, obj);
            }
        };
        final C20730e c20730e = C20730e.f81560b;
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: S44
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41326g54.m40122J(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f81554e.mo21806f().m33094as(AutoDispose.m45239a(this.f81553d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20731f c20731f = new C20731f();
        InterfaceC23484g interfaceC23484g3 = new InterfaceC23484g() { // from class: T44
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41326g54.m40129C(Function1.this, obj);
            }
        };
        final C20732g c20732g = C20732g.f81562b;
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g3, new InterfaceC23484g() { // from class: U44
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41326g54.m40128D(Function1.this, obj);
            }
        });
        Observable merge = Observable.merge(this.f81554e.mo21805g(), this.f81554e.mo21802j());
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      ui.lockClic…    ui.unlockClicks\n    )");
        Object m33094as4 = merge.m33094as(AutoDispose.m45239a(this.f81553d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C20733h c20733h = new C20733h();
        InterfaceC23484g interfaceC23484g4 = new InterfaceC23484g() { // from class: V44
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41326g54.m40127E(Function1.this, obj);
            }
        };
        final C20734i c20734i = C20734i.f81564b;
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g4, new InterfaceC23484g() { // from class: W44
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41326g54.m40126F(Function1.this, obj);
            }
        });
    }

    /* renamed from: K */
    public final void m40121K(final boolean z) {
        EnumC39894dg6 enumC39894dg6;
        WireBird m40084v = m40084v();
        if (m40084v == null) {
            return;
        }
        InterfaceC1880Ea interfaceC1880Ea = this.f81550a;
        if (z) {
            enumC39894dg6 = EnumC39894dg6.LIGHTS_ON;
        } else {
            enumC39894dg6 = EnumC39894dg6.LIGHTS_OFF;
        }
        interfaceC1880Ea.mo55905y(C41079fg6.m41038b(enumC39894dg6, EnumC40486eg6.RIDER_MAP, m40084v));
        AbstractC23461c m33070P = this.f81551b.mo39770b(m40084v.getId(), z).m33070P(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33070P, "birdActionsManager.light…dSchedulers.mainThread())");
        Object m33041n = m33070P.m33041n(AutoDispose.m45239a(this.f81553d));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: Y44
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C41326g54.m40120L(C41326g54.this, z);
            }
        };
        final C20735j c20735j = new C20735j(z);
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: Z44
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41326g54.m40119M(Function1.this, obj);
            }
        });
    }

    /* renamed from: N */
    public final void m40118N(boolean z, Throwable th) {
        int i;
        C41318g46.m40149o(th, "Failed to change light state", new Object[0]);
        InterfaceC45477n54 interfaceC45477n54 = this.f81554e;
        if (z) {
            i = C45871nl4.owned_bird_action_lights_on_error;
        } else {
            i = C45871nl4.owned_bird_action_lights_off_error;
        }
        interfaceC45477n54.mo21804h(i);
    }

    /* renamed from: O */
    public final void m40117O(boolean z) {
        int i;
        C41318g46.m40157g("Successfully turned on lights", new Object[0]);
        InterfaceC45477n54 interfaceC45477n54 = this.f81554e;
        if (z) {
            i = C45871nl4.owned_bird_action_lights_on;
        } else {
            i = C45871nl4.owned_bird_action_lights_off;
        }
        interfaceC45477n54.mo21809c(i);
    }

    /* renamed from: P */
    public final void m40116P() {
        EnumC39894dg6 enumC39894dg6;
        WireBird m40084v = m40084v();
        if (m40084v == null) {
            return;
        }
        final boolean z = !m40084v.getLocked();
        InterfaceC1880Ea interfaceC1880Ea = this.f81550a;
        if (z) {
            enumC39894dg6 = EnumC39894dg6.LOCK;
        } else {
            enumC39894dg6 = EnumC39894dg6.UNLOCK;
        }
        interfaceC1880Ea.mo55905y(C41079fg6.m41038b(enumC39894dg6, EnumC40486eg6.RIDER_MAP, m40084v));
        AbstractC23461c m33070P = this.f81551b.mo39767e(m40084v.getId(), z).m33070P(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33070P, "birdActionsManager.lock(…dSchedulers.mainThread())");
        Object m33041n = m33070P.m33041n(AutoDispose.m45239a(this.f81553d));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: a54
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C41326g54.m40115Q(C41326g54.this, z);
            }
        };
        final C20736k c20736k = new C20736k(z);
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: b54
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41326g54.m40114R(Function1.this, obj);
            }
        });
    }

    /* renamed from: S */
    public final void m40113S(boolean z, Throwable th) {
        int i;
        C41318g46.m40149o(th, "Failed to change lock state", new Object[0]);
        InterfaceC45477n54 interfaceC45477n54 = this.f81554e;
        if (z) {
            i = C45871nl4.owned_bird_action_lock_error;
        } else {
            i = C45871nl4.owned_bird_action_unlock_error;
        }
        interfaceC45477n54.mo21804h(i);
    }

    /* renamed from: T */
    public final void m40112T(boolean z) {
        int i;
        WireBird wireBird;
        C41318g46.m40157g("Successfully toggled lock.", new Object[0]);
        InterfaceC45477n54 interfaceC45477n54 = this.f81554e;
        if (z) {
            i = C45871nl4.bird_action_lock_success;
        } else {
            i = C45871nl4.bird_action_unlock_success;
        }
        interfaceC45477n54.mo21809c(i);
        WireBird m40084v = m40084v();
        if (m40084v != null) {
            wireBird = m40084v.copy((r91 & 1) != 0 ? m40084v.f66717id : null, (r91 & 2) != 0 ? m40084v.model : null, (r91 & 4) != 0 ? m40084v.taskId : null, (r91 & 8) != 0 ? m40084v.batteryLevel : 0, (r91 & 16) != 0 ? m40084v.estimatedRange : null, (r91 & 32) != 0 ? m40084v.distance : 0, (r91 & 64) != 0 ? m40084v.location : null, (r91 & 128) != 0 ? m40084v.code : null, (r91 & 256) != 0 ? m40084v.stickerId : null, (r91 & 512) != 0 ? m40084v.serialNumber : null, (r91 & 1024) != 0 ? m40084v.disconnected : false, (r91 & 2048) != 0 ? m40084v.collect : false, (r91 & 4096) != 0 ? m40084v.submerged : false, (r91 & 8192) != 0 ? m40084v.lost : false, (r91 & 16384) != 0 ? m40084v.locked : z, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? m40084v.ackLocked : z, (r91 & 65536) != 0 ? m40084v.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? m40084v.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? m40084v.broken : false, (r91 & 524288) != 0 ? m40084v.label : null, (r91 & 1048576) != 0 ? m40084v.actions : null, (r91 & 2097152) != 0 ? m40084v.bountyId : null, (r91 & 4194304) != 0 ? m40084v.bountyPrice : null, (r91 & 8388608) != 0 ? m40084v.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? m40084v.bountyLost : false, (r91 & 33554432) != 0 ? m40084v.bountyOverdue : false, (r91 & 67108864) != 0 ? m40084v.bountyKind : null, (r91 & 134217728) != 0 ? m40084v.brandName : null, (r91 & 268435456) != 0 ? m40084v.taskKind : null, (r91 & 536870912) != 0 ? m40084v.gpsAt : null, (r91 & 1073741824) != 0 ? m40084v.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? m40084v.token : null, (r92 & 1) != 0 ? m40084v.bluetooth : false, (r92 & 2) != 0 ? m40084v.cellular : false, (r92 & 4) != 0 ? m40084v.startedAt : null, (r92 & 8) != 0 ? m40084v.dueAt : null, (r92 & 16) != 0 ? m40084v.asleep : false, (r92 & 32) != 0 ? m40084v.imei : null, (r92 & 64) != 0 ? m40084v.boardProtocol : null, (r92 & 128) != 0 ? m40084v.physicalLock : null, (r92 & 256) != 0 ? m40084v.priorityCollect : false, (r92 & 512) != 0 ? m40084v.down : false, (r92 & 1024) != 0 ? m40084v.needsInspection : false, (r92 & 2048) != 0 ? m40084v.partnerId : null, (r92 & 4096) != 0 ? m40084v.nestId : null, (r92 & 8192) != 0 ? m40084v.lastRideEndedAt : null, (r92 & 16384) != 0 ? m40084v.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? m40084v.peril : false, (r92 & 65536) != 0 ? m40084v.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? m40084v.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? m40084v.offline : false, (r92 & 524288) != 0 ? m40084v.license : null, (r92 & 1048576) != 0 ? m40084v.areaKey : null, (r92 & 2097152) != 0 ? m40084v.fleetId : null, (r92 & 4194304) != 0 ? m40084v.nestPurpose : null, (r92 & 8388608) != 0 ? m40084v.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? m40084v.scannedAt : null, (r92 & 33554432) != 0 ? m40084v.badgeType : null, (r92 & 67108864) != 0 ? m40084v.bountyReasons : null, (r92 & 134217728) != 0 ? m40084v.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? m40084v.ephemeralId : null, (r92 & 536870912) != 0 ? m40084v.hasHelmet : false, (r92 & 1073741824) != 0 ? m40084v.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? m40084v.bleMacAddress : null, (r93 & 1) != 0 ? m40084v.cellId : null, (r93 & 2) != 0 ? m40084v.externalFeedType : null);
        } else {
            wireBird = null;
        }
        L44.C4731a.setPrivateBird$default(this, wireBird, false, 2, null);
    }

    @Override // p000.L44
    /* renamed from: a */
    public void mo40105a(WireBird wireBird, boolean z) {
        WireBird wireBird2;
        Optional.C14443a c14443a;
        C37791a94<Optional<WireBird>> c37791a94;
        WireBird wireBird3;
        final WireBird wireBird4;
        final C41326g54 c41326g54;
        AbstractC23461c m33034u;
        if (wireBird == null) {
            this.f81554e.mo21810b();
        } else {
            AbstractC23442F<BirdActionsAndSettings> mo39771a = this.f81551b.mo39771a(wireBird.getId());
            final C20738m c20738m = C20738m.f81570g;
            AbstractC23442F m33152N = mo39771a.m33157I(new InterfaceC23492o() { // from class: c54
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m40111U;
                    m40111U = C41326g54.m40111U(Function1.this, obj);
                    return m40111U;
                }
            }).m33152N(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33152N, "birdActionsManager.getAc…dSchedulers.mainThread())");
            Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f81553d));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C20739n c20739n = new C20739n(wireBird);
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: d54
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C41326g54.m40110V(Function1.this, obj);
                }
            };
            final C20740o c20740o = C20740o.f81573g;
            ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: e54
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C41326g54.m40109W(Function1.this, obj);
                }
            });
        }
        C37791a94<Optional<WireBird>> c37791a942 = this.f81555f;
        Optional.C14443a c14443a2 = Optional.f63040c;
        if (wireBird != null) {
            c14443a = c14443a2;
            c37791a94 = c37791a942;
            wireBird2 = wireBird;
            wireBird3 = wireBird.copy((r91 & 1) != 0 ? wireBird.f66717id : null, (r91 & 2) != 0 ? wireBird.model : null, (r91 & 4) != 0 ? wireBird.taskId : null, (r91 & 8) != 0 ? wireBird.batteryLevel : 0, (r91 & 16) != 0 ? wireBird.estimatedRange : null, (r91 & 32) != 0 ? wireBird.distance : 0, (r91 & 64) != 0 ? wireBird.location : null, (r91 & 128) != 0 ? wireBird.code : null, (r91 & 256) != 0 ? wireBird.stickerId : null, (r91 & 512) != 0 ? wireBird.serialNumber : null, (r91 & 1024) != 0 ? wireBird.disconnected : false, (r91 & 2048) != 0 ? wireBird.collect : false, (r91 & 4096) != 0 ? wireBird.submerged : false, (r91 & 8192) != 0 ? wireBird.lost : false, (r91 & 16384) != 0 ? wireBird.locked : false, (r91 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? wireBird.ackLocked : false, (r91 & 65536) != 0 ? wireBird.captive : false, (r91 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? wireBird.gpsFix : false, (r91 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? wireBird.broken : false, (r91 & 524288) != 0 ? wireBird.label : null, (r91 & 1048576) != 0 ? wireBird.actions : null, (r91 & 2097152) != 0 ? wireBird.bountyId : null, (r91 & 4194304) != 0 ? wireBird.bountyPrice : null, (r91 & 8388608) != 0 ? wireBird.bountyCurrency : null, (r91 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? wireBird.bountyLost : false, (r91 & 33554432) != 0 ? wireBird.bountyOverdue : false, (r91 & 67108864) != 0 ? wireBird.bountyKind : null, (r91 & 134217728) != 0 ? wireBird.brandName : null, (r91 & 268435456) != 0 ? wireBird.taskKind : null, (r91 & 536870912) != 0 ? wireBird.gpsAt : null, (r91 & 1073741824) != 0 ? wireBird.trackedAt : null, (r91 & Integer.MIN_VALUE) != 0 ? wireBird.token : null, (r92 & 1) != 0 ? wireBird.bluetooth : true, (r92 & 2) != 0 ? wireBird.cellular : false, (r92 & 4) != 0 ? wireBird.startedAt : null, (r92 & 8) != 0 ? wireBird.dueAt : null, (r92 & 16) != 0 ? wireBird.asleep : false, (r92 & 32) != 0 ? wireBird.imei : null, (r92 & 64) != 0 ? wireBird.boardProtocol : null, (r92 & 128) != 0 ? wireBird.physicalLock : null, (r92 & 256) != 0 ? wireBird.priorityCollect : false, (r92 & 512) != 0 ? wireBird.down : false, (r92 & 1024) != 0 ? wireBird.needsInspection : false, (r92 & 2048) != 0 ? wireBird.partnerId : null, (r92 & 4096) != 0 ? wireBird.nestId : null, (r92 & 8192) != 0 ? wireBird.lastRideEndedAt : null, (r92 & 16384) != 0 ? wireBird.partnerBirdState : null, (r92 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? wireBird.peril : false, (r92 & 65536) != 0 ? wireBird.deliverable : false, (r92 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? wireBird.lifecycle : null, (r92 & DateUtils.FORMAT_ABBREV_RELATIVE) != 0 ? wireBird.offline : false, (r92 & 524288) != 0 ? wireBird.license : null, (r92 & 1048576) != 0 ? wireBird.areaKey : null, (r92 & 2097152) != 0 ? wireBird.fleetId : null, (r92 & 4194304) != 0 ? wireBird.nestPurpose : null, (r92 & 8388608) != 0 ? wireBird.privateBird : null, (r92 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? wireBird.scannedAt : null, (r92 & 33554432) != 0 ? wireBird.badgeType : null, (r92 & 67108864) != 0 ? wireBird.bountyReasons : null, (r92 & 134217728) != 0 ? wireBird.isScanlessRideEligible : false, (r92 & 268435456) != 0 ? wireBird.ephemeralId : null, (r92 & 536870912) != 0 ? wireBird.hasHelmet : false, (r92 & 1073741824) != 0 ? wireBird.locationUpdatedAt : null, (r92 & Integer.MIN_VALUE) != 0 ? wireBird.bleMacAddress : null, (r93 & 1) != 0 ? wireBird.cellId : null, (r93 & 2) != 0 ? wireBird.externalFeedType : null);
        } else {
            wireBird2 = wireBird;
            c14443a = c14443a2;
            c37791a94 = c37791a942;
            wireBird3 = null;
        }
        c37791a94.accept(c14443a.m59033b(wireBird3));
        if (z && wireBird2 != null) {
            final boolean z2 = !wireBird.getLocked();
            if (!WireBirdKt.isAsleep(wireBird) && !wireBird.getAsleep()) {
                m33034u = AbstractC23461c.m33039p();
                wireBird4 = wireBird2;
                c41326g54 = this;
            } else {
                wireBird4 = wireBird2;
                c41326g54 = this;
                m33034u = c41326g54.f81551b.mo39769c(wireBird.getId(), wireBird.getModel(), false).m33034u(15L, TimeUnit.SECONDS);
            }
            AbstractC23461c m33070P = m33034u.m33049i(AbstractC23461c.m33035t(new Callable() { // from class: f54
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23496h m40108X;
                    m40108X = C41326g54.m40108X(C41326g54.this, wireBird4, z2);
                    return m40108X;
                }
            })).m33070P(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33070P, "if (privateBird.isAsleep…dSchedulers.mainThread())");
            Object m33041n = m33070P.m33041n(AutoDispose.m45239a(c41326g54.f81553d));
            Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
            InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: N44
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C41326g54.m40107Y(C41326g54.this, z2);
                }
            };
            final C20741p c20741p = new C20741p(z2);
            ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: O44
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C41326g54.m40106Z(Function1.this, obj);
                }
            });
        }
    }

    /* renamed from: v */
    public WireBird m40084v() {
        return m40083w().m73665a().m59035e();
    }

    /* renamed from: w */
    public final Z84<Optional<WireBird>> m40083w() {
        return (Z84) this.f81556g.getValue();
    }

    /* renamed from: x */
    public final void m40082x() {
        WireBird m40084v = m40084v();
        if (m40084v == null) {
            return;
        }
        this.f81550a.mo55905y(C41079fg6.m41038b(EnumC39894dg6.CHIRP, EnumC40486eg6.RIDER_MAP, m40084v));
        AbstractC23461c m33070P = InterfaceC27246pJ.C27247a.alarm$default(this.f81552c, m40084v, AlarmType.CHIRP, true, false, 8, null).firstOrError().m33159G().m33070P(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33070P, "bluetoothManager.alarm(b…dSchedulers.mainThread())");
        Object m33041n = m33070P.m33041n(AutoDispose.m45239a(this.f81553d));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: M44
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C41326g54.this.m40131A();
            }
        };
        final C20726a c20726a = new C20726a(this);
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: X44
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C41326g54.m40081y(Function1.this, obj);
            }
        });
    }

    /* renamed from: z */
    public final void m40080z(Throwable th) {
        C41318g46.m40149o(th, "Failed to chirp bird.", new Object[0]);
    }
}
