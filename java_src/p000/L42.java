package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.InspectionCategory;
import co.bird.android.model.InspectionCategoryStatus;
import co.bird.android.model.InspectionFlow;
import co.bird.android.model.InspectionIssue;
import co.bird.android.model.constant.InspectionContext;
import co.bird.android.model.constant.Permission;
import co.bird.api.error.RetrofitException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23487j;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import p000.H31;
import p000.L42;
@Metadata(m28433d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(¢\u0006\u0004\bB\u0010CJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u00101\u001a\u0010\u0012\f\u0012\n .*\u0004\u0018\u00010-0-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R.\u00103\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 .*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r0\r0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R.\u00105\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 .*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r0\r0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00100R.\u00107\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 .*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r0\r0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00100R.\u00109\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 .*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r0\r0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00100R>\u0010?\u001a,\u0012(\u0012&\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010< .*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010<\u0018\u00010;0;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R:\u0010A\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020< .*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020<\u0018\u00010;0;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>¨\u0006H²\u0006\u0012\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\r8\nX\u008a\u0084\u0002²\u0006\u0012\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\r8\nX\u008a\u0084\u0002"}, m28432d2 = {"LL42;", "", "", "birdId", "Lco/bird/android/model/constant/InspectionContext;", "inspectionContext", "", "x", "I", "", "e", "H", "T", "", "item", "X", "(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;", "Lrn6;", C17296a.f69688o, "Lrn6;", "vehicleServicingManager", "LDQ3;", "b", "LDQ3;", "permissionManager", "LTq4;", "c", "LTq4;", "reactiveConfig", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "LR42;", "LR42;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "f", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Ll42;", "g", "Ll42;", "converter", "Lio/reactivex/subjects/a;", "Lco/bird/android/model/InspectionFlow;", "kotlin.jvm.PlatformType", "h", "Lio/reactivex/subjects/a;", "inspectionFlowSubject", "i", "failedCategoriesSubject", "j", "selectedIssuesSubject", "k", "passedInspectionsSubject", "l", "expandedCategoriesSubject", "Lio/reactivex/subjects/d;", "Lkotlin/Pair;", "", "m", "Lio/reactivex/subjects/d;", "categoryOverrideSubject", "n", "issueOverrideSubject", "<init>", "(Lrn6;LDQ3;LTq4;Le13;LR42;Lcom/uber/autodispose/ScopeProvider;Ll42;)V", "Lco/bird/android/model/InspectionCategory;", "openCategories", "Lco/bird/android/model/InspectionIssue;", "openIssues", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInspectionV3Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n+ 4 Observables.kt\nco/bird/android/library/rx/Observables\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,308:1\n199#2:309\n180#2:311\n180#2:312\n180#2:315\n180#2:316\n180#2:317\n180#2:318\n180#2:319\n180#2:320\n271#3:310\n82#4,2:313\n1#5:321\n819#6:322\n847#6,2:323\n37#7,2:325\n*S KotlinDebug\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter\n*L\n74#1:309\n141#1:311\n152#1:312\n182#1:315\n212#1:316\n246#1:317\n261#1:318\n274#1:319\n283#1:320\n84#1:310\n158#1:313,2\n298#1:322\n298#1:323,2\n303#1:325,2\n*E\n"})
/* renamed from: L42 */
/* loaded from: classes3.dex */
public final class L42 {

    /* renamed from: a */
    public final InterfaceC48265rn6 f20674a;

    /* renamed from: b */
    public final DQ3 f20675b;

    /* renamed from: c */
    public final C36207Tq4 f20676c;

    /* renamed from: d */
    public final InterfaceC40099e13 f20677d;

    /* renamed from: e */
    public final R42 f20678e;

    /* renamed from: f */
    public final ScopeProvider f20679f;

    /* renamed from: g */
    public final C44279l42 f20680g;

    /* renamed from: h */
    public final C24552a<InspectionFlow> f20681h;

    /* renamed from: i */
    public final C24552a<List<String>> f20682i;

    /* renamed from: j */
    public final C24552a<List<String>> f20683j;

    /* renamed from: k */
    public final C24552a<List<String>> f20684k;

    /* renamed from: l */
    public final C24552a<List<String>> f20685l;

    /* renamed from: m */
    public final C24558d<Pair<String, Boolean>> f20686m;

    /* renamed from: n */
    public final C24558d<Pair<String, Boolean>> f20687n;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\f\u0010\f\u001a\u00028\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000\"\b\b\u0004\u0010\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00022\u0006\u0010\t\u001a\u00028\u0003H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"", "T", "T1", "T2", "T3", "R", "t", "t1", "t2", "t3", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$5\n+ 2 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter\n*L\n1#1,304:1\n88#2:305\n*E\n"})
    /* renamed from: L42$a */
    /* loaded from: classes3.dex */
    public static final class C4700a<T1, T2, T3, T4, R> implements InterfaceC23486i<Unit, T1, T2, T3, R> {
        @Override // io.reactivex.functions.InterfaceC23486i
        public final R apply(Unit unit, T1 t1, T2 t2, T3 t3) {
            return (R) new Triple((InspectionFlow) t1, (List) t2, (List) t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: L42$b */
    /* loaded from: classes3.dex */
    public static final class C4701b extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f20689h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4701b(String str) {
            super(1);
            this.f20689h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            L42.this.f20678e.m87350Ul(this.f20689h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a^\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*.\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/InspectionFlow;", "inspection", "Lwb4;", "", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/InspectionFlow;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectionV3Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter$onCreate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,308:1\n766#2:309\n857#2,2:310\n1549#2:312\n1620#2,3:313\n766#2:316\n857#2,2:317\n1549#2:319\n1620#2,3:320\n1360#2:323\n1446#2,5:324\n766#2:329\n857#2,2:330\n1549#2:332\n1620#2,3:333\n*S KotlinDebug\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter$onCreate$1\n*L\n58#1:309\n58#1:310,2\n61#1:312\n61#1:313,3\n63#1:316\n63#1:317,2\n66#1:319\n66#1:320,3\n68#1:323\n68#1:324,5\n69#1:329\n69#1:330,2\n70#1:332\n70#1:333,3\n*E\n"})
    /* renamed from: L42$c */
    /* loaded from: classes3.dex */
    public static final class C4702c extends Lambda implements Function1<InspectionFlow, C51106wb4<? extends InspectionFlow, ? extends List<? extends String>, ? extends List<? extends String>, ? extends List<? extends String>>> {

        /* renamed from: g */
        public static final C4702c f20690g = new C4702c();

        public C4702c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C51106wb4<InspectionFlow, List<String>, List<String>, List<String>> invoke(InspectionFlow inspection) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            int collectionSizeOrDefault3;
            boolean z;
            Intrinsics.checkNotNullParameter(inspection, "inspection");
            ArrayList<InspectionCategory> arrayList = new ArrayList();
            Iterator<T> it = inspection.getCategories().iterator();
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((InspectionCategory) next).getStatus() != InspectionCategoryStatus.PASSED) {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (InspectionCategory inspectionCategory : arrayList) {
                arrayList2.add(inspectionCategory.getId());
            }
            ArrayList<InspectionCategory> arrayList3 = new ArrayList();
            for (Object obj : inspection.getCategories()) {
                if (((InspectionCategory) obj).getStatus() == InspectionCategoryStatus.FAILED) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList3.add(obj);
                }
            }
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10);
            ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault2);
            for (InspectionCategory inspectionCategory2 : arrayList3) {
                arrayList4.add(inspectionCategory2.getId());
            }
            ArrayList arrayList5 = new ArrayList();
            for (InspectionCategory inspectionCategory3 : inspection.getCategories()) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList5, inspectionCategory3.getIssues());
            }
            ArrayList<InspectionIssue> arrayList6 = new ArrayList();
            for (Object obj2 : arrayList5) {
                if (((InspectionIssue) obj2).getSelected()) {
                    arrayList6.add(obj2);
                }
            }
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList6, 10);
            ArrayList arrayList7 = new ArrayList(collectionSizeOrDefault3);
            for (InspectionIssue inspectionIssue : arrayList6) {
                arrayList7.add(inspectionIssue.getId());
            }
            return new C51106wb4<>(inspection, arrayList2, arrayList4, arrayList7);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062b\u0010\u0005\u001a^\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lwb4;", "Lco/bird/android/model/InspectionFlow;", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lwb4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: L42$d */
    /* loaded from: classes3.dex */
    public static final class C4703d extends Lambda implements Function1<C51106wb4<? extends InspectionFlow, ? extends List<? extends String>, ? extends List<? extends String>, ? extends List<? extends String>>, Unit> {
        public C4703d() {
            super(1);
        }

        /* renamed from: a */
        public final void m97820a(C51106wb4<InspectionFlow, ? extends List<String>, ? extends List<String>, ? extends List<String>> c51106wb4) {
            L42.this.f20681h.onNext(c51106wb4.m6614a());
            L42.this.f20684k.onNext(c51106wb4.m6613b());
            L42.this.f20682i.onNext(c51106wb4.m6612c());
            L42.this.f20683j.onNext(c51106wb4.m6611d());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C51106wb4<? extends InspectionFlow, ? extends List<? extends String>, ? extends List<? extends String>, ? extends List<? extends String>> c51106wb4) {
            m97820a(c51106wb4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: L42$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C4704e extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C4704e(Object obj) {
            super(1, obj, L42.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((L42) this.receiver).m97864H(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aú\u0001\u0012v\b\u0001\u0012r\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0002*8\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00070\u0007 \u0002*|\u0012v\b\u0001\u0012r\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0002*8\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062H\u0010\u0005\u001aD\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/InspectionFlow;", "kotlin.jvm.PlatformType", "", "", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "Lkotlin/Pair;", "b", "(Lkotlin/Triple;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectionV3Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter$onCreate$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,308:1\n1747#2,3:309\n1747#2,3:312\n*S KotlinDebug\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter$onCreate$5\n*L\n110#1:309,3\n111#1:312,3\n*E\n"})
    /* renamed from: L42$f */
    /* loaded from: classes3.dex */
    public static final class C4705f extends Lambda implements Function1<Triple<? extends InspectionFlow, ? extends List<? extends String>, ? extends List<? extends String>>, InterfaceC24574u<? extends Pair<? extends List<? extends String>, ? extends List<? extends String>>>> {

        /* renamed from: h */
        public final /* synthetic */ InspectionContext f20693h;

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0007\u001aú\u0001\u0012v\b\u0001\u0012r\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*8\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003 \u0006*|\u0012v\b\u0001\u0012r\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*8\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LFQ3;", "response", "Lio/reactivex/u;", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "b", "(LFQ3;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: L42$f$a */
        /* loaded from: classes3.dex */
        public static final class C4706a extends Lambda implements Function1<FQ3, InterfaceC24574u<? extends Pair<? extends List<? extends String>, ? extends List<? extends String>>>> {

            /* renamed from: g */
            public final /* synthetic */ L42 f20694g;

            /* renamed from: h */
            public final /* synthetic */ InspectionFlow f20695h;

            /* renamed from: i */
            public final /* synthetic */ List<String> f20696i;

            /* renamed from: j */
            public final /* synthetic */ List<String> f20697j;

            @Metadata(m28433d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001ar\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*8\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Unit;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: L42$f$a$a */
            /* loaded from: classes3.dex */
            public static final class C4707a extends Lambda implements Function1<Unit, Pair<? extends List<? extends String>, ? extends List<? extends String>>> {

                /* renamed from: g */
                public final /* synthetic */ List<String> f20698g;

                /* renamed from: h */
                public final /* synthetic */ List<String> f20699h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4707a(List<String> list, List<String> list2) {
                    super(1);
                    this.f20698g = list;
                    this.f20699h = list2;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Pair<List<String>, List<String>> invoke(Unit it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return TuplesKt.m28425to(this.f20698g, this.f20699h);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4706a(L42 l42, InspectionFlow inspectionFlow, List<String> list, List<String> list2) {
                super(1);
                this.f20694g = l42;
                this.f20695h = inspectionFlow;
                this.f20696i = list;
                this.f20697j = list2;
            }

            public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Pair) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC24574u<? extends Pair<List<String>, List<String>>> invoke(FQ3 response) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.m107154a()) {
                    AbstractC23442F<Unit> m87347Xl = this.f20694g.f20678e.m87347Xl(this.f20695h.getCode(), this.f20695h.getVehicleId());
                    final C4707a c4707a = new C4707a(this.f20696i, this.f20697j);
                    return m87347Xl.m33157I(new InterfaceC23492o() { // from class: N42
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            Pair invoke$lambda$0;
                            invoke$lambda$0 = L42.C4705f.C4706a.invoke$lambda$0(Function1.this, obj);
                            return invoke$lambda$0;
                        }
                    }).m33125j0();
                }
                return AbstractC24507p.m32024u();
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/InspectionCategory;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nInspectionV3Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter$onCreate$5$openCategories$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,308:1\n766#2:309\n857#2,2:310\n*S KotlinDebug\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter$onCreate$5$openCategories$2\n*L\n93#1:309\n93#1:310,2\n*E\n"})
        /* renamed from: L42$f$b */
        /* loaded from: classes3.dex */
        public static final class C4708b extends Lambda implements Function0<List<? extends InspectionCategory>> {

            /* renamed from: g */
            public final /* synthetic */ InspectionFlow f20700g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4708b(InspectionFlow inspectionFlow) {
                super(0);
                this.f20700g = inspectionFlow;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InspectionCategory> invoke() {
                ArrayList arrayList = new ArrayList();
                for (Object obj : this.f20700g.getCategories()) {
                    InspectionCategory inspectionCategory = (InspectionCategory) obj;
                    if (inspectionCategory.getNotice() != null || inspectionCategory.getStatus() == InspectionCategoryStatus.FAILED) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/InspectionIssue;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nInspectionV3Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter$onCreate$5$openIssues$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,308:1\n1360#2:309\n1446#2,5:310\n766#2:315\n857#2,2:316\n*S KotlinDebug\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter$onCreate$5$openIssues$2\n*L\n99#1:309\n99#1:310,5\n100#1:315\n100#1:316,2\n*E\n"})
        /* renamed from: L42$f$c */
        /* loaded from: classes3.dex */
        public static final class C4709c extends Lambda implements Function0<List<? extends InspectionIssue>> {

            /* renamed from: g */
            public final /* synthetic */ InspectionFlow f20701g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4709c(InspectionFlow inspectionFlow) {
                super(0);
                this.f20701g = inspectionFlow;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InspectionIssue> invoke() {
                ArrayList arrayList = new ArrayList();
                for (InspectionCategory inspectionCategory : this.f20701g.getCategories()) {
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, inspectionCategory.getIssues());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    InspectionIssue inspectionIssue = (InspectionIssue) obj;
                    if (inspectionIssue.getSelected() || inspectionIssue.getWarningMessage() != null) {
                        arrayList2.add(obj);
                    }
                }
                return arrayList2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4705f(InspectionContext inspectionContext) {
            super(1);
            this.f20693h = inspectionContext;
        }

        /* renamed from: c */
        public static final List<InspectionIssue> m97817c(Lazy<? extends List<InspectionIssue>> lazy) {
            return lazy.getValue();
        }

        /* renamed from: d */
        public static final InterfaceC24574u m97816d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        public static final List<InspectionCategory> invoke$lambda$0(Lazy<? extends List<InspectionCategory>> lazy) {
            return lazy.getValue();
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c2, code lost:
            if (r5 != false) goto L9;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC24574u<? extends Pair<List<String>, List<String>>> invoke(Triple<InspectionFlow, ? extends List<String>, ? extends List<String>> triple) {
            Lazy lazy;
            Lazy lazy2;
            boolean z;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            InspectionFlow component1 = triple.component1();
            List<String> component2 = triple.component2();
            List<String> component3 = triple.component3();
            lazy = LazyKt__LazyJVMKt.lazy(new C4708b(component1));
            lazy2 = LazyKt__LazyJVMKt.lazy(new C4709c(component1));
            if (L42.this.f20676c.m82623f8().m73665a().getOperatorConfig().getFeatures().getRepair().getRequireVehicleScanConfirmationForInspection() && this.f20693h != InspectionContext.SCANNER) {
                if (!component2.isEmpty() || !component3.isEmpty()) {
                    List<InspectionCategory> invoke$lambda$0 = invoke$lambda$0(lazy);
                    boolean z2 = true;
                    if (!(invoke$lambda$0 instanceof Collection) || !invoke$lambda$0.isEmpty()) {
                        for (InspectionCategory inspectionCategory : invoke$lambda$0) {
                            if (!component2.contains(inspectionCategory.getId())) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    if (!z) {
                        List<InspectionIssue> m97817c = m97817c(lazy2);
                        if (!(m97817c instanceof Collection) || !m97817c.isEmpty()) {
                            for (InspectionIssue inspectionIssue : m97817c) {
                                if (!component3.contains(inspectionIssue.getId())) {
                                    break;
                                }
                            }
                        }
                        z2 = false;
                    }
                }
                AbstractC23442F<FQ3> m110485l = L42.this.f20675b.m110485l(Permission.CAMERA);
                final C4706a c4706a = new C4706a(L42.this, component1, component2, component3);
                return m110485l.m33163C(new InterfaceC23492o() { // from class: M42
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m97816d;
                        m97816d = L42.C4705f.m97816d(Function1.this, obj);
                        return m97816d;
                    }
                });
            }
            return AbstractC24507p.m32068G(TuplesKt.m28425to(component2, component3));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052:\u0010\u0004\u001a6\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/InspectionFlow;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: L42$g */
    /* loaded from: classes3.dex */
    public static final class C4710g extends Lambda implements Function1<Pair<? extends List<? extends String>, ? extends List<? extends String>>, InterfaceC23447K<? extends InspectionFlow>> {

        /* renamed from: h */
        public final /* synthetic */ String f20703h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4710g(String str) {
            super(1);
            this.f20703h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends InspectionFlow> invoke(Pair<? extends List<String>, ? extends List<String>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<String> selectedCategories = pair.component1();
            List<String> selectedIssues = pair.component2();
            InterfaceC48265rn6 interfaceC48265rn6 = L42.this.f20674a;
            String str = this.f20703h;
            Intrinsics.checkNotNullExpressionValue(selectedCategories, "selectedCategories");
            Intrinsics.checkNotNullExpressionValue(selectedIssues, "selectedIssues");
            return C28237sD.progress$default(interfaceC48265rn6.mo13666f(str, selectedCategories, selectedIssues), L42.this.f20678e, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/InspectionFlow;", "inspectionFlow", "Lio/reactivex/B;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/InspectionFlow;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: L42$h */
    /* loaded from: classes3.dex */
    public static final class C4711h extends Lambda implements Function1<InspectionFlow, InterfaceC23434B<? extends DialogResponse>> {

        /* renamed from: h */
        public final /* synthetic */ InspectionContext f20705h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4711h(InspectionContext inspectionContext) {
            super(1);
            this.f20705h = inspectionContext;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends DialogResponse> invoke(InspectionFlow inspectionFlow) {
            Intrinsics.checkNotNullParameter(inspectionFlow, "inspectionFlow");
            return L42.this.f20678e.m87349Vl(inspectionFlow, this.f20705h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: L42$i */
    /* loaded from: classes3.dex */
    public static final class C4712i extends Lambda implements Function1<DialogResponse, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f20707h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4712i(String str) {
            super(1);
            this.f20707h = str;
        }

        /* renamed from: a */
        public final void m97811a(DialogResponse dialogResponse) {
            if (dialogResponse == DialogResponse.OK) {
                L42.this.f20677d.mo36992l(this.f20707h, 10036);
            } else {
                L42.this.f20677d.mo37050b1(-1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m97811a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: L42$j */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C4713j extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C4713j(Object obj) {
            super(1, obj, L42.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((L42) this.receiver).m97864H(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u00022\u0006\u0010\b\u001a\u00028\u00032\u0006\u0010\t\u001a\u00028\u0004H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"T1", "T2", "T3", "T4", "T5", "t1", "t2", "t3", "t4", "t5", "LRe4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)LRe4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$4\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: L42$k */
    /* loaded from: classes3.dex */
    public static final class C4714k<T1, T2, T3, T4, T5, R> implements InterfaceC23487j {

        /* renamed from: a */
        public static final C4714k<T1, T2, T3, T4, T5, R> f20708a = new C4714k<>();

        @Override // io.reactivex.functions.InterfaceC23487j
        /* renamed from: a */
        public final C35631Re4<T1, T2, T3, T4, T5> apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            return new C35631Re4<>(t1, t2, t3, t4, t5);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "issueId", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: L42$l */
    /* loaded from: classes3.dex */
    public static final class C4715l extends Lambda implements Function1<String, Unit> {
        public C4715l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            L42.this.f20687n.onNext(TuplesKt.m28425to(str, Boolean.FALSE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u000122\u0010\u0004\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0005H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nInspectionV3Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter$onResume$11\n+ 2 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,308:1\n303#2:309\n304#2:312\n302#2:313\n37#3,2:310\n*S KotlinDebug\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter$onResume$11\n*L\n269#1:309\n269#1:312\n269#1:313\n269#1:310,2\n*E\n"})
    /* renamed from: L42$m */
    /* loaded from: classes3.dex */
    public static final class C4716m extends Lambda implements Function1<Pair<? extends Pair<? extends String, ? extends Boolean>, ? extends List<? extends String>>, List<? extends String>> {
        public C4716m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends String> invoke(Pair<? extends Pair<? extends String, ? extends Boolean>, ? extends List<? extends String>> pair) {
            return invoke2((Pair<Pair<String, Boolean>, ? extends List<String>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<String> invoke2(Pair<Pair<String, Boolean>, ? extends List<String>> pair) {
            List<String> listOf;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Pair<String, Boolean> component1 = pair.component1();
            List<String> expandedCategories = pair.component2();
            String component12 = component1.component1();
            if (component1.component2().booleanValue()) {
                Intrinsics.checkNotNullExpressionValue(expandedCategories, "expandedCategories");
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.addSpread(expandedCategories.toArray(new String[0]));
                spreadBuilder.add(component12);
                listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new String[spreadBuilder.size()]));
                return listOf;
            }
            L42 l42 = L42.this;
            Intrinsics.checkNotNullExpressionValue(expandedCategories, "expandedCategories");
            return l42.m97848X(expandedCategories, component12);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: L42$n */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C4717n extends FunctionReferenceImpl implements Function1<List<? extends String>, Unit> {
        public C4717n(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
            invoke2((List<String>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<String> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00070\u00070\u0005H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/InspectionFlow;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nInspectionV3Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter$onResume$13\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,308:1\n1549#2:309\n1620#2,3:310\n*S KotlinDebug\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter$onResume$13\n*L\n281#1:309\n281#1:310,3\n*E\n"})
    /* renamed from: L42$o */
    /* loaded from: classes3.dex */
    public static final class C4718o extends Lambda implements Function1<Pair<? extends Unit, ? extends InspectionFlow>, List<? extends String>> {

        /* renamed from: g */
        public static final C4718o f20711g = new C4718o();

        public C4718o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends String> invoke(Pair<? extends Unit, ? extends InspectionFlow> pair) {
            return invoke2((Pair<Unit, InspectionFlow>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<String> invoke2(Pair<Unit, InspectionFlow> pair) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            List<InspectionCategory> categories = pair.component2().getCategories();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(categories, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (InspectionCategory inspectionCategory : categories) {
                arrayList.add(inspectionCategory.getId());
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "passedInspections", "", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: L42$p */
    /* loaded from: classes3.dex */
    public static final class C4719p extends Lambda implements Function1<List<? extends String>, Unit> {
        public C4719p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
            invoke2((List<String>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<String> list) {
            List emptyList;
            L42.this.f20684k.onNext(list);
            C24552a c24552a = L42.this.f20682i;
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            c24552a.onNext(emptyList);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001aR\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0003 \u0002*(\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0003\u0018\u00010\u00060\u00062|\u0010\u0005\u001ax\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"LRe4;", "Lco/bird/android/model/InspectionFlow;", "kotlin.jvm.PlatformType", "", "", "<name for destructuring parameter 0>", "Lkotlin/Triple;", "", "Lkotlin/Pair;", "LH6;", C17296a.f69688o, "(LRe4;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInspectionV3Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter$onResume$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,308:1\n1726#2,3:309\n1726#2,3:312\n*S KotlinDebug\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter$onResume$1\n*L\n169#1:309,3\n171#1:312,3\n*E\n"})
    /* renamed from: L42$q */
    /* loaded from: classes3.dex */
    public static final class C4720q extends Lambda implements Function1<C35631Re4<? extends InspectionFlow, ? extends List<? extends String>, ? extends List<? extends String>, ? extends List<? extends String>, ? extends List<? extends String>>, Triple<? extends Boolean, ? extends Pair<? extends Boolean, ? extends Boolean>, ? extends List<? extends C3023H6>>> {
        public C4720q() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0099 A[EDGE_INSN: B:33:0x0099->B:30:0x0099 ?: BREAK  , SYNTHETIC] */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Triple<Boolean, Pair<Boolean, Boolean>, List<C3023H6>> invoke(C35631Re4<InspectionFlow, ? extends List<String>, ? extends List<String>, ? extends List<String>, ? extends List<String>> c35631Re4) {
            boolean z;
            List<InspectionCategory> categories;
            Iterator<T> it;
            List<String> plus;
            boolean z2;
            Intrinsics.checkNotNullParameter(c35631Re4, "<name for destructuring parameter 0>");
            InspectionFlow inspection = c35631Re4.m86500a();
            List<String> passedCategories = c35631Re4.m86499b();
            List<String> failedCategories = c35631Re4.m86498c();
            List<String> selectedIssues = c35631Re4.m86497d();
            List<String> expandedCategories = c35631Re4.m86496e();
            Intrinsics.checkNotNullExpressionValue(failedCategories, "failedCategories");
            boolean z3 = true;
            if (!(!failedCategories.isEmpty())) {
                List<InspectionCategory> categories2 = inspection.getCategories();
                if (!(categories2 instanceof Collection) || !categories2.isEmpty()) {
                    for (InspectionCategory inspectionCategory : categories2) {
                        if (!passedCategories.contains(inspectionCategory.getId())) {
                            z2 = false;
                            break;
                        }
                    }
                }
                z2 = true;
                if (!z2) {
                    z = false;
                    categories = inspection.getCategories();
                    if ((categories instanceof Collection) || !categories.isEmpty()) {
                        it = categories.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!passedCategories.contains(((InspectionCategory) it.next()).getId())) {
                                    z3 = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    boolean isEmpty = failedCategories.isEmpty();
                    Intrinsics.checkNotNullExpressionValue(selectedIssues, "selectedIssues");
                    plus = CollectionsKt___CollectionsKt.plus((Collection) failedCategories, (Iterable) selectedIssues);
                    Boolean valueOf = Boolean.valueOf(z);
                    Pair m28425to = TuplesKt.m28425to(Boolean.valueOf(z3), Boolean.valueOf(isEmpty));
                    C44279l42 c44279l42 = L42.this.f20680g;
                    Intrinsics.checkNotNullExpressionValue(inspection, "inspection");
                    Intrinsics.checkNotNullExpressionValue(passedCategories, "passedCategories");
                    Intrinsics.checkNotNullExpressionValue(expandedCategories, "expandedCategories");
                    return new Triple<>(valueOf, m28425to, c44279l42.m27966a(inspection, passedCategories, plus, expandedCategories));
                }
            }
            z = true;
            categories = inspection.getCategories();
            if (categories instanceof Collection) {
            }
            it = categories.iterator();
            while (true) {
                if (it.hasNext()) {
                }
                

                @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072V\u0010\u0006\u001aR\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*(\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "", "Lkotlin/Pair;", "", "LH6;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
                /* renamed from: L42$r */
                /* loaded from: classes3.dex */
                public static final class C4721r extends Lambda implements Function1<Triple<? extends Boolean, ? extends Pair<? extends Boolean, ? extends Boolean>, ? extends List<? extends C3023H6>>, Unit> {
                    public C4721r() {
                        super(1);
                    }

                    /* renamed from: a */
                    public final void m97808a(Triple<Boolean, Pair<Boolean, Boolean>, ? extends List<C3023H6>> triple) {
                        boolean booleanValue = triple.component1().booleanValue();
                        Pair<Boolean, Boolean> component2 = triple.component2();
                        L42.this.f20678e.m87342x(booleanValue);
                        L42.this.f20678e.m87351Tl(component2.getFirst().booleanValue(), component2.getSecond().booleanValue());
                        L42.this.f20678e.m87344b(triple.component3());
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Boolean, ? extends Pair<? extends Boolean, ? extends Boolean>, ? extends List<? extends C3023H6>> triple) {
                        m97808a(triple);
                        return Unit.INSTANCE;
                    }
                }

                @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0007\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005 \u0004*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0018\u00010\u00010\u00012d\u0010\u0006\u001a`\u0012(\u0012&\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003 \u0004*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0004*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00050\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0004*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
                @SourceDebugExtension({"SMAP\nInspectionV3Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter$onResume$3\n+ 2 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,308:1\n303#2:309\n304#2:312\n302#2:313\n303#2:314\n304#2:317\n302#2:318\n37#3,2:310\n37#3,2:315\n*S KotlinDebug\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter$onResume$3\n*L\n203#1:309\n203#1:312\n203#1:313\n206#1:314\n206#1:317\n206#1:318\n203#1:310,2\n206#1:315,2\n*E\n"})
                /* renamed from: L42$s */
                /* loaded from: classes3.dex */
                public static final class C4722s extends Lambda implements Function1<Triple<? extends Pair<? extends String, ? extends Boolean>, ? extends List<? extends String>, ? extends List<? extends String>>, Pair<? extends List<? extends String>, ? extends List<? extends String>>> {
                    public C4722s() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a */
                    public final Pair<List<String>, List<String>> invoke(Triple<Pair<String, Boolean>, ? extends List<String>, ? extends List<String>> triple) {
                        List listOf;
                        List listOf2;
                        Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
                        Pair<String, Boolean> component1 = triple.component1();
                        List<String> passedInspections = triple.component2();
                        List<String> failedCategories = triple.component3();
                        String component12 = component1.component1();
                        Boolean component2 = component1.component2();
                        if (Intrinsics.areEqual(component2, Boolean.TRUE)) {
                            Intrinsics.checkNotNullExpressionValue(passedInspections, "passedInspections");
                            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                            spreadBuilder.addSpread(passedInspections.toArray(new String[0]));
                            spreadBuilder.add(component12);
                            listOf2 = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new String[spreadBuilder.size()]));
                            L42 l42 = L42.this;
                            Intrinsics.checkNotNullExpressionValue(failedCategories, "failedCategories");
                            return TuplesKt.m28425to(listOf2, l42.m97848X(failedCategories, component12));
                        } else if (Intrinsics.areEqual(component2, Boolean.FALSE)) {
                            L42 l422 = L42.this;
                            Intrinsics.checkNotNullExpressionValue(passedInspections, "passedInspections");
                            List m97848X = l422.m97848X(passedInspections, component12);
                            Intrinsics.checkNotNullExpressionValue(failedCategories, "failedCategories");
                            SpreadBuilder spreadBuilder2 = new SpreadBuilder(2);
                            spreadBuilder2.addSpread(failedCategories.toArray(new String[0]));
                            spreadBuilder2.add(component12);
                            listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder2.toArray(new String[spreadBuilder2.size()]));
                            return TuplesKt.m28425to(m97848X, listOf);
                        } else if (component2 == null) {
                            L42 l423 = L42.this;
                            Intrinsics.checkNotNullExpressionValue(passedInspections, "passedInspections");
                            List m97848X2 = l423.m97848X(passedInspections, component12);
                            L42 l424 = L42.this;
                            Intrinsics.checkNotNullExpressionValue(failedCategories, "failedCategories");
                            return TuplesKt.m28425to(m97848X2, l424.m97848X(failedCategories, component12));
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }

                @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012>\u0010\u0002\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                /* renamed from: L42$t */
                /* loaded from: classes3.dex */
                public static final class C4723t extends Lambda implements Function1<Pair<? extends List<? extends String>, ? extends List<? extends String>>, Unit> {
                    public C4723t() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends String>, ? extends List<? extends String>> pair) {
                        invoke2((Pair<? extends List<String>, ? extends List<String>>) pair);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(Pair<? extends List<String>, ? extends List<String>> pair) {
                        L42.this.f20684k.onNext(pair.component1());
                        L42.this.f20682i.onNext(pair.component2());
                    }
                }

                @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012v\u0010\u0002\u001ar\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u0007 \u0006*8\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/InspectionFlow;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                @SourceDebugExtension({"SMAP\nInspectionV3Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter$onResume$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,308:1\n223#2:309\n1747#2,3:310\n224#2:313\n1#3:314\n*S KotlinDebug\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter$onResume$5\n*L\n226#1:309\n227#1:310,3\n226#1:313\n*E\n"})
                /* renamed from: L42$u */
                /* loaded from: classes3.dex */
                public static final class C4724u extends Lambda implements Function1<Pair<? extends Pair<? extends String, ? extends Boolean>, ? extends InspectionFlow>, Unit> {
                    public C4724u() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Pair<? extends String, ? extends Boolean>, ? extends InspectionFlow> pair) {
                        invoke2((Pair<Pair<String, Boolean>, InspectionFlow>) pair);
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
                        continue;
                     */
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke2(Pair<Pair<String, Boolean>, InspectionFlow> pair) {
                        String component1 = pair.component1().component1();
                        for (InspectionCategory inspectionCategory : pair.component2().getCategories()) {
                            List<InspectionIssue> issues = inspectionCategory.getIssues();
                            boolean z = false;
                            if (!(issues instanceof Collection) || !issues.isEmpty()) {
                                Iterator<T> it = issues.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (Intrinsics.areEqual(((InspectionIssue) it.next()).getId(), component1)) {
                                            z = true;
                                            continue;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            if (z) {
                                L42.this.f20686m.onNext(TuplesKt.m28425to(inspectionCategory.getId(), Boolean.FALSE));
                                return;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }

                @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012:\u0010\u0005\u001a6\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00060\u00060\u0001H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lco/bird/android/model/InspectionFlow;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                /* renamed from: L42$v */
                /* loaded from: classes3.dex */
                public static final class C4725v extends Lambda implements Function1<Pair<? extends Pair<? extends String, ? extends Boolean>, ? extends InspectionFlow>, Pair<? extends String, ? extends Boolean>> {

                    /* renamed from: g */
                    public static final C4725v f20718g = new C4725v();

                    public C4725v() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Pair<? extends String, ? extends Boolean> invoke(Pair<? extends Pair<? extends String, ? extends Boolean>, ? extends InspectionFlow> pair) {
                        return invoke2((Pair<Pair<String, Boolean>, InspectionFlow>) pair);
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final Pair<String, Boolean> invoke2(Pair<Pair<String, Boolean>, InspectionFlow> pair) {
                        Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                        return pair.component1();
                    }
                }

                @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\u0007\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005 \u0004*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0018\u00010\u00010\u00012`\u0010\u0006\u001a\\\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0004*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00050\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0004*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
                @SourceDebugExtension({"SMAP\nInspectionV3Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter$onResume$7\n+ 2 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,308:1\n303#2:309\n304#2:312\n302#2:313\n303#2:314\n304#2:317\n302#2:318\n37#3,2:310\n37#3,2:315\n*S KotlinDebug\n*F\n+ 1 InspectionV3Presenter.kt\nco/bird/android/feature/workorders/v3/InspectionV3Presenter$onResume$7\n*L\n240#1:309\n240#1:312\n240#1:313\n243#1:314\n243#1:317\n243#1:318\n240#1:310,2\n243#1:315,2\n*E\n"})
                /* renamed from: L42$w */
                /* loaded from: classes3.dex */
                public static final class C4726w extends Lambda implements Function1<Triple<? extends Pair<? extends String, ? extends Boolean>, ? extends List<? extends String>, ? extends List<? extends String>>, Pair<? extends List<? extends String>, ? extends List<? extends String>>> {
                    public C4726w() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a */
                    public final Pair<List<String>, List<String>> invoke(Triple<Pair<String, Boolean>, ? extends List<String>, ? extends List<String>> triple) {
                        List listOf;
                        List listOf2;
                        Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
                        Pair<String, Boolean> component1 = triple.component1();
                        List<String> passedInspections = triple.component2();
                        List<String> selectedIssues = triple.component3();
                        String component12 = component1.component1();
                        boolean booleanValue = component1.component2().booleanValue();
                        if (booleanValue) {
                            Intrinsics.checkNotNullExpressionValue(passedInspections, "passedInspections");
                            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                            spreadBuilder.addSpread(passedInspections.toArray(new String[0]));
                            spreadBuilder.add(component12);
                            listOf2 = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new String[spreadBuilder.size()]));
                            L42 l42 = L42.this;
                            Intrinsics.checkNotNullExpressionValue(selectedIssues, "selectedIssues");
                            return TuplesKt.m28425to(listOf2, l42.m97848X(selectedIssues, component12));
                        } else if (!booleanValue) {
                            L42 l422 = L42.this;
                            Intrinsics.checkNotNullExpressionValue(passedInspections, "passedInspections");
                            List m97848X = l422.m97848X(passedInspections, component12);
                            Intrinsics.checkNotNullExpressionValue(selectedIssues, "selectedIssues");
                            SpreadBuilder spreadBuilder2 = new SpreadBuilder(2);
                            spreadBuilder2.addSpread(selectedIssues.toArray(new String[0]));
                            spreadBuilder2.add(component12);
                            listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder2.toArray(new String[spreadBuilder2.size()]));
                            return TuplesKt.m28425to(m97848X, listOf);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }

                @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012>\u0010\u0002\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
                /* renamed from: L42$x */
                /* loaded from: classes3.dex */
                public static final class C4727x extends Lambda implements Function1<Pair<? extends List<? extends String>, ? extends List<? extends String>>, Unit> {
                    public C4727x() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends String>, ? extends List<? extends String>> pair) {
                        invoke2((Pair<? extends List<String>, ? extends List<String>>) pair);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(Pair<? extends List<String>, ? extends List<String>> pair) {
                        L42.this.f20684k.onNext(pair.component1());
                        L42.this.f20683j.onNext(pair.component2());
                    }
                }

                @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "", "<name for destructuring parameter 0>", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Pair;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
                /* renamed from: L42$y */
                /* loaded from: classes3.dex */
                public static final class C4728y extends Lambda implements Function1<Pair<? extends String, ? extends String>, InterfaceC24574u<? extends String>> {

                    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
                    /* renamed from: L42$y$a */
                    /* loaded from: classes3.dex */
                    public static final class C4729a extends Lambda implements Function1<DialogResponse, Boolean> {

                        /* renamed from: g */
                        public static final C4729a f20722g = new C4729a();

                        public C4729a() {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* renamed from: a */
                        public final Boolean invoke(DialogResponse response) {
                            boolean z;
                            Intrinsics.checkNotNullParameter(response, "response");
                            if (response != DialogResponse.OK) {
                                z = true;
                            } else {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    }

                    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
                    /* renamed from: L42$y$b */
                    /* loaded from: classes3.dex */
                    public static final class C4730b extends Lambda implements Function1<DialogResponse, String> {

                        /* renamed from: g */
                        public final /* synthetic */ String f20723g;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C4730b(String str) {
                            super(1);
                            this.f20723g = str;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        /* renamed from: a */
                        public final String invoke(DialogResponse it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return this.f20723g;
                        }
                    }

                    public C4728y() {
                        super(1);
                    }

                    /* renamed from: d */
                    public static final String m97802d(Function1 tmp0, Object obj) {
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        return (String) tmp0.invoke(obj);
                    }

                    public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        return ((Boolean) tmp0.invoke(obj)).booleanValue();
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: c */
                    public final InterfaceC24574u<? extends String> invoke(Pair<String, String> pair) {
                        Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                        AbstractC23442F m33142Y = H31.C3014a.showBottomSheetAlert$default(L42.this.f20678e, new C32411Dk6(pair.component2()), null, 2, null).m33142Y(C23454a.m33087a());
                        final C4729a c4729a = C4729a.f20722g;
                        AbstractC24507p m33098z = m33142Y.m33098z(new InterfaceC23494q() { // from class: O42
                            @Override // io.reactivex.functions.InterfaceC23494q
                            public final boolean test(Object obj) {
                                boolean invoke$lambda$0;
                                invoke$lambda$0 = L42.C4728y.invoke$lambda$0(Function1.this, obj);
                                return invoke$lambda$0;
                            }
                        });
                        final C4730b c4730b = new C4730b(pair.component1());
                        return m33098z.m32067H(new InterfaceC23492o() { // from class: P42
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj) {
                                String m97802d;
                                m97802d = L42.C4728y.m97802d(Function1.this, obj);
                                return m97802d;
                            }
                        });
                    }
                }

                public L42(InterfaceC48265rn6 vehicleServicingManager, DQ3 permissionManager, C36207Tq4 reactiveConfig, InterfaceC40099e13 navigator, R42 ui, ScopeProvider scopeProvider, C44279l42 converter) {
                    List emptyList;
                    List emptyList2;
                    Intrinsics.checkNotNullParameter(vehicleServicingManager, "vehicleServicingManager");
                    Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
                    Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
                    Intrinsics.checkNotNullParameter(navigator, "navigator");
                    Intrinsics.checkNotNullParameter(ui, "ui");
                    Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
                    Intrinsics.checkNotNullParameter(converter, "converter");
                    this.f20674a = vehicleServicingManager;
                    this.f20675b = permissionManager;
                    this.f20676c = reactiveConfig;
                    this.f20677d = navigator;
                    this.f20678e = ui;
                    this.f20679f = scopeProvider;
                    this.f20680g = converter;
                    C24552a<InspectionFlow> m31922e = C24552a.m31922e();
                    Intrinsics.checkNotNullExpressionValue(m31922e, "create<InspectionFlow>()");
                    this.f20681h = m31922e;
                    C24552a<List<String>> m31922e2 = C24552a.m31922e();
                    Intrinsics.checkNotNullExpressionValue(m31922e2, "create<List<String>>()");
                    this.f20682i = m31922e2;
                    C24552a<List<String>> m31922e3 = C24552a.m31922e();
                    Intrinsics.checkNotNullExpressionValue(m31922e3, "create<List<String>>()");
                    this.f20683j = m31922e3;
                    emptyList = CollectionsKt__CollectionsKt.emptyList();
                    C24552a<List<String>> m31921g = C24552a.m31921g(emptyList);
                    Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault<List<String>>(emptyList())");
                    this.f20684k = m31921g;
                    emptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    C24552a<List<String>> m31921g2 = C24552a.m31921g(emptyList2);
                    Intrinsics.checkNotNullExpressionValue(m31921g2, "createDefault<List<String>>(emptyList())");
                    this.f20685l = m31921g2;
                    C24558d<Pair<String, Boolean>> m31902e = C24558d.m31902e();
                    Intrinsics.checkNotNullExpressionValue(m31902e, "create<Pair<String, Boolean?>>()");
                    this.f20686m = m31902e;
                    C24558d<Pair<String, Boolean>> m31902e2 = C24558d.m31902e();
                    Intrinsics.checkNotNullExpressionValue(m31902e2, "create<Pair<String, Boolean>>()");
                    this.f20687n = m31902e2;
                }

                /* renamed from: A */
                public static final void m97871A(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    tmp0.invoke(obj);
                }

                /* renamed from: B */
                public static final InterfaceC24574u m97870B(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    return (InterfaceC24574u) tmp0.invoke(obj);
                }

                /* renamed from: C */
                public static final InterfaceC23447K m97869C(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    return (InterfaceC23447K) tmp0.invoke(obj);
                }

                /* renamed from: D */
                public static final InterfaceC23434B m97868D(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    return (InterfaceC23434B) tmp0.invoke(obj);
                }

                /* renamed from: E */
                public static final void m97867E(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    tmp0.invoke(obj);
                }

                /* renamed from: F */
                public static final void m97866F(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    tmp0.invoke(obj);
                }

                /* renamed from: G */
                public static final void m97865G(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    tmp0.invoke(obj);
                }

                /* renamed from: J */
                public static final Triple m97862J(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    return (Triple) tmp0.invoke(obj);
                }

                /* renamed from: K */
                public static final void m97861K(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    tmp0.invoke(obj);
                }

                /* renamed from: L */
                public static final Pair m97860L(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    return (Pair) tmp0.invoke(obj);
                }

                /* renamed from: M */
                public static final void m97859M(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    tmp0.invoke(obj);
                }

                /* renamed from: N */
                public static final void m97858N(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    tmp0.invoke(obj);
                }

                /* renamed from: O */
                public static final Pair m97857O(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    return (Pair) tmp0.invoke(obj);
                }

                /* renamed from: P */
                public static final Pair m97856P(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    return (Pair) tmp0.invoke(obj);
                }

                /* renamed from: Q */
                public static final void m97855Q(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    tmp0.invoke(obj);
                }

                /* renamed from: R */
                public static final InterfaceC24574u m97854R(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    return (InterfaceC24574u) tmp0.invoke(obj);
                }

                /* renamed from: S */
                public static final void m97853S(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    tmp0.invoke(obj);
                }

                /* renamed from: T */
                public static final List m97852T(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    return (List) tmp0.invoke(obj);
                }

                /* renamed from: U */
                public static final void m97851U(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    tmp0.invoke(obj);
                }

                /* renamed from: V */
                public static final List m97850V(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    return (List) tmp0.invoke(obj);
                }

                /* renamed from: W */
                public static final void m97849W(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    tmp0.invoke(obj);
                }

                /* renamed from: y */
                public static final C51106wb4 m97823y(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    return (C51106wb4) tmp0.invoke(obj);
                }

                /* renamed from: z */
                public static final void m97822z(Function1 tmp0, Object obj) {
                    Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                    tmp0.invoke(obj);
                }

                /* renamed from: H */
                public final void m97864H(Throwable th) {
                    RetrofitException retrofitException;
                    C41318g46.m40159e(th);
                    Unit unit = null;
                    if (th instanceof RetrofitException) {
                        retrofitException = (RetrofitException) th;
                    } else {
                        retrofitException = null;
                    }
                    if (retrofitException != null) {
                        this.f20678e.error(retrofitException);
                        unit = Unit.INSTANCE;
                    }
                    if (unit == null) {
                        this.f20678e.errorGeneric();
                    }
                }

                /* renamed from: I */
                public final void m97863I() {
                    C40463ee3 c40463ee3 = C40463ee3.f78649a;
                    C24552a<InspectionFlow> c24552a = this.f20681h;
                    Observable<List<String>> distinctUntilChanged = this.f20684k.distinctUntilChanged();
                    Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "passedInspectionsSubject.distinctUntilChanged()");
                    Observable<List<String>> distinctUntilChanged2 = this.f20682i.distinctUntilChanged();
                    Intrinsics.checkNotNullExpressionValue(distinctUntilChanged2, "failedCategoriesSubject.distinctUntilChanged()");
                    Observable<List<String>> distinctUntilChanged3 = this.f20683j.distinctUntilChanged();
                    Intrinsics.checkNotNullExpressionValue(distinctUntilChanged3, "selectedIssuesSubject.distinctUntilChanged()");
                    Observable combineLatest = Observable.combineLatest(c24552a, distinctUntilChanged, distinctUntilChanged2, distinctUntilChanged3, this.f20685l, C4714k.f20708a);
                    Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…nt(t1, t2, t3, t4, t5) })");
                    Observable observeOn = combineLatest.observeOn(C24542a.m31934a());
                    final C4720q c4720q = new C4720q();
                    Observable observeOn2 = observeOn.map(new InterfaceC23492o() { // from class: K42
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            Triple m97862J;
                            m97862J = L42.m97862J(Function1.this, obj);
                            return m97862J;
                        }
                    }).observeOn(C23454a.m33087a());
                    Intrinsics.checkNotNullExpressionValue(observeOn2, "fun onResume() {\n    // …(emptyList())\n      }\n  }");
                    Object m33094as = observeOn2.m33094as(AutoDispose.m45239a(this.f20679f));
                    Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
                    final C4721r c4721r = new C4721r();
                    ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: t42
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            L42.m97861K(Function1.this, obj);
                        }
                    });
                    Observable merge = Observable.merge(this.f20678e.m87353Rl(), this.f20686m);
                    Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      ui.category…goryOverrideSubject\n    )");
                    Observable m31949b = C24527f.m31949b(merge, this.f20684k, this.f20682i);
                    final C4722s c4722s = new C4722s();
                    Observable map = m31949b.map(new InterfaceC23492o() { // from class: u42
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            Pair m97860L;
                            m97860L = L42.m97860L(Function1.this, obj);
                            return m97860L;
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(map, "fun onResume() {\n    // …(emptyList())\n      }\n  }");
                    Object m33094as2 = map.m33094as(AutoDispose.m45239a(this.f20679f));
                    Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
                    final C4723t c4723t = new C4723t();
                    ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: v42
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            L42.m97859M(Function1.this, obj);
                        }
                    });
                    Observable<Pair<String, Boolean>> m87356K0 = this.f20678e.m87356K0();
                    Observable m31950a = C24527f.m31950a(this.f20687n, this.f20681h);
                    final C4724u c4724u = new C4724u();
                    Observable doOnNext = m31950a.doOnNext(new InterfaceC23484g() { // from class: w42
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            L42.m97858N(Function1.this, obj);
                        }
                    });
                    final C4725v c4725v = C4725v.f20718g;
                    Observable merge2 = Observable.merge(m87356K0, doOnNext.map(new InterfaceC23492o() { // from class: x42
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            Pair m97857O;
                            m97857O = L42.m97857O(Function1.this, obj);
                            return m97857O;
                        }
                    }));
                    Intrinsics.checkNotNullExpressionValue(merge2, "fun onResume() {\n    // …(emptyList())\n      }\n  }");
                    Observable m31949b2 = C24527f.m31949b(merge2, this.f20684k, this.f20683j);
                    final C4726w c4726w = new C4726w();
                    Observable map2 = m31949b2.map(new InterfaceC23492o() { // from class: y42
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            Pair m97856P;
                            m97856P = L42.m97856P(Function1.this, obj);
                            return m97856P;
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(map2, "fun onResume() {\n    // …(emptyList())\n      }\n  }");
                    Object m33094as3 = map2.m33094as(AutoDispose.m45239a(this.f20679f));
                    Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
                    final C4727x c4727x = new C4727x();
                    ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: A42
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            L42.m97855Q(Function1.this, obj);
                        }
                    });
                    Observable<Pair<String, String>> m87345Zl = this.f20678e.m87345Zl();
                    final C4728y c4728y = new C4728y();
                    Observable<R> flatMapMaybe = m87345Zl.flatMapMaybe(new InterfaceC23492o() { // from class: B42
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC24574u m97854R;
                            m97854R = L42.m97854R(Function1.this, obj);
                            return m97854R;
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "fun onResume() {\n    // …(emptyList())\n      }\n  }");
                    Object m33094as4 = flatMapMaybe.m33094as(AutoDispose.m45239a(this.f20679f));
                    Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
                    final C4715l c4715l = new C4715l();
                    ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: C42
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            L42.m97853S(Function1.this, obj);
                        }
                    });
                    Observable m31950a2 = C24527f.m31950a(this.f20678e.m87354Ql(), this.f20685l);
                    final C4716m c4716m = new C4716m();
                    Observable map3 = m31950a2.map(new InterfaceC23492o() { // from class: p42
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            List m97852T;
                            m97852T = L42.m97852T(Function1.this, obj);
                            return m97852T;
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(map3, "fun onResume() {\n    // …(emptyList())\n      }\n  }");
                    Object m33094as5 = map3.m33094as(AutoDispose.m45239a(this.f20679f));
                    Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
                    final C4717n c4717n = new C4717n(this.f20685l);
                    ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: q42
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            L42.m97851U(Function1.this, obj);
                        }
                    });
                    Observable m31950a3 = C24527f.m31950a(this.f20678e.m87352Sl(), this.f20681h);
                    final C4718o c4718o = C4718o.f20711g;
                    Observable map4 = m31950a3.map(new InterfaceC23492o() { // from class: r42
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            List m97850V;
                            m97850V = L42.m97850V(Function1.this, obj);
                            return m97850V;
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(map4, "ui.passAllClicks()\n     … -> category.id }\n      }");
                    Object m33094as6 = map4.m33094as(AutoDispose.m45239a(this.f20679f));
                    Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
                    final C4719p c4719p = new C4719p();
                    ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: s42
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            L42.m97849W(Function1.this, obj);
                        }
                    });
                }

                /* renamed from: X */
                public final <T> List<T> m97848X(List<? extends T> list, T t) {
                    ArrayList arrayList = new ArrayList();
                    for (T t2 : list) {
                        if (!Intrinsics.areEqual(t2, t)) {
                            arrayList.add(t2);
                        }
                    }
                    return arrayList;
                }

                /* renamed from: x */
                public final void m97824x(String birdId, InspectionContext inspectionContext) {
                    Intrinsics.checkNotNullParameter(birdId, "birdId");
                    Intrinsics.checkNotNullParameter(inspectionContext, "inspectionContext");
                    AbstractC23442F progress$default = C28237sD.progress$default(this.f20674a.mo13669c(birdId), this.f20678e, 0, 2, (Object) null);
                    final C4702c c4702c = C4702c.f20690g;
                    AbstractC23442F m33157I = progress$default.m33157I(new InterfaceC23492o() { // from class: o42
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            C51106wb4 m97823y;
                            m97823y = L42.m97823y(Function1.this, obj);
                            return m97823y;
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(m33157I, "vehicleServicingManager.…, selectedIssues)\n      }");
                    Object m33135e = m33157I.m33135e(AutoDispose.m45239a(this.f20679f));
                    Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
                    final C4703d c4703d = new C4703d();
                    InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: z42
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            L42.m97822z(Function1.this, obj);
                        }
                    };
                    final C4704e c4704e = new C4704e(this);
                    ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: D42
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            L42.m97871A(Function1.this, obj);
                        }
                    });
                    Observable<R> withLatestFrom = this.f20678e.m87343c().withLatestFrom(this.f20681h, this.f20682i, this.f20683j, new C4700a());
                    Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, o….invoke(t, t1, t2, t3) })");
                    final C4705f c4705f = new C4705f(inspectionContext);
                    Observable flatMapMaybe = withLatestFrom.flatMapMaybe(new InterfaceC23492o() { // from class: E42
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC24574u m97870B;
                            m97870B = L42.m97870B(Function1.this, obj);
                            return m97870B;
                        }
                    });
                    final C4710g c4710g = new C4710g(birdId);
                    Observable flatMapSingle = flatMapMaybe.flatMapSingle(new InterfaceC23492o() { // from class: F42
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC23447K m97869C;
                            m97869C = L42.m97869C(Function1.this, obj);
                            return m97869C;
                        }
                    });
                    final C4711h c4711h = new C4711h(inspectionContext);
                    Observable flatMap = flatMapSingle.flatMap(new InterfaceC23492o() { // from class: G42
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC23434B m97868D;
                            m97868D = L42.m97868D(Function1.this, obj);
                            return m97868D;
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(flatMap, "fun onCreate(birdId: Str…FlightSheet(birdId) }\n  }");
                    Observable retry = C38689bg5.m64176e(flatMap, this.f20678e).retry();
                    Intrinsics.checkNotNullExpressionValue(retry, "fun onCreate(birdId: Str…FlightSheet(birdId) }\n  }");
                    Object m33094as = retry.m33094as(AutoDispose.m45239a(this.f20679f));
                    Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
                    final C4712i c4712i = new C4712i(birdId);
                    InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: H42
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            L42.m97867E(Function1.this, obj);
                        }
                    };
                    final C4713j c4713j = new C4713j(this);
                    ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: I42
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            L42.m97866F(Function1.this, obj);
                        }
                    });
                    Observable<Unit> throttleFirst = this.f20678e.m87348Wl().throttleFirst(300L, TimeUnit.MILLISECONDS);
                    Intrinsics.checkNotNullExpressionValue(throttleFirst, "ui.vehicleCardClicks()\n …0, TimeUnit.MILLISECONDS)");
                    Object m33094as2 = throttleFirst.m33094as(AutoDispose.m45239a(this.f20679f));
                    Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
                    final C4701b c4701b = new C4701b(birdId);
                    ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: J42
                        @Override // io.reactivex.functions.InterfaceC23484g
                        public final void accept(Object obj) {
                            L42.m97865G(Function1.this, obj);
                        }
                    });
                }
            }
