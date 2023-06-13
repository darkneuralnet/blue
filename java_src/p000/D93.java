package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.NonRepair;
import co.bird.android.model.NonRepairReason;
import co.bird.android.model.RepairCategory;
import co.bird.android.model.RepairFlow;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"LD93;", "Lf1;", "LE93;", "LF93;", "renderer", "", "s", "Lrn6;", "e", "Lrn6;", "vehicleServicingManager", "Le13;", "f", "Le13;", "navigator", "<init>", "(Lrn6;Le13;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNonRepairSurveyPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonRepairSurveyPresenter.kt\nco/bird/android/feature/repair/v3/overview/nonrepair/NonRepairSurveyPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,81:1\n180#2:82\n180#2:83\n180#2:84\n*S KotlinDebug\n*F\n+ 1 NonRepairSurveyPresenter.kt\nco/bird/android/feature/repair/v3/overview/nonrepair/NonRepairSurveyPresenter\n*L\n25#1:82\n34#1:83\n72#1:84\n*E\n"})
/* renamed from: D93 */
/* loaded from: classes3.dex */
public final class D93 extends AbstractC20169f1<E93, F93> {

    /* renamed from: e */
    public final InterfaceC48265rn6 f5289e;

    /* renamed from: f */
    public final InterfaceC40099e13 f5290f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/NonRepair;", "kotlin.jvm.PlatformType", "nonRepair", "", C17296a.f69688o, "(Lco/bird/android/model/NonRepair;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: D93$a */
    /* loaded from: classes3.dex */
    public static final class C1402a extends Lambda implements Function1<NonRepair, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LF93;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LF93;)LF93;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: D93$a$a */
        /* loaded from: classes3.dex */
        public static final class C1403a extends Lambda implements Function1<F93, F93> {

            /* renamed from: g */
            public final /* synthetic */ NonRepair f5292g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1403a(NonRepair nonRepair) {
                super(1);
                this.f5292g = nonRepair;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final F93 invoke(F93 state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return F93.copy$default(state, this.f5292g, null, null, false, 14, null);
            }
        }

        public C1402a() {
            super(1);
        }

        /* renamed from: a */
        public final void m110846a(NonRepair nonRepair) {
            D93.this.m42279i(new C1403a(nonRepair));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NonRepair nonRepair) {
            m110846a(nonRepair);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/NonRepairReason;", "reason", "Lco/bird/android/buava/Optional;", "subreason", "Lkotlin/Pair;", C17296a.f69688o, "(Lco/bird/android/model/NonRepairReason;Lco/bird/android/buava/Optional;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: D93$b */
    /* loaded from: classes3.dex */
    public static final class C1404b extends Lambda implements Function2<NonRepairReason, Optional<NonRepairReason>, Pair<? extends NonRepairReason, ? extends Optional<NonRepairReason>>> {

        /* renamed from: g */
        public static final C1404b f5293g = new C1404b();

        public C1404b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Pair<NonRepairReason, Optional<NonRepairReason>> invoke(NonRepairReason reason, Optional<NonRepairReason> subreason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(subreason, "subreason");
            return TuplesKt.m28425to(reason, subreason);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005 \u0006*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/NonRepairReason;", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: D93$c */
    /* loaded from: classes3.dex */
    public static final class C1405c extends Lambda implements Function1<Pair<? extends NonRepairReason, ? extends Optional<NonRepairReason>>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LF93;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LF93;)LF93;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: D93$c$a */
        /* loaded from: classes3.dex */
        public static final class C1406a extends Lambda implements Function1<F93, F93> {

            /* renamed from: g */
            public final /* synthetic */ NonRepairReason f5295g;

            /* renamed from: h */
            public final /* synthetic */ Optional<NonRepairReason> f5296h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1406a(NonRepairReason nonRepairReason, Optional<NonRepairReason> optional) {
                super(1);
                this.f5295g = nonRepairReason;
                this.f5296h = optional;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final F93 invoke(F93 state) {
                boolean z;
                Intrinsics.checkNotNullParameter(state, "state");
                NonRepairReason nonRepairReason = this.f5295g;
                NonRepairReason m59035e = this.f5296h.m59035e();
                if (this.f5295g.getSubreasons() != null && !this.f5296h.m59037c()) {
                    z = false;
                } else {
                    z = true;
                }
                return F93.copy$default(state, null, nonRepairReason, m59035e, z, 1, null);
            }
        }

        public C1405c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends NonRepairReason, ? extends Optional<NonRepairReason>> pair) {
            invoke2((Pair<NonRepairReason, Optional<NonRepairReason>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<NonRepairReason, Optional<NonRepairReason>> pair) {
            D93.this.m42279i(new C1406a(pair.component1(), pair.component2()));
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001aR\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t \u0002*(\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t\u0018\u00010\u00040\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"", "", "kotlin.jvm.PlatformType", "items", "LRe4;", "", "Lco/bird/android/model/RepairCategory;", "Lco/bird/android/model/NonRepair;", "Lco/bird/android/model/NonRepairReason;", "Lco/bird/android/buava/Optional;", C17296a.f69688o, "([Ljava/lang/Object;)LRe4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: D93$d */
    /* loaded from: classes3.dex */
    public static final class C1407d extends Lambda implements Function1<Object[], C35631Re4<? extends String, ? extends RepairCategory, ? extends NonRepair, ? extends NonRepairReason, ? extends Optional<NonRepairReason>>> {

        /* renamed from: g */
        public static final C1407d f5297g = new C1407d();

        public C1407d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C35631Re4<String, RepairCategory, NonRepair, NonRepairReason, Optional<NonRepairReason>> invoke(Object[] items) {
            Intrinsics.checkNotNullParameter(items, "items");
            Object obj = items[1];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            Object obj2 = items[2];
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type co.bird.android.model.RepairCategory");
            RepairCategory repairCategory = (RepairCategory) obj2;
            Object obj3 = items[3];
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type co.bird.android.model.NonRepair");
            NonRepair nonRepair = (NonRepair) obj3;
            Object obj4 = items[4];
            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type co.bird.android.model.NonRepairReason");
            Object obj5 = items[5];
            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type co.bird.android.buava.Optional<co.bird.android.model.NonRepairReason>");
            return new C35631Re4<>(str, repairCategory, nonRepair, (NonRepairReason) obj4, (Optional) obj5);
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a*\u0012\u000e\b\u0001\u0012\n \t*\u0004\u0018\u00010\b0\b \t*\u0014\u0012\u000e\b\u0001\u0012\n \t*\u0004\u0018\u00010\b0\b\u0018\u00010\u00070\u00072*\u0010\u0006\u001a&\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"LRe4;", "", "Lco/bird/android/model/RepairCategory;", "Lco/bird/android/model/NonRepair;", "Lco/bird/android/model/NonRepairReason;", "Lco/bird/android/buava/Optional;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/RepairFlow;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LRe4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: D93$e */
    /* loaded from: classes3.dex */
    public static final class C1408e extends Lambda implements Function1<C35631Re4<? extends String, ? extends RepairCategory, ? extends NonRepair, ? extends NonRepairReason, ? extends Optional<NonRepairReason>>, InterfaceC23447K<? extends RepairFlow>> {
        public C1408e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends RepairFlow> invoke(C35631Re4<String, RepairCategory, NonRepair, NonRepairReason, Optional<NonRepairReason>> c35631Re4) {
            NonRepairReason nonRepairReason;
            List<String> emptyList;
            Intrinsics.checkNotNullParameter(c35631Re4, "<name for destructuring parameter 0>");
            String m86500a = c35631Re4.m86500a();
            NonRepair m86498c = c35631Re4.m86498c();
            NonRepairReason m86497d = c35631Re4.m86497d();
            InterfaceC48265rn6 interfaceC48265rn6 = D93.this.f5289e;
            String id = c35631Re4.m86499b().getId();
            NonRepairReason m59035e = c35631Re4.m86496e().m59035e();
            if (m59035e == null) {
                nonRepairReason = m86497d;
            } else {
                nonRepairReason = m59035e;
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return interfaceC48265rn6.mo13667e(m86500a, id, emptyList, m86498c, nonRepairReason, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RepairFlow;", "kotlin.jvm.PlatformType", "repairFlow", "", C17296a.f69688o, "(Lco/bird/android/model/RepairFlow;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: D93$f */
    /* loaded from: classes3.dex */
    public static final class C1409f extends Lambda implements Function1<RepairFlow, Unit> {
        public C1409f() {
            super(1);
        }

        /* renamed from: a */
        public final void m110840a(RepairFlow repairFlow) {
            D93.this.f5290f.mo37150J(InterfaceC40099e13.EnumC19925b.RESULT_OK, TuplesKt.m28425to("repair_flow", repairFlow));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RepairFlow repairFlow) {
            m110840a(repairFlow);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D93(InterfaceC48265rn6 vehicleServicingManager, InterfaceC40099e13 navigator) {
        super(new F93(null, null, null, false, 15, null));
        Intrinsics.checkNotNullParameter(vehicleServicingManager, "vehicleServicingManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f5289e = vehicleServicingManager;
        this.f5290f = navigator;
    }

    /* renamed from: f */
    public static final void m110859f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final Pair m110851t(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj, obj2);
    }

    /* renamed from: u */
    public static final void m110850u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final C35631Re4 m110849v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C35631Re4) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final InterfaceC23447K m110848w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m110847x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: s */
    public void consume(E93 renderer) {
        List listOf;
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Object m33094as = renderer.mo57504h2().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1402a c1402a = new C1402a();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: x93
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D93.m110859f(Function1.this, obj);
            }
        });
        Observable<NonRepairReason> mo57503s = renderer.mo57503s();
        Observable<Optional<NonRepairReason>> mo57507d3 = renderer.mo57507d3();
        Optional.C14443a c14443a = Optional.f63040c;
        Observable<Optional<NonRepairReason>> startWith = mo57507d3.startWith((Observable<Optional<NonRepairReason>>) c14443a.m59034a());
        final C1404b c1404b = C1404b.f5293g;
        Observable combineLatest = Observable.combineLatest(mo57503s, startWith, new InterfaceC23480c() { // from class: y93
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Pair m110851t;
                m110851t = D93.m110851t(Function2.this, obj, obj2);
                return m110851t;
            }
        });
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(\n      ren… -> reason to subreason }");
        Object m33094as2 = combineLatest.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1405c c1405c = new C1405c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: z93
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D93.m110850u(Function1.this, obj);
            }
        });
        Observable<Unit> mo57508c = renderer.mo57508c();
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Observable[]{renderer.mo57506d9(), renderer.mo57505f5(), renderer.mo57504h2(), renderer.mo57503s(), renderer.mo57507d3().startWith((Observable<Optional<NonRepairReason>>) c14443a.m59034a())});
        final C1407d c1407d = C1407d.f5297g;
        Observable<R> withLatestFrom = mo57508c.withLatestFrom(listOf, new InterfaceC23492o() { // from class: A93
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C35631Re4 m110849v;
                m110849v = D93.m110849v(Function1.this, obj);
                return m110849v;
            }
        });
        final C1408e c1408e = new C1408e();
        Observable flatMapSingle = withLatestFrom.flatMapSingle(new InterfaceC23492o() { // from class: B93
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m110848w;
                m110848w = D93.m110848w(Function1.this, obj);
                return m110848w;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun consume(ren…low\n        )\n      }\n  }");
        Object m33094as3 = flatMapSingle.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C1409f c1409f = new C1409f();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: C93
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                D93.m110847x(Function1.this, obj);
            }
        });
    }
}
