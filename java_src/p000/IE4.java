package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.NonRepair;
import co.bird.android.model.NonRepairReason;
import co.bird.android.model.Repair;
import co.bird.android.model.RepairCategory;
import co.bird.android.model.RepairFlow;
import co.bird.android.model.RepairIssue;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePart;
import co.bird.android.model.wire.WireQuickLink;
import co.bird.api.error.RetrofitException;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import p000.IE4;
import p000.InterfaceC40099e13;
import p000.InterfaceC45686nS1;
@Metadata(m28433d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-¢\u0006\u0004\bT\u0010UJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0005R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R.\u00106\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n 3*\n\u0012\u0004\u0012\u00020\n\u0018\u00010202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R.\u00109\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r 3*\n\u0012\u0004\u0012\u00020\r\u0018\u00010707018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00105R:\u0010@\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020= 3*\u0010\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=\u0018\u00010;0;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R.\u0010C\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020A 3*\n\u0012\u0004\u0012\u00020A\u0018\u00010202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00105R&\u0010H\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GRF\u0010K\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020E 3*\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020E\u0018\u00010I0I018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u00105R&\u0010N\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020L020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010GRF\u0010P\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020L02 3*\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020L02\u0018\u00010I0I018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u00105R\"\u0010S\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010Q0Q018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u00105¨\u0006V"}, m28432d2 = {"LIE4;", "", "", "birdId", "issueId", "", "L", "", "e", "B", "Lco/bird/android/model/RepairCategory;", "category", "z", "Lco/bird/android/model/RepairIssue;", "issue", "A", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "v", "Lom3;", C17296a.f69688o, "Lom3;", "operatorManager", "Lrn6;", "b", "Lrn6;", "vehicleServicingManager", "LEa;", "c", "LEa;", "analyticsManager", "LnS1;", DateTokenConverter.CONVERTER_KEY, "LnS1;", "idToolsManager", "Le13;", "Le13;", "navigator", "LlE4;", "f", "LlE4;", "converter", "LSE4;", "g", "LSE4;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "h", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Lio/reactivex/subjects/a;", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", "i", "Lio/reactivex/subjects/a;", "categorySubject", "", "j", "issuesSubject", "Lio/reactivex/subjects/d;", "Lkotlin/Pair;", "Lco/bird/android/model/Repair;", "", "k", "Lio/reactivex/subjects/d;", "repairSelectionOverrideSubject", "Lco/bird/android/model/wire/WireQuickLink;", "l", "trainingGuideSubject", "", "", "m", "Ljava/util/Map;", "originalSelectedRepairs", "", "n", "selectedRepairsSubject", "Lco/bird/android/model/NonRepair;", "o", "originalNonRepairs", "p", "nonRepairsSubject", "Lco/bird/android/model/RepairFlow;", "q", "repairFlowSubject", "<init>", "(Lom3;Lrn6;LEa;LnS1;Le13;LlE4;LSE4;Lcom/uber/autodispose/ScopeProvider;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairV3IssuePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssuePresenter.kt\nco/bird/android/feature/repair/v3/issues/RepairV3IssuePresenter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Observables.kt\nco/bird/android/library/rx/Observables\n+ 5 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 6 Observables.kt\nco/bird/android/library/rx/ObservablesKt\n*L\n1#1,356:1\n1#2:357\n1549#3:358\n1620#3,2:359\n766#3:361\n857#3,2:362\n1622#3:364\n1549#3:365\n1620#3,2:366\n1549#3:368\n1620#3,3:369\n1622#3:372\n288#3,2:373\n766#3:375\n857#3,2:376\n1549#3:378\n1620#3,3:379\n288#3,2:382\n82#4,2:384\n180#5:386\n180#5:388\n180#5:390\n218#5:391\n180#5:392\n180#5:393\n180#5:394\n133#6:387\n128#6:389\n*S KotlinDebug\n*F\n+ 1 RepairV3IssuePresenter.kt\nco/bird/android/feature/repair/v3/issues/RepairV3IssuePresenter\n*L\n64#1:358\n64#1:359,2\n65#1:361\n65#1:362,2\n64#1:364\n67#1:365\n67#1:366,2\n68#1:368\n68#1:369,3\n67#1:372\n77#1:373,2\n93#1:375\n93#1:376,2\n94#1:378\n94#1:379,3\n103#1:382,2\n116#1:384,2\n141#1:386\n188#1:388\n225#1:390\n238#1:391\n285#1:392\n330#1:393\n345#1:394\n152#1:387\n200#1:389\n*E\n"})
/* renamed from: IE4 */
/* loaded from: classes3.dex */
public final class IE4 {

    /* renamed from: a */
    public final InterfaceC46473om3 f14876a;

    /* renamed from: b */
    public final InterfaceC48265rn6 f14877b;

    /* renamed from: c */
    public final InterfaceC1880Ea f14878c;

    /* renamed from: d */
    public final InterfaceC45686nS1 f14879d;

    /* renamed from: e */
    public final InterfaceC40099e13 f14880e;

    /* renamed from: f */
    public final C44377lE4 f14881f;

    /* renamed from: g */
    public final SE4 f14882g;

    /* renamed from: h */
    public final ScopeProvider f14883h;

    /* renamed from: i */
    public final C24552a<Optional<RepairCategory>> f14884i;

    /* renamed from: j */
    public final C24552a<List<RepairIssue>> f14885j;

    /* renamed from: k */
    public final C24558d<Pair<Repair, Boolean>> f14886k;

    /* renamed from: l */
    public final C24552a<Optional<WireQuickLink>> f14887l;

    /* renamed from: m */
    public final Map<String, Set<String>> f14888m;

    /* renamed from: n */
    public final C24552a<Map<String, Set<String>>> f14889n;

    /* renamed from: o */
    public final Map<String, Optional<NonRepair>> f14890o;

    /* renamed from: p */
    public final C24552a<Map<String, Optional<NonRepair>>> f14891p;

    /* renamed from: q */
    public final C24552a<RepairFlow> f14892q;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RepairFlow;", "kotlin.jvm.PlatformType", "repairFlow", "", C17296a.f69688o, "(Lco/bird/android/model/RepairFlow;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: IE4$a */
    /* loaded from: classes3.dex */
    public static final class C3426a extends Lambda implements Function1<RepairFlow, Unit> {
        public C3426a() {
            super(1);
        }

        /* renamed from: a */
        public final void m102711a(RepairFlow repairFlow) {
            Intent intent = new Intent();
            intent.putExtra("repair_flow", repairFlow);
            IE4.this.f14880e.mo37029e4(-1, intent);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RepairFlow repairFlow) {
            m102711a(repairFlow);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: IE4$b */
    /* loaded from: classes3.dex */
    public static final class C3427b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C3427b f14894g = new C3427b();

        public C3427b() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010\b\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0004H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"T1", "T2", "T3", "T4", "T5", "t1", "t2", "t3", "t4", "t5", "LRe4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LRe4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$4\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: IE4$c */
    /* loaded from: classes3.dex */
    public static final class C3428c<T1, T2, T3, T4, T5, R> implements InterfaceC23487j {

        /* renamed from: a */
        public static final C3428c<T1, T2, T3, T4, T5, R> f14895a = new C3428c<>();

        @Override // io.reactivex.functions.InterfaceC23487j
        /* renamed from: a */
        public final C35631Re4<T1, T2, T3, T4, T5> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            return new C35631Re4<>(t1, t2, t3, t4, t5);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010\b\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0004H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"T", "T1", "T2", "T3", "T4", "t", "t1", "t2", "t3", "t4", "LRe4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LRe4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/ObservablesKt$withLatestFrom$2\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: IE4$d */
    /* loaded from: classes3.dex */
    public static final class C3429d<T1, T2, T3, T4, T5, R> implements InterfaceC23487j {

        /* renamed from: a */
        public static final C3429d<T1, T2, T3, T4, T5, R> f14896a = new C3429d<>();

        @Override // io.reactivex.functions.InterfaceC23487j
        /* renamed from: a */
        public final C35631Re4<Pair<? extends Repair, ? extends Boolean>, T1, T2, T3, T4> apply(Pair<? extends Repair, ? extends Boolean> pair, T1 t1, T2 t2, T3 t3, T4 t4) {
            return new C35631Re4<>(pair, t1, t2, t3, t4);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\u0007\u001a\u00028\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"T", "T1", "T2", "T3", "t", "t1", "t2", "t3", "Lwb4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/ObservablesKt$withLatestFrom$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: IE4$e */
    /* loaded from: classes3.dex */
    public static final class C3430e<T1, T2, T3, T4, R> implements InterfaceC23486i {

        /* renamed from: a */
        public static final C3430e<T1, T2, T3, T4, R> f14897a = new C3430e<>();

        @Override // io.reactivex.functions.InterfaceC23486i
        /* renamed from: a */
        public final C51106wb4<Pair<? extends String, ? extends NonRepair>, T1, T2, T3> apply(Pair<? extends String, ? extends NonRepair> pair, T1 t1, T2 t2, T3 t3) {
            return new C51106wb4<>(pair, t1, t2, t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u000f\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\u0004\u0012\u00020\u000e \u0003*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0004\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f0\f2¹\u0001\u0010\u000b\u001a´\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0003*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u00120\u0012.\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b \u0003*\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b\u0018\u00010\u00060\u0006\u00120\u0012.\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0001 \u0003*\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0001\u0018\u00010\u00060\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u0003*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u000f\u0010\u0010"}, m28432d2 = {"LRe4;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RepairCategory;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/RepairIssue;", "", "", "", "Lco/bird/android/model/NonRepair;", "Lco/bird/android/model/wire/WireQuickLink;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "LH6;", "", C17296a.f69688o, "(LRe4;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRepairV3IssuePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssuePresenter.kt\nco/bird/android/feature/repair/v3/issues/RepairV3IssuePresenter$onResume$1\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,356:1\n76#2:357\n96#2,5:358\n187#2,3:363\n187#2,2:366\n189#2:372\n288#3,2:368\n288#3,2:370\n*S KotlinDebug\n*F\n+ 1 RepairV3IssuePresenter.kt\nco/bird/android/feature/repair/v3/issues/RepairV3IssuePresenter$onResume$1\n*L\n125#1:357\n125#1:358,5\n129#1:363,3\n130#1:366,2\n130#1:372\n132#1:368,2\n134#1:370,2\n*E\n"})
    /* renamed from: IE4$f */
    /* loaded from: classes3.dex */
    public static final class C3431f extends Lambda implements Function1<C35631Re4<? extends Optional<RepairCategory>, ? extends List<? extends RepairIssue>, ? extends Map<String, ? extends Set<? extends String>>, ? extends Map<String, ? extends Optional<NonRepair>>, ? extends Optional<WireQuickLink>>, Pair<? extends List<? extends C3023H6>, ? extends Boolean>> {
        public C3431f() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x014c  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0162 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0147 A[SYNTHETIC] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Pair<List<C3023H6>, Boolean> invoke(C35631Re4<Optional<RepairCategory>, ? extends List<RepairIssue>, ? extends Map<String, ? extends Set<String>>, ? extends Map<String, Optional<NonRepair>>, Optional<WireQuickLink>> c35631Re4) {
            Set<String> set;
            boolean z;
            String str;
            Optional optional;
            NonRepair nonRepair;
            boolean z2;
            boolean z3;
            List<NonRepairReason> reasons;
            Iterator<T> it;
            Object obj;
            NonRepairReason nonRepairReason;
            List<NonRepairReason> reasons2;
            Object obj2;
            Intrinsics.checkNotNullParameter(c35631Re4, "<name for destructuring parameter 0>");
            Optional<RepairCategory> m86500a = c35631Re4.m86500a();
            List<RepairIssue> issues = c35631Re4.m86499b();
            Map<String, ? extends Set<String>> selectedRepairs = c35631Re4.m86498c();
            Map<String, Optional<NonRepair>> nonRepairs = c35631Re4.m86497d();
            Optional<WireQuickLink> m86496e = c35631Re4.m86496e();
            Intrinsics.checkNotNullExpressionValue(selectedRepairs, "selectedRepairs");
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ? extends Set<String>> entry : selectedRepairs.entrySet()) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, entry.getValue());
            }
            set = CollectionsKt___CollectionsKt.toSet(arrayList);
            Intrinsics.checkNotNullExpressionValue(issues, "issues");
            Intrinsics.checkNotNullExpressionValue(nonRepairs, "nonRepairs");
            List<C3023H6> m27642a = IE4.this.f14881f.m27642a(m86500a.m59035e(), issues, set, nonRepairs, m86496e.m59035e());
            IE4 ie4 = IE4.this;
            boolean z4 = true;
            if (!selectedRepairs.isEmpty()) {
                for (Map.Entry<String, ? extends Set<String>> entry2 : selectedRepairs.entrySet()) {
                    if (!Intrinsics.areEqual(entry2.getValue(), ie4.f14888m.get(entry2.getKey()))) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                IE4 ie42 = IE4.this;
                if (!nonRepairs.isEmpty()) {
                    for (Map.Entry<String, Optional<NonRepair>> entry3 : nonRepairs.entrySet()) {
                        String key = entry3.getKey();
                        NonRepair m59035e = entry3.getValue().m59035e();
                        String str2 = null;
                        if (m59035e != null && (reasons2 = m59035e.getReasons()) != null) {
                            Iterator<T> it2 = reasons2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    if (((NonRepairReason) obj2).getSelected()) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            NonRepairReason nonRepairReason2 = (NonRepairReason) obj2;
                            if (nonRepairReason2 != null) {
                                str = nonRepairReason2.getReason();
                                optional = (Optional) ie42.f14890o.get(key);
                                if (optional == null) {
                                    nonRepair = (NonRepair) optional.m59035e();
                                } else {
                                    nonRepair = null;
                                }
                                if (nonRepair != null && (reasons = nonRepair.getReasons()) != null) {
                                    it = reasons.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            obj = it.next();
                                            if (((NonRepairReason) obj).getSelected()) {
                                                break;
                                            }
                                        } else {
                                            obj = null;
                                            break;
                                        }
                                    }
                                    nonRepairReason = (NonRepairReason) obj;
                                    if (nonRepairReason != null) {
                                        str2 = nonRepairReason.getReason();
                                    }
                                }
                                if (!Intrinsics.areEqual(m59035e, nonRepair) && Intrinsics.areEqual(str, str2)) {
                                    z2 = false;
                                    continue;
                                } else {
                                    z2 = true;
                                    continue;
                                }
                                if (z2) {
                                    z3 = true;
                                    break;
                                }
                            }
                        }
                        str = null;
                        optional = (Optional) ie42.f14890o.get(key);
                        if (optional == null) {
                        }
                        if (nonRepair != null) {
                            it = reasons.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                }
                                

                                @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003 \u0004*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "LH6;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
                                /* renamed from: IE4$g */
                                /* loaded from: classes3.dex */
                                public static final class C3432g extends Lambda implements Function1<Pair<? extends List<? extends C3023H6>, ? extends Boolean>, Unit> {
                                    public C3432g() {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends C3023H6>, ? extends Boolean> pair) {
                                        invoke2((Pair<? extends List<C3023H6>, Boolean>) pair);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(Pair<? extends List<C3023H6>, Boolean> pair) {
                                        boolean booleanValue = pair.component2().booleanValue();
                                        IE4.this.f14882g.m85809b(pair.component1());
                                        IE4.this.f14882g.m85808b2(booleanValue);
                                    }
                                }

                                @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000e\u001aj\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000b0\t\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\t \u0004*4\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000b0\t\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\t\u0018\u00010\u00010\u00012Å\u0001\u0010\r\u001aÀ\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0004*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007\u00120\u0012.\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000b \u0004*\u0016\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000b\u0018\u00010\t0\t\u00120\u0012.\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0005 \u0004*\u0016\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0005\u0018\u00010\t0\t0\u0000H\n¢\u0006\u0004\b\u000e\u0010\u000f"}, m28432d2 = {"LRe4;", "Lkotlin/Pair;", "Lco/bird/android/model/Repair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RepairCategory;", "", "Lco/bird/android/model/RepairIssue;", "", "", "", "Lco/bird/android/model/NonRepair;", "<name for destructuring parameter 0>", C17296a.f69688o, "(LRe4;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
                                @SourceDebugExtension({"SMAP\nRepairV3IssuePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssuePresenter.kt\nco/bird/android/feature/repair/v3/issues/RepairV3IssuePresenter$onResume$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,356:1\n223#2:357\n1549#2:358\n1620#2,3:359\n224#2:362\n819#2:369\n847#2,2:370\n1549#2:372\n1620#2,3:373\n37#3,2:363\n125#4:365\n152#4,3:366\n*S KotlinDebug\n*F\n+ 1 RepairV3IssuePresenter.kt\nco/bird/android/feature/repair/v3/issues/RepairV3IssuePresenter$onResume$3\n*L\n156#1:357\n156#1:358\n156#1:359,3\n156#1:362\n172#1:369\n172#1:370,2\n177#1:372\n177#1:373,3\n163#1:363,2\n164#1:365\n164#1:366,3\n*E\n"})
                                /* renamed from: IE4$h */
                                /* loaded from: classes3.dex */
                                public static final class C3433h extends Lambda implements Function1<C35631Re4<? extends Pair<? extends Repair, ? extends Boolean>, ? extends Optional<RepairCategory>, ? extends List<? extends RepairIssue>, ? extends Map<String, ? extends Set<? extends String>>, ? extends Map<String, ? extends Optional<NonRepair>>>, Pair<? extends Map<String, ? extends Set<? extends String>>, ? extends Map<String, ? extends Optional<NonRepair>>>> {

                                    /* renamed from: g */
                                    public static final C3433h f14900g = new C3433h();

                                    public C3433h() {
                                        super(1);
                                    }

                                    /* JADX WARN: Code restructure failed: missing block: B:41:0x014d, code lost:
                                        if (r0 == null) goto L65;
                                     */
                                    @Override // kotlin.jvm.functions.Function1
                                    /* renamed from: a */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Pair<Map<String, Set<String>>, Map<String, Optional<NonRepair>>> invoke(C35631Re4<Pair<Repair, Boolean>, Optional<RepairCategory>, ? extends List<RepairIssue>, ? extends Map<String, ? extends Set<String>>, ? extends Map<String, Optional<NonRepair>>> c35631Re4) {
                                        int collectionSizeOrDefault;
                                        Set emptySet;
                                        int collectionSizeOrDefault2;
                                        Map map;
                                        Pair m28425to;
                                        Pair m28425to2;
                                        String str;
                                        Intrinsics.checkNotNullParameter(c35631Re4, "<name for destructuring parameter 0>");
                                        Pair<Repair, Boolean> m86500a = c35631Re4.m86500a();
                                        Optional<RepairCategory> m86499b = c35631Re4.m86499b();
                                        List<RepairIssue> issues = c35631Re4.m86498c();
                                        Map<String, ? extends Set<String>> m86497d = c35631Re4.m86497d();
                                        Map<String, Optional<NonRepair>> nonRepairs = c35631Re4.m86496e();
                                        Repair component1 = m86500a.component1();
                                        boolean booleanValue = m86500a.component2().booleanValue();
                                        Intrinsics.checkNotNullExpressionValue(issues, "issues");
                                        for (RepairIssue repairIssue : issues) {
                                            List<Repair> repairs = repairIssue.getRepairs();
                                            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(repairs, 10);
                                            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                                            for (Repair repair : repairs) {
                                                arrayList.add(repair.getId());
                                            }
                                            if (arrayList.contains(component1.getId())) {
                                                if (booleanValue) {
                                                    SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                                                    Set<String> set = m86497d.get(repairIssue.getId());
                                                    if (set == null) {
                                                        set = SetsKt__SetsKt.emptySet();
                                                    }
                                                    spreadBuilder.addSpread(set.toArray(new String[0]));
                                                    spreadBuilder.add(component1.getId());
                                                    emptySet = SetsKt__SetsKt.setOf(spreadBuilder.toArray(new String[spreadBuilder.size()]));
                                                    Intrinsics.checkNotNullExpressionValue(nonRepairs, "nonRepairs");
                                                    ArrayList arrayList2 = new ArrayList(nonRepairs.size());
                                                    for (Map.Entry<String, Optional<NonRepair>> entry : nonRepairs.entrySet()) {
                                                        String key = entry.getKey();
                                                        Optional<NonRepair> value = entry.getValue();
                                                        if (!Intrinsics.areEqual(key, repairIssue.getId())) {
                                                            RepairCategory m59035e = m86499b.m59035e();
                                                            if (m59035e != null) {
                                                                str = m59035e.getId();
                                                            } else {
                                                                str = null;
                                                            }
                                                            if (!Intrinsics.areEqual(key, str)) {
                                                                m28425to2 = TuplesKt.m28425to(key, value);
                                                                arrayList2.add(m28425to2);
                                                            }
                                                        }
                                                        m28425to2 = TuplesKt.m28425to(key, Optional.f63040c.m59034a());
                                                        arrayList2.add(m28425to2);
                                                    }
                                                    nonRepairs = MapsKt__MapsKt.toMap(arrayList2);
                                                } else {
                                                    Set<String> set2 = m86497d.get(repairIssue.getId());
                                                    if (set2 != null) {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        for (Object obj : set2) {
                                                            if (!Intrinsics.areEqual((String) obj, component1.getId())) {
                                                                arrayList3.add(obj);
                                                            }
                                                        }
                                                        emptySet = CollectionsKt___CollectionsKt.toSet(arrayList3);
                                                    }
                                                    emptySet = SetsKt__SetsKt.emptySet();
                                                    Intrinsics.checkNotNullExpressionValue(nonRepairs, "nonRepairs");
                                                }
                                                Set<Map.Entry<String, ? extends Set<String>>> entrySet = m86497d.entrySet();
                                                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10);
                                                ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault2);
                                                Iterator<T> it = entrySet.iterator();
                                                while (it.hasNext()) {
                                                    Map.Entry entry2 = (Map.Entry) it.next();
                                                    String str2 = (String) entry2.getKey();
                                                    Set set3 = (Set) entry2.getValue();
                                                    if (Intrinsics.areEqual(str2, repairIssue.getId())) {
                                                        m28425to = TuplesKt.m28425to(repairIssue.getId(), emptySet);
                                                    } else {
                                                        m28425to = TuplesKt.m28425to(str2, set3);
                                                    }
                                                    arrayList4.add(m28425to);
                                                }
                                                map = MapsKt__MapsKt.toMap(arrayList4);
                                                return TuplesKt.m28425to(map, nonRepairs);
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                }

                                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                                /* renamed from: IE4$i */
                                /* loaded from: classes3.dex */
                                public /* synthetic */ class C3434i extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
                                    public C3434i(Object obj) {
                                        super(1, obj, IE4.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                        invoke2(th);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(Throwable p0) {
                                        Intrinsics.checkNotNullParameter(p0, "p0");
                                        ((IE4) this.receiver).m102758B(p0);
                                    }
                                }

                                @Metadata(m28433d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012n\u0010\u0002\u001aj\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004 \t*4\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\n"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/NonRepair;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                                /* renamed from: IE4$j */
                                /* loaded from: classes3.dex */
                                public static final class C3435j extends Lambda implements Function1<Pair<? extends Map<String, ? extends Set<? extends String>>, ? extends Map<String, ? extends Optional<NonRepair>>>, Unit> {
                                    public C3435j() {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Map<String, ? extends Set<? extends String>>, ? extends Map<String, ? extends Optional<NonRepair>>> pair) {
                                        invoke2((Pair<? extends Map<String, ? extends Set<String>>, ? extends Map<String, Optional<NonRepair>>>) pair);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(Pair<? extends Map<String, ? extends Set<String>>, ? extends Map<String, Optional<NonRepair>>> pair) {
                                        IE4.this.f14889n.onNext(pair.component1());
                                        IE4.this.f14891p.onNext(pair.component2());
                                    }
                                }

                                @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0005*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002 \u0005*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/NonRepair;", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
                                /* renamed from: IE4$k */
                                /* loaded from: classes3.dex */
                                public static final class C3436k extends Lambda implements Function1<Pair<? extends String, ? extends NonRepair>, InterfaceC24574u<? extends Pair<? extends String, ? extends NonRepair>>> {

                                    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/NonRepair;", "selectedNonRepair", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/NonRepair;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
                                    /* renamed from: IE4$k$a */
                                    /* loaded from: classes3.dex */
                                    public static final class C3437a extends Lambda implements Function1<NonRepair, Pair<? extends String, ? extends NonRepair>> {

                                        /* renamed from: g */
                                        public final /* synthetic */ String f14903g;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C3437a(String str) {
                                            super(1);
                                            this.f14903g = str;
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        /* renamed from: a */
                                        public final Pair<String, NonRepair> invoke(NonRepair selectedNonRepair) {
                                            Intrinsics.checkNotNullParameter(selectedNonRepair, "selectedNonRepair");
                                            return TuplesKt.m28425to(this.f14903g, selectedNonRepair);
                                        }
                                    }

                                    public C3436k() {
                                        super(1);
                                    }

                                    public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
                                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                        return (Pair) tmp0.invoke(obj);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    /* renamed from: b */
                                    public final InterfaceC24574u<? extends Pair<String, NonRepair>> invoke(Pair<String, NonRepair> pair) {
                                        Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                                        AbstractC24507p<NonRepair> m85811Tl = IE4.this.f14882g.m85811Tl(pair.component2());
                                        final C3437a c3437a = new C3437a(pair.component1());
                                        return m85811Tl.m32067H(new InterfaceC23492o() { // from class: JE4
                                            @Override // io.reactivex.functions.InterfaceC23492o
                                            public final Object apply(Object obj) {
                                                Pair invoke$lambda$0;
                                                invoke$lambda$0 = IE4.C3436k.invoke$lambda$0(Function1.this, obj);
                                                return invoke$lambda$0;
                                            }
                                        });
                                    }
                                }

                                @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\b\u0003\u0010\n\u001a\u009e\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\u0007\u00120\u0012.\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b \u0004*\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0018\u00010\u00070\u0007 \u0004*N\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\u0007\u00120\u0012.\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b \u0004*\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0018\u00010\u00070\u0007\u0018\u00010\u00010\u00012«\u0001\u0010\t\u001a¦\u0001\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0004*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u00120\u0012.\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0005 \u0004*\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u00070\u0007\u00120\u0012.\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b \u0004*\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0018\u00010\u00070\u00070\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lwb4;", "Lkotlin/Pair;", "", "Lco/bird/android/model/NonRepair;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RepairCategory;", "", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lwb4;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
                                @SourceDebugExtension({"SMAP\nRepairV3IssuePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssuePresenter.kt\nco/bird/android/feature/repair/v3/issues/RepairV3IssuePresenter$onResume$7\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,356:1\n125#2:357\n152#2,3:358\n125#2:361\n152#2,3:362\n*S KotlinDebug\n*F\n+ 1 RepairV3IssuePresenter.kt\nco/bird/android/feature/repair/v3/issues/RepairV3IssuePresenter$onResume$7\n*L\n204#1:357\n204#1:358,3\n214#1:361\n214#1:362,3\n*E\n"})
                                /* renamed from: IE4$l */
                                /* loaded from: classes3.dex */
                                public static final class C3438l extends Lambda implements Function1<C51106wb4<? extends Pair<? extends String, ? extends NonRepair>, ? extends Optional<RepairCategory>, ? extends Map<String, ? extends Optional<NonRepair>>, ? extends Map<String, ? extends Set<? extends String>>>, Pair<? extends Map<String, ? extends Optional<NonRepair>>, ? extends Map<String, ? extends Set<? extends String>>>> {

                                    /* renamed from: g */
                                    public static final C3438l f14904g = new C3438l();

                                    public C3438l() {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    /* renamed from: a */
                                    public final Pair<Map<String, Optional<NonRepair>>, Map<String, Set<String>>> invoke(C51106wb4<Pair<String, NonRepair>, Optional<RepairCategory>, ? extends Map<String, Optional<NonRepair>>, ? extends Map<String, ? extends Set<String>>> c51106wb4) {
                                        Map map;
                                        Set emptySet;
                                        Pair m28425to;
                                        String str;
                                        Pair m28425to2;
                                        Intrinsics.checkNotNullParameter(c51106wb4, "<name for destructuring parameter 0>");
                                        Pair<String, NonRepair> m6614a = c51106wb4.m6614a();
                                        Optional<RepairCategory> m6613b = c51106wb4.m6613b();
                                        Map<String, Optional<NonRepair>> nonRepairs = c51106wb4.m6612c();
                                        Map<String, ? extends Set<String>> selectedRepairs = c51106wb4.m6611d();
                                        String component1 = m6614a.component1();
                                        NonRepair component2 = m6614a.component2();
                                        Intrinsics.checkNotNullExpressionValue(nonRepairs, "nonRepairs");
                                        ArrayList arrayList = new ArrayList(nonRepairs.size());
                                        for (Map.Entry<String, Optional<NonRepair>> entry : nonRepairs.entrySet()) {
                                            String key = entry.getKey();
                                            Optional<NonRepair> value = entry.getValue();
                                            if (Intrinsics.areEqual(key, component1)) {
                                                m28425to2 = TuplesKt.m28425to(key, Optional.f63040c.m59032c(component2));
                                            } else {
                                                m28425to2 = TuplesKt.m28425to(key, value);
                                            }
                                            arrayList.add(m28425to2);
                                        }
                                        map = MapsKt__MapsKt.toMap(arrayList);
                                        if (!component2.getAllowRepairs()) {
                                            Intrinsics.checkNotNullExpressionValue(selectedRepairs, "selectedRepairs");
                                            ArrayList arrayList2 = new ArrayList(selectedRepairs.size());
                                            for (Map.Entry<String, ? extends Set<String>> entry2 : selectedRepairs.entrySet()) {
                                                String key2 = entry2.getKey();
                                                Set<String> value2 = entry2.getValue();
                                                if (!Intrinsics.areEqual(component1, key2)) {
                                                    RepairCategory m59035e = m6613b.m59035e();
                                                    if (m59035e != null) {
                                                        str = m59035e.getId();
                                                    } else {
                                                        str = null;
                                                    }
                                                    if (!Intrinsics.areEqual(component1, str)) {
                                                        m28425to = TuplesKt.m28425to(key2, value2);
                                                        arrayList2.add(m28425to);
                                                    }
                                                }
                                                emptySet = SetsKt__SetsKt.emptySet();
                                                m28425to = TuplesKt.m28425to(key2, emptySet);
                                                arrayList2.add(m28425to);
                                            }
                                            selectedRepairs = MapsKt__MapsKt.toMap(arrayList2);
                                        }
                                        return TuplesKt.m28425to(map, selectedRepairs);
                                    }
                                }

                                @Metadata(m28433d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012£\u0001\u0010\u0002\u001a\u009e\u0001\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004\u00120\u0012.\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b \t*\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b\u0018\u00010\u00040\u0004 \t*N\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004\u00120\u0012.\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b \t*\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\n"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/NonRepair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                                /* renamed from: IE4$m */
                                /* loaded from: classes3.dex */
                                public static final class C3439m extends Lambda implements Function1<Pair<? extends Map<String, ? extends Optional<NonRepair>>, ? extends Map<String, ? extends Set<? extends String>>>, Unit> {
                                    public C3439m() {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Map<String, ? extends Optional<NonRepair>>, ? extends Map<String, ? extends Set<? extends String>>> pair) {
                                        invoke2((Pair<? extends Map<String, Optional<NonRepair>>, ? extends Map<String, ? extends Set<String>>>) pair);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(Pair<? extends Map<String, Optional<NonRepair>>, ? extends Map<String, ? extends Set<String>>> pair) {
                                        IE4.this.f14891p.onNext(pair.component1());
                                        IE4.this.f14889n.onNext(pair.component2());
                                    }
                                }

                                @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\n0\n \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\n0\n\u0018\u00010\t0\t2p\u0010\b\u001al\u0012\u0004\u0012\u00020\u0001\u00120\u0012.\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0004 \u0005*\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0004\u0018\u00010\u00020\u0002\u00120\u0012.\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006 \u0005*\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"Lkotlin/Triple;", "", "", "", "", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/NonRepair;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/RepairFlow;", "b", "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
                                @SourceDebugExtension({"SMAP\nRepairV3IssuePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssuePresenter.kt\nco/bird/android/feature/repair/v3/issues/RepairV3IssuePresenter$setupNetworkRequests$1\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,356:1\n515#2:357\n500#2,6:358\n515#2:364\n500#2,6:365\n1549#3:371\n1620#3,2:372\n288#3,2:374\n1622#3:376\n*S KotlinDebug\n*F\n+ 1 RepairV3IssuePresenter.kt\nco/bird/android/feature/repair/v3/issues/RepairV3IssuePresenter$setupNetworkRequests$1\n*L\n260#1:357\n260#1:358,6\n262#1:364\n262#1:365,6\n267#1:371\n267#1:372,2\n273#1:374,2\n267#1:376\n*E\n"})
                                /* renamed from: IE4$n */
                                /* loaded from: classes3.dex */
                                public static final class C3440n extends Lambda implements Function1<Triple<? extends Unit, ? extends Map<String, ? extends Set<? extends String>>, ? extends Map<String, ? extends Optional<NonRepair>>>, InterfaceC23447K<? extends RepairFlow>> {

                                    /* renamed from: h */
                                    public final /* synthetic */ String f14907h;

                                    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00040\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "", "kotlin.jvm.PlatformType", "repairFlows", "Lco/bird/android/model/RepairFlow;", C17296a.f69688o, "([Ljava/lang/Object;)Lco/bird/android/model/RepairFlow;"}, m28431k = 3, m28430mv = {1, 8, 0})
                                    /* renamed from: IE4$n$a */
                                    /* loaded from: classes3.dex */
                                    public static final class C3441a extends Lambda implements Function1<Object[], RepairFlow> {

                                        /* renamed from: g */
                                        public static final C3441a f14908g = new C3441a();

                                        public C3441a() {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        /* renamed from: a */
                                        public final RepairFlow invoke(Object[] repairFlows) {
                                            Object last;
                                            Intrinsics.checkNotNullParameter(repairFlows, "repairFlows");
                                            last = ArraysKt___ArraysKt.last(repairFlows);
                                            Intrinsics.checkNotNull(last, "null cannot be cast to non-null type co.bird.android.model.RepairFlow");
                                            return (RepairFlow) last;
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C3440n(String str) {
                                        super(1);
                                        this.f14907h = str;
                                    }

                                    /* renamed from: c */
                                    public static final RepairFlow m102699c(Function1 tmp0, Object obj) {
                                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                        return (RepairFlow) tmp0.invoke(obj);
                                    }

                                    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e6, code lost:
                                        r5 = kotlin.collections.CollectionsKt___CollectionsKt.toList(r5);
                                     */
                                    @Override // kotlin.jvm.functions.Function1
                                    /* renamed from: b */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final InterfaceC23447K<? extends RepairFlow> invoke(Triple<Unit, ? extends Map<String, ? extends Set<String>>, ? extends Map<String, Optional<NonRepair>>> triple) {
                                        Set<String> plus;
                                        int collectionSizeOrDefault;
                                        List<String> emptyList;
                                        NonRepair nonRepair;
                                        NonRepairReason nonRepairReason;
                                        String str;
                                        NonRepair m59035e;
                                        NonRepair m59035e2;
                                        List<NonRepairReason> reasons;
                                        Object obj;
                                        Set set;
                                        Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
                                        Map<String, ? extends Set<String>> selectedRepairs = triple.component2();
                                        Map<String, Optional<NonRepair>> nonRepairs = triple.component3();
                                        Intrinsics.checkNotNullExpressionValue(nonRepairs, "nonRepairs");
                                        IE4 ie4 = IE4.this;
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        for (Map.Entry<String, Optional<NonRepair>> entry : nonRepairs.entrySet()) {
                                            if (!Intrinsics.areEqual(entry.getValue(), ie4.f14890o.get(entry.getKey()))) {
                                                linkedHashMap.put(entry.getKey(), entry.getValue());
                                            }
                                        }
                                        Set keySet = linkedHashMap.keySet();
                                        Intrinsics.checkNotNullExpressionValue(selectedRepairs, "selectedRepairs");
                                        IE4 ie42 = IE4.this;
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                        Iterator<Map.Entry<String, ? extends Set<String>>> it = selectedRepairs.entrySet().iterator();
                                        while (true) {
                                            Set set2 = null;
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Map.Entry<String, ? extends Set<String>> next = it.next();
                                            set = CollectionsKt___CollectionsKt.toSet(next.getValue());
                                            Set set3 = (Set) ie42.f14888m.get(next.getKey());
                                            if (set3 != null) {
                                                set2 = CollectionsKt___CollectionsKt.toSet(set3);
                                            }
                                            if (!Intrinsics.areEqual(set, set2)) {
                                                linkedHashMap2.put(next.getKey(), next.getValue());
                                            }
                                        }
                                        plus = SetsKt___SetsKt.plus(keySet, (Iterable) linkedHashMap2.keySet());
                                        IE4 ie43 = IE4.this;
                                        String str2 = this.f14907h;
                                        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(plus, 10);
                                        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                                        for (String str3 : plus) {
                                            InterfaceC48265rn6 interfaceC48265rn6 = ie43.f14877b;
                                            Set<String> set4 = selectedRepairs.get(str3);
                                            if (set4 == null || emptyList == null) {
                                                emptyList = CollectionsKt__CollectionsKt.emptyList();
                                            }
                                            List<String> list = emptyList;
                                            Optional<NonRepair> optional = nonRepairs.get(str3);
                                            if (optional != null) {
                                                nonRepair = optional.m59035e();
                                            } else {
                                                nonRepair = null;
                                            }
                                            Optional<NonRepair> optional2 = nonRepairs.get(str3);
                                            if (optional2 != null && (m59035e2 = optional2.m59035e()) != null && (reasons = m59035e2.getReasons()) != null) {
                                                Iterator<T> it2 = reasons.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        obj = it2.next();
                                                        if (((NonRepairReason) obj).getSelected()) {
                                                            break;
                                                        }
                                                    } else {
                                                        obj = null;
                                                        break;
                                                    }
                                                }
                                                nonRepairReason = (NonRepairReason) obj;
                                            } else {
                                                nonRepairReason = null;
                                            }
                                            Optional<NonRepair> optional3 = nonRepairs.get(str3);
                                            if (optional3 != null && (m59035e = optional3.m59035e()) != null) {
                                                str = m59035e.getNotes();
                                            } else {
                                                str = null;
                                            }
                                            arrayList.add(interfaceC48265rn6.mo13667e(str2, str3, list, nonRepair, nonRepairReason, str));
                                        }
                                        final C3441a c3441a = C3441a.f14908g;
                                        return AbstractC23442F.m33107s0(arrayList, new InterfaceC23492o() { // from class: KE4
                                            @Override // io.reactivex.functions.InterfaceC23492o
                                            public final Object apply(Object obj2) {
                                                RepairFlow m102699c;
                                                m102699c = IE4.C3440n.m102699c(Function1.this, obj2);
                                                return m102699c;
                                            }
                                        });
                                    }
                                }

                                @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireQuickLink;", "kotlin.jvm.PlatformType", "quickLink", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireQuickLink;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
                                @SourceDebugExtension({"SMAP\nRepairV3IssuePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairV3IssuePresenter.kt\nco/bird/android/feature/repair/v3/issues/RepairV3IssuePresenter$setupNetworkRequests$10\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,356:1\n1#2:357\n*E\n"})
                                /* renamed from: IE4$o */
                                /* loaded from: classes3.dex */
                                public static final class C3442o extends Lambda implements Function1<WireQuickLink, Unit> {
                                    public C3442o() {
                                        super(1);
                                    }

                                    /* renamed from: a */
                                    public final void m102697a(WireQuickLink wireQuickLink) {
                                        String url = wireQuickLink.getUrl();
                                        if (url != null) {
                                            InterfaceC40099e13.C19924a.goToWebView$default(IE4.this.f14880e, url, wireQuickLink.getDisplay(), null, false, 12, null);
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(WireQuickLink wireQuickLink) {
                                        m102697a(wireQuickLink);
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                                /* renamed from: IE4$p */
                                /* loaded from: classes3.dex */
                                public /* synthetic */ class C3443p extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
                                    public C3443p(Object obj) {
                                        super(1, obj, IE4.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                        invoke2(th);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(Throwable p0) {
                                        Intrinsics.checkNotNullParameter(p0, "p0");
                                        ((IE4) this.receiver).m102758B(p0);
                                    }
                                }

                                @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/RepairFlow;", "kotlin.jvm.PlatformType", "repairFlow", "", C17296a.f69688o, "(Lco/bird/android/model/RepairFlow;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
                                /* renamed from: IE4$q */
                                /* loaded from: classes3.dex */
                                public static final class C3444q extends Lambda implements Function1<RepairFlow, Unit> {
                                    public C3444q() {
                                        super(1);
                                    }

                                    /* renamed from: a */
                                    public final void m102696a(RepairFlow repairFlow) {
                                        Intent intent = new Intent();
                                        intent.putExtra("repair_flow", repairFlow);
                                        IE4.this.f14880e.mo37029e4(-1, intent);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(RepairFlow repairFlow) {
                                        m102696a(repairFlow);
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/Bird;", "bird", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/wire/WireBird;"}, m28431k = 3, m28430mv = {1, 8, 0})
                                /* renamed from: IE4$r */
                                /* loaded from: classes3.dex */
                                public static final class C3445r extends Lambda implements Function1<Bird, WireBird> {

                                    /* renamed from: g */
                                    public static final C3445r f14911g = new C3445r();

                                    public C3445r() {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    /* renamed from: a */
                                    public final WireBird invoke(Bird bird) {
                                        Intrinsics.checkNotNullParameter(bird, "bird");
                                        return C0613BT.m114027f(bird);
                                    }
                                }

                                @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\b \u0004*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\b \u0004*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/Repair;", "", "Lco/bird/android/model/wire/WireBird;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "", "Lco/bird/android/model/wire/WirePart;", "e", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
                                /* renamed from: IE4$s */
                                /* loaded from: classes3.dex */
                                public static final class C3446s extends Lambda implements Function1<Pair<? extends Pair<? extends Repair, ? extends Boolean>, ? extends WireBird>, InterfaceC24574u<? extends List<? extends WirePart>>> {

                                    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WirePart;", "part", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WirePart;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
                                    /* renamed from: IE4$s$a */
                                    /* loaded from: classes3.dex */
                                    public static final class C3447a extends Lambda implements Function1<WirePart, InterfaceC24574u<? extends WirePart>> {

                                        /* renamed from: g */
                                        public final /* synthetic */ IE4 f14913g;

                                        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/u;", "Lco/bird/android/model/wire/WirePart;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
                                        /* renamed from: IE4$s$a$a */
                                        /* loaded from: classes3.dex */
                                        public static final class C3448a extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends WirePart>> {

                                            /* renamed from: g */
                                            public final /* synthetic */ WirePart f14914g;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            public C3448a(WirePart wirePart) {
                                                super(1);
                                                this.f14914g = wirePart;
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            /* renamed from: a */
                                            public final InterfaceC24574u<? extends WirePart> invoke(DialogResponse response) {
                                                Intrinsics.checkNotNullParameter(response, "response");
                                                if (response == DialogResponse.OK) {
                                                    return AbstractC24507p.m32068G(this.f14914g);
                                                }
                                                return AbstractC24507p.m32024u();
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C3447a(IE4 ie4) {
                                            super(1);
                                            this.f14913g = ie4;
                                        }

                                        /* renamed from: c */
                                        public static final InterfaceC24574u m102684c(Function1 tmp0, Object obj) {
                                            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                            return (InterfaceC24574u) tmp0.invoke(obj);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        /* renamed from: b */
                                        public final InterfaceC24574u<? extends WirePart> invoke(WirePart part) {
                                            Intrinsics.checkNotNullParameter(part, "part");
                                            AbstractC23442F<DialogResponse> m85810Ul = this.f14913g.f14882g.m85810Ul(part);
                                            final C3448a c3448a = new C3448a(part);
                                            return m85810Ul.m33163C(new InterfaceC23492o() { // from class: PE4
                                                @Override // io.reactivex.functions.InterfaceC23492o
                                                public final Object apply(Object obj) {
                                                    InterfaceC24574u m102684c;
                                                    m102684c = IE4.C3446s.C3447a.m102684c(Function1.this, obj);
                                                    return m102684c;
                                                }
                                            });
                                        }
                                    }

                                    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0005\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0000 \u0004*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0000 \u0004*\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WirePart;", "part", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WirePart;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
                                    /* renamed from: IE4$s$b */
                                    /* loaded from: classes3.dex */
                                    public static final class C3449b extends Lambda implements Function1<WirePart, InterfaceC24574u<? extends List<? extends WirePart>>> {

                                        /* renamed from: g */
                                        public final /* synthetic */ IE4 f14915g;

                                        /* renamed from: h */
                                        public final /* synthetic */ WireBird f14916h;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C3449b(IE4 ie4, WireBird wireBird) {
                                            super(1);
                                            this.f14915g = ie4;
                                            this.f14916h = wireBird;
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        /* renamed from: a */
                                        public final InterfaceC24574u<? extends List<WirePart>> invoke(WirePart part) {
                                            Intrinsics.checkNotNullParameter(part, "part");
                                            InterfaceC45686nS1 interfaceC45686nS1 = this.f14915g.f14879d;
                                            WireBird wireBird = this.f14916h;
                                            Intrinsics.checkNotNullExpressionValue(wireBird, "wireBird");
                                            return C28237sD.progress$default(InterfaceC45686nS1.C26513a.attachParts$default(interfaceC45686nS1, wireBird, new WirePart[]{part}, null, null, 12, null), this.f14915g.f14882g, 0, 2, (Object) null).m33125j0();
                                        }
                                    }

                                    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                                    /* renamed from: IE4$s$c */
                                    /* loaded from: classes3.dex */
                                    public static final class C3450c extends Lambda implements Function1<Throwable, Unit> {

                                        /* renamed from: g */
                                        public final /* synthetic */ IE4 f14917g;

                                        /* renamed from: h */
                                        public final /* synthetic */ Repair f14918h;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C3450c(IE4 ie4, Repair repair) {
                                            super(1);
                                            this.f14917g = ie4;
                                            this.f14918h = repair;
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                            invoke2(th);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                        public final void invoke2(Throwable th) {
                                            this.f14917g.f14886k.onNext(TuplesKt.m28425to(this.f14918h, Boolean.FALSE));
                                        }
                                    }

                                    public C3446s() {
                                        super(1);
                                    }

                                    /* renamed from: f */
                                    public static final InterfaceC24574u m102689f(Function1 tmp0, Object obj) {
                                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                        return (InterfaceC24574u) tmp0.invoke(obj);
                                    }

                                    /* renamed from: g */
                                    public static final void m102688g(IE4 this$0, Repair repair) {
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        Intrinsics.checkNotNullParameter(repair, "$repair");
                                        this$0.f14886k.onNext(TuplesKt.m28425to(repair, Boolean.FALSE));
                                    }

                                    /* renamed from: h */
                                    public static final void m102687h(Function1 tmp0, Object obj) {
                                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                        tmp0.invoke(obj);
                                    }

                                    public static final InterfaceC24574u invoke$lambda$1(Function1 tmp0, Object obj) {
                                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                        return (InterfaceC24574u) tmp0.invoke(obj);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    /* renamed from: e */
                                    public final InterfaceC24574u<? extends List<WirePart>> invoke(Pair<Pair<Repair, Boolean>, WireBird> pair) {
                                        Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                                        Pair<Repair, Boolean> component1 = pair.component1();
                                        WireBird component2 = pair.component2();
                                        final Repair component12 = component1.component1();
                                        boolean booleanValue = component1.component2().booleanValue();
                                        PartKind partKind = component12.getPartKind();
                                        if (booleanValue && partKind != null) {
                                            AbstractC24507p<WirePart> m85812Sl = IE4.this.f14882g.m85812Sl(partKind);
                                            final C3447a c3447a = new C3447a(IE4.this);
                                            AbstractC24507p<R> m32021x = m85812Sl.m32021x(new InterfaceC23492o() { // from class: LE4
                                                @Override // io.reactivex.functions.InterfaceC23492o
                                                public final Object apply(Object obj) {
                                                    InterfaceC24574u m102689f;
                                                    m102689f = IE4.C3446s.m102689f(Function1.this, obj);
                                                    return m102689f;
                                                }
                                            });
                                            final C3449b c3449b = new C3449b(IE4.this, component2);
                                            AbstractC24507p m32021x2 = m32021x.m32021x(new InterfaceC23492o() { // from class: ME4
                                                @Override // io.reactivex.functions.InterfaceC23492o
                                                public final Object apply(Object obj) {
                                                    InterfaceC24574u invoke$lambda$1;
                                                    invoke$lambda$1 = IE4.C3446s.invoke$lambda$1(Function1.this, obj);
                                                    return invoke$lambda$1;
                                                }
                                            });
                                            final IE4 ie4 = IE4.this;
                                            AbstractC24507p m32031n = m32021x2.m32031n(new InterfaceC23478a() { // from class: NE4
                                                @Override // io.reactivex.functions.InterfaceC23478a
                                                public final void run() {
                                                    IE4.C3446s.m102688g(IE4.this, component12);
                                                }
                                            });
                                            final C3450c c3450c = new C3450c(IE4.this, component12);
                                            return m32031n.m32029p(new InterfaceC23484g() { // from class: OE4
                                                @Override // io.reactivex.functions.InterfaceC23484g
                                                public final void accept(Object obj) {
                                                    IE4.C3446s.m102687h(Function1.this, obj);
                                                }
                                            });
                                        }
                                        return AbstractC24507p.m32024u();
                                    }
                                }

                                @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/wire/WirePart;", "it", "Lio/reactivex/K;", "Lco/bird/android/model/RepairFlow;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
                                /* renamed from: IE4$t */
                                /* loaded from: classes3.dex */
                                public static final class C3451t extends Lambda implements Function1<List<? extends WirePart>, InterfaceC23447K<? extends RepairFlow>> {

                                    /* renamed from: h */
                                    public final /* synthetic */ String f14920h;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C3451t(String str) {
                                        super(1);
                                        this.f14920h = str;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    /* renamed from: a */
                                    public final InterfaceC23447K<? extends RepairFlow> invoke(List<WirePart> it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        return IE4.this.f14877b.mo13670b(this.f14920h);
                                    }
                                }

                                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                                /* renamed from: IE4$u */
                                /* loaded from: classes3.dex */
                                public /* synthetic */ class C3452u extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
                                    public C3452u(Object obj) {
                                        super(1, obj, IE4.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                        invoke2(th);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(Throwable p0) {
                                        Intrinsics.checkNotNullParameter(p0, "p0");
                                        ((IE4) this.receiver).m102758B(p0);
                                    }
                                }

                                @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                                /* renamed from: IE4$v */
                                /* loaded from: classes3.dex */
                                public /* synthetic */ class C3453v extends FunctionReferenceImpl implements Function1<RepairFlow, Unit> {
                                    public C3453v(Object obj) {
                                        super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
                                    }

                                    /* renamed from: a */
                                    public final void m102680a(RepairFlow p0) {
                                        Intrinsics.checkNotNullParameter(p0, "p0");
                                        ((C24552a) this.receiver).onNext(p0);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(RepairFlow repairFlow) {
                                        m102680a(repairFlow);
                                        return Unit.INSTANCE;
                                    }
                                }

                                @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireQuickLink;", "kotlin.jvm.PlatformType", "trainingGuide", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireQuickLink;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
                                /* renamed from: IE4$w */
                                /* loaded from: classes3.dex */
                                public static final class C3454w extends Lambda implements Function1<WireQuickLink, Unit> {

                                    /* renamed from: h */
                                    public final /* synthetic */ String f14922h;

                                    /* renamed from: i */
                                    public final /* synthetic */ String f14923i;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    public C3454w(String str, String str2) {
                                        super(1);
                                        this.f14922h = str;
                                        this.f14923i = str2;
                                    }

                                    /* renamed from: a */
                                    public final void m102679a(WireQuickLink wireQuickLink) {
                                        InterfaceC1880Ea interfaceC1880Ea = IE4.this.f14878c;
                                        String str = this.f14922h;
                                        String str2 = this.f14923i;
                                        String url = wireQuickLink.getUrl();
                                        String linkType = wireQuickLink.getLinkType();
                                        if (linkType == null) {
                                            return;
                                        }
                                        String lowerCase = wireQuickLink.getLinkBehavior().name().toLowerCase();
                                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                                        interfaceC1880Ea.mo55905y(new C50880wC4(null, null, null, str, str2, url, linkType, lowerCase, 7, null));
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(WireQuickLink wireQuickLink) {
                                        m102679a(wireQuickLink);
                                        return Unit.INSTANCE;
                                    }
                                }

                                public IE4(InterfaceC46473om3 operatorManager, InterfaceC48265rn6 vehicleServicingManager, InterfaceC1880Ea analyticsManager, InterfaceC45686nS1 idToolsManager, InterfaceC40099e13 navigator, C44377lE4 converter, SE4 ui, ScopeProvider scopeProvider) {
                                    Map emptyMap;
                                    Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
                                    Intrinsics.checkNotNullParameter(vehicleServicingManager, "vehicleServicingManager");
                                    Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
                                    Intrinsics.checkNotNullParameter(idToolsManager, "idToolsManager");
                                    Intrinsics.checkNotNullParameter(navigator, "navigator");
                                    Intrinsics.checkNotNullParameter(converter, "converter");
                                    Intrinsics.checkNotNullParameter(ui, "ui");
                                    Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
                                    this.f14876a = operatorManager;
                                    this.f14877b = vehicleServicingManager;
                                    this.f14878c = analyticsManager;
                                    this.f14879d = idToolsManager;
                                    this.f14880e = navigator;
                                    this.f14881f = converter;
                                    this.f14882g = ui;
                                    this.f14883h = scopeProvider;
                                    Optional.C14443a c14443a = Optional.f63040c;
                                    C24552a<Optional<RepairCategory>> m31921g = C24552a.m31921g(c14443a.m59034a());
                                    Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault<Optional<R…gory>>(Optional.absent())");
                                    this.f14884i = m31921g;
                                    C24552a<List<RepairIssue>> m31922e = C24552a.m31922e();
                                    Intrinsics.checkNotNullExpressionValue(m31922e, "create<List<RepairIssue>>()");
                                    this.f14885j = m31922e;
                                    C24558d<Pair<Repair, Boolean>> m31902e = C24558d.m31902e();
                                    Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<Repair, Boolean>>()");
                                    this.f14886k = m31902e;
                                    C24552a<Optional<WireQuickLink>> m31921g2 = C24552a.m31921g(c14443a.m59034a());
                                    Intrinsics.checkNotNullExpressionValue(m31921g2, "createDefault<Optional<W…Link>>(Optional.absent())");
                                    this.f14887l = m31921g2;
                                    this.f14888m = new LinkedHashMap();
                                    C24552a<Map<String, Set<String>>> m31922e2 = C24552a.m31922e();
                                    Intrinsics.checkNotNullExpressionValue(m31922e2, "create<Map<String, Set<String>>>()");
                                    this.f14889n = m31922e2;
                                    this.f14890o = new LinkedHashMap();
                                    emptyMap = MapsKt__MapsKt.emptyMap();
                                    C24552a<Map<String, Optional<NonRepair>>> m31921g3 = C24552a.m31921g(emptyMap);
                                    Intrinsics.checkNotNullExpressionValue(m31921g3, "createDefault<Map<String…<NonRepair>>>(emptyMap())");
                                    this.f14891p = m31921g3;
                                    C24552a<RepairFlow> m31922e3 = C24552a.m31922e();
                                    Intrinsics.checkNotNullExpressionValue(m31922e3, "create<RepairFlow>()");
                                    this.f14892q = m31922e3;
                                }

                                /* renamed from: D */
                                public static final Pair m102756D(Function1 tmp0, Object obj) {
                                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                    return (Pair) tmp0.invoke(obj);
                                }

                                /* renamed from: E */
                                public static final void m102755E(Function1 tmp0, Object obj) {
                                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                    tmp0.invoke(obj);
                                }

                                /* renamed from: F */
                                public static final Pair m102754F(Function1 tmp0, Object obj) {
                                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                    return (Pair) tmp0.invoke(obj);
                                }

                                /* renamed from: G */
                                public static final void m102753G(Function1 tmp0, Object obj) {
                                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                    tmp0.invoke(obj);
                                }

                                /* renamed from: H */
                                public static final void m102752H(Function1 tmp0, Object obj) {
                                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                    tmp0.invoke(obj);
                                }

                                /* renamed from: I */
                                public static final InterfaceC24574u m102751I(Function1 tmp0, Object obj) {
                                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                    return (InterfaceC24574u) tmp0.invoke(obj);
                                }

                                /* renamed from: J */
                                public static final Pair m102750J(Function1 tmp0, Object obj) {
                                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                    return (Pair) tmp0.invoke(obj);
                                }

                                /* renamed from: K */
                                public static final void m102749K(Function1 tmp0, Object obj) {
                                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                    tmp0.invoke(obj);
                                }

                                /* renamed from: M */
                                public static final InterfaceC23447K m102747M(Function1 tmp0, Object obj) {
                                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                    return (InterfaceC23447K) tmp0.invoke(obj);
                                }

                                /* renamed from: N */
                                public static final void m102746N(Function1 tmp0, Object obj) {
                                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                    tmp0.invoke(obj);
                                }

                                /* renamed from: O */
                                public static final void m102745O(Function1 tmp0, Object obj) {
                                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                    tmp0.invoke(obj);
                                }

                                /* renamed from: P */
                                public static final WireBird m102744P(Function1 tmp0, Object obj) {
                                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                    return (WireBird) tmp0.invoke(obj);
                                }

                                /* renamed from: Q */
                                public static final InterfaceC24574u m102743Q(Function1 tmp0, Object obj) {
                                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                    return (InterfaceC24574u) tmp0.invoke(obj);
                                }

                                /* renamed from: R */
                                public static final InterfaceC23447K m102742R(Function1 tmp0, Object obj) {
                                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                    return (InterfaceC23447K) tmp0.invoke(obj);
                                }

                                /* renamed from: S */
                                public static final void m102741S(Function1 tmp0, Object obj) {
                                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                    tmp0.invoke(obj);
                                }

                                /* renamed from: T */
                                public static final void m102740T(Function1 tmp0, Object obj) {
                                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                    tmp0.invoke(obj);
                                }

                                /* renamed from: U */
                                public static final void m102739U(Function1 tmp0, Object obj) {
                                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                    tmp0.invoke(obj);
                                }

                                /* renamed from: V */
                                public static final void m102738V(Function1 tmp0, Object obj) {
                                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                    tmp0.invoke(obj);
                                }

                                /* renamed from: w */
                                public static final void m102715w(Function1 tmp0, Object obj) {
                                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                    tmp0.invoke(obj);
                                }

                                /* renamed from: x */
                                public static final void m102714x(Function1 tmp0, Object obj) {
                                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                                    tmp0.invoke(obj);
                                }

                                /* renamed from: y */
                                public static final void m102713y(IE4 this$0) {
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    this$0.f14880e.close();
                                }

                                /* renamed from: A */
                                public final void m102759A(String birdId, RepairIssue issue) {
                                    int collectionSizeOrDefault;
                                    Set set;
                                    Map<String, Set<String>> mapOf;
                                    Object obj;
                                    Map<String, Optional<NonRepair>> mapOf2;
                                    List<RepairIssue> listOf;
                                    Intrinsics.checkNotNullParameter(birdId, "birdId");
                                    Intrinsics.checkNotNullParameter(issue, "issue");
                                    String display = issue.getDisplay();
                                    if (display != null) {
                                        this.f14882g.m85806t(display);
                                    }
                                    ArrayList<Repair> arrayList = new ArrayList();
                                    for (Object obj2 : issue.getRepairs()) {
                                        if (((Repair) obj2).getSelected()) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                                    ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
                                    for (Repair repair : arrayList) {
                                        arrayList2.add(repair.getId());
                                    }
                                    set = CollectionsKt___CollectionsKt.toSet(arrayList2);
                                    mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(issue.getId(), set));
                                    this.f14888m.putAll(mapOf);
                                    this.f14889n.onNext(mapOf);
                                    String id = issue.getId();
                                    Optional.C14443a c14443a = Optional.f63040c;
                                    Iterator<T> it = issue.getNonRepairs().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj = it.next();
                                            if (((NonRepair) obj).getSelected()) {
                                                break;
                                            }
                                        } else {
                                            obj = null;
                                            break;
                                        }
                                    }
                                    mapOf2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(id, c14443a.m59033b(obj)));
                                    this.f14890o.putAll(mapOf2);
                                    this.f14891p.onNext(mapOf2);
                                    C24552a<List<RepairIssue>> c24552a = this.f14885j;
                                    listOf = CollectionsKt__CollectionsJVMKt.listOf(issue);
                                    c24552a.onNext(listOf);
                                    WireQuickLink trainingGuide = issue.getTrainingGuide();
                                    if (trainingGuide != null) {
                                        this.f14887l.onNext(Optional.f63040c.m59032c(trainingGuide));
                                    }
                                    m102748L(birdId, issue.getId());
                                }

                                /* renamed from: B */
                                public final void m102758B(Throwable th) {
                                    RetrofitException retrofitException;
                                    C41318g46.m40159e(th);
                                    Unit unit = null;
                                    if (th instanceof RetrofitException) {
                                        retrofitException = (RetrofitException) th;
                                    } else {
                                        retrofitException = null;
                                    }
                                    if (retrofitException != null) {
                                        this.f14882g.error(retrofitException);
                                        unit = Unit.INSTANCE;
                                    }
                                    if (unit == null) {
                                        this.f14882g.errorGeneric();
                                    }
                                }

                                /* renamed from: C */
                                public final void m102757C() {
                                    C40463ee3 c40463ee3 = C40463ee3.f78649a;
                                    Observable combineLatest = Observable.combineLatest(this.f14884i, this.f14885j, this.f14889n, this.f14891p, this.f14887l, C3428c.f14895a);
                                    Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…nt(t1, t2, t3, t4, t5) })");
                                    Observable observeOn = combineLatest.observeOn(C24542a.m31934a());
                                    final C3431f c3431f = new C3431f();
                                    Observable observeOn2 = observeOn.map(new InterfaceC23492o() { // from class: rE4
                                        @Override // io.reactivex.functions.InterfaceC23492o
                                        public final Object apply(Object obj) {
                                            Pair m102756D;
                                            m102756D = IE4.m102756D(Function1.this, obj);
                                            return m102756D;
                                        }
                                    }).observeOn(C23454a.m33087a());
                                    Intrinsics.checkNotNullExpressionValue(observeOn2, "fun onResume() {\n    Obs…datedRepairs)\n      }\n  }");
                                    Object m33094as = observeOn2.m33094as(AutoDispose.m45239a(this.f14883h));
                                    Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
                                    final C3432g c3432g = new C3432g();
                                    ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: sE4
                                        @Override // io.reactivex.functions.InterfaceC23484g
                                        public final void accept(Object obj) {
                                            IE4.m102755E(Function1.this, obj);
                                        }
                                    });
                                    Observable merge = Observable.merge(this.f14882g.m85814Ql(), this.f14886k);
                                    Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      ui.repairSe…tionOverrideSubject\n    )");
                                    Observable withLatestFrom = merge.withLatestFrom(this.f14884i, this.f14885j, this.f14889n, this.f14891p, C3429d.f14896a);
                                    Intrinsics.checkNotNullExpressionValue(withLatestFrom, "withLatestFrom(o1, o2, o…int(t, t1, t2, t3, t4) })");
                                    final C3433h c3433h = C3433h.f14900g;
                                    Observable map = withLatestFrom.map(new InterfaceC23492o() { // from class: tE4
                                        @Override // io.reactivex.functions.InterfaceC23492o
                                        public final Object apply(Object obj) {
                                            Pair m102754F;
                                            m102754F = IE4.m102754F(Function1.this, obj);
                                            return m102754F;
                                        }
                                    });
                                    final C3434i c3434i = new C3434i(this);
                                    Observable retry = map.doOnError(new InterfaceC23484g() { // from class: uE4
                                        @Override // io.reactivex.functions.InterfaceC23484g
                                        public final void accept(Object obj) {
                                            IE4.m102753G(Function1.this, obj);
                                        }
                                    }).retry();
                                    Intrinsics.checkNotNullExpressionValue(retry, "merge(\n      ui.repairSe…::onError)\n      .retry()");
                                    Object m33094as2 = retry.m33094as(AutoDispose.m45239a(this.f14883h));
                                    Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
                                    final C3435j c3435j = new C3435j();
                                    ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: vE4
                                        @Override // io.reactivex.functions.InterfaceC23484g
                                        public final void accept(Object obj) {
                                            IE4.m102752H(Function1.this, obj);
                                        }
                                    });
                                    Observable<Pair<String, NonRepair>> m85815Pl = this.f14882g.m85815Pl();
                                    final C3436k c3436k = new C3436k();
                                    Observable<R> flatMapMaybe = m85815Pl.flatMapMaybe(new InterfaceC23492o() { // from class: wE4
                                        @Override // io.reactivex.functions.InterfaceC23492o
                                        public final Object apply(Object obj) {
                                            InterfaceC24574u m102751I;
                                            m102751I = IE4.m102751I(Function1.this, obj);
                                            return m102751I;
                                        }
                                    });
                                    Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "fun onResume() {\n    Obs…datedRepairs)\n      }\n  }");
                                    Observable withLatestFrom2 = flatMapMaybe.withLatestFrom(this.f14884i, this.f14891p, this.f14889n, C3430e.f14897a);
                                    Intrinsics.checkNotNullExpressionValue(withLatestFrom2, "withLatestFrom(o1, o2, o…-> Quad(t, t1, t2, t3) })");
                                    final C3438l c3438l = C3438l.f14904g;
                                    Observable map2 = withLatestFrom2.map(new InterfaceC23492o() { // from class: xE4
                                        @Override // io.reactivex.functions.InterfaceC23492o
                                        public final Object apply(Object obj) {
                                            Pair m102750J;
                                            m102750J = IE4.m102750J(Function1.this, obj);
                                            return m102750J;
                                        }
                                    });
                                    Intrinsics.checkNotNullExpressionValue(map2, "fun onResume() {\n    Obs…datedRepairs)\n      }\n  }");
                                    Object m33094as3 = map2.m33094as(AutoDispose.m45239a(this.f14883h));
                                    Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
                                    final C3439m c3439m = new C3439m();
                                    ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: zE4
                                        @Override // io.reactivex.functions.InterfaceC23484g
                                        public final void accept(Object obj) {
                                            IE4.m102749K(Function1.this, obj);
                                        }
                                    });
                                }

                                /* renamed from: L */
                                public final void m102748L(String str, String str2) {
                                    Observable m31949b = C24527f.m31949b(this.f14882g.m85807f(), this.f14889n, this.f14891p);
                                    final C3440n c3440n = new C3440n(str);
                                    Observable observeOn = m31949b.flatMapSingle(new InterfaceC23492o() { // from class: BE4
                                        @Override // io.reactivex.functions.InterfaceC23492o
                                        public final Object apply(Object obj) {
                                            InterfaceC23447K m102747M;
                                            m102747M = IE4.m102747M(Function1.this, obj);
                                            return m102747M;
                                        }
                                    }).observeOn(C23454a.m33087a());
                                    final C3443p c3443p = new C3443p(this);
                                    Observable retry = observeOn.doOnError(new InterfaceC23484g() { // from class: CE4
                                        @Override // io.reactivex.functions.InterfaceC23484g
                                        public final void accept(Object obj) {
                                            IE4.m102746N(Function1.this, obj);
                                        }
                                    }).retry();
                                    Intrinsics.checkNotNullExpressionValue(retry, "private fun setupNetwork…nk.display) }\n      }\n  }");
                                    Object m33094as = retry.m33094as(AutoDispose.m45239a(this.f14883h));
                                    Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
                                    final C3444q c3444q = new C3444q();
                                    ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: DE4
                                        @Override // io.reactivex.functions.InterfaceC23484g
                                        public final void accept(Object obj) {
                                            IE4.m102745O(Function1.this, obj);
                                        }
                                    });
                                    Observable<Pair<Repair, Boolean>> m85814Ql = this.f14882g.m85814Ql();
                                    Observable<Bird> mo8118a = this.f14876a.mo8118a(str);
                                    final C3445r c3445r = C3445r.f14911g;
                                    InterfaceC23434B map = mo8118a.map(new InterfaceC23492o() { // from class: EE4
                                        @Override // io.reactivex.functions.InterfaceC23492o
                                        public final Object apply(Object obj) {
                                            WireBird m102744P;
                                            m102744P = IE4.m102744P(Function1.this, obj);
                                            return m102744P;
                                        }
                                    });
                                    Intrinsics.checkNotNullExpressionValue(map, "operatorManager.streamBi…rd -> bird.toWireBird() }");
                                    Observable m31950a = C24527f.m31950a(m85814Ql, map);
                                    final C3446s c3446s = new C3446s();
                                    Observable flatMapMaybe = m31950a.flatMapMaybe(new InterfaceC23492o() { // from class: FE4
                                        @Override // io.reactivex.functions.InterfaceC23492o
                                        public final Object apply(Object obj) {
                                            InterfaceC24574u m102743Q;
                                            m102743Q = IE4.m102743Q(Function1.this, obj);
                                            return m102743Q;
                                        }
                                    });
                                    final C3451t c3451t = new C3451t(str);
                                    Observable flatMapSingle = flatMapMaybe.flatMapSingle(new InterfaceC23492o() { // from class: GE4
                                        @Override // io.reactivex.functions.InterfaceC23492o
                                        public final Object apply(Object obj) {
                                            InterfaceC23447K m102742R;
                                            m102742R = IE4.m102742R(Function1.this, obj);
                                            return m102742R;
                                        }
                                    });
                                    final C3452u c3452u = new C3452u(this);
                                    Observable retry2 = flatMapSingle.doOnError(new InterfaceC23484g() { // from class: HE4
                                        @Override // io.reactivex.functions.InterfaceC23484g
                                        public final void accept(Object obj) {
                                            IE4.m102741S(Function1.this, obj);
                                        }
                                    }).retry();
                                    Intrinsics.checkNotNullExpressionValue(retry2, "private fun setupNetwork…nk.display) }\n      }\n  }");
                                    Object m33094as2 = retry2.m33094as(AutoDispose.m45239a(this.f14883h));
                                    Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
                                    final C3453v c3453v = new C3453v(this.f14892q);
                                    ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: oE4
                                        @Override // io.reactivex.functions.InterfaceC23484g
                                        public final void accept(Object obj) {
                                            IE4.m102740T(Function1.this, obj);
                                        }
                                    });
                                    Observable<WireQuickLink> m85813Rl = this.f14882g.m85813Rl();
                                    final C3454w c3454w = new C3454w(str, str2);
                                    Observable<WireQuickLink> doAfterNext = m85813Rl.doAfterNext(new InterfaceC23484g() { // from class: pE4
                                        @Override // io.reactivex.functions.InterfaceC23484g
                                        public final void accept(Object obj) {
                                            IE4.m102739U(Function1.this, obj);
                                        }
                                    });
                                    Intrinsics.checkNotNullExpressionValue(doAfterNext, "private fun setupNetwork…nk.display) }\n      }\n  }");
                                    Object m33094as3 = doAfterNext.m33094as(AutoDispose.m45239a(this.f14883h));
                                    Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
                                    final C3442o c3442o = new C3442o();
                                    ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: qE4
                                        @Override // io.reactivex.functions.InterfaceC23484g
                                        public final void accept(Object obj) {
                                            IE4.m102738V(Function1.this, obj);
                                        }
                                    });
                                }

                                /* renamed from: v */
                                public final void m102716v() {
                                    AbstractC24507p<RepairFlow> firstElement = this.f14892q.firstElement();
                                    Intrinsics.checkNotNullExpressionValue(firstElement, "repairFlowSubject.firstElement()");
                                    Object m32048b = firstElement.m32048b(AutoDispose.m45239a(this.f14883h));
                                    Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
                                    final C3426a c3426a = new C3426a();
                                    InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: nE4
                                        @Override // io.reactivex.functions.InterfaceC23484g
                                        public final void accept(Object obj) {
                                            IE4.m102715w(Function1.this, obj);
                                        }
                                    };
                                    final C3427b c3427b = C3427b.f14894g;
                                    ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: yE4
                                        @Override // io.reactivex.functions.InterfaceC23484g
                                        public final void accept(Object obj) {
                                            IE4.m102714x(Function1.this, obj);
                                        }
                                    }, new InterfaceC23478a() { // from class: AE4
                                        @Override // io.reactivex.functions.InterfaceC23478a
                                        public final void run() {
                                            IE4.m102713y(IE4.this);
                                        }
                                    });
                                    this.f14892q.onComplete();
                                }

                                /* renamed from: z */
                                public final void m102712z(String birdId, RepairCategory category) {
                                    int collectionSizeOrDefault;
                                    int collectionSizeOrDefault2;
                                    Map<String, Set<String>> map;
                                    Object obj;
                                    Map<String, Optional<NonRepair>> mapOf;
                                    int collectionSizeOrDefault3;
                                    Set set;
                                    Intrinsics.checkNotNullParameter(birdId, "birdId");
                                    Intrinsics.checkNotNullParameter(category, "category");
                                    String display = category.getDisplay();
                                    if (display != null) {
                                        this.f14882g.m85806t(display);
                                    }
                                    List<RepairIssue> issues = category.getIssues();
                                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(issues, 10);
                                    ArrayList<Pair> arrayList = new ArrayList(collectionSizeOrDefault);
                                    for (RepairIssue repairIssue : issues) {
                                        String id = repairIssue.getId();
                                        ArrayList arrayList2 = new ArrayList();
                                        for (Object obj2 : repairIssue.getRepairs()) {
                                            if (((Repair) obj2).getSelected()) {
                                                arrayList2.add(obj2);
                                            }
                                        }
                                        arrayList.add(TuplesKt.m28425to(id, arrayList2));
                                    }
                                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
                                    ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
                                    for (Pair pair : arrayList) {
                                        String str = (String) pair.component1();
                                        List<Repair> list = (List) pair.component2();
                                        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                                        ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault3);
                                        for (Repair repair : list) {
                                            arrayList4.add(repair.getId());
                                        }
                                        set = CollectionsKt___CollectionsKt.toSet(arrayList4);
                                        arrayList3.add(TuplesKt.m28425to(str, set));
                                    }
                                    map = MapsKt__MapsKt.toMap(arrayList3);
                                    this.f14888m.putAll(map);
                                    this.f14889n.onNext(map);
                                    String id2 = category.getId();
                                    Optional.C14443a c14443a = Optional.f63040c;
                                    Iterator<T> it = category.getNonRepairs().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj = it.next();
                                            if (((NonRepair) obj).getSelected()) {
                                                break;
                                            }
                                        } else {
                                            obj = null;
                                            break;
                                        }
                                    }
                                    mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(id2, c14443a.m59033b(obj)));
                                    this.f14890o.putAll(mapOf);
                                    this.f14891p.onNext(mapOf);
                                    C24552a<Optional<RepairCategory>> c24552a = this.f14884i;
                                    Optional.C14443a c14443a2 = Optional.f63040c;
                                    c24552a.onNext(c14443a2.m59032c(category));
                                    this.f14885j.onNext(category.getIssues());
                                    WireQuickLink trainingGuide = category.getTrainingGuide();
                                    if (trainingGuide != null) {
                                        this.f14887l.onNext(c14443a2.m59032c(trainingGuide));
                                    }
                                    m102748L(birdId, category.getId());
                                }
                            }
