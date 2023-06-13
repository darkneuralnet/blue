package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.charger.presenter.TaskCancelPresenterImpl;
import co.bird.android.buava.Optional;
import co.bird.android.model.RideState;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireRide;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23470e;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p000.C53007zn6;
import zendesk.support.CreateRequest;
import zendesk.support.ProviderStore;
import zendesk.support.Request;
import zendesk.support.Support;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0011B-\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0018\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001f¨\u0006\""}, m28432d2 = {"Lzn6;", "", "", "tipId", "emergencyPhoneNumber", "", "f", "userResponse", "Lco/bird/android/model/wire/WireRide;", "ride", "Lzendesk/support/CreateRequest;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lco/bird/android/model/wire/WireRide;)Lzendesk/support/CreateRequest;", "request", "Lio/reactivex/c;", "e", "LYR4;", C17296a.f69688o, "LYR4;", "rideManager", "Le13;", "b", "Le13;", "navigator", "Lcom/uber/autodispose/ScopeProvider;", "c", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LFn6;", "LFn6;", "ui", "Ljava/lang/String;", "<init>", "(LYR4;Le13;Lcom/uber/autodispose/ScopeProvider;LFn6;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVehicleTipPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VehicleTipPresenter.kt\nco/bird/android/app/feature/tip/VehicleTipPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n237#2:132\n180#2:133\n180#2:134\n1#3:135\n*S KotlinDebug\n*F\n+ 1 VehicleTipPresenter.kt\nco/bird/android/app/feature/tip/VehicleTipPresenterImpl\n*L\n79#1:132\n83#1:133\n89#1:134\n*E\n"})
/* renamed from: zn6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C53007zn6 {

    /* renamed from: f */
    public static final C31499a f122234f = new C31499a(null);

    /* renamed from: g */
    public static final int f122235g = 8;

    /* renamed from: h */
    public static final DateTimeFormatter f122236h;

    /* renamed from: a */
    public final YR4 f122237a;

    /* renamed from: b */
    public final InterfaceC40099e13 f122238b;

    /* renamed from: c */
    public final ScopeProvider f122239c;

    /* renamed from: d */
    public final InterfaceC32906Fn6 f122240d;

    /* renamed from: e */
    public String f122241e;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lzn6$a;", "", "", "DEFAULT_EMERGENCY_NUMBER", "Ljava/lang/String;", "REQUEST_TAG", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: zn6$a */
    /* loaded from: classes2.dex */
    public static final class C31499a {
        public /* synthetic */ C31499a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C31499a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/e;", "emitter", "", C17296a.f69688o, "(Lio/reactivex/e;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zn6$b */
    /* loaded from: classes2.dex */
    public static final class C31500b extends Lambda implements Function1<InterfaceC23470e, Unit> {

        /* renamed from: g */
        public final /* synthetic */ CreateRequest f122242g;

        @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, m28432d2 = {"zn6$b$a", "LlI6;", "Lzendesk/support/Request;", "request", "", "onSuccess", "Lsg1;", "error", "onError", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: zn6$b$a */
        /* loaded from: classes2.dex */
        public static final class C31501a extends AbstractC44415lI6<Request> {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC23470e f122243a;

            public C31501a(InterfaceC23470e interfaceC23470e) {
                this.f122243a = interfaceC23470e;
            }

            @Override // p000.AbstractC44415lI6
            public void onError(InterfaceC48782sg1 error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.f122243a.onError(new TaskCancelPresenterImpl.ZendeskCreateRequestError(error));
            }

            @Override // p000.AbstractC44415lI6
            public void onSuccess(Request request) {
                Intrinsics.checkNotNullParameter(request, "request");
                this.f122243a.onComplete();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31500b(CreateRequest createRequest) {
            super(1);
            this.f122242g = createRequest;
        }

        /* renamed from: a */
        public final void m427a(InterfaceC23470e emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            C31501a c31501a = new C31501a(emitter);
            ProviderStore provider = Support.INSTANCE.provider();
            Intrinsics.checkNotNull(provider);
            provider.requestProvider().createRequest(this.f122242g, c31501a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23470e interfaceC23470e) {
            m427a(interfaceC23470e);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zn6$d */
    /* loaded from: classes2.dex */
    public static final class C31504d extends Lambda implements Function1<String, Unit> {
        public C31504d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            InterfaceC32906Fn6 interfaceC32906Fn6 = C53007zn6.this.f122240d;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC32906Fn6.mo99698T2(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: zn6$e */
    /* loaded from: classes2.dex */
    public static final class C31505e extends Lambda implements Function1<Unit, Unit> {
        public C31505e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C53007zn6.this.f122238b.close();
        }
    }

    static {
        DateTimeFormatter mediumDateTime = DateTimeFormat.mediumDateTime();
        Intrinsics.checkNotNullExpressionValue(mediumDateTime, "mediumDateTime()");
        f122236h = mediumDateTime;
    }

    public C53007zn6(YR4 rideManager, InterfaceC40099e13 navigator, ScopeProvider scopeProvider, InterfaceC32906Fn6 ui) {
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f122237a = rideManager;
        this.f122238b = navigator;
        this.f122239c = scopeProvider;
        this.f122240d = ui;
    }

    /* renamed from: g */
    public static final InterfaceC23496h m430g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m429h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m428i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d */
    public final CreateRequest m433d(String userResponse, WireRide wireRide) {
        String str;
        String str2;
        List<String> mutableListOf;
        WireBird bird;
        String partnerId;
        WireBird bird2;
        WireBird bird3;
        Intrinsics.checkNotNullParameter(userResponse, "userResponse");
        String str3 = null;
        if (wireRide != null && (bird3 = wireRide.getBird()) != null) {
            str = bird3.getCode();
        } else {
            str = null;
        }
        String print = f122236h.print(DateTime.now());
        if (wireRide != null) {
            str2 = wireRide.getId();
        } else {
            str2 = null;
        }
        String format = String.format(this.f122240d.mo99705L5(), Arrays.copyOf(new Object[]{str, print, "<https://dash.bird.co/bird/rides/" + str2 + "/tracks>", userResponse}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        if (wireRide != null && (bird2 = wireRide.getBird()) != null) {
            str3 = bird2.getModel();
        }
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf("vehicle_tip", "model:" + str3);
        if (wireRide != null && (bird = wireRide.getBird()) != null && (partnerId = bird.getPartnerId()) != null) {
            mutableListOf.add("partner:" + partnerId);
        }
        CreateRequest createRequest = new CreateRequest();
        createRequest.setSubject("Vehicle " + str + " Tip Follow-Up");
        createRequest.setDescription(format);
        createRequest.setTags(mutableListOf);
        return createRequest;
    }

    /* renamed from: e */
    public final AbstractC23461c m432e(CreateRequest createRequest) {
        return C45832nh5.m23311e(new C31500b(createRequest));
    }

    /* renamed from: f */
    public void m431f(String str, String str2) {
        this.f122241e = str;
        InterfaceC32906Fn6 interfaceC32906Fn6 = this.f122240d;
        if (str2 == null) {
            str2 = "911";
        }
        interfaceC32906Fn6.mo99707Gk(str2);
        Observable take = Observable.merge(this.f122240d.mo99704Lf(), this.f122240d.mo99693m8(), this.f122240d.mo99694ai()).take(1L);
        Intrinsics.checkNotNullExpressionValue(take, "merge(\n      ui.tippedBu…nClicks())\n      .take(1)");
        Observable m31950a = C24527f.m31950a(take, this.f122237a.mo75057R());
        final C31502c c31502c = new C31502c();
        AbstractC23461c m33070P = m31950a.flatMapCompletable(new InterfaceC23492o() { // from class: wn6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m430g;
                m430g = C53007zn6.m430g(Function1.this, obj);
                return m430g;
            }
        }).m33070P(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33070P, "override fun onCreate(ti…{ navigator.close() }\n  }");
        Object m33041n = m33070P.m33041n(AutoDispose.m45239a(this.f122239c));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Object m33094as = this.f122240d.mo99692p4().m33094as(AutoDispose.m45239a(this.f122239c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C31504d c31504d = new C31504d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: xn6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C53007zn6.m429h(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f122240d.mo99691s1().m33094as(AutoDispose.m45239a(this.f122239c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C31505e c31505e = new C31505e();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: yn6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C53007zn6.m428i(Function1.this, obj);
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: zn6$c */
    /* loaded from: classes2.dex */
    public static final class C31502c extends Lambda implements Function1<Pair<? extends String, ? extends Optional<RideState>>, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: zn6$c$a */
        /* loaded from: classes2.dex */
        public static final class C31503a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public static final C31503a f122245g = new C31503a();

            public C31503a() {
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

        public C31502c() {
            super(1);
        }

        /* renamed from: c */
        public static final void m424c(String str, C53007zn6 this$0) {
            boolean areEqual;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (Intrinsics.areEqual(str, this$0.f122240d.mo99695X5())) {
                areEqual = true;
            } else {
                areEqual = Intrinsics.areEqual(str, this$0.f122240d.mo99703P7());
            }
            if (areEqual) {
                this$0.f122240d.mo99709B4();
            } else if (Intrinsics.areEqual(str, this$0.f122240d.mo99708C9())) {
                this$0.f122240d.mo99706J3();
            }
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<String, Optional<RideState>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            final String response = pair.component1();
            C53007zn6 c53007zn6 = C53007zn6.this;
            Intrinsics.checkNotNullExpressionValue(response, "response");
            RideState m59035e = pair.component2().m59035e();
            AbstractC23461c progress$default = C28237sD.progress$default(C53007zn6.this.m432e(c53007zn6.m433d(response, m59035e != null ? m59035e.getRide() : null)), C53007zn6.this.f122240d, 0, 2, (Object) null);
            final C31503a c31503a = C31503a.f122245g;
            AbstractC23461c m33069Q = progress$default.m33084B(new InterfaceC23484g() { // from class: An6
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C53007zn6.C31502c.invoke$lambda$0(Function1.this, obj);
                }
            }).m33069Q();
            final C53007zn6 c53007zn62 = C53007zn6.this;
            return m33069Q.m33029z(new InterfaceC23478a() { // from class: Bn6
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C53007zn6.C31502c.m424c(response, c53007zn62);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends String, ? extends Optional<RideState>> pair) {
            return invoke2((Pair<String, Optional<RideState>>) pair);
        }
    }
}
