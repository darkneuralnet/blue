package p000;

import co.bird.android.model.constant.FilterLogicToggleOption;
import co.bird.android.model.persistence.OperatorFilter;
import co.bird.android.model.persistence.OperatorOptionFilter;
import co.bird.android.model.persistence.OperatorToggleFilter;
import co.bird.android.model.persistence.nestedstructures.OperatorFilterOption;
import co.bird.android.model.wire.WireOperatorOptionFilter;
import co.bird.android.model.wire.WireOperatorToggleFilter;
import co.bird.api.response.OperatorFiltersResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC37556Zk3;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016J\u0016\u0010\t\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"Lcl3;", "LZk3;", "Lio/reactivex/c;", "G", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/OperatorFilter;", "E1", "filters", "n1", "clear", "LTk3;", C17296a.f69688o, "LTk3;", "operatorClient", "Lwo3;", "b", "Lwo3;", "operatorOptionFilterDao", "LAw3;", "c", "LAw3;", "operatorToggleFilterDao", "<init>", "(LTk3;Lwo3;LAw3;)V", "co.bird.android.repository.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cl3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39330cl3 implements InterfaceC37556Zk3 {

    /* renamed from: a */
    public final InterfaceC36152Tk3 f61200a;

    /* renamed from: b */
    public final AbstractC51235wo3 f61201b;

    /* renamed from: c */
    public final AbstractC31814Aw3 f61202c;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/OperatorOptionFilter;", "optionFilters", "Lco/bird/android/model/persistence/OperatorToggleFilter;", "toggleFilters", "Lco/bird/android/model/persistence/OperatorFilter;", C17296a.f69688o, "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorFilterRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterRepositoryImpl.kt\nco/bird/android/repository/operatorfilter/OperatorFilterRepositoryImpl$streamOperatorFilters$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1045#2:89\n*S KotlinDebug\n*F\n+ 1 OperatorFilterRepositoryImpl.kt\nco/bird/android/repository/operatorfilter/OperatorFilterRepositoryImpl$streamOperatorFilters$1\n*L\n66#1:89\n*E\n"})
    /* renamed from: cl3$b */
    /* loaded from: classes4.dex */
    public static final class C13664b extends Lambda implements Function2<List<? extends OperatorOptionFilter>, List<? extends OperatorToggleFilter>, List<? extends OperatorFilter>> {

        /* renamed from: g */
        public static final C13664b f61204g = new C13664b();

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 OperatorFilterRepositoryImpl.kt\nco/bird/android/repository/operatorfilter/OperatorFilterRepositoryImpl$streamOperatorFilters$1\n*L\n1#1,328:1\n66#2:329\n*E\n"})
        /* renamed from: cl3$b$a */
        /* loaded from: classes4.dex */
        public static final class C13665a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compareValues;
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((OperatorFilter) t).getOrdinal()), Integer.valueOf(((OperatorFilter) t2).getOrdinal()));
                return compareValues;
            }
        }

        public C13664b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final List<OperatorFilter> invoke(List<OperatorOptionFilter> optionFilters, List<OperatorToggleFilter> toggleFilters) {
            List plus;
            List<OperatorFilter> sortedWith;
            Intrinsics.checkNotNullParameter(optionFilters, "optionFilters");
            Intrinsics.checkNotNullParameter(toggleFilters, "toggleFilters");
            plus = CollectionsKt___CollectionsKt.plus((Collection) optionFilters, (Iterable) toggleFilters);
            sortedWith = CollectionsKt___CollectionsKt.sortedWith(plus, new C13665a());
            return sortedWith;
        }
    }

    public C39330cl3(InterfaceC36152Tk3 operatorClient, AbstractC51235wo3 operatorOptionFilterDao, AbstractC31814Aw3 operatorToggleFilterDao) {
        Intrinsics.checkNotNullParameter(operatorClient, "operatorClient");
        Intrinsics.checkNotNullParameter(operatorOptionFilterDao, "operatorOptionFilterDao");
        Intrinsics.checkNotNullParameter(operatorToggleFilterDao, "operatorToggleFilterDao");
        this.f61200a = operatorClient;
        this.f61201b = operatorOptionFilterDao;
        this.f61202c = operatorToggleFilterDao;
    }

    /* renamed from: M1 */
    public static final InterfaceC23496h m60901M1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: N1 */
    public static final List m60900N1(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj, obj2);
    }

    @Override // p000.InterfaceC37556Zk3
    /* renamed from: E1 */
    public Observable<List<OperatorFilter>> mo60906E1() {
        Observable<List<OperatorOptionFilter>> mo4628c = this.f61201b.mo4628c();
        Observable<List<OperatorToggleFilter>> mo113325c = this.f61202c.mo113325c();
        final C13664b c13664b = C13664b.f61204g;
        Observable<List<OperatorFilter>> combineLatest = Observable.combineLatest(mo4628c, mo113325c, new InterfaceC23480c() { // from class: al3
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                List m60900N1;
                m60900N1 = C39330cl3.m60900N1(Function2.this, obj, obj2);
                return m60900N1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(\n      ope…-> filter.ordinal }\n    }");
        return combineLatest;
    }

    @Override // p000.InterfaceC37556Zk3
    /* renamed from: G */
    public AbstractC23461c mo60905G() {
        AbstractC23442F<OperatorFiltersResponse> m33142Y = this.f61200a.m83033j().m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "operatorClient.getOperat…scribeOn(Schedulers.io())");
        Observable<List<OperatorFilter>> subscribeOn = mo60906E1().subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "streamOperatorFilters().…scribeOn(Schedulers.io())");
        AbstractC23442F m74531s0 = C37279Yf5.m74531s0(m33142Y, subscribeOn);
        final C13663a c13663a = new C13663a();
        AbstractC23461c m33164B = m74531s0.m33164B(new InterfaceC23492o() { // from class: bl3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m60901M1;
                m60901M1 = C39330cl3.m60901M1(Function1.this, obj);
                return m60901M1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchOperat…edulers.io())\n      }\n  }");
        return m33164B;
    }

    /* renamed from: L1 */
    public AbstractC23461c m60902L1(AbstractC23461c abstractC23461c) {
        return InterfaceC37556Zk3.C10352a.m72586a(this, abstractC23461c);
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        List listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{this.f61201b.mo4630a(), this.f61202c.mo113327a()});
        AbstractC23461c m33074L = AbstractC23461c.m33074L(listOf);
        Intrinsics.checkNotNullExpressionValue(m33074L, "merge(listOf(\n      oper…FilterDao.clear(),\n    ))");
        return m33074L;
    }

    @Override // p000.InterfaceC37556Zk3
    /* renamed from: n1 */
    public AbstractC23461c mo60899n1(List<? extends OperatorFilter> filters) {
        List<OperatorOptionFilter> filterIsInstance;
        List<OperatorToggleFilter> filterIsInstance2;
        List listOf;
        Intrinsics.checkNotNullParameter(filters, "filters");
        List<? extends OperatorFilter> list = filters;
        filterIsInstance = CollectionsKt___CollectionsJvmKt.filterIsInstance(list, OperatorOptionFilter.class);
        filterIsInstance2 = CollectionsKt___CollectionsJvmKt.filterIsInstance(list, OperatorToggleFilter.class);
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{this.f61201b.mo4629b(filterIsInstance), this.f61202c.mo113326b(filterIsInstance2)});
        AbstractC23461c m33074L = AbstractC23461c.m33074L(listOf);
        Intrinsics.checkNotNullExpressionValue(m33074L, "merge(listOf(\n      oper…rs(toggleFilters),\n    ))");
        return m60902L1(m33074L);
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n \u0002*\u0004\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/api/response/OperatorFiltersResponse;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/persistence/OperatorFilter;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorFilterRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterRepositoryImpl.kt\nco/bird/android/repository/operatorfilter/OperatorFilterRepositoryImpl$fetchOperatorFilters$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1549#2:89\n1620#2,2:90\n288#2,2:92\n1603#2,9:94\n1855#2:103\n1856#2:105\n1612#2:106\n1622#2:107\n1549#2:108\n1620#2,2:109\n288#2,2:111\n1622#2:113\n1549#2:114\n1620#2,3:115\n1549#2:118\n1620#2,3:119\n1#3:104\n*S KotlinDebug\n*F\n+ 1 OperatorFilterRepositoryImpl.kt\nco/bird/android/repository/operatorfilter/OperatorFilterRepositoryImpl$fetchOperatorFilters$1\n*L\n29#1:89\n29#1:90,2\n31#1:92,2\n33#1:94,9\n33#1:103\n33#1:105\n33#1:106\n29#1:107\n40#1:108\n40#1:109,2\n42#1:111,2\n40#1:113\n51#1:114\n51#1:115,3\n53#1:118\n53#1:119,3\n33#1:104\n*E\n"})
    /* renamed from: cl3$a */
    /* loaded from: classes4.dex */
    public static final class C13663a extends Lambda implements Function1<Pair<? extends OperatorFiltersResponse, ? extends List<? extends OperatorFilter>>, InterfaceC23496h> {
        public C13663a() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<OperatorFiltersResponse, ? extends List<? extends OperatorFilter>> pair) {
            List plus;
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            int collectionSizeOrDefault3;
            int collectionSizeOrDefault4;
            List listOf;
            List filterIsInstance;
            Object obj;
            List filterIsInstance2;
            Object obj2;
            List emptyList;
            List<OperatorFilterOption> options;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            OperatorFiltersResponse component1 = pair.component1();
            List<? extends OperatorFilter> existingFilters = pair.component2();
            plus = CollectionsKt___CollectionsKt.plus((Collection) component1.getMultiSelectFilters(), (Iterable) component1.getRangeFilters());
            List list = plus;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList<OperatorOptionFilter> arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it = list.iterator();
            while (true) {
                FilterLogicToggleOption filterLogicToggleOption = null;
                if (!it.hasNext()) {
                    break;
                }
                WireOperatorOptionFilter wireOperatorOptionFilter = (WireOperatorOptionFilter) it.next();
                Intrinsics.checkNotNullExpressionValue(existingFilters, "existingFilters");
                filterIsInstance2 = CollectionsKt___CollectionsJvmKt.filterIsInstance(existingFilters, OperatorOptionFilter.class);
                Iterator it2 = filterIsInstance2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (Intrinsics.areEqual(((OperatorOptionFilter) obj2).getId(), wireOperatorOptionFilter.getId())) {
                        break;
                    }
                }
                OperatorOptionFilter operatorOptionFilter = (OperatorOptionFilter) obj2;
                if (operatorOptionFilter != null && (options = operatorOptionFilter.getOptions()) != null) {
                    emptyList = new ArrayList();
                    for (OperatorFilterOption operatorFilterOption : options) {
                        String value = operatorFilterOption.getEnabled() ? operatorFilterOption.getValue() : null;
                        if (value != null) {
                            emptyList.add(value);
                        }
                    }
                } else {
                    emptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                if (operatorOptionFilter != null) {
                    filterLogicToggleOption = operatorOptionFilter.getLogicOperator();
                }
                arrayList.add(C36854Wk3.m77892a(wireOperatorOptionFilter, emptyList, filterLogicToggleOption));
            }
            List<WireOperatorToggleFilter> toggleFilters = component1.getToggleFilters();
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(toggleFilters, 10);
            ArrayList<OperatorToggleFilter> arrayList2 = new ArrayList(collectionSizeOrDefault2);
            Iterator<T> it3 = toggleFilters.iterator();
            while (true) {
                boolean z = false;
                if (!it3.hasNext()) {
                    break;
                }
                WireOperatorToggleFilter wireOperatorToggleFilter = (WireOperatorToggleFilter) it3.next();
                Intrinsics.checkNotNullExpressionValue(existingFilters, "existingFilters");
                filterIsInstance = CollectionsKt___CollectionsJvmKt.filterIsInstance(existingFilters, OperatorToggleFilter.class);
                Iterator it4 = filterIsInstance.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it4.next();
                    if (Intrinsics.areEqual(((OperatorToggleFilter) obj).getId(), wireOperatorToggleFilter.getId())) {
                        break;
                    }
                }
                OperatorToggleFilter operatorToggleFilter = (OperatorToggleFilter) obj;
                if (operatorToggleFilter != null) {
                    z = operatorToggleFilter.getEnabled();
                }
                arrayList2.add(C36854Wk3.m77891b(wireOperatorToggleFilter, z));
            }
            AbstractC23461c[] abstractC23461cArr = new AbstractC23461c[4];
            AbstractC51235wo3 abstractC51235wo3 = C39330cl3.this.f61201b;
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault3);
            for (OperatorOptionFilter operatorOptionFilter2 : arrayList) {
                arrayList3.add(operatorOptionFilter2.getId());
            }
            abstractC23461cArr[0] = abstractC51235wo3.mo4627d(arrayList3);
            abstractC23461cArr[1] = C39330cl3.this.f61201b.mo4629b(arrayList);
            AbstractC31814Aw3 abstractC31814Aw3 = C39330cl3.this.f61202c;
            collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
            ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault4);
            for (OperatorToggleFilter operatorToggleFilter2 : arrayList2) {
                arrayList4.add(operatorToggleFilter2.getId());
            }
            abstractC23461cArr[2] = abstractC31814Aw3.mo113324d(arrayList4);
            abstractC23461cArr[3] = C39330cl3.this.f61202c.mo113326b(arrayList2);
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) abstractC23461cArr);
            return AbstractC23461c.m33037r(listOf).m33063X(C24542a.m31932c());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends OperatorFiltersResponse, ? extends List<? extends OperatorFilter>> pair) {
            return invoke2((Pair<OperatorFiltersResponse, ? extends List<? extends OperatorFilter>>) pair);
        }
    }
}
