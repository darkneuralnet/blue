package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.User;
import co.bird.android.model.constant.FilterLogicToggleOption;
import co.bird.android.model.constant.OperatorFilterType;
import co.bird.android.model.persistence.OperatorFilter;
import co.bird.android.model.persistence.OperatorOptionFilter;
import co.bird.android.model.persistence.OperatorToggleFilter;
import co.bird.android.model.persistence.nestedstructures.OperatorFilterOption;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import p000.C37791a94;
import p000.InterfaceC46545ot5;
@Metadata(m28433d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\f*\b\u0012\u0004\u0012\u00020\u00160\fH\u0002R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R&\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!R-\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u001f0$8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\"\u0010,\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010\u00060\u00060)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R.\u0010/\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r **\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\f0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010.R\u0014\u00101\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u00100¨\u00066"}, m28432d2 = {"Lwt5;", "Lot5;", "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;", "option", "", "enabled", "", "f", "Lio/reactivex/c;", "G", "includeNonPersisted", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/OperatorFilter;", "g", "Lot5$b;", "filterDiff", "b", "filters", "Lio/reactivex/F;", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/persistence/OperatorOptionFilter;", "s", "LZk3;", "LZk3;", "operatorFilterRepository", "LEa;", "LEa;", "analyticsManager", "La94;", "Lco/bird/android/buava/Optional;", "c", "La94;", "mutableOverriddenOperatorOption", "mutableOverriddenOperatorFilters", "LZ84;", "e", "Lkotlin/Lazy;", "()LZ84;", "overriddenOperatorFilters", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "Lio/reactivex/subjects/d;", "filtersUpdatedByUser", "Lio/reactivex/subjects/a;", "Lio/reactivex/subjects/a;", "nonpersistedFilters", "()Z", "isOverridden", "LRh6;", "userStream", "<init>", "(LZk3;LEa;LRh6;)V", "contractor_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nServerDrivenFilterManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerDrivenFilterManagerImpl.kt\nco/bird/android/manager/contractor/ServerDrivenFilterManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/Observables\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,198:1\n237#2:199\n180#2:200\n22#3,2:201\n1549#4:203\n1620#4,2:204\n1549#4:206\n1620#4,3:207\n1622#4:210\n*S KotlinDebug\n*F\n+ 1 ServerDrivenFilterManagerImpl.kt\nco/bird/android/manager/contractor/ServerDrivenFilterManagerImpl\n*L\n49#1:199\n56#1:200\n82#1:201,2\n188#1:203\n188#1:204,2\n191#1:206\n191#1:207,3\n188#1:210\n*E\n"})
/* renamed from: wt5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51287wt5 implements InterfaceC46545ot5 {

    /* renamed from: a */
    public final InterfaceC37556Zk3 f116735a;

    /* renamed from: b */
    public final InterfaceC1880Ea f116736b;

    /* renamed from: c */
    public final C37791a94<Optional<OperatorFilterOption>> f116737c;

    /* renamed from: d */
    public final C37791a94<Optional<List<OperatorFilter>>> f116738d;

    /* renamed from: e */
    public final Lazy f116739e;

    /* renamed from: f */
    public final C24558d<Unit> f116740f;

    /* renamed from: g */
    public final C24552a<List<OperatorFilter>> f116741g;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wt5$a */
    /* loaded from: classes4.dex */
    public static final class C29984a extends Lambda implements Function1<User, InterfaceC23496h> {
        public C29984a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(User it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C51287wt5.this.f116735a.clear();
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012v\u0010\u0002\u001ar\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0006*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007 \u0006*8\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \u0006*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\t"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/persistence/OperatorFilter;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: wt5$b */
    /* loaded from: classes4.dex */
    public static final class C29985b extends Lambda implements Function1<Pair<? extends Optional<OperatorFilterOption>, ? extends List<? extends OperatorFilter>>, Unit> {
        public C29985b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Optional<OperatorFilterOption>, ? extends List<? extends OperatorFilter>> pair) {
            invoke2((Pair<Optional<OperatorFilterOption>, ? extends List<? extends OperatorFilter>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Optional<OperatorFilterOption>, ? extends List<? extends OperatorFilter>> pair) {
            List filterIsInstance;
            List<? extends OperatorFilter> operatorFilters = pair.component2();
            Intrinsics.checkNotNullExpressionValue(operatorFilters, "operatorFilters");
            filterIsInstance = CollectionsKt___CollectionsJvmKt.filterIsInstance(operatorFilters, OperatorOptionFilter.class);
            if (pair.component1().m59037c()) {
                C51287wt5.this.f116738d.accept(Optional.f63040c.m59032c(C51287wt5.this.m6164s(filterIsInstance)));
            } else {
                C51287wt5.this.f116738d.accept(Optional.f63040c.m59034a());
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/OperatorFilter;", "operatorFilters", "Lot5$b;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lot5$b;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nServerDrivenFilterManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerDrivenFilterManagerImpl.kt\nco/bird/android/manager/contractor/ServerDrivenFilterManagerImpl$calculateFilterDiff$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,198:1\n1855#2:199\n288#2,2:200\n1856#2:205\n1#3:202\n37#4,2:203\n*S KotlinDebug\n*F\n+ 1 ServerDrivenFilterManagerImpl.kt\nco/bird/android/manager/contractor/ServerDrivenFilterManagerImpl$calculateFilterDiff$1\n*L\n142#1:199\n143#1:200,2\n142#1:205\n151#1:203,2\n*E\n"})
    /* renamed from: wt5$c */
    /* loaded from: classes4.dex */
    public static final class C29986c extends Lambda implements Function1<List<? extends OperatorFilter>, InterfaceC46545ot5.C27100b> {

        /* renamed from: g */
        public final /* synthetic */ List<OperatorFilter> f116744g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C29986c(List<? extends OperatorFilter> list) {
            super(1);
            this.f116744g = list;
        }

        /* JADX WARN: Code restructure failed: missing block: B:47:0x00dc, code lost:
            if (r5 == false) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0118  */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC46545ot5.C27100b invoke(List<? extends OperatorFilter> operatorFilters) {
            OperatorToggleFilter operatorToggleFilter;
            Object obj;
            OperatorOptionFilter operatorOptionFilter;
            Set<String> emptySet;
            Set<String> emptySet2;
            String str;
            Set minus;
            Set minus2;
            Set union;
            boolean z;
            Intrinsics.checkNotNullParameter(operatorFilters, "operatorFilters");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (OperatorFilter operatorFilter : this.f116744g) {
                Iterator<T> it = operatorFilters.iterator();
                while (true) {
                    operatorToggleFilter = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.areEqual(((OperatorFilter) obj).getId(), operatorFilter.getId())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                OperatorFilter operatorFilter2 = (OperatorFilter) obj;
                if (operatorFilter2 instanceof OperatorOptionFilter) {
                    operatorOptionFilter = (OperatorOptionFilter) operatorFilter2;
                } else {
                    operatorOptionFilter = null;
                }
                if (operatorOptionFilter == null || (emptySet = operatorOptionFilter.enabledOptionValues()) == null) {
                    emptySet = SetsKt__SetsKt.emptySet();
                }
                boolean z2 = operatorFilter instanceof OperatorOptionFilter;
                if (z2) {
                    OperatorOptionFilter operatorOptionFilter2 = (OperatorOptionFilter) operatorFilter;
                    if (operatorOptionFilter2.getLogicOperator() == null) {
                        emptySet2 = operatorOptionFilter2.enabledOptionValues();
                        minus = SetsKt___SetsKt.minus((Set) emptySet, (Iterable) emptySet2);
                        minus2 = SetsKt___SetsKt.minus((Set) emptySet2, (Iterable) emptySet);
                        union = CollectionsKt___CollectionsKt.union(minus, minus2);
                        int i2 = 1;
                        if (z2 || !(!union.isEmpty())) {
                            if (operatorFilter instanceof OperatorToggleFilter) {
                                if (operatorFilter2 instanceof OperatorToggleFilter) {
                                    operatorToggleFilter = (OperatorToggleFilter) operatorFilter2;
                                }
                                if (operatorToggleFilter != null && operatorToggleFilter.getEnabled() == ((OperatorToggleFilter) operatorFilter).getEnabled()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            if (!z2 && ((OperatorOptionFilter) operatorFilter).isSet() && operatorFilter.getType() == OperatorFilterType.RANGE_SELECT) {
                                if (!emptySet2.isEmpty()) {
                                    i += i2;
                                }
                                i2 = 0;
                                i += i2;
                            } else {
                                if (!z2 && ((OperatorOptionFilter) operatorFilter).isSet() && operatorFilter.getType() == OperatorFilterType.MULTI_SELECT) {
                                    i2 = emptySet2.size();
                                } else {
                                    if ((operatorFilter instanceof OperatorToggleFilter) && ((OperatorToggleFilter) operatorFilter).getEnabled()) {
                                    }
                                    i2 = 0;
                                }
                                i += i2;
                            }
                        }
                        arrayList.add(operatorFilter);
                        if (!z2) {
                        }
                        if (!z2) {
                        }
                        if (operatorFilter instanceof OperatorToggleFilter) {
                            i += i2;
                        }
                        i2 = 0;
                        i += i2;
                    }
                }
                if (z2) {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                    OperatorOptionFilter operatorOptionFilter3 = (OperatorOptionFilter) operatorFilter;
                    spreadBuilder.addSpread(operatorOptionFilter3.enabledOptionValues().toArray(new String[0]));
                    FilterLogicToggleOption logicOperator = operatorOptionFilter3.getLogicOperator();
                    if (logicOperator != null) {
                        str = logicOperator.name();
                    } else {
                        str = null;
                    }
                    spreadBuilder.add(str);
                    emptySet2 = SetsKt__SetsKt.setOfNotNull(spreadBuilder.toArray(new String[spreadBuilder.size()]));
                } else {
                    emptySet2 = SetsKt__SetsKt.emptySet();
                }
                minus = SetsKt___SetsKt.minus((Set) emptySet, (Iterable) emptySet2);
                minus2 = SetsKt___SetsKt.minus((Set) emptySet2, (Iterable) emptySet);
                union = CollectionsKt___CollectionsKt.union(minus, minus2);
                int i22 = 1;
                if (z2) {
                }
                if (operatorFilter instanceof OperatorToggleFilter) {
                }
                if (!z2) {
                }
                if (!z2) {
                }
                if (operatorFilter instanceof OperatorToggleFilter) {
                }
                i22 = 0;
                i += i22;
            }
            return new InterfaceC46545ot5.C27100b(arrayList, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/persistence/OperatorFilter;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wt5$d */
    /* loaded from: classes4.dex */
    public static final class C29987d extends Lambda implements Function0<Z84<Optional<List<? extends OperatorFilter>>>> {
        public C29987d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Z84<Optional<List<? extends OperatorFilter>>> invoke2() {
            return Z84.f47888d.m73663b(C51287wt5.this.f116738d);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "operatorFilters", "", "Lco/bird/android/model/persistence/OperatorFilter;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nServerDrivenFilterManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerDrivenFilterManagerImpl.kt\nco/bird/android/manager/contractor/ServerDrivenFilterManagerImpl$persistFilterDiffChanges$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,198:1\n766#2:199\n857#2:200\n2624#2,3:201\n858#2:204\n1549#2:205\n1620#2,2:206\n288#2,2:208\n766#2:210\n857#2:211\n2624#2,3:212\n858#2:215\n1622#2:216\n*S KotlinDebug\n*F\n+ 1 ServerDrivenFilterManagerImpl.kt\nco/bird/android/manager/contractor/ServerDrivenFilterManagerImpl$persistFilterDiffChanges$1\n*L\n102#1:199\n102#1:200\n103#1:201,3\n102#1:204\n113#1:205\n113#1:206,2\n116#1:208,2\n119#1:210\n119#1:211\n120#1:212,3\n119#1:215\n113#1:216\n*E\n"})
    /* renamed from: wt5$e */
    /* loaded from: classes4.dex */
    public static final class C29988e extends Lambda implements Function1<List<? extends OperatorFilter>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC46545ot5.C27100b f116746g;

        /* renamed from: h */
        public final /* synthetic */ C51287wt5 f116747h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29988e(InterfaceC46545ot5.C27100b c27100b, C51287wt5 c51287wt5) {
            super(1);
            this.f116746g = c27100b;
            this.f116747h = c51287wt5;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends OperatorFilter> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
            if (r10.getLogicOperator() == null) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0082 A[SYNTHETIC] */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2(List<? extends OperatorFilter> operatorFilters) {
            int collectionSizeOrDefault;
            Object obj;
            boolean z;
            boolean z2;
            boolean z3;
            ArrayList<OperatorFilter> arrayList = new ArrayList();
            for (Object obj2 : this.f116746g.m20357b()) {
                OperatorFilter operatorFilter = (OperatorFilter) obj2;
                Intrinsics.checkNotNullExpressionValue(operatorFilters, "operatorFilters");
                List<? extends OperatorFilter> list = operatorFilters;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (OperatorFilter operatorFilter2 : list) {
                        if ((operatorFilter instanceof OperatorOptionFilter) && (operatorFilter2 instanceof OperatorOptionFilter)) {
                            if (Intrinsics.areEqual(operatorFilter2.getId(), operatorFilter.getId())) {
                                OperatorOptionFilter operatorOptionFilter = (OperatorOptionFilter) operatorFilter;
                                if (((OperatorOptionFilter) operatorFilter2).getOptions().size() == operatorOptionFilter.getOptions().size()) {
                                }
                            }
                            z2 = false;
                            continue;
                            if (z2) {
                                z3 = false;
                                break;
                            }
                        }
                        z2 = true;
                        continue;
                        if (z2) {
                        }
                    }
                }
                z3 = true;
                if (z3) {
                    arrayList.add(obj2);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (OperatorFilter operatorFilter3 : arrayList) {
                Intrinsics.checkNotNullExpressionValue(operatorFilters, "operatorFilters");
                Iterator<T> it = operatorFilters.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((OperatorFilter) obj).getId(), operatorFilter3.getId())) {
                        break;
                    }
                }
                OperatorFilter operatorFilter4 = (OperatorFilter) obj;
                if ((operatorFilter3 instanceof OperatorOptionFilter) && operatorFilter4 != null && (operatorFilter4 instanceof OperatorOptionFilter)) {
                    OperatorOptionFilter operatorOptionFilter2 = (OperatorOptionFilter) operatorFilter3;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : operatorOptionFilter2.getOptions()) {
                        OperatorFilterOption operatorFilterOption = (OperatorFilterOption) obj3;
                        List<OperatorFilterOption> options = ((OperatorOptionFilter) operatorFilter4).getOptions();
                        if (!(options instanceof Collection) || !options.isEmpty()) {
                            for (OperatorFilterOption operatorFilterOption2 : options) {
                                if (Intrinsics.areEqual(operatorFilterOption.getName(), operatorFilterOption2.getName())) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        z = true;
                        if (z) {
                            arrayList3.add(obj3);
                        }
                    }
                    operatorFilter3 = operatorOptionFilter2.copy((r24 & 1) != 0 ? operatorOptionFilter2.f66683id : null, (r24 & 2) != 0 ? operatorOptionFilter2.kind : null, (r24 & 4) != 0 ? operatorOptionFilter2.ordinal : 0, (r24 & 8) != 0 ? operatorOptionFilter2.type : null, (r24 & 16) != 0 ? operatorOptionFilter2.label : null, (r24 & 32) != 0 ? operatorOptionFilter2.options : arrayList3, (r24 & 64) != 0 ? operatorOptionFilter2.logicOperator : null, (r24 & 128) != 0 ? operatorOptionFilter2.icon : null, (r24 & 256) != 0 ? operatorOptionFilter2.iconColor : null, (r24 & 512) != 0 ? operatorOptionFilter2.coloredIcon : null, (r24 & 1024) != 0 ? operatorOptionFilter2.iconBackgroundColor : null);
                }
                arrayList2.add(operatorFilter3);
            }
            this.f116747h.f116741g.onNext(arrayList2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/OperatorFilter;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wt5$f */
    /* loaded from: classes4.dex */
    public static final class C29989f extends Lambda implements Function1<List<? extends OperatorFilter>, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC46545ot5.C27100b f116749h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29989f(InterfaceC46545ot5.C27100b c27100b) {
            super(1);
            this.f116749h = c27100b;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(List<? extends OperatorFilter> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C51287wt5.this.f116735a.mo60899n1(this.f116749h.m20357b());
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T1", "T2", "R", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$1\n+ 2 ServerDrivenFilterManagerImpl.kt\nco/bird/android/manager/contractor/ServerDrivenFilterManagerImpl\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,304:1\n87#2:305\n88#2:308\n86#2:311\n37#3,2:306\n37#3,2:309\n*S KotlinDebug\n*F\n+ 1 ServerDrivenFilterManagerImpl.kt\nco/bird/android/manager/contractor/ServerDrivenFilterManagerImpl\n*L\n87#1:306,2\n88#1:309,2\n*E\n"})
    /* renamed from: wt5$g */
    /* loaded from: classes4.dex */
    public static final class C29990g<T1, T2, R> implements InterfaceC23480c<T1, T2, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(T1 t1, T2 t2) {
            List listOf;
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.addSpread(((List) t1).toArray(new OperatorFilter[0]));
            spreadBuilder.addSpread(((List) t2).toArray(new OperatorFilter[0]));
            listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new OperatorFilter[spreadBuilder.size()]));
            return (R) listOf;
        }
    }

    public C51287wt5(InterfaceC37556Zk3 operatorFilterRepository, InterfaceC1880Ea analyticsManager, InterfaceC35660Rh6 userStream) {
        Lazy lazy;
        List emptyList;
        Intrinsics.checkNotNullParameter(operatorFilterRepository, "operatorFilterRepository");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        this.f116735a = operatorFilterRepository;
        this.f116736b = analyticsManager;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        Optional.C14443a c14443a = Optional.f63040c;
        C37791a94<Optional<OperatorFilterOption>> create$default = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f116737c = create$default;
        this.f116738d = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        lazy = LazyKt__LazyJVMKt.lazy(new C29987d());
        this.f116739e = lazy;
        C24558d<Unit> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Unit>()");
        this.f116740f = m31902e;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        C24552a<List<OperatorFilter>> m31921g = C24552a.m31921g(emptyList);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault<List<OperatorFilter>>(emptyList())");
        this.f116741g = m31921g;
        Observable<User> mo76576i = userStream.mo76576i();
        final C29984a c29984a = new C29984a();
        AbstractC23461c flatMapCompletable = mo76576i.flatMapCompletable(new InterfaceC23492o() { // from class: pt5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m6168o;
                m6168o = C51287wt5.m6168o(Function1.this, obj);
                return m6168o;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "userStream.logoutEvents(…ilterRepository.clear() }");
        ScopeProvider UNBOUND = ScopeProvider.f75557g0;
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).mo45218b(new InterfaceC23478a() { // from class: qt5
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C51287wt5.m6167p(C51287wt5.this);
            }
        });
        Observable m31950a = C24527f.m31950a(create$default, operatorFilterRepository.mo60906E1());
        Intrinsics.checkNotNullExpressionValue(UNBOUND, "UNBOUND");
        Object m33094as = m31950a.m33094as(AutoDispose.m45239a(UNBOUND));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C29985b c29985b = new C29985b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: rt5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51287wt5.m6166q(Function1.this, obj);
            }
        });
    }

    /* renamed from: o */
    public static final InterfaceC23496h m6168o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m6167p(C51287wt5 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f116737c.accept(Optional.f63040c.m59034a());
    }

    /* renamed from: q */
    public static final void m6166q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final InterfaceC46545ot5.C27100b m6165r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC46545ot5.C27100b) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m6163t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final InterfaceC23496h m6162u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m6161v(C51287wt5 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f116740f.onNext(Unit.INSTANCE);
    }

    @Override // p000.InterfaceC46545ot5
    /* renamed from: G */
    public AbstractC23461c mo6183G() {
        AbstractC23461c m33063X = this.f116735a.mo60905G().m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "operatorFilterRepository…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC46545ot5
    /* renamed from: a */
    public AbstractC23442F<InterfaceC46545ot5.C27100b> mo6182a(List<? extends OperatorFilter> filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        AbstractC23442F<List<OperatorFilter>> firstOrError = this.f116735a.mo60906E1().subscribeOn(C24542a.m31932c()).firstOrError();
        final C29986c c29986c = new C29986c(filters);
        AbstractC23442F m33157I = firstOrError.m33157I(new InterfaceC23492o() { // from class: vt5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC46545ot5.C27100b m6165r;
                m6165r = C51287wt5.m6165r(Function1.this, obj);
                return m6165r;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "filters: List<OperatorFi…edCount\n        )\n      }");
        return m33157I;
    }

    @Override // p000.InterfaceC46545ot5
    /* renamed from: b */
    public AbstractC23461c mo6181b(InterfaceC46545ot5.C27100b filterDiff) {
        Intrinsics.checkNotNullParameter(filterDiff, "filterDiff");
        AbstractC23442F<List<OperatorFilter>> firstOrError = this.f116735a.mo60906E1().firstOrError();
        final C29988e c29988e = new C29988e(filterDiff, this);
        AbstractC23442F<List<OperatorFilter>> m33101w = firstOrError.m33101w(new InterfaceC23484g() { // from class: st5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51287wt5.m6163t(Function1.this, obj);
            }
        });
        final C29989f c29989f = new C29989f(filterDiff);
        AbstractC23461c m33063X = m33101w.m33164B(new InterfaceC23492o() { // from class: tt5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m6162u;
                m6162u = C51287wt5.m6162u(Function1.this, obj);
                return m6162u;
            }
        }).m33029z(new InterfaceC23478a() { // from class: ut5
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C51287wt5.m6161v(C51287wt5.this);
            }
        }).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "override fun persistFilt…beOn(Schedulers.io())\n  }");
        return m33063X;
    }

    @Override // p000.InterfaceC46545ot5
    /* renamed from: c */
    public boolean mo6180c() {
        return mo6178e().getValue().m59037c();
    }

    @Override // p000.InterfaceC46545ot5
    /* renamed from: d */
    public void mo6179d() {
        this.f116738d.accept(Optional.f63040c.m59034a());
    }

    @Override // p000.InterfaceC46545ot5
    /* renamed from: e */
    public Z84<Optional<List<OperatorFilter>>> mo6178e() {
        return (Z84) this.f116739e.getValue();
    }

    @Override // p000.InterfaceC46545ot5
    /* renamed from: f */
    public void mo6177f(OperatorFilterOption option, boolean z) {
        Optional<OperatorFilterOption> m59034a;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(option, "option");
        C37791a94<Optional<OperatorFilterOption>> c37791a94 = this.f116737c;
        Optional.C14443a c14443a = Optional.f63040c;
        if (z) {
            m59034a = c14443a.m59032c(option);
        } else {
            m59034a = c14443a.m59034a();
        }
        c37791a94.accept(m59034a);
        InterfaceC1880Ea interfaceC1880Ea = this.f116736b;
        if (!z) {
            str = option.getValue();
        } else {
            str = null;
        }
        if (z) {
            str2 = option.getValue();
        } else {
            str2 = null;
        }
        interfaceC1880Ea.mo55905y(new C34298Lm3(null, null, null, str, str2, 7, null));
    }

    @Override // p000.InterfaceC46545ot5
    /* renamed from: g */
    public Observable<List<OperatorFilter>> mo6176g(boolean z) {
        Observable<List<OperatorFilter>> mo60906E1;
        if (z) {
            C24523e c24523e = C24523e.f91168a;
            mo60906E1 = Observable.combineLatest(this.f116735a.mo60906E1(), this.f116741g, new C29990g());
            Intrinsics.checkExpressionValueIsNotNull(mo60906E1, "Observable.combineLatest…ombineFunction(t1, t2) })");
        } else {
            mo60906E1 = this.f116735a.mo60906E1();
        }
        Observable<List<OperatorFilter>> subscribeOn = mo60906E1.subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "if (includeNonPersisted)…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    /* renamed from: s */
    public final List<OperatorOptionFilter> m6164s(List<OperatorOptionFilter> list) {
        int collectionSizeOrDefault;
        String str;
        int collectionSizeOrDefault2;
        OperatorOptionFilter copy;
        List<OperatorOptionFilter> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (OperatorOptionFilter operatorOptionFilter : list2) {
            OperatorFilterOption m59035e = this.f116737c.getValue().m59035e();
            if (m59035e != null) {
                str = m59035e.getValue();
            } else {
                str = null;
            }
            if (str != null) {
                List<OperatorFilterOption> options = operatorOptionFilter.getOptions();
                collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(options, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                for (OperatorFilterOption operatorFilterOption : options) {
                    arrayList2.add(OperatorFilterOption.copy$default(operatorFilterOption, null, null, null, Intrinsics.areEqual(str, operatorFilterOption.getValue()), null, null, 55, null));
                }
                copy = operatorOptionFilter.copy((r24 & 1) != 0 ? operatorOptionFilter.f66683id : null, (r24 & 2) != 0 ? operatorOptionFilter.kind : null, (r24 & 4) != 0 ? operatorOptionFilter.ordinal : 0, (r24 & 8) != 0 ? operatorOptionFilter.type : null, (r24 & 16) != 0 ? operatorOptionFilter.label : null, (r24 & 32) != 0 ? operatorOptionFilter.options : arrayList2, (r24 & 64) != 0 ? operatorOptionFilter.logicOperator : null, (r24 & 128) != 0 ? operatorOptionFilter.icon : null, (r24 & 256) != 0 ? operatorOptionFilter.iconColor : null, (r24 & 512) != 0 ? operatorOptionFilter.coloredIcon : null, (r24 & 1024) != 0 ? operatorOptionFilter.iconBackgroundColor : null);
                if (copy != null) {
                    operatorOptionFilter = copy;
                }
            }
            arrayList.add(operatorOptionFilter);
        }
        return arrayList;
    }
}
