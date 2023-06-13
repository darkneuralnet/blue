package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Polygon;
import co.bird.android.model.constant.FleetStatusActionKind;
import co.bird.android.model.persistence.FleetStatus;
import co.bird.android.model.persistence.OperatorFilter;
import co.bird.android.model.persistence.OperatorOptionFilter;
import co.bird.android.model.persistence.OperatorToggleFilter;
import co.bird.android.model.persistence.nestedstructures.FleetRating;
import co.bird.android.model.persistence.nestedstructures.FleetState;
import co.bird.android.model.persistence.nestedstructures.FleetStatusAction;
import co.bird.android.model.persistence.nestedstructures.FleetStatusChart;
import co.bird.android.model.persistence.nestedstructures.FleetStatusContent;
import co.bird.android.model.persistence.nestedstructures.FleetStatusKind;
import co.bird.android.model.persistence.nestedstructures.FleetStatusListAction;
import co.bird.android.model.persistence.nestedstructures.FleetStatusMapAction;
import co.bird.android.model.persistence.nestedstructures.FleetSubstate;
import co.bird.android.model.persistence.nestedstructures.OperatorFilterOption;
import co.bird.android.model.persistence.nestedstructures.OperatorMapFilterBundle;
import co.bird.android.model.wire.configs.Config;
import co.bird.api.error.RetrofitException;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.C24552a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37374Yq1;
import p000.InterfaceC40099e13;
import p000.InterfaceC46545ot5;
@Metadata(m28433d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\fBY\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010-\u001a\u00020*\u0012\u0006\u00101\u001a\u00020.¢\u0006\u0004\b8\u00109J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\"\u00107\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010303028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, m28432d2 = {"LYq1;", "", "", "e", "", "D", "", "fleetId", "fleetName", "u", "E", "LBq1;", C17296a.f69688o, "LBq1;", "fleetStatusManager", "Lot5;", "b", "Lot5;", "serverDrivenFilterManager", "LEa;", "c", "LEa;", "analyticsManager", "LMZ3;", DateTokenConverter.CONVERTER_KEY, "LMZ3;", "predictionConverter", "Lpq1;", "Lpq1;", "stateConverter", "Lqp1;", "f", "Lqp1;", "ratingConverter", "LTq4;", "g", "LTq4;", "reactiveConfig", "Ltr1;", "h", "Ltr1;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "i", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "j", "Le13;", "navigator", "Lio/reactivex/subjects/a;", "Lco/bird/android/model/persistence/FleetStatus;", "kotlin.jvm.PlatformType", "k", "Lio/reactivex/subjects/a;", "fleetStatusSubject", "<init>", "(LBq1;Lot5;LEa;LMZ3;Lpq1;Lqp1;LTq4;Ltr1;Lcom/uber/autodispose/ScopeProvider;Le13;)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetStatusPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStatusPresenter.kt\nco/bird/android/feature/fleetstatus/state/status/FleetStatusPresenter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,298:1\n1#2:299\n237#3:300\n180#3:301\n180#3:302\n180#3:303\n180#3:304\n180#3:305\n180#3:306\n180#3:307\n180#3:308\n*S KotlinDebug\n*F\n+ 1 FleetStatusPresenter.kt\nco/bird/android/feature/fleetstatus/state/status/FleetStatusPresenter\n*L\n71#1:300\n78#1:301\n113#1:302\n145#1:303\n149#1:304\n156#1:305\n204#1:306\n225#1:307\n233#1:308\n*E\n"})
/* renamed from: Yq1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37374Yq1 {

    /* renamed from: a */
    public final InterfaceC31992Bq1 f47438a;

    /* renamed from: b */
    public final InterfaceC46545ot5 f47439b;

    /* renamed from: c */
    public final InterfaceC1880Ea f47440c;

    /* renamed from: d */
    public final MZ3 f47441d;

    /* renamed from: e */
    public final C47104pq1 f47442e;

    /* renamed from: f */
    public final C47687qp1 f47443f;

    /* renamed from: g */
    public final C36207Tq4 f47444g;

    /* renamed from: h */
    public final C49485tr1 f47445h;

    /* renamed from: i */
    public final ScopeProvider f47446i;

    /* renamed from: j */
    public final InterfaceC40099e13 f47447j;

    /* renamed from: k */
    public final C24552a<FleetStatus> f47448k;

    @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0082\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0011\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m28432d2 = {"LYq1$a;", "", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;", C17296a.f69688o, "", "LH6;", "b", "c", "", DateTokenConverter.CONVERTER_KEY, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;", "getChart", "()Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;", "chart", "Ljava/util/List;", "getFleetState", "()Ljava/util/List;", "fleetState", "getFleetRating", "fleetRating", "Z", "getPredictionAvailable", "()Z", "predictionAvailable", "<init>", "(Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;Ljava/util/List;Ljava/util/List;Z)V", "co.bird.android.feature.fleet-status"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Yq1$a */
    /* loaded from: classes3.dex */
    public static final class C10014a {

        /* renamed from: a */
        public final FleetStatusChart f47449a;

        /* renamed from: b */
        public final List<C3023H6> f47450b;

        /* renamed from: c */
        public final List<C3023H6> f47451c;

        /* renamed from: d */
        public final boolean f47452d;

        public C10014a(FleetStatusChart fleetStatusChart, List<C3023H6> fleetState, List<C3023H6> list, boolean z) {
            Intrinsics.checkNotNullParameter(fleetState, "fleetState");
            this.f47449a = fleetStatusChart;
            this.f47450b = fleetState;
            this.f47451c = list;
            this.f47452d = z;
        }

        /* renamed from: a */
        public final FleetStatusChart m74130a() {
            return this.f47449a;
        }

        /* renamed from: b */
        public final List<C3023H6> m74129b() {
            return this.f47450b;
        }

        /* renamed from: c */
        public final List<C3023H6> m74128c() {
            return this.f47451c;
        }

        /* renamed from: d */
        public final boolean m74127d() {
            return this.f47452d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C10014a) {
                C10014a c10014a = (C10014a) obj;
                return Intrinsics.areEqual(this.f47449a, c10014a.f47449a) && Intrinsics.areEqual(this.f47450b, c10014a.f47450b) && Intrinsics.areEqual(this.f47451c, c10014a.f47451c) && this.f47452d == c10014a.f47452d;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            FleetStatusChart fleetStatusChart = this.f47449a;
            int hashCode = (((fleetStatusChart == null ? 0 : fleetStatusChart.hashCode()) * 31) + this.f47450b.hashCode()) * 31;
            List<C3023H6> list = this.f47451c;
            int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            boolean z = this.f47452d;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode2 + i;
        }

        public String toString() {
            FleetStatusChart fleetStatusChart = this.f47449a;
            List<C3023H6> list = this.f47450b;
            List<C3023H6> list2 = this.f47451c;
            boolean z = this.f47452d;
            return "FleetStatusData(chart=" + fleetStatusChart + ", fleetState=" + list + ", fleetRating=" + list2 + ", predictionAvailable=" + z + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072B\u0010\u0006\u001a>\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004 \u0005*\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;", "", "LH6;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yq1$b */
    /* loaded from: classes3.dex */
    public static final class C10015b extends Lambda implements Function1<Triple<? extends FleetStatusChart, ? extends List<C3023H6>, ? extends Boolean>, Unit> {
        public C10015b() {
            super(1);
        }

        /* renamed from: a */
        public final void m74126a(Triple<FleetStatusChart, ? extends List<C3023H6>, Boolean> triple) {
            FleetStatusChart component1 = triple.component1();
            List<C3023H6> component2 = triple.component2();
            boolean booleanValue = triple.component3().booleanValue();
            if (component1 == null) {
                return;
            }
            C37374Yq1.this.f47445h.m11601cm(component1);
            C37374Yq1.this.f47445h.m11602bm(component2);
            C37374Yq1.this.f47445h.m11597gm(booleanValue);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends FleetStatusChart, ? extends List<C3023H6>, ? extends Boolean> triple) {
            m74126a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yq1$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10016c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C10016c(Object obj) {
            super(1, obj, C37374Yq1.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C37374Yq1) this.receiver).m74170D(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetStatusKind;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/nestedstructures/FleetStatusKind;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yq1$d */
    /* loaded from: classes3.dex */
    public static final class C10017d extends Lambda implements Function1<FleetStatusKind, Boolean> {

        /* renamed from: g */
        public static final C10017d f47454g = new C10017d();

        public C10017d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(FleetStatusKind it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof FleetState);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusKind;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/FleetStatus;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yq1$e */
    /* loaded from: classes3.dex */
    public static final class C10018e extends Lambda implements Function1<Pair<? extends FleetStatusKind, ? extends FleetStatus>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f47456h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10018e(String str) {
            super(1);
            this.f47456h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends FleetStatusKind, ? extends FleetStatus> pair) {
            invoke2((Pair<? extends FleetStatusKind, FleetStatus>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends FleetStatusKind, FleetStatus> pair) {
            FleetStatusKind component1 = pair.component1();
            InterfaceC1880Ea interfaceC1880Ea = C37374Yq1.this.f47440c;
            String str = this.f47456h;
            String predictionId = pair.component2().getPredictionId();
            Intrinsics.checkNotNull(component1, "null cannot be cast to non-null type co.bird.android.model.persistence.nestedstructures.FleetState");
            interfaceC1880Ea.mo55905y(new C48290rq1(null, null, null, str, predictionId, ((FleetState) component1).getKind(), 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/FleetStatus;", "kotlin.jvm.PlatformType", "status", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/FleetStatus;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yq1$f */
    /* loaded from: classes3.dex */
    public static final class C10019f extends Lambda implements Function1<FleetStatus, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f47458h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10019f(String str) {
            super(1);
            this.f47458h = str;
        }

        /* renamed from: a */
        public final void m74124a(FleetStatus fleetStatus) {
            C37374Yq1.this.f47440c.mo55905y(new C50078ur1(null, null, null, this.f47458h, fleetStatus.getPredictionId(), 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FleetStatus fleetStatus) {
            m74124a(fleetStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/FleetStatus;", "kotlin.jvm.PlatformType", "status", "LYq1$a;", C17296a.f69688o, "(Lco/bird/android/model/persistence/FleetStatus;)LYq1$a;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetStatusPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStatusPresenter.kt\nco/bird/android/feature/fleetstatus/state/status/FleetStatusPresenter$onCreate$8\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
    /* renamed from: Yq1$g */
    /* loaded from: classes3.dex */
    public static final class C10020g extends Lambda implements Function1<FleetStatus, C10014a> {
        public C10020g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C10014a invoke(FleetStatus fleetStatus) {
            List mutableList;
            boolean z;
            FleetStatusContent content = fleetStatus.getContent();
            List<C3023H6> list = null;
            if (content == null) {
                return null;
            }
            FleetStatusChart chart = content.getChart();
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) C37374Yq1.this.f47442e.m18646a(content.getStates()));
            FleetRating rating = content.getRating();
            if (rating != null) {
                list = C37374Yq1.this.f47443f.m16952a(rating);
            }
            if (fleetStatus.getPredictionId() != null) {
                z = true;
            } else {
                z = false;
            }
            return new C10014a(chart, mutableList, list, z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a>\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"LYq1$a;", "<name for destructuring parameter 0>", "Lkotlin/Triple;", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusChart;", "", "LH6;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LYq1$a;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yq1$h */
    /* loaded from: classes3.dex */
    public static final class C10021h extends Lambda implements Function1<C10014a, Triple<? extends FleetStatusChart, ? extends List<C3023H6>, ? extends Boolean>> {

        /* renamed from: g */
        public static final C10021h f47460g = new C10021h();

        public C10021h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Triple<FleetStatusChart, List<C3023H6>, Boolean> invoke(C10014a c10014a) {
            List mutableList;
            List arrayList;
            Intrinsics.checkNotNullParameter(c10014a, "<name for destructuring parameter 0>");
            FleetStatusChart m74130a = c10014a.m74130a();
            List<C3023H6> m74129b = c10014a.m74129b();
            List m74128c = c10014a.m74128c();
            boolean m74127d = c10014a.m74127d();
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) m74129b);
            if (m74128c != null) {
                arrayList = m74128c;
            } else {
                arrayList = new ArrayList();
            }
            mutableList.addAll(0, arrayList);
            return new Triple<>(m74130a, mutableList, Boolean.valueOf(m74127d));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "birdIds", "", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yq1$i */
    /* loaded from: classes3.dex */
    public static final class C10022i extends Lambda implements Function1<List<? extends String>, Unit> {
        public C10022i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
            invoke2((List<String>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<String> birdIds) {
            InterfaceC40099e13 interfaceC40099e13 = C37374Yq1.this.f47447j;
            Intrinsics.checkNotNullExpressionValue(birdIds, "birdIds");
            interfaceC40099e13.mo37031e2(birdIds);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yq1$j */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10023j extends FunctionReferenceImpl implements Function1<List<? extends FleetStatus>, List<? extends C3023H6>> {
        public C10023j(Object obj) {
            super(1, obj, MZ3.class, "convert", "convert(Ljava/util/List;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<C3023H6> invoke(List<FleetStatus> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((MZ3) this.receiver).m95162a(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yq1$k */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10024k extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C10024k(Object obj) {
            super(1, obj, C49485tr1.class, "populatePredictionAdapter", "populatePredictionAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C49485tr1) this.receiver).m11600dm(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "statuses", "", "Lco/bird/android/model/persistence/FleetStatus;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nFleetStatusPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStatusPresenter.kt\nco/bird/android/feature/fleetstatus/state/status/FleetStatusPresenter$onResume$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n288#2,2:299\n1#3:301\n*S KotlinDebug\n*F\n+ 1 FleetStatusPresenter.kt\nco/bird/android/feature/fleetstatus/state/status/FleetStatusPresenter$onResume$3\n*L\n151#1:299,2\n*E\n"})
    /* renamed from: Yq1$l */
    /* loaded from: classes3.dex */
    public static final class C10025l extends Lambda implements Function1<List<? extends FleetStatus>, Unit> {
        public C10025l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends FleetStatus> list) {
            invoke2((List<FleetStatus>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<FleetStatus> statuses) {
            Object obj;
            Intrinsics.checkNotNullExpressionValue(statuses, "statuses");
            C37374Yq1 c37374Yq1 = C37374Yq1.this;
            Iterator<T> it = statuses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String predictionId = ((FleetStatus) next).getPredictionId();
                FleetStatus fleetStatus = (FleetStatus) c37374Yq1.f47448k.getValue();
                if (Intrinsics.areEqual(predictionId, fleetStatus != null ? fleetStatus.getPredictionId() : null)) {
                    obj = next;
                    break;
                }
            }
            FleetStatus fleetStatus2 = (FleetStatus) obj;
            if (fleetStatus2 != null) {
                C37374Yq1.this.f47448k.onNext(fleetStatus2);
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yq1$m */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10026m extends FunctionReferenceImpl implements Function1<FleetStatus, Unit> {
        public C10026m(Object obj) {
            super(1, obj, C24552a.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m74120a(FleetStatus p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24552a) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FleetStatus fleetStatus) {
            m74120a(fleetStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yq1$n */
    /* loaded from: classes3.dex */
    public static final class C10027n extends Lambda implements Function1<FleetSubstate, Unit> {
        public C10027n() {
            super(1);
        }

        /* renamed from: a */
        public final void m74119a(FleetSubstate fleetSubstate) {
            C37374Yq1.this.f47439b.mo6179d();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FleetSubstate fleetSubstate) {
            m74119a(fleetSubstate);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001az\u00126\b\u0001\u00122\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0007 \u0002*\u0018\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00000\u0000 \u0002*<\u00126\b\u0001\u00122\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0007 \u0002*\u0018\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00000\u0000\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/persistence/OperatorFilter;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusAction;", "e", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetStatusPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStatusPresenter.kt\nco/bird/android/feature/fleetstatus/state/status/FleetStatusPresenter$onResume$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n223#2,2:299\n1549#2:301\n1620#2,2:302\n1549#2:304\n1620#2,3:305\n1622#2:308\n*S KotlinDebug\n*F\n+ 1 FleetStatusPresenter.kt\nco/bird/android/feature/fleetstatus/state/status/FleetStatusPresenter$onResume$6\n*L\n165#1:299,2\n169#1:301\n169#1:302,2\n172#1:304\n172#1:305,3\n169#1:308\n*E\n"})
    /* renamed from: Yq1$o */
    /* loaded from: classes3.dex */
    public static final class C10028o extends Lambda implements Function1<Pair<? extends FleetSubstate, ? extends List<? extends OperatorFilter>>, InterfaceC23447K<? extends Pair<? extends FleetSubstate, ? extends FleetStatusAction>>> {

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Yq1$o$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C10029a extends FunctionReferenceImpl implements Function1<InterfaceC46545ot5.C27100b, AbstractC23461c> {
            public C10029a(Object obj) {
                super(1, obj, InterfaceC46545ot5.class, "persistFilterDiffChanges", "persistFilterDiffChanges(Lco/bird/android/coreinterface/manager/ServerDrivenFilterManager$FilterDiff;)Lio/reactivex/Completable;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final AbstractC23461c invoke(InterfaceC46545ot5.C27100b p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((InterfaceC46545ot5) this.receiver).mo6181b(p0);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Yq1$o$b */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C10030b extends FunctionReferenceImpl implements Function1<List<? extends OperatorFilter>, AbstractC23442F<InterfaceC46545ot5.C27100b>> {
            public C10030b(Object obj) {
                super(1, obj, InterfaceC46545ot5.class, "calculateFilterDiff", "calculateFilterDiff(Ljava/util/List;)Lio/reactivex/Single;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final AbstractC23442F<InterfaceC46545ot5.C27100b> invoke(List<? extends OperatorFilter> p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((InterfaceC46545ot5) this.receiver).mo6182a(p0);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Yq1$o$c */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C10031c extends FunctionReferenceImpl implements Function1<InterfaceC46545ot5.C27100b, AbstractC23461c> {
            public C10031c(Object obj) {
                super(1, obj, InterfaceC46545ot5.class, "persistFilterDiffChanges", "persistFilterDiffChanges(Lco/bird/android/coreinterface/manager/ServerDrivenFilterManager$FilterDiff;)Lio/reactivex/Completable;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final AbstractC23461c invoke(InterfaceC46545ot5.C27100b p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((InterfaceC46545ot5) this.receiver).mo6181b(p0);
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Yq1$o$d */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C10032d {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FleetStatusActionKind.values().length];
                try {
                    iArr[FleetStatusActionKind.OPERATOR_MAP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C10028o() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
            if (r2 != null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
            if (r0 == null) goto L17;
         */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final InterfaceC23447K m74113f(FleetStatusAction action, List availableFilters) {
            List emptyList;
            List emptyList2;
            List plus;
            OperatorMapFilterBundle areaFilters;
            OperatorMapFilterBundle vehicleFilters;
            Intrinsics.checkNotNullParameter(action, "$action");
            FleetStatusMapAction mapAction = action.getMapAction();
            if (mapAction != null && (vehicleFilters = mapAction.getVehicleFilters()) != null) {
                Intrinsics.checkNotNullExpressionValue(availableFilters, "availableFilters");
                emptyList = C39998dr1.m43637a(vehicleFilters, availableFilters);
            }
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            List list = emptyList;
            FleetStatusMapAction mapAction2 = action.getMapAction();
            if (mapAction2 != null && (areaFilters = mapAction2.getAreaFilters()) != null) {
                Intrinsics.checkNotNullExpressionValue(availableFilters, "availableFilters");
                emptyList2 = C39998dr1.m43637a(areaFilters, availableFilters);
            }
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            plus = CollectionsKt___CollectionsKt.plus((Collection) list, (Iterable) emptyList2);
            return AbstractC23442F.m33158H(plus);
        }

        /* renamed from: g */
        public static final InterfaceC23447K m74112g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        /* renamed from: h */
        public static final InterfaceC23496h m74111h(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        public static final InterfaceC23496h invoke$lambda$3(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final InterfaceC23447K<? extends Pair<FleetSubstate, FleetStatusAction>> invoke(Pair<FleetSubstate, ? extends List<? extends OperatorFilter>> pair) {
            boolean z;
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            FleetSubstate component1 = pair.component1();
            final List<? extends OperatorFilter> availableFilters = pair.component2();
            for (final FleetStatusAction fleetStatusAction : component1.getActions()) {
                if (fleetStatusAction.getKind() != FleetStatusActionKind.UNKNOWN) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    if (C10032d.$EnumSwitchMapping$0[fleetStatusAction.getKind().ordinal()] == 1) {
                        Intrinsics.checkNotNullExpressionValue(availableFilters, "availableFilters");
                        List<? extends OperatorFilter> list = availableFilters;
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
                                obj = r9.copy((r24 & 1) != 0 ? r9.f66684id : null, (r24 & 2) != 0 ? r9.kind : null, (r24 & 4) != 0 ? r9.ordinal : 0, (r24 & 8) != 0 ? r9.type : null, (r24 & 16) != 0 ? r9.title : null, (r24 & 32) != 0 ? r9.toggleTitle : null, (r24 & 64) != 0 ? r9.enabled : false, (r24 & 128) != 0 ? r9.icon : null, (r24 & 256) != 0 ? r9.iconColor : null, (r24 & 512) != 0 ? r9.coloredIcon : null, (r24 & 1024) != 0 ? ((OperatorToggleFilter) obj).iconBackgroundColor : null);
                            }
                            arrayList.add(obj);
                        }
                        AbstractC23442F<InterfaceC46545ot5.C27100b> mo6182a = C37374Yq1.this.f47439b.mo6182a(arrayList);
                        final C10029a c10029a = new C10029a(C37374Yq1.this.f47439b);
                        AbstractC23442F m33042m = mo6182a.m33164B(new InterfaceC23492o() { // from class: Zq1
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj2) {
                                InterfaceC23496h invoke$lambda$3;
                                invoke$lambda$3 = C37374Yq1.C10028o.invoke$lambda$3(Function1.this, obj2);
                                return invoke$lambda$3;
                            }
                        }).m33042m(AbstractC23442F.m33124k(new Callable() { // from class: ar1
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                InterfaceC23447K m74113f;
                                m74113f = C37374Yq1.C10028o.m74113f(FleetStatusAction.this, availableFilters);
                                return m74113f;
                            }
                        }));
                        final C10030b c10030b = new C10030b(C37374Yq1.this.f47439b);
                        AbstractC23442F m33165A = m33042m.m33165A(new InterfaceC23492o() { // from class: br1
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj2) {
                                InterfaceC23447K m74112g;
                                m74112g = C37374Yq1.C10028o.m74112g(Function1.this, obj2);
                                return m74112g;
                            }
                        });
                        final C10031c c10031c = new C10031c(C37374Yq1.this.f47439b);
                        return m33165A.m33164B(new InterfaceC23492o() { // from class: cr1
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj2) {
                                InterfaceC23496h m74111h;
                                m74111h = C37374Yq1.C10028o.m74111h(Function1.this, obj2);
                                return m74111h;
                            }
                        }).m33042m(AbstractC23442F.m33158H(TuplesKt.m28425to(component1, fleetStatusAction)));
                    }
                    return AbstractC23442F.m33158H(TuplesKt.m28425to(component1, fleetStatusAction));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0097\u0001\u0010\u0002\u001a\u0092\u0001\u00124\u00122\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006 \u0005*\u0018\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00070\u0007 \u0005*H\u00124\u00122\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006 \u0005*\u0018\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusAction;", "Lco/bird/android/model/persistence/FleetStatus;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yq1$p */
    /* loaded from: classes3.dex */
    public static final class C10033p extends Lambda implements Function1<Pair<? extends Pair<? extends FleetSubstate, ? extends FleetStatusAction>, ? extends FleetStatus>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f47466h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10033p(String str) {
            super(1);
            this.f47466h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Pair<? extends FleetSubstate, ? extends FleetStatusAction>, ? extends FleetStatus> pair) {
            invoke2((Pair<Pair<FleetSubstate, FleetStatusAction>, FleetStatus>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Pair<FleetSubstate, FleetStatusAction>, FleetStatus> pair) {
            Pair<FleetSubstate, FleetStatusAction> component1 = pair.component1();
            InterfaceC1880Ea interfaceC1880Ea = C37374Yq1.this.f47440c;
            String predictionId = pair.component2().getPredictionId();
            String kind = component1.component1().getKind();
            interfaceC1880Ea.mo55905y(new C48882sq1(null, null, null, this.f47466h, predictionId, component1.component2().getKind().toString(), kind, 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0097\u0001\u0010\u0002\u001a\u0092\u0001\u00124\u00122\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006 \u0005*\u0018\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00070\u0007 \u0005*H\u00124\u00122\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006 \u0005*\u0018\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/nestedstructures/FleetSubstate;", "kotlin.jvm.PlatformType", "Lco/bird/android/model/persistence/nestedstructures/FleetStatusAction;", "Lco/bird/android/model/persistence/FleetStatus;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yq1$q */
    /* loaded from: classes3.dex */
    public static final class C10034q extends Lambda implements Function1<Pair<? extends Pair<? extends FleetSubstate, ? extends FleetStatusAction>, ? extends FleetStatus>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f47468h;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Yq1$q$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C10035a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FleetStatusActionKind.values().length];
                try {
                    iArr[FleetStatusActionKind.OPERATOR_MAP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FleetStatusActionKind.FLEET_LIST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10034q(String str) {
            super(1);
            this.f47468h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Pair<? extends FleetSubstate, ? extends FleetStatusAction>, ? extends FleetStatus> pair) {
            invoke2((Pair<Pair<FleetSubstate, FleetStatusAction>, FleetStatus>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Pair<FleetSubstate, FleetStatusAction>, FleetStatus> pair) {
            Polygon region;
            FleetStatusListAction listAction;
            String substate;
            FleetStatusAction component2 = pair.component1().component2();
            int i = C10035a.$EnumSwitchMapping$0[component2.getKind().ordinal()];
            if (i == 1) {
                InterfaceC40099e13 interfaceC40099e13 = C37374Yq1.this.f47447j;
                FleetStatusMapAction mapAction = component2.getMapAction();
                InterfaceC40099e13.C19924a.goToOperator$default(interfaceC40099e13, false, null, (mapAction == null || (region = mapAction.getRegion()) == null) ? null : C39998dr1.m43635c(region), 2, null);
            } else if (i != 2 || (listAction = component2.getListAction()) == null || (substate = listAction.getSubstate()) == null) {
            } else {
                C37374Yq1.this.f47447j.mo37039d0(this.f47468h, substate);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*$\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/persistence/FleetStatus;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nFleetStatusPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetStatusPresenter.kt\nco/bird/android/feature/fleetstatus/state/status/FleetStatusPresenter$onResume$9\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n288#2,2:299\n1#3:301\n*S KotlinDebug\n*F\n+ 1 FleetStatusPresenter.kt\nco/bird/android/feature/fleetstatus/state/status/FleetStatusPresenter$onResume$9\n*L\n227#1:299,2\n*E\n"})
    /* renamed from: Yq1$r */
    /* loaded from: classes3.dex */
    public static final class C10036r extends Lambda implements Function1<Pair<? extends Unit, ? extends List<? extends FleetStatus>>, Unit> {
        public C10036r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends List<? extends FleetStatus>> pair) {
            invoke2((Pair<Unit, ? extends List<FleetStatus>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, ? extends List<FleetStatus>> pair) {
            Object obj;
            boolean z;
            List<FleetStatus> predictions = pair.component2();
            Intrinsics.checkNotNullExpressionValue(predictions, "predictions");
            Iterator<T> it = predictions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((FleetStatus) obj).getPredictionId() == null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            FleetStatus fleetStatus = (FleetStatus) obj;
            if (fleetStatus != null) {
                C37374Yq1.this.f47448k.onNext(fleetStatus);
            }
            C37374Yq1.this.f47445h.m11598fm();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "config", "Lco/bird/android/model/wire/configs/Config;", "invoke", "(Lco/bird/android/model/wire/configs/Config;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Yq1$s */
    /* loaded from: classes3.dex */
    public static final class C10037s extends Lambda implements Function1<Config, Boolean> {

        /* renamed from: g */
        public static final C10037s f47470g = new C10037s();

        public C10037s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return Boolean.valueOf(config.getOperatorConfig().getFeatures().getFleetStatus().getEnablePredictions());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "enablePredictions", "Lio/reactivex/B;", "", "Lco/bird/android/model/persistence/FleetStatus;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Yq1$t */
    /* loaded from: classes3.dex */
    public static final class C10038t extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends List<? extends FleetStatus>>> {

        /* renamed from: h */
        public final /* synthetic */ String f47472h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10038t(String str) {
            super(1);
            this.f47472h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends List<FleetStatus>> invoke(Boolean enablePredictions) {
            Intrinsics.checkNotNullParameter(enablePredictions, "enablePredictions");
            return C37374Yq1.this.f47438a.mo111429k(this.f47472h, enablePredictions.booleanValue());
        }
    }

    public C37374Yq1(InterfaceC31992Bq1 fleetStatusManager, InterfaceC46545ot5 serverDrivenFilterManager, InterfaceC1880Ea analyticsManager, MZ3 predictionConverter, C47104pq1 stateConverter, C47687qp1 ratingConverter, C36207Tq4 reactiveConfig, C49485tr1 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(fleetStatusManager, "fleetStatusManager");
        Intrinsics.checkNotNullParameter(serverDrivenFilterManager, "serverDrivenFilterManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(predictionConverter, "predictionConverter");
        Intrinsics.checkNotNullParameter(stateConverter, "stateConverter");
        Intrinsics.checkNotNullParameter(ratingConverter, "ratingConverter");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f47438a = fleetStatusManager;
        this.f47439b = serverDrivenFilterManager;
        this.f47440c = analyticsManager;
        this.f47441d = predictionConverter;
        this.f47442e = stateConverter;
        this.f47443f = ratingConverter;
        this.f47444g = reactiveConfig;
        this.f47445h = ui;
        this.f47446i = scopeProvider;
        this.f47447j = navigator;
        C24552a<FleetStatus> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<FleetStatus>()");
        this.f47448k = m31922e;
    }

    /* renamed from: A */
    public static final void m74173A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final Triple m74172B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Triple) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m74171C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final List m74168F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m74167G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m74166H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m74165I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m74164J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final InterfaceC23447K m74163K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m74162L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m74161M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m74160N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m74159O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final Boolean m74158P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final InterfaceC23434B m74157Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m74135v(boolean z, C37374Yq1 this$0, String fleetId, InterfaceC23476f it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fleetId, "$fleetId");
        Intrinsics.checkNotNullParameter(it, "it");
        if (z) {
            this$0.f47438a.mo111423y0(fleetId);
        } else {
            AbstractC23461c.m33039p();
        }
    }

    /* renamed from: w */
    public static final void m74134w() {
    }

    /* renamed from: x */
    public static final void m74133x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final boolean m74132y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: z */
    public static final void m74131z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public final void m74170D(Throwable th) {
        RetrofitException retrofitException;
        C41318g46.m40159e(th);
        Unit unit = null;
        if (th instanceof RetrofitException) {
            retrofitException = (RetrofitException) th;
        } else {
            retrofitException = null;
        }
        if (retrofitException != null) {
            this.f47445h.error(retrofitException);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f47445h.errorGeneric();
        }
    }

    /* renamed from: E */
    public final void m74169E(String fleetId) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Z84<Config> m82623f8 = this.f47444g.m82623f8();
        final C10037s c10037s = C10037s.f47470g;
        Observable<R> map = m82623f8.map(new InterfaceC23492o() { // from class: Eq1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m74158P;
                m74158P = C37374Yq1.m74158P(Function1.this, obj);
                return m74158P;
            }
        });
        final C10038t c10038t = new C10038t(fleetId);
        Observable fleetStatusStream = map.switchMap(new InterfaceC23492o() { // from class: Rq1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m74157Q;
                m74157Q = C37374Yq1.m74157Q(Function1.this, obj);
                return m74157Q;
            }
        }).publish().m32083j(3);
        Observable observeOn = fleetStatusStream.observeOn(C24542a.m31934a());
        final C10023j c10023j = new C10023j(this.f47441d);
        Observable observeOn2 = observeOn.map(new InterfaceC23492o() { // from class: Sq1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m74168F;
                m74168F = C37374Yq1.m74168F(Function1.this, obj);
                return m74168F;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "fleetStatusStream\n      …dSchedulers.mainThread())");
        Object m33094as = observeOn2.m33094as(AutoDispose.m45239a(this.f47446i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10024k c10024k = new C10024k(this.f47445h);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Tq1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37374Yq1.m74167G(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(fleetStatusStream, "fleetStatusStream");
        Object m33094as2 = fleetStatusStream.m33094as(AutoDispose.m45239a(this.f47446i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10025l c10025l = new C10025l();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Uq1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37374Yq1.m74166H(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f47445h.m11599em().m33094as(AutoDispose.m45239a(this.f47446i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10026m c10026m = new C10026m(this.f47448k);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Vq1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37374Yq1.m74165I(Function1.this, obj);
            }
        });
        Observable<FleetSubstate> m11604Zl = this.f47445h.m11604Zl();
        final C10027n c10027n = new C10027n();
        Observable<FleetSubstate> doOnNext = m11604Zl.doOnNext(new InterfaceC23484g() { // from class: Wq1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37374Yq1.m74164J(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "fun onResume(fleetId: St…List(birdIds)\n      }\n  }");
        Observable m31950a = C24527f.m31950a(doOnNext, InterfaceC46545ot5.C27099a.streamOperatorFilters$default(this.f47439b, false, 1, null));
        final C10028o c10028o = new C10028o();
        Observable flatMapSingle = m31950a.flatMapSingle(new InterfaceC23492o() { // from class: Xq1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m74163K;
                m74163K = C37374Yq1.m74163K(Function1.this, obj);
                return m74163K;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "fun onResume(fleetId: St…List(birdIds)\n      }\n  }");
        Observable m31950a2 = C24527f.m31950a(flatMapSingle, this.f47448k);
        final C10033p c10033p = new C10033p(fleetId);
        Observable doOnNext2 = m31950a2.doOnNext(new InterfaceC23484g() { // from class: Fq1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37374Yq1.m74162L(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext2, "fun onResume(fleetId: St…List(birdIds)\n      }\n  }");
        Object m33094as4 = doOnNext2.m33094as(AutoDispose.m45239a(this.f47446i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10034q c10034q = new C10034q(fleetId);
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Gq1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37374Yq1.m74161M(Function1.this, obj);
            }
        });
        Object m33094as5 = C24527f.m31950a(this.f47445h.m11609Ul(), fleetStatusStream).m33094as(AutoDispose.m45239a(this.f47446i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10036r c10036r = new C10036r();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: Pq1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37374Yq1.m74160N(Function1.this, obj);
            }
        });
        Object m33094as6 = this.f47445h.m11608Vl().m33094as(AutoDispose.m45239a(this.f47446i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10022i c10022i = new C10022i();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: Qq1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37374Yq1.m74159O(Function1.this, obj);
            }
        });
    }

    /* renamed from: u */
    public final void m74136u(final String fleetId, String str) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        if (str != null) {
            this.f47445h.m11595t(str);
        }
        final boolean enablePredictions = this.f47444g.m82623f8().getValue().getOperatorConfig().getFeatures().getFleetStatus().getEnablePredictions();
        this.f47445h.m11607Wl(enablePredictions);
        AbstractC23461c m33049i = C28237sD.progress$default(this.f47438a.mo111426v0(fleetId), this.f47445h, 0, 2, (Object) null).m33049i(new InterfaceC23496h() { // from class: Hq1
            @Override // io.reactivex.InterfaceC23496h
            /* renamed from: g */
            public final void mo33003g(InterfaceC23476f interfaceC23476f) {
                C37374Yq1.m74135v(enablePredictions, this, fleetId, interfaceC23476f);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33049i, "fleetStatusManager.fetch…plete()\n        }\n      }");
        Object m33041n = m33049i.m33041n(AutoDispose.m45239a(this.f47446i));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: Iq1
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C37374Yq1.m74134w();
            }
        };
        final C10016c c10016c = new C10016c(this);
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: Jq1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37374Yq1.m74133x(Function1.this, obj);
            }
        });
        Observable<FleetStatusKind> m11605Yl = this.f47445h.m11605Yl();
        final C10017d c10017d = C10017d.f47454g;
        Observable<FleetStatusKind> filter = m11605Yl.filter(new InterfaceC23494q() { // from class: Kq1
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m74132y;
                m74132y = C37374Yq1.m74132y(Function1.this, obj);
                return m74132y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "ui.fleetStatusKindExpand…lter { it is FleetState }");
        Object m33094as = C24527f.m31950a(filter, this.f47448k).m33094as(AutoDispose.m45239a(this.f47446i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10018e c10018e = new C10018e(fleetId);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Lq1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37374Yq1.m74131z(Function1.this, obj);
            }
        });
        Observable<FleetStatus> observeOn = this.f47448k.observeOn(C24542a.m31934a());
        final C10019f c10019f = new C10019f(fleetId);
        Observable<FleetStatus> doAfterNext = observeOn.doAfterNext(new InterfaceC23484g() { // from class: Mq1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37374Yq1.m74173A(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doAfterNext, "fun onCreate(fleetId: St…isPrediction)\n      }\n  }");
        Observable m74575T = C37279Yf5.m74575T(doAfterNext, new C10020g());
        final C10021h c10021h = C10021h.f47460g;
        Observable observeOn2 = m74575T.map(new InterfaceC23492o() { // from class: Nq1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Triple m74172B;
                m74172B = C37374Yq1.m74172B(Function1.this, obj);
                return m74172B;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "fun onCreate(fleetId: St…isPrediction)\n      }\n  }");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f47446i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10015b c10015b = new C10015b();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Oq1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37374Yq1.m74171C(Function1.this, obj);
            }
        });
    }
}
