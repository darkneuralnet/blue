package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.FleetStatusSummary;
import co.bird.api.error.RetrofitException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c¨\u0006 "}, m28432d2 = {"LTr1;", "", "", "g", "k", "", "e", "f", "LBq1;", C17296a.f69688o, "LBq1;", "fleetStatusManager", "Lkp1;", "b", "Lkp1;", "fleetNavigator", "LKr1;", "c", "LKr1;", "converter", "LUr1;", DateTokenConverter.CONVERTER_KEY, "LUr1;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lmp1;", "Lmp1;", "purpose", "<init>", "(LBq1;Lkp1;LKr1;LUr1;Lcom/uber/autodispose/ScopeProvider;Lmp1;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetsOverviewPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetsOverviewPresenter.kt\nco/bird/android/feature/fleetstatus/common/fleets/FleetsOverviewPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n180#2:57\n180#2:58\n237#2:59\n1#3:60\n*S KotlinDebug\n*F\n+ 1 FleetsOverviewPresenter.kt\nco/bird/android/feature/fleetstatus/common/fleets/FleetsOverviewPresenter\n*L\n29#1:57\n33#1:58\n45#1:59\n*E\n"})
/* renamed from: Tr1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36213Tr1 {

    /* renamed from: a */
    public final InterfaceC31992Bq1 f36340a;

    /* renamed from: b */
    public final C44129kp1 f36341b;

    /* renamed from: c */
    public final C34107Kr1 f36342c;

    /* renamed from: d */
    public final C36447Ur1 f36343d;

    /* renamed from: e */
    public final ScopeProvider f36344e;

    /* renamed from: f */
    public final EnumC45315mp1 f36345f;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Tr1$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C8121a extends FunctionReferenceImpl implements Function1<List<? extends FleetStatusSummary>, List<? extends C3023H6>> {
        public C8121a(Object obj) {
            super(1, obj, C34107Kr1.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C3023H6> invoke(List<FleetStatusSummary> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((C34107Kr1) this.receiver).m98235a(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Tr1$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C8122b extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C8122b(Object obj) {
            super(1, obj, C36447Ur1.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C36447Ur1) this.receiver).m80758b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/FleetStatusSummary;", "kotlin.jvm.PlatformType", "summary", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/FleetStatusSummary;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Tr1$c */
    /* loaded from: classes3.dex */
    public static final class C8123c extends Lambda implements Function1<FleetStatusSummary, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Tr1$c$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C8124a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC45315mp1.values().length];
                try {
                    iArr[EnumC45315mp1.FLEET_STATUS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC45315mp1.INSIGHTS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C8123c() {
            super(1);
        }

        /* renamed from: a */
        public final void m82354a(FleetStatusSummary fleetStatusSummary) {
            int i = C8124a.$EnumSwitchMapping$0[C36213Tr1.this.f36345f.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C36213Tr1.this.f36341b.m28391d(fleetStatusSummary.getFleetId());
                    return;
                }
                return;
            }
            C36213Tr1.this.f36341b.m28390e(fleetStatusSummary.getFleetId(), fleetStatusSummary.getTitle());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FleetStatusSummary fleetStatusSummary) {
            m82354a(fleetStatusSummary);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Tr1$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C8125d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C8125d(Object obj) {
            super(1, obj, C36213Tr1.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C36213Tr1) this.receiver).m82363f(p0);
        }
    }

    public C36213Tr1(InterfaceC31992Bq1 fleetStatusManager, C44129kp1 fleetNavigator, C34107Kr1 converter, C36447Ur1 ui, ScopeProvider scopeProvider, EnumC45315mp1 purpose) {
        Intrinsics.checkNotNullParameter(fleetStatusManager, "fleetStatusManager");
        Intrinsics.checkNotNullParameter(fleetNavigator, "fleetNavigator");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        this.f36340a = fleetStatusManager;
        this.f36341b = fleetNavigator;
        this.f36342c = converter;
        this.f36343d = ui;
        this.f36344e = scopeProvider;
        this.f36345f = purpose;
    }

    /* renamed from: h */
    public static final List m82361h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final void m82360i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m82359j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m82357l() {
    }

    /* renamed from: m */
    public static final void m82356m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public final void m82363f(Throwable th) {
        RetrofitException retrofitException;
        C41318g46.m40159e(th);
        Unit unit = null;
        if (th instanceof RetrofitException) {
            retrofitException = (RetrofitException) th;
        } else {
            retrofitException = null;
        }
        if (retrofitException != null) {
            this.f36343d.error(retrofitException);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f36343d.errorGeneric();
        }
    }

    /* renamed from: g */
    public final void m82362g() {
        Observable<List<FleetStatusSummary>> observeOn = this.f36340a.mo111424x0().observeOn(C24542a.m31934a());
        final C8121a c8121a = new C8121a(this.f36342c);
        Observable observeOn2 = observeOn.map(new InterfaceC23492o() { // from class: Or1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m82361h;
                m82361h = C36213Tr1.m82361h(Function1.this, obj);
                return m82361h;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "fleetStatusManager.strea…dSchedulers.mainThread())");
        Object m33094as = observeOn2.m33094as(AutoDispose.m45239a(this.f36344e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8122b c8122b = new C8122b(this.f36343d);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Pr1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36213Tr1.m82360i(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f36343d.m80760Pl().m33094as(AutoDispose.m45239a(this.f36344e));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8123c c8123c = new C8123c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Qr1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36213Tr1.m82359j(Function1.this, obj);
            }
        });
    }

    /* renamed from: k */
    public final void m82358k() {
        Object m33041n = C28237sD.progress$default(this.f36340a.mo111425w0(), this.f36343d, 0, 2, (Object) null).m33041n(AutoDispose.m45239a(this.f36344e));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: Rr1
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C36213Tr1.m82357l();
            }
        };
        final C8125d c8125d = new C8125d(this);
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: Sr1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36213Tr1.m82356m(Function1.this, obj);
            }
        });
        this.f36343d.m80759Ql();
    }
}
