package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.Vehicle;
import co.bird.android.model.VehicleKt;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireDisplayValue;
import co.bird.android.model.wire.WireVehicleDiagnostics;
import co.bird.api.error.RetrofitException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C43224jI1;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 52\u00020\u0001:\u0001\fBA\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#¢\u0006\u0004\b3\u00104J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)R \u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010)¨\u00066"}, m28432d2 = {"LjI1;", "", "Lco/bird/android/model/wire/WireBird;", "bird", "", "s", "H", "", "itemId", "", "G", "Lcom/uber/autodispose/ScopeProvider;", C17296a.f69688o, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LqI1;", "b", "LqI1;", "healthCheckUi", "Le13;", "c", "Le13;", "navigator", "LTq4;", DateTokenConverter.CONVERTER_KEY, "LTq4;", "reactiveConfig", "Lcm6;", "e", "Lcm6;", "converter", "LpJ;", "f", "LpJ;", "birdBluetoothManager", "Ltl6;", "g", "Ltl6;", "vehicleDiagnosticsManager", "Lio/reactivex/subjects/a;", "h", "Lio/reactivex/subjects/a;", "scanExceptionSubject", "i", "scanTriggerSubject", "j", "softResetTriggerSubject", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireVehicleDiagnostics;", "k", "vehicleDiagnosticsSubject", "<init>", "(Lcom/uber/autodispose/ScopeProvider;LqI1;Le13;LTq4;Lcm6;LpJ;Ltl6;)V", "l", "health-check_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHealthCheckPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthCheckPresenter.kt\nco/bird/android/feature/healthcheck/HealthCheckPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/ObservablesKt\n*L\n1#1,191:1\n180#2:192\n180#2:193\n180#2:194\n180#2:196\n128#3:195\n*S KotlinDebug\n*F\n+ 1 HealthCheckPresenter.kt\nco/bird/android/feature/healthcheck/HealthCheckPresenter\n*L\n99#1:192\n119#1:193\n134#1:194\n151#1:196\n150#1:195\n*E\n"})
/* renamed from: jI1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43224jI1 {

    /* renamed from: l */
    public static final C24773a f92445l = new C24773a(null);

    /* renamed from: a */
    public final ScopeProvider f92446a;

    /* renamed from: b */
    public final C47375qI1 f92447b;

    /* renamed from: c */
    public final InterfaceC40099e13 f92448c;

    /* renamed from: d */
    public final C36207Tq4 f92449d;

    /* renamed from: e */
    public final InterfaceC39343cm6 f92450e;

    /* renamed from: f */
    public final InterfaceC27246pJ f92451f;

    /* renamed from: g */
    public final InterfaceC49430tl6 f92452g;

    /* renamed from: h */
    public final C24552a<Boolean> f92453h;

    /* renamed from: i */
    public final C24552a<Unit> f92454i;

    /* renamed from: j */
    public final C24552a<Boolean> f92455j;

    /* renamed from: k */
    public final C24552a<Optional<WireVehicleDiagnostics>> f92456k;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LjI1$a;", "", "", "DELAY_SCAN_AFTER_SOFT_RESET_COMMAND_SECONDS", "J", "<init>", "()V", "health-check_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: jI1$a */
    /* loaded from: classes3.dex */
    public static final class C24773a {
        public /* synthetic */ C24773a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C24773a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jI1$b */
    /* loaded from: classes3.dex */
    public static final class C24774b extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C24774b f92457g = new C24774b();

        public C24774b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jI1$c */
    /* loaded from: classes3.dex */
    public static final class C24775c extends Lambda implements Function1<Boolean, Unit> {
        public C24775c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            C43224jI1.this.f92447b.m17678m();
            C43224jI1.this.f92447b.m17688c();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jI1$d */
    /* loaded from: classes3.dex */
    public static final class C24776d extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends Vehicle>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f92460h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24776d(WireBird wireBird) {
            super(1);
            this.f92460h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Vehicle> invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C43224jI1.this.f92451f.mo19545m(this.f92460h).delay(30L, TimeUnit.SECONDS);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jI1$e */
    /* loaded from: classes3.dex */
    public static final class C24777e extends Lambda implements Function1<Vehicle, Unit> {
        public C24777e() {
            super(1);
        }

        /* renamed from: a */
        public final void m30844a(Vehicle vehicle) {
            C43224jI1.this.f92454i.onNext(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Vehicle vehicle) {
            m30844a(vehicle);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jI1$f */
    /* loaded from: classes3.dex */
    public static final class C24778f extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Boolean>> {
        public C24778f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Boolean> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C43224jI1.this.f92451f.mo19541q();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "bluetoothEnabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jI1$g */
    /* loaded from: classes3.dex */
    public static final class C24779g extends Lambda implements Function1<Boolean, Unit> {
        public C24779g() {
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
            C47375qI1.showScanRetry$default(C43224jI1.this.f92447b, null, 1, null);
            C43224jI1.this.f92453h.onNext(Boolean.TRUE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jI1$h */
    /* loaded from: classes3.dex */
    public static final class C24780h extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C24780h f92464g = new C24780h();

        public C24780h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jI1$i */
    /* loaded from: classes3.dex */
    public static final class C24781i extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Unit> {
        public C24781i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            invoke2((Pair<Boolean, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Boolean> pair) {
            Boolean softResetTriggered = pair.component2();
            Intrinsics.checkNotNullExpressionValue(softResetTriggered, "softResetTriggered");
            if (softResetTriggered.booleanValue()) {
                C43224jI1.this.f92447b.m17678m();
            } else {
                C43224jI1.this.f92447b.m17681j();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", "vehicleOptional", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jI1$k */
    /* loaded from: classes3.dex */
    public static final class C24785k extends Lambda implements Function1<Optional<Vehicle>, Unit> {
        public C24785k() {
            super(1);
        }

        /* renamed from: a */
        public final void m30837a(Optional<Vehicle> optional) {
            if (!optional.m59037c()) {
                C47375qI1.showScanRetry$default(C43224jI1.this.f92447b, null, 1, null);
                C43224jI1.this.f92453h.onNext(Boolean.TRUE);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<Vehicle> optional) {
            m30837a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Vehicle;", "vehicleOptional", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireVehicleDiagnostics;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/buava/Optional;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jI1$l */
    /* loaded from: classes3.dex */
    public static final class C24786l extends Lambda implements Function1<Optional<Vehicle>, InterfaceC23434B<? extends Optional<WireVehicleDiagnostics>>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f92472h;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: jI1$l$a */
        /* loaded from: classes3.dex */
        public static final class C24787a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C43224jI1 f92473g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24787a(C43224jI1 c43224jI1) {
                super(1);
                this.f92473g = c43224jI1;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (th instanceof RetrofitException) {
                    String m11932c = ((C49375tg1) ((RetrofitException) th).m53929a(C49375tg1.class)).m11932c();
                    this.f92473g.f92456k.onNext(Optional.f63040c.m59034a());
                    this.f92473g.f92447b.m17680k(m11932c);
                    this.f92473g.f92453h.onNext(Boolean.TRUE);
                }
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0000 \u0004*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0000 \u0004*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireVehicleDiagnostics;", "it", "Lio/reactivex/B;", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireVehicleDiagnostics;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: jI1$l$b */
        /* loaded from: classes3.dex */
        public static final class C24788b extends Lambda implements Function1<WireVehicleDiagnostics, InterfaceC23434B<? extends Optional<WireVehicleDiagnostics>>> {

            /* renamed from: g */
            public static final C24788b f92474g = new C24788b();

            public C24788b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23434B<? extends Optional<WireVehicleDiagnostics>> invoke(WireVehicleDiagnostics it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Observable.just(Optional.f63040c.m59032c(it));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireVehicleDiagnostics;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: jI1$l$c */
        /* loaded from: classes3.dex */
        public static final class C24789c extends Lambda implements Function1<Throwable, Optional<WireVehicleDiagnostics>> {

            /* renamed from: g */
            public static final C24789c f92475g = new C24789c();

            public C24789c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<WireVehicleDiagnostics> invoke(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional.f63040c.m59034a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24786l(WireBird wireBird) {
            super(1);
            this.f92472h = wireBird;
        }

        /* renamed from: e */
        public static final InterfaceC23434B m30832e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23434B) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final Optional m30831f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23434B<? extends Optional<WireVehicleDiagnostics>> invoke(Optional<Vehicle> vehicleOptional) {
            Intrinsics.checkNotNullParameter(vehicleOptional, "vehicleOptional");
            if (vehicleOptional.m59037c()) {
                Vehicle m59038b = vehicleOptional.m59038b();
                Intrinsics.checkNotNullExpressionValue(m59038b, "vehicleOptional.get()");
                Vehicle vehicle = m59038b;
                AbstractC23442F<WireVehicleDiagnostics> m33152N = C43224jI1.this.f92452g.mo9799a(this.f92472h.getId(), vehicle.getImei(), vehicle.getIccid(), vehicle.getVehicleVersion().getStmVersion(), VehicleKt.faultCodes(vehicle)).m33146T(2L).m33152N(C23454a.m33087a());
                final C24787a c24787a = new C24787a(C43224jI1.this);
                AbstractC23442F<WireVehicleDiagnostics> m33106t = m33152N.m33106t(new InterfaceC23484g() { // from class: mI1
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C43224jI1.C24786l.invoke$lambda$0(Function1.this, obj);
                    }
                });
                final C24788b c24788b = C24788b.f92474g;
                Observable<R> m33162D = m33106t.m33162D(new InterfaceC23492o() { // from class: nI1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23434B m30832e;
                        m30832e = C43224jI1.C24786l.m30832e(Function1.this, obj);
                        return m30832e;
                    }
                });
                final C24789c c24789c = C24789c.f92475g;
                return m33162D.onErrorReturn(new InterfaceC23492o() { // from class: oI1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Optional m30831f;
                        m30831f = C43224jI1.C24786l.m30831f(Function1.this, obj);
                        return m30831f;
                    }
                });
            }
            return Observable.just(Optional.f63040c.m59034a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireVehicleDiagnostics;", "kotlin.jvm.PlatformType", "diagnosticsOptional", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jI1$m */
    /* loaded from: classes3.dex */
    public static final class C24790m extends Lambda implements Function1<Optional<WireVehicleDiagnostics>, Unit> {
        public C24790m() {
            super(1);
        }

        /* renamed from: a */
        public final void m30828a(Optional<WireVehicleDiagnostics> optional) {
            C43224jI1.this.f92456k.onNext(optional);
            C43224jI1.this.f92453h.onNext(Boolean.valueOf(!optional.m59037c()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<WireVehicleDiagnostics> optional) {
            m30828a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jI1$n */
    /* loaded from: classes3.dex */
    public static final class C24791n extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C24791n f92477g = new C24791n();

        public C24791n() {
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

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\u0007\u001a\u00028\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"T", "T1", "T2", "T3", "t", "t1", "t2", "t3", "Lwb4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/ObservablesKt$withLatestFrom$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: jI1$o */
    /* loaded from: classes3.dex */
    public static final class C24792o<T1, T2, T3, T4, R> implements InterfaceC23486i {

        /* renamed from: a */
        public static final C24792o<T1, T2, T3, T4, R> f92478a = new C24792o<>();

        @Override // io.reactivex.functions.InterfaceC23486i
        /* renamed from: a */
        public final C51106wb4<Unit, T1, T2, T3> apply(Unit unit, T1 t1, T2 t2, T3 t3) {
            return new C51106wb4<>(unit, t1, t2, t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireVehicleDiagnostics;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jI1$p */
    /* loaded from: classes3.dex */
    public static final class C24793p extends Lambda implements Function1<Optional<WireVehicleDiagnostics>, Boolean> {

        /* renamed from: g */
        public static final C24793p f92479g = new C24793p();

        public C24793p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<WireVehicleDiagnostics> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001aª\u0001\u0012N\b\u0001\u0012J\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003*$\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00070\u0007 \u0003*T\u0012N\b\u0001\u0012J\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003*$\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireVehicleDiagnostics;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lkotlin/Triple;", "", "LH6;", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jI1$q */
    /* loaded from: classes3.dex */
    public static final class C24794q extends Lambda implements Function1<Pair<? extends Optional<WireVehicleDiagnostics>, ? extends Boolean>, InterfaceC23447K<? extends Triple<? extends WireVehicleDiagnostics, ? extends List<? extends C3023H6>, ? extends Boolean>>> {

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001aJ\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*$\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "LH6;", "it", "Lkotlin/Triple;", "Lco/bird/android/model/wire/WireVehicleDiagnostics;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: jI1$q$a */
        /* loaded from: classes3.dex */
        public static final class C24795a extends Lambda implements Function1<List<? extends C3023H6>, Triple<? extends WireVehicleDiagnostics, ? extends List<? extends C3023H6>, ? extends Boolean>> {

            /* renamed from: g */
            public final /* synthetic */ WireVehicleDiagnostics f92481g;

            /* renamed from: h */
            public final /* synthetic */ Boolean f92482h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24795a(WireVehicleDiagnostics wireVehicleDiagnostics, Boolean bool) {
                super(1);
                this.f92481g = wireVehicleDiagnostics;
                this.f92482h = bool;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Triple<WireVehicleDiagnostics, List<C3023H6>, Boolean> invoke(List<C3023H6> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Triple<>(this.f92481g, it, this.f92482h);
            }
        }

        public C24794q() {
            super(1);
        }

        /* renamed from: c */
        public static final Triple m30823c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Triple<WireVehicleDiagnostics, List<C3023H6>, Boolean>> invoke(Pair<Optional<WireVehicleDiagnostics>, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            WireVehicleDiagnostics m59038b = pair.component1().m59038b();
            AbstractC23442F<List<C3023H6>> mo42564a = C43224jI1.this.f92450e.mo42564a(m59038b.getVehFaults());
            final C24795a c24795a = new C24795a(m59038b, pair.component2());
            return mo42564a.m33157I(new InterfaceC23492o() { // from class: pI1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Triple m30823c;
                    m30823c = C43224jI1.C24794q.m30823c(Function1.this, obj);
                    return m30823c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072N\u0010\u0006\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*$\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/wire/WireVehicleDiagnostics;", "", "LH6;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jI1$r */
    /* loaded from: classes3.dex */
    public static final class C24796r extends Lambda implements Function1<Triple<? extends WireVehicleDiagnostics, ? extends List<? extends C3023H6>, ? extends Boolean>, Unit> {
        public C24796r() {
            super(1);
        }

        /* renamed from: a */
        public final void m30821a(Triple<WireVehicleDiagnostics, ? extends List<C3023H6>, Boolean> triple) {
            List<C3023H6> vehicleFaults = triple.component2();
            Boolean component3 = triple.component3();
            C47375qI1 c47375qI1 = C43224jI1.this.f92447b;
            Intrinsics.checkNotNullExpressionValue(vehicleFaults, "vehicleFaults");
            c47375qI1.m17689b(vehicleFaults);
            C43224jI1.this.f92447b.m17683h(triple.component1().getLastTrack());
            if (vehicleFaults.isEmpty()) {
                C43224jI1.this.f92447b.m17682i();
                return;
            }
            C43224jI1.this.f92447b.m17684g();
            if (!component3.booleanValue()) {
                C43224jI1.this.f92447b.m17679l();
            } else {
                C43224jI1.this.f92447b.m17685f();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends WireVehicleDiagnostics, ? extends List<? extends C3023H6>, ? extends Boolean> triple) {
            m30821a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: jI1$s */
    /* loaded from: classes3.dex */
    public static final class C24797s extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C24797s f92484g = new C24797s();

        public C24797s() {
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

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00012\u0087\u0001\u0010\u0006\u001a\u0082\u0001\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0003*@\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lwb4;", "", "", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireVehicleDiagnostics;", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lwb4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHealthCheckPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthCheckPresenter.kt\nco/bird/android/feature/healthcheck/HealthCheckPresenter$onResume$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,191:1\n1549#2:192\n1620#2,3:193\n*S KotlinDebug\n*F\n+ 1 HealthCheckPresenter.kt\nco/bird/android/feature/healthcheck/HealthCheckPresenter$onResume$5\n*L\n157#1:192\n157#1:193,3\n*E\n"})
    /* renamed from: jI1$t */
    /* loaded from: classes3.dex */
    public static final class C24798t extends Lambda implements Function1<C51106wb4<? extends Unit, ? extends Boolean, ? extends Boolean, ? extends Optional<WireVehicleDiagnostics>>, Unit> {
        public C24798t() {
            super(1);
        }

        /* renamed from: a */
        public final void m30820a(C51106wb4<Unit, Boolean, Boolean, Optional<WireVehicleDiagnostics>> c51106wb4) {
            int collectionSizeOrDefault;
            String replace$default;
            Boolean scanException = c51106wb4.m6613b();
            Boolean m6612c = c51106wb4.m6612c();
            Optional<WireVehicleDiagnostics> m6611d = c51106wb4.m6611d();
            Intrinsics.checkNotNullExpressionValue(scanException, "scanException");
            if (scanException.booleanValue()) {
                C43224jI1.this.f92454i.onNext(Unit.INSTANCE);
            } else if (!m6612c.booleanValue()) {
                C43224jI1.this.f92455j.onNext(Boolean.TRUE);
            } else if (m6611d.m59037c()) {
                List<WireDisplayValue> vehFaults = m6611d.m59038b().getVehFaults();
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(vehFaults, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (WireDisplayValue wireDisplayValue : vehFaults) {
                    replace$default = StringsKt__StringsJVMKt.replace$default(wireDisplayValue.getTitle(), " ", "_", false, 4, (Object) null);
                    arrayList.add(replace$default);
                }
                C43224jI1.this.f92448c.mo37074W3(arrayList);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C51106wb4<? extends Unit, ? extends Boolean, ? extends Boolean, ? extends Optional<WireVehicleDiagnostics>> c51106wb4) {
            m30820a(c51106wb4);
            return Unit.INSTANCE;
        }
    }

    public C43224jI1(ScopeProvider scopeProvider, C47375qI1 healthCheckUi, InterfaceC40099e13 navigator, C36207Tq4 reactiveConfig, InterfaceC39343cm6 converter, InterfaceC27246pJ birdBluetoothManager, InterfaceC49430tl6 vehicleDiagnosticsManager) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(healthCheckUi, "healthCheckUi");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(birdBluetoothManager, "birdBluetoothManager");
        Intrinsics.checkNotNullParameter(vehicleDiagnosticsManager, "vehicleDiagnosticsManager");
        this.f92446a = scopeProvider;
        this.f92447b = healthCheckUi;
        this.f92448c = navigator;
        this.f92449d = reactiveConfig;
        this.f92450e = converter;
        this.f92451f = birdBluetoothManager;
        this.f92452g = vehicleDiagnosticsManager;
        Boolean bool = Boolean.FALSE;
        C24552a<Boolean> m31921g = C24552a.m31921g(bool);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(false)");
        this.f92453h = m31921g;
        C24552a<Unit> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create()");
        this.f92454i = m31922e;
        C24552a<Boolean> m31921g2 = C24552a.m31921g(bool);
        Intrinsics.checkNotNullExpressionValue(m31921g2, "createDefault(false)");
        this.f92455j = m31921g2;
        C24552a<Optional<WireVehicleDiagnostics>> m31921g3 = C24552a.m31921g(Optional.f63040c.m59034a());
        Intrinsics.checkNotNullExpressionValue(m31921g3, "createDefault(Optional.absent())");
        this.f92456k = m31921g3;
    }

    /* renamed from: A */
    public static final InterfaceC23434B m30883A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m30882B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC23434B m30881C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m30880D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m30879E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final boolean m30878F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: I */
    public static final boolean m30875I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: J */
    public static final InterfaceC23447K m30874J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m30873K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m30872L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m30871M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final InterfaceC23447K m30851t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m30850u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m30849v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final InterfaceC23434B m30848w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m30847x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final boolean m30846y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: z */
    public static final void m30845z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public final boolean m30877G(int i) {
        Long valueOf;
        if (i == C48795sh4.healthFAQ) {
            String articleId = this.f92449d.m82623f8().m73665a().getOperatorConfig().getFeatures().getHealthCheck().getArticleId();
            Unit unit = null;
            if (articleId != null) {
                try {
                    valueOf = Long.valueOf(Long.parseLong(articleId));
                } catch (Exception e) {
                    InterfaceC40099e13.C19924a.goToHelp$default(this.f92448c, MapMode.OPERATOR, null, false, 6, null);
                    C41318g46.m40159e(e);
                    return true;
                }
            } else {
                valueOf = null;
            }
            if (valueOf != null) {
                this.f92448c.mo36922w3(valueOf.longValue());
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                InterfaceC40099e13.C19924a.goToHelp$default(this.f92448c, MapMode.OPERATOR, null, false, 6, null);
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final void m30876H() {
        C24552a<Optional<WireVehicleDiagnostics>> c24552a = this.f92456k;
        final C24793p c24793p = C24793p.f92479g;
        Observable<Optional<WireVehicleDiagnostics>> filter = c24552a.filter(new InterfaceC23494q() { // from class: RH1
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m30875I;
                m30875I = C43224jI1.m30875I(Function1.this, obj);
                return m30875I;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "vehicleDiagnosticsSubjec… .filter { it.isPresent }");
        Observable m31950a = C24527f.m31950a(filter, this.f92455j);
        final C24794q c24794q = new C24794q();
        Observable observeOn = m31950a.flatMapSingle(new InterfaceC23492o() { // from class: aI1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m30874J;
                m30874J = C43224jI1.m30874J(Function1.this, obj);
                return m30874J;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "fun onResume() {\n    veh…  }\n        }\n      }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f92446a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24796r c24796r = new C24796r();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: bI1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43224jI1.m30873K(Function1.this, obj);
            }
        };
        final C24797s c24797s = C24797s.f92484g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: cI1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43224jI1.m30872L(Function1.this, obj);
            }
        });
        Observable<R> withLatestFrom = this.f92447b.m17690a().withLatestFrom(this.f92453h, this.f92455j, this.f92456k, C24792o.f92478a);
        Intrinsics.checkNotNullExpressionValue(withLatestFrom, "withLatestFrom(o1, o2, o…-> Quad(t, t1, t2, t3) })");
        Object m33094as2 = withLatestFrom.m33094as(AutoDispose.m45239a(this.f92446a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24798t c24798t = new C24798t();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: dI1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43224jI1.m30871M(Function1.this, obj);
            }
        });
    }

    /* renamed from: s */
    public final void m30852s(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f92447b.m17686e(bird);
        this.f92447b.m17688c();
        C24552a<Unit> c24552a = this.f92454i;
        final C24778f c24778f = new C24778f();
        Observable observeOn = c24552a.switchMapSingle(new InterfaceC23492o() { // from class: eI1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m30851t;
                m30851t = C43224jI1.m30851t(Function1.this, obj);
                return m30851t;
            }
        }).observeOn(C23454a.m33087a());
        final C24779g c24779g = new C24779g();
        Observable doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: iI1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43224jI1.m30850u(Function1.this, obj);
            }
        });
        final C24780h c24780h = C24780h.f92464g;
        Observable filter = doOnNext.filter(new InterfaceC23494q() { // from class: SH1
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m30846y;
                m30846y = C43224jI1.m30846y(Function1.this, obj);
                return m30846y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "fun onCreate(bird: WireB…rSubject.onNext(Unit)\n  }");
        Observable m31950a = C24527f.m31950a(filter, this.f92455j);
        final C24781i c24781i = new C24781i();
        Observable doOnNext2 = m31950a.doOnNext(new InterfaceC23484g() { // from class: TH1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43224jI1.m30845z(Function1.this, obj);
            }
        });
        final C24782j c24782j = new C24782j(bird);
        Observable observeOn2 = doOnNext2.switchMap(new InterfaceC23492o() { // from class: UH1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m30883A;
                m30883A = C43224jI1.m30883A(Function1.this, obj);
                return m30883A;
            }
        }).observeOn(C23454a.m33087a());
        final C24785k c24785k = new C24785k();
        Observable doOnNext3 = observeOn2.doOnNext(new InterfaceC23484g() { // from class: VH1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43224jI1.m30882B(Function1.this, obj);
            }
        });
        final C24786l c24786l = new C24786l(bird);
        Observable switchMap = doOnNext3.switchMap(new InterfaceC23492o() { // from class: WH1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m30881C;
                m30881C = C43224jI1.m30881C(Function1.this, obj);
                return m30881C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMap, "fun onCreate(bird: WireB…rSubject.onNext(Unit)\n  }");
        Object m33094as = switchMap.m33094as(AutoDispose.m45239a(this.f92446a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C24790m c24790m = new C24790m();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: XH1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43224jI1.m30880D(Function1.this, obj);
            }
        };
        final C24791n c24791n = C24791n.f92477g;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: YH1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43224jI1.m30879E(Function1.this, obj);
            }
        });
        C24552a<Boolean> c24552a2 = this.f92455j;
        final C24774b c24774b = C24774b.f92457g;
        Observable<Boolean> observeOn3 = c24552a2.filter(new InterfaceC23494q() { // from class: ZH1
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m30878F;
                m30878F = C43224jI1.m30878F(Function1.this, obj);
                return m30878F;
            }
        }).observeOn(C23454a.m33087a());
        final C24775c c24775c = new C24775c();
        Observable<Boolean> doOnNext4 = observeOn3.doOnNext(new InterfaceC23484g() { // from class: fI1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43224jI1.m30849v(Function1.this, obj);
            }
        });
        final C24776d c24776d = new C24776d(bird);
        Observable<R> switchMap2 = doOnNext4.switchMap(new InterfaceC23492o() { // from class: gI1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m30848w;
                m30848w = C43224jI1.m30848w(Function1.this, obj);
                return m30848w;
            }
        });
        final C24777e c24777e = new C24777e();
        Observable doOnNext5 = switchMap2.doOnNext(new InterfaceC23484g() { // from class: hI1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C43224jI1.m30847x(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext5, "fun onCreate(bird: WireB…rSubject.onNext(Unit)\n  }");
        Object m33094as2 = doOnNext5.m33094as(AutoDispose.m45239a(this.f92446a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe();
        this.f92454i.onNext(Unit.INSTANCE);
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0002*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0002*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\"\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Vehicle;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: jI1$j */
    /* loaded from: classes3.dex */
    public static final class C24782j extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, InterfaceC23434B<? extends Optional<Vehicle>>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f92467h;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0000 \u0003*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "vehicle", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/Vehicle;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: jI1$j$a */
        /* loaded from: classes3.dex */
        public static final class C24783a extends Lambda implements Function1<Vehicle, Optional<Vehicle>> {

            /* renamed from: g */
            public static final C24783a f92468g = new C24783a();

            public C24783a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<Vehicle> invoke(Vehicle vehicle) {
                Intrinsics.checkNotNullParameter(vehicle, "vehicle");
                return Optional.f63040c.m59032c(vehicle);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Vehicle;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Throwable;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: jI1$j$b */
        /* loaded from: classes3.dex */
        public static final class C24784b extends Lambda implements Function1<Throwable, Optional<Vehicle>> {

            /* renamed from: g */
            public static final C24784b f92469g = new C24784b();

            public C24784b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<Vehicle> invoke(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional.f63040c.m59034a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24782j(WireBird wireBird) {
            super(1);
            this.f92467h = wireBird;
        }

        /* renamed from: c */
        public static final Optional m30841c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        /* renamed from: d */
        public static final Optional m30840d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends Optional<Vehicle>> invoke2(Pair<Boolean, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            pair.component2();
            Observable<Vehicle> mo19550h = C43224jI1.this.f92451f.mo19550h(this.f92467h);
            final C24783a c24783a = C24783a.f92468g;
            Observable<R> map = mo19550h.map(new InterfaceC23492o() { // from class: kI1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m30841c;
                    m30841c = C43224jI1.C24782j.m30841c(Function1.this, obj);
                    return m30841c;
                }
            });
            final C24784b c24784b = C24784b.f92469g;
            return map.onErrorReturn(new InterfaceC23492o() { // from class: lI1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m30840d;
                    m30840d = C43224jI1.C24782j.m30840d(Function1.this, obj);
                    return m30840d;
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends Optional<Vehicle>> invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            return invoke2((Pair<Boolean, Boolean>) pair);
        }
    }
}
