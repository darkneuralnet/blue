package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.Issue;
import co.bird.android.model.LegacyRepair;
import co.bird.android.model.User;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.constant.InspectionFlow;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.rxkotlin.C24530g;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C52077yD6;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&¢\u0006\u0004\b6\u00107J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010.\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010\u00020\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00103\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u000100000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u00105\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010\u00040\u00040*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010-¨\u00068"}, m28432d2 = {"LyD6;", "LpD6;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/WorkOrder;", "workOrder", "", C17296a.f69688o, "onResume", "m", "p", "LaM;", "LaM;", "birdManager", "Llh6;", "b", "Llh6;", "userManager", "LaG6;", "c", "LaG6;", "workOrderManager", "LTq4;", DateTokenConverter.CONVERTER_KEY, "LTq4;", "reactiveConfig", "LCD6;", "e", "LCD6;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "f", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "g", "Le13;", "navigator", "LkD6;", "h", "LkD6;", "converter", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "i", "Lio/reactivex/subjects/a;", "birdSubject", "Lio/reactivex/subjects/d;", "Lco/bird/android/model/BirdSummaryBody;", "j", "Lio/reactivex/subjects/d;", "birdSummarySubject", "k", "workOrderSubject", "<init>", "(LaM;Llh6;LaG6;LTq4;LCD6;Lcom/uber/autodispose/ScopeProvider;Le13;LkD6;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkOrderDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderDetailsPresenter.kt\nco/bird/android/feature/workorders/details/WorkOrderDetailsPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,122:1\n180#2:123\n180#2:124\n199#2:125\n199#2:126\n*S KotlinDebug\n*F\n+ 1 WorkOrderDetailsPresenter.kt\nco/bird/android/feature/workorders/details/WorkOrderDetailsPresenterImpl\n*L\n55#1:123\n61#1:124\n86#1:125\n118#1:126\n*E\n"})
/* renamed from: yD6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52077yD6 implements InterfaceC46742pD6 {

    /* renamed from: a */
    public final InterfaceC10636aM f119135a;

    /* renamed from: b */
    public final InterfaceC44647lh6 f119136b;

    /* renamed from: c */
    public final InterfaceC37857aG6 f119137c;

    /* renamed from: d */
    public final C36207Tq4 f119138d;

    /* renamed from: e */
    public final CD6 f119139e;

    /* renamed from: f */
    public final ScopeProvider f119140f;

    /* renamed from: g */
    public final InterfaceC40099e13 f119141g;

    /* renamed from: h */
    public final InterfaceC43777kD6 f119142h;

    /* renamed from: i */
    public final C24552a<WireBird> f119143i;

    /* renamed from: j */
    public final C24558d<BirdSummaryBody> f119144j;

    /* renamed from: k */
    public final C24552a<WorkOrder> f119145k;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0002* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0002*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\"\u0010\u0004\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/BirdSummaryBody;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/WorkOrder;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "LH6;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yD6$a */
    /* loaded from: classes3.dex */
    public static final class C30484a extends Lambda implements Function1<Pair<? extends BirdSummaryBody, ? extends WorkOrder>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C30484a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(Pair<BirdSummaryBody, WorkOrder> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            BirdSummaryBody birdSummary = pair.component1();
            WorkOrder workOrder = pair.component2();
            InterfaceC43777kD6 interfaceC43777kD6 = C52077yD6.this.f119142h;
            Intrinsics.checkNotNullExpressionValue(birdSummary, "birdSummary");
            Intrinsics.checkNotNullExpressionValue(workOrder, "workOrder");
            return interfaceC43777kD6.mo25941a(birdSummary, workOrder);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yD6$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30485b extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C30485b(Object obj) {
            super(1, obj, CD6.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CD6) this.receiver).mo110667b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00012R\u0010\u0005\u001aN\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003*&\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/WorkOrder;", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yD6$c */
    /* loaded from: classes3.dex */
    public static final class C30486c extends Lambda implements Function1<Triple<? extends Unit, ? extends WireBird, ? extends WorkOrder>, Unit> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: yD6$c$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C30487a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InspectionFlow.values().length];
                try {
                    iArr[InspectionFlow.LEGACY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InspectionFlow.LIST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C30486c() {
            super(1);
        }

        /* renamed from: a */
        public final void m3819a(Triple<Unit, WireBird, WorkOrder> triple) {
            WireBird bird = triple.component2();
            WorkOrder component3 = triple.component3();
            int i = C30487a.$EnumSwitchMapping$0[C52077yD6.this.f119138d.m82623f8().getValue().getOperatorConfig().getFeatures().getWorkOrders().getInspectionFlow().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    InterfaceC40099e13 interfaceC40099e13 = C52077yD6.this.f119141g;
                    Intrinsics.checkNotNullExpressionValue(bird, "bird");
                    InterfaceC40099e13.C19924a.goToWorkOrderInspection$default(interfaceC40099e13, bird, component3, false, 4, null);
                    return;
                }
                return;
            }
            InterfaceC40099e13 interfaceC40099e132 = C52077yD6.this.f119141g;
            Intrinsics.checkNotNullExpressionValue(bird, "bird");
            InterfaceC40099e13.C19924a.goToLegacyWorkOrderInspection$default(interfaceC40099e132, bird, component3, false, true, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Unit, ? extends WireBird, ? extends WorkOrder> triple) {
            m3819a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "bird", "Lio/reactivex/K;", "LHM4;", "Lco/bird/android/model/BirdSummaryBody;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yD6$d */
    /* loaded from: classes3.dex */
    public static final class C30488d extends Lambda implements Function1<WireBird, InterfaceC23447K<? extends HM4<BirdSummaryBody>>> {
        public C30488d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<BirdSummaryBody>> invoke(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            return C52077yD6.this.f119135a.mo71571o(bird.getId());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yD6$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30489e extends FunctionReferenceImpl implements Function1<BirdSummaryBody, Unit> {
        public C30489e(Object obj) {
            super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m3817a(BirdSummaryBody p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24558d) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BirdSummaryBody birdSummaryBody) {
            m3817a(birdSummaryBody);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/WorkOrder;", "workOrder", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: yD6$f */
    /* loaded from: classes3.dex */
    public static final class C30490f extends Lambda implements Function1<WorkOrder, InterfaceC23447K<? extends WorkOrder>> {

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\n \u0003*\u0004\u0018\u00010\u00060\u00062:\u0010\u0005\u001a6\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/Issue;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/LegacyRepair;", "<name for destructuring parameter 0>", "Lco/bird/android/model/WorkOrder;", C17296a.f69688o, "(Lkotlin/Pair;)Lco/bird/android/model/WorkOrder;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: yD6$f$a */
        /* loaded from: classes3.dex */
        public static final class C30491a extends Lambda implements Function1<Pair<? extends List<? extends Issue>, ? extends List<? extends LegacyRepair>>, WorkOrder> {

            /* renamed from: g */
            public final /* synthetic */ WorkOrder f119150g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30491a(WorkOrder workOrder) {
                super(1);
                this.f119150g = workOrder;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final WorkOrder invoke(Pair<? extends List<Issue>, ? extends List<LegacyRepair>> pair) {
                WorkOrder copy;
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                List<Issue> issues = pair.component1();
                List<LegacyRepair> repairs = pair.component2();
                WorkOrder workOrder = this.f119150g;
                Intrinsics.checkNotNullExpressionValue(workOrder, "workOrder");
                Intrinsics.checkNotNullExpressionValue(issues, "issues");
                Intrinsics.checkNotNullExpressionValue(repairs, "repairs");
                copy = workOrder.copy((r32 & 1) != 0 ? workOrder.f66636id : null, (r32 & 2) != 0 ? workOrder.birdId : null, (r32 & 4) != 0 ? workOrder.createdBy : null, (r32 & 8) != 0 ? workOrder.createdAt : null, (r32 & 16) != 0 ? workOrder.source : null, (r32 & 32) != 0 ? workOrder.sourceDisplay : null, (r32 & 64) != 0 ? workOrder.status : null, (r32 & 128) != 0 ? workOrder.statusDisplay : null, (r32 & 256) != 0 ? workOrder.statusReason : null, (r32 & 512) != 0 ? workOrder.notes : null, (r32 & 1024) != 0 ? workOrder.updatedAt : null, (r32 & 2048) != 0 ? workOrder.deletedAt : null, (r32 & 4096) != 0 ? workOrder.user : null, (r32 & 8192) != 0 ? workOrder.issues : issues, (r32 & 16384) != 0 ? workOrder.repairs : repairs);
                return copy;
            }
        }

        public C30490f() {
            super(1);
        }

        /* renamed from: c */
        public static final WorkOrder m3814c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (WorkOrder) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends WorkOrder> invoke(WorkOrder workOrder) {
            Intrinsics.checkNotNullParameter(workOrder, "workOrder");
            AbstractC23442F m31946a = C24530g.f91174a.m31946a(C38096ag5.m70883l(C52077yD6.this.f119137c.mo19648e(workOrder.getId())), C38096ag5.m70883l(C52077yD6.this.f119137c.mo19650c(workOrder.getId())));
            final C30491a c30491a = new C30491a(workOrder);
            return m31946a.m33157I(new InterfaceC23492o() { // from class: zD6
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    WorkOrder m3814c;
                    m3814c = C52077yD6.C30490f.m3814c(Function1.this, obj);
                    return m3814c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/WorkOrder;", "workOrder", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/WorkOrder;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nWorkOrderDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderDetailsPresenter.kt\nco/bird/android/feature/workorders/details/WorkOrderDetailsPresenterImpl$refreshWorkOrderDetails$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1549#2:123\n1620#2,3:124\n1#3:127\n*S KotlinDebug\n*F\n+ 1 WorkOrderDetailsPresenter.kt\nco/bird/android/feature/workorders/details/WorkOrderDetailsPresenterImpl$refreshWorkOrderDetails$2\n*L\n102#1:123\n102#1:124,3\n*E\n"})
    /* renamed from: yD6$g */
    /* loaded from: classes3.dex */
    public static final class C30492g extends Lambda implements Function1<WorkOrder, InterfaceC23447K<? extends WorkOrder>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "", "Lco/bird/android/model/User;", "users", "Lco/bird/android/model/WorkOrder;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/Map;)Lco/bird/android/model/WorkOrder;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nWorkOrderDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderDetailsPresenter.kt\nco/bird/android/feature/workorders/details/WorkOrderDetailsPresenterImpl$refreshWorkOrderDetails$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1549#2:123\n1620#2,3:124\n*S KotlinDebug\n*F\n+ 1 WorkOrderDetailsPresenter.kt\nco/bird/android/feature/workorders/details/WorkOrderDetailsPresenterImpl$refreshWorkOrderDetails$2$1\n*L\n111#1:123\n111#1:124,3\n*E\n"})
        /* renamed from: yD6$g$a */
        /* loaded from: classes3.dex */
        public static final class C30493a extends Lambda implements Function1<Map<String, ? extends User>, WorkOrder> {

            /* renamed from: g */
            public final /* synthetic */ WorkOrder f119152g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30493a(WorkOrder workOrder) {
                super(1);
                this.f119152g = workOrder;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final WorkOrder invoke(Map<String, User> users) {
                int collectionSizeOrDefault;
                WorkOrder copy;
                LegacyRepair copy2;
                Intrinsics.checkNotNullParameter(users, "users");
                List<LegacyRepair> repairs = this.f119152g.getRepairs();
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(repairs, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (LegacyRepair legacyRepair : repairs) {
                    copy2 = legacyRepair.copy((r26 & 1) != 0 ? legacyRepair.f66601id : null, (r26 & 2) != 0 ? legacyRepair.workOrderId : null, (r26 & 4) != 0 ? legacyRepair.repairTypeId : null, (r26 & 8) != 0 ? legacyRepair.issueId : null, (r26 & 16) != 0 ? legacyRepair.issueTypeId : null, (r26 & 32) != 0 ? legacyRepair.notes : null, (r26 & 64) != 0 ? legacyRepair.createdBy : null, (r26 & 128) != 0 ? legacyRepair.display : null, (r26 & 256) != 0 ? legacyRepair.description : null, (r26 & 512) != 0 ? legacyRepair.createdAt : null, (r26 & 1024) != 0 ? legacyRepair.updatedAt : null, (r26 & 2048) != 0 ? legacyRepair.user : users.get(legacyRepair.getCreatedBy()));
                    arrayList.add(copy2);
                }
                WorkOrder workOrder = this.f119152g;
                Intrinsics.checkNotNullExpressionValue(workOrder, "workOrder");
                copy = workOrder.copy((r32 & 1) != 0 ? workOrder.f66636id : null, (r32 & 2) != 0 ? workOrder.birdId : null, (r32 & 4) != 0 ? workOrder.createdBy : null, (r32 & 8) != 0 ? workOrder.createdAt : null, (r32 & 16) != 0 ? workOrder.source : null, (r32 & 32) != 0 ? workOrder.sourceDisplay : null, (r32 & 64) != 0 ? workOrder.status : null, (r32 & 128) != 0 ? workOrder.statusDisplay : null, (r32 & 256) != 0 ? workOrder.statusReason : null, (r32 & 512) != 0 ? workOrder.notes : null, (r32 & 1024) != 0 ? workOrder.updatedAt : null, (r32 & 2048) != 0 ? workOrder.deletedAt : null, (r32 & 4096) != 0 ? workOrder.user : users.get(this.f119152g.getCreatedBy()), (r32 & 8192) != 0 ? workOrder.issues : null, (r32 & 16384) != 0 ? workOrder.repairs : arrayList);
                return copy;
            }
        }

        public C30492g() {
            super(1);
        }

        /* renamed from: c */
        public static final WorkOrder m3810c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (WorkOrder) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends WorkOrder> invoke(WorkOrder workOrder) {
            int collectionSizeOrDefault;
            Set mutableSet;
            List filterNotNull;
            List<String> list;
            Intrinsics.checkNotNullParameter(workOrder, "workOrder");
            if (workOrder.getUser() == null) {
                List<LegacyRepair> repairs = workOrder.getRepairs();
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(repairs, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (LegacyRepair legacyRepair : repairs) {
                    arrayList.add(legacyRepair.getCreatedBy());
                }
                mutableSet = CollectionsKt___CollectionsKt.toMutableSet(arrayList);
                mutableSet.add(workOrder.getCreatedBy());
                filterNotNull = CollectionsKt___CollectionsKt.filterNotNull(mutableSet);
                list = CollectionsKt___CollectionsKt.toList(filterNotNull);
                AbstractC23442F m70883l = C38096ag5.m70883l(C52077yD6.this.f119136b.mo26961p0(list));
                final C30493a c30493a = new C30493a(workOrder);
                return m70883l.m33157I(new InterfaceC23492o() { // from class: AD6
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        WorkOrder m3810c;
                        m3810c = C52077yD6.C30492g.m3810c(Function1.this, obj);
                        return m3810c;
                    }
                });
            }
            return AbstractC23442F.m33158H(workOrder);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: yD6$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C30494h extends FunctionReferenceImpl implements Function1<WorkOrder, Unit> {
        public C30494h(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m3808a(WorkOrder p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WorkOrder workOrder) {
            m3808a(workOrder);
            return Unit.INSTANCE;
        }
    }

    public C52077yD6(InterfaceC10636aM birdManager, InterfaceC44647lh6 userManager, InterfaceC37857aG6 workOrderManager, C36207Tq4 reactiveConfig, CD6 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, InterfaceC43777kD6 converter) {
        Intrinsics.checkNotNullParameter(birdManager, "birdManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(workOrderManager, "workOrderManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f119135a = birdManager;
        this.f119136b = userManager;
        this.f119137c = workOrderManager;
        this.f119138d = reactiveConfig;
        this.f119139e = ui;
        this.f119140f = scopeProvider;
        this.f119141g = navigator;
        this.f119142h = converter;
        C24552a<WireBird> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<WireBird>()");
        this.f119143i = m31922e;
        C24558d<BirdSummaryBody> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<BirdSummaryBody>()");
        this.f119144j = m31902e;
        C24552a<WorkOrder> m31922e2 = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e2, "create<WorkOrder>()");
        this.f119145k = m31922e2;
        Observable m31956a = C24523e.f91168a.m31956a(m31902e, m31922e2);
        final C30484a c30484a = new C30484a();
        Observable observeOn = m31956a.flatMapSingle(new InterfaceC23492o() { // from class: sD6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m3830j;
                m3830j = C52077yD6.m3830j(Function1.this, obj);
                return m3830j;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30485b c30485b = new C30485b(ui);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: tD6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52077yD6.m3829k(Function1.this, obj);
            }
        });
        Observable observeOn2 = C24527f.m31949b(ui.mo110666l(), m31922e, m31922e2).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.addClicks()\n      .wi…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30486c c30486c = new C30486c();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: uD6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52077yD6.m3828l(Function1.this, obj);
            }
        });
    }

    /* renamed from: j */
    public static final InterfaceC23447K m3830j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m3829k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m3828l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final InterfaceC23447K m3826n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m3825o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final InterfaceC23447K m3823q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final InterfaceC23447K m3822r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m3821s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC46742pD6
    /* renamed from: a */
    public void mo3839a(WireBird bird, WorkOrder workOrder) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(workOrder, "workOrder");
        this.f119143i.onNext(bird);
        this.f119145k.onNext(workOrder);
        m3827m();
    }

    /* renamed from: m */
    public final void m3827m() {
        AbstractC23442F<WireBird> firstOrError = this.f119143i.firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "birdSubject.firstOrError()");
        AbstractC23442F progress$default = C28237sD.progress$default(firstOrError, this.f119139e, 0, 2, (Object) null);
        final C30488d c30488d = new C30488d();
        AbstractC23442F m33165A = progress$default.m33165A(new InterfaceC23492o() { // from class: qD6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m3826n;
                m3826n = C52077yD6.m3826n(Function1.this, obj);
                return m3826n;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A, "private fun getBirdInfo(…mmarySubject::onNext)\n  }");
        Object m33135e = C38096ag5.m70883l(m33165A).m33135e(AutoDispose.m45239a(this.f119140f));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30489e c30489e = new C30489e(this.f119144j);
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: rD6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52077yD6.m3825o(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC46742pD6
    public void onResume() {
        m3824p();
    }

    /* renamed from: p */
    public final void m3824p() {
        AbstractC23442F<WorkOrder> firstOrError = this.f119145k.firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "workOrderSubject.firstOrError()");
        AbstractC23442F progress$default = C28237sD.progress$default(firstOrError, this.f119139e, 0, 2, (Object) null);
        final C30490f c30490f = new C30490f();
        AbstractC23442F m33165A = progress$default.m33165A(new InterfaceC23492o() { // from class: vD6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m3823q;
                m3823q = C52077yD6.m3823q(Function1.this, obj);
                return m3823q;
            }
        });
        final C30492g c30492g = new C30492g();
        AbstractC23442F m33165A2 = m33165A.m33165A(new InterfaceC23492o() { // from class: wD6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m3822r;
                m3822r = C52077yD6.m3822r(Function1.this, obj);
                return m3822r;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33165A2, "private fun refreshWorkO…OrderSubject::onNext)\n  }");
        Object m33135e = m33165A2.m33135e(AutoDispose.m45239a(this.f119140f));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30494h c30494h = new C30494h(this.f119145k);
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: xD6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C52077yD6.m3821s(Function1.this, obj);
            }
        });
    }
}
