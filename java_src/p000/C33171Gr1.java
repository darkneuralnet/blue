package p000;

import co.bird.android.model.constant.FleetReportPage;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, m28432d2 = {"LGr1;", "Lf1;", "LHr1;", "LIr1;", "renderer", "", "p", "Lsp1;", "e", "Lsp1;", "analyticsManager", "<init>", "(Lsp1;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetTabPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetTabPresenter.kt\nco/bird/android/feature/fleetstatus/common/FleetTabPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,49:1\n180#2:50\n180#2:51\n*S KotlinDebug\n*F\n+ 1 FleetTabPresenter.kt\nco/bird/android/feature/fleetstatus/common/FleetTabPresenter\n*L\n22#1:50\n34#1:51\n*E\n"})
/* renamed from: Gr1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33171Gr1 extends AbstractC20169f1<InterfaceC33405Hr1, C33639Ir1> {

    /* renamed from: e */
    public final InterfaceC48872sp1 f12526e;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "fleetId", "", "Lco/bird/android/model/constant/FleetReportPage;", "fleetTabs", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/String;Ljava/util/List;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Gr1$a */
    /* loaded from: classes3.dex */
    public static final class C2957a extends Lambda implements Function2<String, List<? extends FleetReportPage>, Pair<? extends String, ? extends List<? extends FleetReportPage>>> {

        /* renamed from: g */
        public static final C2957a f12527g = new C2957a();

        public C2957a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Pair<String, List<FleetReportPage>> invoke(String fleetId, List<? extends FleetReportPage> fleetTabs) {
            Intrinsics.checkNotNullParameter(fleetId, "fleetId");
            Intrinsics.checkNotNullParameter(fleetTabs, "fleetTabs");
            return TuplesKt.m28425to(fleetId, fleetTabs);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "Lco/bird/android/model/constant/FleetReportPage;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Gr1$b */
    /* loaded from: classes3.dex */
    public static final class C2958b extends Lambda implements Function1<Pair<? extends String, ? extends List<? extends FleetReportPage>>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LIr1;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LIr1;)LIr1;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Gr1$b$a */
        /* loaded from: classes3.dex */
        public static final class C2959a extends Lambda implements Function1<C33639Ir1, C33639Ir1> {

            /* renamed from: g */
            public final /* synthetic */ String f12529g;

            /* renamed from: h */
            public final /* synthetic */ List<FleetReportPage> f12530h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2959a(String str, List<? extends FleetReportPage> list) {
                super(1);
                this.f12529g = str;
                this.f12530h = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C33639Ir1 invoke(C33639Ir1 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                String str = this.f12529g;
                List<FleetReportPage> fleetTabs = this.f12530h;
                Intrinsics.checkNotNullExpressionValue(fleetTabs, "fleetTabs");
                return C33639Ir1.copy$default(state, str, fleetTabs, null, 4, null);
            }
        }

        public C2958b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends List<? extends FleetReportPage>> pair) {
            invoke2((Pair<String, ? extends List<? extends FleetReportPage>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<String, ? extends List<? extends FleetReportPage>> pair) {
            C33171Gr1.this.m42279i(new C2959a(pair.component1(), pair.component2()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/constant/FleetReportPage;", "kotlin.jvm.PlatformType", "fleetTab", "", C17296a.f69688o, "(Lco/bird/android/model/constant/FleetReportPage;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Gr1$c */
    /* loaded from: classes3.dex */
    public static final class C2960c extends Lambda implements Function1<FleetReportPage, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LIr1;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LIr1;)LIr1;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Gr1$c$a */
        /* loaded from: classes3.dex */
        public static final class C2961a extends Lambda implements Function1<C33639Ir1, C33639Ir1> {

            /* renamed from: g */
            public final /* synthetic */ FleetReportPage f12532g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2961a(FleetReportPage fleetReportPage) {
                super(1);
                this.f12532g = fleetReportPage;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C33639Ir1 invoke(C33639Ir1 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return C33639Ir1.copy$default(state, null, null, this.f12532g, 3, null);
            }
        }

        public C2960c() {
            super(1);
        }

        /* renamed from: a */
        public final void m104678a(FleetReportPage fleetReportPage) {
            if (fleetReportPage == FleetReportPage.CORE) {
                C33171Gr1.this.f12526e.mo11728b();
            } else {
                C33171Gr1.this.f12526e.mo11729a();
            }
            C33171Gr1.this.m42279i(new C2961a(fleetReportPage));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FleetReportPage fleetReportPage) {
            m104678a(fleetReportPage);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33171Gr1(InterfaceC48872sp1 analyticsManager) {
        super(new C33639Ir1(null, null, null, 7, null));
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f12526e = analyticsManager;
    }

    /* renamed from: g */
    public static final void m104687g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final Pair m104682q(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj, obj2);
    }

    /* renamed from: r */
    public static final void m104681r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: p */
    public void consume(InterfaceC33405Hr1 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Observable<String> mo229l5 = renderer.mo229l5();
        Observable<List<FleetReportPage>> mo227r5 = renderer.mo227r5();
        final C2957a c2957a = C2957a.f12527g;
        Observable combineLatest = Observable.combineLatest(mo229l5, mo227r5, new InterfaceC23480c() { // from class: Dr1
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Pair m104682q;
                m104682q = C33171Gr1.m104682q(Function2.this, obj, obj2);
                return m104682q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(\n      ren…-> fleetId to fleetTabs }");
        Object m33094as = combineLatest.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2958b c2958b = new C2958b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Er1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33171Gr1.m104687g(Function1.this, obj);
            }
        });
        Object m33094as2 = renderer.mo228n5().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C2960c c2960c = new C2960c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Fr1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33171Gr1.m104681r(Function1.this, obj);
            }
        });
    }
}
