package p000;

import co.bird.android.model.constant.FilterLogicToggleOption;
import co.bird.android.model.persistence.OperatorFilter;
import co.bird.android.model.persistence.OperatorOptionFilter;
import co.bird.android.model.persistence.OperatorToggleFilter;
import co.bird.android.model.persistence.nestedstructures.OperatorFilterOption;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C35459Ql3;
import p000.InterfaceC46545ot5;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B!\b\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R.\u0010\u001a\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0017*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\b0\b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#"}, m28432d2 = {"LQl3;", "Lf1;", "LSl3;", "Lel3;", "", "Lco/bird/android/model/persistence/OperatorFilter;", "o0", "renderer", "", "N", "Lot5;", "e", "Lot5;", "serverDrivenFilterManager", "LTl3;", "f", "LTl3;", "operatorFiltersAnalyticsManager", "LTq4;", "g", "LTq4;", "config", "LAG;", "kotlin.jvm.PlatformType", "h", "LAG;", "operatorFiltersRelay", "Lma4;", "i", "Lma4;", "resetRelay", "<init>", "(Lot5;LTl3;LTq4;)V", "j", C17296a.f69688o, "filters_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOperatorFilterV2Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2Presenter.kt\nco/bird/android/feature/filters/operator/v2/OperatorFilterV2Presenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,200:1\n199#2:201\n180#2:202\n180#2:203\n180#2:204\n180#2:205\n180#2:206\n180#2:207\n180#2:208\n180#2:209\n1549#3:210\n1620#3,3:211\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2Presenter.kt\nco/bird/android/feature/filters/operator/v2/OperatorFilterV2Presenter\n*L\n47#1:201\n79#1:202\n100#1:203\n124#1:204\n132#1:205\n147#1:206\n164#1:207\n175#1:208\n182#1:209\n188#1:210\n188#1:211,3\n*E\n"})
/* renamed from: Ql3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35459Ql3 extends AbstractC20169f1<InterfaceC35927Sl3, InterfaceC40533el3> {

    /* renamed from: j */
    public static final C6863a f30850j = new C6863a(null);

    /* renamed from: e */
    public final InterfaceC46545ot5 f30851e;

    /* renamed from: f */
    public final InterfaceC36161Tl3 f30852f;

    /* renamed from: g */
    public final C36207Tq4 f30853g;

    /* renamed from: h */
    public final C0058AG<List<OperatorFilter>> f30854h;

    /* renamed from: i */
    public final C45168ma4<Unit> f30855i;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\n \u0004*\u0004\u0018\u00010\u00070\u00072F\u0010\u0006\u001aB\u00120\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003 \u0004*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u0000\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/OperatorFilter;", "", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "LnY3;", C17296a.f69688o, "(Lkotlin/Pair;)LnY3;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ql3$A */
    /* loaded from: classes3.dex */
    public static final class C6862A extends Lambda implements Function1<Pair<? extends Pair<? extends List<? extends OperatorFilter>, ? extends Integer>, ? extends Boolean>, C45742nY3> {

        /* renamed from: g */
        public static final C6862A f30856g = new C6862A();

        public C6862A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C45742nY3 invoke(Pair<? extends Pair<? extends List<? extends OperatorFilter>, Integer>, Boolean> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Pair<? extends List<? extends OperatorFilter>, Integer> component1 = pair.component1();
            Boolean forceNotify = pair.component2();
            List<? extends OperatorFilter> filters = component1.component1();
            int intValue = component1.component2().intValue();
            Intrinsics.checkNotNullExpressionValue(filters, "filters");
            Intrinsics.checkNotNullExpressionValue(forceNotify, "forceNotify");
            return new C45742nY3(filters, intValue, forceNotify.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LQl3$a;", "", "", "FILTER_UPDATE_THROTTLE_DURATION_MS", "J", "<init>", "()V", "filters_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ql3$a */
    /* loaded from: classes3.dex */
    public static final class C6863a {
        public /* synthetic */ C6863a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C6863a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LnY3;", "kotlin.jvm.PlatformType", TransferTable.COLUMN_STATE, "", C17296a.f69688o, "(LnY3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ql3$b */
    /* loaded from: classes3.dex */
    public static final class C6864b extends Lambda implements Function1<C45742nY3, Unit> {
        public C6864b() {
            super(1);
        }

        /* renamed from: a */
        public final void m88018a(C45742nY3 c45742nY3) {
            if (c45742nY3.m23549d()) {
                C35459Ql3.this.f30855i.accept(Unit.INSTANCE);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45742nY3 c45742nY3) {
            m88018a(c45742nY3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ql3$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6865c extends FunctionReferenceImpl implements Function1<InterfaceC40533el3, Unit> {
        public C6865c(Object obj) {
            super(1, obj, C35459Ql3.class, "emit", "emit(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m88017a(InterfaceC40533el3 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C35459Ql3) this.receiver).m42280h(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC40533el3 interfaceC40533el3) {
            m88017a(interfaceC40533el3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u000122\u0010\u0004\u001a.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0003*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00010\u00010\u0005H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/persistence/OperatorOptionFilter;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/OperatorFilterOption;", "Lco/bird/android/model/persistence/OperatorFilter;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nOperatorFilterV2Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2Presenter.kt\nco/bird/android/feature/filters/operator/v2/OperatorFilterV2Presenter$consume$12\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,200:1\n1549#2:201\n1620#2,2:202\n1549#2:204\n1620#2,3:205\n1622#2:208\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2Presenter.kt\nco/bird/android/feature/filters/operator/v2/OperatorFilterV2Presenter$consume$12\n*L\n88#1:201\n88#1:202,2\n91#1:204\n91#1:205,3\n88#1:208\n*E\n"})
    /* renamed from: Ql3$d */
    /* loaded from: classes3.dex */
    public static final class C6866d extends Lambda implements Function1<Pair<? extends Pair<? extends OperatorOptionFilter, ? extends OperatorFilterOption>, ? extends List<? extends OperatorFilter>>, List<? extends OperatorOptionFilter>> {

        /* renamed from: g */
        public static final C6866d f30858g = new C6866d();

        public C6866d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ List<? extends OperatorOptionFilter> invoke(Pair<? extends Pair<? extends OperatorOptionFilter, ? extends OperatorFilterOption>, ? extends List<? extends OperatorFilter>> pair) {
            return invoke2((Pair<Pair<OperatorOptionFilter, OperatorFilterOption>, ? extends List<? extends OperatorFilter>>) pair);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<OperatorOptionFilter> invoke2(Pair<Pair<OperatorOptionFilter, OperatorFilterOption>, ? extends List<? extends OperatorFilter>> pair) {
            List filterIsInstance;
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Pair<OperatorOptionFilter, OperatorFilterOption> component1 = pair.component1();
            List<? extends OperatorFilter> filters = pair.component2();
            OperatorOptionFilter component12 = component1.component1();
            OperatorFilterOption component2 = component1.component2();
            Intrinsics.checkNotNullExpressionValue(filters, "filters");
            filterIsInstance = CollectionsKt___CollectionsJvmKt.filterIsInstance(filters, OperatorOptionFilter.class);
            List<OperatorOptionFilter> list = filterIsInstance;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (OperatorOptionFilter operatorOptionFilter : list) {
                if (Intrinsics.areEqual(component12.getId(), operatorOptionFilter.getId())) {
                    List<OperatorFilterOption> options = operatorOptionFilter.getOptions();
                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(options, 10);
                    ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                    for (OperatorFilterOption operatorFilterOption : options) {
                        if (Intrinsics.areEqual(operatorFilterOption.getValue(), component2.getValue())) {
                            operatorFilterOption = OperatorFilterOption.copy$default(operatorFilterOption, null, null, null, !operatorFilterOption.getEnabled(), null, null, 55, null);
                        }
                        arrayList2.add(operatorFilterOption);
                    }
                    operatorOptionFilter = operatorOptionFilter.copy((r24 & 1) != 0 ? operatorOptionFilter.f66683id : null, (r24 & 2) != 0 ? operatorOptionFilter.kind : null, (r24 & 4) != 0 ? operatorOptionFilter.ordinal : 0, (r24 & 8) != 0 ? operatorOptionFilter.type : null, (r24 & 16) != 0 ? operatorOptionFilter.label : null, (r24 & 32) != 0 ? operatorOptionFilter.options : arrayList2, (r24 & 64) != 0 ? operatorOptionFilter.logicOperator : null, (r24 & 128) != 0 ? operatorOptionFilter.icon : null, (r24 & 256) != 0 ? operatorOptionFilter.iconColor : null, (r24 & 512) != 0 ? operatorOptionFilter.coloredIcon : null, (r24 & 1024) != 0 ? operatorOptionFilter.iconBackgroundColor : null);
                }
                arrayList.add(operatorOptionFilter);
            }
            return arrayList;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ql3$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6867e extends FunctionReferenceImpl implements Function1<List<? extends OperatorFilter>, Unit> {
        public C6867e(Object obj) {
            super(1, obj, C0058AG.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends OperatorFilter> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends OperatorFilter> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C0058AG) this.receiver).accept(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/persistence/OperatorFilter;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nOperatorFilterV2Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2Presenter.kt\nco/bird/android/feature/filters/operator/v2/OperatorFilterV2Presenter$consume$14\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,200:1\n1549#2:201\n1620#2,2:202\n1747#2,3:204\n1549#2:207\n1620#2,3:208\n1549#2:211\n1620#2,3:212\n1622#2:215\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2Presenter.kt\nco/bird/android/feature/filters/operator/v2/OperatorFilterV2Presenter$consume$14\n*L\n107#1:201\n107#1:202,2\n111#1:204,3\n112#1:207\n112#1:208,3\n114#1:211\n114#1:212,3\n107#1:215\n*E\n"})
    /* renamed from: Ql3$f */
    /* loaded from: classes3.dex */
    public static final class C6868f extends Lambda implements Function1<Pair<? extends OperatorFilter, ? extends List<? extends OperatorFilter>>, List<? extends OperatorFilter>> {

        /* renamed from: g */
        public static final C6868f f30859g = new C6868f();

        public C6868f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<OperatorFilter> invoke(Pair<? extends OperatorFilter, ? extends List<? extends OperatorFilter>> pair) {
            int collectionSizeOrDefault;
            OperatorToggleFilter operatorToggleFilter;
            int collectionSizeOrDefault2;
            int collectionSizeOrDefault3;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            OperatorFilter component1 = pair.component1();
            List<? extends OperatorFilter> filters = pair.component2();
            Intrinsics.checkNotNullExpressionValue(filters, "filters");
            List<? extends OperatorFilter> list = filters;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Object obj : list) {
                boolean z = true;
                if (Intrinsics.areEqual(obj, component1) && (obj instanceof OperatorOptionFilter)) {
                    OperatorOptionFilter operatorOptionFilter = (OperatorOptionFilter) obj;
                    List<OperatorFilterOption> options = operatorOptionFilter.getOptions();
                    if (!(options instanceof Collection) || !options.isEmpty()) {
                        for (OperatorFilterOption operatorFilterOption : options) {
                            if (!operatorFilterOption.getEnabled()) {
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        List<OperatorFilterOption> options2 = operatorOptionFilter.getOptions();
                        collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(options2, 10);
                        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault3);
                        for (OperatorFilterOption operatorFilterOption2 : options2) {
                            arrayList2.add(OperatorFilterOption.copy$default(operatorFilterOption2, null, null, null, true, null, null, 55, null));
                        }
                        obj = operatorOptionFilter.copy((r24 & 1) != 0 ? operatorOptionFilter.f66683id : null, (r24 & 2) != 0 ? operatorOptionFilter.kind : null, (r24 & 4) != 0 ? operatorOptionFilter.ordinal : 0, (r24 & 8) != 0 ? operatorOptionFilter.type : null, (r24 & 16) != 0 ? operatorOptionFilter.label : null, (r24 & 32) != 0 ? operatorOptionFilter.options : arrayList2, (r24 & 64) != 0 ? operatorOptionFilter.logicOperator : null, (r24 & 128) != 0 ? operatorOptionFilter.icon : null, (r24 & 256) != 0 ? operatorOptionFilter.iconColor : null, (r24 & 512) != 0 ? operatorOptionFilter.coloredIcon : null, (r24 & 1024) != 0 ? operatorOptionFilter.iconBackgroundColor : null);
                    } else {
                        List<OperatorFilterOption> options3 = operatorOptionFilter.getOptions();
                        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(options3, 10);
                        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
                        for (OperatorFilterOption operatorFilterOption3 : options3) {
                            arrayList3.add(OperatorFilterOption.copy$default(operatorFilterOption3, null, null, null, false, null, null, 55, null));
                        }
                        obj = operatorOptionFilter.copy((r24 & 1) != 0 ? operatorOptionFilter.f66683id : null, (r24 & 2) != 0 ? operatorOptionFilter.kind : null, (r24 & 4) != 0 ? operatorOptionFilter.ordinal : 0, (r24 & 8) != 0 ? operatorOptionFilter.type : null, (r24 & 16) != 0 ? operatorOptionFilter.label : null, (r24 & 32) != 0 ? operatorOptionFilter.options : arrayList3, (r24 & 64) != 0 ? operatorOptionFilter.logicOperator : null, (r24 & 128) != 0 ? operatorOptionFilter.icon : null, (r24 & 256) != 0 ? operatorOptionFilter.iconColor : null, (r24 & 512) != 0 ? operatorOptionFilter.coloredIcon : null, (r24 & 1024) != 0 ? operatorOptionFilter.iconBackgroundColor : null);
                    }
                } else if (Intrinsics.areEqual(obj, component1) && (obj instanceof OperatorToggleFilter)) {
                    obj = operatorToggleFilter.copy((r24 & 1) != 0 ? operatorToggleFilter.f66684id : null, (r24 & 2) != 0 ? operatorToggleFilter.kind : null, (r24 & 4) != 0 ? operatorToggleFilter.ordinal : 0, (r24 & 8) != 0 ? operatorToggleFilter.type : null, (r24 & 16) != 0 ? operatorToggleFilter.title : null, (r24 & 32) != 0 ? operatorToggleFilter.toggleTitle : null, (r24 & 64) != 0 ? operatorToggleFilter.enabled : !operatorToggleFilter.getEnabled(), (r24 & 128) != 0 ? operatorToggleFilter.icon : null, (r24 & 256) != 0 ? operatorToggleFilter.iconColor : null, (r24 & 512) != 0 ? operatorToggleFilter.coloredIcon : null, (r24 & 1024) != 0 ? ((OperatorToggleFilter) obj).iconBackgroundColor : null);
                }
                arrayList.add(obj);
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/constant/FilterLogicToggleOption;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/constant/FilterLogicToggleOption;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ql3$g */
    /* loaded from: classes3.dex */
    public static final class C6869g extends Lambda implements Function1<FilterLogicToggleOption, Unit> {
        public C6869g() {
            super(1);
        }

        /* renamed from: a */
        public final void m88016a(FilterLogicToggleOption it) {
            C35459Ql3 c35459Ql3 = C35459Ql3.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c35459Ql3.m42280h(new C43749kA5(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FilterLogicToggleOption filterLogicToggleOption) {
            m88016a(filterLogicToggleOption);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012&\u0010\u0004\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0005H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "Lco/bird/android/model/persistence/OperatorFilter;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/constant/FilterLogicToggleOption;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nOperatorFilterV2Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2Presenter.kt\nco/bird/android/feature/filters/operator/v2/OperatorFilterV2Presenter$consume$16\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,200:1\n1549#2:201\n1620#2,3:202\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2Presenter.kt\nco/bird/android/feature/filters/operator/v2/OperatorFilterV2Presenter$consume$16\n*L\n139#1:201\n139#1:202,3\n*E\n"})
    /* renamed from: Ql3$h */
    /* loaded from: classes3.dex */
    public static final class C6870h extends Lambda implements Function1<Pair<? extends FilterLogicToggleOption, ? extends List<? extends OperatorFilter>>, List<? extends OperatorFilter>> {

        /* renamed from: g */
        public static final C6870h f30861g = new C6870h();

        public C6870h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<OperatorFilter> invoke(Pair<? extends FilterLogicToggleOption, ? extends List<? extends OperatorFilter>> pair) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            FilterLogicToggleOption component1 = pair.component1();
            List<? extends OperatorFilter> filters = pair.component2();
            Intrinsics.checkNotNullExpressionValue(filters, "filters");
            List<? extends OperatorFilter> list = filters;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (OperatorFilter operatorFilter : list) {
                if (Intrinsics.areEqual(operatorFilter.getId(), "BIRD_BATTERY") && (operatorFilter instanceof OperatorOptionFilter)) {
                    operatorFilter = r1.copy((r24 & 1) != 0 ? r1.f66683id : null, (r24 & 2) != 0 ? r1.kind : null, (r24 & 4) != 0 ? r1.ordinal : 0, (r24 & 8) != 0 ? r1.type : null, (r24 & 16) != 0 ? r1.label : null, (r24 & 32) != 0 ? r1.options : null, (r24 & 64) != 0 ? r1.logicOperator : component1, (r24 & 128) != 0 ? r1.icon : null, (r24 & 256) != 0 ? r1.iconColor : null, (r24 & 512) != 0 ? r1.coloredIcon : null, (r24 & 1024) != 0 ? ((OperatorOptionFilter) operatorFilter).iconBackgroundColor : null);
                }
                arrayList.add(operatorFilter);
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "", "Lco/bird/android/model/persistence/OperatorFilter;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ql3$i */
    /* loaded from: classes3.dex */
    public static final class C6871i extends Lambda implements Function1<Unit, InterfaceC23447K<? extends List<? extends OperatorFilter>>> {
        public C6871i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends List<OperatorFilter>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C35459Ql3.this.f30854h.firstOrError();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ql3$j */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6872j extends FunctionReferenceImpl implements Function1<List<? extends OperatorFilter>, Unit> {
        public C6872j(Object obj) {
            super(1, obj, InterfaceC36161Tl3.class, "filtersCleared", "filtersCleared(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends OperatorFilter> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends OperatorFilter> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC36161Tl3) this.receiver).mo80891b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/persistence/OperatorFilter;", "filters", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorFilterV2Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2Presenter.kt\nco/bird/android/feature/filters/operator/v2/OperatorFilterV2Presenter$consume$19\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,200:1\n1549#2:201\n1620#2,2:202\n1549#2:204\n1620#2,3:205\n1622#2:208\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2Presenter.kt\nco/bird/android/feature/filters/operator/v2/OperatorFilterV2Presenter$consume$19\n*L\n154#1:201\n154#1:202,2\n156#1:204\n156#1:205,3\n154#1:208\n*E\n"})
    /* renamed from: Ql3$k */
    /* loaded from: classes3.dex */
    public static final class C6873k extends Lambda implements Function1<List<? extends OperatorFilter>, List<? extends OperatorFilter>> {

        /* renamed from: g */
        public static final C6873k f30863g = new C6873k();

        public C6873k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<OperatorFilter> invoke(List<? extends OperatorFilter> filters) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            Intrinsics.checkNotNullParameter(filters, "filters");
            List<? extends OperatorFilter> list = filters;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Object obj : list) {
                if (obj instanceof OperatorOptionFilter) {
                    OperatorOptionFilter operatorOptionFilter = (OperatorOptionFilter) obj;
                    List<OperatorFilterOption> options = operatorOptionFilter.getOptions();
                    collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(options, 10);
                    ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
                    for (OperatorFilterOption operatorFilterOption : options) {
                        arrayList2.add(OperatorFilterOption.copy$default(operatorFilterOption, null, null, null, false, null, null, 55, null));
                    }
                    obj = operatorOptionFilter.copy((r24 & 1) != 0 ? operatorOptionFilter.f66683id : null, (r24 & 2) != 0 ? operatorOptionFilter.kind : null, (r24 & 4) != 0 ? operatorOptionFilter.ordinal : 0, (r24 & 8) != 0 ? operatorOptionFilter.type : null, (r24 & 16) != 0 ? operatorOptionFilter.label : null, (r24 & 32) != 0 ? operatorOptionFilter.options : arrayList2, (r24 & 64) != 0 ? operatorOptionFilter.logicOperator : null, (r24 & 128) != 0 ? operatorOptionFilter.icon : null, (r24 & 256) != 0 ? operatorOptionFilter.iconColor : null, (r24 & 512) != 0 ? operatorOptionFilter.coloredIcon : null, (r24 & 1024) != 0 ? operatorOptionFilter.iconBackgroundColor : null);
                } else if (obj instanceof OperatorToggleFilter) {
                    obj = r5.copy((r24 & 1) != 0 ? r5.f66684id : null, (r24 & 2) != 0 ? r5.kind : null, (r24 & 4) != 0 ? r5.ordinal : 0, (r24 & 8) != 0 ? r5.type : null, (r24 & 16) != 0 ? r5.title : null, (r24 & 32) != 0 ? r5.toggleTitle : null, (r24 & 64) != 0 ? r5.enabled : false, (r24 & 128) != 0 ? r5.icon : null, (r24 & 256) != 0 ? r5.iconColor : null, (r24 & 512) != 0 ? r5.coloredIcon : null, (r24 & 1024) != 0 ? ((OperatorToggleFilter) obj).iconBackgroundColor : null);
                }
                arrayList.add(obj);
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ql3$l */
    /* loaded from: classes3.dex */
    public static final class C6874l extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C6874l() {
            super(1);
        }

        /* renamed from: a */
        public final void m88014a(InterfaceC23465c interfaceC23465c) {
            C35459Ql3.this.m42280h(C32488Dt2.f6462a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m88014a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ql3$m */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6875m extends FunctionReferenceImpl implements Function1<List<? extends OperatorFilter>, Unit> {
        public C6875m(Object obj) {
            super(1, obj, C0058AG.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends OperatorFilter> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends OperatorFilter> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C0058AG) this.receiver).accept(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "", "Lco/bird/android/model/persistence/OperatorFilter;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ql3$n */
    /* loaded from: classes3.dex */
    public static final class C6876n extends Lambda implements Function1<Unit, InterfaceC23447K<? extends List<? extends OperatorFilter>>> {
        public C6876n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends List<OperatorFilter>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C35459Ql3.this.f30854h.firstOrError();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ql3$o */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6877o extends FunctionReferenceImpl implements Function1<List<? extends OperatorFilter>, Unit> {
        public C6877o(Object obj) {
            super(1, obj, InterfaceC36161Tl3.class, "filtersApplied", "filtersApplied(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends OperatorFilter> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends OperatorFilter> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC36161Tl3) this.receiver).mo80892a(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ql3$p */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6878p extends FunctionReferenceImpl implements Function1<List<? extends OperatorFilter>, AbstractC23442F<InterfaceC46545ot5.C27100b>> {
        public C6878p(Object obj) {
            super(1, obj, InterfaceC46545ot5.class, "calculateFilterDiff", "calculateFilterDiff(Ljava/util/List;)Lio/reactivex/Single;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC23442F<InterfaceC46545ot5.C27100b> invoke(List<? extends OperatorFilter> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((InterfaceC46545ot5) this.receiver).mo6182a(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lot5$b;", "diff", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lot5$b;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ql3$q */
    /* loaded from: classes3.dex */
    public static final class C6879q extends Lambda implements Function1<InterfaceC46545ot5.C27100b, InterfaceC23447K<? extends Unit>> {
        public C6879q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends Unit> invoke(InterfaceC46545ot5.C27100b diff) {
            Intrinsics.checkNotNullParameter(diff, "diff");
            return C35459Ql3.this.f30851e.mo6181b(diff).m33042m(AbstractC23442F.m33158H(Unit.INSTANCE));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ql3$r */
    /* loaded from: classes3.dex */
    public static final class C6880r extends Lambda implements Function1<Unit, Unit> {
        public C6880r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C35459Ql3.this.m42280h(C39938dl0.f77161a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ql3$s */
    /* loaded from: classes3.dex */
    public static final class C6881s extends Lambda implements Function1<Throwable, Unit> {
        public C6881s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            C41318g46.m40159e(e);
            C35459Ql3 c35459Ql3 = C35459Ql3.this;
            Intrinsics.checkNotNullExpressionValue(e, "e");
            c35459Ql3.m42280h(new C36105Tf1(e));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ql3$t */
    /* loaded from: classes3.dex */
    public static final class C6882t extends Lambda implements Function1<Unit, Unit> {
        public C6882t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C35459Ql3.this.m42280h(C39938dl0.f77161a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/persistence/OperatorFilter;", "filters", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ql3$u */
    /* loaded from: classes3.dex */
    public static final class C6883u extends Lambda implements Function1<List<? extends OperatorFilter>, List<? extends OperatorFilter>> {
        public C6883u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<OperatorFilter> invoke(List<? extends OperatorFilter> filters) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            return C35459Ql3.this.m88031o0(filters);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ql3$v */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C6884v extends FunctionReferenceImpl implements Function1<List<? extends OperatorFilter>, Unit> {
        public C6884v(Object obj) {
            super(1, obj, C0058AG.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends OperatorFilter> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends OperatorFilter> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C0058AG) this.receiver).accept(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ql3$w */
    /* loaded from: classes3.dex */
    public static final class C6885w extends Lambda implements Function1<Throwable, Unit> {
        public C6885w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable e) {
            C41318g46.m40159e(e);
            C35459Ql3 c35459Ql3 = C35459Ql3.this;
            Intrinsics.checkNotNullExpressionValue(e, "e");
            c35459Ql3.m42280h(new C36105Tf1(e));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001ar\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0005 \u0006*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*8\u00122\b\u0001\u0012.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0005 \u0006*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "Lco/bird/android/model/persistence/OperatorFilter;", "filters", "Lio/reactivex/K;", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "b", "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ql3$x */
    /* loaded from: classes3.dex */
    public static final class C6886x extends Lambda implements Function1<List<? extends OperatorFilter>, InterfaceC23447K<? extends Pair<? extends List<? extends OperatorFilter>, ? extends Integer>>> {

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005 \u0006*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lot5$b;", "diff", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/OperatorFilter;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lot5$b;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Ql3$x$a */
        /* loaded from: classes3.dex */
        public static final class C6887a extends Lambda implements Function1<InterfaceC46545ot5.C27100b, Pair<? extends List<? extends OperatorFilter>, ? extends Integer>> {

            /* renamed from: g */
            public final /* synthetic */ List<OperatorFilter> f30873g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C6887a(List<? extends OperatorFilter> list) {
                super(1);
                this.f30873g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<List<OperatorFilter>, Integer> invoke(InterfaceC46545ot5.C27100b diff) {
                Intrinsics.checkNotNullParameter(diff, "diff");
                return TuplesKt.m28425to(this.f30873g, Integer.valueOf(diff.m20356c()));
            }
        }

        public C6886x() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<List<OperatorFilter>, Integer>> invoke(List<? extends OperatorFilter> filters) {
            Intrinsics.checkNotNullParameter(filters, "filters");
            AbstractC23442F<InterfaceC46545ot5.C27100b> mo6182a = C35459Ql3.this.f30851e.mo6182a(filters);
            final C6887a c6887a = new C6887a(filters);
            return mo6182a.m33157I(new InterfaceC23492o() { // from class: Rl3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C35459Ql3.C6886x.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ql3$y */
    /* loaded from: classes3.dex */
    public static final class C6888y extends Lambda implements Function1<Unit, Boolean> {

        /* renamed from: g */
        public static final C6888y f30874g = new C6888y();

        public C6888y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ql3$z */
    /* loaded from: classes3.dex */
    public static final class C6889z extends Lambda implements Function1<Unit, Boolean> {

        /* renamed from: g */
        public static final C6889z f30875g = new C6889z();

        public C6889z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35459Ql3(InterfaceC46545ot5 serverDrivenFilterManager, InterfaceC36161Tl3 operatorFiltersAnalyticsManager, C36207Tq4 config) {
        super(C32488Dt2.f6462a);
        Intrinsics.checkNotNullParameter(serverDrivenFilterManager, "serverDrivenFilterManager");
        Intrinsics.checkNotNullParameter(operatorFiltersAnalyticsManager, "operatorFiltersAnalyticsManager");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f30851e = serverDrivenFilterManager;
        this.f30852f = operatorFiltersAnalyticsManager;
        this.f30853g = config;
        C0058AG<List<OperatorFilter>> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<List<OperatorFilter>>()");
        this.f30854h = m115951g;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f30855i = m25409g;
    }

    /* renamed from: O */
    public static final InterfaceC23447K m88061O(C35459Ql3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return InterfaceC46545ot5.C27099a.streamOperatorFilters$default(this$0.f30851e, false, 1, null).firstOrError();
    }

    /* renamed from: P */
    public static final void m88060P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final List m88059Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m88058R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final List m88057S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m88056T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final List m88055U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final InterfaceC23447K m88054V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m88053W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final List m88052X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m88051Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final List m88050Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final InterfaceC23447K m88049a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m88048b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final InterfaceC23447K m88047c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final InterfaceC23447K m88046d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m88045e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m88044f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m88043f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m88042g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m88041h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m88040i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final InterfaceC23447K m88039j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final Boolean m88038k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final Boolean m88037l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final C45742nY3 m88035m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C45742nY3) tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final void m88033n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: N */
    public void consume(InterfaceC35927Sl3 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        this.f30852f.mo80888e();
        AbstractC23461c mo6183G = this.f30851e.mo6183G();
        final C6874l c6874l = new C6874l();
        AbstractC23442F m33042m = mo6183G.m33081E(new InterfaceC23484g() { // from class: pl3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35459Ql3.m88044f(Function1.this, obj);
            }
        }).m33042m(AbstractC23442F.m33124k(new Callable() { // from class: rl3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23447K m88061O;
                m88061O = C35459Ql3.m88061O(C35459Ql3.this);
                return m88061O;
            }
        }));
        final C6883u c6883u = new C6883u();
        AbstractC23442F m33157I = m33042m.m33157I(new InterfaceC23492o() { // from class: zl3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m88050Z;
                m88050Z = C35459Ql3.m88050Z(Function1.this, obj);
                return m88050Z;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33157I, "override fun consume(ren…cribe { emit(Close) }\n  }");
        Object m33135e = m33157I.m33135e(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6884v c6884v = new C6884v(this.f30854h);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Bl3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35459Ql3.m88041h0(Function1.this, obj);
            }
        };
        final C6885w c6885w = new C6885w();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Cl3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35459Ql3.m88040i0(Function1.this, obj);
            }
        });
        Observable<List<OperatorFilter>> throttleLast = this.f30854h.throttleLast(10L, TimeUnit.MILLISECONDS);
        final C6886x c6886x = new C6886x();
        Observable<R> flatMapSingle = throttleLast.flatMapSingle(new InterfaceC23492o() { // from class: Dl3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m88039j0;
                m88039j0 = C35459Ql3.m88039j0(Function1.this, obj);
                return m88039j0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun consume(ren…cribe { emit(Close) }\n  }");
        Observable<Unit> mo29979x9 = renderer.mo29979x9();
        final C6888y c6888y = C6888y.f30874g;
        InterfaceC23434B map = mo29979x9.map(new InterfaceC23492o() { // from class: El3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m88038k0;
                m88038k0 = C35459Ql3.m88038k0(Function1.this, obj);
                return m88038k0;
            }
        });
        C45168ma4<Unit> c45168ma4 = this.f30855i;
        final C6889z c6889z = C6889z.f30875g;
        Observable startWith = Observable.merge(map, c45168ma4.map(new InterfaceC23492o() { // from class: Fl3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m88037l0;
                m88037l0 = C35459Ql3.m88037l0(Function1.this, obj);
                return m88037l0;
            }
        })).startWith((Observable) Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(startWith, "merge(\n          rendere…       ).startWith(false)");
        Observable m31950a = C24527f.m31950a(flatMapSingle, startWith);
        final C6862A c6862a = C6862A.f30856g;
        Observable map2 = m31950a.map(new InterfaceC23492o() { // from class: Gl3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C45742nY3 m88035m0;
                m88035m0 = C35459Ql3.m88035m0(Function1.this, obj);
                return m88035m0;
            }
        });
        final C6864b c6864b = new C6864b();
        Observable doAfterNext = map2.doAfterNext(new InterfaceC23484g() { // from class: Hl3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35459Ql3.m88033n0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doAfterNext, "override fun consume(ren…cribe { emit(Close) }\n  }");
        Object m33094as = doAfterNext.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6865c c6865c = new C6865c(this);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Al3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35459Ql3.m88060P(Function1.this, obj);
            }
        });
        Observable m31950a2 = C24527f.m31950a(renderer.mo29981p8(), this.f30854h);
        final C6866d c6866d = C6866d.f30858g;
        Observable map3 = m31950a2.map(new InterfaceC23492o() { // from class: Il3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m88059Q;
                m88059Q = C35459Ql3.m88059Q(Function1.this, obj);
                return m88059Q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "renderer.optionUpdates\n …ilter\n          }\n      }");
        Object m33094as2 = map3.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6867e c6867e = new C6867e(this.f30854h);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Jl3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35459Ql3.m88058R(Function1.this, obj);
            }
        });
        Observable m31950a3 = C24527f.m31950a(renderer.mo29988D7(), this.f30854h);
        final C6868f c6868f = C6868f.f30859g;
        Observable map4 = m31950a3.map(new InterfaceC23492o() { // from class: Kl3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m88057S;
                m88057S = C35459Ql3.m88057S(Function1.this, obj);
                return m88057S;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "renderer.filterSelects\n …      }\n        }\n      }");
        Object m33094as3 = map4.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as3).subscribe(this.f30854h);
        Observable<FilterLogicToggleOption> mo29984X1 = renderer.mo29984X1();
        final C6869g c6869g = new C6869g();
        Observable<FilterLogicToggleOption> doOnNext = mo29984X1.doOnNext(new InterfaceC23484g() { // from class: Ll3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35459Ql3.m88056T(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun consume(ren…cribe { emit(Close) }\n  }");
        Object m33094as4 = doOnNext.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as4).subscribe();
        Observable m31950a4 = C24527f.m31950a(renderer.mo29985V1(), this.f30854h);
        final C6870h c6870h = C6870h.f30861g;
        Observable map5 = m31950a4.map(new InterfaceC23492o() { // from class: Ml3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m88055U;
                m88055U = C35459Ql3.m88055U(Function1.this, obj);
                return m88055U;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map5, "renderer\n      .logicOpe…      }\n        }\n      }");
        Object m33094as5 = map5.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as5).subscribe(this.f30854h);
        Observable<Unit> mo29979x92 = renderer.mo29979x9();
        final C6871i c6871i = new C6871i();
        Observable<R> flatMapSingle2 = mo29979x92.flatMapSingle(new InterfaceC23492o() { // from class: Nl3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m88054V;
                m88054V = C35459Ql3.m88054V(Function1.this, obj);
                return m88054V;
            }
        });
        final C6872j c6872j = new C6872j(this.f30852f);
        Observable doAfterNext2 = flatMapSingle2.doAfterNext(new InterfaceC23484g() { // from class: Ol3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35459Ql3.m88053W(Function1.this, obj);
            }
        });
        final C6873k c6873k = C6873k.f30863g;
        Observable map6 = doAfterNext2.map(new InterfaceC23492o() { // from class: Pl3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m88052X;
                m88052X = C35459Ql3.m88052X(Function1.this, obj);
                return m88052X;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map6, "override fun consume(ren…cribe { emit(Close) }\n  }");
        Object m33094as6 = map6.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6875m c6875m = new C6875m(this.f30854h);
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: ql3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35459Ql3.m88051Y(Function1.this, obj);
            }
        });
        Observable<Unit> mo29987K2 = renderer.mo29987K2();
        final C6876n c6876n = new C6876n();
        Observable<R> flatMapSingle3 = mo29987K2.flatMapSingle(new InterfaceC23492o() { // from class: sl3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m88049a0;
                m88049a0 = C35459Ql3.m88049a0(Function1.this, obj);
                return m88049a0;
            }
        });
        final C6877o c6877o = new C6877o(this.f30852f);
        Observable doAfterNext3 = flatMapSingle3.doAfterNext(new InterfaceC23484g() { // from class: tl3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35459Ql3.m88048b0(Function1.this, obj);
            }
        });
        final C6878p c6878p = new C6878p(this.f30851e);
        Observable flatMapSingle4 = doAfterNext3.flatMapSingle(new InterfaceC23492o() { // from class: ul3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m88047c0;
                m88047c0 = C35459Ql3.m88047c0(Function1.this, obj);
                return m88047c0;
            }
        });
        final C6879q c6879q = new C6879q();
        Observable flatMapSingle5 = flatMapSingle4.flatMapSingle(new InterfaceC23492o() { // from class: vl3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m88046d0;
                m88046d0 = C35459Ql3.m88046d0(Function1.this, obj);
                return m88046d0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle5, "override fun consume(ren…cribe { emit(Close) }\n  }");
        Object m33094as7 = flatMapSingle5.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6880r c6880r = new C6880r();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: wl3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35459Ql3.m88045e0(Function1.this, obj);
            }
        };
        final C6881s c6881s = new C6881s();
        ((ObservableSubscribeProxy) m33094as7).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: xl3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35459Ql3.m88043f0(Function1.this, obj);
            }
        });
        Object m33094as8 = renderer.mo29982f2().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C6882t c6882t = new C6882t();
        ((ObservableSubscribeProxy) m33094as8).subscribe(new InterfaceC23484g() { // from class: yl3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C35459Ql3.m88042g0(Function1.this, obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o0 */
    public final List<OperatorFilter> m88031o0(List<? extends OperatorFilter> list) {
        int collectionSizeOrDefault;
        if (this.f30853g.m82623f8().getValue().getOperatorConfig().getFeatures().getMap().getFilters().getEnableBatteryFilterLogicToggle()) {
            List<? extends OperatorFilter> list2 = list;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (OperatorFilter operatorFilter : list2) {
                if (Intrinsics.areEqual(operatorFilter.getId(), "BIRD_BATTERY") && (operatorFilter instanceof OperatorOptionFilter)) {
                    OperatorOptionFilter operatorOptionFilter = (OperatorOptionFilter) operatorFilter;
                    if (operatorOptionFilter.getLogicOperator() == null) {
                        operatorFilter = operatorOptionFilter.copy((r24 & 1) != 0 ? operatorOptionFilter.f66683id : null, (r24 & 2) != 0 ? operatorOptionFilter.kind : null, (r24 & 4) != 0 ? operatorOptionFilter.ordinal : 0, (r24 & 8) != 0 ? operatorOptionFilter.type : null, (r24 & 16) != 0 ? operatorOptionFilter.label : null, (r24 & 32) != 0 ? operatorOptionFilter.options : null, (r24 & 64) != 0 ? operatorOptionFilter.logicOperator : FilterLogicToggleOption.AND, (r24 & 128) != 0 ? operatorOptionFilter.icon : null, (r24 & 256) != 0 ? operatorOptionFilter.iconColor : null, (r24 & 512) != 0 ? operatorOptionFilter.coloredIcon : null, (r24 & 1024) != 0 ? operatorOptionFilter.iconBackgroundColor : null);
                    }
                }
                arrayList.add(operatorFilter);
            }
            return arrayList;
        }
        return list;
    }
}
