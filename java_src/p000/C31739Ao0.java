package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.command.errors.VehicleCommandException;
import co.bird.android.model.AlarmCommand;
import co.bird.android.model.AlarmOption;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.LightsCommand;
import co.bird.android.model.LockCommand;
import co.bird.android.model.SleepCommand;
import co.bird.android.model.SoftResetCommand;
import co.bird.android.model.UnlockBatteryCommand;
import co.bird.android.model.UnlockCableCommand;
import co.bird.android.model.UnlockCommand;
import co.bird.android.model.UnlockHelmetCommand;
import co.bird.android.model.VehicleCommand;
import co.bird.android.model.VehicleCommandKt;
import co.bird.android.model.VehicleConnection;
import co.bird.android.model.WakeCommand;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.extensions.Bird_Kt;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import io.reactivex.AbstractC24507p;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.subjects.C24552a;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C31739Ao0;
import p000.H31;
import p000.InterfaceC36185To0;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR(\u0010#\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010%\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u00040\u00040\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010 ¨\u0006("}, m28432d2 = {"LAo0;", "Luo0;", "", "onResume", "", "birdId", "u1", "t1", "LTo0;", C17296a.f69688o, "LTo0;", "commandManager", "Lom3;", "b", "Lom3;", "operatorManager", "Lrd5;", "c", "Lrd5;", "rxBleBirdBluetoothManager", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Llp0;", "e", "Llp0;", "ui", "Lio/reactivex/subjects/a;", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "f", "Lio/reactivex/subjects/a;", "v1", "()Lio/reactivex/subjects/a;", "birdSubject", "g", "birdIdSubject", "<init>", "(LTo0;Lom3;Lrd5;Lcom/uber/autodispose/ScopeProvider;Llp0;)V", "co.bird.android.feature.lib.command"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCommandDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandDelegate.kt\nco/bird/android/command/base/CommandDelegateImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,141:1\n237#2:142\n*S KotlinDebug\n*F\n+ 1 CommandDelegate.kt\nco/bird/android/command/base/CommandDelegateImpl\n*L\n129#1:142\n*E\n"})
/* renamed from: Ao0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C31739Ao0 implements InterfaceC50047uo0 {

    /* renamed from: a */
    public final InterfaceC36185To0 f1091a;

    /* renamed from: b */
    public final InterfaceC46473om3 f1092b;

    /* renamed from: c */
    public final InterfaceC48164rd5 f1093c;

    /* renamed from: d */
    public final ScopeProvider f1094d;

    /* renamed from: e */
    public final InterfaceC44721lp0 f1095e;

    /* renamed from: f */
    public final C24552a<WireBird> f1096f;

    /* renamed from: g */
    public final C24552a<String> f1097g;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ao0$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0221b extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C0221b f1113b = new C0221b();

        public C0221b() {
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

    public C31739Ao0(InterfaceC36185To0 commandManager, InterfaceC46473om3 operatorManager, InterfaceC48164rd5 rxBleBirdBluetoothManager, ScopeProvider scopeProvider, InterfaceC44721lp0 ui) {
        Intrinsics.checkNotNullParameter(commandManager, "commandManager");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(rxBleBirdBluetoothManager, "rxBleBirdBluetoothManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f1091a = commandManager;
        this.f1092b = operatorManager;
        this.f1093c = rxBleBirdBluetoothManager;
        this.f1094d = scopeProvider;
        this.f1095e = ui;
        C24552a<WireBird> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<WireBird>()");
        this.f1096f = m31922e;
        C24552a<String> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<String>()");
        this.f1097g = m31922e2;
    }

    /* renamed from: g */
    public static final InterfaceC23496h m115234g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m115233h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m115232i(C31739Ao0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f1095e.mo17122t1();
    }

    @Override // p000.InterfaceC50047uo0
    public void onResume() {
        C24552a<String> c24552a = this.f1097g;
        final C0212a c0212a = new C0212a();
        AbstractC23461c switchMapCompletable = c24552a.switchMapCompletable(new InterfaceC23492o() { // from class: vo0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m115234g;
                m115234g = C31739Ao0.m115234g(Function1.this, obj);
                return m115234g;
            }
        });
        final C0221b c0221b = C0221b.f1113b;
        AbstractC23461c m33066T = switchMapCompletable.m33084B(new InterfaceC23484g() { // from class: wo0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C31739Ao0.m115233h(Function1.this, obj);
            }
        }).m33085A(new InterfaceC23478a() { // from class: xo0
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C31739Ao0.m115232i(C31739Ao0.this);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "@CallSuper\n  override fu…r)\n      .subscribe()\n  }");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(this.f1094d));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    @Override // p000.InterfaceC50047uo0
    /* renamed from: t1 */
    public void mo9732t1() {
        this.f1095e.mo17122t1();
    }

    @Override // p000.InterfaceC50047uo0
    /* renamed from: u1 */
    public void mo9731u1(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.f1097g.onNext(birdId);
    }

    @Override // p000.InterfaceC50047uo0
    /* renamed from: v1 */
    public C24552a<WireBird> mo9730v1() {
        return this.f1096f;
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "birdId", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Ljava/lang/String;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ao0$a */
    /* loaded from: classes2.dex */
    public static final class C0212a extends Lambda implements Function1<String, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ao0$a$a */
        /* loaded from: classes2.dex */
        public static final class C0213a extends Lambda implements Function1<Bird, String> {

            /* renamed from: g */
            public static final C0213a f1099g = new C0213a();

            public C0213a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final String invoke(Bird bird) {
                Intrinsics.checkNotNullParameter(bird, "bird");
                return bird.getId();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u00060\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/VehicleCommand;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Ao0$a$b */
        /* loaded from: classes2.dex */
        public static final class C0214b extends Lambda implements Function1<Pair<? extends Bird, ? extends VehicleCommand>, Boolean> {

            /* renamed from: g */
            public static final C0214b f1100g = new C0214b();

            public C0214b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Bird, ? extends VehicleCommand> pair) {
                return invoke2((Pair<Bird, ? extends VehicleCommand>) pair);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Boolean invoke2(Pair<Bird, ? extends VehicleCommand> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                Bird bird = pair.component1();
                VehicleCommand component2 = pair.component2();
                Intrinsics.checkNotNullExpressionValue(bird, "bird");
                return Boolean.valueOf(Bird_Kt.isSwappable(bird) && VehicleCommandKt.isBluetooth(component2.getMethod()));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u00030\u00000\u00052\u001a\u0010\u0004\u001a\u0016\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/VehicleCommand;", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ao0$a$c */
        /* loaded from: classes2.dex */
        public static final class C0215c extends Lambda implements Function1<Pair<? extends Bird, ? extends VehicleCommand>, InterfaceC23434B<Pair<? extends Bird, ? extends VehicleCommand>>> {

            /* renamed from: g */
            public final /* synthetic */ C31739Ao0 f1101g;

            @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a2\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0005 \u0004*\u0018\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/VehicleConnection;", "it", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/VehicleCommand;", C17296a.f69688o, "(Lco/bird/android/model/VehicleConnection;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Ao0$a$c$a */
            /* loaded from: classes2.dex */
            public static final class C0216a extends Lambda implements Function1<VehicleConnection, Pair<? extends Bird, ? extends VehicleCommand>> {

                /* renamed from: g */
                public final /* synthetic */ Bird f1102g;

                /* renamed from: h */
                public final /* synthetic */ VehicleCommand f1103h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0216a(Bird bird, VehicleCommand vehicleCommand) {
                    super(1);
                    this.f1102g = bird;
                    this.f1103h = vehicleCommand;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final Pair<Bird, VehicleCommand> invoke(VehicleConnection it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new Pair<>(this.f1102g, this.f1103h);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0215c(C31739Ao0 c31739Ao0) {
                super(1);
                this.f1101g = c31739Ao0;
            }

            public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Pair) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ InterfaceC23434B<Pair<? extends Bird, ? extends VehicleCommand>> invoke(Pair<? extends Bird, ? extends VehicleCommand> pair) {
                return invoke2((Pair<Bird, ? extends VehicleCommand>) pair);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final InterfaceC23434B<Pair<Bird, VehicleCommand>> invoke2(Pair<Bird, ? extends VehicleCommand> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                Bird bird = pair.component1();
                InterfaceC48164rd5 interfaceC48164rd5 = this.f1101g.f1093c;
                Intrinsics.checkNotNullExpressionValue(bird, "bird");
                Observable<VehicleConnection> mo15682d = interfaceC48164rd5.mo15682d(C0613BT.m114026g(bird));
                final C0216a c0216a = new C0216a(bird, pair.component2());
                InterfaceC23434B map = mo15682d.map(new InterfaceC23492o() { // from class: Bo0
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair invoke$lambda$0;
                        invoke$lambda$0 = C31739Ao0.C0212a.C0215c.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map, "bird, command) ->\n      …p { Pair(bird, command) }");
                return map;
            }
        }

        public C0212a() {
            super(1);
        }

        /* renamed from: d */
        public static final String m115228d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (String) tmp0.invoke(obj);
        }

        public static final InterfaceC23496h invoke$lambda$1(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(String birdId) {
            Intrinsics.checkNotNullParameter(birdId, "birdId");
            C24523e c24523e = C24523e.f91168a;
            Observable<Bird> mo8118a = C31739Ao0.this.f1092b.mo8118a(birdId);
            final C0213a c0213a = C0213a.f1099g;
            Observable<Bird> distinct = mo8118a.distinct(new InterfaceC23492o() { // from class: yo0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    String m115228d;
                    m115228d = C31739Ao0.C0212a.m115228d(Function1.this, obj);
                    return m115228d;
                }
            });
            Intrinsics.checkNotNullExpressionValue(distinct, "operatorManager.streamBi…tinct { bird -> bird.id }");
            AbstractC24490k flowable = C37279Yf5.m74589F(c24523e.m31956a(distinct, C31739Ao0.this.f1095e.mo17130B()), C0214b.f1100g, new C0215c(C31739Ao0.this)).toFlowable(EnumC23460b.DROP);
            final C0217d c0217d = new C0217d(C31739Ao0.this);
            return flowable.m32162Z(new InterfaceC23492o() { // from class: zo0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h invoke$lambda$1;
                    invoke$lambda$1 = C31739Ao0.C0212a.invoke$lambda$1(Function1.this, obj);
                    return invoke$lambda$1;
                }
            });
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n \u0002*\u0004\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/Bird;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/VehicleCommand;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ao0$a$d */
        /* loaded from: classes2.dex */
        public static final class C0217d extends Lambda implements Function1<Pair<? extends Bird, ? extends VehicleCommand>, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ C31739Ao0 f1104g;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "duration", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Ao0$a$d$a */
            /* loaded from: classes2.dex */
            public static final class C0218a extends Lambda implements Function1<Integer, InterfaceC23496h> {

                /* renamed from: g */
                public final /* synthetic */ C31739Ao0 f1105g;

                /* renamed from: h */
                public final /* synthetic */ Bird f1106h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0218a(C31739Ao0 c31739Ao0, Bird bird) {
                    super(1);
                    this.f1105g = c31739Ao0;
                    this.f1106h = bird;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final InterfaceC23496h invoke(Integer duration) {
                    Intrinsics.checkNotNullParameter(duration, "duration");
                    InterfaceC36185To0 interfaceC36185To0 = this.f1105g.f1091a;
                    Bird bird = this.f1106h;
                    Intrinsics.checkNotNullExpressionValue(bird, "bird");
                    return interfaceC36185To0.mo31809f(bird, duration.intValue());
                }
            }

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Ao0$a$d$b */
            /* loaded from: classes2.dex */
            public static final class C0219b extends Lambda implements Function1<DialogResponse, InterfaceC23496h> {

                /* renamed from: g */
                public final /* synthetic */ C31739Ao0 f1107g;

                /* renamed from: h */
                public final /* synthetic */ Bird f1108h;

                /* renamed from: i */
                public final /* synthetic */ VehicleCommand f1109i;

                /* renamed from: j */
                public final /* synthetic */ String f1110j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0219b(C31739Ao0 c31739Ao0, Bird bird, VehicleCommand vehicleCommand, String str) {
                    super(1);
                    this.f1107g = c31739Ao0;
                    this.f1108h = bird;
                    this.f1109i = vehicleCommand;
                    this.f1110j = str;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final InterfaceC23496h invoke(DialogResponse response) {
                    Intrinsics.checkNotNullParameter(response, "response");
                    if (response == DialogResponse.OK) {
                        InterfaceC36185To0 interfaceC36185To0 = this.f1107g.f1091a;
                        Bird bird = this.f1108h;
                        Intrinsics.checkNotNullExpressionValue(bird, "bird");
                        return interfaceC36185To0.mo31810e(bird, true, VehicleCommandKt.isBluetooth(this.f1109i.getMethod()), this.f1110j);
                    }
                    this.f1107g.f1095e.mo17128Jd(this.f1109i);
                    return AbstractC23461c.m33039p();
                }
            }

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: Ao0$a$d$c */
            /* loaded from: classes2.dex */
            public static final class C0220c extends Lambda implements Function1<Throwable, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C31739Ao0 f1111g;

                /* renamed from: h */
                public final /* synthetic */ VehicleCommand f1112h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0220c(C31739Ao0 c31739Ao0, VehicleCommand vehicleCommand) {
                    super(1);
                    this.f1111g = c31739Ao0;
                    this.f1112h = vehicleCommand;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable e) {
                    Intrinsics.checkNotNullExpressionValue(e, "e");
                    C41318g46.m40159e(new VehicleCommandException(e));
                    this.f1111g.f1095e.mo17128Jd(this.f1112h);
                    this.f1111g.f1095e.mo17126M3(this.f1112h);
                    this.f1111g.f1095e.vibrate(1000L);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0217d(C31739Ao0 c31739Ao0) {
                super(1);
                this.f1104g = c31739Ao0;
            }

            /* renamed from: g */
            public static final void m115218g(C31739Ao0 this$0, VehicleCommand command) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(command, "$command");
                this$0.f1095e.mo17128Jd(command);
            }

            /* renamed from: h */
            public static final InterfaceC23496h m115217h(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC23496h) tmp0.invoke(obj);
            }

            /* renamed from: i */
            public static final void m115216i(C31739Ao0 this$0, VehicleCommand command) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(command, "$command");
                this$0.f1095e.mo17128Jd(command);
                this$0.f1095e.mo17121v9(command);
                this$0.f1095e.vibrate(250L);
            }

            public static final InterfaceC23496h invoke$lambda$1(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC23496h) tmp0.invoke(obj);
            }

            /* renamed from: j */
            public static final void m115215j(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            /* renamed from: k */
            public static final InterfaceC23496h m115214k(C31739Ao0 this$0, Bird bird) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                InterfaceC36185To0 interfaceC36185To0 = this$0.f1091a;
                Intrinsics.checkNotNullExpressionValue(bird, "bird");
                return InterfaceC36185To0.C7924a.refreshBirdAckLockStatus$default(interfaceC36185To0, bird, 0L, 0L, 6, null);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final InterfaceC23496h invoke2(Pair<Bird, ? extends VehicleCommand> pair) {
                AbstractC23461c m33039p;
                AbstractC23461c m33035t;
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                final Bird bird = pair.component1();
                final VehicleCommand component2 = pair.component2();
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                boolean z = component2 instanceof LockCommand;
                boolean z2 = true;
                if (z) {
                    InterfaceC36185To0 interfaceC36185To0 = this.f1104g.f1091a;
                    Intrinsics.checkNotNullExpressionValue(bird, "bird");
                    m33039p = interfaceC36185To0.mo31814a(bird, true, VehicleCommandKt.isBluetooth(component2.getMethod()));
                } else if (component2 instanceof UnlockCommand) {
                    InterfaceC36185To0 interfaceC36185To02 = this.f1104g.f1091a;
                    Intrinsics.checkNotNullExpressionValue(bird, "bird");
                    m33039p = interfaceC36185To02.mo31814a(bird, false, VehicleCommandKt.isBluetooth(component2.getMethod()));
                } else if (component2 instanceof UnlockBatteryCommand) {
                    InterfaceC36185To0 interfaceC36185To03 = this.f1104g.f1091a;
                    Intrinsics.checkNotNullExpressionValue(bird, "bird");
                    m33039p = interfaceC36185To03.mo31804k(bird, VehicleCommandKt.isBluetooth(component2.getMethod()));
                } else if (component2 instanceof UnlockCableCommand) {
                    InterfaceC36185To0 interfaceC36185To04 = this.f1104g.f1091a;
                    Intrinsics.checkNotNullExpressionValue(bird, "bird");
                    m33039p = interfaceC36185To04.mo31812c(bird, VehicleCommandKt.isBluetooth(component2.getMethod()));
                } else if (component2 instanceof UnlockHelmetCommand) {
                    InterfaceC36185To0 interfaceC36185To05 = this.f1104g.f1091a;
                    Intrinsics.checkNotNullExpressionValue(bird, "bird");
                    m33039p = interfaceC36185To05.mo31808g(bird, VehicleCommandKt.isBluetooth(component2.getMethod()));
                } else if (component2 instanceof AlarmCommand) {
                    List<AlarmOption> options = ((AlarmCommand) component2).getOptions();
                    if (options == null || !(!options.isEmpty())) {
                        z2 = false;
                    }
                    if (z2) {
                        AbstractC24507p<Integer> mo17124Sa = this.f1104g.f1095e.mo17124Sa(options);
                        final C31739Ao0 c31739Ao0 = this.f1104g;
                        AbstractC24507p<Integer> m32031n = mo17124Sa.m32031n(new InterfaceC23478a() { // from class: Co0
                            @Override // io.reactivex.functions.InterfaceC23478a
                            public final void run() {
                                C31739Ao0.C0212a.C0217d.m115218g(C31739Ao0.this, component2);
                            }
                        });
                        final C0218a c0218a = new C0218a(this.f1104g, bird);
                        m33039p = m32031n.m32074A(new InterfaceC23492o() { // from class: Do0
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj) {
                                InterfaceC23496h invoke$lambda$1;
                                invoke$lambda$1 = C31739Ao0.C0212a.C0217d.invoke$lambda$1(Function1.this, obj);
                                return invoke$lambda$1;
                            }
                        });
                    } else {
                        InterfaceC36185To0 interfaceC36185To06 = this.f1104g.f1091a;
                        Intrinsics.checkNotNullExpressionValue(bird, "bird");
                        m33039p = interfaceC36185To06.mo31813b(bird, VehicleCommandKt.isBluetooth(component2.getMethod()));
                    }
                    Intrinsics.checkNotNullExpressionValue(m33039p, "@CallSuper\n  override fu…r)\n      .subscribe()\n  }");
                } else if (component2 instanceof SleepCommand) {
                    AbstractC23442F dialog$default = H31.C3014a.dialog$default(this.f1104g.f1095e, YD5.f44851d, false, false, 6, null);
                    final C0219b c0219b = new C0219b(this.f1104g, bird, component2, uuid);
                    m33039p = dialog$default.m33164B(new InterfaceC23492o() { // from class: Eo0
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC23496h m115217h;
                            m115217h = C31739Ao0.C0212a.C0217d.m115217h(Function1.this, obj);
                            return m115217h;
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(m33039p, "@CallSuper\n  override fu…r)\n      .subscribe()\n  }");
                } else if (component2 instanceof WakeCommand) {
                    InterfaceC36185To0 interfaceC36185To07 = this.f1104g.f1091a;
                    Intrinsics.checkNotNullExpressionValue(bird, "bird");
                    m33039p = interfaceC36185To07.mo31810e(bird, false, VehicleCommandKt.isBluetooth(component2.getMethod()), uuid);
                } else if (component2 instanceof LightsCommand) {
                    InterfaceC36185To0 interfaceC36185To08 = this.f1104g.f1091a;
                    Intrinsics.checkNotNullExpressionValue(bird, "bird");
                    m33039p = interfaceC36185To08.mo31805j(bird);
                } else if (component2 instanceof SoftResetCommand) {
                    InterfaceC36185To0 interfaceC36185To09 = this.f1104g.f1091a;
                    Intrinsics.checkNotNullExpressionValue(bird, "bird");
                    m33039p = interfaceC36185To09.mo31807h(bird);
                } else {
                    m33039p = AbstractC23461c.m33039p();
                    Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
                }
                AbstractC23461c m33070P = C28237sD.progress$default(m33039p, this.f1104g.f1095e, 0, 2, (Object) null).m33070P(C23454a.m33087a());
                final C31739Ao0 c31739Ao02 = this.f1104g;
                AbstractC23461c m33065U = m33070P.m33029z(new InterfaceC23478a() { // from class: Fo0
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        C31739Ao0.C0212a.C0217d.m115216i(C31739Ao0.this, component2);
                    }
                }).m33065U(2L);
                final C0220c c0220c = new C0220c(this.f1104g, component2);
                AbstractC23461c m33084B = m33065U.m33084B(new InterfaceC23484g() { // from class: Go0
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C31739Ao0.C0212a.C0217d.m115215j(Function1.this, obj);
                    }
                });
                if (!z && !(component2 instanceof UnlockCommand)) {
                    m33035t = AbstractC23461c.m33039p();
                } else {
                    final C31739Ao0 c31739Ao03 = this.f1104g;
                    m33035t = AbstractC23461c.m33035t(new Callable() { // from class: Ho0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            InterfaceC23496h m115214k;
                            m115214k = C31739Ao0.C0212a.C0217d.m115214k(C31739Ao0.this, bird);
                            return m115214k;
                        }
                    });
                }
                return m33084B.m33049i(m33035t);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends Bird, ? extends VehicleCommand> pair) {
                return invoke2((Pair<Bird, ? extends VehicleCommand>) pair);
            }
        }
    }
}
